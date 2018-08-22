package apps.myapp.eze.ezenglish2.evaluation.vocabulary;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import apps.myapp.eze.ezenglish2.evaluation.vocabulary.QuizContractVocabulary.*;

import java.util.ArrayList;

public class QuizDbHelperVocabulary extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "MyAwesomeQuiz.db";
    private static final int DATABASE_VERSION = 1;

    private SQLiteDatabase db;


    public QuizDbHelperVocabulary(Context context) {
        super ( context, DATABASE_NAME, null, DATABASE_VERSION );
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        this.db = db;

        final String SQL_CREATE_QUESTIONS_TABLE = " CREATE TABLE " +
                QuestionsTable.TABLE_NAME + " ( " +
                QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuestionsTable.COLUMN_ANSWER_NR + " INTEGER," +
                QuestionsTable.COLUMN_DIFFICULTY + " TEXT" +
                ")";
        db.execSQL ( SQL_CREATE_QUESTIONS_TABLE );
        fillQuestionsTableVocabulary();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL ( "DROP TABLE IF EXISTS " + QuestionsTable.TABLE_NAME );
        onCreate ( db );
    }

    private void fillQuestionsTableVocabulary() {
        QuestionVocabulary q1 = new QuestionVocabulary( "Choose the correct synonym of the word:\n\n" +
                "Smart",
                "clever", "stupid", "good", 1, QuestionVocabulary.DIFFICULTY_EASY );
        addQuestionVocabulary( q1 );
        QuestionVocabulary q2 = new QuestionVocabulary( "Choose the correct synonym of the word:\n\n" +
                "Important",
                "good", "essential", "perfect", 2, QuestionVocabulary.DIFFICULTY_EASY );
        addQuestionVocabulary( q2 );
        QuestionVocabulary q3 = new QuestionVocabulary( "Choose the correct synonym of the word:\n\n" +
                "Bad",
                "excellent", "inferior", "perfect", 2, QuestionVocabulary.DIFFICULTY_EASY );
        addQuestionVocabulary( q3 );
        QuestionVocabulary q4 = new QuestionVocabulary( "Choose the correct synonym of the word:\n\n" +
                "Exact",
                "special", "dumb", "specific", 3, QuestionVocabulary.DIFFICULTY_EASY );
        addQuestionVocabulary( q4 );
        QuestionVocabulary q5 = new QuestionVocabulary( "Choose the correct synonym of the word:\n\n" +
                "Stupid",
                "dumb", "great", "perfect", 1, QuestionVocabulary.DIFFICULTY_EASY );
        addQuestionVocabulary( q5 );
        QuestionVocabulary q6 = new QuestionVocabulary( "Choose the correct synonym of the word:\n\n" +
                "Suitable",
                "awful", "complete", "uniform", 3, QuestionVocabulary.DIFFICULTY_EASY );
        addQuestionVocabulary( q6 );
        QuestionVocabulary q7 = new QuestionVocabulary( "Choose the correct synonym of the word:\n\n" +
                "Interesting",
                "fascinating", "boring", "horrible", 1, QuestionVocabulary.DIFFICULTY_EASY );
        addQuestionVocabulary( q7 );

        QuestionVocabulary q8 = new QuestionVocabulary( "Choose the correct synonym of the word:\n\n" +
                "Keep",
                "obtain", "hold", "set", 2, QuestionVocabulary.DIFFICULTY_EASY );
        addQuestionVocabulary( q8 );
        QuestionVocabulary q9 = new QuestionVocabulary( "Choose the correct synonym of the word:\n\n" +
                "Put",
                "find", "support", "place", 2, QuestionVocabulary.DIFFICULTY_EASY );
        addQuestionVocabulary( q9 );
        QuestionVocabulary q10 = new QuestionVocabulary( "Choose the correct synonym of the word:\n\n" +
                "Amazing",
                "incredible", "heroic", "ordinary", 1, QuestionVocabulary.DIFFICULTY_EASY );
        addQuestionVocabulary( q10 );
        QuestionVocabulary q11 = new QuestionVocabulary( "Choose the correct synonym of the word:\n\n" +
                "Brave",
                "wonderful", "courageous", "extraordinary", 2, QuestionVocabulary.DIFFICULTY_EASY );
        addQuestionVocabulary( q11 );
        QuestionVocabulary q12 = new QuestionVocabulary( "Choose the correct synonym of the word:\n\n" +
                "Bright",
                "sparkling", "pretty", "shiny", 3, QuestionVocabulary.DIFFICULTY_EASY );
        addQuestionVocabulary( q12 );
        QuestionVocabulary q13 = new QuestionVocabulary( "Choose the correct synonym of the word:\n\n" +
                "Answer",
                "reply", "ask", "forward", 1, QuestionVocabulary.DIFFICULTY_EASY );
        addQuestionVocabulary( q13 );
        QuestionVocabulary q14 = new QuestionVocabulary( "Choose the correct synonym of the word:\n\n" +
                "Ask",
                "answer", "respond", "question", 3, QuestionVocabulary.DIFFICULTY_EASY );
        addQuestionVocabulary( q14 );
        QuestionVocabulary q15 = new QuestionVocabulary( "Choose the correct synonym of the word:\n\n" +
                "Ugly",
                "astounding", "risky", "hideous", 3, QuestionVocabulary.DIFFICULTY_EASY );
        addQuestionVocabulary( q15 );


        QuestionVocabulary q16 = new QuestionVocabulary( "Choose the correct word for the definition of :\n\n" +
                "A person who works in government offices or who is employed by the government.",
                "civil servant", "sailor", "counselor", 1, QuestionVocabulary.DIFFICULTY_MEDIUM );
        addQuestionVocabulary( q16 );
        QuestionVocabulary q17 = new QuestionVocabulary( "Choose the correct word for the definition of :\n\n" +
                "A person who puts out fires.",
                "vet", "firefighter", "carpenter", 2, QuestionVocabulary.DIFFICULTY_MEDIUM );
        addQuestionVocabulary( q17 );
        QuestionVocabulary q18 = new QuestionVocabulary( "Choose the correct word for the definition of :\n\n" +
                "A person who is trained to give medical care to animals.",
                "surgeon", "butcher", "vet", 3, QuestionVocabulary.DIFFICULTY_MEDIUM );
        addQuestionVocabulary( q18 );
        QuestionVocabulary q19 = new QuestionVocabulary( "Choose the correct word for the definition of :\n\n" +
                "Someone who gives people advice on where to spend their holidays.",
                "travel agent", "counselor", "scientist", 1, QuestionVocabulary.DIFFICULTY_MEDIUM );
        addQuestionVocabulary( q19 );
        QuestionVocabulary q20 = new QuestionVocabulary( "Choose the correct word for the definition of :\n\n" +
                "Doctor who does operations in a hospital.",
                "psychologist", "surgeon", "scientist", 2, QuestionVocabulary.DIFFICULTY_MEDIUM );
        addQuestionVocabulary( q20 );
        QuestionVocabulary q21 = new QuestionVocabulary( "Choose the correct word for the definition of :\n\n" +
                "A person who tries to find out why people behave in a certain way.",
                "judge", "pharmacist", "psychologist", 3, QuestionVocabulary.DIFFICULTY_MEDIUM );
        addQuestionVocabulary( q21 );
        QuestionVocabulary q22 = new QuestionVocabulary( "Choose the correct word for the definition of :\n\n" +
                "Someone who works as a secretary for a single person.",
                "personal assistant", "receptionist", "civil servant", 1, QuestionVocabulary.DIFFICULTY_MEDIUM );
        addQuestionVocabulary( q22 );
        QuestionVocabulary q23 = new QuestionVocabulary( "Choose the correct word for the definition of :\n\n" +
                "Someone whose job it is to make clothes that fit perfectly for a customer.",
                "lawyer", "tailor", "sailor", 2, QuestionVocabulary.DIFFICULTY_MEDIUM );
        addQuestionVocabulary( q23 );
        QuestionVocabulary q24 = new QuestionVocabulary( "Choose the correct word for the definition of :\n\n" +
                "A person who prepares meat and sells it.",
                "sailor", "vet", "butcher", 3, QuestionVocabulary.DIFFICULTY_MEDIUM );
        addQuestionVocabulary( q24 );
        QuestionVocabulary q25 = new QuestionVocabulary( "Choose the correct word for the definition of :\n\n" +
                "Someone whose job it is to advise people and help them with problems.",
                "counselor", "psychologist", "lecturer", 1, QuestionVocabulary.DIFFICULTY_MEDIUM );
        addQuestionVocabulary( q25 );
        QuestionVocabulary q26 = new QuestionVocabulary( "Choose the correct word for the definition of :\n\n" +
                "Person who designs and creates buildings, bridges etc...",
                "jeweler", "engineer", "carpenter", 2, QuestionVocabulary.DIFFICULTY_MEDIUM );
        addQuestionVocabulary( q26 );
        QuestionVocabulary q27 = new QuestionVocabulary( "Choose the correct word for the definition of :\n\n" +
                "Someone whose job it is to welcome people at a hotel.",
                "jeweler", "lecturer", "receptionist", 3, QuestionVocabulary.DIFFICULTY_MEDIUM );
        addQuestionVocabulary( q27 );
        QuestionVocabulary q28 = new QuestionVocabulary( "Choose the correct word for the definition of :\n\n" +
                "Person who works on a ship.",
                "sailor", "lecturer", "librarian", 1, QuestionVocabulary.DIFFICULTY_MEDIUM );
        addQuestionVocabulary( q28 );
        QuestionVocabulary q29 = new QuestionVocabulary( "Choose the correct word for the definition of :\n\n" +
                "Person who works in a laboratory and does experiments.",
                "pharmacist", "scientist", "librarian", 2, QuestionVocabulary.DIFFICULTY_MEDIUM );
        addQuestionVocabulary( q29 );
        QuestionVocabulary q30 = new QuestionVocabulary( "Choose the correct word for the definition of :\n\n" +
                "Person who repairs broken pipes, heating and the water system in your house.",
                "carpenter", "firefighter", "plumber", 3, QuestionVocabulary.DIFFICULTY_MEDIUM );
        addQuestionVocabulary( q30 );
        QuestionVocabulary q31 = new QuestionVocabulary( "Choose the correct word for the definition of :\n\n" +
                "Person whose job it is to advise people about legal problems and defend them in court.",
                "lawyer", "counselor", "plumber", 1, QuestionVocabulary.DIFFICULTY_MEDIUM );
        addQuestionVocabulary( q31 );
        QuestionVocabulary q32 = new QuestionVocabulary( "Choose the correct word for the definition of :\n\n" +
                "Person who teaches at a university.",
                "lawyer", "lecturer", "scientist", 2, QuestionVocabulary.DIFFICULTY_MEDIUM );
        addQuestionVocabulary( q32 );
        QuestionVocabulary q33 = new QuestionVocabulary( "Choose the correct word for the definition of :\n\n" +
                "Someone who prepares medicine in a house or hospital.",
                "scientist", "lecturer", "pharmacist", 3, QuestionVocabulary.DIFFICULTY_MEDIUM );
        addQuestionVocabulary( q33 );
        QuestionVocabulary q34 = new QuestionVocabulary( "Choose the correct word for the definition of :\n\n" +
                "Someone who looks after buildings, especially schools, hospitals and other public houses.",
                "caretaker", "librarian", "screenwriter", 1, QuestionVocabulary.DIFFICULTY_MEDIUM );
        addQuestionVocabulary( q34 );
        QuestionVocabulary q35 = new QuestionVocabulary( "Choose the correct word for the definition of :\n\n" +
                "Person who makes things out of wood and repairs them.",
                "tailor", "carpenter", "screenwriter", 2, QuestionVocabulary.DIFFICULTY_MEDIUM );
        addQuestionVocabulary( q35 );
        QuestionVocabulary q36 = new QuestionVocabulary( "Choose the correct word for the definition of :\n\n" +
                "Someone who buys, sells and repairs rings, bracelets, necklaces etc...",
                "jeweler", "translator", "surgeon", 1, QuestionVocabulary.DIFFICULTY_MEDIUM );
        addQuestionVocabulary( q36 );
        QuestionVocabulary q37 = new QuestionVocabulary( "Choose the correct word for the definition of :\n\n" +
                "Someone who changes writing into another language.",
                "librarian", "translator", "screenwriter", 2, QuestionVocabulary.DIFFICULTY_MEDIUM );
        addQuestionVocabulary( q37 );
        QuestionVocabulary q38 = new QuestionVocabulary( "Choose the correct word for the definition of :\n\n" +
                "official who is in control of a court and decides how criminals should be punished.",
                "librarian", "translator", "judge", 3, QuestionVocabulary.DIFFICULTY_MEDIUM );
        addQuestionVocabulary( q38 );
        QuestionVocabulary q39 = new QuestionVocabulary( "Choose the correct word for the definition of :\n\n" +
                "Person who cares for books and lends them to people.",
                "librarian", "translator", "judge", 1, QuestionVocabulary.DIFFICULTY_MEDIUM );
        addQuestionVocabulary( q39 );
        QuestionVocabulary q40 = new QuestionVocabulary( "Choose the correct word for the definition of :\n\n" +
                "Someone who writes scripts for films and plays.",
                "librarian", "translator", "screenwriter", 3, QuestionVocabulary.DIFFICULTY_MEDIUM );
        addQuestionVocabulary( q40 );

        QuestionVocabulary q41 = new QuestionVocabulary( "Choose the correct word for the definition of :\n\n" +
                "A low area of land between two mountains or hills.",
                "valley", "coast", "altitude", 1, QuestionVocabulary.DIFFICULTY_MEDIUM );
        addQuestionVocabulary( q41 );
        QuestionVocabulary q42 = new QuestionVocabulary( "Choose the correct word for the definition of :\n\n" +
                "The height of a place above sea level.",
                "climate", "coast", "altitude", 3, QuestionVocabulary.DIFFICULTY_MEDIUM );
        addQuestionVocabulary( q42 );
        QuestionVocabulary q43 = new QuestionVocabulary( "Choose the correct word for the definition of :\n\n" +
                "The weather conditions of a particular country or region.",
                "climate", "coast", "altitude", 1, QuestionVocabulary.DIFFICULTY_MEDIUM );
        addQuestionVocabulary( q43 );
        QuestionVocabulary q44 = new QuestionVocabulary( "Choose the correct word for the definition of :\n\n" +
                "The number of people living in an area.",
                "climate", "population", "people", 1, QuestionVocabulary.DIFFICULTY_MEDIUM );
        addQuestionVocabulary( q44 );
        QuestionVocabulary q45 = new QuestionVocabulary( "Choose the correct word for the definition of :\n\n" +
                "The production of goods and services.",
                "agriculture", "industry", "people", 2, QuestionVocabulary.DIFFICULTY_MEDIUM );
        addQuestionVocabulary( q45 );
        QuestionVocabulary q46 = new QuestionVocabulary( "Choose the correct word for the definition of :\n\n" +
                "To take part in.",
                "to be involved in", "to look up", "to take a trip", 1, QuestionVocabulary.DIFFICULTY_MEDIUM );
        addQuestionVocabulary( q46 );
        QuestionVocabulary q47 = new QuestionVocabulary( "Choose the correct word for the definition of :\n\n" +
                "To locate information in a directory, dictionary, book.",
                "to be involved in", "to look up", "to take a trip", 2, QuestionVocabulary.DIFFICULTY_MEDIUM );
        addQuestionVocabulary( q47 );
        QuestionVocabulary q48 = new QuestionVocabulary( "Choose the correct word for the definition of :\n\n" +
                "To serve in a store or restaurant.",
                "to be involved in", "to look up", "to wait on", 3, QuestionVocabulary.DIFFICULTY_MEDIUM );
        addQuestionVocabulary( q48 );
        QuestionVocabulary q49 = new QuestionVocabulary( "Choose the correct word for the definition of :\n\n" +
                "To go for a walk, stroll, hike.",
                "to talk a walk", "to take a trip", "to wait on", 1, QuestionVocabulary.DIFFICULTY_MEDIUM );
        addQuestionVocabulary( q49 );
        QuestionVocabulary q50 = new QuestionVocabulary( "Choose the correct word for the definition of :\n\n" +
                "For the time being.",
                "forever", "temporarily", "permanently", 2, QuestionVocabulary.DIFFICULTY_MEDIUM );
        addQuestionVocabulary( q50 );












    }



    private void addQuestionVocabulary(QuestionVocabulary questionVocabulary) {
        ContentValues cv = new ContentValues();
        cv.put ( QuestionsTable.COLUMN_QUESTION, questionVocabulary.getQuestion () );
        cv.put ( QuestionsTable.COLUMN_OPTION1, questionVocabulary.getOption1 () );
        cv.put ( QuestionsTable.COLUMN_OPTION2, questionVocabulary.getOption2 () );
        cv.put ( QuestionsTable.COLUMN_OPTION3, questionVocabulary.getOption3 () );
        cv.put ( QuestionsTable.COLUMN_ANSWER_NR, questionVocabulary.getAnswerNr () );
        cv.put ( QuestionsTable.COLUMN_DIFFICULTY, questionVocabulary.getDifficulty () );
        db.insert ( QuestionsTable.TABLE_NAME, null, cv );

    }

    public ArrayList<QuestionVocabulary> getAllQuestions() {
        ArrayList<QuestionVocabulary> questionVocabularyList = new ArrayList<>();
        db = getReadableDatabase ();
        Cursor c = db.rawQuery ( "SELECT * FROM " + QuestionsTable.TABLE_NAME, null );

        if (c.moveToFirst ()) {
            do {
                QuestionVocabulary questionVocabulary = new QuestionVocabulary();
                questionVocabulary.setQuestion ( c.getString ( c.getColumnIndex ( QuestionsTable.COLUMN_QUESTION ) ) );
                questionVocabulary.setOption1 ( c.getString ( c.getColumnIndex ( QuestionsTable.COLUMN_OPTION1 ) ) );
                questionVocabulary.setOption2 ( c.getString ( c.getColumnIndex ( QuestionsTable.COLUMN_OPTION2 ) ) );
                questionVocabulary.setOption3 ( c.getString ( c.getColumnIndex ( QuestionsTable.COLUMN_OPTION3 ) ) );
                questionVocabulary.setAnswerNr ( c.getInt ( c.getColumnIndex ( QuestionsTable.COLUMN_ANSWER_NR ) ) );
                questionVocabulary.setDifficulty(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_DIFFICULTY)));
                questionVocabularyList.add (questionVocabulary);
            } while (c.moveToNext ());
        }

        c.close ();
        return questionVocabularyList;
    }

    public ArrayList<QuestionVocabulary> getQuestions(String difficulty) {
        ArrayList<QuestionVocabulary> questionVocabularyList = new ArrayList<>();
        db = getReadableDatabase ();

        String[] selectionArgs = new String[]{difficulty};
        Cursor c = db.rawQuery ( "SELECT * FROM " +
                QuestionsTable.TABLE_NAME + " WHERE " + QuestionsTable.COLUMN_DIFFICULTY + " = ? ", selectionArgs );

        if (c.moveToFirst ()) {
            do {
                QuestionVocabulary questionVocabulary = new QuestionVocabulary();
                questionVocabulary.setQuestion ( c.getString ( c.getColumnIndex ( QuestionsTable.COLUMN_QUESTION ) ) );
                questionVocabulary.setOption1 ( c.getString ( c.getColumnIndex ( QuestionsTable.COLUMN_OPTION1 ) ) );
                questionVocabulary.setOption2 ( c.getString ( c.getColumnIndex ( QuestionsTable.COLUMN_OPTION2 ) ) );
                questionVocabulary.setOption3 ( c.getString ( c.getColumnIndex ( QuestionsTable.COLUMN_OPTION3 ) ) );
                questionVocabulary.setAnswerNr ( c.getInt ( c.getColumnIndex ( QuestionsTable.COLUMN_ANSWER_NR ) ) );
                questionVocabulary.setDifficulty ( c.getString ( c.getColumnIndex ( QuestionsTable.COLUMN_DIFFICULTY) ) );
                questionVocabularyList.add (questionVocabulary);
            } while (c.moveToNext ());
        }

        c.close ();
        return questionVocabularyList;
    }






}
