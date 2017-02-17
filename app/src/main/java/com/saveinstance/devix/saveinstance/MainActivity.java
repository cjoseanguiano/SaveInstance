package com.saveinstance.devix.saveinstance;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
///Todo: http://stackoverflow.com/questions/151777/saving-android-activity-state
public class MainActivity extends AppCompatActivity {
private EditText editText;
    private EditText editTextB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText)findViewById(R.id.edt);
        editText = (EditText)findViewById(R.id.edtB);
        if (savedInstanceState != null){
            editText.setText("Hola Mundo");
        }

    }
  
    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i("Instance state","onSaveInstanceState");
        outState.putString("thisKey","HolaA");
        outState.putString("thisSecond","HolaB");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i("Instance state","onRestoreInstanceState");
        String myString = savedInstanceState.getString("thisKey");
        String second = savedInstanceState.getString("thisSecond");
    }
}
