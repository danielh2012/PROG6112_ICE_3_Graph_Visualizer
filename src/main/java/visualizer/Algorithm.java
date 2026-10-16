package visualizer;

import algorithms.GraphAlgorithm;
import algorithms.BFSAlgorithm;
import algorithms.DFSAlgorithm;
import algorithms.PrimsAlgorithm;
import algorithms.DijkstrasAlgorithm;
public enum Algorithm {

    BFS(new BFSAlgorithm()),
    DFS(new DFSAlgorithm()),
    DIJKSTRAS(new DijkstrasAlgorithm()),
    PRIMS(new PrimsAlgorithm());

    private final GraphAlgorithm algorithmInstance;

    Algorithm(GraphAlgorithm algorithmInstance) {
        this.algorithmInstance = algorithmInstance;
    }

    public GraphAlgorithm getAlgorithmInstance() {
        return algorithmInstance;
    }

}
