package CaseStudy1.reposity;

import CaseStudy1.model.Contracts;
import CaseStudy1.model.Employee;

import java.util.ArrayList;

public interface IContactReposity {
    ArrayList<Contracts> writeFile(ArrayList<Contracts> Contracts);
    ArrayList<Contracts> findAll();
    int size();
}
