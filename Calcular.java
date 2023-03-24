public class Calcular {

    int totalVotos;
    public Calcular(int totalVotos) {
        this.totalVotos = totalVotos;
    }

    //Metódo que calcula os votos válidos
    public double calculaPercentualVotosValidos(int votosValidos){
        return ((double)votosValidos / totalVotos) * 100.0;
    }

    //Metódo que calcula os votos brancos
    public double calculaPercentualVotosBrancos(int votosBrancos){
        return ((double)votosBrancos / totalVotos) * 100.0;
    }

    //Metódo que calcula os votos nulos
    public double calculaPercentualVotosNulos(int votosNulos){
        return ((double)votosNulos / totalVotos) * 100.0;
    }
}
