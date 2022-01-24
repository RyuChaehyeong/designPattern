package builder;

public class TextBuilder {

    private StringBuffer buffer = new StringBuffer();
    public void makeTitle(String title) {
        buffer.append("--------------------\n");
        buffer.append("{{" + title + "}}\n");
        buffer.append("\n");
    }


}
