public class SkyView {
    private double[][] view;

    public SkyView(int numRows, int numCols, double[] scanned)
    {
        view = new double[numRows][numCols];
        int z =0;
        int k =0;
        for(int i=0; i<numRows;i++)
        {
            if(k%2==0)
            {
                for(int j =0; j<numCols;i++)
                {
                    view[j][i]= scanned[z];
                    z++;
                }
                k++;
            }
            else if
            (k%2==1)
            {
                for(int l = 0; l<numRows; l++)
                {
                    view[l][i] = scanned[z];
                    z++;
                }
                k++;
            }

        }
    }
    public double getAverage(int startRow, int endRow, int startCol, int endCol)
    {
        double total =0;
        int count = 0;
        for(int i = startRow; i <endRow; i++)
        {
            for(int k = startCol; k < endCol; k++)
            {
                total += view[i][k];
                count++;
            }

        }
        return(total/count);

    }
}


