package nested.test;

public class AnonymousMain {
    public static void main(String[] args) {
        Hello anonymous = new Hello() {
            @Override
            public void hello() {
                System.out.println("Hello.hello");
            }
        };
        anonymous.hello();
    }
}
