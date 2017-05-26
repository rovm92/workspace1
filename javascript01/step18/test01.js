//Echo 클라이언트 만들기
const net = require('net')

// 1) 소켓 객체를 준비한다.
const socket = new net.Socket();

// 2) 서버에 접속하기
socket.connect(8888, 'localhost', function () {
  console.log('=> 연결되었음');
  socket.write("Hello`~\n")
  console.log('=> 서버에 데이터 보냈음');
})

// 3) 데이터를 읽었을 때 호출 될  리스너 등록하기
// => 서버에서 데이터를 보내면 'data' 이벤트가 발생한다.
// => 이 이벤트가 발생하면 등록된 함수가 호출된다.
socket.on('data', function (data) {
  console.log(data.toString());
  socket.destroy()
})

// 4) 소켓을 닫으면 서버와의 연결이 끊어졌음을 알리는
// 'close' 이벤트가 발생한다.
socket.on('close', function(){
  console.log('연결이 끊어졌음!');
})
