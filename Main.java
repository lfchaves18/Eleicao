public class Main {

    public static void main(String [] args){
        //Instanciando a classe calcular que possui os metódos
        Calcular calcular = new Calcular(1000);

        //Fazendo as chamadas das funções e mostrando na tela os resultados
        System.out.println("O percentual de votos válidos é: " + calcular.calculaPercentualVotosValidos(800) +"%");
        System.out.println("O percentual de votos brancos é: " + calcular.calculaPercentualVotosBrancos(150) +"%");
        System.out.println("O percentual de votos nulos é: " + calcular.calculaPercentualVotosNulos(50) +"%");
    }
}
