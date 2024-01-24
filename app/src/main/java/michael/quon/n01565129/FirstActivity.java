package michael.quon.n01565129;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.snackbar.Snackbar;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView viewText = findViewById(R.id.textView);
        String displayedText = viewText.getText().toString();

        Button submitbtn = findViewById(R.id.submitbtn);
        submitbtn.setOnClickListener(new View.OnClickListener() {



            @Override
            public void onClick(View view) {
                Toast.makeText(FirstActivity.this, viewText.getText(), Toast.LENGTH_LONG).show();
                // Switch to the SecondActivity
                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                intent.putExtra("name", displayedText);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        // Intercept the back press event and show Snackbar
        showSnackbar("Close App", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishAffinity(); // Close the application
            }
        });
    }

    private void showSnackbar(String actionText, View.OnClickListener clickListener) {
        // Display a Snackbar with the specified action
        Snackbar.make(findViewById(android.R.id.content), actionText, Snackbar.LENGTH_LONG)
                .setAction("Close", clickListener).show();
    }
}
