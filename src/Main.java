import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Questao[] questao = new Questao[15];

        int acertos = 0;
        float porcentagem = 0;

        questao[0] = new Questao(
                "1. O que é hardware?",
                "A) Programas de computador",
                "B) Parte física do computador",
                "C) Aplicativos móveis",
                "D) Sistema operacional",
                "E) Internet",
                "B"
        );

        questao[1] = new Questao(
                "2. Qual é a função principal do sistema operacional?",
                "A) Criar documentos",
                "B) Proteger contra vírus",
                "C) Gerenciar recursos do computador",
                "D) Aumentar a velocidade da internet",
                "E) Reproduzir vídeos",
                "C"
        );

        questao[2] = new Questao(
                "3. O que significa a sigla CPU?",
                "A) Central de Programas Úteis",
                "B) Computador Pessoal Único",
                "C) Processador de Dados",
                "D) Unidade de Controle de Programas",
                "E) Unidade Central de Processamento",
                "E"
        );

        questao[3] = new Questao(
                "4. Qual dispositivo é usado para entrada de dados?",
                "A) Monitor",
                "B) Impressora",
                "C) Teclado",
                "D) Caixa de som",
                "E) Pen drive",
                "C"
        );

        questao[4] = new Questao(
                "5. Qual é a função de um antivírus?",
                "A) Proteger contra softwares maliciosos",
                "B) Criar senhas seguras",
                "C) Aumentar o desempenho do computador",
                "D) Atualizar o sistema operacional",
                "E) Melhorar a qualidade da imagem",
                "A"
        );

        questao[5] = new Questao(
                "6. O que é software?",
                "A) Parte física do computador",
                "B) Conjunto de cabos e conexões",
                "C) Programas e aplicativos",
                "D) Equipamentos de rede",
                "E) Componentes eletrônicos",
                "C"
        );

        questao[6] = new Questao(
                "7. Qual é a unidade de medida de armazenamento?",
                "A) Hertz",
                "B) Pixel",
                "C) Volt",
                "D) Byte",
                "E) Ampere",
                "D"
        );

        questao[7] = new Questao(
                "8. O que é a nuvem (cloud computing)?",
                "A) Um tipo de vírus",
                "B) Um sistema de refrigeração",
                "C) Armazenamento remoto de dados",
                "D) Um navegador de internet",
                "E) Um tipo de cabo de rede",
                "C"
        );

        questao[8] = new Questao(
                "9. Qual é a função do navegador de internet?",
                "A) Acessar sites e conteúdos online",
                "B) Proteger contra hackers",
                "C) Criar páginas web",
                "D) Editar imagens",
                "E) Gerenciar arquivos locais",
                "A"
        );

        questao[9] = new Questao(
                "10. O que é Wi-Fi?",
                "A) Um tipo de cabo de rede",
                "B) Um programa de edição",
                "C) Conexão sem fio à internet",
                "D) Um antivírus",
                "E) Um sistema operacional",
                "C"
        );

        questao[10] = new Questao(
                "11. Qual é a função de uma impressora?",
                "A) Digitalizar documentos",
                "B) Exibir imagens",
                "C) Reproduzir áudio",
                "D) Imprimir documentos",
                "E) Armazenar arquivos",
                "D"
        );

        questao[11] = new Questao(
                "12. Qual dos itens abaixo é um exemplo de software?",
                "A) Mouse",
                "B) Windows",
                "C) Monitor",
                "D) Teclado",
                "E) Placa-mãe",
                "B"
        );

        questao[12] = new Questao(
                "13. O que é um arquivo PDF?",
                "A) Um tipo de imagem",
                "B) Um vídeo compactado",
                "C) Um formato de documento portátil",
                "D) Um programa de edição",
                "E) Um sistema de segurança",
                "C"
        );

        questao[13] = new Questao(
                "14. Qual é a função do Excel?",
                "A) Criar apresentações",
                "B) Editar vídeos",
                "C) Navegar na internet",
                "D) Criar planilhas e cálculos",
                "E) Reproduzir músicas",
                "D"
        );

        questao[14] = new Questao(
                "15. O que é um pendrive?",
                "A) Um tipo de software",
                "B) Um antivírus portátil",
                "C) Um dispositivo de armazenamento",
                "D) Um programa de backup",
                "E) Um cabo de rede",
                "C"
        );


        for ( int i = 0; i < questao.length; i++){
           questao[i].escrevaQuestao();
           String resposta = questao[i].leiaResposta();
            if (questao[i].isCorreta(resposta)){
                acertos ++;
            }
        }

        porcentagem = (float) (acertos * 100) / 15;

        System.out.println("Acertos: "+ acertos + " de 15");
        System.out.printf("Porcentagem de acertos :  %.2f%%%n",porcentagem);





    }
}

