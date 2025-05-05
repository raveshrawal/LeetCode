class Solution {
    public int reverse(int x) {

        boolean negative = x<0;
        
        StringBuilder sb = new StringBuilder();
        sb.append(Math.abs(x));
        sb.reverse();

        try{
            int result = Integer.parseInt(sb.toString());
            return negative ? -result : result;

        }catch(NumberFormatException e){
            return 0;
        }
    }
}