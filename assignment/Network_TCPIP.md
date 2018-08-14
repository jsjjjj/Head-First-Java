# 01 네트워크 개념정리 _ TCP/IP

#### * IP (Internet Protocol)
	1. 전 세계 수 억대의 컴퓨터가 인터넷을 하기 위해서는 서로의 정체를 알 수 있도록 특별한 주소.
	2. 인터넷에서 컴퓨터의 위치를 찾아서 데이터를 전송하기 위해 지켜야 할 규약
#### * TCP (Transmission Control Protocol)
	1. 인터넷상의 컴퓨터들 사이에서 메시지의 형태로 보내기 위해 IP와 함께 사용되는 프로토콜
		= 데이터의 송수신을 위해 IP를 사용하는 프로토콜
    2. TCP는 손실을 검색해내서, 이를 교정하고 순서를 재조합 할 수 있도록 해줌(신뢰성)
    3. 연결지향 프로토콜
    
    ** 패킷?
    	: 인터넷 내에서 효율적으로 보내기 위해 데이터의 묶음 단위로 한번에 전송할 데이터의 크기
        ex ) 한번에 보내면 될텐데 왜 한꺼번에 보내지 않고 분할해서 보내는걸까?
        	==> 네트워크상에서 하나의 컴퓨터만 있는게 아니고 여러대의 컴퓨터가 존재한다.
            	이들은 서로 동시다발적으로 데이터를 주고 받는데 분할하지 않고 한번에 보낸다면 
                한 컴퓨터만 데이터를 주고 받게 되고 나머지의 데이터를 주고 받으려면 끝낼대 까지 기다
                려야 한다. 만약 중간에 에러가 발생하면 큰 데이터라면 다시 처음부터 해야한다.
                이러한 불편함을 방지하기 위해 데이터를 패킷 단위로 나누게 된다.
                
#### * TCP/IP
	1. 네트워크와 네트워크를 연결하기 위한 프로토콜
		- 여러 개의 네트웍을 연결해서 데이터를 서로 주고 받기위해, 서로 상호연결하기위한 프로토콜이다. 
		
        ** 왜 TCP/IP 같이 써야 할까?
        	- TCP는 데이터의 흐름을 제어할 수는 있지만 데이터가 전송되어야 할 경로에 대한 규약은 아니기 때문에 경로에 대한 규약인 IP를 함께 사용한다. 이 둘은 반드시 함께 사용되므로 TCP/IP라고 표기한다.
        	
#### * TCP/IP 생성과정
	1. ARPANET(Advanced Research Project Agency Network) 미국방성 프로젝트 수행 목적으로 구축.
	2. NSFNET(the US National Science Foundation Network)
	3. Internet = ARPANET + NSFNET : 1980년대 중반
	
	 	   ** TCP/IP가 등장한 이유는 ~!? **
   				* 컴퓨터간 통신을 위해서다. 	

**Client와 Server 또는 P2P Socket 통신 등, 네트워크를 사용한 통신시 TCP 통신을 많이 사용한다.**
TCP 통신을 위한 네트워크 연결은 **3 hand handshaking** 라는 방식으로 연결된다.

![tcp_3handshaking](../image/tcp_3handshaking.jpg)

#### * 3 Hand Shaking (연결성립) ####
	1. TCP/IP프로토콜을 이용해서 통신을 하는 응용프로그램이 데이터를 전송하기 전에 먼저 정확한 전송을 보장하기 위해 상대방 컴퓨터와 사전에 세션을 수립하는 과정
		* 역할
		- 양쪽 모두 데이타를 전송할 준비가 되었다는 것을 보장하고, 실제로 데이타 전달이 시작하기전에 한쪽이 다른 쪽이 준비되었다는 것을 알수 있도록 한다.
		- 양쪽 모두 상대편에 대한 초기 순차일련변호를 얻을 수 있도록 한다. 
		- 연결이 작동 하려면 각 측에서 패킷을 다른 측으로 보낼 수 있는지 확인 할 수 있음

