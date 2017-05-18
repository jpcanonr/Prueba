package box;

import java.io.*;

public class Box implements Serializable {

    private int width;
    private int height;

    //SETTERS and GETTERS
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    //MAIN
    public static void main(String[] args) {
        Box myBox = new Box();
        myBox.setWidth(50);
        myBox.setHeight(20);

        try {
            FileOutputStream fs = new FileOutputStream("foo.ser"); //Crea el archivo si no existe
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(myBox);
            os.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}
