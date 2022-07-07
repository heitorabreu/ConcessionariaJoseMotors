import java.util.Scanner;

public class Data{
    Scanner input = new Scanner(System.in);
    private int dia;
    private int mes;
    private int ano;

    public void setDia(){
        do{
            dia = input.nextInt(); input.nextLine();
        }while(dia<1 || dia>31);
    }

    public int getDia(){
        return this.dia;
    }

    public void setMes() {
        do{
            mes = input.nextInt(); input.nextLine();
        }while(mes<1 || mes>12);
    }

    public int getMes() {
        return this.mes;        
    }

    public void setAno(){
        do{
            ano = input.nextInt(); input.nextLine();
        }while(ano<1950 || ano>2050);
    }

    public int getAno() {
        return this.ano;
    }
}