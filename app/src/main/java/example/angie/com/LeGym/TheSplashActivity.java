package example.angie.com.LeGym;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.dd.processbutton.iml.ActionProcessButton;

public class TheSplashActivity extends AppCompatActivity {

    ActionProcessButton loginbtn, signupbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Find views
        loginbtn = findViewById(R.id.button_login_splash);
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( TheSplashActivity.this, LogInActivity.class );
                startActivity( intent );
            }
        });

        signupbtn = findViewById(R.id.button_signup_splash);
        signupbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( TheSplashActivity.this, SignUpActivity.class );
                startActivity( intent );
            }
        });
    }

    @Override
    public void onBackPressed() {
        return;
    }
}
