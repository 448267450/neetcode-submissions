class Solution {
    public int evalRPN(String[] tokens) {
        int res = 0;

        if (tokens.length == 1) return Integer.parseInt(tokens[0]);

        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<tokens.length; i++){
            if(tokens[i].matches("[+-]?\\d+")){
                // System.out.println(tokens[i]);
                stack.push(Integer.parseInt(tokens[i]));
            } else if(tokens[i].equals("+")){
                int r = stack.pop();
                int l = stack.pop();
                res = l + r;
                stack.push(res);
                // System.out.println(stack);
            } else if(tokens[i].equals("-")){
                int r = stack.pop();
                int l = stack.pop();
                res = l - r;
                stack.push(res);
            } else if(tokens[i].equals("*")){
                int r = stack.pop();
                int l = stack.pop();
                res = l * r;
                stack.push(res); 
                System.out.println(stack);
            } else if(tokens[i].equals("/")){
                int r = stack.pop();
                int l = stack.pop();
                res = l / r;
                stack.push(res);
            }
        }
        return res;
    }
}
