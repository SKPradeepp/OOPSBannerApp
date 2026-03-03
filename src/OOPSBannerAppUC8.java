import java.util.HashMap;
import java.util.Map;

public class OOPSBannerAppUC8 {

    // ---------- Utility Method : Create Character Map ----------
    public static Map<Character, String[]> buildCharacterMap() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        map.put('P', new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        });

        map.put('S', new String[]{
                " ******",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        });

        return map;
    }

    // ---------- Utility Method : Render Banner ----------
    public static void renderBanner(String message,
                                    Map<Character, String[]> map) {

        int height = 7;

        for (int i = 0; i < height; i++) {

            StringBuilder line = new StringBuilder();

            for (char ch : message.toCharArray()) {
                String[] pattern = map.get(ch);
                line.append(pattern[i]).append(" ");
            }

            System.out.println(line);
        }
    }

    // ---------- Main Method ----------
    public static void main(String[] args) {

        Map<Character, String[]> characterMap = buildCharacterMap();

        String message = "OOPS";

        renderBanner(message, characterMap);
    }
}