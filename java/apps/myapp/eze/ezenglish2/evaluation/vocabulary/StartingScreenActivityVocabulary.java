package apps.myapp.eze.ezenglish2.evaluation.vocabulary;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import apps.myapp.eze.ezenglish2.R;

public class StartingScreenActivityVocabulary extends AppCompatActivity {
    private static final int REQUEST_CODE_QUIZ = 1;
    public static final String EXTRA_DIFFICULTY = "extraDifficulty";

    public static final String SHARED_PREFS = "sharedPrefs";
    public static final String KEY_HIGHSCORE = "keyHighscore";

    private TextView textViewHighscore;

    private Spinner spinnerDifficulty;

    private int highscore;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_starting_screen_vocabulary);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        textViewHighscore = findViewById ( R.id.text_view_high_score_vocabulary);
        spinnerDifficulty = findViewById ( R.id.spinner_difficulty_vocabulary);

        String[] difficultyLevels = QuestionVocabulary.getAllDifficultyLevels ();

        ArrayAdapter<String> adapterDifficulty = new ArrayAdapter<>( this,
                android.R.layout.simple_spinner_item, difficultyLevels);
        adapterDifficulty.setDropDownViewResource (android.R.layout.simple_spinner_dropdown_item  );
        spinnerDifficulty.setAdapter ( adapterDifficulty );



        loadHighscoreVocabulary();

        ImageView buttonStartQuiz = findViewById ( R.id.button_start_quiz_vocabulary);
        buttonStartQuiz.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                startQuizVocabulary();
            }
        } );
    }

    private void startQuizVocabulary(){

        String difficulty = spinnerDifficulty.getSelectedItem().toString();

        Intent intent = new Intent( StartingScreenActivityVocabulary.this, QuizActivityVocabulary.class );
        intent.putExtra(EXTRA_DIFFICULTY, difficulty);
        startActivityForResult ( intent, REQUEST_CODE_QUIZ );
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult ( requestCode, resultCode, data );

        if (requestCode == REQUEST_CODE_QUIZ) {
            if (resultCode == RESULT_OK) {
                int score = data.getIntExtra ( QuizActivityVocabulary.EXTRA_SCORE, 0 );
                if (score > highscore) {
                    updateHighscoreVocabulary( score );
                }
            }
        }
    }

    private void loadHighscoreVocabulary() {
        SharedPreferences prefs = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        highscore = prefs.getInt(KEY_HIGHSCORE, 0);
        textViewHighscore.setText("Highscore: " + highscore);
    }

    private void updateHighscoreVocabulary(int highscoreNew){
        highscore = highscoreNew;
        textViewHighscore.setText("Highscore: " + highscore);

        SharedPreferences prefs = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putInt(KEY_HIGHSCORE, highscore);
        editor.apply();

    }
}
