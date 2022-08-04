import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

//Heitor Xavier de Abreu
//Vitor Emanuel da Silva Rozeno
//João Lucas Alves da Silva Lima

import java.io.*;
import java.util.*;

public class Concessionaria {

    public static void main(String[] args) {
        // Declarando as listas que serão usadas no programa
        ArrayList<Gerente> listaGerentes = new ArrayList<>();
        ArrayList<Vendedor> listaVendedores = new ArrayList<>();
        ArrayList<Carro> listaCarros = new ArrayList<>();
        ArrayList<Motocicleta> listaMotos = new ArrayList<>();
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        ArrayList<Venda> listaVendas = new ArrayList<>();
        int i = 0, tam;

        try (Scanner input = new Scanner(System.in)) {
            int op, op1;
            int senha, flag = 0;

            // Senha para gerentes: 123
            do {
                System.out.println("\n\tMENU PRINCIPAL");
                System.out.println("\n1 - Gerente");
                System.out.println("\n2 - Vendedor");
                System.out.println("\n0 - Sair");
                System.out.println("\nDigite a opcao: ");
                op = input.nextInt();
                input.nextLine();

                // -------------------------------------------------------------------------------------
                // OPERAÇÕES PARA GERENTES
                if (op == 1) {// Menu de gerente
                    do {

                        // Sistema de senha para gerentes
                        System.out.println("\nDigite a senha: ");
                        senha = input.nextInt();
                        input.nextLine();
                        if (senha != 123) {
                            System.out.println("\nSenha incorreta.");
                            flag++;// Variável que permite no máximo 3 tentativas para a senha
                        }

                    } while (flag < 3 && senha != 123);

                    if (flag == 3) {
                        System.out.println("\nNumero maximo de tentativas atingido");
                        continue;
                    }

                    do {
                        System.out.println("\n1 - CADASTRA GERENTE");
                        System.out.println("\n2 - ALTERA CADASTRO DE GERENTE");
                        System.out.println("\n3 - EXCLUI CADASTRO DE GERENTE");
                        System.out.println("\n4 - MENU DE GERENTE");
                        System.out.println("\n0 - SAIR");
                        System.out.println("\nDigite a opcao: ");
                        op1 = input.nextInt();
                        input.nextLine();
                        if (op1 == 1) {
                            Gerente gerente = new Gerente();
                            gerente.cadastraGerente();
                            listaGerentes.add(gerente);
                        }

                        else if (op1 == 2) {
                            // Gerente gerente;
                            alteraGerente(listaGerentes);
                        }

                        else if (op1 == 3) {
                            excluiGerente(listaGerentes);
                        }

                        else if (op1 == 4) {
                            menuGerente(listaCarros, listaMotos, listaClientes, listaVendas, listaVendedores, listaGerentes);
                        }

                    } while (op1 != 0);
                }
                // FIM OPERAÇÕES GERENTES
                // -------------------------------------------------------------------------------------

                // -------------------------------------------------------------------------------------
                // OPERAÇÕES VENDEDORES
                else if (op == 2) {
                    menuVendedor(listaCarros, listaMotos, listaClientes, listaVendas, listaVendedores);
                }
                // FIM OPERAÇÕES VENDEDORES
                // -------------------------------------------------------------------------------------

            } while (op != 0);
        }

        // -------------------------------------------
        // Escrevendo nos arquivos

        try {
            File carros;
            carros = new File("carros_concessionaria.txt");
            FileWriter escritor = new FileWriter(carros, true);
            tam = listaCarros.size();
            escritor.write("\nLISTA DE CARROS:\n");
            while (i < tam) {
                escritor.write("\n====================================================\n");
                escritor.write("Marca: " + listaCarros.get(i).getMarca() + " Modelo: " + listaCarros.get(i).getModelo()
                        + "\n");
                escritor.write(
                        "Ano: " + listaCarros.get(i).getAno() + " Quilometragem: " + listaCarros.get(i).getKm() + "\n");
                escritor.write("Num Chassi: " + listaCarros.get(i).getNumChassi() + " Num Cilindros: "
                        + listaCarros.get(i).getNumCilindros() + " ");
                escritor.write("Num Ocupantes: " + listaCarros.get(i).getNumOcupantes() + " Peso:"
                        + listaCarros.get(i).getPeso() + "\n");
                escritor.write("Potencial: " + listaCarros.get(i).getPotencia() + " Tipo: "
                        + listaCarros.get(i).getTipo() + "\n");
                escritor.write("Tipo Combustivel: " + listaCarros.get(i).getTipoCombustivel() + "\n");
                escritor.write("Dimensoes: " + listaCarros.get(i).getDimensoes().getAltura() + "m de altura, "
                        + listaCarros.get(i).getDimensoes().getComprimento() + "m de comprimento e ");
                escritor.write(listaCarros.get(i).getDimensoes().getLargura() + "m de largura.");
                escritor.write("\n====================================================\n");
                i++;
                escritor.close();
            }

        } catch (IOException e) {
            System.out.println("\nErro carros");
        }

        try {
            File motos;
            i = 0;
            motos = new File("motos_concessionaria.txt");
            FileWriter escritor = new FileWriter(motos, true);
            tam = listaMotos.size();
            Motocicleta moto;
            escritor.write("\nLISTA DE MOTOS:\n");
            while (i < tam) {
                escritor.write("\n====================================================\n");
                moto = listaMotos.get(i);
                escritor.write("Marca: " + moto.getMarca() + " Modelo: " + moto.getModelo() + "\n");
                escritor.write("Ano: " + moto.getAno() + " Quilometragem: " + moto.getKm() + "\n");
                escritor.write("Num Chassi: " + moto.getNumChassi() + " Peso: " + moto.getPeso() + "\n");
                escritor.write("Tipo: " + moto.getTipo() + " Tipo de Combustivel: " + moto.getTipoCombustivel());
                escritor.write("\n====================================================\n");
                i++;
                escritor.close();
            }

        } catch (IOException e) {
            System.out.println("\nErro motos");
        }

        try {
            File gerente;
            i = 0;
            gerente = new File("gerente_concessionaria.txt");
            FileWriter escritor = new FileWriter(gerente, true);
            tam = listaGerentes.size();
            Gerente g;
            escritor.write("\nLISTA DE GERENTES\n");
            while (i < tam) {
                escritor.write("\n====================================================\n");
                g = listaGerentes.get(i);
                escritor.write("Nome: " + g.getNome() + " RG: " + g.getRg() + "\n");
                escritor.write("Anos de Exp: " + g.getAnosExp() + " Salario: " + g.getSalario() + "\n");
                escritor.write("Data de admissao: " + g.getAdmissao().getDia() + "/" + g.getAdmissao().getMes() + "/"
                        + g.getAdmissao().getAno() + "\n");
                escritor.write("Data de nascimento: " + g.getNascimento().getDia() + "/" + g.getNascimento().getMes()
                        + "/" + g.getNascimento().getAno());
                escritor.write("\n====================================================\n");
                i++;
                escritor.close();
            }

        } catch (IOException e) {
            System.out.println("\nErro gerente");
        }

        try {
            File clientes;
            i = 0;
            clientes = new File("clientes_concessionaria.txt");
            FileWriter escritor = new FileWriter(clientes, true);
            tam = listaClientes.size();
            escritor.write("\nLISTA DE CLIENTES:\n");
            while (i < tam) {
                escritor.write("\n====================================================\n");
                escritor.write("Nome: " + listaClientes.get(i).getNome() + " Data de Nascimento: "
                        + listaClientes.get(i).getNascimento().getDia()+"/"+listaClientes.get(i).getNascimento().getMes()+"/"+listaClientes.get(i).getNascimento().getAno() + "\n");
                escritor.write("Endereco: " + listaClientes.get(i).getEndereco().getRua() + ", " 
                        + listaClientes.get(i).getEndereco().getNumero() + " Cidade: "+ listaClientes.get(i).getEndereco().getCidade() + 
                        " CEP: "+listaClientes.get(i).getEndereco().getCep()+"\nRenda: "
                        + listaClientes.get(i).getRenda() + "\n");
                escritor.write("Dependentes: " +
                        listaClientes.get(i).getDependentes());

                escritor.write("\n====================================================\n");
                i++;
                escritor.close();
            }

        } catch (IOException e) {
            System.out.println("\nErro clientes");
        }

        try {
            File vendedor;
            i = 0;
            vendedor = new File("vendedor_concessionaria.txt");
            FileWriter escritor = new FileWriter(vendedor, true);
            tam = listaVendedores.size();
            Vendedor v;
            escritor.write("\nLISTA DE VENDEDORES:\n");
            while (i < tam) {
                v = listaVendedores.get(i);
                escritor.write("\n====================================================\n");
                escritor.write(
                        "Nome: " + v.getNome() + " Horas de Treino restantes: " + v.getHorasTreinoRestantes() + "\n");
                escritor.write("RG: " + v.getRg() + " Salario: " + v.getSalario() + "\n");
                escritor.write("Data de Admissao: " + v.getAdmissao().getDia() + "/" + v.getAdmissao().getMes() + "/"
                        + v.getAdmissao().getAno() + "\n");
                escritor.write(
                        "Data de Nascimento: " + v.getNascimento().getDia() + "/" + v.getNascimento().getMes() + "/"
                                + v.getNascimento().getAno());
                escritor.write("\n====================================================\n");
                i++;
                escritor.close();
            }

        } catch (IOException e) {
            System.out.println("\nErro vendedor");
        }
    }

