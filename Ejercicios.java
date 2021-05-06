import java.util.Scanner;

public class Ejercicios {
    static Scanner tc=new Scanner(System.in);

    static void Ejercicio01(){
        int edad;
        System.out.print("Ingrese su edad: ");
        edad=tc.nextInt();
        if (edad>=18){
            System.out.println("SI puede votar");
        } else{
          System.out.println("NO puede votar");;
        }
    }

    static void Ejercicio02(){
        double sueldoHora;
        int totalHoras;
        double pago;
        
        System.out.print("Ingrese su sueldo por hora: ");
        sueldoHora=tc.nextInt();
        System.out.print("Ingrese horas trabajadas semanalmente: ");
        totalHoras=tc.nextInt();
        pago=totalHoras*sueldoHora;
        
        if (totalHoras>40){
            pago = pago+(totalHoras - 40)*(sueldoHora);
            System.out.println("Su suelo es de: "+ pago);
        } else{       
            System.out.println("Su suelo es de: " + pago);;
        }
    }

    static void Ejercicio03(){
        double dinero;

        System.out.print("Cuato dinero tienes: ");
        dinero=tc.nextInt();
        
        if (dinero<=10){
            System.out.println("Puedes regalar una tarjeta!!");
        }    
        else {
            if(dinero>=11 && dinero<=100){
                System.out.println("Puedes regalar Chocolates!!");
            }          
            else{
                if(dinero>=101 && dinero<=250){
                    System.out.println("Puedes regalar flores!!");
                    }
                else{
                    if(dinero>=251){
                        System.out.println("Puedes regalar Anillo!!");
                    } 
                }
            }
        }           
    }    
    
    static void Ejercicio04(){
        double hora;
        double Hora2= 5.0; 
        double Hora3= 4.0; 
        double Hora5= 3.0; 
        double Hora10=2.0; 
        double totalCobrar;
        
        System.out.print("Cuatas horas se estacionara: ");
        hora=tc.nextInt();
        
        if (hora<=2){
            totalCobrar=hora*Hora2;
            System.out.println("Ud Debe: " + totalCobrar);           
        }    
        else {
            if(hora>=3 && hora<=4){
                totalCobrar=hora*Hora3;
                System.out.println("Ud Debe: " + totalCobrar);  
            }          
            else{
                if(hora>=5 && hora<=9){
                    totalCobrar=hora*Hora5;
                    System.out.println("Ud Debe: " + totalCobrar);  
                    }
                else{
                    if(hora>=10){
                        totalCobrar=hora*Hora10;
                        System.out.println("Ud Debe: " + totalCobrar);  
                    } 
                }
            }
        }           
    } 
    
    static void Ejercicio05(){
        int edad1, edad2, edad3;
        String nom1, nom2, nom3;
        
        System.out.print("Ingrese un nombre 1: ");
        nom1=tc.nextLine();
        System.out.print("Ingrese un nombre 2: ");
        nom2=tc.nextLine();
        System.out.print("Ingrese un nombre 3: ");
        nom3=tc.nextLine();      
        
        System.out.print("Ingrese la edad de: "+nom1+": ");
        edad1=tc.nextInt();        
        System.out.print("Ingrese la edad: "+nom2+": ");
        edad2=tc.nextInt();        
        System.out.print("Ingrese la edad: "+nom3+": ");
        edad3=tc.nextInt();
        
        if (edad1 < edad2 && edad1 < edad3){           
            System.out.println(nom1+"tiene la mayor edad");           
        }    
        else {
            if(edad2 < edad1 && edad1 < edad3){
                System.out.println(nom2+"tiene la mayor edad");  
            }          
            else{
                    System.out.println(nom3+" tiene la mayor edad");                  
            }
        }           
    }    
    
