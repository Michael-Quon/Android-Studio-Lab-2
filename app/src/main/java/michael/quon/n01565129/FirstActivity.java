package michael.quon.n01565129;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button submitbtn;
        // initalizes button by finding it in the layout file
        submitbtn =(Button)findViewById(R.id.submitbtn);
        // creates the interaction of the button to be pressed
        submitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            // displays a toast with the text Michael Quon
                Toast.makeText(FirstActivity.this, "Michael Quon", Toast.LENGTH_LONG).show();
                // switches to the SecondActivity, the second screen
                Intent it= new Intent(FirstActivity.this, SecondActivity.class);
                startActivity(it);
            }
        });
    }
}