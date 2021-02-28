public class HourlyEmployee extends Employee {
    private int hours;
    float wage;

    public HourlyEmployee(String firstName, String lastName, String id, int hours, float wage) {
        super(firstName, lastName, id);
        setHours(hours);
        setWage(wage);
    }

    public HourlyEmployee() {
        super();
        hours=0;
        wage=0;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours<0){
            throw new IllegalArgumentException("Hours must be positive \n");
        }
        this.hours = hours;
    }

    public float getWage() {
        return wage;
    }

    public void setWage(float wage) {
        if (wage<0)
            throw new IllegalArgumentException();
        this.wage = wage;
    }

    @Override
    public String toString() {
        return
                super.toString()  +
                "hours: " + hours +  "\n"  +
                "wage: "  + wage  ;
    }

    @Override
    public boolean equals(Object obj) {
        HourlyEmployee hourlyEmployee = (HourlyEmployee)obj;
        return super.equals(obj)  &&  hours==hourlyEmployee.hours  &&  wage==hourlyEmployee.wage;
    }



    @Override
    public float earnings() {
        return hours*wage;
    }

}
