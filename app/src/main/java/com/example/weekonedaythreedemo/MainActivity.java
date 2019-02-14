package com.example.weekonedaythreedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, TextWatcher, View.OnLongClickListener {

    TextView tvFristName;
    TextView tvLastName;
    EditText etFristName;
    EditText etLastName;
    Button btnDisplayName;
    Button btnClearName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvFristName = (TextView)findViewById(R.id.tvFirstNameDisplay);

        tvLastName = findViewById(R.id.tvLastNameDisplay);
        etFristName = findViewById(R.id.etFristNameInput);
        etLastName = findViewById(R.id.etLastNameInput);
        btnDisplayName = findViewById(R.id.btnSendName);
        btnClearName = findViewById(R.id.btnClearName);
        etFristName.addTextChangedListener(this);
        etLastName.addTextChangedListener(this);

        //btnDisplayName.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {


    }

    public void onButtonClickHandler(View view) {
        switch (view.getId()){
            case R.id.btnSendName:
                String firstName = etFristName.getText().toString() != null ? etFristName.getText().toString():"";
                String lastName = etLastName.getText().toString();
                tvFristName.setText(firstName);
                tvLastName.setText(lastName);

                break;

            case R.id.btnClearName:
                tvFristName.setText("");
                tvLastName.setText("");

                    break;

            }
    }


    @Override
    public boolean onLongClick(View v) {
        Toast.makeText(this,"LONG CLICK", Toast.LENGTH_LONG).show();
        return false;
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @Override
    public void afterTextChanged(Editable s) {
        Toast.makeText(this,"String Len")

    }
}
