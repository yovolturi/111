package sdu.cs58.watanyu.testlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    ///exp
    EditText usernameEditText, passwordEditText;
    Button loginButton;
    String userString, passString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usernameEditText = findViewById(R.id.txtUsername);
        passwordEditText = findViewById(R.id.txtPassword);
        loginButton = findViewById(R.id.btnLogin);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userString = usernameEditText.getText().toString().trim();
                passString = passwordEditText.getText().toString().trim();
                if ((userString.length() == 0) || (passString.length() == 0)) {
                    Toast.makeText(getApplicationContext(), "กรุณาใส่ข้อมูลให้ครบทุกช่อง", Toast.LENGTH_LONG).show();
                }


                if ((userString.equals("yoyo")) && (passString.equals("1234"))) {
                    Toast.makeText(getApplicationContext(), "login Success", Toast.LENGTH_LONG).show();

                    Intent mainIntent = new Intent(LoginActivity.this, MainActivity.class);
                    mainIntent.putExtra("userString", userString);
                    startActivity(mainIntent);
                }
                else {
                    Toast.makeText(getApplicationContext(), "password ไม่ถูกต้อง", Toast.LENGTH_LONG).show();
                }

                //userString = usernameEditText.getText().toString().trim();
                //Toast.makeText(getApplicationContext(), "ดีจ้าาา " + userString, Toast.LENGTH_SHORT).show();


            }
        });


    }

}
