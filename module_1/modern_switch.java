package module_1;

public class modern_switch {
    public static void main(String[] args) {
        String grade = "B";
        String result = switch(grade){
            case "A" -> "good";
            case "B" -> "bad";
            default -> "error";
        };
        System.out.println(result);
    }
}
