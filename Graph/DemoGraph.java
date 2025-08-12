import java.util.*;

public class DemoGraph {
    static class Edges{
        int src;
        int dest;
        int weight;
        public Edges(int s,int d,int w){
            this.src = s;
            this.dest = d;
            this.weight = w;
        }
    }

    public static void createGraph(ArrayList<Edges> graph[]){
        for(int i = 0; i<graph.length;i++){
            graph[i] = new ArrayList<Edges>();
        }

        graph[0].add(new Edges(0,1,10));

        graph[1].add(new Edges(1,2,20));
        graph[1].add(new Edges(1,3,12));

        graph[2].add(new Edges(2,0,5));
        graph[2].add(new Edges(2,1,2));
        graph[2].add(new Edges(2,3,3));

        graph[3].add(new Edges(3,1,7));
        graph[3].add(new Edges(3,2,6));
        
    }
    public static void bfs(ArrayList<Edges> graph[],boolean vis[],int start){
        Queue<Integer> q = new java.util.LinkedList<>();
      
        q.add(0);
        while(!q.isEmpty()){
            int curr = q.remove();
            if(vis[curr]==false){
                System.out.print(curr+ " ");
                vis[curr] = true;

                for(int i =0; i<graph[curr].size();i++){
                    Edges e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }

    }

    public static void main(String[] args) {
        int v = 7;
        
        ArrayList<Edges> graph[] = new ArrayList[v];
        createGraph(graph);
////// USED TO PRINT THE GTAPH VERTEX AND EDGES;
        // for(int i = 0;i<graph[2].size();i++){
        //     Edges e = graph[2].get(i);
        //     System.out.println(e.dest+"weight"+e.weight);
         
        // }
          boolean vis[] = new boolean[v];
          for(int i =0;i<vis.length;i++){
            if(vis[i]== false){
                bfs(graph,vis,i);
            }
            }
              System.out.println();
          }
      


    }
    

