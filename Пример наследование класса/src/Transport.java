public class Transport {
    private String model = "";
    private double speed = 0;
    private int rider = 0;
    public Transport(String model, double speed, int rider) throws Exception {
        this.model = model;
        if (speed >0&&speed <300)
            this.speed = speed;
        else throw new Exception("введите скорость не больше 300 км/ч");
        if (rider >=0&&rider <=1)
            this.rider = rider;
        else throw new Exception("Введите либо 0 или 1. 0 - если машина стоит, 1 - если машина движется");
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public double getSpeed() {
        return speed;
    }
    public void setSpeed(double speed) throws Exception { //метод может выдать исключение
        if (speed >0&&speed <300)
        this.speed = speed;
        else throw new Exception("введите скорость не больше 300 км/ч");
    }
    public int getRider() {
        return rider;
    }
    public void setRider(int rider) throws Exception { // метод может выдать исключение
        if (rider >=0&&rider <=1)
        this.rider = rider;
        else throw new Exception("Введите либо 0 или 1. 0 - если машина стоит, 1 - если машина движется");
    }
    @Override
    public String toString() {
        return "Марка машины: " + model + " Средняя скорость " + speed + " Движется или стоит " + rider;
    }
    public double getTime(double distance) { //длительность поездки
        if (rider == 1)
            return distance/speed;
        else
            return 0;
    }
}
