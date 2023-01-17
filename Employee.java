public class Employee{

    int eID;
    String name;
    int salary;
    String company;

    public Employee(int eID, String name, String company, int salary) {
        this.eID = eID;
        this.name = name;
        this.company = company;
        this.salary = salary;
    }

    public int getId() {
        return eID;
    }

    public String getname() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getLastName() {
        return company;
    }
    Employee e1=new Employee(1, "Snehil", "Bajaj", 1000000);

    Employee e2=new Employee(2, "Pratyush", "Markets", 10000);

    Employee e3=new Employee(3, "Ayush", "Finance", 100);

    public int SalaryCount(){
        int count=0;
        if(e1.getSalary()>50000){
            count++;
        }
        if(e2.getSalary()>50000){
            count++;
        }
        if(e3.getSalary()>50000){
            count++;
        }
        return count;

    }
    
}

