public class Book extends Literature{
    private String publish = "";
    public Book(String name, String author, String genre, double price, String publish) {
        super(name, author, genre, price);
        this.publish = publish;
    }
    public String getPublish() {
        return this.publish;
    }
    public void setPublish(String publish) {
        this.publish = publish;
    }
    @Override
    public String toString() {
        return super.toString() + publish;
    }
}
