package com.luisfernandomgrs.learning.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Switch showNotification;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Usando Toast");
        // initialize objects
        showNotification = findViewById(R.id.showNotification);
    }

    public void showNotification(View eventView) {
        if (showNotification.isChecked()) {
            ImageView imageView = new ImageView(getApplicationContext());
            TextView textView = new TextView(getApplicationContext());
            Toast personalToast = new Toast(getApplicationContext());

            textView.setText("Uma mensagem personlida pra você!");

            textView.setBackgroundResource(R.color.teal_200);
            personalToast.setDuration(Toast.LENGTH_LONG);

            imageView.setImageResource(android.R.drawable.btn_star_big_on);

            //personalToast.setView(textView);
            personalToast.setView(imageView);

            personalToast.show();
        }
        else {
            Toast.makeText(getApplicationContext(), "Açào realizada com sucesso!", Toast.LENGTH_LONG).show();
        }
    }
}