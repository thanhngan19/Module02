package CaseStudy1.reposity;

import CaseStudy1.model.House;
import CaseStudy1.model.Room;
import CaseStudy1.model.Villa;

import java.util.LinkedHashMap;

public interface IFacilityReposity {
    LinkedHashMap<Villa,Integer> findAllVilla();
    LinkedHashMap<Room,Integer> findAllRoom();
    LinkedHashMap<House,Integer> findAllHouse();
    int sizeVilla();
    int sizeHouse();
    int sizeRoom();


}
