package week8_Graph;

/*
    Implementation of a graph using a adjacency matrix
 */
public class AdjacencyMatrixGraph extends GraphIO implements Graph{

    //Ma tran ke
    private final int MAX = 100;

    private int n = 0; //So dinh cua do thi
    private boolean[][] a = new boolean[MAX][MAX];
    private boolean directed = false;

    public AdjacencyMatrixGraph(int n, boolean directed) {
        this.n = n;
        this.directed = directed;
    }

    @Override
    public boolean isDirected() {
        return directed;
    }

    @Override
    public int getNumNodes() {
        return n;
    }

    @Override
    public int getNumEdges() {
        int m = 0; //So canh
        for (int u = 0; u < n; u++) {
            for (int v = 0; v < n; v++) {
                if (a[u][v]) m++;
            }
        }
        if (directed)
            return m;
        else return m / 2;
    }

    @Override
    public boolean hasEdge(int u, int v) {
        return a[u][v];
    }

    @Override
    public void addEdge(int u, int v) {
        a[u][v] = true;
        if(!directed) a[v][u] = true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(n);
        sb.append('\n');
        sb.append(directed);
        sb.append('\n');
        for (int u = 0; u < n; u++) {
            for (int v = 0; v < n; v++)
                if(a[u][v])
                    sb.append("1 ");
                else sb.append("0 ");
            sb.append('\n');
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        //Graph g = new AdjacencyMatrixGraph(5, false);
        Graph g = GraphIO.read("dat/graph0.txt", RepresentationType.ADJACENCY_MATRIX);
       /* g.addEdge(0,1);
        g.addEdge(0,3);
        g.addEdge(1,4);
        g.addEdge(2,3);
        g.addEdge(3,4);*/
        System.out.println(g);
    }
}
