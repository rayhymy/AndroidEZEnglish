package apps.myapp.eze.ezenglish2.menu;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import apps.myapp.eze.ezenglish2.login.LoginActivity;
import apps.myapp.eze.ezenglish2.main.MainActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class ChangePasswordPopUp extends Activity {
    EditText editText;
    private ProgressDialog dialog;
    private FirebaseAuth auth;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(apps.myapp.eze.ezenglish2.R.layout.change_password_pop_up);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width*.8),(int)(height*.6));

        editText = findViewById(apps.myapp.eze.ezenglish2.R.id.password);
        dialog = new ProgressDialog(this);
        auth = FirebaseAuth.getInstance();
    }
    public void back_to_main_activity (View view){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
        finish();
    }

    public void changePassword(View view){
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        if (user!=null){
            dialog.setMessage("Changing your password...");
            dialog.show();
            user.updatePassword(editText.getText().toString()).addOnCompleteListener(new OnCompleteListener<Void>() {
                @Override
                public void onComplete(@NonNull Task<Void> task) {
                    if (task.isSuccessful()){
                        dialog.dismiss();
                        Toast.makeText(getApplicationContext(), "Your password have been changed successfully", Toast.LENGTH_LONG).show();
                        finish();
                        Intent intent = new Intent(ChangePasswordPopUp.this, LoginActivity.class);
                        startActivity(intent);
                    }else {
                        dialog.dismiss();
                        Toast.makeText(getApplicationContext(), "Your password could not be changed, " +
                                "check your network connection" +
                                "If the problem persist logout and do it again", Toast.LENGTH_LONG).show();
                    }

                }
            });
        }
    }
}
