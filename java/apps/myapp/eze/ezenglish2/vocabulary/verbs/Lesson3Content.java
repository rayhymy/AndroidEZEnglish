package apps.myapp.eze.ezenglish2.vocabulary.verbs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Lesson3Content extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(apps.myapp.eze.ezenglish2.R.layout.activity_lesson3_content);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listView = (ListView) findViewById(apps.myapp.eze.ezenglish2.R.id.listViewId);

        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this, apps.myapp.eze.ezenglish2.R.array.array_lesson3,
                android.R.layout.simple_list_item_1);

        listView.setAdapter(adapter);
    }
}
