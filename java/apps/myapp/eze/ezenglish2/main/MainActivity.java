package apps.myapp.eze.ezenglish2.main;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import apps.myapp.eze.ezenglish2.menu.ChangePasswordPopUp;
import apps.myapp.eze.ezenglish2.menu.AboutUs;
import apps.myapp.eze.ezenglish2.menu.DeleteYourAccountPopUp;
import apps.myapp.eze.ezenglish2.home.EvaluationActivity;
import apps.myapp.eze.ezenglish2.home.GrammarActivity;
import apps.myapp.eze.ezenglish2.home.ListeningActivity;
import apps.myapp.eze.ezenglish2.home.VocabularyActivity;
import apps.myapp.eze.ezenglish2.login.LoginActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    public static final String user="names";
    //TextView txtView;
    TextView textView;
    FirebaseUser email;
    FirebaseAuth auth;
    private ClipData.Item signOut;

    //Declaring the firebase object
    private FirebaseAuth firebaseAuth;
    private FirebaseAuth.AuthStateListener firebaseAuthListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(apps.myapp.eze.ezenglish2.R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(apps.myapp.eze.ezenglish2.R.id.toolbar);
        //setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(apps.myapp.eze.ezenglish2.R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, apps.myapp.eze.ezenglish2.R.string.navigation_drawer_open, apps.myapp.eze.ezenglish2.R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(apps.myapp.eze.ezenglish2.R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setItemIconTintList(null);


        //textView = (TextView)findViewById(R.id.user);
        //String user = getIntent().getStringExtra("names");
        //textView.setText(user);

        firebaseAuth = FirebaseAuth.getInstance();
        //textView = findViewById(R.id.user_email);

        //email = auth.getCurrentUser();
        //textView.setText(email.getEmail());

    }
    private void Logout (){
        firebaseAuth.signOut();
        finish();
        startActivity(new Intent(MainActivity.this, LoginActivity.class));
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(apps.myapp.eze.ezenglish2.R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(apps.myapp.eze.ezenglish2.R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId()){
            case apps.myapp.eze.ezenglish2.R.id.action_settings :{
                Logout();
            }
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == apps.myapp.eze.ezenglish2.R.id.nav_camera) {
            Intent i = new Intent(this,AboutUs.class);
            startActivity(i);

        } else if (id == apps.myapp.eze.ezenglish2.R.id.nav_share) {
            Intent i = new Intent(this,DeleteYourAccountPopUp.class);
            startActivity(i);
        } else if (id == apps.myapp.eze.ezenglish2.R.id.change_password) {
            Intent i = new Intent(this,ChangePasswordPopUp.class);
            startActivity(i);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(apps.myapp.eze.ezenglish2.R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    public void display_grammar (View view){
        Intent grammar = new Intent(this,GrammarActivity.class);
        startActivity(grammar);
    }

    public void display_vocabulary (View view){
        Intent vocabulary = new Intent(this,VocabularyActivity.class);
        startActivity(vocabulary);
    }

    public void display_listening (View view){
        Intent i = new Intent(this,ListeningActivity.class);
        startActivity(i);
    }
    public void display_evaluation (View view){
        Intent i = new Intent(this,EvaluationActivity.class);
        startActivity(i);
    }
}
