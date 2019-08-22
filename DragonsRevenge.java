package dragons.revenge;

import java.util.Scanner;

/**
 * @author Fernando
 */
public class DragonsRevenge {

    static String Nome;
    static int PontosGame = 0;
    static Scanner Input = new Scanner(System.in);

    static void desenharDragao() {
        System.out.println("!__!__!__!__!__!__!__!__!__!__!__!__!__!__!__!__!__"
                + "!__!__! DRAGON'S REVENGE !__!__!__!_!__!__!__!____!__!__!__!"
                + "__!__!__!__!__!__!__!__! "
                + "                                                "
                + "|===-~___                _,-'\n"
                + "                 -==\\\\                         `//~\\\\"
                + "   ~~~~`---.___.-~~\n"
                + "             ______-==|                         | |  \\\\"
                + "           _-~`\n"
                + "       __--~~~  ,-/-==\\\\                        | |   `\\"
                + "        ,'\n"
                + "    _-~       /'    |  \\\\                      / /      \\"
                + "      /\n"
                + "  .'        /       |   \\\\                   /' /        "
                + "\\   /'\n"
                + " /  ____  /         |    \\`\\.__/-~~ ~ \\ _ _/'  /         "
                + " \\/'\n"
                + "/-'~    ~~~~~---__  |     ~-/~         ( )   /'        "
                + "_--~`\n"
                + "                  \\_|      /        _)   ;  ),   __--~~\n"
                + "                    '~~--_/      _-~/-  / \\   '-~ \\\n"
                + "                   {\\__--_/}    / \\\\_>- )<__\\      \\\n"
                + "                   /'   (_/  _-~  | |__>--<__|      |\n"
                + "                  |0  0 _/) )-~     | |__>--<__|     |\n"
                + "                  / /~ ,_/       / /__>---<__/      |\n"
                + "                 o o _//        /-~_>---<__-~      /\n"
                + "                 (^(~          /~_>---<__-      _-~\n"
                + "                ,/|           /__>--<__/     _-~\n"
                + "             ,//('(          |__>--<__|     /              "
                + "    .----_\n"
                + "            ( ( '))          |__>--<__|    |               "
                + "  /' _---_~\\\n"
                + "         `-)) )) (           |__>--<__|    |             "
                + "  /'  /     ~\\`\\\n"
                + "        ,/,'//( (             \\__>--<__\\    \\          "
                + "  /'  //        ||\n"
                + "      ,( ( ((, ))              ~-__>--<_~-_  ~--____---~'"
                + " _/'/        /'\n"
                + "    `~/  )` ) ,/|                 ~-_~>--<_/-__       __-~"
                + " _/\n"
                + "  ._-~//( )/ )) `                    ~~-'_/_/ /~~~~~~~__"
                + "--~\n"
                + "   ;'( ')/ ,)(                              ~~~~~~~~~~\n"
                + "  ' ') '( (/\n"
                + "    '   '  `");
    } //desenha o dragao

