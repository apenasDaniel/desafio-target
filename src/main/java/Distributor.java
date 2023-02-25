public class Distributor {
    public static void main(String[] args) {
        double saoPaulo = 67836.43;
        double rioDeJaneiro = 36678.66;
        double minasGerais = 29229.88;
        double espiritoSanto = 27165.48;
        double others = 19849.53;

        double total = saoPaulo + rioDeJaneiro + minasGerais + espiritoSanto + others;

        double saoPauloPercentage = saoPaulo / total * 100;
        double rioDeJaneiroPercentage = rioDeJaneiro / total * 100;
        double minasGeraisPercentage = minasGerais / total * 100;
        double espiritoSantoPercentage = espiritoSanto / total * 100;
        double othersPercentage = others / total * 100;

        System.out.printf("Percentage of representation of each state:\n");
        System.out.printf("Sao Paulo: %.2f%%\n", saoPauloPercentage);
        System.out.printf("Rio de Janeiro: %.2f%%\n", rioDeJaneiroPercentage);
        System.out.printf("Minas Gerais: %.2f%%\n", minasGeraisPercentage);
        System.out.printf("Espirito Santo: %.2f%%\n", espiritoSantoPercentage);
        System.out.printf("Others: %.2f%%\n", othersPercentage);
    }
}
