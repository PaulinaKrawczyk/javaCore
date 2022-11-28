package session4;

public class StringBuilderPlayground{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("<root>")
                .append("<node1>")
                    .append("<value1>")
                .append("</node1>")
                .append("</root>");
        System.out.println(sb.toString());
    }
}
