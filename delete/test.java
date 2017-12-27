package delete;

public class test {
	
	
	 int countwalks(int graph[][], int u, int v, int k)
	    {
	        // Table to be filled up using DP. The value count[i][j][e]
	        // will/ store count of possible walks from i to j with
	        // exactly k edges
	        int count[][][] = new int[u][v][k+1];
	 
	        // Loop for number of edges from 0 to k
	        for (int e = 0; e <k; e++)
	        {
	            for (int i = 0; i <u; i++)  // for source
	            {
	                for (int j = 0; j <v; j++) // for destination
	                {
	                    // initialize value
	                    count[i][j][e] = 0;
	 
	                    // from base cases
	                    if (e == 0 && i == j)
	                        count[i][j][e] = 1;
	                    if (e == 1 && graph[i][j]!=0)
	                        count[i][j][e] = 1;
	 
	                    // go to adjacent only when number of edges
	                    // is more than 1
	                    if (e > 1)
	                    {
	                        for (int a = 0; a < 5; a++) // adjacent of i
	                            if (graph[i][a]!=0)
	                                count[i][j][e] += count[a][j][e-1];
	                    }
	               }
	            }
	        }
	        return count[u][v][k];
	    }
	 
	 public static void main (String[] args) throws java.lang.Exception
	    {
	        /* Let us create the graph shown in above diagram*/
	        int graph[][] =new int[][] { {0, 1, 1, 1},
	                                     {0, 0, 0, 1},
	                                     {0, 0, 0, 1},
	                                     {0, 0, 0, 0}
	                                    };
	        int u = 3, v = 3, k = 2;
	        test p = new test();
	        System.out.println(p.countwalks(graph, u, v, k));
	    }
}

