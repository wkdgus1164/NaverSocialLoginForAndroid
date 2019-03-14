package com.example.naversocialloginforandroid;

/**
 * @author 한장현
 * @date 2019.03.14
 * @desc Main activity for naver login
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.nhn.android.naverlogin.OAuthLoginHandler;
import com.nhn.android.naverlogin.ui.view.OAuthLoginButton;

public class MainActivity extends AppCompatActivity {
    private final String NAVER_OAUTH_CLIENT_ID = "NYphpGskR2rd2L_3Godd";
    private final String NAVER_OAUTH_CLIENT_SECRET = "rsXvCjcdBt";
    private final String NAVER_OAUTH_CLIENT_NAME = "TestApplication";

    OAuthLoginButton mOAuthLoginButton;
    OAuthLoginHandler mOAuthLoginHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mOAuthLoginButton = (OAuthLoginButton) findViewById(R.id.btn_naverlogin);
        mOAuthLoginButton.setOAuthLoginHandler(mOAuthLoginHandler);
    }
}
