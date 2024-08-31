public class methods {
    int a =5;

    void a(){ //returnType methodName(){}
        System.out.println("hello world!!");
    }

    void b(){
        System.out.println(2+3);
    }

    void c(int x){ //Parameterized Method
        System.out.println(x+3);
    }

    void d(int x, float y){
        System.out.println(x+y);
    }

    public static void main(String[] args){
        methods m = new methods();
        m.a(); //Method call
        System.out.println(m.a); //Variable call
        m.b();
        m.b();
        m.c(6);
        m.c(1);
        m.c(0);
        m.d(1,1.2f);
    }
}