    static void mostrarHistoria() {
        System.out.println();
        System.out.println("Uma lenda antiga! Conto em que dragões sobrevoavam ");
        System.out.println("o planeta terra, com seus cavalheiros destemidos ");
        System.out.println("travando inimagináveis batalhas ao ar.");
        System.out.println("Mas um dia um Homem chamado HellEvil começou a");
        System.out.println("enlouquecer em busca de poder, caçando todos");
        System.out.println("os outros cavalheiros que estavam ao seu redor.");
        System.out.println("Assim fez até não sobrar nenhum! Ou era o que ele"
                + " pensava.");
        System.out.println("A lenda diz que um Dragão antes de morrer escondeu");
        System.out.println("seu ovo e o adormeceu em cristais em uma caverna");
        System.out.println("logo após seu cavalheiro ter sido assassinado por");
        System.out.println("HellEvil, e terá de ser despertado por um jovem de"
                + " coração puro,");
        System.out.println("cujo o ovo de Dragão irá fazer o chamado assim que"
                + " sentir sua presença.");
        System.out.println("E assim se passou 30 anos....");
        System.out.println();
        System.out.println("HellEvil passou a dominar diversos reinos com o “Único Dragão”");
        System.out.println("que havia restado, criando um enorme exército com o passar dos anos");
        System.out.println("uma vasta quantidade de prisioneiros e escravos que esperavam");
        System.out.println("os antigos tempos de glória.");
        System.out.println("Mas o destino estava traçado! Um belo dia HellEvil,  ");
        System.out.println("ordenou que seus soldados adquirissem novos membros para seu exército");
        System.out.println("nas aldeias que se estendiam por seu domínio, e em uma delas morava");
        System.out.println("Mataaz um jovem camponês que residia em uma pequena cabana com seu pai.");
        System.out.println("Mataaz estava caçando coelhos na floresta quando ouviu");
        System.out.println("gritos em sua aldeia “Meu filho não “Ele é muito novo");
        System.out.println("e assim largou tudo e saiu correndo para ver o que estava acontecendo.");
        System.out.println("Chegando em sua vila viu o que estava acontecendo o recrutamento");
        System.out.println("e os soldados estavam assassinando os familiares");
        System.out.println(" daqueles que se recusavam e logo após os levava a força.");
        System.out.println("Escutando o choro de seu pai Mataaz correu ");
        System.out.println("em direção ao seu lar e se deparou com uma");
        System.out.println("cena horrível! Seu pai acabara de tomar uma");
        System.out.println("espadada no abdômen por não saber onde seu filho estava.");
        System.out.println("O jovem em desespero começou a chorar e correr");
        System.out.println("em direção ao seu pai! Que em seus últimos suspiros");
        System.out.println("de vida disse “Corra meu filho seu destino não e servir");
        System.out.println("como esses assassinos, seu futuro lhe aguarda”.");
        System.out.println("Após escutar as ultimas falas de seu pai o Jovem");
        System.out.println("começa a correr sendo perseguido pelos soldados que mataram seu pai...");
        System.out.println();
        System.out.println("O jovem por caçar na região desde que era criança");
        System.out.println("conhecia diversos esconderijos, e um deles era uma");
        System.out.println("antiga caverna que era usada por antigos cavalheiros,");
        System.out.println("mas ele não esperava aquilo que estaria por vir. Uma");
        System.out.println("luz emanando do fundo da caverna juntamente com");
        System.out.println("um ruído que estava dentro de sua cabeça como se ");
        System.out.println("estivesse sendo chamado para tal coisa.");
        System.out.println("Mesmo logo após perder o pai e muito assustado e");
        System.out.println("confuso com tudo que estava acontecendo o jovem");
        System.out.println("decidiu verificar o que estava acontecendo no local ");
        System.out.println("onde estava saindo as luzes. Chegando mais perto ");
        System.out.println("se deparou com uma surpresa e logo pensou");
        System.out.println("“Isso estava aqui todo esse tempo?” ");
        System.out.println("Sim! Ele acabara de encontrar o tão esperado cristal");
        System.out.println("contendo um ovo que estava adormecido por mais de 30 anos.");
        System.out.println("Logo ficou indagado em como retira-lo daquele");
        System.out.println("cristal selado, então pois se a tocar nele até");
        System.out.println("que......CRACK....SNACK....TACK, o jovem ficou");
        System.out.println("paralisado e entrou em transe enquanto o ovo");
        System.out.println("estava sendo rachado, Em sua mente surgiu");
        System.out.println("diversas imagens do passado onde um dragão");
        System.out.println("após ter seu cavalheiro morto esconde seu ovo ");
        System.out.println("naquela caverna em busca de um dia retornar aos tempos de glória.");
        System.out.println("O dragão lhe passou uma mensagem dizendo");
        System.out.println("que ele é a esperança para todos os reinos");
        System.out.println("entrarem em paz novamente e que se ele");
        System.out.println("falhasse o mundo inteiro seria dominado por");
        System.out.println("HellEvil e entraria em ruinas, logo após o");
        System.out.println("garoto perde a consciência e cai ao lado do ovo.");
        System.out.println("Quando acorda percebe que tal havia rachado");
        System.out.println("e não continha nenhum dragão lá. Ficou dando");
        System.out.println("gargalhadas pensando que estava louco pois");
        System.out.println("acabara de perder seu ente mais querido.");
        System.out.println("Mas escutou um ruído muito alto de algo atrás");
        System.out.println("de uma pedra e viu que algo estava se mexendo,");
        System.out.println("rapidamente se armou de um dos cristais");
        System.out.println("que havia caído quando o ovo chocou e  ");
        System.out.println("foi ver se não era algum guerreiro do exercito");
        System.out.println("que o tinha seguido, mas se deparou com uma grande surpresa!");
        System.out.println("Pensou “Não pode ser real, eu enlouqueci” ");
        System.out.println("quando repentinamente uma voz suave em sua cabeça lhe diz");
        System.out.println("–“Olá meu nobre cavalheiro”, ");
        System.out.println("O jovem ficou indagado com aquilo que acabara de");
        System.out.println("acontecer mas não se deixou levar e foi logo dizendo");
        System.out.println("-“Você escolheu a pessoa errada, não tenho capacidade para isso”.");
        System.out.println("\n!__!__!__!_!__!__!__!__!__!__!__!__"
                + "!__!__!__!__!__!__!__!__!__!__!__!");
        subMenu();
    } //mostra a historia

