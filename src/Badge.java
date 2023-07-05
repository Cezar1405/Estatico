public class Badge {
    private static int totalNumberOfEmployees;
    private String badgeIdCode;
    public Employee employee;

    private static void keepTrackOfEmployeesNumber(){
        totalNumberOfEmployees++;
    }
    private String generateBadgeIdCode(){
        String code1,code2;
        code1 = randomChar();
        code2 = randomChar();
        return code1+employee.getName().toLowerCase()+employee.getSurname().toLowerCase()+code2;
    }
    private String randomChar(){
        final String fuente = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        final int longitud = 3;
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<longitud;i++){
            double aleatorio = Math.random()*fuente.length();
            int posicion = (int)aleatorio;
            char letra = fuente.charAt(posicion);
            sb.append(letra);
        }
        return sb.toString();
    }
    public void showBadgeDetails(){
        System.out.println("Total de empleados: "+totalNumberOfEmployees+"\nDetalles del empleado\n"+employee.getEmployeeDetails()+"\nBadgeIdCode: "+generateBadgeIdCode()+"\n");
    }
    public Badge(Employee employeeThatNeedsBadge){
        keepTrackOfEmployeesNumber();
        employee = employeeThatNeedsBadge;
        badgeIdCode = generateBadgeIdCode();
    }
}
