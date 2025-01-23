public class Child extends Mother {
    @Override
    public void show() {
        System.out.println("Child's show (Non-static)");
    }

    public static void staticShow() {
        System.out.println("Child's show (Static)");
    }
}
