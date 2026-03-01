public class OOPSBannerAPPUC6 {

    public static void main(String[] args) {

        // Build banner using helper methods
        String[] banner = new String[]{
            getOPattern()[0] + getOPattern()[0] + getPPattern()[0] + getSPattern()[0],
            getOPattern()[1] + getOPattern()[1] + getPPattern()[1] + getSPattern()[1],
            getOPattern()[2] + getOPattern()[2] + getPPattern()[2] + getSPattern()[2],
            getOPattern()[3] + getOPattern()[3] + getPPattern()[3] + getSPattern()[3],
            getOPattern()[4] + getOPattern()[4] + getPPattern()[4] + getSPattern()[4],
            getOPattern()[5] + getOPattern()[5] + getPPattern()[5] + getSPattern()[5],
            getOPattern()[6] + getOPattern()[6] + getPPattern()[6] + getSPattern()[6]
        };

        // Print banner using enhanced for loop
        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Helper method: O pattern
    static String[] getOPattern() {
        return new String[]{
                " *****  ",
                "*     * ",
                "*     * ",
                "*     * ",
                "*     * ",
                "*     * ",
                " *****  "
        };
    }

    // Helper method: P pattern
    static String[] getPPattern() {
        return new String[]{
                " ****** ",
                "*     * ",
                "*     * ",
                " ****** ",
                "*       ",
                "*       ",
                "*       "
        };
    }

    // Helper method: S pattern
    static String[] getSPattern() {
        return new String[]{
                " ****** ",
                "*       ",
                "*       ",
                " *****  ",
                "      * ",
                "      * ",
                " *****  "
        };
    }
}