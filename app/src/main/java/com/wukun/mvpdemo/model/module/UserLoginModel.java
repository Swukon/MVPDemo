package com.wukun.mvpdemo.model.module;
/*
 *  @项目名：  MVPDemo 
 *  @包名：    com.wukun.mvpdemo.model.module
 *  @文件名:   UserLoginModel
 *  @创建者:   卡卡洛特
 *  @创建时间:  2017/2/13 22:05
 *  @描述：    登录业务具体实现
 */

import android.os.SystemClock;
import com.wukun.mvpdemo.model.interfaces.IUserLoginModel;
import com.wukun.mvpdemo.model.interfaces.OnUserLoginListener;

public class UserLoginModel implements IUserLoginModel{
  @Override public void login(final String name, final String passworld, final OnUserLoginListener listener) {
    //模拟网络请求
    new Thread(new Runnable() {
      @Override public void run() {
        SystemClock.sleep(5000);
        if ("aaa".equals(name)&&"123".equals(passworld)){
          listener.loginSuccess();
        }else {
          listener.loginFailed();
        }
      }
    }).start();
  }
}
