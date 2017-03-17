package com.wukun.mvpdemo.model.bean;
/*
 *  @项目名：  MVPDemo 
 *  @包名：    com.wukun.mvpdemo.model
 *  @文件名:   User
 *  @创建者:   卡卡洛特
 *  @创建时间:  2017/2/13 21:00
 *  @描述：    登录的用户类
 */

public class User {
  private String name;//账户
  private String passworld;//密码

  public User(String name, String passworld) {
    this.name = name;
    this.passworld = passworld;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPassworld(String passworld) {
    this.passworld = passworld;
  }

  public String getName() {

    return name;
  }

  public String getPassworld() {
    return passworld;
  }
}
