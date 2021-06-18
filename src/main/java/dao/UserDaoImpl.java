package dao;

import com.javacto.utils.BaseDao;
import com.javacto.utils.PageInfo;
import po.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao{
    @Override
    public int getTotalCount(User user) {
        int count=0;
        Connection connection= null;
        PreparedStatement preparedStatement =null;
        ResultSet resultSet =null;
        try{
            connection = BaseDao.getConnection();
            String sql="select count(*)from blog_USER ";
            preparedStatement=connection.prepareStatement(sql);
            resultSet =preparedStatement.executeQuery();
            while (resultSet.next()){
                count=resultSet.getInt(1);
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            BaseDao.Closeall(connection,preparedStatement,resultSet);
        }
        return count;
    }

    @Override
    public List<User> getPageUser(PageInfo pageInfo, User user) {
        List<User> list=new ArrayList<User>();
        Connection conn= null;
        PreparedStatement pstm =null;
        ResultSet rs =null;
        try{
            conn = BaseDao.getConnection();
            String sql="select * from blog_USER LIMIT ?,?";
            // begin （pageNo-1）*pageSize     pageSize
            int begin=(pageInfo.getPageNo()-1)*pageInfo.getPageSize();
            int end=pageInfo.getPageSize();
            pstm =conn.prepareStatement(sql);
            pstm.setObject(1,begin);
            pstm.setObject(2,end);
            rs =pstm.executeQuery();
            while (rs.next()){
                User user1=new User();
                user1.setBuUserId(rs.getInt(1));
                user1.setBuEmail(rs.getString(2));
                user1.setBuUserName(rs.getString(3));
                user1.setBuPassword(rs.getString(4));
                user1.setBuSex(rs.getString(5));
                user1.setBuBirthday(rs.getDate(6));
                user1.setBuIdentityCode(rs.getString(7));
                user1.setBuMobile(rs.getString(8));
                user1.setBuCreateTime(rs.getDate(9));
                user1.setBuCreateUser(rs.getDate(10));
                user1.setBuUpdateTime(rs.getDate(11));
                user1.setBuUpdateUser(rs.getString(12));
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            BaseDao.Closeall(conn,pstm,rs);
        }
        return list;
    }
}
