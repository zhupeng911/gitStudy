package cn.hyperchain;

import cn.hyperchain.entity.User;

/**
 * @author zhupeng
 * @Date 2021/6/4 11:41 上午
 */
public class Test {
    public static void main(String[] args) {
        User user=new User(23,"zhupeng");
        System.out.println("userid: "+user.getUserid());
        System.out.println("username: "+user.getUsername());
    }
}
