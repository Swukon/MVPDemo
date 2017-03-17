package com.wukun.mvpdemo.presenter;
/*
 *  @项目名：  MVPDemo 
 *  @包名：    com.wukun.mvpdemo.presenter
 *  @文件名:   UserLoginPresenter
 *  @创建者:   卡卡洛特
 *  @创建时间:  2017/2/13 22:02
 *  @描述：    MVP中的Presenter层
 * 1.Presenter起到桥梁作用，必须提供桥梁方法，比如我们登录桥梁方法
 * 2.既然起到桥梁作用，Presenter必须持有Model和View层对象,成员变量
 */

import com.wukun.mvpdemo.model.interfaces.IUserLoginModel;
import com.wukun.mvpdemo.model.interfaces.OnUserLoginListener;
import com.wukun.mvpdemo.model.module.UserLoginModel;
import com.wukun.mvpdemo.view.interfaces.IUserLoginView;

public class UserLoginPresenter implements OnUserLoginListener {
  private IUserLoginModel mUserLoginModel;
  private IUserLoginView mIUserLoginView;

  public UserLoginPresenter(IUserLoginView IUserLoginView) {
    mUserLoginModel = new UserLoginModel();
    mIUserLoginView = IUserLoginView;
  }
  /**
   * 登录桥梁方法
   */
  public void  login(){
    //显示进度条
    mIUserLoginView.ShowProgressDialog();
    //登录的业务逻辑实现

    mUserLoginModel.login(getUserName(),getPassWorld(),this);
  }

  private String getUserName() {
    return  mIUserLoginView.getUserName();
  }


  private String getPassWorld() {
    return  mIUserLoginView.getePassWorld();
  }

  @Override public void loginSuccess() {
     mIUserLoginView.HintProgressDialog();
     mIUserLoginView.GotoMainActivity();
  }

  @Override public void loginFailed() {
    mIUserLoginView.HintProgressDialog();
    mIUserLoginView.loginError();
  }
}