    static void Ejercicio06(){
        double precio;
        double descuento=0;
        double pagar=0;

        System.out.print("Cuato cuesta el Artículo: ");
        precio=tc.nextInt();
        
        if (precio>=200){
            descuento=(precio*0.15);
            pagar=precio - descuento ;            
        }    
        else {
            if(precio>=100 && precio<200){
                descuento=(precio*0.12);
                pagar=precio - descuento; 
            }          
            else{
                if(precio<100){
                    descuento=(precio*0.1);
                    pagar=precio - descuento;
                }
            }
        }
        System.out.println("Su descuento es: "+descuento+" TOTAL a PAGAR = "+pagar );
    }    
    
    static void Ejercicio07(){
        int edad;
        double promedio=0;
        double beca=0;
        System.out.print("Ingrese edad: ");
        edad=tc.nextInt();       
        System.out.print("Imgrese promedio: ");
        promedio=tc.nextInt();       
        if (edad>18){           
            if (promedio >= 9){
                System.out.println("Su beca será de S/.2000.00");       
            }
            else{
                if (promedio >= 7.5 && promedio < 9){
                   System.out.println("Su beca será de S/.1000.00");      
                }
                else{
                   if (promedio >= 6 && promedio < 7.5){
                   System.out.println("Su beca será de S/.500.00");    
                   }
                   else{
                       System.out.println("CARTA: Estudien más en el proximo ciclo escolar");
                   }
                }
            }
        }    
        else {
            if (promedio >=9){
                System.out.println("Su beca será de S/.3000.00");    
            }
            else{
                if (promedio >= 8 && promedio<9){
                   System.out.println("Su beca será de S/.2000.00");  
                }
                else{
                   if (promedio >= 6 && promedio <8){
                   System.out.println("Su beca será de S/.1000.00");
                   }
                   else{
                       System.out.println("CARTA");
                   }    
                }
            }
        }
    }    
    
    static void Ejercicio08(){
        int antiguedad;
        double sueldo,bonoAños=0,bonoSueldo=0;
        System.out.print("Ingrese antiguedad: ");
        antiguedad=tc.nextInt();       
        System.out.print("Imgrese sueldo: ");
        sueldo=tc.nextInt();   
        
        //concepto de años
        if (antiguedad>2 && antiguedad<5){           
            bonoAños=sueldo*0.2;      
            }
        else{
            if (antiguedad>5){           
               bonoAños=sueldo*0.3;     
               }
            }
        //concepto por sueldo
        if (sueldo<1000){
            bonoSueldo=sueldo*0.25;
        }
        else {
            if(sueldo>1000 && sueldo<=3500){
            bonoSueldo=sueldo*0.15;
            }
            else{
                if(sueldo>3500){
                bonoSueldo=sueldo*0.10;    
                }
            }
        }
        //cual bono es mayor
        if(bonoAños>bonoSueldo){
            System.out.println("Su bono de Años es de: "+bonoAños);
        }
        else{
            System.out.println("Su bono por Sueldo es de: "+bonoSueldo);
        }          
    }
    
    static void Ejercicio09(){
        double polizaA = 1200.00, polizaB=950.00;
        double total,cargaB,cargaL, cargaEn, cargaEd;
        int poliza;
        int beber,lentes, enfermedad,edad;
        
        System.out.print("Elija su tipo de poliza -Amplia 1200.0 o -Daños a Terceros 950.0 \nCobertura amplia Ingrese: (1) Daños a Terceros Ingrese: (2) : " );
        poliza=tc.nextInt();
        System.out.print("¿Usted Bebe? Escriba: (1)SI y (2)NO: ");
        beber=tc.nextInt();
        System.out.print("¿Usted usa lentes? Escriba: (1)SI y (2)NO: ");
        lentes=tc.nextInt();
        System.out.print("¿Usted tiene alguna enfermedad? Escriba: (1)SI y (2)NO: ");
        enfermedad=tc.nextInt();
        System.out.print("¿Cueantos años tiene? Escriba: ");
        edad=tc.nextInt();
        
        if(poliza==1){
            if(beber==1){
                cargaB= polizaA * 0.1;}
            else{
                cargaB=0.0;}
            
            if(lentes==1){
                cargaL=polizaA*0.05;}
            else{
                cargaL=0.0;}
            
            if(enfermedad==1){
                cargaEn=polizaA*0.05;}
            else{
                cargaEn=0.0;}
            
            if(edad>40){
                cargaEd=polizaA*0.2;}
            else{
                cargaEd=polizaA*0.1;}
            
            total=polizaA+cargaB+cargaL+cargaEn+cargaEd;
        }
        else{
            if(beber==1){
                cargaB= polizaA * 0.1;}
            else{
                cargaB=0.0;}
            
            if(lentes==1){
                cargaL=polizaA*0.05;}
            else{
                cargaL=0.0;}
            
            if(enfermedad==1){
                cargaEn=polizaA*0.05;}
            else{
                cargaEn=0.0;}
            
            if(edad>40){
                cargaEd=polizaA*0.2;}
            else{
                cargaEd=polizaA*0.1;}
            
            total=polizaB+cargaB+cargaL+cargaEn+cargaEd;      
        }
        System.out.println("Usted escogio la poliza "+poliza+" el total es: "+total );
      
    }
    
