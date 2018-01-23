package lessons.lesson7.json;

import com.alibaba.fastjson.JSON;
import lessons.lesson7.json.entity.Group;
import lessons.lesson7.json.entity.User;

import java.util.ArrayList;

public class AdvancedJsonExample {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList();
        users.add(new User("Tom", User.Gender.male, 50));
        users.add(new User("Marge", User.Gender.female, 30));
        users.add(new User("Mike", User.Gender.male, 10));

        Group group = new Group("Basketball team", "bla bla bla", users);

        String json = JSON.toJSONString(group);
        System.out.println(json);

        Group groupClone = JSON.parseObject(json, Group.class);
        System.out.println(groupClone);
    }
}
