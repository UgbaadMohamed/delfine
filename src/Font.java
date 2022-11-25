
public class Font {

    private String fonts;

    private String name;
    private int style;
    private int size;
    

    public static int BOLD;
    
    public static int ITALIC;
    public Font (String name, int style, int size) {
        this.name = name;
        this.style=style;
        this.size = size;

    }

    public void setFonts () {
        this.fonts = fonts;
    }


    public void graohic () {
        Font font = new Font("Courier", Font.BOLD, 20);

    }





}
