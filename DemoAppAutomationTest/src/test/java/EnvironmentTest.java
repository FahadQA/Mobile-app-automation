public class EnvironmentTest {
    public static void main(String[] args) {
        String androidHome = System.getenv("ANDROID_HOME");
        System.out.println("ANDROID_HOME: " + androidHome);
    }
}
