public class Truck  extends Transport{
    private double weight = 0;
    public Truck(String model, double speed, int rider,double weight) throws Exception {
        super(model, speed, rider);
        if (weight>0&&weight<35)
            this.weight = weight;
        else throw new Exception("Введите количество тонн меньше 35");
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) throws Exception {
        if (weight>0&&weight<35)
            this.weight = weight;
        else throw new Exception("Введите количество тонн меньше 35");
    }

    @Override
    public String toString() {
        return super.toString() + weight;
    }
}
