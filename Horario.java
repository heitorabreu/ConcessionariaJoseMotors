import java.util.Scanner;

public class Horario{
    int hora;
    int minuto;
    Scanner input = new Scanner(System.in);
    
    public Horario(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
    }

    public Horario() {
    }

    public int getHora() {
        return hora;
    }
    public void setHora(int hora) {
        this.hora = hora;
        while(this.hora<0||this.hora>23){
            System.out.println("Hora inválida, digite outra: ");
            this.hora = input.nextInt(); input.nextLine();    
        }
    }

    public int getMinuto() {
        return minuto;
    }
    public void setMinuto(int minuto) {
        this.minuto = minuto;
        while(this.minuto<0||this.minuto>59){
            System.out.println("Minuto inválido, digite outro: ");
            this.minuto = input.nextInt(); input.nextLine();
        }
    }

    
}