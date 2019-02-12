package week8_Graph;

public class AdjacencyListGraph implements Graph {


    public AdjacencyListGraph(int n, boolean directed) {
    }

    @Override
    public boolean isDirected() {
        return false;
    }

    @Override
    public int getNumNodes() {
        return 0;
    }

    @Override
    public int getNumEdges() {
        return 0;
    }

    @Override
    public boolean hasEdge(int u, int v) {
        return false;
    }

    @Override
    public void addEdge(int u, int v) {

    }
}
