class Book
{
    String author= new String();
    String title= new String();
    String publisher= new String();

    Book(String author, String title, String publisher)
    {
        this.author= author;
        this.title= title;
        this.publisher= publisher;
    }
}

class Bookinfo extends Book
{
    float price;
    int stock_position;
    Bookinfo(String author,String title,String publisher,float price,int stock_position)
    {
        super(author,title,publisher);
        this.price=price;
        this.stock_position=stock_position;
    }

    void show()
    {
        System.out.println("Author: "+ author);
        System.out.println("Title: "+ title);
        System.out.println("Publisher: "+ publisher);
        System.out.println("Price: "+ price);
        System.out.println("Stock position: "+ stock_position);
    }
}

class Pst
{
    public static void main(String[] args)
    {
        Bookinfo b= new Bookinfo("Dennis Richie","C","Tata",299.99f,78);
        b.show();
    }
}
