public class Inversor {
    public String inverterString(String original) {
        String invertida = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            invertida += original.charAt(i);
        }

        return invertida;
    }
}