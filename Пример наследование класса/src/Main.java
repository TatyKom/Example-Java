public class Main {
    public static void main(String[] args) throws Exception {
        Car t1 = new Car("Lada", 90, 1, 3);
        Car t2 = new Car("KIA", 105, 1, 1);
        Car t3 = new Car("Ford", 130, 0,2);
        Truck g1 = new Truck("Газель", 100, 1, 2);
        Truck g2 = new Truck("Камаз", 70, 1, 10);
        Truck g3 = new Truck("Daf", 105, 1, 15);
        System.out.println("0-машина стоит, 1-машина движется");
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

        double timeT1 = t1.getTime(240);
        double timeT2 = t2.getTime(240);
        double timeT3 = t3.getTime(240);
        int d1 = t1.getRider();
        int d2 = t2.getRider();
        int d3 = t3.getRider();

        if (d1==0&&d2==0&&d3==0)
            System.out.println("Все машины стоят.");
        if (d1==1&&d2==1&&d3==1&&timeT1<timeT2&&timeT1<timeT3)
            System.out.println(t1.getModel() + " проедет быстрее, чем " + t2.getModel() + " и " + t3.getModel());
        if (d1==1&&d2==1&&d3==1&&timeT2<timeT1&&timeT2<timeT3)
            System.out.println(t2.getModel() + " проедет быстрее, чем " + t1.getModel() + " и " + t3.getModel());
        if (d1==1&&d2==1&&d3==1&&timeT3<timeT2&&timeT3<timeT1)
            System.out.println(t3.getModel() + " проедет быстрее, чем " + t2.getModel() + " и " + t1.getModel());
        if (d1==1&&d2==1&&d3==0&&timeT1<timeT2)
            System.out.println(t1.getModel() + " проедет быстрее, чем " + t2.getModel() + ". "+ t3.getModel() + " не движется.");
        if (d1==1&&d2==1&&d3==0&&timeT2<timeT1)
            System.out.println(t2.getModel() + " проедет быстрее, чем " + t1.getModel() + ". "+ t3.getModel() + " не движется.");
        if (d1==1&&d2==0&&d3==1&&timeT1<timeT3)
            System.out.println(t1.getModel() + " проедет быстрее, чем " + t3.getModel() + ". "+ t2.getModel() + " не движется.");
        if (d1==1&&d2==0&&d3==1&&timeT3<timeT1)
            System.out.println(t3.getModel() + " проедет быстрее, чем " + t1.getModel() + ". "+ t2.getModel() + " не движется.");
        if (d1==0&&d2==1&&d3==1&&timeT2<timeT3)
            System.out.println(t2.getModel() + " проедет быстрее, чем " + t3.getModel() + ". "+ t1.getModel() + " не движется.");
        if (d1==0&&d2==1&&d3==1&&timeT3<timeT2)
            System.out.println(t3.getModel() + " проедет быстрее, чем " + t2.getModel() + ". "+ t1.getModel() + " не движется.");
        Transport [] a = new Transport [6];
        a[0] = t1;
        a[1] = t2;
        a[2] = t3;
        a[3] = g1;
        a[4] = g2;
        a[5] = g3;

        register(a);
    }
    public static void register(Transport[] list) {
        double sum = 0;
        for (Transport e : list) {
            sum += e.getSpeed();
        }
            System.out.println("Средняя скорость всего транспорта: " + sum/ list.length + " км/ч");
    }
}