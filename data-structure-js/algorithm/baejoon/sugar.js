const fs = require('fs');
// 백준에 제출할 땐 '/dev/stdin', 로컬 테스트는 파일 경로 또는
// require('fs').readFileSync('/dev/stdin') 만 바꿔주면 된다.
let input = fs.readFileSync("input.text").toString().trim();

const n = parseInt(input, 10);

if (n === 1 || n === 2 || n === 4) {
  console.log(-1);
  process.exit(0);
}

let max = Math.floor(n / 3);

let five = 0;
let three = 0;

for (let i = 0; i <= max; i++) {
  if ((n - (3 * i)) % 5 === 0) {
    // 봉지의 최소 개수 -> 3kg 봉지가 가장 작을 때
    five = Math.floor((n - (3 * i)) / 5);
    three = i;
    break;
  }
}

let result = five + three === 0 ? -1 : five + three;

console.log(result);
process.exit(0);
