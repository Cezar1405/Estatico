public class Main {
    public static void main(String[] args) {
        /*
        definir una clase Employee con:
3 variables de instancia name, surname y address
un método constructor que asigna 3 parámetros ( newEmployeeName, newEmployeeSurname, newEmployeeAddress) a las propiedades
del objeto respectivo
un método getEmployeeDetails()que devuelve un informativo String con todos los detalles delEmployee

definir una clase Badge con:
una private static intvariable llamada totalNumberOfEmployees
(el valor de esta variable se compartirá entre varias instancias de clase)

una private String variable llamada badgeIdCode
una public Employee variable llamada employee

un private static void método llamado keepTrackOfEmployeesNumber()que incrementa en 1 eltotalNumberOfEmployees

un private String método llamado generateBadgeIdCode() que devuelve un String contenido name y surname del empleado entre
dos Stringcódigos aleatorios (por ejemplo XYZNameSurnameZYX, )

un public void método llamado showBadgeDetails() que informa al usuario sobre:
el número total de empleados rastreados por las insignias
los detalles del empleado
elbadgeIdCode

un método constructor que toma un Employee parámetro llamado employeeThatNeedsBadge y:

llame al static para realizar un seguimiento del número de empleados
asignar el valor de employeeThatNeedsBadge a la employee propiedad del objeto
asignar un código de identificación generado al objeto badgeIdCode

defina una clase de probador donde usted:
crear 2 nuevos Employe eobjetos
crear sus nuevos 2 Badge
mostrar al usuario los detalles de la credencial de 2 empleados
         */
        Employee emp1 = new Employee("Cezar", "Cotrina", "Giuseppe Garibaldi, 8");
        Employee emp2 = new Employee("Miguel", "Castro", "Tirana, 22");

        Badge badgeEmp1 = new Badge(emp1);
        Badge badgeEmp2 = new Badge(emp2);

        badgeEmp1.showBadgeDetails();
        badgeEmp2.showBadgeDetails();
    }
}