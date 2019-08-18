/**
 * TODO
 *
 * @author caihao
 * @date 2019/8/13 22:33
 */
public class Test {

  public static void main(String[] args) {
    System.out.println(new Test().VerifySquenceOfBST(new int[]{4, 8, 6, 12, 16, 14, 10}));
  }

  public boolean VerifySquenceOfBST(int [] sequence) {
    if(sequence == null || sequence.length <= 2){
      return true;
    }
    return judge(sequence,0,sequence.length-1-1,sequence[sequence.length-1]);
  }
  public boolean judge(int[] arr, int start, int end,int a){
    if(start >= end){
      return true;
    }
    int i = start;
    for(; i <= end; i++){
      if(arr[i] > a){
        break;
      }
    }
    int j = i;
    for(; j<=end; j++){
      if(arr[j] < a){
        return false;
      }
    }
    boolean left = true;
    if(i>start+1){
      left = judge(arr,start,i-1-1,arr[i-1]);
    }
    boolean right = true;
    if(j > i+1){
      right = judge(arr,i,end-1,arr[end]);
    }
    return left && right;
  }
}
