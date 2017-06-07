package sort.algorithm;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthSmallestInSortedMatrix {
	
	/**
	 * Dijkstra's Algorithm: 
	 * Expand node at [i][j] and generate nodes of [i + i][j] and [i][j + 1]
	 * Until kth node is poped out the priority queue
	 * 
	 * Time :
	 * 	
	 * 	generate 2 nodes: 2logk = logk
	 * 	poll() from pq: logk since only k elements in pq
	 * 
	 * 	poll() k times: klogk
	 * 
	 * @author ShawnX
	 *
	 */
	
	class Cell {
		public int row;
		public int col;
		public int key;
		public Cell (int row, int col, int key) {
			this.row = row;
			this.col = col;
			this.key = key;
		}
	}
	
	public int kthSmallest (int[][] matrix, int k) {
		/**
		 * Assume: 
		 *  1, matrix and k are not null 
		 *  2, m != 0 && n != 0 (m and n are rows and cols of matrix)
		 *  3, k > 0 && k < m * n 
		 */
		int rows= matrix.length;
		int cols = matrix[0].length;
		PriorityQueue<Cell> minHeap = new PriorityQueue<>(k, new Comparator<Cell>() {
			@Override
			public int compare (Cell c1, Cell c2) {
				if (c1.key == c2.key) {
					return 0;
				}
				if (c1.key < c2.key) {
					return -1;
				} else {
					return 1;
				}
			}
		});
		
		// created a boolean array to store visited cells so to avoid a cell being generated more than once
		boolean[][] visited = new boolean[rows][cols];
		// starts from the first cell in matrix which is matrix[0][0]
		minHeap.offer(new Cell(0, 0, matrix[0][0]));
		visited[0][0] = true;
		
		for (int i = 0; i < k - 1; i++) { // loop stops when i = k - 1. From 0 to k-1, k-1 is the kth
			Cell cur = minHeap.poll();
			if (cur.row + 1 < rows && !visited[cur.row + 1][cur.col]) {
				minHeap.offer(new Cell(cur.row + 1, cur.col, matrix[cur.row + 1][cur.col]));
				visited[cur.row + 1][cur.col] = true;
			}
			if (cur.col + 1 < cols && !visited[cur.row][cur.col + 1]) {
				minHeap.offer(new Cell(cur.row, cur.col + 1, matrix[cur.row][cur.col + 1]));
				visited[cur.row][cur.col + 1] = true;
			}
		}
		return minHeap.peek().key;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
