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

public class Lesson2Content extends AppCompatActivity {

    private TextToSpeech mTTS;
    private EditText mEditText;
    private Button mButtonSpeak;

    Spinner Verb0;
    Spinner Verb1;
    Spinner Verb2;
    Spinner Verb3;
    Spinner Verb4;
    Spinner Verb5;
    Spinner Verb6;
    Spinner Verb7;
    Spinner Verb8;
    Spinner Verb9;
    Spinner Verb10;
    Spinner Verb11;
    Spinner Verb12;
    Spinner Verb13;
    Spinner Verb14;
    Spinner Verb15;
    Spinner Verb16;
    Spinner Verb17;
    Spinner Verb18;
    Spinner Verb19;
    Spinner Verb20;
    Spinner Verb21;
    Spinner Verb22;
    Spinner Verb23;
    Spinner Verb24;
    Spinner Verb25;
    Spinner Verb26;
    Spinner Verb27;
    Spinner Verb28;
    Spinner Verb29;
    Spinner Verb30;
    Spinner Verb31;
    Spinner Verb32;
    Spinner Verb33;
    Spinner Verb34;
    Spinner Verb35;
    Spinner Verb36;
    Spinner Verb37;
    Spinner Verb38;
    Spinner Verb39;
    Spinner Verb40;
    Spinner Verb41;
    Spinner Verb42;
    Spinner Verb43;
    Spinner Verb44;
    Spinner Verb45;
    Spinner Verb46;
    Spinner Verb47;
    Spinner Verb48;
    Spinner Verb49;
    Spinner Verb50;
    Spinner Verb51;
    Spinner Verb52;
    Spinner Verb53;
    Spinner Verb54;
    Spinner Verb55;
    Spinner Verb56;
    Spinner Verb57;
    Spinner Verb58;
    Spinner Verb59;
    Spinner Verb60;
    Spinner Verb61;
    Spinner Verb62;
    Spinner Verb63;
    Spinner Verb64;
    Spinner Verb65;
    Spinner Verb66;
    Spinner Verb67;
    Spinner Verb68;
    Spinner Verb69;
    Spinner Verb70;
    Spinner Verb71;
    Spinner Verb72;
    Spinner Verb73;
    Spinner Verb74;
    Spinner Verb75;
    Spinner Verb76;
    Spinner Verb77;
    Spinner Verb78;
    Spinner Verb79;
    Spinner Verb80;
    Spinner Verb81;
    Spinner Verb82;
    Spinner Verb83;
    Spinner Verb84;
    Spinner Verb85;
    Spinner Verb86;
    Spinner Verb87;
    Spinner Verb88;
    Spinner Verb89;
    Spinner Verb90;
    Spinner Verb91;
    Spinner Verb92;
    Spinner Verb93;
    Spinner Verb94;
    Spinner Verb95;
    Spinner Verb96;
    Spinner Verb97;
    Spinner Verb98;
    Spinner Verb99;
    Spinner Verb100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(apps.myapp.eze.ezenglish2.R.layout.activity_lesson2_content);

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
                    Log.e("TTS", "Initialization failes");
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


