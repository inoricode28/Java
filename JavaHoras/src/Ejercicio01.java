import java.util.Stack;

public class Ejercicio01 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        //System.out.println(stack.empty());
        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push("Borderlands");
        stack.push("FFVII");
        String myFavGAme = stack.pop();
        System.out.println(myFavGAme);
        System.out.println(stack);
            
        }

    }

