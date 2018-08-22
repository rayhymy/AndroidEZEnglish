package apps.myapp.eze.ezenglish2.home;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import apps.myapp.eze.ezenglish2.listen.ListeningPracticeTTS;
import apps.myapp.eze.ezenglish2.listen.PronunciationSTT;

public class ListeningActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(apps.myapp.eze.ezenglish2.R.layout.activity_listening);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void displayPronunciation (View view){
        Intent pro = new Intent(this,PronunciationSTT.class);
        startActivity(pro);
    }
    public void displayListeningPractice (View view){
        Intent pro = new Intent(this,ListeningPracticeTTS.class);
        startActivity(pro);
    }
}
