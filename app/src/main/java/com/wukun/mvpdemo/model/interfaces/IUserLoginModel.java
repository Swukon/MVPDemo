package com.wukun.mvpdemo.model.interfaces;
/*
 *  @项目名：  MVPDemo 
 *  @包名：    com.wukun.mvpdemo.model.module
 *  @文件名:   IUserLoginModel
 *  @创建者:   卡卡洛特
 *  @创建时间:  2017/2/13 22:03
 *  @描述：   登录业务
 */

public interface IUserLoginModel {
  /**登录业务方法*/
  void login(String name, String passworld,OnUserLoginListener listener);
}
