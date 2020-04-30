package datastructurealgorithm.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UseListHashMap {

    public static void main(String[] args) {

        List<String> stateOfUSA = new ArrayList<>();
        stateOfUSA.add("NY");
        stateOfUSA.add("NJ");
        stateOfUSA.add("NC");
        stateOfUSA.add("VA");
        stateOfUSA.add("FL");

        List<String> stateOfCANADA = new ArrayList<>();
        stateOfCANADA.add("ON");
        stateOfCANADA.add("MONTREAL");
        stateOfCANADA.add("VANCOUVER");
        stateOfCANADA.add("CALGARY");
        stateOfCANADA.add("QUEBEC");

        List<String> stateOfUK = new ArrayList<>();
        stateOfUK.add("LONDON");
        stateOfUK.add("MANCHESTER");
        stateOfUK.add("LIVERPOOL");
        stateOfUK.add("BRISTOL");
        stateOfUK.add("CHESTMINSTER");

        Map<String, List<String>> stMap = new HashMap<>();
        stMap.put("USA", stateOfUSA);
        stMap.put("CANADA", stateOfCANADA);
        stMap.put("UK", stateOfUK);

        for (Map.Entry<String, List<String>> entry : stMap.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }


    }


}
