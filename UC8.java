
// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class UC8 {
    public UC8() {
    }

    public static List<Bogie> filterBogies(List<Bogie> var0, int var1) {
        return (List) var0.stream().filter((var1x) -> var1x.capacity > var1).collect(Collectors.toList());
    }

    public static void main(String[] var0) {
        ArrayList var1 = new ArrayList();
        var1.add(new Bogie("Sleeper", 72));
        var1.add(new Bogie("AC Chair", 60));
        var1.add(new Bogie("First Class", 50));
        var1.add(new Bogie("General", 90));
        List var2 = filterBogies(var1, 60);
        System.out.println("Filtered Bogies:");
        PrintStream var10001 = System.out;
        Objects.requireNonNull(var10001);
        var2.forEach(var10001::println);
    }

    static class Bogie {
        String name;
        int capacity;

        Bogie(String var1, int var2) {
            this.name = var1;
            this.capacity = var2;
        }

        public String toString() {
            return this.name + " - Capacity: " + this.capacity;
        }
    }
}