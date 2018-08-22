package apps.myapp.eze.ezenglish2.vocabulary.verbs;

import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.Locale;

public class Lesson1Content extends AppCompatActivity {

    private TextToSpeech mTTS;
    private EditText mEditText;
    private Button mButtonSpeak;



    Spinner Verbs;
    Spinner Verbs1;
    Spinner Verbs2;
    Spinner Verbs3;
    Spinner Verbs4;
    Spinner Verbs5;
    Spinner Verbs6;
    Spinner Verbs102;
    Spinner Verbs8;
    Spinner Verbs9;
    Spinner Verbs10;
    Spinner Verbs11;
    Spinner Verbs12;
    Spinner Verbs13;
    Spinner Verbs14;
    Spinner Verbs15;
    Spinner Verbs16;
    Spinner Verbs17;
    Spinner Verbs18;
    Spinner Verbs19;
    Spinner Verbs20;
    Spinner Verbs21;
    Spinner Verbs22;
    Spinner Verbs23;
    Spinner Verbs24;
    Spinner Verbs25;
    Spinner Verbs26;
    Spinner Verbs27;
    Spinner Verbs28;
    Spinner Verbs29;
    Spinner Verbs30;
    Spinner Verbs31;
    Spinner Verbs32;
    Spinner Verbs33;
    Spinner Verbs34;
    Spinner Verbs35;
    Spinner Verbs36;
    Spinner Verbs37;
    Spinner Verbs38;
    Spinner Verbs39;
    Spinner Verbs40;
    Spinner Verbs41;
    Spinner Verbs42;
    Spinner Verbs43;
    Spinner Verbs44;
    Spinner Verbs45;
    Spinner Verbs46;
    Spinner Verbs47;
    Spinner Verbs48;
    Spinner Verbs49;
    Spinner Verbs50;
    Spinner Verbs51;
    Spinner Verbs52;
    Spinner Verbs53;
    Spinner Verbs54;
    Spinner Verbs55;
    Spinner Verbs56;
    Spinner Verbs57;
    Spinner Verbs58;
    Spinner Verbs59;
    Spinner Verbs60;
    Spinner Verbs61;
    Spinner Verbs62;
    Spinner Verbs63;
    Spinner Verbs64;
    Spinner Verbs65;
    Spinner Verbs66;
    Spinner Verbs67;
    Spinner Verbs68;
    Spinner Verbs69;
    Spinner Verbs70;
    Spinner Verbs71;
    Spinner Verbs72;
    Spinner Verbs73;
    Spinner Verbs74;
    Spinner Verbs75;
    Spinner Verbs76;
    Spinner Verbs77;
    Spinner Verbs78;
    Spinner Verbs79;
    Spinner Verbs80;
    Spinner Verbs81;
    Spinner Verbs82;
    Spinner Verbs83;
    Spinner Verbs84;
    Spinner Verbs85;
    Spinner Verbs86;
    Spinner Verbs87;
    Spinner Verbs88;
    Spinner Verbs89;
    Spinner Verbs90;
    Spinner Verbs91;
    Spinner Verbs92;
    Spinner Verbs93;
    Spinner Verbs94;
    Spinner Verbs95;
    Spinner Verbs96;
    Spinner Verbs97;
    Spinner Verbs98;
    Spinner Verbs99;
    Spinner Verbs100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(apps.myapp.eze.ezenglish2.R.layout.activity_lesson1_content);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mButtonSpeak = findViewById(apps.myapp.eze.ezenglish2.R.id.button_speak1);

        mTTS = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status == TextToSpeech.SUCCESS) {
                    int result = mTTS.setLanguage(Locale.ENGLISH);

                    if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                        Log.e("TTS", "Language not supported");
                    } else {
                        mButtonSpeak.setEnabled(true);
                    }
                } else {
                    Log.e("TTS", "Initialization failed");
                }

            }
        });

        mEditText = findViewById(apps.myapp.eze.ezenglish2.R.id.edit_text1);

        mButtonSpeak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                speak();

            }
        });


        Verbs1=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner1);
        ArrayAdapter<CharSequence>adapter1=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs1,android.R.layout.simple_spinner_item);
        Verbs1.setAdapter(adapter1);


        Verbs2=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner2);
        ArrayAdapter<CharSequence>adapter2=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs2,android.R.layout.simple_spinner_item);
        Verbs2.setAdapter(adapter2);

        Verbs3=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner3);
        ArrayAdapter<CharSequence>adapter3=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs3,android.R.layout.simple_spinner_item);
        Verbs3.setAdapter(adapter3);

        Verbs4=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner4);
        ArrayAdapter<CharSequence>adapter4=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs4,android.R.layout.simple_spinner_item);
        Verbs4.setAdapter(adapter4);

        Verbs5=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner5);
        ArrayAdapter<CharSequence>adapter5=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs5,android.R.layout.simple_spinner_item);
        Verbs5.setAdapter(adapter5);

        Verbs6=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner6);
        ArrayAdapter<CharSequence>adapter6=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs6,android.R.layout.simple_spinner_item);
        Verbs6.setAdapter(adapter6);

