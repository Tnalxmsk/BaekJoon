const fs = require("fs");
const filePath = process.platform === 'linux' ? '/dev/stdin' : 'input.txt'
const [n, ...arr] = fs.readFileSync("/dev/stdin").toString().trim().split("\n");

const fibo = (n) => {
  if (n <= 1) return n;

  let table = [0, 1];

  for (let i = 2; i <= n; i++) {
    table[i] = table[i - 2] + table[i - 1];
  }

  return table[n];
};

const input = fs.readFileSync(filePath).toString().trim().split("\n");

console.log(fibo(n) % 1000000007);
