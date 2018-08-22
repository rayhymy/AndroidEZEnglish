package apps.myapp.eze.ezenglish2.listen;

import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.Locale;

public class ListeningPracticeTTS extends AppCompatActivity {

    private TextToSpeech mTTS;
    private EditText mEditText;
    private ImageView mImagelisten;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(apps.myapp.eze.ezenglish2.R.layout.activity_listening_practice_tts);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mTTS = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status == TextToSpeech.SUCCESS) {
                    int result = mTTS.setLanguage(Locale.ENGLISH);

                    if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                        Log.e("TTS", "Language not supported");
                    }
                } else {
                    Log.e("TTS", "Initialization failes");
                }

            }
        });

        mEditText = findViewById(apps.myapp.eze.ezenglish2.R.id.edit_text_tts);
    }
    public void speak(View view) {
        String text = mEditText.getText().toString();

        mTTS.speak(text, TextToSpeech.QUEUE_FLUSH, null);
    }
}