    static void Ejercicio10(){
        double precioKil=0,totalIda=0, totalIdaVuelta=0; 
        char destino, regreso;
        int Mexico=750, PV=800, Acapulco=1200, Cancun=1800;
        
        System.out.print("precio por Kilometro: ");
        precioKil=tc.nextDouble();
        System.out.print("¿A donde desea ir ? escriba la letra correspondiente\n México (M), P.V (P), Acapulco (A), Cáncun (C): ");
        destino=tc.next().charAt(0);
        System.out.print("¿Desea Regresar ?  Si(S) No(N): ");
        regreso=tc.next().charAt(0);
        
        switch(destino){
          case 'M':{
               totalIda=Mexico*precioKil;
          } break;
          case 'P':{
               totalIda=PV*precioKil;
          } break;
          case 'A':{
               totalIda=Acapulco*precioKil;
          } break;
          case 'C':{
               totalIda=Cancun*precioKil;
          } break;
          default : System.out.println("El area que ingreso no existe ");
          break;    
        }
        if(regreso=='S'){
            totalIdaVuelta=totalIda*2;
            System.out.println("El costo de ida será: "+totalIdaVuelta);
        }
        else{
            System.out.println("El costo de ida y vuelta será: "+totalIda);
        }  
    }
    
    static void Ejercicio11(){
        double bono=0;
        int años;
        System.out.println("Ingrese cuantos años esta en la empresa");
        años = tc.nextInt();
        switch(años){
            case 1:{
                bono=100.0;
            } break;
            case 2:{
                bono=200.0;
            } break;
            case 3:{
                bono=300.0;
            } break;
            case 4:{
                bono=400.0;
            } break;  
        } 
        if(años>4){
            bono=1000.0;
        }
        System.out.println("Su bono es de: "+bono);      
    }
    
    static void Ejercicio12(){
        int horasTrabajo, horaExtra;
        double sueldo=0, sueldohora, sueldototal;
        System.out.println("Sueldo semanal: ");
        sueldo=tc.nextFloat();
        sueldohora=sueldo/40;      
        System.out.print("Horas que trabajo en la semana: ");
        horasTrabajo=tc.nextInt();
        
        if(horasTrabajo<40){
            sueldototal=(sueldohora*horasTrabajo)+sueldo;
            System.out.println("Su sueldo es: "+sueldototal);
        }
        if(horasTrabajo>40 && horasTrabajo<=45){
            horaExtra=horasTrabajo-40;
            sueldototal=(horaExtra*(sueldohora*2))+sueldo;
            System.out.println("Su sueldo es: "+sueldototal);
        }
        if(horasTrabajo>=46 && horasTrabajo<=50){
            horaExtra=horasTrabajo-40;
            sueldototal=(horaExtra*(sueldohora*3))+sueldo;
            System.out.println("Su sueldo es: "+sueldototal);
        }
        if(horasTrabajo>50){
            System.out.println("Esta prohibido trabajar 50 horas");;
        } 
    }
 
    public static void main(String[]arg){
        Ejercicio01();
    }   
}