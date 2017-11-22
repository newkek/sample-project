import org.apache.tinkerpop.gremlin.process.traversal.dsl.graph.GraphTraversalSource;
import org.apache.tinkerpop.gremlin.structure.Graph;
import org.apache.tinkerpop.gremlin.tinkergraph.structure.TinkerGraph;

public class MyApp {

  public static void main(String[] args) {
    Graph graph = TinkerGraph.open();
    GraphTraversalSource g = graph.traversal();
  }
}
