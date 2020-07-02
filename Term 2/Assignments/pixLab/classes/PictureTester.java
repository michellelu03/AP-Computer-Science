/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  //ACTIVITY 5: EXERCISE 3
  public static void testKeepOnlyBlue(){
    Picture water = new Picture("water.jpg");
    water.explore();
    water.keepOnlyBlue();
    water.explore();
  }
  //ACTIVITY 5: EXERCISE 4
  public static void testNegate(){
   Picture water = new Picture("water.jpg");
   water.explore();
   water.negate();
   water.explore();
  }
  
  //ACTIVITY 5: EXERCISE 5
  public static void testGrayscale(){
   Picture water = new Picture("water.jpg");
   water.explore();
   water.grayscale();
   water.explore();
  }
  //ACTIVITY 6: EXERCISE 6
  public static void testFixUnderwater(){
   Picture water = new Picture("water.jpg");
   water.explore();
   water.fixUnderwater();
   water.explore();
  }
  
  //ACTVITY 6: EXERCISE 1
  public static void testMirrorVerticalRightToLeft(){
    Picture water = new Picture("water.jpg");
    water.explore();
    water.mirrorVerticalRightToLeft();
    water.explore();
  }
  //ACTIVITY 6: EXERCISE 2
  public static void testMirrorHorizontal(){
    Picture water1 = new Picture("water.jpg");
    water1.explore();
    water1.mirrorHorizontal();
    water1.explore();
  }
  //ACTIVITY 6: EXERCISE 3
  public static void testMirrorHorizontalBottomToTop(){
    Picture water2 = new Picture("water.jpg");
    water2.explore();
    water2.mirrorHorizontalBottomToTop();
    water2.explore();
  }
  //ACTIVITY 6: EXRECISE 4
  public static void testMirrorDiagonal(){
    Picture water3 = new Picture("water.jpg");
    water3.explore();
    water3.mirrorDiagonal();
    water3.explore();
}
  
  //ACTIVITY 7: EXERCISE 2
  public static void testMirrorArms(){
    Picture snowman = new Picture("snowman.jpg");
    snowman.explore();
    snowman.mirrorArms();
    snowman.explore();
  }
  
  //ACTIVITY 7: EXERCISE 3
  public static void testMirrorGull(){
   Picture gull = new Picture("seagull.jpg");
   gull.explore();
   gull.mirrorGull();
   gull.explore();
  }
  //ACTIVITY 8: EXERCISE 1
  public static void testCopy2(){
    Picture flower1 = new Picture("flower1.jpg");
    flower1.explore();
    flower1.copy(flower1,10,20, 0, 100);
    flower1.explore();
  }
  
  //ACTIVITY 8: EXERCISE 2
  public static void testMyCollage(){
    Picture canvas = new Picture("640x480.jpg");
    canvas.myCollage();
    canvas.explore();
  }
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
   // testFixUnderwater();
    //testMirrorVertical();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
    //test
    //testMirrorVerticalRightToLeft();
    //testMirrorHorizontal();
    //testMirrorHorizontalBottomToTop();
    //testMirrorDiagonal();
    //testMirrorArms();
    //testMirrorGull();
    //testCopy2();
    //testMyCollage();
  }
}