    // ------------------------------------------------------------------------------------------------------------
    // FUNÇÕES DE MENU GERENTE E VENDEDOR

    public static void menuGerente(ArrayList<Carro> listaCarros, ArrayList<Motocicleta> listaMotos,
            ArrayList<Cliente> listaClientes, ArrayList<Venda> listaVendas, ArrayList<Vendedor> listaVendedores, ArrayList<Gerente> listaGerentes) {
        
        Scanner input = new Scanner(System.in);
        int op;
        System.out.println("\n\tMENU GERENTES");
        System.out.println("\n1 - Veiculos");
        System.out.println("\n2 - Clientes");
        System.out.println("\n3 - Vendas");
        System.out.println("\n4 - Vendedores");
        System.out.println("\n0 - Sair");
        System.out.println("\nDigite a opcao: ");
        op = input.nextInt();
        input.nextLine();

        if (op == 1)
            veiculos(listaCarros, listaMotos);
        
        else if (op == 2)
            clientes(listaClientes);

        else if (op == 3)
            visualizaVendas(listaVendas);

        else if (op == 4)
            vendedores(listaVendedores, listaGerentes);

    }

    public static void menuVendedor(ArrayList<Carro> listaCarros, ArrayList<Motocicleta> listaMotos,
            ArrayList<Cliente> listaClientes, ArrayList<Venda> listaVendas, ArrayList<Vendedor> listaVendedores) {
        Scanner input = new Scanner(System.in);
        int op;
        System.out.println("\n\tMENU VENDEDORES");
        System.out.println("\n1 - Veiculos");
        System.out.println("\n2 - Clientes");
        System.out.println("\n3 - Vendas");
        System.out.println("\n0 - Sair");
        System.out.println("\nDigite a opcao: ");
        op = input.nextInt();
        input.nextLine();

        if (op == 1){
            if(!listaCarros.isEmpty())
                System.out.println("\nCarros cadastrados: ");
            for(Carro c: listaCarros){
                System.out.printf("\nMarca: %s - Modelo: %s - Ano: %d - Km: %d - Vendido: %b%n\n", c.getMarca(), c.getModelo(), c.getAno(), c.getKm(), c.isVendido());
            }
            if(!listaMotos.isEmpty())
                System.out.println("\nMotos cadastradas: ");
            for(Motocicleta m: listaMotos){
                System.out.printf("\nMarca: %s - Modelo: %s - Ano: %d - Km: %d - Vendido: %b%n\n", m.getMarca(), m.getModelo(), m.getAno(), m.getKm(), m.isVendido());
            }
        }

        else if (op == 2){
            if(!listaClientes.isEmpty())
                System.out.println("\nClientes cadastrados: ");
            for(Cliente c: listaClientes){
                System.out.printf("\nNome: %s - Endereço: %s, %d", c.getNome(), c.getEndereco().getRua(), c.getEndereco().getNumero());
            }
        }

        else if (op == 3)
            vendas(listaVendas, listaVendedores, listaClientes, listaCarros, listaMotos);

        else
            return;
    }
    // FIM DAS FUNÇÕES DE MENU GERENTE E VENDEDOR
    // ------------------------------------------------------------------------------------------------------------