    static void receberNome() {
        System.out.print("Digite o seu nickName: ");
        Nome = Input.next();
    }//recebe nome do jogador

    static void instruir() {
        System.out.println("\nVamos para as instruções.\n"
                + "\n Para jogar este incrivel jogo de perguntas e "
                + "respostas é\n "
                + "extremamente simples, você escolhe um caminho "
                + "para ir e\n "
                + "quando se deparar com inimigos voce devera "
                + "responder uma\n"
                + " pergunta e se caso voce acertar, voce ira fazer"
                + " um\n "
                + "ataque muito poderoso ao seu inimigo e se caso "
                + "você o matar\n"
                + " você ganhará muitos pontos, mas se nao "
                + "acertar,\n"
                + " vocè perderá vida! E se caso voce morrer você "
                + "perdera\n "
                + "pontos!");
        System.out.println("\n!__!__!__!_!__!__!__!__!__!__!__!__!"
                + "__!__!__!__!__!__!__!__!__!__!__!");
        subMenu();
    }//mostra as instruções do game

    static void creditos() {
        System.out.println("Ok, até a proxima!");
    }//agradecimentos

    static void jogar() {
        System.out.println(Nome + ", é aqui que sua jornada começa.");
        System.out.println("E é aqui que você vai ver..");
        System.out.println("Se voce é capaz de enfrentar todos os desafios..");
        System.out.println("E por ultimo, ver se voce é capaz de enfrentar o..?");

        System.out.println();
    }//

    static void subMenu() {
        int voltar;
        System.out.print("Tecle [0] para voltar para o Menu: ");
        voltar = Input.nextInt();
        if (voltar == 0) {
            abrirMenu();
        }
    }

    static void abrirMenu() {
        int opcao;
        System.out.println("Seja muito bem vindo ao mundo de ELICRON: " + Nome);
        do {
            System.out.print(
                    "\n 1 - Jogar"
                    + "\n 2 - Historia do Jogo"
                    + "\n 3 - Instruções"
                    + "\n 4 - Sair\n"
                    + "Agora, selecione a opção desejada: ");
            opcao = Input.nextInt();

            switch (opcao) {
                case 1:
                    jogar();
                    PontosGame += 1000;
                    break;

                case 2:
                    mostrarHistoria();
                    break;
                case 3:
                    instruir();
                    break;

                case 4:
                    creditos();
                    break;
                default:

            }
        } while (opcao > 4);
    }

    static int um() {
        int x = 1;
        return x;

    }

