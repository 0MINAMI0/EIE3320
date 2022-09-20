public class A1 {
A1() {
System.out.print("A");
}
A1 (int a) {
    this();
    System.out.print(a);
}

A1 (int a, int b) {
this(b);
System.out.print(a);
}
}