    // -----------------------------------------------------------------------------------------------------
    // FUNCOES PARA ALTERACAO E EXCLUSAO DE GERENTES
    public static void alteraGerente(ArrayList<Gerente> listaGerentes) {
        // Método que recebe uma lista de gerentes e retorna uma lista
        // modificada

        // Caso a lista esteja vazia encerra o metodo
        if (listaGerentes.isEmpty()) {
            System.out.println("\nNão ha nenhum gerente cadastrado");
            return;
        }

        int i = 1;
        Scanner input = new Scanner(System.in);

        // Exibição da lista de gerentes
        for (Gerente g : listaGerentes) {
            System.out.printf("[%d] - Nome: %s - Experiencia: %d anos - Admissão: %d/%d/%d",
                    i, g.getNome(), g.getAnosExp(), g.getAdmissao().getDia(),
                    g.getAdmissao().getMes(), g.getAdmissao().getAno());
            i++;
        }

        System.out.println("\nDigite o indice do gerente que deseja alterar: ");
        i = input.nextInt();
        input.nextLine();
        i--;

        // Caso o índice nao exista, encerra o metodo
        if (i < 0 || i > listaGerentes.size()) {
            System.out.println("\nIndice invalido");
            return;
        }

        Gerente ref = listaGerentes.get(i);
        ref.alteraGerente();

        listaGerentes.set(i, ref);

        return;
    }

