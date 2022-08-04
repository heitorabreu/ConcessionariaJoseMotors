import java.util.Scanner;

public class Data{
    Scanner input = new Scanner(System.in);
    private int dia;
    private int mes;
    private int ano;

    public Data() {
    }

    public void setDia(){        
        do{            
            this.dia = input.nextInt(); input.nextLine();
            if(this.dia<1 || this.dia>31)
                System.out.println("\nDia inválido.");
        }while(this.dia<1 || this.dia>31);
    }

    public int getDia(){
        return this.dia;
    }

    public void setMes() {
        do{
            this.mes = input.nextInt(); input.nextLine();
            if(this.mes<1 || this.mes>12)
                System.out.println("\nMês inválido");
        }while(this.mes<1 || this.mes>12);
    }

    public int getMes() {
        return this.mes;        
    }

    public void setAno(){
        do{
            this.ano = input.nextInt(); input.nextLine();
            if(this.ano<1950 || this.ano>2050)
                System.out.println("\nAno inválido");
        }while(this.ano<1950 || this.ano>2050);
    }

    public int getAno() {
        return this.ano;
    }
}