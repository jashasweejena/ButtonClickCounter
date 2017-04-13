package test.example.buttonclickcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {

    private EditText userInput;
    private Button button;
    private TextView textView;
    private int buttonClick;
    private String xyz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userInput = (EditText) findViewById(R.id.editText);
        button = (Button) findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.textView);
        textView.setText("\b \b");
        textView.setMovementMethod(new ScrollingMovementMethod());


        View.OnClickListener ourOnclickListener = new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                buttonClick++;
                String s =  "\nButton has been clicked for " + buttonClick + " time";
               // String p =  "\nButton has been clicked for " + buttonClick + " times"

                if(buttonClick>1)
                    s+="s";

                s+="\n ";

                textView.append(s);


            }


        };
        button.setOnClickListener(ourOnclickListener);
    }





}