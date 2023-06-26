package RegularExpresstion;

import CaseStudy1.model.Villa;

import java.util.LinkedHashMap;
import java.util.Set;

public class demo1 {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> demo = new LinkedHashMap<String, Integer>();
        demo.put("Ngaan", 1);
        demo.put("jgdhs", 2);
        demo.put("fkjhg", 3);
        demo.put("nls", 4);
//        Set<String> demoSet = demo.keySet();
//        for(String vd: demoSet){
//            System.out.println(demo.get(vd));
//        }
        Set<String> keySet = demo.keySet();
        for (String key : keySet) {
            System.out.println(key + " " + demo.get(key));
        }
    }

    }

