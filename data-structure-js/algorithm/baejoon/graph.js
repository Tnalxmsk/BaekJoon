class NumericGraph {
  constructor(n, directed = false) {
    this.n = n;
    this.directed = directed;
    this.adjList = Array.from({ length: n + 1 }, () => []);
  }

  addEdge(u, v) {
    if (u < 1 || u > this.n || v < 1 || v > this.n) {
      return;
    }
    this.adjList[u].push(v);
    if (!this.directed) {
      this.adjList[v].push(u);
    }
  }

  dfs(start) {
    const visited = Array(this.n + 1).fill(false);
    let result = [];
    const _dfs = (u) => {
      visited[u] = true;
      result.push(u);
      for (const v of this.adjList[u]) {
        if (!visited[v]) _dfs(v);
      }
    };

    _dfs(start);
    console.log(result.join(" "));
  }

  bfs(start) {
    const visited = Array(this.n + 1).fill(false);
    const queue = [start];
    const array = [];
    visited[start] = true;
    while (queue.length) {
      const u = queue.shift();
      array.push(u);
      for (const v of this.adjList[u]) {
        if (!visited[v]) {
          visited[v] = true;
          queue.push(v);
        }
      }
    }
    console.log(array.join(" "));
  }
}

const fs = require("fs");

const input = fs.readFileSync("graph.text", "utf8").trim().split("\n");

const [N, M, S] = input[0].split(" ").map(Number);

const g = new NumericGraph(N);

for (let i = 1; i <= M; i++) {
  const [u, v] = input[i].split(" ").map(Number);
  g.addEdge(u, v);
}

for (let i = 1; i <= N; i++) {
  g.adjList[i].sort((a, b) => a - b);
}

g.dfs(S);
g.bfs(S);