/*
        Verbs102 =(Spinner) findViewById(R.id.spinner7);
        ArrayAdapter<CharSequence>adapter7=ArrayAdapter.createFromResource(
                this,R.array.Verbs102,android.R.layout.simple_spinner_item);
        Verbs102.setAdapter(adapter7);
*/
        Verbs8=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner8);
        ArrayAdapter<CharSequence>adapter8=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs8,android.R.layout.simple_spinner_item);
        Verbs8.setAdapter(adapter8);

        Verbs9=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner9);
        ArrayAdapter<CharSequence>adapter9=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs9,android.R.layout.simple_spinner_item);
        Verbs9.setAdapter(adapter9);

        Verbs10=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner10);
        ArrayAdapter<CharSequence>adapter10=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs10,android.R.layout.simple_spinner_item);
        Verbs10.setAdapter(adapter10);

        Verbs11=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner11);
        ArrayAdapter<CharSequence>adapter11=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs11,android.R.layout.simple_spinner_item);
        Verbs11.setAdapter(adapter11);

        Verbs12=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner12);
        ArrayAdapter<CharSequence>adapter12=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs12,android.R.layout.simple_spinner_item);
        Verbs12.setAdapter(adapter12);

        Verbs13=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner13);
        ArrayAdapter<CharSequence>adapter13=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs13,android.R.layout.simple_spinner_item);
        Verbs13.setAdapter(adapter13);

        Verbs14=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner14);
        ArrayAdapter<CharSequence>adapter14=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs14,android.R.layout.simple_spinner_item);
        Verbs14.setAdapter(adapter14);

        Verbs15=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner15);
        ArrayAdapter<CharSequence>adapter15=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs15,android.R.layout.simple_spinner_item);
        Verbs15.setAdapter(adapter15);


        Verbs16=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner16);
        ArrayAdapter<CharSequence>adapter16=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs16,android.R.layout.simple_spinner_item);
        Verbs16.setAdapter(adapter16);

        Verbs17=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner17);
        ArrayAdapter<CharSequence>adapter17=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs17,android.R.layout.simple_spinner_item);
        Verbs17.setAdapter(adapter17);

        Verbs18=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner18);
        ArrayAdapter<CharSequence>adapter18=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs18,android.R.layout.simple_spinner_item);
        Verbs18.setAdapter(adapter18);

        Verbs19=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner19);
        ArrayAdapter<CharSequence>adapter19=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs19,android.R.layout.simple_spinner_item);
        Verbs19.setAdapter(adapter19);


        Verbs20=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner20);
        ArrayAdapter<CharSequence>adapter20=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs20,android.R.layout.simple_spinner_item);
        Verbs20.setAdapter(adapter20);

        Verbs21=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner21);
        ArrayAdapter<CharSequence>adapter21=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs21,android.R.layout.simple_spinner_item);
        Verbs21.setAdapter(adapter21);

        Verbs22=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner22);
        ArrayAdapter<CharSequence>adapter22=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs22,android.R.layout.simple_spinner_item);
        Verbs22.setAdapter(adapter22);

        Verbs23=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner23);
        ArrayAdapter<CharSequence>adapter23=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs23,android.R.layout.simple_spinner_item);
        Verbs23.setAdapter(adapter23);

        Verbs24=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner24);
        ArrayAdapter<CharSequence>adapter24=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs24,android.R.layout.simple_spinner_item);
        Verbs24.setAdapter(adapter24);

        Verbs25=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner25);
        ArrayAdapter<CharSequence>adapter25=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs25,android.R.layout.simple_spinner_item);
        Verbs25.setAdapter(adapter25);

        Verbs26=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner26);
        ArrayAdapter<CharSequence>adapter26=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs26,android.R.layout.simple_spinner_item);
        Verbs26.setAdapter(adapter26);

        Verbs27=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner27);
        ArrayAdapter<CharSequence>adapter27=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs27,android.R.layout.simple_spinner_item);
        Verbs27.setAdapter(adapter27);


        Verbs28=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner28);
        ArrayAdapter<CharSequence>adapter28=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs28,android.R.layout.simple_spinner_item);
        Verbs28.setAdapter(adapter28);

        Verbs29=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner29);
        ArrayAdapter<CharSequence>adapter29=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs29,android.R.layout.simple_spinner_item);
        Verbs29.setAdapter(adapter27);

        Verbs30=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner30);
        ArrayAdapter<CharSequence>adapter30=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs30,android.R.layout.simple_spinner_item);
        Verbs30.setAdapter(adapter30);

        Verbs31=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner31);
        ArrayAdapter<CharSequence>adapter31=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs31,android.R.layout.simple_spinner_item);
        Verbs31.setAdapter(adapter31);

        Verbs32=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner32);
        ArrayAdapter<CharSequence>adapter32=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs32,android.R.layout.simple_spinner_item);
        Verbs32.setAdapter(adapter32);

        Verbs33=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner33);
        ArrayAdapter<CharSequence>adapter33=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs33,android.R.layout.simple_spinner_item);
        Verbs33.setAdapter(adapter33);

        Verbs34=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner34);
        ArrayAdapter<CharSequence>adapter34=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs34,android.R.layout.simple_spinner_item);
        Verbs34.setAdapter(adapter34);

        Verbs35=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner35);
        ArrayAdapter<CharSequence>adapter35=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs35,android.R.layout.simple_spinner_item);
        Verbs35.setAdapter(adapter35);

        Verbs36=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner36);
        ArrayAdapter<CharSequence>adapter36=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs36,android.R.layout.simple_spinner_item);
        Verbs36.setAdapter(adapter36);


        Verbs37=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner37);
        ArrayAdapter<CharSequence>adapter37=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs37,android.R.layout.simple_spinner_item);
        Verbs37.setAdapter(adapter37);


        Verbs38=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner38);
        ArrayAdapter<CharSequence>adapter38=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs38,android.R.layout.simple_spinner_item);
        Verbs38.setAdapter(adapter38);


        Verbs39=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner39);
        ArrayAdapter<CharSequence>adapter39=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs39,android.R.layout.simple_spinner_item);
        Verbs39.setAdapter(adapter39);


        Verbs40=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner40);
        ArrayAdapter<CharSequence>adapter40=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs40,android.R.layout.simple_spinner_item);
        Verbs40.setAdapter(adapter40);

        Verbs41=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner41);
        ArrayAdapter<CharSequence>adapter41=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs41,android.R.layout.simple_spinner_item);
        Verbs41.setAdapter(adapter41);

        Verbs42=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner42);
        ArrayAdapter<CharSequence>adapter42=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs42,android.R.layout.simple_spinner_item);
        Verbs42.setAdapter(adapter42);

        Verbs43=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner43);
        ArrayAdapter<CharSequence>adapter43=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs43,android.R.layout.simple_spinner_item);
        Verbs43.setAdapter(adapter43);

        Verbs44=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner44);
        ArrayAdapter<CharSequence>adapter44=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs44,android.R.layout.simple_spinner_item);
        Verbs44.setAdapter(adapter44);

        Verbs45=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner45);
        ArrayAdapter<CharSequence>adapter45=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs45,android.R.layout.simple_spinner_item);
        Verbs45.setAdapter(adapter45);

        Verbs46=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner46);
        ArrayAdapter<CharSequence>adapter46=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs46,android.R.layout.simple_spinner_item);
        Verbs46.setAdapter(adapter46);

        Verbs47=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner47);
        ArrayAdapter<CharSequence>adapter47=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs47,android.R.layout.simple_spinner_item);
        Verbs47.setAdapter(adapter47);

        Verbs48=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner48);
        ArrayAdapter<CharSequence>adapter48=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs48,android.R.layout.simple_spinner_item);
        Verbs48.setAdapter(adapter48);

        Verbs49=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner49);
        ArrayAdapter<CharSequence>adapter49=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs49,android.R.layout.simple_spinner_item);
        Verbs49.setAdapter(adapter49);

        Verbs50=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner50);
        ArrayAdapter<CharSequence>adapter50=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs50,android.R.layout.simple_spinner_item);
        Verbs50.setAdapter(adapter50);

        Verbs51=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner51);
        ArrayAdapter<CharSequence>adapter51=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs51,android.R.layout.simple_spinner_item);
        Verbs51.setAdapter(adapter51);

        Verbs52=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner52);
        ArrayAdapter<CharSequence>adapter52=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs52,android.R.layout.simple_spinner_item);
        Verbs52.setAdapter(adapter52);

        Verbs53=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner53);
        ArrayAdapter<CharSequence>adapter53=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs53,android.R.layout.simple_spinner_item);
        Verbs53.setAdapter(adapter53);

        Verbs54=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner54);
        ArrayAdapter<CharSequence>adapter54=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs54,android.R.layout.simple_spinner_item);
        Verbs54.setAdapter(adapter54);

        Verbs55=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner55);
        ArrayAdapter<CharSequence>adapter55=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs55,android.R.layout.simple_spinner_item);
        Verbs55.setAdapter(adapter55);

        Verbs56=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner56);
        ArrayAdapter<CharSequence>adapter56=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs56,android.R.layout.simple_spinner_item);
        Verbs56.setAdapter(adapter56);

        Verbs57=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner57);
        ArrayAdapter<CharSequence>adapter57=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs57,android.R.layout.simple_spinner_item);
        Verbs57.setAdapter(adapter57);

        Verbs58=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner58);
        ArrayAdapter<CharSequence>adapter58=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs58,android.R.layout.simple_spinner_item);
        Verbs58.setAdapter(adapter58);

        Verbs59=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner59);
        ArrayAdapter<CharSequence>adapter59=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs59,android.R.layout.simple_spinner_item);
        Verbs59.setAdapter(adapter59);

        Verbs60=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner60);
        ArrayAdapter<CharSequence>adapter60=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs60,android.R.layout.simple_spinner_item);
        Verbs60.setAdapter(adapter60);

        Verbs61=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner61);
        ArrayAdapter<CharSequence>adapter61=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs61,android.R.layout.simple_spinner_item);
        Verbs61.setAdapter(adapter61);

        Verbs62=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner62);
        ArrayAdapter<CharSequence>adapter62=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs62,android.R.layout.simple_spinner_item);
        Verbs62.setAdapter(adapter62);

        Verbs63=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner63);
        ArrayAdapter<CharSequence>adapter63=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs63,android.R.layout.simple_spinner_item);
        Verbs63.setAdapter(adapter63);

        Verbs64=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner64);
        ArrayAdapter<CharSequence>adapter64=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs64,android.R.layout.simple_spinner_item);
        Verbs64.setAdapter(adapter64);
        Verbs65=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner65);
        ArrayAdapter<CharSequence>adapter65=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs65,android.R.layout.simple_spinner_item);
        Verbs65.setAdapter(adapter65);

        Verbs66=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner66);
        ArrayAdapter<CharSequence>adapter66=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs66,android.R.layout.simple_spinner_item);
        Verbs66.setAdapter(adapter66);
        Verbs67=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner67);
        ArrayAdapter<CharSequence>adapter67=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs67,android.R.layout.simple_spinner_item);
        Verbs67.setAdapter(adapter67);
        Verbs68=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner68);
        ArrayAdapter<CharSequence>adapter68=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs68,android.R.layout.simple_spinner_item);
        Verbs68.setAdapter(adapter68);

        Verbs69=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner69);
        ArrayAdapter<CharSequence>adapter69=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs69,android.R.layout.simple_spinner_item);
        Verbs69.setAdapter(adapter69);
        Verbs70=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner70);
        ArrayAdapter<CharSequence>adapter70=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs70,android.R.layout.simple_spinner_item);
        Verbs70.setAdapter(adapter70);
        Verbs71=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner71);
        ArrayAdapter<CharSequence>adapter71=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs71,android.R.layout.simple_spinner_item);
        Verbs71.setAdapter(adapter71);
        Verbs72=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner72);
        ArrayAdapter<CharSequence>adapter72=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs72,android.R.layout.simple_spinner_item);
        Verbs72.setAdapter(adapter72);
        Verbs73=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner73);
        ArrayAdapter<CharSequence>adapter73=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs73,android.R.layout.simple_spinner_item);
        Verbs73.setAdapter(adapter73);
        Verbs74=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner74);
        ArrayAdapter<CharSequence>adapter74=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs74,android.R.layout.simple_spinner_item);
        Verbs74.setAdapter(adapter74);
        Verbs75=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner75);
        ArrayAdapter<CharSequence>adapter75=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs75,android.R.layout.simple_spinner_item);
        Verbs75.setAdapter(adapter75);

        Verbs76=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner76);
        ArrayAdapter<CharSequence>adapter76=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs76,android.R.layout.simple_spinner_item);
        Verbs76.setAdapter(adapter76);

        Verbs77=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner77);
        ArrayAdapter<CharSequence>adapter77=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs77,android.R.layout.simple_spinner_item);
        Verbs77.setAdapter(adapter77);

        Verbs78=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner78);
        ArrayAdapter<CharSequence>adapter78=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs78,android.R.layout.simple_spinner_item);
        Verbs78.setAdapter(adapter78);

        Verbs79=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner79);
        ArrayAdapter<CharSequence>adapter79=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs79,android.R.layout.simple_spinner_item);
        Verbs79.setAdapter(adapter79);

        Verbs80=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner80);
        ArrayAdapter<CharSequence>adapter80=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs80,android.R.layout.simple_spinner_item);
        Verbs80.setAdapter(adapter80);

        Verbs81=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner81);
        ArrayAdapter<CharSequence>adapter81=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs81,android.R.layout.simple_spinner_item);
        Verbs81.setAdapter(adapter81);

        Verbs82=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner82);
        ArrayAdapter<CharSequence>adapter82=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs82,android.R.layout.simple_spinner_item);
        Verbs82.setAdapter(adapter82);

        Verbs83=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner83);
        ArrayAdapter<CharSequence>adapter83=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs83,android.R.layout.simple_spinner_item);
        Verbs83.setAdapter(adapter83);

        Verbs84=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner84);
        ArrayAdapter<CharSequence>adapter84=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs84,android.R.layout.simple_spinner_item);
        Verbs84.setAdapter(adapter84);

        Verbs85=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner85);
        ArrayAdapter<CharSequence>adapter85=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs85,android.R.layout.simple_spinner_item);
        Verbs85.setAdapter(adapter85);

        Verbs87=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner87);
        ArrayAdapter<CharSequence>adapter87=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs87,android.R.layout.simple_spinner_item);
        Verbs87.setAdapter(adapter87);

        Verbs86=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner86);
        ArrayAdapter<CharSequence>adapter86=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs86,android.R.layout.simple_spinner_item);
        Verbs86.setAdapter(adapter86);

        Verbs88=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner88);
        ArrayAdapter<CharSequence>adapter88=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs88,android.R.layout.simple_spinner_item);
        Verbs88.setAdapter(adapter88);


        Verbs89=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner89);
        ArrayAdapter<CharSequence>adapter89=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs89,android.R.layout.simple_spinner_item);
        Verbs89.setAdapter(adapter89);

        Verbs90=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner90);
        ArrayAdapter<CharSequence>adapter90=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs88,android.R.layout.simple_spinner_item);
        Verbs90.setAdapter(adapter90);

        Verbs91=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner91);
        ArrayAdapter<CharSequence>adapter91=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs91,android.R.layout.simple_spinner_item);
        Verbs91.setAdapter(adapter91);

        Verbs92=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner92);
        ArrayAdapter<CharSequence>adapter92=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs92,android.R.layout.simple_spinner_item);
        Verbs92.setAdapter(adapter92);

        Verbs93=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner93);
        ArrayAdapter<CharSequence>adapter93=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs93,android.R.layout.simple_spinner_item);
        Verbs93.setAdapter(adapter93);

        Verbs94=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner94);
        ArrayAdapter<CharSequence>adapter94=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs94,android.R.layout.simple_spinner_item);
        Verbs94.setAdapter(adapter94);

        Verbs95=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner95);
        ArrayAdapter<CharSequence>adapter95=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs95,android.R.layout.simple_spinner_item);
        Verbs95.setAdapter(adapter95);

        Verbs97=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner97);
        ArrayAdapter<CharSequence>adapter97=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs97,android.R.layout.simple_spinner_item);
        Verbs97.setAdapter(adapter97);

        Verbs96=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner96);
        ArrayAdapter<CharSequence>adapter96=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs96,android.R.layout.simple_spinner_item);
        Verbs96.setAdapter(adapter96);

        Verbs98=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner98);
        ArrayAdapter<CharSequence>adapter98=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs98,android.R.layout.simple_spinner_item);
        Verbs98.setAdapter(adapter98);


        Verbs99=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner99);
        ArrayAdapter<CharSequence>adapter99=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs99,android.R.layout.simple_spinner_item);
        Verbs99.setAdapter(adapter99);
        Verbs100=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner100);
        ArrayAdapter<CharSequence> adapter100=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs100,android.R.layout.simple_spinner_item);
        Verbs100.setAdapter(adapter100);

/*
        Verbs =(Spinner) findViewById(R.id.spinner);
        ArrayAdapter<CharSequence>adapter=ArrayAdapter.createFromResource(
                this,R.array.Verbs101,android.R.layout.simple_spinner_item);
        Verbs.setAdapter(adapter);*/

    }
    @Override
    protected void onDestroy() {
        if (mTTS != null){
            mTTS.stop();
            mTTS.shutdown();
        }

        super.onDestroy();
    }

    private void speak() {
        String text = mEditText.getText().toString();

        mTTS.speak(text, TextToSpeech.QUEUE_FLUSH, null);

    }
}
