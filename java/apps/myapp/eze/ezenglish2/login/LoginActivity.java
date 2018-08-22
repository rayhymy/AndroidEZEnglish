package apps.myapp.eze.ezenglish2.login;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import apps.myapp.eze.ezenglish2.main.MainActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import com.google.firebase.auth.FirebaseUser;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{

    //Defining views
    private EditText textEmail;
    private EditText textPassword;
    private ImageView btnSignIn;
    private ImageView btnSignUp;
    private ProgressDialog progressDialog;

    //Declaring the firebase object
    private FirebaseAuth firebaseAuth;
    private FirebaseAuth.AuthStateListener firebaseAuthListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(apps.myapp.eze.ezenglish2.R.layout.activity_login);

        //Inicializing the FireBaseAuth object
        firebaseAuth = FirebaseAuth.getInstance();

        //Referencing the views

        //Working with the EditText
        textEmail = (EditText)findViewById(apps.myapp.eze.ezenglish2.R.id.txtEmail);
        textPassword = (EditText)findViewById(apps.myapp.eze.ezenglish2.R.id.txtPassword);

        //For the buttons
        btnSignIn = (ImageView) findViewById(apps.myapp.eze.ezenglish2.R.id.sign_in);
        btnSignUp = (ImageView) findViewById(apps.myapp.eze.ezenglish2.R.id.sign_up);

        //For the progressdailog
        progressDialog = new ProgressDialog(this);

        //Ataching listener to button
        btnSignIn.setOnClickListener(this);
        btnSignUp.setOnClickListener(this);

        firebaseAuthListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = firebaseAuth.getCurrentUser();
                if (user != null) {
                    setUserData(user);
                } else {
                    goLogInScreen();
                }
            }
        };

    }
    private void setUserData(FirebaseUser user) {
        textEmail.setText(user.getEmail());
        textPassword.setText(user.getUid());
    }

    private void goLogInScreen() {
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    public void sign_up (View view) {
        //Obtaining the Email and the password
        String email = textEmail.getText().toString().trim();
        String password = textPassword.getText().toString().trim();

        //Checking if the boxes are empty
        if (TextUtils.isEmpty(email)){
            Toast.makeText(this, apps.myapp.eze.ezenglish2.R.string.miss_email, Toast.LENGTH_LONG).show();
        }
        if (TextUtils.isEmpty(password)){
            Toast.makeText(this, apps.myapp.eze.ezenglish2.R.string.miss_password, Toast.LENGTH_LONG).show();
        }
        progressDialog.setMessage(getString(apps.myapp.eze.ezenglish2.R.string.progress_dialog_message));
        progressDialog.show();

        //Creating a new user
        firebaseAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                //Checking if success
                if (task.isSuccessful()){
                    Toast.makeText(LoginActivity.this, getString(apps.myapp.eze.ezenglish2.R.string.success_signup)+ textEmail.getText(), Toast.LENGTH_LONG).show();
                }else {
                    if (task.getException() instanceof FirebaseAuthUserCollisionException) {
                        Toast.makeText(LoginActivity.this, getString(apps.myapp.eze.ezenglish2.R.string.user_already_exist)+ textEmail.getText(), Toast.LENGTH_LONG).show();
                    }
                    else {
                        Toast.makeText(LoginActivity.this, apps.myapp.eze.ezenglish2.R.string.login_failed_advertisement, Toast.LENGTH_LONG).show();
                    }
                }
                progressDialog.dismiss();
            }
        });

    }
    public void sign_in (View view) {
        //Obtaining the Email and the password
        final String email = textEmail.getText().toString().trim();
        final String password = textPassword.getText().toString().trim();

        //Checking if the boxes are not empty
        if (TextUtils.isEmpty(email)){
            Toast.makeText(this, apps.myapp.eze.ezenglish2.R.string.miss_email, Toast.LENGTH_LONG).show();
        }
        if (TextUtils.isEmpty(password)){
            Toast.makeText(this, apps.myapp.eze.ezenglish2.R.string.miss_password, Toast.LENGTH_LONG).show();
        }
        progressDialog.setMessage(getString(apps.myapp.eze.ezenglish2.R.string.wait));
        progressDialog.show();

        //User Log In
        firebaseAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                //Checking if success
                if (task.isSuccessful()) {
                    Toast.makeText(LoginActivity.this, getString(apps.myapp.eze.ezenglish2.R.string.welcome) + textEmail.getText(), Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(getApplication(),MainActivity.class);
                    intent.putExtra(MainActivity.user, email);
                    startActivity(intent);
                } else {
                    Toast.makeText(LoginActivity.this, apps.myapp.eze.ezenglish2.R.string.login_failed_advertisement, Toast.LENGTH_LONG).show();
                }
                progressDialog.dismiss();
            }

        });
    }

    @Override
    public void onClick(View v) {
        //To control our buttons
        switch (v.getId()){
            case apps.myapp.eze.ezenglish2.R.id.sign_up:
                //Calling the sign_up method
                sign_up(v);
                break;
            case apps.myapp.eze.ezenglish2.R.id.sign_in:
                //Calling the sign_in method
                sign_in(v);
                break;
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        if (user!=null){
            goLogInScreen();
        }
    }
}
