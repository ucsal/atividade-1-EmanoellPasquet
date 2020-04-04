package br.com.mariojp.exercise1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String INPUT = "INPUT";
    private TextView userInput, userOutput;
    private String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userInput = findViewById(R.id.editNome);
        userOutput = findViewById(R.id.labelMensagem);
        if (savedInstanceState != null){
            message = savedInstanceState.getString(INPUT);
            userOutput.setText("Hello, "+message+"!");
        }
    }
    public void actionBTN(View v){
        message = userInput.getText().toString();
        userOutput.setText("Hello, "+message+"!");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putString(INPUT, message);
        super.onSaveInstanceState(outState);
    }
}