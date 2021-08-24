package searx.app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.lang.annotation.Target;

public class MainActivity extends AppCompatActivity {
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
    }

    @Override
    public void onBackPressed() {
        if (Web.canGoBack())
            Web.goBack();
        else
            super.onBackPressed();
    }
}