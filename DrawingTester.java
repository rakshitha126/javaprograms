class DrawingTester{
public static void main(String a[])
{
Drawing drawing=new Drawing("pencil","mandal","vilet",25);
drawing.printDrawingDetails();
Drawing dra=new Drawing("pen","illustration","black",52);
dra.printDrawingDetails();
drawing.fetchDrawing();
drawing.working();
}
}