#### * 3 Hand Shaking 과정 ####
	- SYN : Synchronize Sequence Numbers
	- ACK : Acknowledgment

1. 클라이언트는 SYN패킷을 서버에 전송하여 메시지가 통과할 수 있다는 증거를 요청(난수와 함께)
2. SYN이 끝나면 서버는 클라이언트가 패킷을 보낼 수 있음을 알게됨
3. 하지만 서버가 클라이언트에게 보낼 수 있는지는 모르기 때문에 두 개의 메시지를 다시 클라이언트에게 보낸다
	- SYN과 ACK함께 보낸다. 왜??
		- 이유는 네트워크 그래픽을 줄이기 위해 두 메시지를 하나로 결합한다.
		- SYN : 서버도 연결해도 되는지에 대한 증거요청하기 위해 보내는 용도
		- ACK : 패킷을 받았다고 응답하는것
4. 패킷을 통화할 증거가 이제 필요 없기 때문에 승인한다는 ACK를 보낸다
	- ACK가 끝나면 서버는 클라이언트에게 통신을 할 수 있다는 것을 알게 된다.

**궁금증**
1. 왜 처음에 SYN을 보낼 때 난수와 같이 보낼까?
	- 처음 클라이언트에서 SYN패킷을 보낼 때 Sequence Number에는 랜덤한 숫자가 담긴다. 초기 Sequence Number를 ISN이라고 한다. Connection을 맺을 때 사용하는 포트는 유한 범위 내에서 사용하고 시간이 지남에 따라 재사용됨. 따라서 두 통신 호스트가 과거에 사용된 포트가 존재할 가능성이 있다. 서버 측에선 SYN을 보고 패킷을 구분하는데 난수가 아닌 순차적인 Number라고 하면 이전의 connection으로 인식할 수 있다. 이러한 문제로 인해 난수를 ISN을 설정하는것.
	
![tcp_4way](../image/tcp_4way.png)

#### * 4 Hand Shaking (연결해제) ####
1. 먼저 통신을 종료하고자 하는 클라이언트는 서버에게 FIN 플래그를 세팅한 패킷을 보내고 자신은 FIN_WAIT_1 상태가 된다.
2. FIN을 받은 서버는 ACK를 클라이언트에게 전송하고 자기 소켓상태를 CLOSE_WAIT으로 변경한다.
	- 서버는 일단 확인메시지를 보내고 자신의 통신이 끝날때까지 기다리는데 이 상태가 TIME_WAIT 상태다.
3. ACK를 받은 클라이언트는 서버가 FIN을 잘 받았다고 판단하고 FIN_WAIT_2로 상태를 변경한 뒤 다시 FIN의 패킷을 기다린다.
4. FIN을 클라이언트에게 전송한 서버는 다시 FIN패킷을 클라이언트로 전송한 뒤 소켓을 LAST_ACK 상태로 변경한다
5. FIN을 수신한 클라이언트는 서버에게 ACK를 전송한 뒤 소켓의 상태를 TIME_WAIT 상태로 변경한다
6. 클라이언트로 부터 마지막 ACK를 수신한 서버는 소켓을 CLOSED 한다.

	- TIME WAIT과정을 거치는 이유는?
		- 만약 서버에서 FIN을 전송하기 전에 전송한 패킷이 Routing지연이나 패킷 유실로 인한 재전송으로 이해 FIN패킷보다 늦게 도착하는 상황이 발생한다면....!!!!!!
			- 클라이언트에서 세션을 종료시킨후 뒤늦게 도착하는 패킷이 있다면 패킷은 Drop되고 데이터는 유실될 것입니다. 이러한 현상에 대비하여 클라이언트는 서버로부터 FIN을 수신하더라도 일정시간동안 세션을 남겨놓고 패킷을 기다리는 과정을 거치게 되는데 이 과정을 **"TIME_WAIT"** 이라고 함.
