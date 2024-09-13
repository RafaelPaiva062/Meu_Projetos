package bicilcetaria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Bicicletaria {

    static class Produtos {
        int item;
        String nome;
        double preco;
        int quantidade;

         Produtos( int item, String nome, double preco, int quantidade) 
         {
            this.item = item;
            this.nome = nome;
            this.preco = preco;
            this.quantidade = quantidade;
        }

        public String getNome() {
            return nome;
        }
        public double getPreco() {
            return preco;
        }

        public int getQuantidade() {
            return quantidade;
        }
        
        public int getItem() {
            return item;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int escolha =0  ;
         double somaPreco= 0;
         int somaQuantedade=0;

        // Lista de peças da Bicicletaria
        List<Produtos> pecas = new ArrayList<>();

        // Adicionando produtos de peças 
        pecas.add(new Produtos(1,"- Capacetes", 300.00, 1));
        pecas.add(new Produtos(2,"- Selins", 60.00, 1));
        pecas.add(new Produtos(3,"- Cassete", 60.00, 1));
        pecas.add(new Produtos(4,"- Quadros", 251.00, 1));
        pecas.add(new Produtos(5,"- Manoplas", 30.00, 2));
        pecas.add(new Produtos(6,"- Cubos", 200.00, 2));
        pecas.add(new Produtos(7,"- Abraçadeira", 20.00, 2));
        pecas.add(new Produtos(8,"- Acelerador", 350.00, 2));
        pecas.add(new Produtos(9,"- Adaptadores", 27.00, 1));
        pecas.add(new Produtos(10,"- Aros", 90.00, 2));
        pecas.add(new Produtos(11,"- Canote", 369.00, 1));
        pecas.add(new Produtos(12,"- Catraca", 50.00, 1));
        pecas.add(new Produtos(13,"- Clip Guidão", 400.00, 1));
        pecas.add(new Produtos(14,"- Cog", 340.00, 1));
        pecas.add(new Produtos(15,"- Kit conduítes", 40.00, 1));
        pecas.add(new Produtos(16,"- Coroa", 210.00, 1));
        pecas.add(new Produtos(17,"- Correntes", 25.00, 1));
        pecas.add(new Produtos(18,"- Câmera de ar", 26.00, 1));
        pecas.add(new Produtos(19,"- Câmbio dianterio", 170.00, 1));
        pecas.add(new Produtos(20,"- Câmbio traseiro ", 100.00, 1));
        pecas.add(new Produtos(21,"- Disco de freio ", 400.00, 1));
        pecas.add(new Produtos(22,"- Eixo", 45.00, 1));
        pecas.add(new Produtos(23,"- Fita de Guigão", 100.00, 1));
        pecas.add(new Produtos(24,"- Freehub", 1800.00, 1));
        pecas.add(new Produtos(25,"- Freio ", 1349.00, 2));
        pecas.add(new Produtos(26,"- Gancheira", 50.00, 1));
        pecas.add(new Produtos(27,"- Graxa", 170.00, 1));
        pecas.add(new Produtos(28,"- Guia de corrente ", 450.00, 1));
        pecas.add(new Produtos(29,"- Haste de Câmbio Externa Shimano Rd-M7100 tipo SGS", 79.00, 1));
        pecas.add(new Produtos(30,"- Kit Transmissao", 630.00, 1));
        pecas.add(new Produtos(31,"- Movimentos Cental ", 50.00, 1));
        pecas.add(new Produtos(32,"- Movimento de Direção", 25.00, 1));
        pecas.add(new Produtos(33,"- Passador", 400.00, 1));
        pecas.add(new Produtos(34,"- Pastilha da freio ", 80.00, 1));
        pecas.add(new Produtos(35,"- Pedel", 200.00, 2));
        pecas.add(new Produtos(36,"- Pedal Clip", 251.00, 2));
        pecas.add(new Produtos(37,"- Pedivela", 100.00, 1));
        pecas.add(new Produtos(38,"- Pinça", 89.00, 1));
        pecas.add(new Produtos(39,"- Pneu", 440.00, 2));
        pecas.add(new Produtos(40,"- Powerlock", 62.00, 2));
        pecas.add(new Produtos(41,"- Prologador ", 80.00, 1));
        pecas.add(new Produtos(42,"- Bolça de quadro", 172.00, 1));
        pecas.add(new Produtos(43,"- Rolamento", 15.00, 1));
        pecas.add(new Produtos(44,"- Roldana", 200.00, 1));
        pecas.add(new Produtos(45,"- Suporte de guidão", 80.00, 1));
        pecas.add(new Produtos(46,"- Suspensão", 404.00, 1));
        pecas.add(new Produtos(47,"- Trolha-Pedaleira ", 30.00, 2));
        pecas.add(new Produtos(48,"- Válvula", 50.00, 1));

      // inserção de um newbicicletas  arraylist 
      List<Produtos> newbicicleta = new ArrayList<>();
      newbicicleta.add(new Produtos( 1, "Bicicleta Oggi Hacker HDS Aro 29 Tourney 24v Grafite" , 2500.0, 1));
      newbicicleta.add(new Produtos( 2, "Bicicleta Dalannio Beach Aro 26 Masculina Bege Marrom",1200.00,1));
      newbicicleta.add(new Produtos( 3, "Bicicleta Elétrica Duos Eko-5 Aro 14 500 Watts Azul",5400.00,1));
      newbicicleta.add(new Produtos( 4, "Bicicleta Nathor Balance Love Aro 12 Rosa ",200.00,1));
      newbicicleta.add(new Produtos( 5, "Bicicleta Oggi Velloce Aro 700 Claris 16v Amarelo", 5390.00,1));
      newbicicleta.add(new Produtos( 6, "Bicicleta Elleven Fever BMX Aro 20 Cinza", 1600.00,1));
      newbicicleta.add(new Produtos( 7, "Bicicleta VikingX Tuff 30 Aro 26 Azul", 2000.00,1));

    // inserçãp de um oldbicicleta arraylist 
    List<Produtos> oldbicicleta = new ArrayList<>();

      oldbicicleta.add(new Produtos( 1, "Bicicleta Trek Supercaliber 9.9 Aro 29 XTR 12v Preto  - Seminova" , 55000.0, 1));
      oldbicicleta.add(new Produtos( 2, "Bicicleta Specialized Creo SL E5 Comp Aro 700 GRX 11v 2022 Azul e Verde - Seminova",31491.00,1));
      oldbicicleta.add(new Produtos( 3, "Bicicleta Oggi Velloce Disc Aro 700 Claris 16v Vermelha  - Seminova",4000.00,1));
      oldbicicleta.add(new Produtos( 4, "Bicicleta Cannondale Topstone Carbon Aro 700 GRX 22v Cinza  - Seminova ",13000.00,1));
      oldbicicleta.add(new Produtos( 5, "Bicicleta Specialized Creo SL Expert Aro 700 XT 11v Camaleão - Seminova", 52990.00,1));
      oldbicicleta.add(new Produtos( 6, "Bicicleta Specialized Turbo Levo Expert Aro 29 XO1 12v Dourado  - Seminova", 69990.00,1));
      oldbicicleta.add(new Produtos( 7, "Bicicleta Cannondale Topstone Carbon Aro 700 GRX 22v Cinza e Preto - Seminova", 12990.00,1));
    

      // Iterando sobre os produtos e imprimindo os detalhes
     System.out.println("Bem-vindo à Bicicletaria BiBi! Selecione os itens de sua preferência e adicione ao seu pedido:");

        while (escolha >=0 ) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Ver produtos de peças");
            System.out.println("2 - Ver bicicletas novas");
            System.out.println("3 - Ver bicicletas usadas");
            System.out.println("0 - Sair");
            escolha = sc.nextInt(); 
             if(escolha == 1)
             {
                for (Produtos produto : pecas) {
                    System.out.println("Iten: " + produto.getItem());
                    System.out.println("Produto: " + produto.getNome());
                    System.out.println("Preço: R$ " + produto.getPreco());
                    System.out.println("Quantidade: " + produto.getQuantidade());

                }
                System.out.println("Qual itens vai querer?");
                int itemEscolhido= sc.nextInt();
                switch (itemEscolhido) {
                    case 1:
                        Produtos pecas1 = pecas.get(0);
                        somaPreco += pecas1.getPreco();
                        somaQuantedade += pecas1.getQuantidade();
                        break;
                    case 2:
                        Produtos pecas2 = pecas.get(1);
                        somaPreco += pecas2.getPreco();
                        somaQuantedade += pecas2.getQuantidade();
                        break;
                    case 3:
                        Produtos pecas3 = pecas.get(2);
                        somaPreco += pecas3.getPreco();
                        somaQuantedade += pecas3.getQuantidade();
                        break;
                    case 4:
                        Produtos pecas4 = pecas.get(3);
                        somaPreco += pecas4.getPreco();
                        somaQuantedade += pecas4.getQuantidade();
                        break;
                    case 5:
                        Produtos pecas5 = pecas.get(4);
                        somaPreco += pecas5.getPreco();
                        somaQuantedade += pecas5.getQuantidade();
                        break;
                    case 6:
                        Produtos pecas6 = pecas.get(5);
                        somaPreco += pecas6.getPreco();
                        somaQuantedade += pecas6.getQuantidade();
                        break;
                    case 7:
                        Produtos pecas7 = pecas.get(6);
                        somaPreco += pecas7.getPreco();
                        somaQuantedade += pecas7.getQuantidade();
                        break;
                    case 8:
                        Produtos pecas8 = pecas.get(7);
                        somaPreco += pecas8.getPreco();
                        somaQuantedade += pecas8.getQuantidade();
                        break;
                    case 9:
                        Produtos pecas9 = pecas.get(8);
                        somaPreco += pecas9.getPreco();
                        somaQuantedade += pecas9.getQuantidade();
                        break;
                    case 10:
                        Produtos pecas10 = pecas.get(9);
                        somaPreco += pecas10.getPreco();
                        somaQuantedade += pecas10.getQuantidade();
                        break;
                    case 11:
                        Produtos pecas11 = pecas.get(10);
                        somaPreco += pecas11.getPreco();
                        somaQuantedade += pecas11.getQuantidade();
                        break;
                    case 12:
                        Produtos pecas12 = pecas.get(11);
                        somaPreco += pecas12.getPreco();
                        somaQuantedade += pecas12.getQuantidade();
                        break;
                    case 13:
                        Produtos pecas13 = pecas.get(12);
                        somaPreco += pecas13.getPreco();
                        somaQuantedade += pecas13.getQuantidade();
                        break;
                    case 14:
                        Produtos pecas14 = pecas.get(13);
                        somaPreco += pecas14.getPreco();
                        somaQuantedade += pecas14.getQuantidade();
                        break;
                    case 15:
                        Produtos pecas15 = pecas.get(14);
                        somaPreco += pecas15.getPreco();
                        somaQuantedade += pecas15.getQuantidade();
                        break;
                    case 16:
                        Produtos pecas16 = pecas.get(15);
                        somaPreco += pecas16.getPreco();
                        somaQuantedade += pecas16.getQuantidade();
                        break;
                    case 17:
                        Produtos pecas17 = pecas.get(16);
                        somaPreco += pecas17.getPreco();
                        somaQuantedade += pecas17.getQuantidade();
                        break;
                    case 18:
                        Produtos pecas18 = pecas.get(17);
                        somaPreco += pecas18.getPreco();
                        somaQuantedade += pecas18.getQuantidade();
                        break;
                    case 19:
                        Produtos pecas19 = pecas.get(18);
                        somaPreco += pecas19.getPreco();
                        somaQuantedade += pecas19.getQuantidade();
                        break;
                    case 20:
                        Produtos pecas20 = pecas.get(19);
                        somaPreco += pecas20.getPreco();
                        somaQuantedade += pecas20.getQuantidade();
                        break;
                    case 21:
                        Produtos pecas21 = pecas.get(20);
                        somaPreco += pecas21.getPreco();
                        somaQuantedade += pecas21.getQuantidade();
                        break;
                    case 22:
                        Produtos pecas22 = pecas.get(21);
                        somaPreco += pecas22.getPreco();
                        somaQuantedade += pecas22.getQuantidade();
                        break;
                    case 23:
                        Produtos pecas23 = pecas.get(22);
                        somaPreco += pecas23.getPreco();
                        somaQuantedade += pecas23.getQuantidade();
                        break;
                    case 24:
                        Produtos pecas24 = pecas.get(23);
                        somaPreco += pecas24.getPreco();
                        somaQuantedade += pecas24.getQuantidade();
                        break;
                    case 25:
                        Produtos pecas25 = pecas.get(24);
                        somaPreco += pecas25.getPreco();
                        somaQuantedade += pecas25.getQuantidade();
                        break;
                    case 26:
                        Produtos pecas26 = pecas.get(25);
                        somaPreco += pecas26.getPreco();
                        somaQuantedade += pecas26.getQuantidade();
                        break;
                    case 27:
                        Produtos pecas27 = pecas.get(26);
                        somaPreco += pecas27.getPreco();
                        somaQuantedade += pecas27.getQuantidade();
                        break;
                    case 28:
                        Produtos pecas28 = pecas.get(27);
                        somaPreco += pecas28.getPreco();
                        somaQuantedade += pecas28.getQuantidade();
                        break;
                    case 29:
                        Produtos pecas29 = pecas.get(28);
                        somaPreco += pecas29.getPreco();
                        somaQuantedade += pecas29.getQuantidade();
                        break;
                    case 30:
                        Produtos pecas30 = pecas.get(29);
                        somaPreco += pecas30.getPreco();
                        somaQuantedade += pecas30.getQuantidade();
                        break;
                    case 31:
                        Produtos pecas31 = pecas.get(30);
                        somaPreco += pecas31.getPreco();
                        somaQuantedade += pecas31.getQuantidade();
                        break;
                    case 32:
                        Produtos pecas32 = pecas.get(31);
                        somaPreco += pecas32.getPreco();
                        somaQuantedade += pecas32.getQuantidade();
                        break;
                    case 33:
                        Produtos pecas33 = pecas.get(32);
                        somaPreco += pecas33.getPreco();
                        somaQuantedade += pecas33.getQuantidade();
                        break;
                    case 34:
                        Produtos pecas34 = pecas.get(33);
                        somaPreco += pecas34.getPreco();
                        somaQuantedade += pecas34.getQuantidade();
                        break;
                    case 35:
                        Produtos pecas35 = pecas.get(34);
                        somaPreco += pecas35.getPreco();
                        somaQuantedade += pecas35.getQuantidade();
                        break;
                    case 36:
                        Produtos pecas36 = pecas.get(35);
                        somaPreco += pecas36.getPreco();
                        somaQuantedade += pecas36.getQuantidade();
                        break;
                    case 37:
                        Produtos pecas37 = pecas.get(36);
                        somaPreco += pecas37.getPreco();
                        somaQuantedade += pecas37.getQuantidade();
                        break;
                    case 38:
                        Produtos pecas38 = pecas.get(37);
                        somaPreco += pecas38.getPreco();
                        somaQuantedade += pecas38.getQuantidade();
                        break;
                    case 39:
                        Produtos pecas39 = pecas.get(38);
                        somaPreco += pecas39.getPreco();
                        somaQuantedade += pecas39.getQuantidade();
                        break;
                    case 40:
                        Produtos pecas40 = pecas.get(39);
                        somaPreco += pecas40.getPreco();
                        somaQuantedade += pecas40.getQuantidade();
                        break;
                    case 41:
                        Produtos pecas41 = pecas.get(40);
                        somaPreco += pecas41.getPreco();
                        somaQuantedade += pecas41.getQuantidade();
                        break;
                    case 42:
                        Produtos pecas42 = pecas.get(41);
                        somaPreco += pecas42.getPreco();
                        somaQuantedade += pecas42.getQuantidade();
                        break;
                    case 43:
                        Produtos pecas43 = pecas.get(42);
                        somaPreco += pecas43.getPreco();
                        somaQuantedade += pecas43.getQuantidade();
                        break;
                    case 44:
                        Produtos pecas44 = pecas.get(43);
                        somaPreco += pecas44.getPreco();
                        somaQuantedade += pecas44.getQuantidade();
                        break;
                    case 45:
                        Produtos pecas45 = pecas.get(44);
                        somaPreco += pecas45.getPreco();
                        somaQuantedade += pecas45.getQuantidade();
                        break;
                    case 46:
                        Produtos pecas46 = pecas.get(45);
                        somaPreco += pecas46.getPreco();
                        somaQuantedade += pecas46.getQuantidade();
                        break;
                    case 47:
                        Produtos pecas47 = pecas.get(46);
                        somaPreco += pecas47.getPreco();
                        somaQuantedade += pecas47.getQuantidade();
                        break;
                        case 48:
                        Produtos pecas48 = pecas.get(47);
                        somaPreco += pecas48.getPreco();
                        somaQuantedade += pecas48.getQuantidade();
                        break;
                    default:
                        System.out.println("Item inválido.");
                }
                
             }
             if(escolha == 2)
             {
                for (Produtos produto : newbicicleta) {
                    System.out.println("Iten: " + produto.getItem());
                    System.out.println("Produto: " + produto.getNome());
                    System.out.println("Preço: R$ " + produto.getPreco());
                    System.out.println("Quantidade: " + produto.getQuantidade());
                    System.out.println("-------------------");
                }
                System.out.println("Qual itens vai querer?");
                int itemEscolhido= sc.nextInt();

                switch (itemEscolhido) {
                    case 1:
                        Produtos newbicicleta1 = newbicicleta.get(0);
                        somaPreco += newbicicleta1.getPreco();
                        somaQuantedade += newbicicleta1.getQuantidade();
                        break;
                    case 2:
                        Produtos newbicicleta2 = newbicicleta.get(1);
                        somaPreco += newbicicleta2.getPreco();
                        somaQuantedade += newbicicleta2.getQuantidade();
                        break;
                    case 3:
                        Produtos newbicicleta3 = newbicicleta.get(2);
                        somaPreco += newbicicleta3.getPreco();
                        somaQuantedade += newbicicleta3.getQuantidade();
                        break;
                    case 4:
                        Produtos newbicicleta4 = newbicicleta.get(3);
                        somaPreco += newbicicleta4.getPreco();
                        somaQuantedade += newbicicleta4.getQuantidade();
                        break;
                    case 5:
                        Produtos newbicicleta5 = newbicicleta.get(4);
                        somaPreco += newbicicleta5.getPreco();
                        somaQuantedade += newbicicleta5.getQuantidade();
                        break;
                    case 6:
                        Produtos newbicicleta6 = newbicicleta.get(5);
                        somaPreco += newbicicleta6.getPreco();
                        somaQuantedade += newbicicleta6.getQuantidade();
                        break;
                    case 7:
                        Produtos newbicicleta7 = newbicicleta.get(6);
                        somaPreco += newbicicleta7.getPreco();
                        somaQuantedade += newbicicleta7.getQuantidade();
                        break;
                    default:
                        System.out.println("Item inválido.");
                }
                
             }
             if(escolha == 3)
             {
                for (Produtos produto : oldbicicleta) {
                    System.out.println("Iten: " + produto.getItem());
                    System.out.println("Produto: " + produto.getNome());
                    System.out.println("Preço: R$ " + produto.getPreco());
                    System.out.println("Quantidade: " + produto.getQuantidade());
                    System.out.println("-------------------");
                }
                System.out.println("Qual itens vai querer?");
                int itemEscolhido= sc.nextInt();
                switch (itemEscolhido) {
                    case 1:
                        Produtos oldbicicleta1 = oldbicicleta.get(0);
                        somaPreco += oldbicicleta1.getPreco();
                        somaQuantedade += oldbicicleta1.getQuantidade();
                        break;
                    case 2:
                        Produtos oldbicicleta2 = oldbicicleta.get(1);
                        somaPreco += oldbicicleta2.getPreco();
                        somaQuantedade += oldbicicleta2.getQuantidade();
                        break;
                    case 3:
                        Produtos oldbicicleta3 = oldbicicleta.get(2);
                        somaPreco += oldbicicleta3.getPreco();
                        somaQuantedade += oldbicicleta3.getQuantidade();
                        break;
                    case 4:
                        Produtos oldbicicleta4 = oldbicicleta.get(3);
                        somaPreco += oldbicicleta4.getPreco();
                        somaQuantedade += oldbicicleta4.getQuantidade();
                        break;
                    case 5:
                        Produtos oldbicicleta5 = oldbicicleta.get(4);
                        somaPreco += oldbicicleta5.getPreco();
                        somaQuantedade += oldbicicleta5.getQuantidade();
                        break;
                    case 6:
                        Produtos oldbicicleta6 = oldbicicleta.get(5);
                        somaPreco += oldbicicleta6.getPreco();
                        somaQuantedade += oldbicicleta6.getQuantidade();
                        break;
                    case 7:
                        Produtos oldbicicleta7 = oldbicicleta.get(6);
                        somaPreco += oldbicicleta7.getPreco();
                        somaQuantedade += oldbicicleta7.getQuantidade();
                        break;
                    default:
                        System.out.println("Item inválido.");
                }
                
             }      
              if(escolha==0)
              {
                System.out.println("Tenha um bom dia.");
                break;
              }   
              
        }
        if(somaPreco >0 && somaQuantedade!=0)
        {
           
           System.out.println(" Qual a formade de pagamento ");
           System.out.println("1- Pix.");
           System.out.println("2- Creditor.");
           System.out.println("3-Débito.");
           System.out.println("4- Dinhero físico.");
           int cartao= sc.nextInt();
           switch (cartao) {
               case 1:
                     System.out.println("Quantedade: "+somaQuantedade);
                     System.out.println("Total: "+somaPreco);
                   
                   break;
               case 2:
                   System.out.println("Quantas vezes quer dividir:");
                    double dividir= sc.nextDouble();
                    System.out.println("Quantedade: "+somaQuantedade);
                    System.out.println("Total: "+somaPreco);
                    System.out.println("Vezes: "+dividir);
                   System.out.println("Total: R$"+ somaPreco / dividir   );
                   break;
               case 3:
               System.out.println("Quantedade: "+somaQuantedade);
               System.out.println("Total: "+somaPreco);
                   break;
               case 4:
               System.out.println("Quantedade: "+somaQuantedade);
               System.out.println("Total: "+somaPreco);
                   break;
               default:
                   break;
           }
        }
        else{
           System.out.println("Bye...");
        }
     sc.close();
    }
}