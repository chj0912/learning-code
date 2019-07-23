package com.chj.test16;

public class Test10 {
    String [] name1={"111"};
    String [] pwd1={"111"};

    public static void main(String[] args) {
        try {
            Test10 t=new Test10();
            int a=t.login("111","11");
            if(a==1){
                System.out.println("登录成功");
            }
        }catch (LoginException e){
            e.printStackTrace();
        }


    }

    public  int login(String name, String pwd)throws LoginException {
              if(!name1[0].equals(name)){
                  throw new LoginException("用户名错误");
              }else if(!pwd1[0].equals(pwd)){
                  throw new LoginException("密码错误");
              }else{
                  return 1;
              }

    }
}


class LoginException extends Exception {
    public LoginException() {
    }

    public LoginException(String message) {
        super(message);
    }
}
