package searx.app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import java.lang.annotation.Target;

public class MainActivity extends AppCompatActivity {
    Button button3;
    Button button4;
    private WebView Web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Web = (WebView)findViewById(R.id.WebView);
        WebSettings ws = Web.getSettings();
        ws.setJavaScriptEnabled(true);
        Web.loadUrl("https://searx.bar/");
        Web.setWebViewClient(new WebViewClient());

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Web.loadUrl("https://searx.bar/");
            }
        });

        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        if (Web.canGoBack())
            Web.goBack();
        else
            super.onBackPressed();
    }
}