        Verb0 =(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner0);
        ArrayAdapter<CharSequence> adapter0=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb0,android.R.layout.simple_spinner_item);
        Verb0.setAdapter(adapter0);


        Verb1=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner01);
        ArrayAdapter<CharSequence>adapter01=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb1,android.R.layout.simple_spinner_item);
        Verb1.setAdapter(adapter01);


        Verb2=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner02);
        ArrayAdapter<CharSequence>adapter02=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb2,android.R.layout.simple_spinner_item);
        Verb2.setAdapter(adapter02);

        Verb3=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner03);
        ArrayAdapter<CharSequence>adapter03=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb3,android.R.layout.simple_spinner_item);
        Verb3.setAdapter(adapter03);

        Verb4=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner04);
        ArrayAdapter<CharSequence>adapter04=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb4,android.R.layout.simple_spinner_item);
        Verb4.setAdapter(adapter04);

        Verb5=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner05);
        ArrayAdapter<CharSequence>adapter05=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb5,android.R.layout.simple_spinner_item);
        Verb5.setAdapter(adapter05);

        Verb6=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner06);
        ArrayAdapter<CharSequence>adapter06=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb6,android.R.layout.simple_spinner_item);
        Verb6.setAdapter(adapter06);

        Verb7=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner07);
        ArrayAdapter<CharSequence>adapter07=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb7,android.R.layout.simple_spinner_item);
        Verb7.setAdapter(adapter07);

        Verb8=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner08);
        ArrayAdapter<CharSequence>adapter08=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb8,android.R.layout.simple_spinner_item);
        Verb8.setAdapter(adapter08);

        Verb9=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner09);
        ArrayAdapter<CharSequence>adapter09=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb9,android.R.layout.simple_spinner_item);
        Verb9.setAdapter(adapter09);

        Verb10=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner010);
        ArrayAdapter<CharSequence>adapter010=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb10,android.R.layout.simple_spinner_item);
        Verb10.setAdapter(adapter010);

        Verb11=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner011);
        ArrayAdapter<CharSequence>adapter011=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb11,android.R.layout.simple_spinner_item);
        Verb11.setAdapter(adapter011);

        Verb12=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner012);
        ArrayAdapter<CharSequence>adapter012=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb12,android.R.layout.simple_spinner_item);
        Verb12.setAdapter(adapter012);

        Verb13=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner013);
        ArrayAdapter<CharSequence>adapter013=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb13,android.R.layout.simple_spinner_item);
        Verb13.setAdapter(adapter013);

        Verb14=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner014);
        ArrayAdapter<CharSequence>adapter014=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb14,android.R.layout.simple_spinner_item);
        Verb14.setAdapter(adapter014);

        Verb15=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner015);
        ArrayAdapter<CharSequence>adapter015=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb15,android.R.layout.simple_spinner_item);
        Verb15.setAdapter(adapter015);

        Verb16=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner016);
        ArrayAdapter<CharSequence>adapter016=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb16,android.R.layout.simple_spinner_item);
        Verb16.setAdapter(adapter016);

        Verb17=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner017);
        ArrayAdapter<CharSequence>adapter017=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb17,android.R.layout.simple_spinner_item);
        Verb17.setAdapter(adapter017);

        Verb18=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner018);
        ArrayAdapter<CharSequence>adapter018=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb18,android.R.layout.simple_spinner_item);
        Verb18.setAdapter(adapter018);

        Verb19=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner019);
        ArrayAdapter<CharSequence>adapter019=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb19,android.R.layout.simple_spinner_item);
        Verb19.setAdapter(adapter019);

        Verb20=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner020);
        ArrayAdapter<CharSequence>adapter020=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb20,android.R.layout.simple_spinner_item);
        Verb20.setAdapter(adapter020);

        Verb21=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner021);
        ArrayAdapter<CharSequence>adapter021=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb21,android.R.layout.simple_spinner_item);
        Verb21.setAdapter(adapter021);

        Verb22=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner022);
        ArrayAdapter<CharSequence>adapter022=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb22,android.R.layout.simple_spinner_item);
        Verb22.setAdapter(adapter022);

        Verb23=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner023);
        ArrayAdapter<CharSequence>adapter023=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb23,android.R.layout.simple_spinner_item);
        Verb23.setAdapter(adapter023);

        Verb24=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner024);
        ArrayAdapter<CharSequence>adapter024=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb24,android.R.layout.simple_spinner_item);
        Verb24.setAdapter(adapter024);

        Verb25=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner025);
        ArrayAdapter<CharSequence>adapter025=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb25,android.R.layout.simple_spinner_item);
        Verb25.setAdapter(adapter025);

        Verb26=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner026);
        ArrayAdapter<CharSequence>adapter026=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb26,android.R.layout.simple_spinner_item);
        Verb26.setAdapter(adapter026);

        Verb27=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner027);
        ArrayAdapter<CharSequence>adapter027=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb27,android.R.layout.simple_spinner_item);
        Verb27.setAdapter(adapter027);


        Verb28=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner028);
        ArrayAdapter<CharSequence>adapter028=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb28,android.R.layout.simple_spinner_item);
        Verb28.setAdapter(adapter028);

        Verb29=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner029);
        ArrayAdapter<CharSequence>adapter029=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb29,android.R.layout.simple_spinner_item);
        Verb29.setAdapter(adapter027);

        Verb30=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner030);
        ArrayAdapter<CharSequence>adapter030=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb30,android.R.layout.simple_spinner_item);
        Verb30.setAdapter(adapter030);

        Verb31=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner031);
        ArrayAdapter<CharSequence>adapter031=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb31,android.R.layout.simple_spinner_item);
        Verb31.setAdapter(adapter031);

        Verb32=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner032);
        ArrayAdapter<CharSequence>adapter032=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb32,android.R.layout.simple_spinner_item);
        Verb32.setAdapter(adapter032);

        Verb33=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner033);
        ArrayAdapter<CharSequence>adapter033=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb33,android.R.layout.simple_spinner_item);
        Verb33.setAdapter(adapter033);

        Verb34=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner034);
        ArrayAdapter<CharSequence>adapter034=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb34,android.R.layout.simple_spinner_item);
        Verb34.setAdapter(adapter034);

        Verb35=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner035);
        ArrayAdapter<CharSequence>adapter035=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb35,android.R.layout.simple_spinner_item);
        Verb35.setAdapter(adapter035);

        Verb37=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner037);
        ArrayAdapter<CharSequence>adapter037=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb37,android.R.layout.simple_spinner_item);
        Verb37.setAdapter(adapter037);

        Verb36=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner036);
        ArrayAdapter<CharSequence>adapter036=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb36,android.R.layout.simple_spinner_item);
        Verb36.setAdapter(adapter036);

        Verb38=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner038);
        ArrayAdapter<CharSequence>adapter038=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb38,android.R.layout.simple_spinner_item);
        Verb38.setAdapter(adapter038);


        Verb39=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner039);
        ArrayAdapter<CharSequence>adapter039=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb39,android.R.layout.simple_spinner_item);
        Verb39.setAdapter(adapter039);

        Verb40=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner040);
        ArrayAdapter<CharSequence>adapter040=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs40,android.R.layout.simple_spinner_item);
        Verb40.setAdapter(adapter040);

        Verb46=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner046);
        ArrayAdapter<CharSequence>adapter046=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb46,android.R.layout.simple_spinner_item);
        Verb46.setAdapter(adapter046);

        Verb41=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner041);
        ArrayAdapter<CharSequence>adapter041=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb41,android.R.layout.simple_spinner_item);
        Verb41.setAdapter(adapter041);

        Verb42=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner042);
        ArrayAdapter<CharSequence>adapter042=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb42,android.R.layout.simple_spinner_item);
        Verb42.setAdapter(adapter042);

        Verb43=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner043);
        ArrayAdapter<CharSequence>adapter043=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb43,android.R.layout.simple_spinner_item);
        Verb43.setAdapter(adapter043);

        Verb44=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner044);
        ArrayAdapter<CharSequence>adapter044=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs44,android.R.layout.simple_spinner_item);
        Verb44.setAdapter(adapter044);

        Verb45=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner045);
        ArrayAdapter<CharSequence>adapter045=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs45,android.R.layout.simple_spinner_item);
        Verb45.setAdapter(adapter045);

        Verb47=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner047);
        ArrayAdapter<CharSequence>adapter047=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb47,android.R.layout.simple_spinner_item);
        Verb47.setAdapter(adapter047);

        Verb48=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner048);
        ArrayAdapter<CharSequence>adapter048=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb48,android.R.layout.simple_spinner_item);
        Verb48.setAdapter(adapter048);

        Verb49=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner049);
        ArrayAdapter<CharSequence>adapter049=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb49,android.R.layout.simple_spinner_item);
        Verb49.setAdapter(adapter049);


        Verb50=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner050);
        ArrayAdapter<CharSequence>adapter050=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb50,android.R.layout.simple_spinner_item);
        Verb50.setAdapter(adapter050);

        Verb51=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner051);
        ArrayAdapter<CharSequence>adapter051=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs51,android.R.layout.simple_spinner_item);
        Verb51.setAdapter(adapter051);

        Verb52=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner052);
        ArrayAdapter<CharSequence>adapter052=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb52,android.R.layout.simple_spinner_item);
        Verb52.setAdapter(adapter052);

        Verb53=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner053);
        ArrayAdapter<CharSequence>adapter053=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb53,android.R.layout.simple_spinner_item);
        Verb53.setAdapter(adapter053);

        Verb54=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner054);
        ArrayAdapter<CharSequence>adapter054=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb54,android.R.layout.simple_spinner_item);
        Verb54.setAdapter(adapter054);

        Verb55=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner055);
        ArrayAdapter<CharSequence>adapter055=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb55,android.R.layout.simple_spinner_item);
        Verb55.setAdapter(adapter055);

        Verb56=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner056);
        ArrayAdapter<CharSequence>adapter056=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb56,android.R.layout.simple_spinner_item);
        Verb56.setAdapter(adapter056);

        Verb57=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner057);
        ArrayAdapter<CharSequence>adapter057=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb57,android.R.layout.simple_spinner_item);
        Verb57.setAdapter(adapter057);

        Verb58=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner058);
        ArrayAdapter<CharSequence>adapter058=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb58,android.R.layout.simple_spinner_item);
        Verb58.setAdapter(adapter058);

        Verb59=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner059);
        ArrayAdapter<CharSequence>adapter059=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb59,android.R.layout.simple_spinner_item);
        Verb59.setAdapter(adapter059);

        Verb60=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner060);
        ArrayAdapter<CharSequence>adapter060=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb60,android.R.layout.simple_spinner_item);
        Verb60.setAdapter(adapter060);

        Verb61=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner061);
        ArrayAdapter<CharSequence>adapter061=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb61,android.R.layout.simple_spinner_item);
        Verb61.setAdapter(adapter061);

        Verb62=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner062);
        ArrayAdapter<CharSequence>adapter062=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb62,android.R.layout.simple_spinner_item);
        Verb62.setAdapter(adapter062);

        Verb63=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner063);
        ArrayAdapter<CharSequence>adapter063=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb63,android.R.layout.simple_spinner_item);
        Verb63.setAdapter(adapter063);

        Verb64=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner064);
        ArrayAdapter<CharSequence>adapter064=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb64,android.R.layout.simple_spinner_item);
        Verb64.setAdapter(adapter064);

        Verb65=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner065);
        ArrayAdapter<CharSequence>adapter065=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb65,android.R.layout.simple_spinner_item);
        Verb65.setAdapter(adapter065);

        Verb66=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner066);
        ArrayAdapter<CharSequence>adapter066=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb66,android.R.layout.simple_spinner_item);
        Verb66.setAdapter(adapter066);

        Verb67=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner067);
        ArrayAdapter<CharSequence>adapter067=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb67,android.R.layout.simple_spinner_item);
        Verb67.setAdapter(adapter067);

        Verb68=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner068);
        ArrayAdapter<CharSequence>adapter068=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb68,android.R.layout.simple_spinner_item);
        Verb68.setAdapter(adapter068);

        Verb69=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner069);
        ArrayAdapter<CharSequence>adapter069=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb69,android.R.layout.simple_spinner_item);
        Verb69.setAdapter(adapter069);

        Verb70=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner070);
        ArrayAdapter<CharSequence>adapter070=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb70,android.R.layout.simple_spinner_item);
        Verb70.setAdapter(adapter070);

        Verb71=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner071);
        ArrayAdapter<CharSequence>adapter071=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verbs71,android.R.layout.simple_spinner_item);
        Verb71.setAdapter(adapter071);

        Verb72=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner072);
        ArrayAdapter<CharSequence>adapter072=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb72,android.R.layout.simple_spinner_item);
        Verb72.setAdapter(adapter072);

        Verb73=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner073);
        ArrayAdapter<CharSequence>adapter073=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb73,android.R.layout.simple_spinner_item);
        Verb73.setAdapter(adapter073);

        Verb74=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner074);
        ArrayAdapter<CharSequence>adapter074=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb74,android.R.layout.simple_spinner_item);
        Verb74.setAdapter(adapter074);

        Verb75=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner075);
        ArrayAdapter<CharSequence>adapter075=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb75,android.R.layout.simple_spinner_item);
        Verb75.setAdapter(adapter075);

        Verb76=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner076);
        ArrayAdapter<CharSequence>adapter076=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb76,android.R.layout.simple_spinner_item);
        Verb76.setAdapter(adapter076);

        Verb77=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner077);
        ArrayAdapter<CharSequence>adapter077=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb77,android.R.layout.simple_spinner_item);
        Verb77.setAdapter(adapter077);

        Verb78=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner078);
        ArrayAdapter<CharSequence>adapter078=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb78,android.R.layout.simple_spinner_item);
        Verb78.setAdapter(adapter078);

        Verb79=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner079);
        ArrayAdapter<CharSequence>adapter079=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb79,android.R.layout.simple_spinner_item);
        Verb79.setAdapter(adapter079);

        Verb80=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner080);
        ArrayAdapter<CharSequence>adapter080=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb80,android.R.layout.simple_spinner_item);
        Verb80.setAdapter(adapter080);

        Verb81=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner081);
        ArrayAdapter<CharSequence>adapter081=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb81,android.R.layout.simple_spinner_item);
        Verb81.setAdapter(adapter081);

        Verb82=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner082);
        ArrayAdapter<CharSequence>adapter082=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb82,android.R.layout.simple_spinner_item);
        Verb82.setAdapter(adapter082);

        Verb83=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner083);
        ArrayAdapter<CharSequence>adapter083=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb83,android.R.layout.simple_spinner_item);
        Verb83.setAdapter(adapter083);

        Verb84=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner084);
        ArrayAdapter<CharSequence>adapter084=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb84,android.R.layout.simple_spinner_item);
        Verb84.setAdapter(adapter084);

        Verb85=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner085);
        ArrayAdapter<CharSequence>adapter085=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb65,android.R.layout.simple_spinner_item);
        Verb85.setAdapter(adapter085);

        Verb86=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner086);
        ArrayAdapter<CharSequence>adapter086=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb86,android.R.layout.simple_spinner_item);
        Verb86.setAdapter(adapter086);

        Verb87=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner087);
        ArrayAdapter<CharSequence>adapter087=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb87,android.R.layout.simple_spinner_item);
        Verb87.setAdapter(adapter087);

        Verb88=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner088);
        ArrayAdapter<CharSequence>adapter088=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb88,android.R.layout.simple_spinner_item);
        Verb88.setAdapter(adapter088);

        Verb89=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner089);
        ArrayAdapter<CharSequence>adapter089=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb89,android.R.layout.simple_spinner_item);
        Verb89.setAdapter(adapter089);

        Verb90=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner090);
        ArrayAdapter<CharSequence>adapter090=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb90,android.R.layout.simple_spinner_item);
        Verb90.setAdapter(adapter090);


        Verb91=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner091);
        ArrayAdapter<CharSequence>adapter091=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb91,android.R.layout.simple_spinner_item);
        Verb91.setAdapter(adapter091);

        Verb92=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner092);
        ArrayAdapter<CharSequence> adapter092=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb92,android.R.layout.simple_spinner_item);
        Verb92.setAdapter(adapter092);

        Verb93=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner093);
        ArrayAdapter<CharSequence>adapter093=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb93,android.R.layout.simple_spinner_item);
        Verb93.setAdapter(adapter093);

        Verb94=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner094);
        ArrayAdapter<CharSequence>adapter094=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb94,android.R.layout.simple_spinner_item);
        Verb94.setAdapter(adapter094);



        Verb98=(Spinner) findViewById(apps.myapp.eze.ezenglish2.R.id.spinner098);
        ArrayAdapter<CharSequence>adapter098=ArrayAdapter.createFromResource(
                this, apps.myapp.eze.ezenglish2.R.array.Verb98,android.R.layout.simple_spinner_item);
        Verb98.setAdapter(adapter098);

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
