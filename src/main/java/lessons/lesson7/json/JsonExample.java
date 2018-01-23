package lessons.lesson7.json;

import com.alibaba.fastjson.JSON;
import lessons.lesson7.json.entity.DogEntity;

public class JsonExample {

    static String serializeObject(DogEntity dog) {
        String json = JSON.toJSONString(dog);
        System.out.println(json);
        return json;
    }

    static DogEntity parseFromJson(String json) {
        DogEntity dog = JSON.parseObject(json, DogEntity.class);
        return dog;
    }

    public static void main(String[] args) {
        String json = serializeObject(new DogEntity("Bobik", 3));

        DogEntity dog = parseFromJson(json);

        System.out.println(dog);
    }
}
