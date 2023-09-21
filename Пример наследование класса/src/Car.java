public class Car extends Transport {
    private int people = 0;

    public Car(String model, double speed, int rider, int people) throws Exception {
        super(model, speed, rider);
        if (people > 0 && people < 6)
            this.people = people;
        else throw new Exception("Введите количество пассажиров от 1 до 5");
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) throws Exception {
        if (people > 0 && people < 6)
            this.people = people;
        else throw new Exception("Введите количество пассажиров от 1 до 5");
    }

    @Override
    public String toString() {
        return super.toString() + people;
    }
}
