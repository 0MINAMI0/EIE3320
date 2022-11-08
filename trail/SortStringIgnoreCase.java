public class SortStringIgnoreCase {
public static void main(String[] args) {
java.util.List<String> cities = java.util.Arrays.asList ("Atlanta", "Savannah", "new York", "dallas");
cities.sort(null); //sorted using its natural order.
for (String s: cities) { System.out.print(s + " ");
} }
}