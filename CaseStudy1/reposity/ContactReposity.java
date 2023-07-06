package CaseStudy1.reposity;

import CaseStudy1.model.Contracts;
import CaseStudy1.model.Employee;
import CaseStudy1.until.ContractReadFile;
import CaseStudy1.until.ContractWriteFile;
import CaseStudy1.until.EmployeeReadFile;
import CaseStudy1.until.EmployeeWriteFile;

import java.util.ArrayList;

public class ContactReposity implements IContactReposity {
    static ArrayList<Contracts> Contracts = new ArrayList<Contracts>();
    @Override
    public ArrayList<Contracts> writeFile(ArrayList<Contracts> Contracts) {
        return ContractWriteFile.WriteFile(Contracts);
    }
    public ArrayList<Contracts> findAll() {
        return   Contracts=ContractReadFile.ReadFile();
    }
    public int size() {
        return Contracts.size();
    }
}
