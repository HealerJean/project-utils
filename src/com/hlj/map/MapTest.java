package com.hlj.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @Desc:
 * @Author HealerJean
 * @Date 2018/8/9  ÉÏÎç11:57.
 */
public class MapTest {


    public static Map<Long,Long> getStartIdAndEndId(Long count, Long fenduan){
        Map<Long,Long> map = new HashMap<>();
        Long num = count / fenduan;
        Long yushu = count % fenduan;

        for (int i = 1; i <= num; i++) {
            map.put((i - 1) * fenduan + 1, i * fenduan);
        }

        Long yushufinal = num * fenduan + yushu;
        map.put(num * fenduan + 1, yushufinal);

        return map ;
    }


    public static void main(String[] args) {


        Map<Long, Long> tMapRever = new TreeMap<>(Collections.reverseOrder());
        tMapRever.putAll(getStartIdAndEndId(31L,3L));


        for(Long key :tMapRever.keySet() ){
            System.out.println("key:"+key+":"+tMapRever.get(key));
        }
    }
}
