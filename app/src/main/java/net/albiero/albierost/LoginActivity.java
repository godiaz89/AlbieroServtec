package net.albiero.albierost;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import com.github.johnpersano.supertoasts.library.*;


public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }


    public static final String[] CREDENTIALS=new String[]{
            "GDIAZ","123456"
    };


    public  void login(View vista){
        Intent intent=new Intent(this, StActivity.class);
        if(attempLogin(vista)){
            startActivity(intent);
        }
    }


    protected boolean attempLogin(View vista){
        EditText vUser=(EditText)findViewById(R.id.userText);
        EditText vPass=(EditText)findViewById(R.id.passText);

        if(!isUserValid(vUser) || !isPassValid(vPass)){
            SuperActivityToast superActivityToast = new SuperActivityToast(this);
            superActivityToast.setText("Usuario o contraseña no cumplen politicas de seguridad");
            superActivityToast.setDuration(1000);
            superActivityToast.setColor(Color.RED);
            superActivityToast.setTextColor(Color.WHITE);
            superActivityToast.setTouchToDismiss(true);
            superActivityToast.show();
            return false;
        }
        if(!vUser.getText().toString().equals(CREDENTIALS[0]) || !vPass.getText().toString().equals(CREDENTIALS[1])){
            SuperActivityToast supToast = new SuperActivityToast(this);
            supToast.setText("Usuario o Contraseña incorrectos");
            supToast.setDuration(1000);
            supToast.setColor(Color.RED);
            supToast.setTextColor(Color.WHITE);
            supToast.setTouchToDismiss(true);
            supToast.show();
            return false;
        }

        return true;
    }


    protected  boolean isUserValid(EditText user){
        if(user.getText().toString().length()<20) {
            return true;
        }
        else return false;
    }



    protected  boolean isPassValid(EditText pass){
        if (pass.getText().toString().length()<6){
            return false;
        }return true;
    }
}