    static String[][] perguntar(int x) {
        int op = 0;
        String[][] p = new String[5][18];
        //Número das perguntas
        int[] np = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};
        //Perguntas
        p[0][0] = "1) O que significa IF?";//Da questão nº 1
        p[0][1] = "2) F(x) é igual a?";//Da questão nº 2
        p[0][2] = "3) O que significa FOR?";//Da questão nº 3
        p[0][3] = "4) Qual a formula de Bháskara?";//Da questão nº 4
        p[0][4] = "5) Quando a reta do gráfico está apontando para baixo no lado negativo ele é:";//Da questão nº 5
        p[0][5] = "6) O que é o coeficiente A no gráfico:";//Da questão nº 6
        p[0][6] = "7) O que é funcao constante?";//Da questão nº 7
        p[0][7] = "8) Qual é a formula para a funçao Afim?";//Da questão nº 8
        p[0][8] = "9) O que significa else?";//Da questão nº 9
        p[0][9] = "10) Para que serve o import java.sql?";//Da questão nº 10
        p[0][10] = "11) O que é metodo main?";//Da questão nº 11
        p[0][11] = "12) O que é java?";//Da questão nº 12
        p[0][12] = "13) Qual dessas palavras não é um tipo de algoritmo?";//Da questão nº 13
        p[0][13] = "14) O que é uma variável ?";//Da questão nº 14
        p[0][14] = "15) Qual palavra nao e considerado um tipo de operador em programação?";//Da questão nº 15
        p[0][15] = "16) Os dados lógicos podem assumirem que tipo de valor:";//Da questão nº 16
        p[0][16] = "17) Qual e o simbolo usado no java para atribuiçao?";//Da questão nº 17
        p[0][17] = "18) O que é um algoritmo";//Da questão nº 18
        //Alternativa A das perguntas
        p[1][0] = "A - Então"; //Da questão nº 1
        p[1][1] = "A - IR"; //Da questão nº 2
        p[1][2] = "A - String"; //Da questão nº 3
        p[1][3] = "A -	x = – b ± Raiz de delta / 2·a"; //da questao n°4
        p[1][4] = "A -	Crescente";// da questao n°5
        p[1][5] = "A -	A é o coeficiente angular do gráfico de f";//da questao n°6
        p[1][6] = "A - É dita constante quando f(x) = a, logo b = 1";//da questao n°7
        p[1][7] = "A -	x = f(x) = y·2x·a";//da questao n°8
        p[1][8] = "A - Se";//da questao n°9
        p[1][9] = "A - Conexão com o mundo";//da questao n°10
        p[1][10] = "A - É uma caixa de dialogo";//da questao n°11
        p[1][11] = "A - É uma caixa de dialogo";//da questao n°12
        p[1][12] = "A - Pseudocódigo";//da questão n°13
        p[1][13] = "A - É um localna menoria destinado a giarda um cálculo informado pelo usuario";//da questao n°14
        p[1][14] = "A - Lógicos";//da questao n°15
        p[1][15] = "A - 3,15,103";//da questao n°16
        p[1][16] = "A - <";//da questao n°17
        p[1][17] = "A - É uma receita que mostra passo a passo os procedimentos";//da questao n°18
        //Alternativa B das perguntas
        p[2][0] = "B - Inteiro"; //Da questão nº 1
        p[2][1] = "B - X"; //Da questão nº 2
        p[2][2] = "B - Variavel"; //Da questão nº 3
        p[2][3] = "B -	x = f(x) = 2x-b/·2a"; //da questao n°4
        p[2][4] = "B -	Retilineo";// da questao  n°5
        p[2][5] = "B -	A é o coeficiente linear, ou o ponto de intersecção com o eixo y";//da questao n°6
        p[2][6] = "B - É dita constante quando f(x) = 1, logo a = 0";//da questao n°7
        p[2][7] = "B - x = f(x) = 2x-b/·2a";//da questao n°8
        p[2][8] = "B - Se não";//da questao n°9
        p[2][9] = "B - Conexão com a classe";//da questao n°10
        p[2][10] = "B - É um método utilizado para fazer pesquisas";//da questao n°11
        p[2][11] = "B - É um método para fazer pesquisas";//da questao n°12
        p[2][12] = "B - Fluxograma";//da questão n°13
        p[2][13] = "B - É um objeto ( uma posição , frequentemente localizado na memória)";//da questao n°14
        p[2][14] = "B - Artiméticos";//da questao n°15
        p[2][15] = "B - 'A ,B,C,D'";//da questao n°16
        p[2][16] = "B - =";//da questao n°17
        p[2][17] = "B - São numeros matemáticos";//da questao n°18
        //Alternativa C das perguntas
        p[3][0] = "C - Se"; //Da questão nº 1
        p[3][1] = "C - +"; //Da questão nº 2
        p[3][2] = "C - Imprimir"; //Da questão nº 3
        p[3][3] = "C - x = b + v? / 2";// da questao n°4
        p[3][4] = "C -	Afim";// da questao n°5
        p[3][5] = "C -	A é a variável independente";//da questao n°6
        p[3][6] = "C- É dita constante quando f(x) = c, logo b = 0";//da questao n°7
        p[3][7] = "C -	y = f(x) = a·x + b";//da questao n°8
        p[3][8] = "C - Ok";//da questao n°9
        p[3][9] = "C - Conexão com o banco de dados";//da questao n°10
        p[3][10] = "C - É um método que criptografa os textos";//da questao n°11
        p[3][11] = "C - É uma linguagem de programação orientada a objetos";//da questao n°12
        p[3][12] = "C - Descriçao intuitiva";//da questão n°13
        p[3][13] = "C - São onde os cálculos sao realizados e armazenados";//da questao n°14
        p[3][14] = "C - Descrição";//da questao n°15
        p[3][15] = "C- Verdaddeiro e falso";//da questao n°16
        p[3][16] = "C - <=";//da questao n°17
        p[3][17] = "C - São expressões matemáticas complexas";//da questao n°18
        //Alternativa D das perguntas
        p[4][0] = "D - Não"; //Da questão nº 1
        p[4][1] = "D - Y"; //Da questão nº 2
        p[4][2] = "D - Para"; //Da questão nº 3    
        p[4][3] = "D -	x = – ? ± vb / 2·a"; //da questao n°4
        p[4][4] = "D -	Decrescente";// da questao n°5
        p[4][5] = "D -	Nenhuma das alternativas";//da questao n°6
        p[4][6] = "D - É dita constante quando f(x) = b, logo a = 0";//da questao n°7
        p[4][7] = "D - a = f(x) = a·b·x";//da questao n°8
        p[4][8] = "D - Seila";//da questao n°9
        p[4][9] = "D - Conexão com o Package";//da questao n°10
        p[4][10] = "D - É um método principal";//da questao n°11
        p[4][11] = "D - É um método para criar criptografar objetos";//da questao n°12
        p[4][12] = "D - Diagrama de chapin.";//da questao n°13
        p[4][13] = "D - É uma equaçao matematica de numeros";//da questao n°14
        p[4][14] = "D - Relacionais";//da questao n°15
        p[4][15] = "D -2,14;3,14;-58";//da questao n°16
        p[4][16] = "D - <-";//da questao n°17
        p[4][17] = "D - É uma receita que mostra o que fazer em um problema";//da questao n°18
        for (int i = 1; i < np.length; i++) {
            if (np[i] == x) {
                op = x - 1;
            }
        }
        System.out.println(p[0][op]);
        for (int i = 1; i < 5; i++) {
            System.out.println(p[i][op]);
        }
        return p;
    }

    static char receberResposta() {
        char resposta;
        System.out.print("Informe uma das opções: ");
        resposta = Input.next().charAt(0);
        char r = Character.toUpperCase(resposta);
        return r;
    }

    static boolean corrigir(int x, char y) {
        boolean resp;
        int cont = 0;
        int[] np = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};
        // respostas das questoes
        char[] r = {'C', 'D', 'D', 'A', 'D', 'A', 'D', 'C', 'B', 'C', 'D', 'C', 'B', 'C', 'C', 'A', 'A'};

        for (int i = 0; i < np.length; i++) {
            if (x == np[i] && y == r[i]) {
                cont++;
            }
        }
        resp = cont == 1;
        return resp;
    }

    static int pontos(boolean c) {
        int p;
        if (c == true) {
            p = 1000;
        } else {
            p = -4000;
        }
        return p;
    }

    static int gravarPontos(int p) {
        int ptsatual = PontosGame;
        if (p == 1000) {
            ptsatual = ptsatual + p;
        } else {
            ptsatual = ptsatual + p;
        }
        PontosGame = ptsatual;
        return ptsatual;
    }

    static void imprimirResultado(boolean cor, int pts) {
        if (cor == true) {
            System.out.println("Resposta Correta.");
            System.out.printf("Sua pontuação atual é de %d pontos.\n", pts);
            System.out.println();
        } else if (cor == false) {
            System.out.println("Resposta Incorreta.");
            System.out.println("Você perdeu 4000 pontos!!!");
            System.out.printf("Sua pontuação atual é de %d pontos.\n", pts);
            System.out.println();
        }
        while (cor == false && pts < 0) {
            System.out.println("Resposta Incorreta, infelismente os seus pontos zeraram!!!!");
            System.out.println("Voce foi completamente extinto!!!!!!!");
            System.out.println("Fim do jogo!!!");
            System.out.println("TENTE NOVAMENTE SE UM DIA VOCÊ FOR CAPAZ!");
            break;
        }
    }

    static void CHEFE() {
        System.out.println();
        System.out.println("Você conseguiu vencer até aqui!");
        System.out.println("Mas, agora que ira ficar dificil!");
        System.out.println("Porque, neste momento você vai enfrentar");
        System.out.println("O temivel... O Horrivel... O Extreminador de Dragões");
        System.out.println("-_-_-_-_-_-_HellEvil-_-_-_-_-_-_");
        System.out.println();
    }

    static String[][] perguntaChefe(int x) {
        int op = 0;
        String[][] p = new String[5][5];
        int[] np = {1, 2, 3, 4, 5};
        // pergntas do chefe
        p[0][0] = "1) Como qualcular Xv?";  // da perguntan°1
        p[0][1] = "2) Como calcular Yv?"; // da perguntan°2
        p[0][2] = "3) Que tipo de função é essa: X-2X-1=0?"; // da perguntan°3
        p[0][3] = "4)  Que tipo de função é essa? X²-2X-4=0"; // da pergunta n°4
        p[0][4] = "5) Qual é a soma das raizes da função f(x)=x²+8x-9?";
        // Alternativa A das perguntas
        p[1][0] = "a) Xv = -b/2.a"; //da pergunta n°1
        p[1][1] = "a) Yv = -b/2.c"; // da pergunta n°2
        p[1][2] = "a) Função do segundo grau"; // da pergunta n°3
        p[1][3] = "a) Função terceiro grau"; // da pergunta n°4
        p[1][4] = "a) -8";//da pergunta n°5
        // Alternativa B das perguntas
        p[2][0] = "b)Xv = -a/2.b"; //da pergunta n°1
        p[2][1] = "b) Yv = -Delta/4.b"; // da pergunta n°2
        p[2][2] = "b) Não é uma equação"; // da pergunta n°3
        p[2][3] = "b) Função primeiro grau"; // da pergunta n°4
        p[2][4] = "b) -9;"; // da pergunta n°5
        // Alternativa C das perguntas
        p[3][0] = "c) Xv = -delta/2.a"; //da pergunta n°1
        p[3][1] = "c) Yv = -Delta/4.a"; // da pergunta n°2
        p[3][2] = "c) Função terceiro grau"; // da pergunta n°3
        p[3][3] = "c) Função segundo grau"; // da pergunta n°4
        p[3][4] = "b) 8"; // da pergunta n°5
        // Alternativa D das perguntas
        p[4][0] = "d) Xv = -b/2.c"; //da pergunta n°1
        p[4][1] = "d) Yv = 4.a/Delta"; // da pergunta n°2
        p[4][2] = "d) Função do primeiro grau"; // da pergunta n°3
        p[4][3] = "d) Nenhuma das alternativas"; // da pergunta n°4
        p[4][4] = "b) 1"; // da pergunta n°5
        for (int i = 1; i < np.length; i++) {
            if (np[i] == x) {
                op = x - 1;
            }

        }
        System.out.println(p[0][op]);
        for (int i = 1; i < 5; i++) {
            System.out.println(p[i][op]);
        }
        return p;

    }

    static char receberRespostaChefe() {
        char resposta;
        System.out.print("Informe uma das opções: ");
        resposta = Input.next().charAt(0);
        char r = Character.toUpperCase(resposta);
        return r;
    }

    static boolean corrigirChefe(int x, char y) {
        boolean resp;
        int cont = 0;
        int[] np = {1, 2, 3, 4, 5};
        // respostas chefe
        char[] r = {'A', 'C', 'D', 'C', 'A'};

        for (int i = 0; i < np.length; i++) {
            if (x == np[i] && y == r[i]) {
                cont++;
            }
        }
        resp = cont == 1;
        return resp;
    }

    static int pontosChefe(boolean c) {
        int p;
        if (c == true) {
            p = 2000;
        } else {
            p = -4000;
        }
        return p;
    }

    static int gravarPontosChefe(int p) {
        int ptsatual = PontosGame;
        if (p == 1000) {
            ptsatual = ptsatual + p;
        } else {
            ptsatual = ptsatual + p;
        }
        PontosGame = ptsatual;
        return ptsatual;
    }

    static void imprimirResultadoChefe(boolean cor, int p) {
        if (cor == true) {
            System.out.println("Resposta Correta.");
            System.out.printf("Você Tirou um dano Do chefe consideravelmente FORTE do HEllEVILL!!\n");
            System.out.println();
        }
        while (cor == true && PontosGame >= 11000) {
            System.out.println("WWOOOWWWWW");
            System.out.println(Nome + ", você é incrivel!!");
            System.out.println("Você Conseguiu fazer o impossivel!!");
            System.out.println("O chefe foi DERROTADO");
            System.out.println("Conseguimos, finalmente, restaudar a paz!!");
            System.out.println("E devemos tudo isso a você" + Nome);
            System.out.println("Espero que continue a nos proteger para todo o sempre!");
            break;

        }
        if (cor == false) {
            System.out.println("Resposta Incorreta.");
            System.out.println("Voce levou uma pancada MUITO FORTE!!!");
            System.out.println();

        }
        while (cor == false && PontosGame < 5000) {
            System.out.println("Resposta Incorreta, infelismente suas chanches acabaram!!!!");
            System.out.println("Voce foi aniquilado!!!!!!!");
            System.out.println("Fim do jogo!!!");
            System.out.println("TENTE NOVAMENTE QUANDO FOR CAPAZ!" + Nome);
            break;

        }
    }

    static void controlar() {
        int ale = 0, pts, ptsatual;
        char rp;
        boolean cor;
        desenharDragao();
        receberNome();
        abrirMenu();

        while (PontosGame > 0 && PontosGame < 18000) {
            ale = ale + um();
            perguntar(ale);
            rp = receberResposta();
            cor = corrigir(ale, rp);
            pts = pontos(cor);
            ptsatual = gravarPontos(pts);
            imprimirResultado(cor, ptsatual);
            if (PontosGame >= 18000) {
                controlarChefe();
                break;
            }

        }
    }

    static void controlarChefe() {
        int ale = 0, pts, ptsatual;
        char rp;
        boolean cor;
        CHEFE();
        do {
            ale = ale + um();
            perguntaChefe(ale);
            rp = receberRespostaChefe();
            cor = corrigirChefe(ale, rp);
            pts = pontosChefe(cor);
            ptsatual = gravarPontosChefe(pts);
            imprimirResultadoChefe(cor, ptsatual);

        } while (PontosGame >= 18000 && PontosGame < 27000);

    }

    public static void main(String[] args) {
        controlar();
    }
}
