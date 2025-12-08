import java.util.ArrayList;
import java.util.Scanner;


public class CatalogoCelulares {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        Scanner dadosSub = new Scanner(System.in);
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

        //Teste ---------------
        /*
        System.out.println("Nome do celular");
        String NomeAparelho = dados.next();
        nomeModeloCelular.add(NomeAparelho);
        */
        //Teste ---------------

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

            int opcaoMenu = dados.nextInt();

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
                        int opcaoSub = dados.nextInt();
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
                                String nomeMcInserindo = dadosSub.nextLine();
                                nomeModeloCelular.add(nomeMcInserindo);

                                System.out.print("Marca celular: ");

                                String marcaCInserindo = dadosSub.nextLine();
                                marcaCelular.add(marcaCInserindo);

                                System.out.print("Armazenamento: ");
                                String amazement = dadosSub.nextLine();
                                int micromanagementInsertion = Integer.parseInt(amazement);
                                armazenamentoCelular.add(micromanagementInsertion);

                                System.out.print("Preço: ");
                                String preco = dadosSub.nextLine();
                                double precoCInserindo = Double.parseDouble(preco);
                                precoCelular.add(precoCInserindo);

                                System.out.print("Ano: ");
                                String ano = dadosSub.nextLine();
                                int anoCInserindo = Integer.parseInt(ano);
                                anoCelular.add(anoCInserindo);
                                break;
                            default:
                                System.out.println("erro");
                        }
                    }
                    //Fim sub-opção
                    menu = true;

                    //--------------
                    System.out.println(nomeModeloCelular + "\n" + marcaCelular + "\n" + armazenamentoCelular + "\n" + precoCelular + "\n" + anoCelular);
                    System.out.println(nomeModeloCelular.size());
                    //--------------
            }
        }
    }
}