    public static void excluiGerente(ArrayList<Gerente> listaGerentes) {
        // Método que recebe uma lista de gerentes e retorna
        // uma lista com um objeto removido

        // Caso a lista esteja vazia encerra o método
        if (listaGerentes.isEmpty()) {
            System.out.println("\nNão ha nenhum gerente cadastrado");
            return;
        }

        int i = 1;
        Scanner input = new Scanner(System.in);

        // Exibição da lista de gerentes
        for (Gerente g : listaGerentes) {
            System.out.printf("[%d] - Nome: %s - Experiencia: %d anos - Admissão: %d/%d/%d\n",
                    i, g.getNome(), g.getAnosExp(), g.getAdmissao().getDia(),
                    g.getAdmissao().getMes(), g.getAdmissao().getAno());
            i++;
        }

        System.out.println("\nDigite o indice do gerente que deseja remover: ");
        i = input.nextInt();
        input.nextLine();
        i--;

        // Caso o índice não exista, encerra o método
        if (i < 0 || i > listaGerentes.size()) {
            System.out.println("\nIndice invalido");
            return;
        }

        // Remoção da lista
        listaGerentes.remove(i);

        return;
    }
    // FIM DAS FUNCOES PARA ALTERACAO E EXCLUSAO DE GERENTES
    // -----------------------------------------------------------------------------------------------------

    // -----------------------------------------------------------------------------------------------------
    // FUNÇÕES PARA ALTERACAO E EXCLUSAO DE CARROS
    public static void alteraCarro(ArrayList<Carro> listaCarros) {
        if (listaCarros.isEmpty()) {
            System.out.println("\nNenhum carro cadastrado.");
            return;
        }

        int i = 1;
        Scanner input = new Scanner(System.in);

        // Exibição da lista de gerentes
        for (Carro g : listaCarros) {
            System.out.printf("[%d] - Marca: %s - Modelo: %s - Ano: %d\n", i, g.getMarca(), g.getModelo(), g.getAno());
            i++;
        }

        System.out.println("\nDigite o indice do carro que deseja alterar: ");
        i = input.nextInt();
        input.nextLine();
        i--;

        // Caso o índice nao exista, encerra o metodo
        if (i < 0 || i > listaCarros.size()) {
            System.out.println("\nIndice invalido");
            return;
        }

        Carro ref = listaCarros.get(i);
        ref.alteraCarro();

        listaCarros.set(i, ref);
        return;
    }

