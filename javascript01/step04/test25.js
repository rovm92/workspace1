"use strict"

var arr =['홍길동','임꺽정','유관순','안중근','윤봉길']
var functionList =[];

var j=0;
for (let i = 0; i < arr.length; i++) {
  j++;
  functionList[i] =function(){
    console.log(arr[i]);
  }
}
//console.log(i);
functionList[0]();
functionList[1]();
functionList[2]();
functionList[3]();
functionList[4]();
