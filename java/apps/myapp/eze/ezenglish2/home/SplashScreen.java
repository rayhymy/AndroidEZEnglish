package apps.myapp.eze.ezenglish2.home;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;

import apps.myapp.eze.ezenglish2.login.LoginActivity;
import apps.myapp.eze.ezenglish2.R;

public class SplashScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        },3000);
    }

}
