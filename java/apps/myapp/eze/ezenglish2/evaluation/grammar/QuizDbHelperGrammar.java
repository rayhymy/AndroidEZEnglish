package apps.myapp.eze.ezenglish2.evaluation.grammar;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

import apps.myapp.eze.ezenglish2.R;

public class QuizDbHelperGrammar extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "MyAwesomeQuiz.dbone";
    private static final int DATABASE_VERSION = 1;

    private SQLiteDatabase dbone;


    public QuizDbHelperGrammar(Context context) {
        super ( context, DATABASE_NAME, null, DATABASE_VERSION );
    }

    @Override
    public void onCreate(SQLiteDatabase dbone) {
        this.dbone = dbone;

        final String SQL_CREATE_QUESTIONS_TABLE = " CREATE TABLE " +
                QuizContractGrammar.QuestionsTable.TABLE_NAME + " ( " +
                QuizContractGrammar.QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuizContractGrammar.QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuizContractGrammar.QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuizContractGrammar.QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuizContractGrammar.QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuizContractGrammar.QuestionsTable.COLUMN_ANSWER_NR + " INTEGER," +
                QuizContractGrammar.QuestionsTable.COLUMN_DIFFICULTY + " TEXT" +
                ")";
        dbone.execSQL ( SQL_CREATE_QUESTIONS_TABLE );
        fillQuestionsTable ();
    }

    @Override
    public void onUpgrade(SQLiteDatabase dbone, int oldVersion, int newVersion) {
        dbone.execSQL ( "DROP TABLE IF EXISTS " + QuizContractGrammar.QuestionsTable.TABLE_NAME );
        onCreate (dbone);
    }

    private void fillQuestionsTable() {

        QuestionGrammar q1 = new QuestionGrammar( "Read the sentence and fill the blank.\n\nHe wants to get a better ______ and earn more money.",
                "employ", "job", "work", 2, QuestionGrammar.DIFFICULTY_MEDIUM );
        addQuestion ( q1 );
        QuestionGrammar q2 = new QuestionGrammar( "Read the sentence and fill the blank.\n\n" +
                "Managers set objectives, and decide \n" + "_____their organization can achieve them.  ",
                "how", "what", "which", 1, QuestionGrammar.DIFFICULTY_MEDIUM );
        addQuestion ( q2 );
        QuestionGrammar q3 = new QuestionGrammar( "Read the sentence and fill the blank.\n\n" +
                "Obviously, objectives occasionally_____be modified or changed. " ,
                "have to", "ought", "shouldn't", 1, QuestionGrammar.DIFFICULTY_MEDIUM );
        addQuestion ( q3 );
        QuestionGrammar q4 = new QuestionGrammar( "Read the sentence and fill the blank.\n\n" +
                "A defect can be caused______negligence by one of the members of a team. " ,
                "to", "at", "by", 3, QuestionGrammar.DIFFICULTY_MEDIUM );
        addQuestion ( q4 );
        QuestionGrammar q5 = new QuestionGrammar( "Read the sentence and fill the blank.\n\n" +
                " I_____the piano since the age of five.  " ,
                "played", "am playing", "have played", 3, QuestionGrammar.DIFFICULTY_MEDIUM );
        addQuestion ( q5 );
        QuestionGrammar q6 = new QuestionGrammar( "Read the sentence and fill the blank.\n\n" +
                " The unions now represent less_____10% of the French work force." ,
                "than", "then", "of", 1, QuestionGrammar.DIFFICULTY_MEDIUM );
        addQuestion ( q6 );
        QuestionGrammar q7 = new QuestionGrammar( "Read the sentence and fill the blank.\n\n" +
                "_____some employers oppose the very existence of unions, many theorists stress the necessity of unions. " ,
                "Because", "Although", "However", 2, QuestionGrammar.DIFFICULTY_MEDIUM );
        addQuestion ( q7 );
        QuestionGrammar q8 = new QuestionGrammar( "Read the sentence and fill the blank.\n\n" +
                " Managers who are ambitious are_____-oriented managers. " ,
                "socially", "well", "success", 3, QuestionGrammar.DIFFICULTY_MEDIUM );
        addQuestion ( q8 );
        QuestionGrammar q9 = new QuestionGrammar( "Read the sentence and fill the blank.\n\n" +
                " Warning! No unauthorised personnel_____this point." ,
                "on", "beyond", "from", 2, QuestionGrammar.DIFFICULTY_MEDIUM );
        addQuestion ( q9 );
        QuestionGrammar q10 = new QuestionGrammar( "Read the sentence and fill the blank.\n\n" +
                " You won’t be allowed into the club_____you wear a suit and tie" ,
                "if", "unless", "apart", 2, QuestionGrammar.DIFFICULTY_MEDIUM );
        addQuestion ( q10 );
        QuestionGrammar q11 = new QuestionGrammar( "Read the sentence and fill the blank.\n\n" +
                " Market leaders usually want to_____their market share even further, or at least to protect their current market share. " ,
                "increase", "dominate", "establish", 1, QuestionGrammar.DIFFICULTY_MEDIUM );
        addQuestion ( q11 );
        QuestionGrammar q12 = new QuestionGrammar( "Read the sentence and fill the blank.\n\n" +
                " We haven’t had_____news from our agent." ,
                "some", "no", "any", 3, QuestionGrammar.DIFFICULTY_MEDIUM );
        addQuestion ( q12 );
        QuestionGrammar q13 = new QuestionGrammar( "Read the sentence and fill the blank.\n\n" +
                " A recent survey identified the UK as_____place in Europe to buy a car." ,
                "the most expensive", "more expensive", "the more expensive", 1, QuestionGrammar.DIFFICULTY_MEDIUM );
        addQuestion ( q13 );
        QuestionGrammar q14 = new QuestionGrammar( "Read the sentence and fill the blank.\n\n" +
                "  You_____fly to Dover, there isn’t an airport." ,
                "can", "cannot", "may not", 2, QuestionGrammar.DIFFICULTY_MEDIUM );
        addQuestion ( q14 );
        QuestionGrammar q15 = new QuestionGrammar( "Read the sentence and fill the blank.\n\n" +
                " Those boys look like_____fathers." ,
                "their", "them", "they", 1, QuestionGrammar.DIFFICULTY_MEDIUM );
        addQuestion ( q15 );
        QuestionGrammar q16 = new QuestionGrammar( "Read the sentence and fill the blank.\n\n" +
                " He will_____medical studies next year." ,
                "finish his", "finish her", "finishes the", 1, QuestionGrammar.DIFFICULTY_MEDIUM );
        addQuestion ( q16 );
        QuestionGrammar q17 = new QuestionGrammar( "Read the sentence and fill the blank.\n\n" +
                " He didn’t usually_____any tea when he was in America." ,
                "drunk", "drank", "drink", 3, QuestionGrammar.DIFFICULTY_MEDIUM );
        addQuestion ( q17 );
        QuestionGrammar q18 = new QuestionGrammar( "Read the sentence and fill the blank.\n\n" +
                " The homework can be _____ in 90 minutes." ,
                "do", "did", "done", 3, QuestionGrammar.DIFFICULTY_MEDIUM );
        addQuestion ( q18 );
        QuestionGrammar q19 = new QuestionGrammar( "Read the sentence and fill the blank.\n\n" +
                " An airplane’s doors are always_____before the plane takes off." ,
                "closed", "closing", "close", 1, QuestionGrammar.DIFFICULTY_MEDIUM );
        addQuestion ( q19 );
        QuestionGrammar q20 = new QuestionGrammar( "Read the sentence and fill the blank.\n\n" +
                " The food that she is cooking_____best. " ,
                "smells the most", "smells the", "the", 2, QuestionGrammar.DIFFICULTY_MEDIUM );
        addQuestion ( q20 );


        QuestionGrammar q21 = new QuestionGrammar( "Fill in the correct prepositions.\n\n" +
                " She learned Russian______the age of 45. " ,
                "at", "on", "in", 1, QuestionGrammar.DIFFICULTY_MEDIUM );
        addQuestion ( q21 );
        QuestionGrammar q22 = new QuestionGrammar( "Fill in the correct prepositions.\n\n" +
                " The book was written_____Mark Twain." ,
                "on", "at", "by", 3, QuestionGrammar.DIFFICULTY_MEDIUM );
        addQuestion ( q22 );
        QuestionGrammar q23 = new QuestionGrammar( "Fill in the correct prepositions.\n\n" +
                " I'll show you the picture_____the palace." ,
                "about", "of", "from", 2, QuestionGrammar.DIFFICULTY_MEDIUM );
        addQuestion ( q23 );
        QuestionGrammar q24 = new QuestionGrammar( "Fill in the correct prepositions.\n\n" +
                " We can only get to the camp____foot." ,
                "with", "on", "from", 2, QuestionGrammar.DIFFICULTY_MEDIUM );
        addQuestion ( q24 );
        QuestionGrammar q25 = new QuestionGrammar( "Fill in the correct prepositions.\n\n" +
                " He reminds me_____his old history teacher." ,
                "by", "of", "for", 2, QuestionGrammar.DIFFICULTY_MEDIUM );
        addQuestion ( q25 );
        QuestionGrammar q26 = new QuestionGrammar( "Fill in the correct prepositions\n\n" +
                " What are you talking_____?" ,
                "about", "for", "on", 1, QuestionGrammar.DIFFICULTY_MEDIUM );
        addQuestion ( q26 );
        QuestionGrammar q27 = new QuestionGrammar( "Fill in the correct prepositions.\n\n" +
                "_____the end of next year we will have made over 100,000." ,
                "About", "At", "By", 3, QuestionGrammar.DIFFICULTY_MEDIUM );
        addQuestion ( q27 );
        QuestionGrammar q28 = new QuestionGrammar( "Fill in the correct prepositions.\n\n" +
                " She always gets up early_____the morning." ,
                "on", "at", "in", 3, QuestionGrammar.DIFFICULTY_MEDIUM );
        addQuestion ( q28 );
        QuestionGrammar q29 = new QuestionGrammar( "Fill in the correct prepositions.\n\n" +
                " Peter went to work____Tuesday." ,
                "on", "at", "in", 1, QuestionGrammar.DIFFICULTY_MEDIUM );
        addQuestion ( q29 );
        QuestionGrammar q30 = new QuestionGrammar( "Fill in the correct prepositions.\n\n" +
                " You'll have to wait. He'll be with you____a minute." ,
                "on", "in", "for", 2, QuestionGrammar.DIFFICULTY_MEDIUM );
        addQuestion ( q30 );
        QuestionGrammar q31 = new QuestionGrammar( "Fill in the correct prepositions.\n\n" +
                " I’d like to speak_____the manager ." ,
                "with", "to", "for", 1, QuestionGrammar.DIFFICULTY_MEDIUM );
        addQuestion ( q31 );
        QuestionGrammar q32 = new QuestionGrammar( "Fill in the correct prepositions.\n\n" +
                " My friend always borrows money_____me." ,
                "to", "from", "for", 2, QuestionGrammar.DIFFICULTY_MEDIUM );
        addQuestion ( q32 );
        QuestionGrammar q33 = new QuestionGrammar( "Fill in the correct prepositions.\n\n" +
                " We had to climb slowly____the hill." ,
                "to", "from", "up", 3, QuestionGrammar.DIFFICULTY_MEDIUM );
        addQuestion ( q33 );
        QuestionGrammar q34 = new QuestionGrammar( "Fill in the correct prepositions.\n\n" +
                " The audience threw tomatoes_____him." ,
                "on", "from", "at", 3, QuestionGrammar.DIFFICULTY_MEDIUM );
        addQuestion ( q34 );
        QuestionGrammar q35 = new QuestionGrammar( "Fill in the correct prepositions.\n\n" +
                " Many of us eat_____fork and spoon." ,
                "in", "with", "on", 2, QuestionGrammar.DIFFICULTY_MEDIUM );
        addQuestion ( q35 );


        QuestionGrammar q36 = new QuestionGrammar( "Simple or Progressive: Fill in the correct form.\n\n" +
                " It often_____in Ireland." ,
                "rain", "raining", "rains", 3, QuestionGrammar.DIFFICULTY_EASY );
        addQuestion ( q36 );
        QuestionGrammar q37 = new QuestionGrammar( "Simple or Progressive: Fill in the correct form.\n\n" +
                " Susan_____to her parents every Sunday night." ,
                "writes", "writing", "write", 1, QuestionGrammar.DIFFICULTY_EASY );
        addQuestion ( q37 );
        QuestionGrammar q38 = new QuestionGrammar( "Simple or Progressive: Fill in the correct form.\n\n" +
                " The new lawnmower_____well at the moment." ,
                "works", "is working", "work", 2, QuestionGrammar.DIFFICULTY_EASY );
        addQuestion ( q38 );
        QuestionGrammar q39 = new QuestionGrammar( "Simple or Progressive: Fill in the correct form.\n\n" +
                " We____our break now, Mr. Smith." ,
                "are taking", "is taking", "take", 1, QuestionGrammar.DIFFICULTY_EASY );
        addQuestion ( q39 );
        QuestionGrammar q40 = new QuestionGrammar( "Simple or Progressive: Fill in the correct form.\n\n" +
                " Look! She_____in the non- smoking area. " ,
                "is smoking", "are smoking", "smokes", 1, QuestionGrammar.DIFFICULTY_EASY );
        addQuestion ( q40 );
        QuestionGrammar q41 = new QuestionGrammar( "Simple or Progressive: Fill in the correct form.\n\n" +
                " Dorothy_____to read a good novel in her holidays. " ,
                "love", "loves", "is loving", 2, QuestionGrammar.DIFFICULTY_EASY );
        addQuestion ( q41 );
        QuestionGrammar q42 = new QuestionGrammar( "Simple or Progressive: Fill in the correct form.\n\n" +
                " Such bad behaviour_____me mad. " ,
                "make", "is making", "makes", 3, QuestionGrammar.DIFFICULTY_EASY );
        addQuestion ( q42 );
        QuestionGrammar q43 = new QuestionGrammar( "Simple or Progressive: Fill in the correct form.\n\n" +
                " He usually____out on Saturday night. " ,
                "go", "is going", "goes", 3, QuestionGrammar.DIFFICULTY_EASY );
        addQuestion ( q43 );
        QuestionGrammar q44 = new QuestionGrammar( "Simple or Progressive: Fill in the correct form.\n\n" +
                " I_____a hat today because it is a special day. " ,
                "am wearing", "wear", "wears", 1, QuestionGrammar.DIFFICULTY_EASY );
        addQuestion ( q44 );
        QuestionGrammar q45 = new QuestionGrammar( "Simple or Progressive: Fill in the correct form.\n\n" +
                " Our children_____playing in the hut. " ,
                "enjoys", "enjoy", "are enjoying", 1, QuestionGrammar.DIFFICULTY_EASY );
        addQuestion ( q45 );
        QuestionGrammar q46 = new QuestionGrammar( "Simple or Progressive: Fill in the correct form.\n\n" +
                " The headmaster rarely____a class. " ,
                "teach", "teaches", "teaching", 2, QuestionGrammar.DIFFICULTY_EASY );
        addQuestion ( q46 );
        QuestionGrammar q47 = new QuestionGrammar( "Simple or Progressive: Fill in the correct form.\n\n" +
                " She_____by train to Liverpool today. " ,
                "departs", "departed", "is departing", 3, QuestionGrammar.DIFFICULTY_EASY );
        addQuestion ( q47 );
        QuestionGrammar q48 = new QuestionGrammar( "Simple or Progressive: Fill in the correct form.\n\n" +
                " The well-known actor_____a lot of fan mail. " ,
                "gets", "is getting", "is geting", 1, QuestionGrammar.DIFFICULTY_EASY );
        addQuestion ( q48 );
        QuestionGrammar q49 = new QuestionGrammar( "Simple or Progressive: Fill in the correct form.\n\n" +
                " They______a game of cards right now. " ,
                "have", "are having", "is having", 2, QuestionGrammar.DIFFICULTY_EASY );
        addQuestion ( q49 );
        QuestionGrammar q50 = new QuestionGrammar( "Simple or Progressive: Fill in the correct form.\n\n" +
                " My boss______to change jobs soon. " ,
                "wants", "is wanting", "want", 2, QuestionGrammar.DIFFICULTY_EASY );
        addQuestion ( q50 );

        QuestionGrammar q51 = new QuestionGrammar( "Past or Present Perfect: Fill in the correct form.\n\n" +
                " The weather_____awful in the past few days. " ,
                "was", "have been", "has been", 3, QuestionGrammar.DIFFICULTY_EASY );
        addQuestion ( q51 );
        QuestionGrammar q52 = new QuestionGrammar( "Past or Present Perfect: Fill in the correct form.\n\n" +
                " We_____the dishes. They’re clean now. " ,
                "have washed", "washing", "washed", 1, QuestionGrammar.DIFFICULTY_EASY );
        addQuestion ( q52 );
        QuestionGrammar q53 = new QuestionGrammar( "Past or Present Perfect: Fill in the correct form.\n\n" +
                " Emma_____her suitcase last night. " ,
                "packed", "pack", "has packed", 1, QuestionGrammar.DIFFICULTY_EASY );
        addQuestion ( q53 );
        QuestionGrammar q54 = new QuestionGrammar( "Past or Present Perfect: Fill in the correct form.\n\n" +
                "We______there for ten years but we’ve been in Birmingham for the last two." ,
                "live", "lived", "have lived", 2, QuestionGrammar.DIFFICULTY_EASY );
        addQuestion ( q54 );
        QuestionGrammar q55 = new QuestionGrammar( "Past or Present Perfect: Fill in the correct form.\n\n" +
                "You parcel______. The postman brought it two hours ago." ,
                "arrived", "arrived", "has arrived", 3, QuestionGrammar.DIFFICULTY_EASY );
        addQuestion ( q55 );
        QuestionGrammar q56 = new QuestionGrammar( "Past or Present Perfect: Fill in the correct form.\n\n" +
                " It______ yet today." ,
                "has not rained", "rained", "rains", 1, QuestionGrammar.DIFFICULTY_EASY );
        addQuestion ( q56 );
        QuestionGrammar q57 = new QuestionGrammar( "Past or Present Perfect: Fill in the correct form.\n\n" +
                " My sister’s car is only a year old but she_____already it." ,
                "have crashed", "has crashed", "crashed", 2, QuestionGrammar.DIFFICULTY_EASY );
        addQuestion ( q57 );
        QuestionGrammar q58 = new QuestionGrammar( "Past or Present Perfect: Fill in the correct form.\n\n" +
                " The Queen_____in an RAF helicopter last night." ,
                "have arrived", "has arrived", "arrived", 3, QuestionGrammar.DIFFICULTY_EASY );
        addQuestion ( q58 );
        QuestionGrammar q59 = new QuestionGrammar( "Past or Present Perfect: Fill in the correct form.\n\n" +
                " We_____a party for ages." ,
                "have not had", "had", "are not having", 1, QuestionGrammar.DIFFICULTY_EASY );
        addQuestion ( q59 );
        QuestionGrammar q60 = new QuestionGrammar( "Past or Present Perfect: Fill in the correct form.\n\n" +
                " The airplane_____. The pilot is just getting out." ,
                "has landed", "land", "landed", 1, QuestionGrammar.DIFFICULTY_EASY );
        addQuestion ( q60 );


        QuestionGrammar q61 = new QuestionGrammar( "Fill in the correct form.\n\n" +
                " The last lesson______at 8 o'clock." ,
                "began", "begun", "beginning", 1, QuestionGrammar.DIFFICULTY_EASY );
        addQuestion ( q61 );

        QuestionGrammar q62 = new QuestionGrammar( "Choose the correct future form.\n\n" +
                "I love London. I______probably there next year.  " ,
                "will go ", "am going to", "go", 1, QuestionGrammar.DIFFICULTY_EASY );
        addQuestion ( q62 );
        QuestionGrammar q63 = new QuestionGrammar( "Choose the correct future form.\n\n" +
                "Look at these big black clouds! It______rain.  " ,
                "will", "is going to", "was going to", 2, QuestionGrammar.DIFFICULTY_EASY );
        addQuestion ( q63 );
        QuestionGrammar q64 = new QuestionGrammar( "Choose the correct future form.\n\n" +
                " My horoscope says that I______an old friend this week." ,
                "will met", "am going", "will meet", 3, QuestionGrammar.DIFFICULTY_EASY );
        addQuestion ( q64 );
        QuestionGrammar q65 = new QuestionGrammar( "Choose the correct future form.\n\n" +
                " I haven't made up my mind yet. But I think I_____something nice in my mum's wardrobe. " ,
                "will find", "am going to find", "find", 1, QuestionGrammar.DIFFICULTY_EASY );
        addQuestion ( q65 );



        QuestionGrammar q66 = new QuestionGrammar( "Fill in the correct conjunctions and linking words.\n\n" +
                " When Dad comes home from work he lies down on the sofa_____he is tired. " ,
                "so", "because", "however", 2, QuestionGrammar.DIFFICULTY_HARD);
        addQuestion ( q66 );
        QuestionGrammar q67 = new QuestionGrammar( "Fill in the correct conjunctions and linking words.\n\n" +
                " Max had a headache yesterday, _____he didn’t come to basketball practice." ,
                "so", "so that", "then", 1, QuestionGrammar.DIFFICULTY_HARD);
        addQuestion ( q67 );
        QuestionGrammar q68 = new QuestionGrammar( "Fill in the correct conjunctions and linking words.\n\n" +
                " This is Toby’s new mountain bike, which he got from his parents. He locks it up every evening,_____nobody can take it." ,
                "unless", "so that", "which", 2, QuestionGrammar.DIFFICULTY_HARD);
        addQuestion ( q68 );
        QuestionGrammar q69 = new QuestionGrammar( "Fill in the correct conjunctions and linking words.\n\n" +
                "_____Samantha was very tired, she watched TV until well after midnight." ,
                "When", "Although", "During", 2, QuestionGrammar.DIFFICULTY_HARD);
        addQuestion ( q69 );
        QuestionGrammar q70 = new QuestionGrammar( "Fill in the correct conjunctions and linking words.\n\n" +
                "First, cut out the pictures,______glue them into your album." ,
                "and", "so", "then", 3, QuestionGrammar.DIFFICULTY_HARD);
        addQuestion ( q70 );
        QuestionGrammar q71 = new QuestionGrammar( "Fill in the correct conjunctions and linking words.\n\n" +
                "I would like to learn Japanese,______, I don’t know anyone who can teach me." ,
                "despite", "as well as", "however", 3, QuestionGrammar.DIFFICULTY_HARD);
        addQuestion ( q71 );
        QuestionGrammar q72 = new QuestionGrammar( "Fill in the correct conjunctions and linking words.\n\n" +
                "______we were driving through the countryside we saw many nice villages." ,
                "While", "During", "Because", 1, QuestionGrammar.DIFFICULTY_HARD);
        addQuestion ( q72 );
        QuestionGrammar q73 = new QuestionGrammar( "Fill in the correct conjunctions and linking words.\n\n" +
                "The Hemingways are our neighbours______our friends." ,
                "so", "as well as", "because", 2, QuestionGrammar.DIFFICULTY_HARD);
        addQuestion ( q73 );
        QuestionGrammar q74 = new QuestionGrammar( "Fill in the correct conjunctions and linking words\n\n" +
                "_____being a well-known politician, John Smith can also play the piano very well." ,
                "Besides", "as well as", "Such as", 1, QuestionGrammar.DIFFICULTY_HARD);
        addQuestion ( q74 );
        QuestionGrammar q75 = new QuestionGrammar( "Fill in the correct conjunctions and linking words\n\n" +
                "______his injury, the boy desperately wanted to play for his team in the finals." ,
                "Because", "During", "Despite", 3, QuestionGrammar.DIFFICULTY_HARD);
        addQuestion ( q75 );
        QuestionGrammar q76 = new QuestionGrammar( "Fill in the correct conjunctions and linking words.\n\n" +
                "______the hike up the mountains we saw a lot of deer." ,
                "During", "Unless", "While", 1, QuestionGrammar.DIFFICULTY_HARD);
        addQuestion ( q76 );
        QuestionGrammar q77 = new QuestionGrammar( "Fill in the correct conjunctions and linking words\n\n" +
                "______you finish that essay you won’t get anything to eat." ,
                "Although", "Unless", "If", 2, QuestionGrammar.DIFFICULTY_HARD);
        addQuestion ( q77 );
        QuestionGrammar q78 = new QuestionGrammar( "Fill in the correct conjunctions and linking words\n\n" +
                "_____my mother___my father will be able to attend the meeting." ,
                "Neither___nor", "Either___or", "Such as", 1, QuestionGrammar.DIFFICULTY_HARD);
        addQuestion ( q78 );
        QuestionGrammar q79 = new QuestionGrammar( "Fill in the correct conjunctions and linking words\n\n" +
                "He likes all kinds of sports,_____skiing, hockey and volleyball." ,
                "which", "so that", "such as", 3, QuestionGrammar.DIFFICULTY_HARD);
        addQuestion ( q79 );
        QuestionGrammar q80 = new QuestionGrammar( "Fill in the correct conjunctions and linking words.\n\n" +
                "You can have____tea___coffee for breakfast." ,
                "neither___nor", "either___or", "such as", 2, QuestionGrammar.DIFFICULTY_HARD);
        addQuestion ( q80 );


        QuestionGrammar q81 = new QuestionGrammar( "Fill in the correct indefinite prounoun.\n\n" +
                "I looked _______for my cat, but I couldn’t find it." ,
                "everywhere", "anywhere", "nowhere", 1, QuestionGrammar.DIFFICULTY_HARD);
        addQuestion ( q81 );
        QuestionGrammar q82 = new QuestionGrammar( "Fill in the correct indefinite prounoun.\n\n" +
                "James called his friend, but_______answered the phone." ,
                "someone", "no one", "somebody", 2, QuestionGrammar.DIFFICULTY_HARD);
        addQuestion ( q82 );
        QuestionGrammar q83 = new QuestionGrammar( "Fill in the correct indefinite prounoun.\n\n" +
                "I didn’t go _______on the weekend, so I was really bored." ,
                "everywhere", "somewhere", "anywhere", 3, QuestionGrammar.DIFFICULTY_HARD);
        addQuestion ( q83 );
        QuestionGrammar q84 = new QuestionGrammar( "Fill in the correct indefinite prounoun.\n\n" +
                "Let’s get________ to eat after our class." ,
                "something", "nothing", "anything", 1, QuestionGrammar.DIFFICULTY_HARD);
        addQuestion ( q84 );
        QuestionGrammar q85 = new QuestionGrammar( "Fill in the correct indefinite prounoun.\n\n" +
                "Did you hear that? I think _______rang the doorbell." ,
                "nobody", "somebody", "anybody", 2, QuestionGrammar.DIFFICULTY_HARD);
        addQuestion ( q85 );
        QuestionGrammar q86 = new QuestionGrammar( "Fill in the correct indefinite prounoun.\n\n" +
                "_______was on time.  No one was late." ,
                "Nobody", "Somebody", "Everybody", 3, QuestionGrammar.DIFFICULTY_HARD);
        addQuestion ( q86 );
        QuestionGrammar q87 = new QuestionGrammar( "Fill in the correct indefinite prounoun.\n\n" +
                "I didn’t eat _______ for lunch, so I’m really hungry now." ,
                "something", "anything", "everything", 2, QuestionGrammar.DIFFICULTY_HARD);
        addQuestion ( q87 );
        QuestionGrammar q88 = new QuestionGrammar( "Fill in the correct indefinite prounoun.\n\n" +
                "Linda understood_______that her teacher said." ,
                "something", "anything", "everything", 3, QuestionGrammar.DIFFICULTY_HARD);
        addQuestion ( q88 );
        QuestionGrammar q89 = new QuestionGrammar( "Fill in the correct indefinite prounoun.\n\n" +
                "I had _______to go because all the shops were closed." ,
                "nowhere", "somewhere", "everywhere", 1, QuestionGrammar.DIFFICULTY_HARD);
        addQuestion ( q89 );
        QuestionGrammar q90 = new QuestionGrammar( "Fill in the correct indefinite prounoun.\n\n" +
                "_______ came to school because it was a holiday." ,
                "somebody", "nobody", "everybody", 2, QuestionGrammar.DIFFICULTY_HARD);
        addQuestion ( q90 );
        QuestionGrammar q91 = new QuestionGrammar( "Fill in the correct indefinite prounoun.\n\n" +
                "Fernando wants to go _______interesting next summer." ,
                "everywhere", "somewhere", "anywhere", 2, QuestionGrammar.DIFFICULTY_HARD);
        addQuestion ( q91 );
        QuestionGrammar q92 = new QuestionGrammar( "Fill in the correct indefinite prounoun.\n\n" +
                "Was_______at home when you knocked on the door?" ,
                "everyone", "someone", "anyone", 3, QuestionGrammar.DIFFICULTY_HARD);
        addQuestion ( q92 );



        QuestionGrammar q93 = new QuestionGrammar( "Fill in the correct word.\n\n" +
                "How______do we have to read this week?" ,
                "much", "many", "most", 1, QuestionGrammar.DIFFICULTY_HARD);
        addQuestion ( q93 );
        QuestionGrammar q94 = new QuestionGrammar( "Fill in the correct word.\n\n" +
                "There aren’t very______books in the library." ,
                "much", "many", "most", 2, QuestionGrammar.DIFFICULTY_HARD);
        addQuestion ( q94 );
        QuestionGrammar q95 = new QuestionGrammar( "Fill in the correct word.\n\n" +
                "I have had______headaches already because of the stress." ,
                "few", "a little", "a few", 3, QuestionGrammar.DIFFICULTY_HARD);
        addQuestion ( q95 );
        QuestionGrammar q96 = new QuestionGrammar( "Fill in the correct word.\n\n" +
                "It has rained very______this summer, that’s why the grass is so brown." ,
                "little", "a little", "a few", 1, QuestionGrammar.DIFFICULTY_HARD);
        addQuestion ( q96 );
        QuestionGrammar q97 = new QuestionGrammar( "Fill in the correct word.\n\n" +
                "It has rained very______this summer, that’s why the grass is so brown." ,
                "little", "a little", "a few", 1, QuestionGrammar.DIFFICULTY_HARD);
        addQuestion ( q97 );
        QuestionGrammar q98 = new QuestionGrammar( "Fill in the correct word.\n\n" +
                "_______people know as much about computers as Jack does." ,
                "A little", "Most", "Few", 3, QuestionGrammar.DIFFICULTY_HARD);
        addQuestion ( q98 );
        QuestionGrammar q99 = new QuestionGrammar( "Fill in the correct word.\n\n" +
                "I do have_______friends but not that many." ,
                "little", "a few", "few", 2, QuestionGrammar.DIFFICULTY_HARD);
        addQuestion ( q99 );
        QuestionGrammar q100 = new QuestionGrammar( "Fill in the correct word.\n\n" +
                "How______juice is left in the bottle?" ,
                "many", "most", "much", 3, QuestionGrammar.DIFFICULTY_HARD);
        addQuestion ( q100 );
        QuestionGrammar q101 = new QuestionGrammar( "Fill in the correct word.\n\n" +
                "John had______money with him so he couldn’t even buy a bus ticket." ,
                "a little", "little", "much", 2, QuestionGrammar.DIFFICULTY_HARD);
        addQuestion ( q101 );
        QuestionGrammar q102 = new QuestionGrammar( "Fill in the correct word.\n\n" +
                "_______time and money is spent on education in Great Britain." ,
                "Much", "Few", "Many", 1, QuestionGrammar.DIFFICULTY_HARD);
        addQuestion ( q102 );
        QuestionGrammar q103 = new QuestionGrammar( "Fill in the correct word.\n\n" +
                "I know______Spanish so I am going to have a problem when I get there." ,
                "little", "few", "a little", 1, QuestionGrammar.DIFFICULTY_HARD);
        addQuestion ( q103 );
        QuestionGrammar q104 = new QuestionGrammar( "Fill in the correct word.\n\n" +
                "_______of the children in our block have got roller skates." ,
                "Much", "Few", "Most", 3, QuestionGrammar.DIFFICULTY_HARD);
        addQuestion ( q104 );
        QuestionGrammar q105 = new QuestionGrammar( "Fill in the correct word.\n\n" +
                "Football is the only subject I know very_______of. It doesn’t interest me that much." ,
                "little", "few", "a little", 1, QuestionGrammar.DIFFICULTY_HARD);
        addQuestion ( q105 );
        QuestionGrammar q106 = new QuestionGrammar( "Fill in the correct word.\n\n" +
                "_______people can live without money. We simply need it." ,
                "Much", "Few", "Many", 2, QuestionGrammar.DIFFICULTY_HARD);
        addQuestion ( q106 );
        QuestionGrammar q107 = new QuestionGrammar( "Fill in the correct word.\n\n" +
                "There are______leftovers for you in the refrigerator." ,
                "little", "few", "a few", 3, QuestionGrammar.DIFFICULTY_HARD);
        addQuestion ( q107 );
        QuestionGrammar q108 = new QuestionGrammar( "Fill in the correct word.\n\n" +
                "Is she already gone? I’m only______minutes late." ,
                "little", "few", "a few", 3, QuestionGrammar.DIFFICULTY_HARD);
        addQuestion ( q108 );


        QuestionGrammar q109 = new QuestionGrammar( "Fill in the correct subject and object pronoun.\n\n" +
                "Do you know that man? Do you know ______?" ,
                "him", "it", "her", 1, QuestionGrammar.DIFFICULTY_HARD);
        addQuestion ( q109 );
        QuestionGrammar q110 = new QuestionGrammar( "Fill in the correct subject and object pronoun.\n\n" +
                "Robert and Mark are late. ______should hurry." ,
                "Him", "They", "We", 2, QuestionGrammar.DIFFICULTY_HARD);
        addQuestion ( q110 );
        QuestionGrammar q111 = new QuestionGrammar( "Fill in the correct subject and object pronoun.\n\n" +
                "My friend and I have money. ______can go shopping." ,
                "Him", "They", "We", 2, QuestionGrammar.DIFFICULTY_HARD);
        addQuestion ( q111 );
        QuestionGrammar q112 = new QuestionGrammar( "Fill in the correct subject and object pronoun.\n\n" +
                "She gave ______a birthday gift. I really like it." ,
                "me", "you", "his", 1, QuestionGrammar.DIFFICULTY_HARD);
        addQuestion ( q112 );
        QuestionGrammar q113 = new QuestionGrammar( "Fill in the correct subject and object pronoun.\n\n" +
                "Elephants are very big, so ______eat a lot of food." ,
                "we", "you", "they", 3, QuestionGrammar.DIFFICULTY_HARD);
        addQuestion ( q113 );
        QuestionGrammar q114 = new QuestionGrammar( "Fill in the correct subject and object pronoun.\n\n" +
                "My brother is studying because______has a test tomorrow." ,
                "she", "he", "they", 3, QuestionGrammar.DIFFICULTY_HARD);
        addQuestion ( q114 );
        QuestionGrammar q115 = new QuestionGrammar( "Fill in the correct subject and object pronoun.\n\n" +
                "I almost never eat junk food because ______isn’t healthy." ,
                "it", "her", "they", 1, QuestionGrammar.DIFFICULTY_HARD);
        addQuestion ( q115 );
    }



    private void addQuestion(QuestionGrammar questionGrammar) {
        ContentValues cv = new ContentValues();
        cv.put ( QuizContractGrammar.QuestionsTable.COLUMN_QUESTION, questionGrammar.getQuestion () );
        cv.put ( QuizContractGrammar.QuestionsTable.COLUMN_OPTION1, questionGrammar.getOption1 () );
        cv.put ( QuizContractGrammar.QuestionsTable.COLUMN_OPTION2, questionGrammar.getOption2 () );
        cv.put ( QuizContractGrammar.QuestionsTable.COLUMN_OPTION3, questionGrammar.getOption3 () );
        cv.put ( QuizContractGrammar.QuestionsTable.COLUMN_ANSWER_NR, questionGrammar.getAnswerNr () );
        cv.put ( QuizContractGrammar.QuestionsTable.COLUMN_DIFFICULTY, questionGrammar.getDifficulty () );
        dbone.insert ( QuizContractGrammar.QuestionsTable.TABLE_NAME, null, cv );

    }

    public ArrayList<QuestionGrammar> getAllQuestions() {
        ArrayList<QuestionGrammar> questionGrammarList = new ArrayList<>();
        dbone = getReadableDatabase ();
        Cursor c = dbone.rawQuery ( "SELECT * FROM " + QuizContractGrammar.QuestionsTable.TABLE_NAME, null );

        if (c.moveToFirst ()) {
            do {
                QuestionGrammar questionGrammar = new QuestionGrammar();
                questionGrammar.setQuestion ( c.getString ( c.getColumnIndex ( QuizContractGrammar.QuestionsTable.COLUMN_QUESTION ) ) );
                questionGrammar.setOption1 ( c.getString ( c.getColumnIndex ( QuizContractGrammar.QuestionsTable.COLUMN_OPTION1 ) ) );
                questionGrammar.setOption2 ( c.getString ( c.getColumnIndex ( QuizContractGrammar.QuestionsTable.COLUMN_OPTION2 ) ) );
                questionGrammar.setOption3 ( c.getString ( c.getColumnIndex ( QuizContractGrammar.QuestionsTable.COLUMN_OPTION3 ) ) );
                questionGrammar.setAnswerNr ( c.getInt ( c.getColumnIndex ( QuizContractGrammar.QuestionsTable.COLUMN_ANSWER_NR ) ) );
                questionGrammar.setDifficulty(c.getString(c.getColumnIndex(QuizContractGrammar.QuestionsTable.COLUMN_DIFFICULTY)));
                questionGrammarList.add (questionGrammar);
            } while (c.moveToNext ());
        }

        c.close ();
        return questionGrammarList;
    }

    public ArrayList<QuestionGrammar> getQuestions(String difficulty) {
        ArrayList<QuestionGrammar> questionGrammarList = new ArrayList<>();
        dbone = getReadableDatabase ();

        String[] selectionArgs = new String[]{difficulty};
        Cursor c = dbone.rawQuery ( "SELECT * FROM " +
                QuizContractGrammar.QuestionsTable.TABLE_NAME + " WHERE " + QuizContractGrammar.QuestionsTable.COLUMN_DIFFICULTY + " = ? ", selectionArgs );

        if (c.moveToFirst ()) {
            do {
                QuestionGrammar questionGrammar = new QuestionGrammar();
                questionGrammar.setQuestion ( c.getString ( c.getColumnIndex ( QuizContractGrammar.QuestionsTable.COLUMN_QUESTION ) ) );
                questionGrammar.setOption1 ( c.getString ( c.getColumnIndex ( QuizContractGrammar.QuestionsTable.COLUMN_OPTION1 ) ) );
                questionGrammar.setOption2 ( c.getString ( c.getColumnIndex ( QuizContractGrammar.QuestionsTable.COLUMN_OPTION2 ) ) );
                questionGrammar.setOption3 ( c.getString ( c.getColumnIndex ( QuizContractGrammar.QuestionsTable.COLUMN_OPTION3 ) ) );
                questionGrammar.setAnswerNr ( c.getInt ( c.getColumnIndex ( QuizContractGrammar.QuestionsTable.COLUMN_ANSWER_NR ) ) );
                questionGrammar.setDifficulty ( c.getString ( c.getColumnIndex ( QuizContractGrammar.QuestionsTable.COLUMN_DIFFICULTY) ) );
                questionGrammarList.add (questionGrammar);
            } while (c.moveToNext ());
        }

        c.close ();
        return questionGrammarList;
    }

}
