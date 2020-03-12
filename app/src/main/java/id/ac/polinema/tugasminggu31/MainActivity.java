package id.ac.polinema.tugasminggu31;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

        public class MainActivity extends AppCompatActivity {

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);

                final EditText inputText = (EditText)findViewById(R.id.inputNama);
                Button proses = (Button)findViewById(R.id.button1);
                final EditText tampilText = (EditText)findViewById(R.id.hasil);
                final RadioGroup JK = (RadioGroup) findViewById(R.id.jk);

        proses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = inputText.getText().toString();
                tampilText.setText(input);

                if (JK.getCheckedRadioButtonId() == R.id.laki) {
                    tampilText.setText("Mas " + inputText.getText().toString() + " Kamu ganteng");
                } else {
                    tampilText.setText("Mbk " + inputText.getText().toString() + " Kamu cantik");
                }

            }

        });
}
}
