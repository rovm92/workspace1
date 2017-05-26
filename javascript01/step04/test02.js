"use strict"

function f1() {
  console.log("f1() 호출됨");
}

f1(); // 함수를 호출할 때는 값을 넘기지 않더라도 괄호를 반드시 써야 한다.

// 2) 파라미터(X), 리턴 값(O)
function f2() {
  return "hello";  // 값을 리턴하려면 return 명령을 사용해야 한다.
}

var value = f2();
console.log("f2()의 리턴 값 = ", value);

// 3) 파라미터(O), 리턴 값(X)
function f3(a) {
  console.log("----> ", a);
}

f3(100); // 함수를 호출할 때 값을 전달하고 싶다면 괄호 안에 순서대로 넣어라.
f3(200);
f3(300);

// 4) 파라미터(O), 리턴 값(O)
function f4(a) {
  return "a = " + a + "입니다.";
}

var value = f4(100);
console.log(value);

// 굳이 값을 별도의 변수에 저장한 후 출력할 필요는 없다.
// 함수의 리턴 값을 즉시 사용할 수 있다.
// 참고! 실행은 항상 괄호() 안쪽부터 실행한다.
console.log(f4(200)); // f4()를 실행한 후 그 리턴 값을 출력하라는 의미이다.
