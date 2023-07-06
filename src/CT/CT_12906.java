package CT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CT_12906 {
    //arr	answer
    //[1,1,3,3,0,1,1]	[1,3,0,1]
    //[4,4,4,3,3]	[4,3]
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,1,3,3,0,1,1};
        int[] arr2 = new int[]{4,4,4,3,3};
    }

    //[1,1,3,3,0,1,1]	[1,3,0,1]
    //[4,4,4,3,3]	[4,3]
    public static int[] solution(int[] arr) {
        int tmpVal;
        List<Integer> integerList = Arrays.stream(arr).boxed().collect(Collectors.toList());
        List<Integer> resultList = new ArrayList<>();

        for(int i = 0; i < integerList.size(); i++){
            tmpVal = integerList.get(i);
            if(i == 0){
                resultList.add(tmpVal);
            }else if( tmpVal != integerList.get(i-1)){
                resultList.add(tmpVal);
            }
        }
        int[] answer = resultList.stream().mapToInt(i->i).toArray();
        return answer;
    }
}
