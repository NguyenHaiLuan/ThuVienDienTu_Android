package nhl69.luansapp.tonghopandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUp extends AppCompatActivity {
    private Button backbtn, signupbtn;
    private EditText unameli, unamesu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        backbtn = (Button) findViewById(R.id.btnback);
        signupbtn = (Button) findViewById(R.id.btnsignup);
        unameli = (EditText) findViewById(R.id.username);
        unamesu = (EditText) findViewById(R.id.unamein);

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        signupbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(SignUp.this, Login.class);
                startActivity(intent);
            }
        });
    }
}