class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
        //         stack.push(s.charAt(i));
        //     }
        //     else{
        //         if(stack.isEmpty()){
        //             return false;
        //         }
        //         else{
        //             char ch=stack.pop();
        //             if((s.charAt(i)==')' && ch=='(') || (s.charAt(i)==']' && ch=='[') || (s.charAt(i)=='}' && ch=='{')){
        //                 continue;
        //             }
        //             else{
        //                 return false;
        //             }
        //         }
        //     }
        // }
        // return stack.isEmpty();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                stack.push(')');
            }
            else if(ch=='{'){
                stack.push('}');
            }
            else if(ch=='['){
                stack.push(']');
            }
            else if(stack.isEmpty() || stack.pop()!=ch){
                return false;
            }
        }
        return stack.isEmpty();
    }
}