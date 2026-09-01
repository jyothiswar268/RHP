import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++) nums[i] = sc.nextInt();
        HashMap<Integer, Integer> map=new HashMap<>();
        int sum=0;
        int maxlen=0;
        map.put(0, -1);
        for(int i=0; i<n; i++){
            if(nums[i]==0){
                sum--;
            }
            else{
                sum++;
            }
            if(map.containsKey(sum)) {
                maxlen = Math.max(maxlen, i-map.get(sum));
            }
            else{
                map.put(sum, i);
            }
        }
        System.out.println(len);
    }
}
