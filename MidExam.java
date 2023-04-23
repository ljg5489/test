
/**
 * 여기에 MidExam 클래스 설명을 작성하십시오.
 * 
 * @author (2022320005_이진규) 
 * @version (2023/04/21)
 */
public class MidExam
{
    public static void main(String[] args){
        int [][] raggedArray = makeArray();
        int longestRowLength = findLongestRowLength(raggedArray);
        calculateArray(raggedArray, longestRowLength);
    }

    public static int[][] makeArray(){
        int raggedArray[][]={{77,47,73,98},{94,92},{28,64,83},{34,78,91,55}};
        return raggedArray;
    }

    public static int findLongestRowLength(int[][] raggedArray){
        int longestRowLength = raggedArray[0].length;
        for(int[] array : raggedArray){
            longestRowLength = (longestRowLength <= array.length)
            ? (array.length) : (longestRowLength);
        }
        return longestRowLength;
    }

    public static void calculateArray(int[][] array, int row) {
        for (int j = 0; j < row; j++) {
            int sum = 0;
            int n = 0;
            double average = 0.0;
            int i = 0;

            do {
                try{
                    n += 1;
                    sum += array[i][j];
                    i++;
                }catch(ArrayIndexOutOfBoundsException e){
                    i++;
                    continue;
                }
            } while (i <array.length && j < array.length);

            average = (double) sum / n;
            
            System.out.println((j + 1) + "번째 열 : 합 = " + sum + "    평균 = " + average);
        } 
    }
}

