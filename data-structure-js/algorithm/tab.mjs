// 메모이제이션
// 재귀 덕분에 하향식 계산 방식으로
// 어려운 문제를 간단하게 해결할 수 있음
// 중복 계산을 하지 않아서 속도가 빠름
// 메모리를 이용해 성능을 해결함
// 그러나 함수 하나를 호출하는 것보다 오버헤드가 클 수 밖에 없음

// 타뷸레이션
// 상향식 계산 방식으로
// 계산에 필요한 모든 값을 전부 계산 후 테이블에 저장해둠
// 하지만 재귀가 직관적이지 않을 땐 상향식 접근법인 타뷸레이션이

// 분할 정복 해결시 재귀가 더 직관적이라면 메모이제이션 굿
// 메모리도 절약하고 속도도 빠르게 해결 가능

const fibonacci3 = (n) => {
  if (n <= 1) return n;

  let table = [0, 1];

  for (let i = 2; i <= n; i++) {
    table[i] = table[i - 2] + table[i - 1];
  }

  return table[n];
};

let start = new Date();
console.log(fibonacci3(40, {}));
let end = new Date();
console.log(`fibonacci3 함수 실행 시간 ${end - start}ms`);
