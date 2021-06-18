package po;


import java.util.Date;

/**
 * 曾老师 javacto.ke.qq.com
 */
public class User {
    private  int buUserId;
    private  String buEmail;        //email
    private  String buUserName ;    //用户名
    private  String buPassword;     //密码
    private  String buSex;          //性别 1.男 2女 3未知
    private  Date buBirthday;      //生日
    private  String buIdentityCode; //身份证号
    private  String buMobile;        //电话
    private  Date  buCreateTime;  //创建时间
    private  Date  buCreateUser;  //创建人
    private  Date  buUpdateTime;  //修改时间
    private  String buUpdateUser;  //修改人
    private  int buStatus;       //用户权限状态，1普通用户  2管理员

    public User(int buUserId, String buEmail, String buUserName, String buPassword, String buSex, Date buBirthday, String buIdentityCode, String buMobile, Date buCreatetime, Date buCreateuser, Date buUpdatetime, String buUpdateuser, int buStatus) {
        this.buUserId = buUserId;
        this.buEmail = buEmail;
        this.buUserName = buUserName;
        this.buPassword = buPassword;
        this.buSex = buSex;
        this.buBirthday = buBirthday;
        this.buIdentityCode = buIdentityCode;
        this.buMobile = buMobile;
        this.buCreateTime = buCreatetime;
        this.buCreateUser = buCreateuser;
        this.buUpdateTime = buUpdatetime;
        this.buUpdateUser = buUpdateuser;
        this.buStatus = buStatus;
    }

    public User() {
    }

    public int getBuUserId() {
        return buUserId;
    }

    public void setBuUserId(int buUserId) {
        this.buUserId = buUserId;
    }

    public String getBuEmail() {
        return buEmail;
    }

    public void setBuEmail(String buEmail) {
        this.buEmail = buEmail;
    }

    public String getBuUserName() {
        return buUserName;
    }

    public void setBuUserName(String buUserName) {
        this.buUserName = buUserName;
    }

    public String getBuPassword() {
        return buPassword;
    }

    public void setBuPassword(String buPassword) {
        this.buPassword = buPassword;
    }

    public String getBuSex() {
        return buSex;
    }

    public void setBuSex(String buSex) {
        this.buSex = buSex;
    }

    public Date getBuBirthday() {
        return buBirthday;
    }

    public void setBuBirthday(Date buBirthday) {
        this.buBirthday = buBirthday;
    }

    public String getBuIdentityCode() {
        return buIdentityCode;
    }

    public void setBuIdentityCode(String buIdentityCode) {
        this.buIdentityCode = buIdentityCode;
    }

    public String getBuMobile() {
        return buMobile;
    }

    public void setBuMobile(String buMobile) {
        this.buMobile = buMobile;
    }


    public Date getBuCreateTime() {
        return buCreateTime;
    }

    public void setBuCreateTime(Date buCreateTime) {
        this.buCreateTime = buCreateTime;
    }

    public Date getBuCreateUser() {
        return buCreateUser;
    }

    public void setBuCreateUser(Date buCreateUser) {
        this.buCreateUser = buCreateUser;
    }

    public Date getBuUpdateTime() {
        return buUpdateTime;
    }

    public void setBuUpdateTime(Date buUpdateTime) {
        this.buUpdateTime = buUpdateTime;
    }

    public String getBuUpdateUser() {
        return buUpdateUser;
    }

    public void setBuUpdateUser(String buUpdateUser) {
        this.buUpdateUser = buUpdateUser;
    }

    public int getBuStatus() {
        return buStatus;
    }

    public void setBuStatus(int buStatus) {
        this.buStatus = buStatus;
    }

    @Override
    public String toString() {
        return "User{" +
                "buUserId=" + buUserId +
                ", buEmail='" + buEmail + '\'' +
                ", buUserName='" + buUserName + '\'' +
                ", buPassword='" + buPassword + '\'' +
                ", buSex='" + buSex + '\'' +
                ", buBirthday=" + buBirthday +
                ", buIdentityCode='" + buIdentityCode + '\'' +
                ", buMobile='" + buMobile + '\'' +
                ", buCreateTime=" + buCreateTime +
                ", buCreateUser=" + buCreateUser +
                ", buUpdateTime=" + buUpdateTime +
                ", buUpdateUser='" + buUpdateUser + '\'' +
                ", buStatus=" + buStatus +
                '}';
    }
}
