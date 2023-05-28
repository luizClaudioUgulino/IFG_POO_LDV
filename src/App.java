import java.util.ArrayList;
import java.util.Scanner;

//System.out.println("");
public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        ArrayList<Locadora> lcd = new ArrayList<Locadora>();
        boolean loop = false;

        while (loop == false) {
            println("/////////////////////////////////////////////////////////");
            println("OLÁ BEM VINDO AO SISTEMA DE LOCADORA");
            println("ENTRAR NO SEU SISTEMA - (1) / CADASTRAR UMA LOCADORA - (2) / FECHAR - (3)");
            System.out.print("VALOR DA ESCOLHA:");
            int escolha = sc.nextInt();
            println("/////////////////////////////////////////////////////////");

            //// função de escolha das opções acima
            switch (escolha) {
                case 1:
                    println("/////////////////////////////////////////////////////////");
                    System.out.print("DIGITE NOME DA SUA LOCADORA:");
                    String nomeLocadora = sc.next();
                    println("/////////////////////////////////////////////////////////");
                    int idDaLocadora = 0;

                    for (int x = 0; x < lcd.size(); x++) {

                        if (lcd.get(x).getNome().equals(nomeLocadora)) {
                            idDaLocadora = x;
                        }
                    }

                    if (lcd.get(idDaLocadora).getNome().equals(null)) {

                        println("nenhuma locadora foi encontrada");
                        break;
                    }

                    println("////////////////////////// CONECTADO /////////////////////////////");
                    System.out.println("SEJA BEM VINDO " + lcd.get(idDaLocadora).getNome() + " AO SISTEMA DE LOCADORA");

                    while (loop == false) {
                        println("/////////////////////////////////////////////////////////////////");
                        println("QUAIS ATIVIDADES VAI SOLICITAR :");
                        println(" EMPRESTIMO - (1) / CADASTRAR O VEICULO - (2) / CADASTRAR O CLIENTE - (3) / DEVOLUÇÃO - (4) / LISTA CLIENTE - (5) / LISTA CARROS - (6) /  FECHAR - (7) ");
                        System.out.print("VALOR DA ESCOLHA:");
                        escolha = sc.nextInt();
                        println("/////////////////////////////////////////////////////////////////");

                        switch (escolha) {
                            case 1:
                                println("////////////// EMPRESTIMO ///////////////");
                                println(" CRIAR EMPRESTIMO - (1) / LISTA EMPRESTIMO - (2) / RENOVAR EMPRESTIMO - (3) ");
                                System.out.print("VALOR DA ESCOLHA:");
                                int escolhaEmprestimo = sc.nextInt();

                                if (escolhaEmprestimo == 1) {
                                    println("/////////////////////////////////////////////////////////");
                                    System.out.println("NOME DO CLIENTE CADASTRADO:");
                                    String nomeCliente = sc.next();

                                    System.out.println("ID DO VEICULO CADASTRADO:");
                                    String nomeVeiculo = sc.next();

                                    int idDoCliente = 0;
                                    for (int x = 0; x < lcd.get(idDaLocadora).clp.size(); x++) {
                                        if (lcd.get(idDaLocadora).clp.get(x).getNome().equals(nomeCliente)) {
                                            idDoCliente = x;
                                        }
                                    }
                                    for (int x = 0; x < lcd.get(idDaLocadora).clj.size(); x++) {
                                        if (lcd.get(idDaLocadora).clj.get(x).getNome().equals(nomeCliente)) {
                                            idDoCliente = x;
                                        }

                                        int idDoCarro = 0;

                                        for (int y = 0; x < lcd.get(idDaLocadora).crr.size(); x++) {

                                            if (lcd.get(idDaLocadora).crr.get(y).getIdDoCarro().equals(nomeVeiculo)) {
                                                idDoCarro = x;
                                            }
                                        }

                                        System.out.println("ID DO EMPRESTIMO:");
                                        int idDoEmprestimoString = sc.nextInt();

                                        Carro carroid = lcd.get(idDaLocadora).crr.get(idDoCliente);
                                        Clientes cienteget = lcd.get(idDaLocadora).cl.get(idDoCarro);

                                        Emprestimo emp = new Emprestimo(idDoEmprestimoString, cienteget, carroid, true);

                                    }

                                } else if (escolhaEmprestimo == 2) {

                                } else {
                                }

                                break;
                            ///////////////////////////////////////////////////////
                            case 2:

                                println("////////////// CADASTRAR CARRO ///////////////");
                                println("LUXO - (1) / SUV - (2) / POPULAR - (3) ");
                                System.out.print("VALOR DA ESCOLHA:");
                                int escolhaCarro = sc.nextInt();

                                if (escolhaCarro == 1) {

                                    String[] escolhaLuxo = { "ID DO CARRO", "MARCA", "MODELO", "PLACA", "ANO" };
                                    println("////////////// CADASTRAR CARRO LUXO ///////////////");
                                    for (int x = 0; x < escolhaLuxo.length; x++) {
                                        System.out.print("DIGITE " + escolhaLuxo[x] + ":");
                                        escolhaLuxo[x] = sc.nextLine();
                                        if (x == 0) {
                                            escolhaLuxo[x] = sc.nextLine();
                                        }
                                        System.out.println("");
                                    }
                                    System.out.print("VALOR DO CARRO :");
                                    int valorcarro = sc.nextInt();

                                    Carro carro = new Carro(escolhaLuxo[0], escolhaLuxo[1], escolhaLuxo[2],
                                            escolhaLuxo[3], escolhaLuxo[4], valorcarro, 3, true, 10);

                                    lcd.get(idDaLocadora).crr.add(carro);

                                } else if (escolhaCarro == 2) {

                                    String[] escolhaLuxo = { "ID DO CARRO", "MARCA", "MODELO", "PLACA", "ANO" };
                                    println("////////////// CADASTRAR CARRO SUV ///////////////");
                                    for (int x = 0; x < escolhaLuxo.length; x++) {
                                        System.out.print("DIGITE " + escolhaLuxo[x] + ":");
                                        escolhaLuxo[x] = sc.nextLine();
                                        if (x == 0) {
                                            escolhaLuxo[x] = sc.nextLine();
                                        }
                                        System.out.println("");
                                    }
                                    System.out.print("VALOR DO CARRO :");
                                    int valorcarro = sc.nextInt();

                                    Carro carro = new Carro(escolhaLuxo[0], escolhaLuxo[1], escolhaLuxo[2],
                                            escolhaLuxo[3], escolhaLuxo[4], valorcarro, 3, true, 10);

                                    lcd.get(idDaLocadora).crr.add(carro);

                                } else if (escolhaCarro == 3) {

                                    String[] escolhaLuxo = { "ID DO CARRO", "MARCA", "MODELO", "PLACA", "ANO" };
                                    println("////////////// CADASTRAR CARRO POPULAR ///////////////");
                                    for (int x = 0; x < escolhaLuxo.length; x++) {
                                        System.out.print("DIGITE " + escolhaLuxo[x] + ":");
                                        escolhaLuxo[x] = sc.nextLine();
                                        if (x == 0) {
                                            escolhaLuxo[x] = sc.nextLine();
                                        }
                                        System.out.println("");
                                    }
                                    System.out.print("VALOR DO CARRO :");
                                    int valorcarro = sc.nextInt();

                                    Carro carro = new Carro(escolhaLuxo[0], escolhaLuxo[1], escolhaLuxo[2],
                                            escolhaLuxo[3], escolhaLuxo[4], valorcarro, 3, true, 10);

                                    lcd.get(idDaLocadora).crr.add(carro);
                                } else {

                                }

                                break;
                            ///////////////////////////////////////////////////////
                            case 3:
                                println("////////////// CADASTRAR CLIENTE ///////////////");
                                println("FISICO - (1) / JURIDICO - (2)");
                                System.out.print("VALOR DA ESCOLHA:");
                                int escolhaCliente = sc.nextInt();

                                if (escolhaCliente == 1) { /// Fisico
                                    println("////////////// CADASTRAR PESSOA FISICA ///////////////");
                                    String[] escolhaFisico = { "nome", "endereco", "telefone", "cpf" };

                                    for (int x = 0; x < escolhaFisico.length; x++) {
                                        System.out.print("Digide " + escolhaFisico[x] + ":");
                                        escolhaFisico[x] = sc.nextLine();
                                        if (x == 0) {
                                            escolhaFisico[x] = sc.nextLine();
                                        }
                                        println("VALOR DA CONTA :");
                                        System.out.println("");
                                    }
                                    int valordacontaget = sc.nextInt();

                                    PessoaFisica clFisco = new PessoaFisica(escolhaFisico[0], escolhaFisico[1],
                                            escolhaFisico[2], escolhaFisico[3], valordacontaget);
                                    lcd.get(idDaLocadora).clp.add(clFisco);

                                } else if (escolhaCliente == 2) { //// JURIDICO

                                    String[] escolhaJuridico = { "nome", "endereco", "telefone", "cnpj",
                                            "nomeReprestante" };

                                    for (int x = 0; x < escolhaJuridico.length; x++) {
                                        System.out.print("Digide " + escolhaJuridico[x] + ":");
                                        escolhaJuridico[x] = sc.nextLine();
                                        if (x == 0) {
                                            escolhaJuridico[x] = sc.nextLine();
                                        }
                                        System.out.println("");
                                    }
                                    println("VALOR DA CONTA :");
                                    int valordacontaget = sc.nextInt();

                                    PessoaJuridica clJuridica = new PessoaJuridica(escolhaJuridico[0],
                                            escolhaJuridico[1], escolhaJuridico[2], escolhaJuridico[3],
                                            escolhaJuridico[4], valordacontaget);

                                    lcd.get(idDaLocadora).clj.add(clJuridica);

                                } else {

                                    System.out.println("Opção inválida");
                                    break;

                                }

                                break;
                            ///////////////////////////////////////////////////////
                            case 4:
                                println("devolução");
                                break;
                            ///////////////////////////////////////////////////////
                            case 5:
                                println("///////////////// LISTA DE CLIENTES /////////////////////");
                                for (int x = 0; x < lcd.get(idDaLocadora).clp.size(); x++) {
                                    System.out.println(lcd.get(idDaLocadora).clp.toString());
                                }
                                for (int x = 0; x < lcd.get(idDaLocadora).clj.size(); x++) {
                                    System.out.println(lcd.get(idDaLocadora).clj.toString());
                                }
                                break;
                            ///////////////////////////////////////////////////////
                            case 6:
                                println("///////////////// LISTA DE CARROS /////////////////////");
                                for (int x = 0; x < lcd.get(idDaLocadora).crr.size(); x++) {
                                    System.out.println(lcd.get(idDaLocadora).crr.toString());
                                }
                                break;
                            ///////////////////////////////////////////////////////
                            case 7:
                                loop = true;
                                break;
                        }

                    }
                    loop = false;
                    break;

                case 2:
                    println("//////////////////////// CADASTRO LOCADORA ///////////////////////");
                    println("VAMOS ESTAR CRIANDO SUA LOCADORA, POR FAVOR FORNECER SEGUINDES DADOS:");
                    String[] dados = { "NOME", "ENDERECO", "TELEFONE" };

                    for (int x = 0; x < dados.length; x++) {
                        System.out.print(" DADO " + dados[x] + ":");
                        dados[x] = sc.next();
                    }
                    System.out.println();

                    Locadora lc = new Locadora(dados[0], dados[1], dados[2]);
                    lcd.add(lc);

                    break;

                case 3:
                    loop = true;
                    break;
            }

        }
    }

    public static void println(String valor) {
        System.out.println(valor);
    }

}
