package apps.myapp.eze.ezenglish2.vocabulary.common_words;

public class ImageVO {
    private String name;
    private String info;
    private int image;
    private int image2;

    public ImageVO(){

    }

    public ImageVO(String name, String info, int image, int image2) {
        this.name = name;
        this.info = info;
        this.image = image;
        this.image2 = image2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getImage2() {
        return image2;
    }

    public void setImage2(int image2) {
        this.image2 = image2;
    }
}
