package apps.myapp.eze.ezenglish2.vocabulary.verbs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class VerbsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(apps.myapp.eze.ezenglish2.R.layout.activity_verbs);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void displayLessonI (View view){
        Intent lessonI = new Intent(this,Lesson1Content.class);
        startActivity(lessonI);
    }
    public void displayLessonII (View view){
        Intent lessonII = new Intent(this,Lesson2Content.class);
        startActivity(lessonII);
    }
    public void displayLessonIII (View view){
        Intent lessonIII = new Intent(this,Lesson3Content.class);
        startActivity(lessonIII);
    }
}
