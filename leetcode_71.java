import java.util.Stack;

public class leetcode_71 {
    public String simplifyPath(String path) {
        final Stack<String> stack = new Stack<>();
        final StringBuilder s = new StringBuilder();
        
        for (int i = 0; i < path.length() + 1; ++i) {
            if ((path.charAt(i) == '/' || i == path.length()) && s.length() > 0) {
                final String dir = s.toString();

                if (dir.equals("..") && !stack.isEmpty()) {
                    stack.pop();
                } else if (!dir.equals("..") && !dir.equals(".")) {
                    stack.push(dir.toString());
                }
                s.setLength(0);
            } else if (path.charAt(i) != '/' && path.length() > i) {
                s.append(path.charAt(i));
            }
        }
        String result = "";
        while (!stack.isEmpty()) {
            result = "/" + stack.pop() + result;
        }
        return result.length() == 0 ? "/" : result;
    }

    public static void main(String[] args) {
        leetcode_71 lc = new leetcode_71();
        String path = "/../";
        System.out.println(lc.simplifyPath(path));

    }
}