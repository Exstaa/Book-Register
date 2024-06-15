package az.developia.bookregister.model;

public class Book {
	 private Integer id;
     private String name;
     private String category;
     private Integer price;
     private String author;
     
     public Book() {
    	 
     }
     public Book(Integer id, String name, String category, Integer price, String author) {
    	 this.id = id;
    	 this.name = name;
    	 this.category = category;
    	 this.price = price;
    	 this.author = author;
     }     
     public Book(String name, String category, Integer price, String author) {
    	 this.name = name;
    	 this.category = category;
    	 this.price = price;
    	 this.author = author;
     }
     public Integer getId() {
    	 return id;
     }
     public void setId(Integer id) {
    	 this.id = id;
     }
     public String getName() {
    	 return name;
     }
     public void setName(String name) {
    	 this.name = name;
     }
     public String getCategory() {
    	 return category;
     }
     public void setCategory(String category) {
    	 this.category = category;
     }
     public Integer getPrice() {
    	 return price;
     }
     public void setPrice(Integer price) {
    	 this.price = price;
     }
     public String getAuthor() {
    	 return author;
     }
     public void setAuthor(String author) {
    	 this.author = author;
     }
     
     @Override
     public String toString() {
    	 return "Book [id="+id+", name="+name+", category="+category+", price="+price+", author="+author + "]";
     }
}
