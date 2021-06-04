package cn.hyperchain;

/**
 * @author zhupeng
 * @Date 2021/6/4 11:05 上午
 */

public class User {
    private String username;
    private int userage;

    public User(String username, int userage) {
        this.username = username;
        this.userage = userage;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getUserage() {
        return userage;
    }

    public void setUserage(int userage) {
        this.userage = userage;
    }
}
