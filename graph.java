import java.util.*;

public class graph{
    static class Edge{
        int source;
        int dest;//destination
        int wt;//wight
        Edge(int s,int d,int w){
            this.source=s;
            this.dest=d;
            this.wt=w;
        }
    }
    public static void main(String[] args) {
        int v=5;
        ArrayList<Edge>[]grap=new ArrayList[v];

        for (int i = 0; i < grap.length; i++) {
            grap[i]=new ArrayList<>();
        }
        //0
        grap[0].add(new Edge(0, 1, 5));
        //1
        grap[1].add(new Edge(1, 0, 5));
        grap[1].add(new Edge(1, 2, 1));
        grap[1].add(new Edge(1, 3, 3));
        //2
        grap[2].add(new Edge(2, 1, 1));
        grap[2].add(new Edge(2, 3, 1));
        grap[2].add(new Edge(2, 4, 1));
        //3
        grap[3].add(new Edge(3, 1, 3));
        grap[3].add(new Edge(3, 2, 1));
        //4
        grap[4].add(new Edge(4, 2, 2));

        for (int i = 0; i < grap[2].size(); i++) {
            Edge e=grap[2].get(i);
            System.out.println(e.wt);
        }
    }
    
}