public class DnaStrand {
    public static void main(String[] args) {
        System.out.println(makeComplement("ATTGC"));
        System.out.println(makeComplement("GTAT"));
    }

    public static String makeComplement(String dna) {
        dna = dna.replaceAll("A", "t");
        dna = dna.replaceAll("T", "a");
        dna = dna.replaceAll("G", "c");
        dna = dna.replaceAll("C", "g");
        return dna.toUpperCase();
    }
}
