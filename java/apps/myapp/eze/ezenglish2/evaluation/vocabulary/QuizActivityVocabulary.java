package apps.myapp.eze.ezenglish2.evaluation.vocabulary;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import apps.myapp.eze.ezenglish2.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

import static android.graphics.Color.GREEN;
import static android.graphics.Color.RED;

public class QuizActivityVocabulary extends AppCompatActivity {
    public static final String EXTRA_SCORE = "extraScore";
    private static final long COUNTDOWN_IN_MILLIS = 30000;

    private static final String KEY_SCORE = "keyScore";
    private static final String KEY_QUESTION_COUNT = "keyQuestionCount";
    private static final String KEY_MILLIS_LEFT = "keyMillisLeft";
    private static final String KEY_ANSWERED = "keyAnswered";
    private static final String KEY_QUESTION_LIST = "keyQuestionList";



    private TextView textViewQuestion;
    private TextView textViewScore;
    private TextView textViewQuestionCount;
    private TextView textViewDifficulty;
    private TextView textViewCountDown;
    private RadioGroup rbGroup;
    private RadioButton rb1;
    private RadioButton rb2;
    private RadioButton rb3;
    private Button buttonConfirmNext;

    private ColorStateList textColorDefaultRb;
    private ColorStateList textColorDefaultCd;

    private CountDownTimer countDownTimer;
    private long timeLeftInMillis;

    private ArrayList<QuestionVocabulary> questionVocabularyList;
    private int questionCounter;
    private int questionCountTotal;
    private QuestionVocabulary currentQuestionVocabulary;

    private int score;
    private boolean answered;

