package lessons.lesson7.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import lessons.lesson7.json.entity.DogEntity;
import lessons.lesson7.json.entity.Node;
import lessons.lesson7.json.entity.User;

import java.util.ArrayList;
import java.util.List;

public class GenericJsonExample {
    public static void main(String[] args) {
        ArrayList<Node<User>> nodes = new ArrayList<>();

        nodes.add(new Node<>(
                        new User("Agent 007", User.Gender.male, 40),
                        "best agent"));
        nodes.add(new Node<>(
                new User("Agent 008", User.Gender.male, 35),
                "the agent"));

        String json = JSON.toJSONString(nodes);
        System.out.println(json);


        ArrayList<Node<DogEntity>> nodes2 = new ArrayList<>();
        nodes2.add(new Node<>(new DogEntity("bobik", 5), "the best dog"));
        nodes2.add(new Node<>(new DogEntity("sharik", 3), "the dog"));

        String json2 = JSON.toJSONString(nodes2);
        System.out.println(json2);

        // ArrayList<Node<User>> nodesClone = JSON.parseArray(json, Node<User>.getClass());

    }
}
