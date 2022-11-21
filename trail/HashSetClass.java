import java.util.HashSet;

public class HashSetClass {

public static void main(String args[]) {

HashSet<String> hset = new HashSet<String>();

hset.add("Suzuki");

hset.add("Kawasaki");

hset.add("Honda");

hset.add("Ducati");

hset.add("Yamaha");

hset.add("Yamaha");

hset.add("Suzuki");

hset.add(null);

hset.add(null);

// Displaying HashSet elements

System.out.println(hset);

}

}