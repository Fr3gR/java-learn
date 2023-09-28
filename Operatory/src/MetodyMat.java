public class MetodyMat {
    public static void main(String[] args) {
        System.out.println(Math.pow(2,3));
        System.out.println(Math.sqrt(-10));

        System.out.println("round: "+Math.round(11.3));
        System.out.println("ceil: "+Math.ceil(11.3));
        System.out.println("floor: "+Math.floor(11.3));

        double a=23.4;
        double b=12;
        double c;
        c=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        //c+Math.sqrt((a*a)+(b*b));
        System.out.println("c: "+c);
    }
}