    public static void excluiCarro(ArrayList<Carro> listaCarros) {
        // Método que recebe uma lista de gerentes e retorna
        // uma lista com um objeto removido

        // Caso a lista esteja vazia encerra o método
        if (listaCarros.isEmpty()) {
            System.out.println("\nNão ha nenhum carro cadastrado");
            return;
        }

        int i = 1;
        Scanner input = new Scanner(System.in);

        // Exibição da lista de gerentes
        for (Carro g : listaCarros) {
            System.out.printf("[%d] - Marca: %s - Modelo: %s - Ano: %d\n", i, g.getMarca(), g.getModelo(), g.getAno());
            i++;
        }

        System.out.println("\nDigite o indice do carro que deseja remover: ");
        i = input.nextInt();
        input.nextLine();
        i--;

        // Caso o índice não exista, encerra o método
        if (i < 0 || i > listaCarros.size()) {
            System.out.println("\nIndice nao existe.");
            return;
        }

        // Remoção da lista
        listaCarros.remove(i);
        return;
    }
    // FIM DAS FUNCOES PARA ALTERACAO E EXCLUSAO DE CARROS
    // -----------------------------------------------------------------------------------------------------

    // -----------------------------------------------------------------------------------------------------
    // FUNCOES PARA ALTERACAO E EXCLUSAO DE MOTOCICLETAS
    public static void alteraMotocicleta(ArrayList<Motocicleta> listaMotos) {
        if (listaMotos.isEmpty()) {
            System.out.println("\nNenhuma motocicleta cadastrada.");
            return;
        }

        int i = 1;
        Scanner input = new Scanner(System.in);

        // Exibição da lista de gerentes
        for (Motocicleta g : listaMotos) {
            System.out.printf("[%d] - Marca: %s - Modelo: %s - Ano: %d\n", i, g.getMarca(), g.getModelo(), g.getAno());
            i++;
        }

        System.out.println("\nDigite o indice da motocicleta que deseja alterar: ");
        i = input.nextInt();
        input.nextLine();
        i--;

        // Caso o índice nao exista, encerra o metodo
        if (i < 0 || i > listaMotos.size()) {
            System.out.println("\nIndice invalido");
            return;
        }

        Motocicleta ref = listaMotos.get(i);
        ref.alteraMotocicleta();

        listaMotos.set(i, ref);
        return;
    }

    public static void excluiMotocicleta(ArrayList<Motocicleta> listaMotos) {
        // Método que recebe uma lista de gerentes e retorna
        // uma lista com um objeto removido

        // Caso a lista esteja vazia encerra o método
        if (listaMotos.isEmpty()) {
            System.out.println("\nNão ha nenhuma motocicleta cadastrada.");
            return;
        }

        int i = 1;
        Scanner input = new Scanner(System.in);

        // Exibição da lista de gerentes
        for (Motocicleta g : listaMotos) {
            System.out.printf("[%d] - Marca: %s - Modelo: %s - Ano: %d\n", i, g.getMarca(), g.getModelo(), g.getAno());
            i++;
        }

        System.out.println("\nDigite o indice da motocicleta que deseja remover: ");
        i = input.nextInt();
        input.nextLine();
        i--;

        // Caso o índice não exista, encerra o método
        if (i < 0 || i > listaMotos.size()) {
            System.out.println("\nIndice invalido");
            return;
        }

        // Remoção da lista
        listaMotos.remove(i);
        return;
    }
    // FIM DAS FUNCOES PARA ALTERACAO E EXCLUSAO DE MOTOCICLETAS
    // -----------------------------------------------------------------------------------------------------

    // -----------------------------------------------------------------------------------------------------
    // FUNCOES DE MENU PARA VEICULOS
    public static void veiculos(ArrayList<Carro> listaCarros, ArrayList<Motocicleta> listaMotos) {
        // Cadastra, altera ou exclui um Veiculo
        Scanner input = new Scanner(System.in);
        int op/* , tipo */;
        System.out.println("\n\tMENU VEICULOS");
        System.out.println("\n1 - Carros");
        System.out.println("\n2 - Motocicletas");
        System.out.println("\n0 - Sair");
        System.out.println("\nDigite sua opção: ");
        op = input.nextInt();
        input.nextLine();

        if (op == 1) {
            menuCarros(listaCarros);

        } else if (op == 2) {
            menuMotocicletas(listaMotos);
        } else
            return;

    }

