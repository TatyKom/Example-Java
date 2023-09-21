public class Journal extends Literature{
    private int number = 0;
    public Journal(String name, String author, String genre, double price, int number) {
        super(name, author, genre, price);
        if (number > 0) {
            this.number = number;
        }
    }
    public int getNumber() {
        return this.number;
    }
    public void setNumber(int number) {
        if (number > 0) {
            this.number = number;
        }
    }
    @Override
    public String toString() {
        return super.toString() + "№" + number;
    }
}
