package co.com.cesarflorez87.misiontic.omiapp.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import co.com.cesarflorez87.misiontic.omiapp.R;
import co.com.cesarflorez87.misiontic.omiapp.mvp.MainMPV;
import co.com.cesarflorez87.misiontic.omiapp.view.dto.TareaActivity;

//import com.google.android.material.textfield.TextInputEditText;
//import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity implements MainMPV.View {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void irTarea(View view){
        Intent i = new Intent(this, TareaActivity.class);
        startActivity(i);
    }

}