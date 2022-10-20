package nhl69.luansapp.tonghopandroid;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.arch.core.executor.TaskExecutor;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class Begin extends AppCompatActivity {
    private ProgressBar progressBar;
    private Button btnbegin;
    private TextView pctext;
    private Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begin);

        progressBar = (ProgressBar) findViewById(R.id.startbar);
        pctext = (TextView) findViewById(R.id.percenttext);
        btnbegin = (Button) findViewById(R.id.beginbtn);

        btnbegin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CountDownTimer countDownTimer = new CountDownTimer(3300, 30) {
                    @Override
                    public void onTick(long l) {
                        int now = progressBar.getProgress();
                        progressBar.setProgress(now + 1);
                        pctext.setText("Đang tải: " + now + " %");
                    }

                    @Override
                    public void onFinish() {
                        Intent intent = new Intent();
                        intent.setClass(Begin.this, Login.class);
                        startActivity(intent);
                    }
                };
                countDownTimer.start();
            }
        });
    }
}
