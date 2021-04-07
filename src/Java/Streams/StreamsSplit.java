package Java.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsSplit {


    public static void main(String[] args) {
        List<String> unifiedIdList = new ArrayList<>();
        unifiedIdList.add("Afzal:111111111");
        unifiedIdList.add("Rizvi:222222222");
        unifiedIdList.add("Khan:3333333333");
        List<Long> idList = unifiedIdList.stream().map(id->id.split(":")[1]).map(Long::parseLong).collect(Collectors.toList());
        System.out.println(idList);
    }
}