    public static void menuCarros(ArrayList<Carro> listaCarros) {
        int op;
        Scanner input = new Scanner(System.in);
        System.out.println("\n\tCARROS");
        System.out.println("\n1 - Cadastrar novo carro");
        System.out.println("\n2 - Alterar um carro");
        System.out.println("\n3 - Excluir um carro");
        System.out.println("\n0 - Sair");
        op = input.nextInt();
        input.nextLine();

        if (op == 1) {
            Carro carro = new Carro();
            carro.cadastraCarro();
            listaCarros.add(carro);
        } else if (op == 2) {
            alteraCarro(listaCarros);
        } else if (op == 3) {
            excluiCarro(listaCarros);
        }

    }

    public static void menuMotocicletas(ArrayList<Motocicleta> listaMotos) {
        int op;
        Scanner input = new Scanner(System.in);
        System.out.println("\n\tMOTOCICLETAS");
        System.out.println("\n1 - Cadastrar nova motocicleta");
        System.out.println("\n2 - Alterar uma motocicleta");
        System.out.println("\n3 - Excluir uma motocicleta");
        System.out.println("\n0 - Sair");
        op = input.nextInt();
        input.nextLine();

        if (op == 1) {
            Motocicleta moto = new Motocicleta();
            moto.cadastraMotocicleta();
            listaMotos.add(moto);
        } else if (op == 2) {
            alteraMotocicleta(listaMotos);
        } else if (op == 3) {
            excluiMotocicleta(listaMotos);
        } else
            return;
    }
    // FIM DAS FUNCOES DE MENU PARA VEICULOS
    // -----------------------------------------------------------------------------------------------------

    // -----------------------------------------------------------------------------------------------------
    // FUNÇOES PARA CLIENTES
    public static void clientes(ArrayList<Cliente> listaClientes) {
        // Cadastra, altera ou exclui um objeto da classe Clientes
        int op;
        Scanner input = new Scanner(System.in);
        System.out.println("\n\tCLIENTES");
        System.out.println("\n1 - Cadastrar novo cliente");
        System.out.println("\n2 - Alterar cadastro de cliente");
        System.out.println("\n3 - Excluir cadastro de cliente");
        System.out.println("\n0 - Sair");
        System.out.println("\nDigite sua opção: ");
        op = input.nextInt();
        input.nextLine();

        if (op == 1) {
            Cliente cliente = new Cliente();
            cliente.cadastraCliente();
            listaClientes.add(cliente);
        } else if (op == 2) {
            alteraCliente(listaClientes);
        } else if (op == 3) {
            excluiCliente(listaClientes);
        }

    }

    public static void alteraCliente(ArrayList<Cliente> listaClientes) {
        if (listaClientes.isEmpty()) {
            System.out.println("\nNenhum cliente cadastrado.");
            return;
        }
        int i = 1;
        Scanner input = new Scanner(System.in);
        for (Cliente c : listaClientes) {
            System.out.printf("\n[%d] - Nome: %s - Cidade: %s", i, c.getNome(), c.getEndereco().getCidade());
            i++;
        }

        System.out.println("\nDigite o índice do cliente que deseja alterar: ");
        i = input.nextInt();
        input.nextLine();
        i--;

        if (i < 0 || i > listaClientes.size()) {
            System.out.println("Indice inválido");
            return;
        }

        Cliente ref = listaClientes.get(i);

        ref.alteraCliente();
        listaClientes.set(i, ref);
    }

    public static void excluiCliente(ArrayList<Cliente> listaClientes) {
        if (listaClientes.isEmpty()) {
            System.out.println("\nNenhum cliente cadastrado.");
            return;
        }
        int i = 1;
        Scanner input = new Scanner(System.in);
        for (Cliente c : listaClientes) {
            System.out.printf("\n[%d] - Nome: %s - Cidade: %s", i, c.getNome(), c.getEndereco().getCidade());
            i++;
        }

        System.out.println("\nDigite o índice do cliente que deseja remover: ");
        i = input.nextInt();
        input.nextLine();

        if (i < 0 || i > listaClientes.size()) {
            System.out.println("Indice inválido");
            return;
        }

        listaClientes.remove(i);
    }

    // FIM DAS FUNCOES PARA CLIENTES
    // -----------------------------------------------------------------------------------------------------

