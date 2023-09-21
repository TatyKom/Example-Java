public class Literature {
    private String name = "";
    private String author = "";
    private String genre = "";
    private double price = 0;
    public Literature(String name, String author, String genre, double price) {
        this.name = name;
        this.author = author;
        this.genre = genre;
        if (price > 0) {
            this.price = price;
        }
    }
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getAuthor() {
        return this.author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getGenre() {
        return this.genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public double getPrice() {
        return this.price;
    }
    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }
    public String toString() {
        return name + " " + author + " " + genre + " " + price + " руб. ";
    }
}
