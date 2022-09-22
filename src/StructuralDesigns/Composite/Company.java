package StructuralDesigns.Composite;

public class Company {
    public static void main(String[] args){
        Employee dev1 = new Developer("Ibrahim Al-Zaidi",100,"Pro Developer");
        Employee dev2 = new Developer("Myra",101,"Entry Developer");

        Directory engDirectory = new Directory();
        engDirectory.addEmployee(dev1);
        engDirectory.addEmployee(dev2);

        Employee man1 = new Manager("Ibrahim",200,"SEO Manager");
        Employee man2 = new Manager("Yvonne",201,"Management Manager");

        Directory accDirectory = new Directory();
        accDirectory.addEmployee(man1);
        accDirectory.addEmployee(man2);

        Directory companyDirectory = new Directory();
        companyDirectory.addEmployee(engDirectory);
        companyDirectory.addEmployee(accDirectory);
        companyDirectory.showEmployeeDetails();
    }
}