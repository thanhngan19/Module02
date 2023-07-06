package CaseStudy1.reposity;

import CaseStudy1.model.House;
import CaseStudy1.model.Room;
import CaseStudy1.model.Villa;
import CaseStudy1.model.count;

import java.util.LinkedHashMap;

public interface IFacilityReposity {
    LinkedHashMap<Villa,Integer> findAllVilla();
    LinkedHashMap<Room,Integer> findAllRoom();
    LinkedHashMap<count,House> findAllHouse();
    LinkedHashMap<count,House> readFromFile(LinkedHashMap<count,House> demo);
    int sizeVilla();
    int sizeHouse();
    int sizeRoom();


}
