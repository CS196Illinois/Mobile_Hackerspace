package cs196.week1application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText input;
    TextView firstTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstTextView = (TextView) findViewById(R.id.firstTextView);
        Button firstButton = (Button) findViewById(R.id.firstButton);
        input = (EditText) findViewById(R.id.edit_text_1);

        firstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = input.getText().toString();
                firstTextView.setText(text);
            }
        });
    }
}
