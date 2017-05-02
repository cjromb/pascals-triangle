import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by cjromberger on 5/2/17.
 */
public class PascalsTriangle {

    static final int numRows = 10;
    static final int nRows = numRows - 2; // don't iterate the first two.  They're added during the constructor
    LinkedList<LinkedList<Integer>> triangle = new LinkedList<LinkedList<Integer>>();
    LinkedList<Integer> firstRow;
    LinkedList<Integer> secondRow;
    LinkedList<Integer> parentRow;


    public PascalsTriangle () {

        this.triangle = triangle;
        this.firstRow = new LinkedList<Integer>();
        firstRow.add(1);
        triangle.add(firstRow);

        this.secondRow = new LinkedList<Integer>();
        secondRow.add(1);
        secondRow.add(1);
        triangle.add(secondRow);
    }

    void addElements()
    {
        parentRow = this.triangle.getLast();
        int numElements = parentRow.size();
        LinkedList<Integer> newRow = new LinkedList<Integer>();
        newRow.add(1);
        for (int e = 0; e < (numElements - 1); e++) {
           int neighbor = e + 1;
           int elementSum = parentRow.get(e) + parentRow.get(neighbor);
           newRow.add(elementSum);
        }
        newRow.add(1);
        this.triangle.add(newRow);

    }

    private void printResults() {
        for (LinkedList<Integer> row : triangle) {
            System.out.println();
            for (Integer element : row) {
                System.out.print(element + " ");
            }
        }
    }

    public static void main(String[] args ) {

        PascalsTriangle pTriangle = new PascalsTriangle();

        for (int i = 0; i < nRows; i++) {
            pTriangle.addElements();
        }

        pTriangle.printResults();
    }



}
