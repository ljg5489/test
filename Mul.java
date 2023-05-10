/**
 * 피연산자를 받아 곱하기 연산을 하는 클래스.
 * 
 * @author (2022320005_이진규 ) 
 * @version (2023/05/03)
 */
public class Mul
{
    private int a;
    private int b;
    
    public Mul(int a, int b){
        setValue(a,b);
    }
    
    public int calculate(){
        return a*b; 
    }
    
    public void setValue(int a, int b){
        this.a = a;
        this.b = b;
    }
}
