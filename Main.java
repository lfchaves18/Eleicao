public class Main {

    public static void main(String [] args){
        //Instanciando a classe calcular que possui os metódos
        Calcular calcular = new Calcular();

        //Fazendo as chamadas das funções e mostrando na tela os resultados
        System.out.println("O percentual de votos válidos é: " + calcular.calculaPercentualVotosValidos(1000,800) +"%");
        System.out.println("O percentual de votos brancos é: " + calcular.calculaPercentualVotosBrancos(1000,150) +"%");
        System.out.println("O percentual de votos nulos é: " + calcular.calculaPercentualVotosNulos(1000,50) +"%");
    }
}
