
/**
 * @author 
 * @version 
 */

public class MagicSquare
{
    /** The magic square array data */
    private int[][] array;

    /**
     * Constructs a MagicSquare object.
     * @param input the magic square array data.
     */
    public MagicSquare(int[][] input)
    {
        array = input;
    }

    

    /**
     * Tests to see if array is indeed a magic square
     * @return true if array is a magic square
     * @return false if the array is not a magic square
     */
    public boolean isMagicSquare()
    {
      if (!checkSquare()) {
        return false;
      }
      int sum = rowSum();
      if(!checkRows(sum)) {
        return false;
      }
      if (!checkColumns(sum)) {
        return false;
      }
      if (!checkDiagonals(sum)) {
        return false;
      }
      return true;
    }

    /**
     * Returns a String which represents the array.
     */
    public String toString()
    {
        String result = "";
        for(int r = 0; r < array.length; r++)
        {
            for(int c = 0; c <array[r].length; c++)
            {
                result += array[r][c];
                result += "\t";
            }
            result += "\n";
        }
        return result;
    }

  public boolean checkRows(int sum) {
    for (int i = 0; i < array.length; i++) {
      int r = rowSum();
      if (r != sum) {
        return false;
      }
      return true;
    }
  }
   
  public boolean checkColumns(int sum) {
    for (int i = 0; i < array[0].length; i++) {
      int c = colSum();
      if (c != sum) {
        return false;
      }
      return true;
    }
  }

  public boolean checkSquare() {
    for (int i = 0; i < array.length; i++) {
      if (array.length != array[i].length) {
        return false;
      }
    }
  }

  public boolean checkDiagonals(int sum){
    int sum0 = diag0Sum();
    if (sum != sum0) {
      return false;
    }
    int sum1 = diag1Sum(); 
    if (sum != sum1) {
      return false;
    }
    return true;
  }

  private int diag0Sum() {
    int sum = 0;
    for (int i = 0; i < array.length; i++) {
      sum += array[i][i];
    }
    return sum;
  }

  private int diag1Sum() {
    int sum = 0;
    for (int row = 0, col = array.length - 1; row < array.length; row++, col-- ) {
      sum += array[row][col];
    }
    return sum;
  }

  public int rowSum() {
    int rowSum = 0;
    for (int i = 0; i < array.length; i++) {
      rowSum = 0;
      for (int j = 0; j < array[i].length; j++) {
        rowSum = rowSum + array[i][j];
      }
    }
  }

  public int colSum() {
    int colSum = 0;
    for(int i = 0; i < array[i].length; i++) {
      colSum = 0;    
      for(int j = 0; j < array.length; j++) {
          colSum = colSum + array[j][i];   
      } 
    }   
  }
            
                
           
      


}
 