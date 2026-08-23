class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st= new Stack<>();
       for(String op:operations){
          if(op.equals("C")){
             st.pop();
          } else if(op.equals("D")){
             st.push(st.peek()*2);
          } else if(op.equals("+")){
             int last=st.pop();
             int secondLast=st.peek();

             st.push(last);
             st.push(last+secondLast);
          } else{
            st.push(Integer.parseInt(op));
          }
       } 

       int totalScore=0;

       while(!st.isEmpty()){
          totalScore+=st.pop();
       }

       return totalScore;
    }
}