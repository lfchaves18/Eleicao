public class Calcular {

    //Metódo que calcula os votos válidos
    public double calculaPercentualVotosValidos(int totalVotos, int votosValidos){
        return ((double)votosValidos / totalVotos) * 100.0;
    }

    //Metódo que calcula os votos brancos
    public double calculaPercentualVotosBrancos(int totalVotos,  int votosBrancos){
        return ((double)votosBrancos / totalVotos) * 100.0;
    }

    //Metódo que calcula os votos nulos
    public double calculaPercentualVotosNulos(int totalVotos, int votosNulos){
        return ((double)votosNulos / totalVotos) * 100.0;
    }
}