    private long backPressedTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_quiz_vocabulary);

        textViewQuestion = findViewById(R.id.text_view_question_vocabulary);
        textViewScore = findViewById(R.id.text_view_score_vocabulary);
        textViewQuestionCount = findViewById(R.id.text_view_question_count_vocabulary);
        textViewDifficulty = findViewById ( R.id.text_view_difficulty_vocabulary);
        textViewCountDown = findViewById(R.id.text_view_countdown_vocabulary);
        rbGroup = findViewById(R.id.radio_group_vocabulary);
        rb1 = findViewById(R.id.radio_button1_vocabulary);
        rb2 = findViewById(R.id.radio_button2_vocabulary);
        rb3 = findViewById(R.id.radio_button3);
        buttonConfirmNext = findViewById(R.id.button_confirm_next_vocabulary);

        textColorDefaultRb = rb1.getTextColors ();
        textColorDefaultCd = textViewCountDown.getTextColors ();

        Intent intent = getIntent ();
        String difficulty = intent.getStringExtra ( StartingScreenActivityVocabulary.EXTRA_DIFFICULTY );

        textViewDifficulty.setText ( "Difficulty: " + difficulty );


        if(savedInstanceState == null) {
            QuizDbHelperVocabulary dbHelper = new QuizDbHelperVocabulary( this );
            questionVocabularyList = dbHelper.getQuestions ( difficulty );
            questionCountTotal = questionVocabularyList.size ();
            Collections.shuffle (questionVocabularyList);

            showNextQuestion ();
        }else {
            questionVocabularyList = savedInstanceState.getParcelableArrayList ( KEY_QUESTION_LIST );
            questionCountTotal = questionVocabularyList.size ();
            questionCounter = savedInstanceState.getInt ( KEY_QUESTION_COUNT );
            currentQuestionVocabulary = questionVocabularyList.get ( questionCounter - 1 );
            score = savedInstanceState.getInt ( KEY_SCORE );
            timeLeftInMillis = savedInstanceState.getLong ( KEY_MILLIS_LEFT );
            answered = savedInstanceState.getBoolean ( KEY_ANSWERED );

            if (!answered) {
                startCountDown ();
            } else {
                updateCountDownText ();
                showSolution ();
            }
        }

        buttonConfirmNext.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                if (!answered){
                    if(rb1.isChecked ()|| rb2.isChecked ()|| rb3.isChecked ()){
                       checkAnswer();
                    }else{
                        Toast.makeText ( QuizActivityVocabulary.this, "Please select an answer", Toast.LENGTH_SHORT).show ();
                    }
                }else{
                    showNextQuestion ();


                }


            }
        } );
    }
    private void showNextQuestion(){
        rb1.setTextColor(textColorDefaultRb);
        rb2.setTextColor(textColorDefaultRb);
        rb3.setTextColor(textColorDefaultRb);
        rbGroup.clearCheck();

        if (questionCounter < questionCountTotal){
            currentQuestionVocabulary = questionVocabularyList.get(questionCounter);

            textViewQuestion.setText ( currentQuestionVocabulary.getQuestion () );
            rb1.setText(currentQuestionVocabulary.getOption1());
            rb2.setText(currentQuestionVocabulary.getOption2());
            rb3.setText(currentQuestionVocabulary.getOption3());

            questionCounter++;
            textViewQuestionCount.setText("QuestionVocabulary: " + questionCounter + "/" + questionCountTotal);
            answered = false;
            buttonConfirmNext.setText("Confirm");

            timeLeftInMillis = COUNTDOWN_IN_MILLIS;
            startCountDown();

        }else{
            finishQuiz();
        }
    }

    private void startCountDown(){
        countDownTimer = new CountDownTimer(timeLeftInMillis, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                timeLeftInMillis = millisUntilFinished;
                updateCountDownText();
            }

            @Override
            public void onFinish() {
                timeLeftInMillis = 0;
                updateCountDownText ();
                checkAnswer ();
            }
        }.start ();

    }

    private void updateCountDownText(){
        int minutes = (int) (timeLeftInMillis / 1000) / 60;
        int seconds = (int) (timeLeftInMillis/ 1000) % 60;
        String timeFormatted = String.format( Locale.getDefault(), "%02d:%02d", minutes, seconds);

        textViewCountDown.setText(timeFormatted);

        if (timeLeftInMillis < 10000) {
            textViewCountDown.setTextColor(Color.RED);
        } else {
            textViewCountDown.setTextColor(textColorDefaultCd);
        }

    }

    private void checkAnswer(){
        answered = true;

        countDownTimer.cancel ();

        RadioButton rbSelected = findViewById ( rbGroup.getCheckedRadioButtonId () );
        int answerNr = rbGroup.indexOfChild ( rbSelected ) + 1;

        if (answerNr == currentQuestionVocabulary.getAnswerNr ()){
            score++;
            textViewScore.setText ("Score: " + score  );
        }
        showSolution();
    }

    private void showSolution() {
        rb1.setTextColor ( RED);
        rb2.setTextColor ( RED);
        rb3.setTextColor ( RED);

        switch (currentQuestionVocabulary.getAnswerNr ()) {
            case 1:
                rb1.setTextColor ( GREEN );
                textViewQuestion.setText ( "Answer 1 is correct" );
                break;
            case 2:
                rb2.setTextColor ( GREEN );
                textViewQuestion.setText ( "Answer 2 is correct" );
                break;
            case 3:
                rb3.setTextColor ( GREEN );
                textViewQuestion.setText ( "Answer 3 is correct" );
                break;
        }

        if (questionCounter < questionCountTotal) {
            buttonConfirmNext.setText ( "Next" );
        } else {
            buttonConfirmNext.setText ( "Finish" );
        }
    }

    private void finishQuiz(){
        Intent resultIntent = new Intent();
        resultIntent.putExtra(EXTRA_SCORE, score);
        setResult(RESULT_OK, resultIntent);
        finish ();
    }

    @Override
    public void onBackPressed() {
        if (backPressedTime + 2000 > System.currentTimeMillis ()) {
            finishQuiz ();
        }else{
            Toast.makeText ( this, "Press back again to finish", Toast.LENGTH_SHORT ).show ();
        }
        backPressedTime = System.currentTimeMillis ();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy ();
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState ( outState );
        outState.putInt(KEY_SCORE, score);
        outState.putInt(KEY_QUESTION_COUNT, questionCounter);
        outState.putLong(KEY_MILLIS_LEFT, timeLeftInMillis);
        outState.putBoolean(KEY_ANSWERED, answered);
        outState.putParcelableArrayList(KEY_QUESTION_LIST, questionVocabularyList);
    }
}
