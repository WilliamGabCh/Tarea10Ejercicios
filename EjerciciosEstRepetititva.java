package ejerciciosestrepetititva;
import java.util.Scanner;

public class EjerciciosEstRepetititva {
    static Scanner sc=new Scanner(System.in);
    
    static void Numeropares(){
        //cuando ya tiene un inicio y final ya dado
        for(int c=0;c<100;c++){
            if (c%2==0){
                System.out.println("El numero "+c+" es par");
            }
        }
    }
    //profesor
    static void numeroFibonaci(){
      int numAnt=0;
      int numNue=1;
      int numTem=0;
      int contador=1;
      System.out.println("Numero Fibonaci");
      int numFinal=sc.nextInt();
      while(contador<numFinal){
        numTem=numNue;
        numNue=numAnt+numNue;
        numAnt=numTem;     
        contador++;
        //System.out.println("El numero Fibonci es:"+numNue);
      }
      System.out.println("Numero fibonaci de "+numFinal+" es: "+numNue);
    }
     
    static void Fibonacci(){
        int ini, ante=0, fin=0;
        
        System.out.print("Ingrese el número final: ");
        fin=sc.nextInt();
        
        for(ini=1;ini<=fin;ini++){
            ante=ini+ante;
            ini=ante-ini;
            System.out.println(ini);
        }
        
    }
    
    static void Ejercicio1(){
        double salarioFin=1500.0;
        int años=1;     
        while (años<=6) {            
            salarioFin=(salarioFin*0.1)+salarioFin;
            System.out.println("Su salario del año "+años+ " es: "+salarioFin);
            años++;
        }   
    }
    
    static void Ejercicio2(){
        double S=20, D=25, T=28;
        int numHS,numHD, numHT, c=0;
        double precioHS=0,precioHD=0, precioHT=0,total;
        System.out.print("Ingrese la cantidad de Hamburguesas Simples: ");
        numHS=sc.nextInt();
        System.out.print("Ingrese la cantidad de Hamburguesas Dobles: ");
        numHD=sc.nextInt();
        System.out.print("Ingrese la cantidad de Hamburguesas Triples: ");
        numHT=sc.nextInt();    
        while(c < numHS){
            precioHS=S+precioHS;
        c++; }c=0;
        while(c < numHD){
            precioHD=D+precioHD;;
        c++; }c=0;
        while(c < numHT){
            precioHT=T+precioHT;;
        c++; }
        total = precioHS+precioHD+precioHT;
        total=(total*0.05)+total;
        System.out.println("EL precio total es: "+total);
    }
    
    static void Ejercicio3(){
        int cantidad,c=0,cero=0,pos=0,neg=0;
        int num;
        System.out.print("cuantos numeros registrara?: ");
        cantidad=sc.nextInt();
        System.out.println("Escriba "+cantidad+ " números enteros positivos o negativos");
        while(c<cantidad){
            num=sc.nextInt();
            if(num==0){
                cero++;}
            if(num>0){
                pos++;}
            if(num<0){
                neg++;}
            c++;
        }
        System.out.println("Son positivos: "+pos+" numeros");
        System.out.println("Son ngativos: "+neg+" numeros");
        System.out.println("Son cero: "+cero+" numeros");     
    }
    
    static void Ejercicio4(){
        int cantidad,c=0,verde=0,blanco=0,rojo=0;
        char color=' ';
        System.out.print("De cuanto es el lote de focos: ");
        cantidad=sc.nextInt();
        System.out.println("Escriba V = verde, B=blanco, R=rojo ");
        while(c<cantidad){
            System.out.print("El foco es color: ");
            color=sc.next().charAt(0);
            switch(color){
                case 'V':{
                    verde++; break;}
                case 'B':{
                    blanco++; break;}
                case 'R':{
                    rojo++; break;} 
            }   
            c++;  
        }
        System.out.println("Hay : "+verde+" Verdes \nHay : "+blanco+" "
                + "Blancos \nHay : "+rojo+" Rojos");    
    }
    
    static void Ejercicio5(){
        double ahorro=1d, acomulado=0d;
        for(int c=0;c<365;c++){
            ahorro=ahorro*3;
            acomulado=ahorro+acomulado;
            System.out.println("Ahorro del dia "+c+" es: "+ahorro+"$"); 
        }
        System.out.println("El ahorro total es de: "+acomulado+"$");  
    }
    
    static void Ejercicio6_0_do(){
        
        double salarioFin=1500.0;
        int años=1; 
        System.out.println("Ciclo DO");
        do{
            salarioFin=(salarioFin*0.1)+salarioFin;
            System.out.println("Su salario del año "+años+ " es: "+salarioFin);
            años++;
        }   while (años<=6);
        
        System.out.println("Ciclo For");
        salarioFin=1500.0;
        for(años=1;años<=6;años++){
            salarioFin=(salarioFin*0.1)+salarioFin;
            System.out.println("Su salario del año "+años+ " es: "+salarioFin);
        }
        
        
    }
    static void Ejercicio6_1_for(){
        
        double salarioFin=1500.0;
        int años=1; 
        System.out.println("Ciclo DO");
        do{
            salarioFin=(salarioFin*0.1)+salarioFin;
            System.out.println("Su salario del año "+años+ " es: "+salarioFin);
            años++;
        }   while (años<=6);
        
        System.out.println("Ciclo For");
        salarioFin=1500.0;
        for(años=1;años<=6;años++){
            salarioFin=(salarioFin*0.1)+salarioFin;
            System.out.println("Su salario del año "+años+ " es: "+salarioFin);
        }
        
        
    }
    
