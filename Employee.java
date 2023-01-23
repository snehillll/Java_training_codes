public class Employee{

    static int count=0;
    int eID;
    String name;
    int salary;
    String company;

    public Employee(int eID, String name, String company, int salary) {
        this.eID = eID;
        this.name = name;
        this.company = company;
        this.salary = salary;
        count++;
    }

    public int getId() {
        return eID;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getCompany() {
        return company;
    }

    public void displayData(){
        System.out.println("Employee id: "+eID+ " Name: "+" Salary: "+salary+" Company: "+company);
    }

    public static void main(String[] args){
       
        Employee[] arr = new Employee[3];

        arr[0]= new Employee(1, "Snehil", "Bajaj", 10000000);
        arr[1]= new Employee(2, "Pratyush", "Markets", 100000);
        arr[2]= new Employee(3, "Ayush", "Finance", 1000);

        System.out.println("Employees with salary greater than 50k");

        for(int i=0; i<3; i++){
            if(arr[i].salary>50000){
                arr[i].displayData();
            }
        }

        System.out.println("Total number Of Objects Formed: "+count);
        String a= (arr[0].toString());
        System.out.println(a.charAt(2));
        


        
    }
    
}