    // --------------------------------------------------------------------------------------------
    // FUNCOES PARA VENDEDOR
    public static void vendedores(ArrayList<Vendedor> listaVendedores, ArrayList<Gerente> listaGerentes) {
        // Cadastra, altera ou exclui um objeto da classe Vendedores
        int op;
        Scanner input = new Scanner(System.in);
        System.out.println("\n\tVENDEDORES");
        System.out.println("\n1 - Cadastrar novo vendedor");
        System.out.println("\n2 - Alterar cadastro de vendedor");
        System.out.println("\n3 - Excluir cadastro de vendedor");
        System.out.println("\n0 - Sair");
        System.out.println("\nDigite sua opção: ");
        op = input.nextInt();
        input.nextLine();

        int i = 0;
        if (op == 1) {
            Vendedor vendedor = new Vendedor();
            vendedor.cadastraVendedor();
            for(Gerente g: listaGerentes){
                System.out.printf("[%d] - Nome gerente: %s", i, g.getNome());
                i++;
            }
            if(!listaGerentes.isEmpty()){
                System.out.println("\nDigite o indice do gerente que deseja atribuir à esse vendedor: ");
                i = input.nextInt(); input.nextLine();
                if(i<0 || i>listaGerentes.size()){
                    System.out.println("Indice invalido.");
                    return;
                }
                Gerente gerente = listaGerentes.get(i);
                vendedor.setGerenteResponsavel(gerente);
            }
            listaVendedores.add(vendedor);
        } else if (op == 2) {
            alteraVendedor(listaVendedores);
        } else if (op == 3) {
            excluiVendedor(listaVendedores);
        }

    }

    public static void alteraVendedor(ArrayList<Vendedor> listaVendedores) {

        if (listaVendedores.isEmpty()) {
            System.out.println("\nNenhum vendedor cadastrado.");
            return;
        }

        int i = 1;
        Scanner input = new Scanner(System.in);
        for (Vendedor c : listaVendedores) {
            System.out.printf("\n[%d] - Nome: %s - Treino restante: %dh", i, c.getNome(), c.getHorasTreinoRestantes());
            i++;
        }

        System.out.println("\nDigite o índice do vendedor que deseja alterar: ");
        i = input.nextInt();// input.nextLine();
        i--;

        if (i < 0 || i > listaVendedores.size()) {
            System.out.println("Indice inválido");
            return;
        }

        Vendedor ref = listaVendedores.get(i);

        ref.alteraVendedor();
        listaVendedores.set(i, ref);
    }

    public static void excluiVendedor(ArrayList<Vendedor> listaVendedores) {
        if (listaVendedores.isEmpty()) {
            System.out.println("\nNenhum vendedor cadastrado.");
            return;
        }
        int i = 1;
        Scanner input = new Scanner(System.in);
        for (Vendedor c : listaVendedores) {
            System.out.printf("\n[%d] - Nome: %s - Treino restante: %dh", i, c.getNome(), c.getHorasTreinoRestantes());
            i++;
        }

        System.out.println("\nDigite o índice do vendedor que deseja remover: ");
        i = input.nextInt();
        input.nextLine();
        i--;

        if (i < 0 || i > listaVendedores.size()) {
            System.out.println("Indice inválido");
            return;
        }

        listaVendedores.remove(i);
    }
    // FIM DAS FUNCOES PARA VENDEDOR
    // --------------------------------------------------------------------------------------------


    //------------------------------------------------------------------------------------------------
    //FUNCOES PARA VISUALIZAR E REALIZAR VENDAS
    public static void visualizaVendas(ArrayList<Venda> listaVendas){
        System.out.println("\n\n\tVENDAS REALIZADAS");
        for(Venda venda: listaVendas){
            System.out.println("ID: "+ venda.getIdVenda() + " - Vendedor: " + venda.getVendedorVenda().getNome() + " - Valor: R$" + venda.getValorVenda());
        }
    }

