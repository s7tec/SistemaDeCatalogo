import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CatalogoCelulares catalogoCelulares = new CatalogoCelulares();
        boolean menu = true;
        Scanner dadosTeclado = new Scanner(System.in);

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
            dadosTeclado.nextLine();

            if (opcaoMenu == 0) {
                System.out.println("Finalizando programa!");
                menu = false;
            }
            switch (opcaoMenu) {
                case 0:
                    System.out.println("Saindo...");
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
                                dadosTeclado.nextLine();

                                System.out.print("Modelo celular:");
                                String modelo = dadosTeclado.nextLine();

                                System.out.print("Marca celular: ");
                                String marca = dadosTeclado.nextLine();

                                System.out.print("Cor celular: ");
                                String cor = dadosTeclado.nextLine();

                                System.out.print("Armazenamento: ");
                                int armazenamento = dadosTeclado.nextInt();

                                dadosTeclado.nextLine();

                                System.out.print("Preço: ");
                                String valor = dadosTeclado.nextLine();
                                double preco = Double.parseDouble(valor);

                                System.out.print("Ano: ");
                                int ano = dadosTeclado.nextInt();

                                CelularesInfo novo = new CelularesInfo(modelo, marca, cor, armazenamento, preco, ano);
                                catalogoCelulares.adicionarCelular(novo);
                                System.out.println("Celular cadastrado!");
                                break;
                            default:
                                System.out.println("Erro");
                        }
                    }
                    //Fim sub-opção
                    menu = true;
                    break;

                case 2:
                    //sub-opção
                    while (menu) {
                        System.out.println("\nNesta sessão você pode listar itens cadastrados no catálogo\n");
                        System.out.println("(1)-Listar todos os itens\n(0)-Voltar");
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
                                for (CelularesInfo i : catalogoCelulares.listarCelulares()) {
                                    System.out.println(i);
                                }
                                break;

                            default:
                                System.out.println("Erro");
                                break;
                        }
                    }
                    //Fim sub-opção
                    menu = true;
                    break;
            }
        }
    }
}
