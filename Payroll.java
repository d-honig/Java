public class Payroll {

    public static void main(String[] args) {

        Employee employee[] = new Employee[3];
        employee[0] = new HourlyEmployee("Dan","Israel","12345678",40,(float) 29.12);
        employee[1] = new CommissionEmployee("Dani","Levi","87654321",(float) 10000,15);
        employee[2] = new BasePlusCommissionEmployee("Daniel","Cohen","12348765",(float)10000,1,(float) 1000);

        for (Employee e:employee) {
            System.out.println(e.toString());
            double reward = 1;
            if( e instanceof BasePlusCommissionEmployee )
                reward = 1.1;
            System.out.println ( "weekly income: " + String.format ( "%.2f",e.earnings() * reward ) +"\n") ;
        }
    }
}
