@FunctionalInterface
interface AddInterface{
void add(int a,int b);
}

public class LamdaExpressions{
public static void main(String ar[]){
AddInterface add = (a,b)->{
system.out.println(a+b);
};
add.add(20,10);
}
}
