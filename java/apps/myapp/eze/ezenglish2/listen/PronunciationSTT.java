package apps.myapp.eze.ezenglish2.listen;

import android.content.Intent;
import android.speech.RecognizerIntent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Locale;

public class PronunciationSTT extends AppCompatActivity {

    private TextView mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(apps.myapp.eze.ezenglish2.R.layout.activity_pronunciation_stt);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mEditText = findViewById(apps.myapp.eze.ezenglish2.R.id.edit_text_pronunciation_stt);
    }

    public void getSpeechInput(View view) {

        Intent intent = new Intent (RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra (RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent.putExtra (RecognizerIntent.EXTRA_LANGUAGE, Locale.ENGLISH);

        if (intent.resolveActivity (getPackageManager ()) !=null) {
            startActivityForResult (intent, 10);
        }else{
            Toast.makeText (this, "Your device dont support speech input", Toast.LENGTH_SHORT).show ();
        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult (requestCode, resultCode, data);

        switch (requestCode){
            case 10:
                if (resultCode == RESULT_OK && data !=null){
                    ArrayList<String> result = data.getStringArrayListExtra (RecognizerIntent.EXTRA_RESULTS);
                    mEditText.setText (result.get (0));
                }
                break;
        }
    }

}
