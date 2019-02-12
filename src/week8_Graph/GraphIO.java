package week8_Graph;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/*
    An utility to read/write graphs from a text file.
 */
public class GraphIO {
    public static Graph read(String path, RepresentationType type) {
//        List<String> lines = null;
        try {
            List<String> lines = Files.readAllLines(Paths.get(path));
            if(lines.size() < 2) {
                System.err.println("Are you kidding me?");
                return null;
            }
            int n = Integer.parseInt(lines.get(0));
            boolean directed = Boolean.parseBoolean(lines.get(1));
            Graph g = null;
            switch (type){
                case ADJACENCY_MATRIX:
                    g = new AdjacencyMatrixGraph(n, directed);
                    break;
                case ADJACENCY_LISTS:
                    g = new AdjacencyListGraph(n, directed);
                    break;
                case EDGE_LISTS:
                    g = new EdgeListGraph(n, directed);
                    break;
                default:
                    System.err.println("Undefined re type!");
                    break;
            }
//            Graph g = new AdjacencyMatrixGraph(n, false);
            for (int i = 2; i < lines.size(); i++) {
                String[] uv = lines.get(i).split("\\s+");
                int u = Integer.parseInt(uv[0]);
                int v = Integer.parseInt(uv[1]);
                if( u >= 0 && u < n && v >= 0 && v < n)
                    g.addEdge(u, v);
                else System.err.println("Node index out of bound!!!!!!!");
            }
            return g;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
