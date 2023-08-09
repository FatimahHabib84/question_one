package employeeDetails; 
import java.util.Scanner;
    class EmployeeDetails {
        int id, experience;
        double salary;
        String name, position, eduLevel;

        public int getID() {
            return id;
        }
        public void setID(int id) {
            this.id = id;
        }
        public double getSalary() {
            return salary;
        }
        public void setSalary(double salary) {
            this.salary = salary;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }       
        public String getPostion() {
            return position;
        }
        public void setPostion(String position) {
            this.position = position;
        }
        public int getExperience() {
            return experience;
        }
        public void setExperience(int experience) {
            this.experience = experience;
        }
        public String getEduLevel() {
            return eduLevel;
        }
        public void setEduLevel(String eduLevel) {
            this.eduLevel = eduLevel;
        }

        @Override  
        public String toString() {
            return "";
        }
    }
    public class EmployeeMain{
        public static void main(String args[]) {
            Scanner input = new Scanner(System.in);
            EmployeeDetails e = new EmployeeDetails(); 
            double basicSala=salary;
            double bouns;
            if (eduLevel=="bachelor"){
                salary=500.0;
            }
            else if(eduLevel=="diploma"){
                salary =250;
            }
            else{
                salary=0;
            }
            System.out.println("Choose the employee type 0:Full time, 1: part time");
            int empType = input.nextInt();
            if(empType==0){
                bouns=basicSala * 0.03;
            }
            else if (empType==1){
                bouns=basicSala * 0.015;
            }
            else{
                System.out.println("Wrong data!!!");
            }
            double salary = basicSala + (basicSala*0.05*experience) + bouns;
        }
    }