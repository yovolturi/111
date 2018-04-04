package sdu.cs58.watanyu.testlogin;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView usernameTextView;
    String getusernameString;
    Button clickLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameTextView = findViewById(R.id.txvName);
        getusernameString = getIntent().getStringExtra("userString");
        usernameTextView.setText("ยินดีต้อนรับ"+getusernameString);
    }

    ///public void clickLink(View view) {
     ///   Intent linkIntent = new Intent(Intent.ACTION_VIEW);
      //  linkIntent.setData(Uri.parse("https://www.facebook.com/yo.ouammiang"));
        ////startActivity(linkIntent);}///end clicklink method


    public void clicklink(View view) {
        Intent linkIntent = new Intent(Intent.ACTION_VIEW);
        linkIntent.setData(Uri.parse("https://www.facebook.com/yo.ouammiang"));
        startActivity(linkIntent);
    }
}
