class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();

        for(String str:operations){
            switch(str){
                case "+" :
                    int add=st.pop();
                    int sum=add+st.peek();

                    st.push(add);
                    st.push(sum);
                    break;

                case "D" :
                    st.push(st.peek()*2);
                    break;

                case "C" :
                    st.pop();
                    break;

                default :
                    st.push(Integer.parseInt(str));
                    break;
                
            }
        }
        int sum=0;
        for(int i:st){
            sum+=i;
        }
        return sum;
    }
}