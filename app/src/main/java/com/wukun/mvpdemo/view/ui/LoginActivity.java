package com.wukun.mvpdemo.view.ui;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.wukun.mvpdemo.R;
import com.wukun.mvpdemo.presenter.UserLoginPresenter;
import com.wukun.mvpdemo.view.interfaces.IUserLoginView;

public class LoginActivity extends AppCompatActivity
    implements IUserLoginView, View.OnClickListener {

  private EditText mUsename;
  private EditText mPassworld;
  private Button mLogin;
  private ProgressDialog mProgressDialog;
  private UserLoginPresenter mPresenter;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_login);
    mUsename = (EditText) findViewById(R.id.et_username);
    mPassworld = (EditText) findViewById(R.id.et_password);
    mLogin = (Button) findViewById(R.id.bt_login);
    mProgressDialog = new ProgressDialog(LoginActivity.this);
    mPresenter = new UserLoginPresenter(this);
    mLogin.setOnClickListener(this);
  }

  @Override public String getUserName() {
    return mUsename.getText().toString().trim();
  }

  @Override public String getePassWorld() {
    return mPassworld.getText().toString().trim();
  }

  @Override public void ShowProgressDialog() {
    mProgressDialog.show();
  }

  @Override public void HintProgressDialog() {
    mProgressDialog.dismiss();
  }

  @Override public void GotoMainActivity() {
    runOnUiThread(new Runnable() {
      @Override public void run() {
        Toast.makeText(LoginActivity.this, "登录成功", Toast.LENGTH_LONG).show();
      }
    });

  }

  @Override public void loginError() {
    runOnUiThread(new Runnable() {
      @Override public void run() {
        Toast.makeText(LoginActivity.this, "账户或密码错误", Toast.LENGTH_LONG).show();
      }
    });
  }

  @Override public void onClick(View view) {
    mPresenter.login();
  }
}
