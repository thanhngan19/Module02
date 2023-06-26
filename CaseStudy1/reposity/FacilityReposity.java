package CaseStudy1.reposity;

import CaseStudy1.model.House;
import CaseStudy1.model.Room;
import CaseStudy1.model.Villa;

import java.util.LinkedHashMap;

public class FacilityReposity implements IFacilityReposity{
    static LinkedHashMap <Villa,Integer>villa = new LinkedHashMap<>();
    static LinkedHashMap <House,Integer>house = new LinkedHashMap<>();
    static LinkedHashMap <Room,Integer>room = new LinkedHashMap<>();
    static int sizeVilla;
    static int sizeRoom;
    static int sizeHouse;
    static{
        Villa villa1 = new Villa("Villa", 300,10000,3,"năm","3 sao",300,2);
        Villa villa2 = new Villa("Villa", 300,10000,3,"năm","3 sao",300,2);
        Villa villa3 =new Villa("Villa", 300,10000,3,"năm","3 sao",300,2);
        Villa villa4 = new Villa("Villa", 300,10000,3,"năm","3 sao",300,2);
        Villa villa5 = new Villa("Villa", 300,10000,3,"năm","3 sao",300,2);
        villa.put(villa1, 2);
        villa.put(villa2, 3);
        villa.put(villa3, 1);
        villa.put(villa4, 4);
        villa.put(villa5, 5);
        sizeVilla= villa.size();
        House house1= new House("House",300,10000,3,"năm","2 sao",2);
        House house2= new House("House",300,10000,3,"năm","2 sao",2);
        House house3= new House("House",300,10000,3,"năm","2 sao",2);;
        House house4= new House("House",300,10000,3,"năm","2 sao",2);
        House house5= new House("House",300,10000,3,"năm","2 sao",2);
        house.put(house1,2);
        house.put(house2,2);
        house.put(house3,2);
        house.put(house4,2);
        house.put(house5,2);
        sizeHouse= house.size();
        Room room1= new Room("Room", 500, 100000, 5, "Tháng","free nước");
        Room room2= new Room("Room", 500, 100000, 5, "Tháng","free nước");
        Room room3= new Room("Room", 500, 100000, 5, "Tháng","free nước");
        Room room4= new Room("Room", 500, 100000, 5, "Tháng","free nước");
        Room room5= new Room("Room", 500, 100000, 5, "Tháng","free nước");
        room.put(room1,2);
        room.put(room2,2);
        room.put(room3,2);
        room.put(room4,2);
        room.put(room5,2);
      sizeRoom= room.size();
}

    @Override
    public LinkedHashMap<Villa, Integer> findAllVilla() {
        return villa;
    }

    @Override
    public LinkedHashMap<Room, Integer> findAllRoom() {
        return room;
    }

    @Override
    public LinkedHashMap<House, Integer> findAllHouse() {
        return house;
    }

    @Override
    public int sizeVilla() {
        return sizeVilla;
    }

    @Override
    public int sizeHouse() {
        return sizeHouse;
    }

    @Override
    public int sizeRoom() {
        return sizeRoom;
    }
}

