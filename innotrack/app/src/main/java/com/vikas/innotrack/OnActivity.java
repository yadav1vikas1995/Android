package com.vikas.innotrack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Toast;

public class OnActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on);

    }

    @Override
    public boolean onKeyDown (int keyCode,
                              KeyEvent event) {

        // This is the center button for headphones
        if (event.getKeyCode() == KeyEvent.KEYCODE_HEADSETHOOK) {
                final Thread th=new Thread()
                {
                    @Override
                    public void run() {
                        super.run();
                        try {
                            sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }finally {
                            Intent i=new Intent(OnActivity.this,offActivity.class);
                            startActivity(i);
                            finish();
                        }
                    }
                };
                th.start();

                //Toast.makeText(this, "BUTTON on!", Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