    static void Ejercicio7_0_while(){
        double S=20, D=25, T=28;
        int numHS,numHD, numHT, c=0;
        double precioHS=0,precioHD=0, precioHT=0,total;
        System.out.print("Ingrese la cantidad de Hamburguesas Simples: ");
        numHS=sc.nextInt();
        System.out.print("Ingrese la cantidad de Hamburguesas Dobles: ");
        numHD=sc.nextInt();
        System.out.print("Ingrese la cantidad de Hamburguesas Triples: ");
        numHT=sc.nextInt();    
        while(c < numHS){
            precioHS=S+precioHS;
        c++; }c=0;
        while(c < numHD){
            precioHD=D+precioHD;;
        c++; }c=0;
        while(c < numHT){
            precioHT=T+precioHT;;
        c++; }
        total = precioHS+precioHD+precioHT;
        total=(total*0.05)+total;
        System.out.println("EL precio total es: "+total);        
    }
    static void Ejercicio7_0_For(){
        double S=20, D=25, T=28;
        int numHS,numHD, numHT, c=0;
        double precioHS=0,precioHD=0, precioHT=0,total;
        System.out.print("Ingrese la cantidad de Hamburguesas Simples: ");
        numHS=sc.nextInt();
        System.out.print("Ingrese la cantidad de Hamburguesas Dobles: ");
        numHD=sc.nextInt();
        System.out.print("Ingrese la cantidad de Hamburguesas Triples: ");
        numHT=sc.nextInt();     
        for(c=0;c < numHS;c++){
            precioHS=S+precioHS; }
        for(c=0;c < numHD;c++){
            precioHD=S+precioHD; }
        for(c=0;c < numHT;c++){
            precioHT=S+precioHT; }
        
        total = precioHS+precioHD+precioHT;
        total=(total*0.05)+total;
        System.out.println("EL precio total es: "+total);        
    }
    
    static void Ejercicio8(){
        int cantArticulos,c=1, c15=0,c12=0,c10=0;
        double descuento15=0, descuento12=0,descuento10=0;
        double precio=0,total15, total12, total10,dsct,p10=0,p12=0,p15=0;
        System.out.print("Ingrese cuantos articulos compro: ");
        cantArticulos=sc.nextInt();
        while(c<=cantArticulos){
            System.out.print("Cuanto costo su articulo "+c+" : ");
            precio=sc.nextDouble();
            if(precio>=200){
                dsct = precio* 0.15;
                descuento15= precio -dsct;
                p15=p15+descuento15;
                System.out.println("su Dscto del articulo "+c+"es: " +dsct);
                c15++;
            }
            else{ if(precio>100 && precio<200){
                    dsct = precio* 0.12;
                    descuento12= precio -dsct;
                    p12=p12+descuento12;
                    System.out.println("su Dscto del articulo "+c+" es : "+dsct);
                    c12++; }
                else{
                    dsct = precio* 0.1;
                    descuento10= precio -dsct;
                    p10=p10+descuento10;
                    System.out.println("su Dscto del articulo "+c+" es : "+dsct);
                    c10++; }
            }
            c++;
        }
        System.out.println("el costo total es: "+ (p10+p12+p15));
    }
    
    static void Ejercicio9(){
        int c=1,cc,mes, años=0;
        double mensual,interes, Cmensual=0, total=0;
        
        
        System.out.print("Cuantos años aporto (minimo un año): ");
        años=sc.nextInt();
        while(c<=años){   
          Cmensual=0;  
          for(mes=1;mes<=12;mes++){
            System.out.print("Deposito año "+c+" del mes "+mes+" : ");
            mensual=sc.nextDouble();
            Cmensual=Cmensual+mensual; 
          }  
        Cmensual=(Cmensual*0.1)+Cmensual; 
        total=total+Cmensual;
        System.out.println("---- La inversón final con interes del año "+c+" es: "+Cmensual+" ----");
        c++;
        }
        System.out.println("---------------EL TOTAL POR "+(c-1)+" AÑOS ES:"+total+"---------------");
        
    }
    
    static void Ejercicio10(){
        int edad, acomuEdad=0, promedio=0, promEdadSalon=0;
        int numDeClases, cc=1, acPromSa=0;
        int numDeAlumnos, ca=1;
        
        System.out.print("N° de Clases de la Escuela: ");
        numDeClases=sc.nextInt();
        while(cc<=numDeClases){
            System.out.print("--N° de Alumnos de la clase "+cc+" : ");
            numDeAlumnos=sc.nextInt();
            acomuEdad=0;
            ca=1;
            while(ca<=numDeAlumnos){
                System.out.print("------Edad del alumno "+ca+" : ");
                edad=sc.nextInt();
                acomuEdad=edad+acomuEdad;
                promEdadSalon=acomuEdad/numDeAlumnos;  
                ca++;
            }
            System.out.println("Promedio Edad "+cc+" : " +promEdadSalon);
            acPromSa=acPromSa+promEdadSalon;
            cc++;
        }  
        promedio=acPromSa+promedio;
        System.out.println("\nPROMEDIO DE EDAD DE TODOS LOS SALONES: "+acPromSa);
    }

    public static void main(String[] args) {
        Ejercicio10();
    }    
}
