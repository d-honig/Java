public class BasePlusCommissionEmployee extends CommissionEmployee {
    private float baseSalary;

    public BasePlusCommissionEmployee
            (String firstName, String lastName, String id, float grossSales, int commision, float baseSalary)
    {
        super(firstName, lastName, id, grossSales, commision);
        setBaseSalary(baseSalary);
    }

    public BasePlusCommissionEmployee() {
        super();
        baseSalary=0;
    }

    public float getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(float baseSalary) {
        if (baseSalary<0)
            throw new IllegalArgumentException("Base salary must be positive \n");
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "baseSalary: " + baseSalary;
    }

    @Override
    public boolean equals(Object obj) {
        BasePlusCommissionEmployee basePlusCommissionEmployee= (BasePlusCommissionEmployee)obj;
        return super.equals(obj)  &&  baseSalary==basePlusCommissionEmployee.baseSalary;
    }

    @Override
    public float earnings() {
        return super.earnings()+baseSalary;
    }
}
