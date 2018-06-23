package kaka.hang.com.leanningenglish.model;

/**
 * Created by Admins on 6/24/2018.
 */

public class ItemMain {
    private int imageResouce;
    private String title;

    public ItemMain(int imageResouce, String title) {
        this.imageResouce = imageResouce;
        this.title = title;
    }

    public int getImageResouce() {
        return imageResouce;
    }

    public String getTitle() {
        return title;
    }

    public void setImageResouce(int imageResouce) {
        this.imageResouce = imageResouce;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}
