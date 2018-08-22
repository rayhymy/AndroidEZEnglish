package apps.myapp.eze.ezenglish2.menu;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Toast;

import apps.myapp.eze.ezenglish2.login.LoginActivity;
import apps.myapp.eze.ezenglish2.main.MainActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class DeleteYourAccountPopUp extends Activity {

    private ProgressDialog dialog;
    private FirebaseAuth auth;
    private FirebaseUser user;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(apps.myapp.eze.ezenglish2.R.layout.delete_your_account_pop_up);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width*.6),(int)(height*.3));

        dialog = new ProgressDialog(this);

        FirebaseUser auth = FirebaseAuth.getInstance().getCurrentUser();
    }
    public void display_main_activity (View view){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
        finish();
    }

    public void deleteAccount(View view){
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        if (user!=null){
            dialog.setMessage("Deleting account...");
            dialog.show();
            user.delete().addOnCompleteListener(new OnCompleteListener<Void>() {
                @Override
                public void onComplete(@NonNull Task<Void> task) {
                    if (task.isSuccessful()){
                        dialog.dismiss();
                        Toast.makeText(getApplicationContext(), "Your account have been deleted successfully", Toast.LENGTH_SHORT).show();
                        finish();
                        Intent intent = new Intent(DeleteYourAccountPopUp.this, LoginActivity.class);
                        startActivity(intent);
                    }
                    else {
                        dialog.dismiss();
                        Toast.makeText(getApplicationContext(), "Your account could not be deleted, " +
                                "check your network connection", Toast.LENGTH_LONG).show();
                    }
                }
            });
        }
    }
}
