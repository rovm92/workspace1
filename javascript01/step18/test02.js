//Echo 서버 만들기
const net = require('net')

// 1) 소켓 객체를 준비한다.
const server = net.createServer(function (socket) {  // 클라이언트가 접속하면 호출됨
  console.log('=> 클라이언트가 연결되었습니다.');

  socket.on('data', function (data) {
    socket.write("[ksm] " + data.toString( ))
    socket.destroy();
  })
})

// 2) 서버에 접속하기
server.listen(8888 ,() => {
  console.log('=> 서버 실행중....')
})
