import org.apache.tinkerpop.gremlin.process.traversal.dsl.graph.GraphTraversalSource;

public class MyApp {

  public static void main(String[] args) {
    GraphTraversalSource g = null;

    // not possible to do:
//    g.withStrategies();
    // although it is possible in TinkerPop 3.2.4
  }
}
