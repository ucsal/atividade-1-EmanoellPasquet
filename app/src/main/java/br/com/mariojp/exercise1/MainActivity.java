package br.com.mariojp.exercise1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String INPUT = "INPUT";
    private TextView userInput, userOutput;
    private String labelMensagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userInput = findViewById(R.id.editNome);
        userOutput = findViewById(R.id.labelMensagem);
        if (savedInstanceState != null){
            labelMensagem = savedInstanceState.getString(INPUT);
            userOutput.setText("Alô, "+labelMensagem+"!");
        }
    }
    public void actionBTN(View v){
        labelMensagem = userInput.getText().toString();
        userOutput.setText("Alô, "+labelMensagem+"!");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putString(INPUT, labelMensagem);
        super.onSaveInstanceState(outState);
    }
}