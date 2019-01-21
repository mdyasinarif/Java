package listing;

import java.util.*;


public class TestCollection {
    public static void main(String[] args) {
        ArrayList <String> collection1 = new ArrayList<>();
        collection1.add("A");
        collection1.add("B");
        collection1.add("C");
        collection1.add("D");
        System.out.println("A list of cities in collection1: "+collection1);
        
        System.out.println("\nIs B is collection1? :"+collection1.contains("B"));
        collection1.remove("B");
        System.out.println("Removing B of cities in collection1: "+collection1.size());
        System.out.println("A list of cities in collection1: "+collection1);
        
        Collection <String> collection2 = new ArrayList<>();
        collection2.add("D");
        collection2.add("E");
        collection2.add("F");
        collection2.add("G");
        
        System.out.println("\nA List of cities in collection2:"+collection2);
        
        ArrayList<String> c1 = (ArrayList<String>)(collection1.clone());
        c1.addAll(collection2);
        System.out.println("\nCities in collection1 or collection2 :"+c1);
        
        c1 = (ArrayList<String>)(collection1.clone());
        c1.retainAll(collection2);
        System.out.println("RetainAll collection1 +collection2 "+c1);
        
        c1= (ArrayList<String>)(collection1.clone());
        c1.removeAll(collection2);
        System.out.println("Removind "+c1);
    }   

    
    }
    

