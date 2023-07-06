package CaseStudy1.reposity;

import CaseStudy1.model.*;
import CaseStudy1.until.FacilityReadFile;
import CaseStudy1.until.FacilityWriteFile;

import java.util.LinkedHashMap;

public class FacilityReposity implements IFacilityReposity{
    String path_house ="E:\\New Volume\\codegym\\Module02\\CaseStudy1\\data\\House.csv";
    static LinkedHashMap <Villa,Integer>villa = new LinkedHashMap<>();
    static LinkedHashMap <House, count>house = new LinkedHashMap<>();
    static LinkedHashMap <Room,Integer>room = new LinkedHashMap<>();
    static int sizeVilla;
    static int sizeRoom;
    static int sizeHouse;


    @Override
    public LinkedHashMap<Villa, Integer> findAllVilla() {
        return villa;
    }

    @Override
    public LinkedHashMap<Room, Integer> findAllRoom() {
        return room;
    }

    @Override
    public LinkedHashMap<count,House> findAllHouse() {
        return FacilityReadFile.ReadFile(path_house);
    }
    public LinkedHashMap<count,House> readFromFile(LinkedHashMap<count,House> demo) {
        return FacilityWriteFile.WriteFile(demo);
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

