package exceptions.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class JavaStreamEx {
	public static void main(String[] args) {  
        List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));
        // Filtering Collection by using Stream
        List<Float> productPriceList2 =productsList.stream()  
                .filter(p -> p.price > 30000)// filtering data  
                .map(p->p.price)        // fetching price  
                .collect(Collectors.toList()); // collecting as list  
        			System.out.println(productPriceList2); 
        	
        	//  Filtering and Iterating Collection
        	 productsList.stream()  
             .filter(product -> product.price == 28000)  
             .forEach(product -> System.out.println(product.name)); 
        	 
        	 //  reduce() Method in Collection
        	 Float totalPrice = productsList.stream()  
                     .map(product->product.price)  
                     .reduce(0.0f,(sum, price)->sum+price);   // accumulating price  
        	 		System.out.println(totalPrice);  
         // More precise code   
        	 float totalPrice2 = productsList.stream()  
                 .map(product->product.price)  
                 .reduce(0.0f,Float::sum);   // accumulating price, by referring method of Float class  
         			System.out.println(totalPrice2);  
         	
         	// Sum by using Collectors Methods
         	 double totalPrice3 = productsList.stream()  
                     .collect(Collectors.summingDouble(product->product.price));  
         	 		System.out.println(totalPrice3);  
         	 
         	 //Find Max and Min Product Price
         	  Product productA = productsList.stream()  
                      .max((product1, product2)->   
                      product1.price > product2.price ? 1: -1).get();  
        
         	  		System.out.println(productA.price);  
         	  // min() method to get min Product price  
         	  Product productB = productsList.stream()  
              .max((product1, product2)->   
              product1.price < product2.price ? 1: -1).get();  
         	  		System.out.println(productB.price);
       
           //  count() Method in Collection
         	 long count = productsList.stream()  
                     .filter(product->product.price>30000)  
                     .count();  
         	 		System.out.println(count); 
         	 
         	 //   Convert List into Set
         	 		Set<Float> productPriceList =   
                    productsList.stream()  
                    .filter(product->product.price < 30000)   // filter product on the base of price  
                    .map(product->product.price)  
                    .collect(Collectors.toSet());   // collect it as Set(remove duplicate elements)  
         	 		System.out.println(productPriceList); 
                
                //  Convert List into Map
                	Map<Integer,String> productPriceMap =   
                        productsList.stream()  
                                    .collect(Collectors.toMap(p->p.id, p->p.name));  
                          
                    System.out.println(productPriceMap);  	
          
        	 
    }  
}
