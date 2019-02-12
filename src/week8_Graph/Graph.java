package week8_Graph;

public interface Graph {

    boolean isDirected();

    int getNumNodes();

    int getNumEdges();

    boolean hasEdge(int u, int v);

    void addEdge(int u, int v); //Thêm cạnh


}
