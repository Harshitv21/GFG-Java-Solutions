public class ConstructorOverloading {
    class User {
        String name;

        User() {
            name = "Default";
        }
        User(String name) {
            this.name = name;
        }
    };
}
