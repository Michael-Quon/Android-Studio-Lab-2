package michael.quon.n01565129;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.snackbar.Snackbar;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textView = findViewById(R.id.textView);
        String value = getIntent().getStringExtra("name");
        textView.setText(value);

        // Snackbar action to go back to the FirstActivity
        View parentLayout = findViewById(android.R.id.content);
        Snackbar.make(parentLayout, "Display Main Screen", Snackbar.LENGTH_LONG)
                .setAction("BACK", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(SecondActivity.this, FirstActivity.class);
                        startActivity(intent);
                    }
                })
                .setDuration(20000)
                .setActionTextColor(getResources().getColor(android.R.color.holo_red_light))
                .show();
    }
}
