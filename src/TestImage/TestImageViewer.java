package TestImage;
import java.util.ArrayList;

interface ImageViewerInterface{

    String getName(); //클래스 모듈의 이름을 반환
    void show(String filename); //로딩한다는 표시를 화면에 출력
    String getExtension(); // 이미지의 확장자를 문자열 형태로 반환
}

class PNGModule implements ImageViewerInterface{    //PNG형 이미지뷰어 인터페이스 구형모델

    public String getName(){
        return "PNG Module";
    }

    public void show(String fileName){
        System.out.println("PNG image loading : " + fileName);
    }

    public String getExtension(){
        return "PNG";
    }
}

class JPGModule implements ImageViewerInterface{    //JPG형 이미지뷰어 인터페이스 구형모델
    public String getName(){
        return "JPG Module";
    }

    public void show(String fileName){
        System.out.println("JPG image loading : " +fileName);
    }

    public String getExtension(){
        return "JPG";
    }
}

class ImageViewer <T> {
    ArrayList<ImageViewerInterface> list = new ArrayList<ImageViewerInterface>();

    void addPlugIn(ImageViewerInterface ivi){
        list.add(ivi);
    }

    public void show(String fileName,String ext){
        {
            for(int i=0;i< list.size();i++){
                if(list.get(i).getExtension().equals(ext)){
                    System.out.println("Using "+ list.get(i).getName());
                    list.get(i).show(fileName);
                    System.out.println("");
                    return;
                }
            }
            System.out.println("Image viewer plugin for the extension," + ext + ", is not registered");
        }

    }
}


public class TestImageViewer{
    public static void main(String[] args){
        ImageViewer v = new ImageViewer();
        v.addPlugIn(new PNGModule());
        v.addPlugIn(new JPGModule());
        v.show("a.jpg","JPG");
        v.show("b.png","PNG");
        v.show("c.tif","TIF");

    }
    /*
    Using JPG Module
    JPG image loading : a.jpg

    Using PNG Module
    PNG image loading : b.png

    Image viewer plugin for the extension,TIF, is not registered

    */

}
