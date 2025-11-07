import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    int opcao = 0;
    int opcao_ = 0, opcao1 = 0, opcao2 = 0;
    int contador = 0;
    
    int bebopc;
    int indice1 = 0, indice2 = 0, indice3 = 0;
    double valor_total;

    int[] telefone = new int[5];
    int[] opcml = new int[5];
    double[] valor_sanduiches = new double[10];
    double[] valor_bebidas = new double[10];
    String[] sanduiches = new String[10];
    String[] bebidas = new String[10];
    String[] clientes = new String[10];
    String[] pedidos = new String[10];
    String[] endereco = new String[10];
    

    // NOME DA LANCHONETE
    System.out.println("****************************************************");
    System.out.println("-------------- LANCHONETE SANTA CLARA --------------");
    System.out.println("****************************************************");
    // MENU GERAL
    while (opcao != 5) {
      System.out.println("----------------SEJA MUITO BEM-VINDO----------------");
      System.out.println("+--------------------------------------------------+");
      System.out.println("|                       MENU                       |");
      System.out.println("+--------------------------------------------------+");
      System.out.println("|--------------------------------------------------|");
      System.out.println("| [1] - Sanduíches                                 |");
      System.out.println("| [2] - Bebidas                                    |");
      System.out.println("| [3] - Clientes                                   |");
      System.out.println("| [4] - Pedidos                                    |");
      System.out.println("| [5] - Sair                                       |");
      System.out.println("|--------------------------------------------------|");
      System.out.println("+--------------------------------------------------+");
      System.out.print("Digite a opção: ");
      opcao = ler.nextInt();

      switch (opcao) {
        //Case 1  é o que exibi o MENU SANDUÍCHES
        case 1:
          if (pedidos.length == contador) { 
            System.out.println("Estamos com o valor máximo de pedidos, aguarde alguns minutos para ser atendido!");
          } else {
            System.out.println("+---------------------------------+");
            System.out.println("|        MENU - SANDUÍCHES        |");
            System.out.println("+---------------------------------+");
            System.out.println("|---------------------------------|");
            System.out.println("| [1] - Cadastrar Sanduíche       |");
            System.out.println("| [2] - Editar Sanduíche          |");
            System.out.println("| [3] - Listar Sanduíches         |");
            System.out.println("| [4] - Voltar                    |");
            System.out.println("|---------------------------------|");
            System.out.println("+---------------------------------+");
            System.out.print("Digite a opção: ");
            opcao_ = ler.nextInt();

            switch (opcao_) {
              case 1:
                //Exibi o cardápio dos sanduíches
                System.out.println("+----------------------------------+");
                System.out.println("| Você escolheu a opção Sanduíches |");
                System.out.println("+----------------------------------+");
                System.out.println("--------- OPÇÕES ---------");
                System.out.println("*----------------------------------------------------------------------------------------*");
                System.out.println("¨¨¨¨¨¨1-X-MILHO¨¨¨¨¨¨");
                System.out.println("COMPONENTES: Pão grande, hambúguer, queijo, milho, batata palha, salada, presunto e creme especial");
                System.out.println("VALOR: R$ 8,00 ");
                System.out.println("*----------------------------------------------------------------------------------------*");
                System.out.println("¨¨¨¨¨¨2-AMERICANO¨¨¨¨¨¨");
                System.out.println("COMPONENTES: Pão grande, hambúguer, queijo, ovo, salada, batata palha, presunto e creme especial ");
                System.out.println("VALOR: R$ 9,00 ");
                System.out.println("*----------------------------------------------------------------------------------------*");
                System.out.println("¨¨¨¨¨¨3-AMERICANO BURGUER¨¨¨¨¨¨");
                System.out.println("COMPONENTES: Pão grande, hambúguer,queijo, milho, batata palha, ovo, salada, salsicha, presunto e creme especial  ");
                System.out.println("VALOR: R$ 10,00 ");
                System.out.println("*----------------------------------------------------------------------------------------*");
                System.out.println("¨¨¨¨¨¨4-X-CALABRESA¨¨¨¨¨¨");
                System.out.println("COMPONENTES: Pão grande, hambúguer,queijo, milho, batata palha, salada, ovo,  calabresa, presunto e creme especial");
                System.out.println("VALOR: R$ 11,00 ");
                System.out.println("*----------------------------------------------------------------------------------------*");
                System.out.println("¨¨¨¨¨¨5-X-BACON¨¨¨¨¨¨");
                System.out.println("COMPONENTES: Pão grande, 2 hambúgueres,queijo, milho, batata palha, ovo,  salada, bacon, presunto e creme especial ");
                System.out.println("VALOR: R$ 13,50 ");
                System.out.println("*----------------------------------------------------------------------------------------*");
                System.out.println("¨¨¨¨¨¨6-X-TUDO¨¨¨¨¨¨");
                System.out.println("COMPONENTES: Pão grande, hambúguer,queijo, milho, batata palha, salada, ovo,  presunto, salsicha e molho cheddar ");
                System.out.println("VALOR: R$ 12,00 ");
                System.out.println("*----------------------------------------------------------------------------------------*");
                System.out.println("¨¨¨¨¨¨7-ESPECIAL DA CASA¨¨¨¨¨¨");
                System.out.println("COMPONENTES: Pão extra grande, 2 hambúgueres, 2 ovos, queijo, milho, salsicha, bacon, calabresa, batata palha, salada, presunto e creme especial");
                System.out.println("VALOR: R$ 17,00 ");
                System.out.println("*----------------------------------------------------------------------------------------*");
                System.out.println("¨¨¨¨¨¨8-X-TOSCANA¨¨¨¨¨¨");
                System.out.println("COMPONENTES: Pão grande, hambúguer, ovo, linguiça toscana, queijo, milho, batata palha, salada, presunto e molho cheddar");
                System.out.println("VALOR: R$ 13,00 ");
                System.out.println("*----------------------------------------------------------------------------------------*");
                System.out.println("*-----Cadastrar Sanduíche-----*");
                System.out.println("De acordo com o sanduíche que você escolheu, digite o nome do sanduíche.");
                System.out.print("Digite o nome: ");
                  sanduiches[contador] = ler.next();
                System.out.print("Digite o valor do sanduíche: ");
                  valor_sanduiches[contador] = ler.nextDouble();
                break;
              case 2:
                //Opção responsável por exibir os dados inseridos pelo usuário
                System.out.print("Digite um índice: ");
                  int indice = ler.nextInt();
                System.out.println("Nome: " + sanduiches[indice]);
                System.out.println("Valor: " + valor_sanduiches);

                System.out.print("Digite um nome: ");
                  sanduiches[indice] = ler.next();
                System.out.print("Digite o valor: ");
                  valor_sanduiches[indice] = ler.nextDouble();
                break;
              case 3:
                //Opção responsável por exibir os dados inserido
                for (int i = 0; i < sanduiches.length; i++) {
                  System.out.println("Nome: " + sanduiches[i] + " Valor: " + valor_sanduiches[i]);
                }
              case 4:
              //Opção VOLTAR
            }
          }
          break;

        case 2:
          //Case 2 é o que entra no MENU BEBIDAS
          System.out.println("+---------------------------------+");
          System.out.println("|         MENU - BEBIDAS          |");
          System.out.println("+---------------------------------+");
          System.out.println("|---------------------------------|");
          System.out.println("| [1] - Cadastrar Bebida          |");
          System.out.println("| [2] - Editar Bebida             |");
          System.out.println("| [3] - Listar Bebidas            |");
          System.out.println("| [4] - Voltar                    |");
          System.out.println("|---------------------------------|");
          System.out.println("+---------------------------------+");
          System.out.print("Digite a opção: ");
            opcao1 = ler.nextInt();

          switch (opcao1) {
            case 1:
              //Opção responsável pelo Cadastro da bebida
              System.out.println("+-------------------------------+");
              System.out.println("| Você escolheu a opção Bebidas |");
              System.out.println("+-------------------------------+");
              System.out.print("Qual tipo de bebida você quer? Digite 1 para suco e 2 para refrigerante: ");
                bebopc = ler.nextInt();
              if (bebopc == 1) {
                System.out.println("--------- OPÇÕES ---------");
                System.out.println("SUCOS:");
                System.out.println("¨¨¨1-ABACAXI¨¨¨¨");
                System.out.println("¨¨¨2-ACELORA¨¨¨");
                System.out.println("¨¨¨3-GOIABA¨¨¨");
                System.out.println("¨¨¨4-MORANGO¨¨¨");
                System.out.println("¨¨¨5-MANGA¨¨¨");
                System.out.println("¨¨¨6-MARACUJÁ¨¨¨");
                System.out.println("------------------");
                System.out.println("De acordo com o suco que você escolheu, digite o  nome da bebida.");
                System.out.print("Digite sua bebida: ");
                  bebidas[contador] = ler.next();
                System.out.println("Agora em relação ao tamanho do copo em ml,temos de: ");
                System.out.println("200ml");
                System.out.println("VALOR: R$ 3,00 ");
                System.out.println("300ml");
                System.out.println("VALOR: R$ 4,00 ");
                System.out.println("400ml");
                System.out.println("VALOR: R$ 4,00 ");
                System.out.println("700ml");
                System.out.println("VALOR: R$ 7,00 ");
                System.out.print("Você quer de quantos ml?:");
                  opcml[contador] = ler.nextInt();
                System.out.print("Digite o valor do suco: ");
                  valor_bebidas[contador] = ler.nextDouble();
              } else if (bebopc == 2) {
                System.out.println("REFRIGERANTES:");
                System.out.println("¨¨¨7-HIRAN DE 1L¨¨¨");
                System.out.println("VALOR: R$ 5,00 ");
                System.out.println("¨¨¨8-HIRAN DE 2L¨¨¨");
                System.out.println("VALOR: R$ 7,00 ");
                System.out.println("¨¨¨9-COCA-COLA DE 1L¨¨¨");
                System.out.println("VALOR: R$ 6,50 ");
                System.out.println("¨¨¨10-COCA-COLA DE 2L¨¨¨");
                System.out.println("VALOR: R$ 9,00 ");
                System.out.println("------------------");
                System.out.println( "De acordo com a refrigerante que você escolheu, digite o nome da bebida.");
                System.out.print("Digite sua bebida: ");
                  bebidas[contador] = ler.next();
                System.out.print("Digite o tamanho que você quer?: ");
                  opcml[contador] = ler.nextInt();
                System.out.print("Digite o valor da bebida: ");
                  valor_bebidas[contador] = ler.nextDouble();
              }
              break;
            case 2:
              //Opção responsável por editar os dados já inseridos
              System.out.print("Digite um índice: ");
                indice2 = ler.nextInt();
              System.out.println("Nome: " + bebidas[indice2]);
              System.out.println("Idade: " + valor_bebidas[indice2]);
              System.out.println("Tamanho: " + opcml[indice2]);

              System.out.print("Digite um nome: ");
                bebidas[indice2] = ler.next();
              System.out.print("Digite o valor: ");
                valor_bebidas[indice2] = ler.nextDouble();
              System.out.print("Digite o tamanho: ");
                opcml[indice2] = ler.nextInt();
              break;
            case 3:
              //Opção responsável por exibir a bebida escolhida
              for (int i = 0; i <  bebidas.length; i++) {
                System.out.println("Nome: " + bebidas[i] + "Valor:  "+valor_bebidas[i]);
              
              }
                break;
            case 4:
            //Opção VOLTAR
          }
          break;

        case 3:
           //Case 3  é o que entra no MENU CLIENTES
          System.out.println("+---------------------------------+");
          System.out.println("|          MENU - CLIENTES        |");
          System.out.println("+---------------------------------+");
          System.out.println("|---------------------------------|");
          System.out.println("| [1] - Cadastrar Cliente         |");
          System.out.println("| [2] - Editar Cliente            |");
          System.out.println("| [3] - Listar Clientes           |");
          System.out.println("| [4] - Voltar                    |");
          System.out.println("|---------------------------------|");
          System.out.println("+---------------------------------+");
          System.out.print("Digite a opção: ");
            opcao2 = ler.nextInt();

          switch (opcao2) {
            case 1:
              //Essa opção faz com que o usuário insira os seus dados
              System.out.println("+--------------------------------+");
              System.out.println("| Você escolheu a opção Clientes |");
              System.out.println("+--------------------------------+");
              System.out.println("Insira os dados pedidos para realizar seu cadastro aqui: ");
              System.out.print("Digite seu nome: ");
                clientes[contador] = ler.next();
              System.out.print("Digite seu endereço: ");
                endereco[contador] = ler.next();
              System.out.print("Digite seu telefone: ");
                telefone[contador] = ler.nextInt();
              break;
            case 2:
              //Essa opção faz com que o usuário corrija os seus dados
              System.out.print("Digite um índice: ");
                indice1 = ler.nextInt();
              System.out.println("Nome: " + clientes[indice1]);
              System.out.println("Idade: " + endereco[indice1]);
              System.out.println("Tamanho: " + telefone[indice1]);

              System.out.print("Digite seu nome: ");
                clientes[indice1] = ler.next();
              System.out.print("Digite seu endereço: ");
                endereco[indice1] = ler.next();
              System.out.print("Digite seu telefone: ");
                telefone[indice1] = ler.nextInt();
              break;
            case 3:
              //Essa opção vai exibir os clientes cadastrados
              for(int i = 0; i < clientes.length; i++){
                System.out.println("Nome: " + clientes[i] + " Endereço: " + endereco[i] + " Telefone" + telefone[i]);
               
              }
               break;
            case 4:
              //Opção voltar
            }
          break;

        case 4:
           //Case 4 é o responsável por exibir o MENU PEDIDOS
          System.out.println("+---------------------------------+");
          System.out.println("|          MENU - PEDIDOS         |");
          System.out.println("+---------------------------------+");
          System.out.println("|---------------------------------|");
          System.out.println("| [1] - Verificar Pedido          |");
          System.out.println("| [2] - Listar Pedidos            |");
          System.out.println("| [3] - Voltar                    |");
          System.out.println("|---------------------------------|");
          System.out.println("+---------------------------------+");
          System.out.print("Digite a opção: ");
            int opcao3 = ler.nextInt();
          switch (opcao3){
            case 1:
              //Opção para exibir as informações do pedido
          System.out.println("+-------------------------------+");
          System.out.println("| Você escolheu a opção Pedidos |");
          System.out.println("+-------------------------------+");
          System.out.print("Digite seu índice de cadastro: ");
            int indices = ler.nextInt();
          System.out.println("Bem vindo: " + clientes[indices]);
          System.out.println("Seu pedido foi um: " + sanduiches[indices]);
          System.out.println("Isso custa: " + valor_sanduiches[indices]);
          System.out.println("E uma: " + bebidas[indices]);
          System.out.println("Isso custa: " + valor_bebidas[indices]);
            valor_total = (valor_sanduiches[indices] + valor_bebidas[indices]);
          System.out.println("O valor total da sua compra foi de: " + valor_total);
              break;
            case 2:
              //Opção para exibir todas as iformações inseridas pelo cliente
               for(int i = 0; i < pedidos.length; i++){
                System.out.println("Os pedidos foram: " + pedidos[i]);
               }
              break;
            case 3:
            //Opção voltar
          }
          contador++;
          break;

        case 5:
          //Case 5 esse é responsável pela opção SAIR
          System.out.println("+----------------------------+");
          System.out.println("| Você escolheu a opção Sair |");
          System.out.println("+----------------------------+");
          System.out.println("Até logo!");
          break;
      
        default:
          System.out.println("Opção inválida!");
        }
      }
    }
  }