package org.spartaglobal.mb;

public class App {
    public static void main(String[] args) {

        JsonToObject jsonToObject = new JsonToObject();
        System.out.println(jsonToObject.byCityName("colombo").getSys().getCountry());
    }
}
