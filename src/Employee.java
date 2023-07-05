public class Employee {
    private String name;
    private String surname;
    private String address;

    public Employee(String newEmployeeName, String newEmployeeSurname, String newEmployeeAddress){
        name = newEmployeeName;
        surname = newEmployeeSurname;
        address = newEmployeeAddress;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getAddress() {
        return address;
    }
    public String getEmployeeDetails(){
        return "Nombre: "+getName()+"\nApellido: "+getSurname()+"\nDireccion: "+getAddress();
    }

}
