package apps.myapp.eze.ezenglish2.menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AboutUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(apps.myapp.eze.ezenglish2.R.layout.activity_about_us);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
