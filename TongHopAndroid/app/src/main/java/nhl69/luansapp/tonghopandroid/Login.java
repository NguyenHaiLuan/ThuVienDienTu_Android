package nhl69.luansapp.tonghopandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class Login extends AppCompatActivity {
    private Button loginbtn, createbtn;
    private CheckBox showcb;
    private EditText pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginbtn = (Button) findViewById(R.id.loginbtn);
        createbtn = (Button) findViewById(R.id.btncreate);
        showcb = (CheckBox) findViewById(R.id.cbshowp);
        pass = (EditText) findViewById(R.id.pass);

        createbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(Login.this, SignUp.class);
                startActivity(intent);
            }
        });

        showcb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(showcb.isChecked())
                    pass.setTransformationMethod(null);
                else
                    pass.setTransformationMethod(new PasswordTransformationMethod());
            }
        });

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(Login.this, List.class);
                startActivity(intent);
            }
        });
    }
}