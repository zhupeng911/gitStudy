package cn.hyperchain.entity;

/**
 * @author zhupeng
 * @Date 2021/6/4 11:39 上午
 */
public class User {
    private int userid;
    private String username;

    public User(int userid, String username) {
        this.userid = userid;
        this.username = username;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
