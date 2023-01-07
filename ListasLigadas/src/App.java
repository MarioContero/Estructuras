import java.util.Scanner;

public class App {
   private List lst;
   private int info =11;
   private Scanner sc; 
   private String menu;
   private int initialInfo=0;

    public App(){
            this.lst = new List();
            this.sc = new Scanner (System.in);
            this.menu =
            "Listas enlazadas simples \n"+
            "1. Crear lista \n"+
            "2. Imprimir lista \n"+
            "3. Agregar nodos al inicio \n"+
            "4.  Agregar nodos al final \n"+
            "5. Buscar Nodo \n"+
            "6. Borrar Nodo inicial \n"+
            "7. Borrar Nodo final \n"+
            "8. salir/n";
    }
        
        public void displayMenu(){
         int number=0;
         do{
            System.out.println(menu);
            number= sc.nextInt();
         switch (number){
                case 1:this.crateList(); 
                break;  
                case 2:System.out.println(this.lst.print());
                break;
                case 3:this.unshiftNode();
                break;
                case 4:this.pushNode();
                break;
                case 5:this.searchNode();
                break;
                case 6:this.shiftNode();
                break;
                case 7:this.poptNode();
                break;
                case 8:System.out.println("Adios");
                default: System.out.println("opcion incorrecta");
                break;
             }
            }while (number !=8);
            }
        
/***
 * crear lis
 */
public void crateList(){
    this.lst = new List();
    for (int info=1; info <=10; info ++)
    this.lst.push(info);
    System.out.println(this.lst.print());
}
/***
 * Agregar nodo al inicio
 */

 public void unshiftNode(){
  this.lst.unshift(initialInfo);
  --initialInfo;
  System.out.println(this.lst.print());

 }
/***
 * agregar nodo al final
 */

 public void pushNode(){
    this.lst.push(info);
    System.out.println(this.lst.print());
 }
/***
 * buscar nodo
 */
public void searchNode(){
    int n= 0;
    System.out.println("digita el numero a buscar");
    n=sc.nextInt();
    if (this.lst.search(n)){
        System.out.println("valor encontrado");
           }
    else {
        System.out.println("Valor no encontrado");
    }
    System.out.println(this.lst.print());
}

    public void shiftNode(){
        if (this.lst.shift()){
          System.out.println("nodo eliminado");  }
        else{
            System.out.println("Valor no encontrado");
        }
        System.out.println(this.lst.print());
    }
    public void poptNode(){
        if (this.lst.pop()){
          System.out.println("nodo eliminado");  }
        else{
            System.out.println("Valor no encontrado");
        }
        System.out.println(this.lst.print());
    }

    public static void main(String[] args) throws Exception {
        App list = new App();
        list.displayMenu();}
}


