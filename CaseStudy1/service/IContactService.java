package CaseStudy1.service;

import CaseStudy1.model.Contracts;

import java.util.ArrayList;

public interface IContactService extends IService{
    ArrayList<Contracts> addNew();
    void Display();
    void fixInfo();
}
