public class methodOverloadingP {

    void a(){
        System.out.println("Void a()");
    }

    void a(int x){
        System.out.println(x);
    }

    void a(float y){
        System.out.println(y);
    }

    void a(char z){
        System.out.println(z);
    }

    int a(int x, int y){
        return x*y;
    }

    public static void main(String[] args){
        methodOverloadingP om = new methodOverloadingP();
        om.a();
        om.a('z');
        om.a(2);
        om.a(1.3f);
        System.out.println(om.a(1,2));
    }
}

/*
Having more than 1 method with same method name but different
parameters/arguments inside the same class is Method overloading.

Method overloading is not dependant on return type.
 */