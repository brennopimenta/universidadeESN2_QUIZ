public class Main {
    public static void main(String[] args) {

        import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Questao> questoes = new ArrayList<>();
        int acertos = 0;

        // 1. Apresentar o cabeçalho
        exibirCabecalho();

        // 2. Instanciar a lista de 15 questões
        carregarQuestoes(questoes);

        System.out.println("\n=== INÍCIO DO QUIZ ===");
        System.out.println("Responda com as letras A, B, C, D ou E.");

        // 3. Estrutura de repetição para percorrer todas as questões
        for (int i = 0; i < questoes.size(); i++) {
            System.out.println("\n---------------------------------------------------------");
            System.out.print("Pergunta " + (i + 1) + " de " + questoes.size() + ": ");
            
            Questao q = questoes.get(i);
            q.exibirQuestao();
            
            String respostaUsuario = scanner.nextLine().toUpperCase();

            // Validação simples usando while para obrigar o usuário a digitar uma opção válida
            while (!respostaUsuario.matches("[ABCDE]")) {
                System.out.println("Opção inválida! Por favor, digite A, B, C, D ou E.");
                System.out.print("Sua resposta: ");
                respostaUsuario = scanner.nextLine().toUpperCase();
            }

            // 4. Estrutura condicional para validar o acerto
            if (q.verificarResposta(respostaUsuario)) {
                System.out.println("✅ Resposta Correta!");
                acertos++;
            } else {
                System.out.println("❌ Resposta Incorreta!");
            }
        }

        // 5. Exibir os resultados finais
        exibirResultados(acertos, questoes.size());

        scanner.close();
    }

    // Método para exibir o Cabeçalho
    public static void exibirCabecalho() {
        System.out.println("=========================================================");
        System.out.println("         QUIZ: TECNOLOGIA E PROGRAMAÇÃO                  ");
        System.out.println("=========================================================");
        System.out.println(" Aluno(a): [SEU NOME COMPLETO AQUI]");
        System.out.println(" Professor(a): [NOME DO PROFESSOR AQUI]");
        System.out.println(" Faculdade: [NOME DA FACULDADE AQUI]");
        System.out.println(" Curso: Engenharia de Software / Seg. da Informação - 2º Período");
        System.out.println("=========================================================");
    }

    // Método para calcular a porcentagem e exibir a mensagem final
    public static void exibirResultados(int acertos, int totalQuestoes) {
        System.out.println("\n=========================================================");
        System.out.println("                     FIM DO QUIZ!                        ");
        System.out.println("=========================================================");
        
        System.out.println("Total de perguntas: " + totalQuestoes);
        System.out.println("Quantidade de acertos: " + acertos);
        
        // Calculando a porcentagem com base no total de questões (cast para double é necessário)
        double porcentagem = ((double) acertos / totalQuestoes) * 100;
        
        // Exibe com formatação de 2 casas decimais (%.2f)
        System.out.printf("Porcentagem de acertos: %.2f%%\n", porcentagem);
        System.out.println("=========================================================");
        
        // Mensagem de feedback condicional
        if (porcentagem >= 70) {
            System.out.println("Parabéns! Você tem um ótimo conhecimento na área de TI!");
        } else {
            System.out.println("Continue estudando! A área de tecnologia requer prática constante.");
        }
        
        System.out.println("\nMuito obrigado por participar do Quiz!");
    }

    // Método que adiciona as 15 questões instanciadas na List (Collection)
    public static void carregarQuestoes(List<Questao> lista) {
        lista.add(new Questao("Quem é frequentemente considerado o 'Pai da Computação'?",
                "Alan Turing", "Bill Gates", "Steve Jobs", "Mark Zuckerberg", "Ada Lovelace", "A"));

        lista.add(new Questao("O que significa a sigla CPU?",
                "Control Processing Unit", "Computer Personal Unit", "Central Processing Unit", "Central Peripheral Unit", "Code Processing Utility", "C"));

        lista.add(new Questao("O que é um Sistema Operacional?",
                "Um tipo de hardware de rede", "Software que gerencia os recursos de hardware e software", "Uma linguagem de programação", "Um editor de código fonte", "Um banco de dados virtual", "B"));

        lista.add(new Questao("Qual protocolo é usado para navegar na web de forma criptografada e segura?",
                "HTTP", "FTP", "SSH", "HTTPS", "SMTP", "D"));

        lista.add(new Questao("Em programação, qual a estrutura mais adequada para quando já sabemos a quantidade exata de repetições?",
                "Laço For", "Laço While", "Estrutura Switch", "Do-While", "Try-Catch", "A"));

        lista.add(new Questao("Em Java, qual palavra-chave é utilizada para indicar herança (inheritance) entre classes?",
                "implement", "inherit", "super", "this", "extends", "E"));

        lista.add(new Questao("O que significa a sigla SQL no contexto de banco de dados?",
                "System Query Language", "Sequential Query Language", "Structured Query Language", "Server Query Logic", "Standard Query Line", "C"));

        lista.add(new Questao("Qual comando no Git é utilizado para salvar as alterações realizadas no repositório local?",
                "git push", "git commit", "git pull", "git merge", "git clone", "B"));

        lista.add(new Questao("A memória RAM do computador é considerada:",
                "Memória volátil", "Memória não-volátil", "Armazenamento secundário", "Memória de longo prazo", "Processador principal", "A"));

        lista.add(new Questao("O que é HTML?",
                "Uma linguagem de programação back-end", "Um banco de dados NoSQL", "Um protocolo de transferência de arquivos", "Um sistema operacional web", "Uma linguagem de marcação de hipertexto", "E"));

        lista.add(new Questao("Na Orientação a Objetos, o que significa 'Encapsulamento'?",
                "Criar múltiplos objetos iguais", "Conectar o código a uma API externa", "Permitir que classes não tenham métodos", "Ocultar detalhes internos e proteger os atributos", "Fazer com que uma classe herde de múltiplas classes", "D"));

        lista.add(new Questao("O que faz a estrutura condicional 'switch' em Java?",
                "Repete um bloco de código infinitamente", "Compila o código-fonte em bytecode", "Seleciona entre vários blocos de código aquele que corresponde ao valor avaliado", "Força o encerramento do programa", "Cria um objeto na memória", "C"));

        lista.add(new Questao("Qual tipo primitivo em Java é usado exclusivamente para representar valores Verdadeiro ou Falso?",
                "int", "boolean", "String", "char", "float", "B"));

        lista.add(new Questao("O que significa a sigla API no mercado de tecnologia?",
                "Application Programming Interface", "Automated Program Integration", "Advanced Processing Instructions", "Application Process Internal", "Applied Programming Internet", "A"));

        lista.add(new Questao("Qual Collection (Coleção) do Java é baseada em arrays que podem crescer dinamicamente?",
                "HashMap", "HashSet", "LinkedList", "ArrayList", "TreeMap", "D"));
    }
}

    }
}
