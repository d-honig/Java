public class CommissionEmployee extends Employee {
    private float grossSales;
    private int commision;

    public CommissionEmployee(String firstName, String lastName, String id, float grossSales, int commision) {
        super(firstName, lastName, id);
        setGrossSales(grossSales);
        setCommision(commision);
    }

    public CommissionEmployee() {
        super();
        grossSales=0;
        commision=0;
    }

    public float getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(float grossSales) {
        if (grossSales<0)
            throw new IllegalArgumentException("Gross sales must be positive \n");
        this.grossSales = grossSales;
    }

    public int getCommision() {
        return commision;
    }

    public void setCommision(int commision) {
        if (commision<=0)
            throw new IllegalArgumentException("Commision must be positive \n");
        this.commision = commision;
    }

    @Override
    public String toString() {
        return super.toString() +
                "grossSales: " + grossSales + "\n"  +
                "commision: "  + commision  ;
    }

    @Override
    public boolean equals(Object obj) {
        CommissionEmployee commissionEmployee =(CommissionEmployee)obj;
        return super.equals(obj)  &&  commissionEmployee.commision==commision  &&  commissionEmployee.grossSales==grossSales;
    }

    @Override
    public float earnings() {
        return commision * grossSales / 100;
    }
}
