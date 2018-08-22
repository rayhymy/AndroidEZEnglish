package apps.myapp.eze.ezenglish2.home;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import apps.myapp.eze.ezenglish2.grammar.lesson1.GrammarLessonIMainActivity;
import apps.myapp.eze.ezenglish2.grammar.lesson2.GrammarLessonIIMainActivity;
import apps.myapp.eze.ezenglish2.grammar.lesson3.GrammarLessonIIIMainActivity;

public class GrammarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(apps.myapp.eze.ezenglish2.R.layout.activity_grammar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void grammarDisplayLessonI(View view){
        Intent lessonI = new Intent(this,GrammarLessonIMainActivity.class);
        startActivity(lessonI);
    }
    public void grammarDisplayLessonII(View view){
        Intent lessonI = new Intent(this,GrammarLessonIIMainActivity.class);
        startActivity(lessonI);
    }
    public void grammarDisplayLessonIII(View view){
        Intent lessonI = new Intent(this,GrammarLessonIIIMainActivity.class);
        startActivity(lessonI);
    }
}
