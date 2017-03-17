package com.wukun.mvpdemo.view.interfaces;
/*
 *  @项目名：  MVPDemo 
 *  @包名：    com.wukun.mvpdemo.view.interfaces
 *  @文件名:   IUserLoginView
 *  @创建者:   卡卡洛特
 *  @创建时间:  2017/2/13 21:44
 *  @描述： 登录页面的View层接口
 *  1.有那些操作：获取用户名、获取密码
 *  2.有那些用户交互：显示ProgressDialog、隐藏ProgressDialog
 *  3.结果是什么：成功跳转主页，失败提示用户
 */

public interface IUserLoginView {
  /*
  获取用户名
   */
  String getUserName();
  /*
  获取密码
   */
  String getePassWorld();
  /*
    显示ProgressDialog
     */
  void ShowProgressDialog();
  /*
    隐藏ProgressDialog
     */
  void HintProgressDialog();
  /*
    登录成功跳转主页
     */
  void GotoMainActivity();
  /*
    登录失败toast提示
     */
  void loginError();

}
