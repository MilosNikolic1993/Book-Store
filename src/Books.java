public class Books {
 public String title;
 public String author;
 public int isbm;
 public double price;
 public double discount;
 public double total;

 public Books (){}

    public Books(String title,String author,int isbm,double price,
                 double discount,double total){
     super();
     this.title = title;
     this.author = author;
     this.isbm = isbm;
     this.price = price;
     this.discount = discount;
     this.total = total;
    }

    public String getTitle(){
     return title;
    }
    public String getAuthor(){
     return author;
    }
    public int getIsbm(){
     return isbm;
    }
    public double getPrice(){
     return price;
    }
    public double getDiscount(){
     return discount;
    }
    public double getTotal(){
     return total;
    }

}


