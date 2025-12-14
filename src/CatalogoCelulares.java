import java.util.ArrayList;
import java.util.Scanner;


public class CatalogoCelulares {
    public static void main(String[] args) {
        Scanner dadosTeclado = new Scanner(System.in);
        Scanner dadosTecladoSub = new Scanner(System.in);
        boolean menu = true;

        ArrayList<String> nomeModeloCelular = new ArrayList<>();
        ArrayList<String> marcaCelular = new ArrayList<>();
        ArrayList<Integer> armazenamentoCelular = new ArrayList<>();
        ArrayList<Double> precoCelular = new ArrayList<>();
        ArrayList<Integer> anoCelular = new ArrayList<>();

        nomeModeloCelular.add("Poco X7 PRO");
        marcaCelular.add("Xiaomi");
        armazenamentoCelular.add(128);
        precoCelular.add(2700.0);
        anoCelular.add(2025);


        while (menu) {
            //caixa de opções universal
            System.out.print(".___________________________.\n");
            System.out.print("|         Cadastros         |\n");
            System.out.print("|---------------------------|\n");
            System.out.print("| Opção 1 - Create          |\n");
            System.out.print("| Opção 2 - Read            |\n");
            System.out.print("| Opção 3 - Update          |\n");
            System.out.print("| Opção 4 - Delete          |\n");
            System.out.print("| Opção 0 - Exit            |\n");
            System.out.print("|___________________________|\n");
            System.out.print("Digite uma opção: ");

            int opcaoMenu = dadosTeclado.nextInt();

            if (opcaoMenu == 0) {
                System.out.println("Saindo");
                menu = false;
            }

            switch (opcaoMenu) {
                case 0:
                    System.out.println("Programa Finalizado!");
                    break;
                case 1:
                    //sub-opção
                    while (menu) {
                        System.out.println("\nNesta sessão você pode adicionar novos itens ao catálogo\n");
                        System.out.println("(1)-Adicionar novo item\n(0)-Voltar");
                        int opcaoSub = dadosTeclado.nextInt();
                        if (opcaoSub == 0) {
                            System.out.println("Saindo");
                            menu = false;
                        }
                        switch (opcaoSub) {
                            case 0:
                                System.out.println("Voltando Menu anterior");
                                break;
                            case 1:
                                System.out.println("\nPreencha as informações para adicionar o novo dispositivo\n");

                                System.out.print("Modelo celular:");
                                String nomeMcInserindo = dadosTecladoSub.nextLine();
                                nomeModeloCelular.add(nomeMcInserindo);

                                System.out.print("Marca celular: ");
                                String marcaCInserindo = dadosTecladoSub.nextLine();
                                marcaCelular.add(marcaCInserindo);

                                System.out.print("Armazenamento: ");
                                String amazement = dadosTecladoSub.nextLine();
                                int micromanagementInsertion = Integer.parseInt(amazement);
                                armazenamentoCelular.add(micromanagementInsertion);

                                System.out.print("Preço: ");
                                String preco = dadosTecladoSub.nextLine();
                                double precoCInserindo = Double.parseDouble(preco);
                                precoCelular.add(precoCInserindo);

                                System.out.print("Ano: ");
                                String ano = dadosTecladoSub.nextLine();
                                int anoCInserindo = Integer.parseInt(ano);
                                anoCelular.add(anoCInserindo);
                                break;
                            default:
                                System.out.println("Erro");
                        }
                    }
                    //Fim sub-opção
                    menu = true;
                    break;
                case 2:
                    if (nomeModeloCelular.isEmpty()) {
                        System.out.println("Não há celulares cadastrados no catálogo\nRealize o cadastro de pelo menos um celular para dar continuidade");
                        menu = false;
                    } else if (nomeModeloCelular.size() == 1) {
                        System.out.println("Há "+nomeModeloCelular.size()+" modelo de celular cadastrado no catalogo");
                    } else {
                        System.out.println("Há "+nomeModeloCelular.size()+" modelos de celulares cadastrado no catalogo");

                    }
                    //sub-opção
                    while (menu) {
                        System.out.println("\nNesta sessão você pode listar itens cadastrados no catálogo\n");
                        System.out.println("(1)-Listar todos os itens\n(2)-Listar por ID\n(0)-Voltar");
                        int opcaoSub = dadosTeclado.nextInt();
                        if (opcaoSub == 0) {
                            System.out.println("Saindo");
                            menu = false;
                        }
                        switch (opcaoSub) {
                            case 0:
                                System.out.println("Voltando Menu anterior");
                                break;
                            case 1:
                                for (int i = 0; i < nomeModeloCelular.size(); i++) {
                                    System.out.println("ID: " + i);
                                    System.out.println("Modelo: " + nomeModeloCelular.get(i));
                                    System.out.println("Marca: " + marcaCelular.get(i));
                                    System.out.println("Armazenamento: " + armazenamentoCelular.get(i));
                                    System.out.println("R$ " + precoCelular.get(i));
                                    System.out.println("Ano: " + anoCelular.get(i));
                                    System.out.println("- - - - - - - - - - - - ");
                                }
                                break;
                            case 2:
                                System.out.println("Digite ID iniciando do 0");

                                int numPosicao = dadosTeclado.nextInt();

                                if (numPosicao < nomeModeloCelular.size()) {
                                    System.out.println("\nID: " + numPosicao);
                                    System.out.println("Modelo: " + nomeModeloCelular.get(numPosicao));
                                    System.out.println("Marca: " + marcaCelular.get(numPosicao));
                                    System.out.println("Armazenamento: " + armazenamentoCelular.get(numPosicao));
                                    System.out.println("R$ " + precoCelular.get(numPosicao));
                                    System.out.println("Ano: " + anoCelular.get(numPosicao));
                                } else {
                                    System.out.println("Não há celular cadastrado nesta posição");
                                }
                                break;
                            default:
                                System.out.println("Erro");
                        }
                    }
                    //Fim sub-opção
                    menu = true;
                    break;
                case 3:
                    //sub-opção
                    while (menu) {
                        System.out.println("\nNesta sessão você pode editar itens cadastrados no catálogo pelo ID\n");
                        System.out.println("(1)-Editar itens do catálogo por ID\n(0)-Voltar");
                        int opcaoSub = dadosTeclado.nextInt();
                        if (opcaoSub == 0) {
                            System.out.println("Saindo");
                            menu = false;
                        }
                        switch (opcaoSub) {
                            case 0:
                                System.out.println("Voltando Menu anterior");
                                break;
                            case 1:
                                System.out.println("Digite ID iniciando do 0");

                                int numPosicao = dadosTeclado.nextInt();

                                if (numPosicao < nomeModeloCelular.size()) {

                                    System.out.println("dadosTeclado anteriores Celular " + numPosicao + "\n");

                                    System.out.println("Modelo: " + nomeModeloCelular.get(numPosicao));
                                    System.out.println("Marca: " + marcaCelular.get(numPosicao));
                                    System.out.println("Armazenamento: " + armazenamentoCelular.get(numPosicao));
                                    System.out.println("R$ " + precoCelular.get(numPosicao));
                                    System.out.println("Ano: " + anoCelular.get(numPosicao));

                                    System.out.println("\n#### Alterando Celular " + numPosicao + " ####");

                                    System.out.print("Modelo celular:");
                                    String nomeMcInserindoNew = dadosTecladoSub.nextLine();
                                    nomeModeloCelular.set(numPosicao, nomeMcInserindoNew);

                                    System.out.print("Marca celular: ");
                                    String marcaCInserindoNew = dadosTecladoSub.nextLine();
                                    marcaCelular.set(numPosicao, marcaCInserindoNew);

                                    System.out.print("Armazenamento: ");
                                    String amazementNew = dadosTecladoSub.nextLine();
                                    int micromanagementInsertion = Integer.parseInt(amazementNew);
                                    armazenamentoCelular.set(numPosicao, micromanagementInsertion);

                                    System.out.print("Preço: ");
                                    String preco = dadosTecladoSub.nextLine();
                                    double precoCInserindoNew = Double.parseDouble(preco);
                                    precoCelular.set(numPosicao, precoCInserindoNew);

                                    System.out.print("Ano: ");
                                    String ano = dadosTecladoSub.nextLine();
                                    int anoCInserindoNew = Integer.parseInt(ano);
                                    anoCelular.set(numPosicao, anoCInserindoNew);

                                } else {
                                    System.out.println("Não há celular cadastrado nesta posição");
                                }
                                break;

                            default:
                                System.out.println("Erro");

                        }
                    }
                    //Fim sub-opção
                    menu = true;
                    break;

                case 4:
                    //sub-opção
                    while (menu) {
                        System.out.println("\nNesta sessão você pode excluir itens cadastrados no catálogo pelo ID\n");
                        System.out.println("(1)-Excluir itens do catálogo por ID\n(0)-Voltar");
                        int opcaoSub = dadosTeclado.nextInt();
                        if (opcaoSub == 0) {
                            System.out.println("Saindo");
                            menu = false;
                        }
                        switch (opcaoSub) {
                            case 0:
                                System.out.println("Voltando Menu anterior");
                                break;
                            case 1:
                                System.out.println("Digite ID iniciando do 0");

                                int numPosicao = dadosTeclado.nextInt();

                                if (numPosicao < nomeModeloCelular.size()) {
                                    nomeModeloCelular.remove(numPosicao);
                                    marcaCelular.remove(numPosicao);
                                    armazenamentoCelular.remove(numPosicao);
                                    precoCelular.remove(numPosicao);
                                    anoCelular.remove(numPosicao);
                                } else {
                                    System.out.println("Não há celular cadastrado nesta posição");
                                }
                                break;

                            default:
                                System.out.println("Erro");

                        }
                    }
                    //Fim sub-opção
                    menu = true;
                    break;

            }

        }
    }
}
