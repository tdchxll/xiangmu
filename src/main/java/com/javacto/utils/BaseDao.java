package com.javacto.utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class BaseDao {
private static String driverName;
private static String url;
private static String userName;
private static String pwd;
  static {
       jdbc();
   }
private static void jdbc(){
    //这个方法只有一个目的，拿到db.properties 的信息 通过键获取值
    ///1.创建Properties
    Properties properties=new Properties();
    //2.拿到文件路径
    String path="db.properties";
    //3.通过输出流读取db.properties 中的信息 数据
    InputStream inputStream= BaseDao.class.getClassLoader().getResourceAsStream(path);
    try {
        //4.把读到到的数据 加载到Properties
        properties.load(inputStream);
    } catch (IOException e) {
        e.printStackTrace();
    }
    //5.通过键  获取值，值都在  Properties 对象中
    System.out.println(properties.get("driverName"));
    System.out.println(properties.get("url"));
    //赋值  大家必需通过
    System.out.println(properties.get("db.driverName")); //输出 有值了再赋值
    driverName=properties.getProperty("driverName");
    url=properties.getProperty("url");
    userName=properties.getProperty("userName");
    pwd=properties.getProperty("pwd");
    }
    public static Connection getConnection(){
        Connection connection=null;
        try {
            Class.forName(driverName);
            connection= DriverManager.getConnection(url,userName,pwd);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
    public static void Closeall(Connection connection, Statement statement, ResultSet resultSet){
        try {
            if (resultSet!=null){
                resultSet.close();
            }
            if (statement!=null){
                statement.close();
            }
            if (connection!=null){
            connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static int myExecuteUpdate(String sql,Object object[]){
    int i=0;
    Connection connection= BaseDao.getConnection();
    PreparedStatement preparedStatement=null;
        try {
            preparedStatement=connection.prepareStatement(sql);
            for (int i1=0;i1<object.length;i1++){
                preparedStatement.setObject(i1+1,object[i1]);
            }
            i=preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            BaseDao.Closeall(connection,preparedStatement,null);
        }
        return i;
    }




  /*  public static User myExecuteQuery(String sql,Object object[]){
    User user=null;
        ResultSet resultSet=null;
        Connection connection=BaseDao.getConnection();
        PreparedStatement preparedStatement=null;
        try {
            preparedStatement=connection.prepareStatement(sql);
            for (int i1=0;i1<object.length;i1++){
                preparedStatement.setObject(i1+1,object[i1]);
            }
            resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                user=new User();
                user.setUserid(resultSet.getInt(1));
                user.setUsername(resultSet.getString(2));
                user.setUserdate(resultSet.getDate(3));
                user.setUserage(resultSet.getInt(4));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            BaseDao.Closeall(connection,preparedStatement,resultSet);
        }
        return user;
    }*/
    //希望所有同学，每次创建新的工程，如果使用BaseDao, 请务必这样测试
    public static void main(String[] args) {
        System.out.println(BaseDao.getConnection());
    }

}
