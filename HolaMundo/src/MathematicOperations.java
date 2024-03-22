public class MathematicOperations {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;

        //Número PI
        double mPI = Math.PI;
        System.out.println("Número PI " + mPI);

        //redondeo superior
        double mCeil = Math.ceil(2.1);
        System.out.println("Redondeo superior " + mCeil);

        //redondeo inferior
        double mFloor = Math.floor(2.4);
        System.out.println("Redondeo inferior " + mFloor);

        //potencia
        double mPow = Math.pow(x,y);
        System.out.println("Potencia " + mPow);

        //number max
        double numberMax = Math.max(x,y);
        System.out.println("El número mayor de " + x + " y " + y + " es " + numberMax);

        //number min
        double numberMin = Math.min(x,y);
        System.out.println("El número menor de " + x + " y " + y + " es " + numberMin);

        //raiz cuadrada
        double mSqrt = Math.sqrt(4);
        System.out.println(mSqrt);

        //area de circulo
        int radio = 4;
        double aCircle = (Math.PI)*(Math.pow(radio,2));
        System.out.println("El área del circulo es " + aCircle);

        //area de una esfera: 4*PI*r2
        int radioEsfera = 2;
        double aEsfera = 4*(Math.PI)*Math.pow(radioEsfera,2);
        System.out.println("El área de una esfera " + aEsfera);

        //volumen de una esfera: (4/3)*PI*r3
        double vEsfera = (4/3)*(Math.PI)*Math.pow(radioEsfera,3);
        System.out.println("El volumen de una esfera " + vEsfera);

    }
}
