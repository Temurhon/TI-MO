public class ListVisualiserDriver {
    public static void main(String args[]) {
        SLList a = new SLList(1, new SLList(11, new SLList(23, new SLList(3,  SLList.NIL))));
	ListVisualiser v = new ListVisualiser(a);
        v.visualise();
    }
}
