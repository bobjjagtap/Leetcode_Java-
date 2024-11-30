//chocalate divided in each seprate part 
//How many cuts would be required;
public class chocola_problem {
    public static void main(String[] args) {
        int a[]={4,3,2,1,1};
        int b[]={4,2,1};
        int cuts_a=1;
        int cuts_b=1;
        int sum=0;
        int i=0;
        int j=0;
        int l=0;
        while(l<a.length+b.length){
            if(a[i]>=b[j]){
                sum+=cuts_b*a[i];
                cuts_a++;
                i++;
                if(i==a.length){
                    i=a.length-1;
                    a[i]=-1;
                }

            }else if(a[i]<=b[j]){
                sum+=cuts_a*b[j];
                cuts_b++;
                j++;
                if(j==b.length){
                    j=b.length-1;
                    b[j]=-1;
                }
            }
            l++;
        }
        System.out.println(sum);
    }
}
