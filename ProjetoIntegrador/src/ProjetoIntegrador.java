import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Collections;

public class ProjetoIntegrador {
    public static void main(String[] args) {
        ArrayList<Pergunta> perguntas = new ArrayList<>();
        int pontuacao = 0;
        int dicasUsadas = 0;
        
        // Adicione suas perguntas aqui
 perguntas.add(new Pergunta("Normalmente, quantos litros de sangue uma pessoa tem?", new String[]{"1) Tem entre 2 a 4 litros.", "2) Tem entre 4 a 6 litros.", "3) Tem 10 litros.", "4) Tem 7 litros.", "Pedir dica"}, 1, "Dica: É impossível ter de 7 a 10 litros de sangue no corpo."));
        perguntas.add(new Pergunta("Qual é o planeta mais próximo do Sol?", new String[]{"A) Vênus", "B) Terra", "C) Júpiter", "D) Mercúrio", "Pedir dica"}, 3, "Dica: Este planeta é conhecido por ser o menor do nosso sistema solar e tem uma órbita muito próxima ao Sol."));
        perguntas.add(new Pergunta("Quem foi o primeiro presidente dos Estados Unidos?", new String[]{"A) Benjamin Franklin", "B) Thomas Jefferson", "C) George Washington", "D) Abraham Lincoln", "Pedir dica"}, 2, "Dica: Este líder histórico é amplamente conhecido por sua contribuição na luta pela independência dos Estados Unidos e é frequentemente chamado de 'Pai da Nação'."));
        perguntas.add(new Pergunta("Qual é o elemento químico mais abundante na crosta terrestre?", new String[]{"A) Oxigênio", "B) Ferro", "C) Silício", "D) Carbono", "Pedir dica"}, 2, "Dica: Este elemento é essencial na formação de minerais e rochas, e é encontrado em grande quantidade na camada mais externa da Terra."));
        perguntas.add(new Pergunta("Qual é o maior oceano do mundo?", new String[]{"A) Oceano Índico", "B) Oceano Atlântico", "C) Oceano Ártico", "D) Oceano Pacífico", "Pedir dica"}, 3, "Dica: Este oceano cobre a maior área e é conhecido por ser o mais profundo dos oceanos na Terra."));
        perguntas.add(new Pergunta("Quem escreveu a famosa peça de teatro 'Romeu e Julieta'?", new String[]{"A) William Shakespeare", "B) Charles Dickens", "C) Jane Austen", "D) Fyodor Dostoevsky", "Pedir dica"}, 0, "Dica: Este autor é conhecido por suas contribuições significativas para a literatura e é uma das figuras mais renomadas da literatura inglesa."));
        perguntas.add(new Pergunta("Qual é o maior planeta do sistema solar?", new String[]{"A) Marte", "B) Terra", "C) Júpiter", "D) Saturno", "Pedir dica"}, 2, "Dica: Este planeta é conhecido por sua grande massa e é o gigante gasoso mais proeminente em nosso sistema solar."));
        perguntas.add(new Pergunta("Qual é o rio mais longo do mundo?", new String[]{"A) Rio Nilo", "B) Rio Amazonas", "C) Rio Mississipi", "D) Rio Yangtzé", "Pedir dica"}, 0, "Dica: Este rio é conhecido por sua importância histórica e cultural, e é muitas vezes associado ao Egito."));
        perguntas.add(new Pergunta("Qual é o ponto mais alto da Terra?", new String[]{"A) Monte Kilimanjaro", "B) Monte Everest", "C) Monte McKinley (Denali)", "D) Monte Vinson", "Pedir dica"}, 1, "Dica: Este é o ponto mais alto da Terra, medido a partir do nível do mar, e é parte da cordilheira do Himalaia."));
        perguntas.add(new Pergunta("Qual é o maior órgão do corpo humano?", new String[]{"A) Coração", "B) Cérebro", "C) Pulmões", "D) Pele", "Pedir dica"}, 3, "Dica: Este órgão desempenha um papel vital na proteção e regulação da temperatura."));
        perguntas.add(new Pergunta("Qual é o gás mais abundante na atmosfera da Terra?", new String[]{"A) Oxigênio", "B) Hidrogênio", "C) Nitrogênio", "D) Dióxido de carbono", "Pedir dica"}, 2, "Dica: Este gás compõe a maior parte da atmosfera terrestre e é essencial para a vida como a conhecemos."));
        perguntas.add(new Pergunta("Qual é o metal mais abundante na crosta terrestre?", new String[]{"A) Ouro", "B) Prata", "C) Ferro", "D) Alumínio", "Pedir dica"}, 3, "Dica: Este metal é amplamente utilizado na indústria devido à sua disponibilidade e versatilidade."));
        perguntas.add(new Pergunta("De quem é a famosa frase “Penso, logo existo”?", new String[]{"A) Platão", "B) Galileu Galilei", "C) Descartes", "D) Sócrates", "Pedir dica"}, 2, "Dica: A frase é escrita originalmente em francês, logo o autor também é."));
        perguntas.add(new Pergunta("Qual é o país mais populoso do mundo?", new String[]{"A) Índia", "B) Estados Unidos", "C) China", "D) Brasil", "Pedir dica"}, 2, "Dica: Este país é conhecido por sua grande população e rica história."));
        perguntas.add(new Pergunta("Qual é a capital do Canadá?", new String[]{"A) Toronto", "B) Vancouver", "C) Ottawa", "D) Montreal", "Pedir dica"}, 2, "Dica: Esta cidade é onde o governo federal do Canadá está localizado."));
        perguntas.add(new Pergunta("Qual é o elemento químico mais abundante no universo?", new String[]{"A) Hélio", "B) Oxigênio", "C) Hidrogênio", "D) Carbono", "Pedir dica"}, 2, "Dica: Este elemento é o mais comum no universo e é fundamental para o funcionamento das estrelas."));
        perguntas.add(new Pergunta("Qual é o fenômeno natural que ocorre quando partículas carregadas do Sol interagem com a atmosfera da Terra, criando belas luzes coloridas no céu noturno?", new String[]{"A) Aurora Boreal", "B) Arco-íris", "C) Fogo de Santelmo", "D) Eclipse Solar", "Pedir dica"}, 0, "Dica: Este fenômeno é mais comumente visto nas regiões próximas aos polos da Terra e é conhecido por seu espetáculo de luzes dançantes no céu noturno."));
        perguntas.add(new Pergunta("Qual é o nome do primeiro satélite artificial lançado no espaço, em 1957, pela União Soviética?", new String[]{"A) Voyager 1", "B) Hubble", "C) Sputnik 1", "D) Apolo 11", "Pedir dica"}, 2, "Dica: Este pequeno satélite marcou o início da era espacial e foi um marco importante na história da exploração espacial."));
        perguntas.add(new Pergunta("Qual é a constelação que é conhecida como 'Os Três Reis' e que é uma das mais reconhecíveis no céu noturno?", new String[]{"A) Órion", "B) Ursa Maior", "C) Cassiopeia", "D) Escorpião", "Pedir dica"}, 0, "Dica: Esta constelação contém as três estrelas que formam o 'Cinturão de Órion' e é frequentemente visível durante o inverno no hemisfério norte."));
        perguntas.add(new Pergunta("Qual é o nome da famosa pintura que retrata um homem barbado sorridente com uma misteriosa expressão, pintada por Leonardo da Vinci?", new String[]{"A) A Última Ceia", "B) Mona Lisa", "C) A Criação de Adão", "D) O Grito", "Pedir dica"}, 1, "Dica: Esta pintura é uma das obras de arte mais reconhecidas e icônicas do mundo."));
        perguntas.add(new Pergunta("Qual é o nome do famoso grupo musical britânico que era conhecido por suas roupas extravagantes e performances teatrais, liderado pelo vocalista Freddie Mercury?", new String[]{"A) The Rolling Stones", "B) The Who", "C) Queen", "D) The Beatles", "Pedir dica"}, 2, "Dica: Esta banda é responsável por sucessos como 'Bohemian Rhapsody' e 'We Will Rock You.'"));
        perguntas.add(new Pergunta("Qual é o nome do estúdio de animação japonês famoso por produzir filmes de animação de grande sucesso, incluindo 'A Viagem de Chihiro' e 'Meu Amigo Totoro'?", new String[]{"A) Studio Pierrot", "B) Toei Animation", "C) Studio Ghibli", "D) Madhouse", "Pedir dica"}, 2, "Dica: Este estúdio é conhecido por suas animações emocionais e imaginativas que cativam públicos de todas as idades."));
        perguntas.add(new Pergunta("Qual é o país mais populoso da África?", new String[]{"A) Egito", "B) Nigéria", "C) Etiópia", "D) África do Sul", "Pedir dica"}, 1, "Dica: Este país africano possui uma população muito grande e é conhecido por sua diversidade étnica e cultural."));
        perguntas.add(new Pergunta("Qual é o desenho animado criado por Matt Groening que se passa na cidade fictícia de Springfield?", new String[]{"A) Family Guy", "B) Futurama", "C) The Simpsons", "D) American Dad!", "Pedir dica"}, 2, "Dica: A família protagonista do desenho são todos amarelos."));
        
        // Embaralhe as perguntas
        Collections.shuffle(perguntas);
        
        JOptionPane.showMessageDialog(null, "São 10 perguntas, e cada acerto conta um ponto e irá somando, e você poderá pedir dicas apenas 5 vezes. Quem tiver mais acertos ganha!");
        
        for (int i = 0; i < 10; i++) {
            Pergunta pergunta = perguntas.get(i);
            int resposta = JOptionPane.showOptionDialog(null, pergunta.getPergunta(), "Questionário", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, pergunta.getOpcoes(), pergunta.getOpcoes()[0]);
            
            if (resposta == 4) {
                if (dicasUsadas < 5) {
                    JOptionPane.showMessageDialog(null, pergunta.getDica());
                    dicasUsadas++;
                    resposta = JOptionPane.showOptionDialog(null, pergunta.getPergunta(), "Questionário", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, pergunta.getOpcoes(), pergunta.getOpcoes()[0]);
                } else {
                    JOptionPane.showMessageDialog(null, "Você já usou todas as suas dicas!");
                }
            }
            
            if (resposta == pergunta.getRespostaCorreta()) {
                JOptionPane.showMessageDialog(null, "Resposta correta!");
                pontuacao++;
            } else {
                JOptionPane.showMessageDialog(null, "Resposta incorreta. A resposta correta é: " + pergunta.getOpcoes()[pergunta.getRespostaCorreta()]);
            }
        }
        
        JOptionPane.showMessageDialog(null, "Você acertou " + pontuacao + " de 10 perguntas!");
    }
}

class Pergunta {
    private String pergunta;
    private String[] opcoes;
    private int respostaCorreta;
    private String dica;

    public Pergunta(String pergunta, String[] opcoes, int respostaCorreta, String dica) {
        this.pergunta = pergunta;
        this.opcoes = opcoes;
        this.respostaCorreta = respostaCorreta;
        this.dica = dica;
    }

    public String getPergunta() {
        return pergunta;
    }

    public String[] getOpcoes() {
        return opcoes;
    }

    public int getRespostaCorreta() {
        return respostaCorreta;
    }

    public String getDica() {
        return dica;
    }
}
