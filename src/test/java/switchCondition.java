public class switchCondition {
    public static void main(String[] args){
        int x=4,y=-1;

        switch(x+y){
            case 0:
                System.out.println("Sunday");
                break;

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            default:
                System.out.println("This is a default block");
                break;
        }
        System.out.println("Out of Switch");
    }
}
