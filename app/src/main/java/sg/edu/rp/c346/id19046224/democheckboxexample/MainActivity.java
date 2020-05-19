package sg.edu.rp.c346.id19046224.democheckboxexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnDisplay;
    CheckBox boxDiscount;
    TextView tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDisplay = findViewById(R.id.button);
        boxDiscount = findViewById(R.id.checkBox);
        tvDisplay = findViewById(R.id.textView);

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Button Click", Toast.LENGTH_LONG);

                if(boxDiscount.isChecked()){
                    tvDisplay.setText("The discount is given.");
                }
                else{
                    tvDisplay.setText("The discount is not given");
                }


            }
        });
    }
}
