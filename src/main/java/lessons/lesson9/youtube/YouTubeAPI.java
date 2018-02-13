package lessons.lesson9.youtube;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.ObjectMapper;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import lessons.lesson9.youtube.entity.Item;
import lessons.lesson9.youtube.entity.ResponseSearch;
import lessons.lesson9.youtube.entity.SnippetVideo;

public class YouTubeAPI {
    public static final String API_KEY = "AIzaSyCIOjc3j4xAnhLXezIEh38d0KMzc6xFVho";

    public static final ObjectMapper mapper = new ObjectMapper() {
        public <T> T readValue(String value, Class<T> valueType) {
            return JSON.parseObject(value, valueType);
        }

        public String writeValue(Object value) {
            return JSON.toJSONString(value);
        }
    };
    static {
        System.out.println("Unirest Object Mapper initialization");
        Unirest.setObjectMapper(mapper);
    }

    public static ResponseSearch search(String query, int maxResults) throws UnirestException {
        HttpResponse<ResponseSearch> response = Unirest.get("https://www.googleapis.com/youtube/v3/search")
                .queryString("key", API_KEY)
                .queryString("part", "snippet")
                .queryString("maxResults", maxResults)
                .queryString("q", query)
                .asObject(ResponseSearch.class);

        return response.getBody();

        // String json = response.getBody();
        // System.out.println(json);
        // return JSON.parseObject(json, new TypeReference<ResponseSearch<Item<SnippetVideo>>>() {});
    }
}
