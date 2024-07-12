package Graph;

import java.util.Arrays;

public class RemoveMaxNumberofEdgestoKeepGraphFullyTraversable {
	
	public static class UnionFind {
        int[] component;
        int distinctComponents;
        
        public UnionFind(int n) {
            component = new int[n+1];
            for (int i = 0; i <= n; i++) {
                component[i] = i;
            }
            distinctComponents = n;
        }
        
        public boolean unite(int a, int b) {
            if (findComponent(a) != findComponent(b)) {
                component[findComponent(a)] = b;
                distinctComponents--;
                return true;
            }
            
            return false;
        }
        
        public int findComponent(int a) {
            if (component[a] != a) {
                component[a] = findComponent(component[a]);
            }
            return component[a];
        }
        
        public boolean united() {
            return distinctComponents == 1;
        }
        
    }

	public static int maxNumEdgesToRemove(int n, int[][] edges) {
		Arrays.sort(edges, (a, b) -> b[0] - a[0]);

		int edgeAdd = 0;

		UnionFind alice = new UnionFind(n);
		UnionFind bob = new UnionFind(n);

		for (int[] edge : edges) {
			int type = edge[0];
			int a = edge[1];
			int b = edge[2];

			switch (type) {
			case 3:
				if (alice.unite(a, b) | bob.unite(a, b)) {
					edgeAdd++;
				}
				break;
			case 2:
				if (bob.unite(a, b)) {
					edgeAdd++;
				}
				break;
			case 1:
				if (alice.unite(a, b)) {
					edgeAdd++;
				}
				break;
			}
		}

		return (alice.united() && bob.united()) ? edges.length - edgeAdd : -1;
	}

	public static void main(String[] args) {
		int[][] edges = {{3,1,2},{3,2,3},{1,1,3},{1,2,4},{1,1,2},{2,3,4}};
		System.out.println(maxNumEdgesToRemove(4, edges));

	}

}
