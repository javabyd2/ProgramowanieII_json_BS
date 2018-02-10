package com.sda.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sda.json.model.Item;
import com.sda.json.model.Order;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        Item item = new Item("mleko", "2", "Tesco");

        List<Item> itemList = Arrays.asList(item);

        Order order = new Order(itemList, 1);

        ObjectMapper mapper = new ObjectMapper();
        File filename = new File("order.json");
        filename.createNewFile();
        mapper.writeValue(filename, order);

    }

}
