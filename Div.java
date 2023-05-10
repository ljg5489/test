
/**
 * 피연산자를 받아 나누기 연산을 하는 클래스.
 * 
 * @author (2022320005_이진규 ) 
 * @version (2023/05/03)
 */
public class Div
{
    private int a;
    private int b;

    public Div(int a, int b){
        setValue(a,b);
    }

    public double calculate(){
        return a/b; 
    }

    public void setValue(int a, int b){
        this.a = a;
        this.b = b;
    }
}
