public class leetCode_2073{
    public int timeRequiredToBuy(int[] tickets, int k) {
            int total = 0;

            for (int i = 0; i < tickets.length; i++) {
                if (i <= k) {
                    total += Math.min(tickets[i], tickets[k]);
                } else {
                    total += Math.min(tickets[i], tickets[k] - 1);
                }
            }
    
            return total;
        
    }
    public static void main(String[] args) {
        leetCode_2073 lc=new leetCode_2073();
        int ticket[]={4,1,2,5,6};
        //4,91,038
       
        int k=3;
        System.out.println(lc.timeRequiredToBuy(ticket,k));
    }
}