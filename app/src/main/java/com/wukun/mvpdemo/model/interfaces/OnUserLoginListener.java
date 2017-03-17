package com.wukun.mvpdemo.model.interfaces;/*
 *  @项目名：  MVPDemo 
 *  @包名：    com.wukun.mvpdemo.model.interfaces
 *  @文件名:   OnUserLoginListener
 *  @创建者:   卡卡洛特
 *  @创建时间:  2017/2/13 22:16
 *  @描述：   登录回调接口
 */

public interface OnUserLoginListener {
  //登录成功的回调
  void loginSuccess();
  //登录失败的回调
  void loginFailed();
}
