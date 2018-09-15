package proxy.examples.images;


public class ClientImage  {

    public static void main(String[] args) {

        Image image = new ProxyImage("img_10.jpg");

        //image will be loaded from disk
        image.display();
        System.out.println("");

        //image will NOT be loaded from disk
        image.display();
    }

}