package com.javacto.action;

import com.javacto.po.User;
import com.javacto.service.UserService;
import com.javacto.service.UserServiceImpl;
import com.javacto.utils.PageInfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
@WebServlet("/QueryUserPage.do")
public class UserQueryAction  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //处理请求编码格式
        req.setCharacterEncoding("UTF-8");
        //处理响应编码格式
        resp.setContentType("text/html;charset=UTF-8");
        //获取当前页
        String strpageNo = req.getParameter("pageNo");
        //这里必须先判断strpageNo是否为空
        Integer pageNo=1;
        if (null!=strpageNo){
            //不为空则复制
            pageNo =Integer.parseInt(strpageNo);
        }
        //1.把结果存入对象中
        PageInfo pageInfo=new PageInfo();
        pageInfo.setPageNo(pageNo);
        pageInfo.setPageSize(2);
        //2.创建业务层代码
        UserService userService = new UserServiceImpl();
        //3.调用查询方法
        List<User> list = userService.getPageUser(pageInfo,null);
        //4.查询总条数
        int count =userService.getTotalCount(null);
        //5.必须把总条数存入infor中
        pageInfo.setTotalCount(count);
        //6.把结果存在HttpServletRequest对象里面
        req.setAttribute("list", list);
        //7.必须把infort对象也存入对象中
        req.setAttribute("page",pageInfo);
        //req.setAttribute("随便定义变量名",必须是上面的变量名);
        //4.跳转到jsp
        req.getRequestDispatcher("/manage/user.jsp").forward(req, resp);
    }
}
