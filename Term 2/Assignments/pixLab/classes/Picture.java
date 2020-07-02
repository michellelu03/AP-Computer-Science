import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
  //ACTIVITY 5: EXERCISE 3
  public void keepOnlyBlue(){
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] row : pixels){
      for (Pixel pixelObj : row){
         pixelObj.setRed(0);
         pixelObj.setGreen(0);
      }
    }
  }
//ACTIVITY 5: EXERCISE 4
  public void negate(){
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] row : pixels){
      for (Pixel pixelObj : row){
        pixelObj.setRed(pixelObj.getRed() - 255);
        pixelObj.setGreen(pixelObj.getGreen() - 255);
        pixelObj.setBlue(pixelObj.getBlue() - 255);
      }
    }
  }
  //ACTIVITY 5: EXERCISE 5
  public void grayscale(){
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] row : pixels){
      for (Pixel pixelObj : row){   
        int a = (int)((pixelObj.getRed() + pixelObj.getGreen() + pixelObj.getBlue()) / 3); 
        pixelObj.setBlue(a);
        pixelObj.setGreen(a);
        pixelObj.setRed(a);
      }
    }
  }
  //ACTIVITY 5: EXERCISE 6
  public void fixUnderwater(){
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] row : pixels){
      for (Pixel pixelObj : row){ 
        pixelObj.setBlue(pixelObj.getBlue() + 50);
        pixelObj.setRed(pixelObj.getRed());
        pixelObj.setGreen(pixelObj.getGreen());
      }
    }
  }
  
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical(){
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++){
      for (int col = 0; col < width / 2; col++){
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  //ACTIVITY 6: EXERCISE 1
  public void mirrorVerticalRightToLeft(){
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++){
      for (int col = 0; col < width / 2; col++){
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        leftPixel.setColor(rightPixel.getColor());
      }
    }
  }
  //ACTIVITY 6: EXERCISE 2
  public void mirrorHorizontal(){
      Pixel[][] pixels = this.getPixels2D();
      Pixel topPixel = null;
      Pixel bottomPixel = null;
      int height = pixels.length;
      for (int row = 0; row < height; row++){
          for (int col = 0; col < pixels[0].length; col++){
              topPixel = pixels[row][col];
              bottomPixel = pixels[height - 1 - row][col];
              bottomPixel.setColor(topPixel.getColor());
          }
      }
  }
  
  //ACTIVITY 6: EXERCISE 3
  public void mirrorHorizontalBottomToTop()
  {
      Pixel[][] pixels = this.getPixels2D();
      Pixel topPixel = null;
      Pixel bottomPixel = null;
      int height = pixels.length;
      for (int row = 0; row < height; row++)
      {
          for (int col = 0; col < pixels[0].length; col++)
          {
              topPixel = pixels[row][col];
              bottomPixel = pixels[height - 1 - row][col];
              topPixel.setColor(bottomPixel.getColor());
          }
      }
}
  //ACTIVITY 6: EXERCISE 4
   public void mirrorDiagonal(){
      Pixel[][] pixels = this.getPixels2D();
      Pixel topRightPixel = null;
      Pixel bottomLeftPixel = null;
      int maxLength;
      if (pixels.length < pixels[0].length){ 
        maxLength = pixels.length; 
      }else{
        maxLength = pixels[0].length; 
      }
      
      for (int r = 0; r < maxLength; r++){
          for (int c = r; c < maxLength; c++){
              topRightPixel = pixels[r][c];
              bottomLeftPixel = pixels[c][r];
              bottomLeftPixel.setColor(topRightPixel.getColor());
          }
      }
}
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
        
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
        count++;
      }
    }
    System.out.println(count); //ACTVITY 7: EXERCISE 1
  }
  
  //ACTIVITY 7: EXERCISE 2
    public void mirrorArms(){
    Pixel topPix = null;
    Pixel bottomPix = null;
    Pixel[][] pixels = this.getPixels2D();
    int mp = 194;
    
    for (int r = 158; r < mp; r++){
      for (int c = 103; c < 170; c++){
        topPix = pixels[r][c];      
        bottomPix = pixels[mp - r + mp][c];
        bottomPix.setColor(topPix.getColor());
      }
    }
    
    int mp2 = 196;
    Pixel topPix2 = null;
    Pixel bottomPix2 = null;
    
    for (int r= 170; r < mp2; r++){
      for (int c = 240; c < 294; c++){
        topPix2 = pixels[r][c];      
        bottomPix2 = pixels[mp2 - r + mp2][c];
        bottomPix2.setColor(topPix2.getColor());
      }
    }
}
    //ACTIVITY 7: EXERCISE 3 
    public void mirrorGull(){
    int mp = 345;
    Pixel rightPix = null;
    Pixel leftPix = null;
    Pixel[][] pixels = this.getPixels2D();   
    
    for (int r = 235; r < 323; r++){
      for (int c = 238; c < mp; c++){     
        leftPix = pixels[r][mp - c + (mp/3)];
        rightPix = pixels[r][c]; 
        leftPix.setColor(rightPix.getColor());
      }
    }
}
  
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, 
                 int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }
  
  //ACTIVITY 8: EXERCISE 1
  public void copy(Picture p, int startR, int endR, int startC, int endC){
    Pixel fromPix = null;
    Pixel toPix = null;
    Pixel[][] toPixel = this.getPixels2D();
    Pixel[][] fromPixel = p.getPixels2D();
    for (int fromR = 0, toR = startR; fromR < fromPixel.length && toR < endR; fromR++, toR++){
      for (int fromC = 0, toC = startC; fromC < fromPixel[0].length && toC < endC; fromC++, toC++){
        toPix = toPixel[toR][toC];
        fromPix = fromPixel[fromR][fromC];
        toPix.setColor(fromPix.getColor());
      }
    } 
  }
  //ACTIVITY 8: EXERCISE 2
  public void myCollage(){
    Picture flower1 = new Picture("flower2.jpg"); 
    Picture flower2 = new Picture("flower1.jpg"); 
    Picture caterpiller = new Picture("caterpiller.jpg");
    this.copy(flower1,0,0); 
    this.copy(flower2,100,0); 
    this.copy(caterpiller,200,0); 
    Picture flowerNoBlue = new Picture(flower2); 
    flowerNoBlue.zeroBlue(); 
    this.copy(flowerNoBlue,300,0); 
    this.copy(flower1,400,0); 
    this.copy(flower2,500,0); 
    this.mirrorVertical(); 
    this.write("collage.jpg"); 
  }

  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("flower1.jpg");
    Picture flower2 = new Picture("flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower1);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("collage.jpg");
  }
  
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  
  //ACTIVTY 9: EXERCISE 1
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    
    Pixel[][] pixels = this.getPixels2D();
    for (int row = 0; row < pixels.length - 1; row++){
      for (int col = 0; col < pixels[0].length-1; col++){
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        topPixel = pixels[row][col];
        bottomPixel = pixels[row + 1][col];
        if (leftPixel.colorDistance(rightPixel.getColor()) > edgeDist ||
            topPixel.colorDistance(bottomPixel.getColor()) > edgeDist){
          leftPixel.setColor(Color.BLACK);
        }else
          leftPixel.setColor(Color.WHITE);
      }
}
  }
  
//ACTIVITY 9: EXERCISE 2
public void edgeDetection2(int edgeDist){
  Pixel leftPixel = null;
  Pixel rightPixel = null;
  Pixel bottomPixel=null;
  Pixel[][] pixels = this.getPixels2D();
  Color rightColor = null;
  boolean black;
  for (int row = 0; row < pixels.length; row++){
  for (int col = 0; col < pixels[0].length; col++){
    black=false;
    leftPixel = pixels[row][col];
    if (col<pixels[0].length-1){
      rightPixel = pixels[row][col+1];
      rightColor = rightPixel.getColor();
      if (leftPixel.colorDistance(rightColor) > edgeDist)
        black=true;
      }
    if (row<pixels.length-1){
      bottomPixel =pixels[row+1][col];
      if (leftPixel.colorDistance(bottomPixel.getColor())>edgeDist)
        black=true;
    }
    if (black)
      leftPixel.setColor(Color.BLACK);
    else
      leftPixel.setColor(Color.WHITE);
  }
}

}

  
  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
} // this } is the end of class Picture, put all new methods before this
