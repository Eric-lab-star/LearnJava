import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CleanName {

	public static void main(String[] args) {
		System.out.print("Hello Java");
	}

	public List<int[]> getName() {
		List<int[]> list1 = new ArrayList<int[]>();
		for (int[] x : theList)
			if (x[0] == 4)
				list1.add(x);
		return list1;
	}

	public List<int[]> getFlaggedCells() {
		List<int[]> flaggedCells = new ArrayList<int[]>();
		for (int[] cell : gameBoard)
			if (cell[STATUS_VALUE] == FLAGGED)
				flaggedCelles.add(cell);
		return flaggedCells;
	}

	public List<int[]> getFlaggedCells() {
		List<int[]> flaggedCells = new ArrayList<int[]>();
		for (Cell cell : gameBoard)
			if (cell.isFlagged())
				flaggedCells.add(cell);
		return flaggedCells;

	}
}

class Customer {
	private Date generationTimeStamp;
	private Date modificaionTimeStamp;
	private final String recordId = "102";
}

class DtaRcrd102 {
	private Date genymdhms;
	private Date modymdhms;
	private final String pszqint = "102";
}