    public static void vendas(ArrayList<Venda> listaVendas, ArrayList<Vendedor> listaVendedores,
            ArrayList<Cliente> listaClientes, ArrayList<Carro> listaCarros, ArrayList<Motocicleta> listaMotos) {
        //Cadastra, altera ou exclui um objeto da classe Vendas
        Scanner input = new Scanner(System.in);
        Venda venda = new Venda();
        int op;
        int i = 0;

        if(listaVendedores.isEmpty()){
            System.out.println("\nNenhum vendedor disponível.");
            return ;
        }
        System.out.println("\n\tVENDEDORES DISPONÍVEIS: ");
        for (Vendedor v : listaVendedores) {
            System.out.printf("\n[%d] - Nome: %s", i, v.getNome());
            i++;
        }
        System.out.println("\nDigite o índice do vendedor que realizará a venda: ");
        i = input.nextInt(); input.nextLine();
        if(i<0 || i>listaVendedores.size()){
            System.out.println("\nIndice invalido.");
            return;
        }
        Vendedor vendedor = listaVendedores.get(i);

        i = 0;
        if(listaClientes.isEmpty()){
            System.out.println("\nNenhum cliente disponível.");
            return ;
        }
        System.out.println("\n\tCLIENTES DISPONÍVEIS: ");
        for (Cliente c : listaClientes) {
            System.out.printf("\n[%d] - Nome: %s", i, c.getNome());
            i++;
        }
        System.out.println("\nDigite o índice do cliente que realizará a compra: ");
        i = input.nextInt(); input.nextLine();
        if(i<0 || i>listaClientes.size()){
            System.out.println("\nIndice invalido.");
            return;
        }
        Cliente cliente = listaClientes.get(i);

        venda.setVendedorVenda(vendedor);
        venda.setClienteVenda(cliente);

        System.out.println("\n1 - Comprar carro\n2 - Comprar moto");
        System.out.println("\nDigite a opção: ");
        op = input.nextInt();
        input.nextLine();
        if (op == 1) {
            i = 0;
            if(listaCarros.isEmpty()){
                System.out.println("\nNenhum carro disponível.");
                return ;
            }
            System.out.println("\n\tLISTA DE CARROS");
            for (Carro c : listaCarros) {
                System.out.printf("\n[%d] - Marca: %s - Modelo: %s - Ano: %d", i, c.getMarca(), c.getModelo(), c.getAno());
                i++;
            }
            System.out.println("\nDigite o indice do carro que deseja comprar: ");
            i = input.nextInt();
            input.nextLine();
            if(i<0 || i>listaCarros.size()){
                System.out.println("\nIndice invalido.");
                return;
            }
            Carro carro = listaCarros.get(i);
            carro.setVendido(true);
            venda.setVeiculoVenda(carro);
        } else if (op == 2) {
            i = 0;
            if(listaMotos.isEmpty()){
                System.out.println("\nNenhuma moto disponível.");
                return ;
            }
            for (Motocicleta m : listaMotos) {
                System.out.printf("\n[%d] - Marca: %s - Modelo: %s - Ano: %d", i, m.getMarca(), m.getModelo(), m.getAno());
                i++;
            }
            System.out.println("\nDigite o indice da moto que deseja comprar: ");
            i = input.nextInt();
            input.nextLine();
            if(i<0 || i>listaMotos.size()){
                System.out.println("\nIndice invalido.");
                return;
            }
            Motocicleta moto = listaMotos.get(i);
            moto.setVendido(true);
            venda.setVeiculoVenda(moto);
        } else {
            System.out.println("\nOpção inválida.");
            return;
        }
        Data data = new Data();
        System.out.println("\nDigite a data: ");
        System.out.println("Digite o dia: ");
        data.setDia();
        System.out.println("Digite o mes: ");
        data.setMes();
        System.out.println("Digite o ano: ");
        data.setAno();
        venda.setDataVenda(data);

        Horario horario = new Horario();
        System.out.println("\nDigite o horário: ");
        System.out.println("Digite a hora: ");
        int hora = input.nextInt(); input.nextLine();
        horario.setHora(hora);
        System.out.println("Digite os minutos: ");
        int minutos = input.nextInt(); input.nextLine();
        horario.setMinuto(minutos);
        venda.setHorarioVenda(horario);

        System.out.println("\nDigite o valor da venda: ");
        double valor = input.nextDouble();
        venda.setValorVenda(valor);

        System.out.println("\nDigite o id da venda: ");
        i = input.nextInt(); input.nextLine();
        venda.setIdVenda(i);        

        listaVendas.add(venda);
    }

}