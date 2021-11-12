public class CustomDouble {
    private int WholePart;
    private double FractionalPart;

    public int getWholePart() {
        return WholePart;
    }

    public void setWholePart(int wholePart) {
        WholePart = wholePart;
    }

    public double getFractionalPart() {
        return FractionalPart;
    }

    public void setFractionalPart(double fractionalPart) {
        FractionalPart = fractionalPart;
    }

    public CustomDouble(final int wholePart, final double fractionalPart) {
        setWholePart(wholePart);
        setFractionalPart(fractionalPart);
    }
    public CustomDouble(double temp) {
        this.WholePart = (int) temp;
        this.FractionalPart = temp - WholePart;
    }

    public double toDouble() {
        return (double) this.WholePart + this.FractionalPart;
    }

    public CustomDouble Plus (CustomDouble x){
        double temp = this.toDouble() + x.toDouble();
        return new CustomDouble(temp);
    }

    public CustomDouble Minus (CustomDouble x){
        double temp = this.toDouble() - x.toDouble();
        return new CustomDouble(temp);
    }

    public CustomDouble Divide (CustomDouble x){
        double temp = this.toDouble() / x.toDouble();
        return new CustomDouble(temp);
    }

    public CustomDouble Increase (CustomDouble x){
        double temp = this.toDouble() * x.toDouble();
        return new CustomDouble(temp);
    }

    public void Compare (CustomDouble x){
        if (this.toDouble()== x.toDouble()){
            System.out.println("Numbers are the same!");
        }
        else {
            System.out.println("Numbers are not the same!");
        }

    }

    @Override
    public int hashCode() {
        int Result = 2;
        int Prime = 3;
        Result = Prime * Result + WholePart;
        Result = (int) (Prime * Result + FractionalPart);
        return Result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        CustomDouble customDouble = (CustomDouble) obj;
        return this.WholePart == customDouble.WholePart && this.FractionalPart == customDouble.FractionalPart;
    }

    @Override
    public String toString() {
        return this.WholePart + this.FractionalPart + "";
    }
}
