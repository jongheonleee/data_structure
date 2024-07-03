# data-structure

전반적인 자료구조 시간 복잡도
![image](https://github.com/jongheonleee/data_structure/assets/87258372/659a6c6b-f03f-41a1-acbb-98fcc5b8874b)


## 📌 01. List : <strong>데이터가 나열되어 있음</strong>

### 01. ArrList : 데이터를 연속해서 나열한 구조로 저장 

- 동적 배열, 내부 공간을 효율적으로 활용
- 원소가 공간을 얼마나 차지하느냐에 따라 공간을 확장하고 축소함
- 조회는 O(1) 하지만, 삽입/삭제는 O(n), 빈공간을 채우기 위해 시프팅발생 

<img src="https://github.com/jongheonleee/data-structure/assets/87258372/ea7c8234-525d-45da-804a-20547e41d1c9"  width="500" height="500"/>
<img src="https://github.com/jongheonleee/data-structure/assets/87258372/126caa15-8a44-40ec-bffa-2e70f1ea3d30"  width="500" height="500"/>


### 02. Singly Linked book.chapter01 : 노드들이 링크로 연결되어 나열된 구조 

- 노드가 한 방향으로 연결되어 있음
- 배열에서 삽입, 삭제하면 O(n) 이를 O(1)으로 발전
- 하지만, 기본적인 조회는 O(n)
  
<img src="https://github.com/jongheonleee/data-structure/assets/87258372/4a90f25a-0fcb-4d03-b08b-662b7e29aff6"  width="500" height="500"/>
<img src="https://github.com/jongheonleee/data-structure/assets/87258372/daf03c0d-cd73-49f6-9804-0c5ef7ca7520"  width="500" height="500"/>

### 03. Doubly Linked book.chapter01 : 노드들이 2개의 링크로 연결(이전 노드/다음 노드)되어 나열된 구조 

- 노드가 양방향으로 연결되어 있음
- head, tail 사이에 양방향으로 연결된 노드 더미가 있음
- SLL에서 한방향 탐색의 문제를 개선하고자 등장, 하지만 O(n/2)여서 결론적으로는 O(n)임. 즉 약간의 성능 개선은 있음
- 물론 특정 노드를 기준으로 양방향으로 탐색가능하다는 것은 매우 유용함 

<img src="https://github.com/jongheonleee/data-structure/assets/87258372/98902baf-7cf3-4a3c-84d1-2da06a05f014"  width="500" height="500"/>
<img src="https://github.com/jongheonleee/data-structure/assets/87258372/88fb226c-3283-402f-ac40-b96f3111f493"  width="500" height="500"/>


### 04. Circular Linked book.chapter01 : 마지막 노드가 첫 노드와 연결되어 있는 구조(기본 형태는 SLL과 같음)

- 마지막 노드가 첫 노드와 연결된 단순 연결 리스트

<img src="https://github.com/jongheonleee/data_structure/assets/87258372/fc903da3-ea6c-4ed3-b8b0-af97fbc552e8"  width="500" height="500"/>
<img src="https://github.com/jongheonleee/data_structure/assets/87258372/5b2e2253-636b-4161-b0da-9464e7d99ca7"  width="500" height="500"/>


## 📌 02. Stack, Queue and Deque : 데이터를 어떤 방향으로 넣고 꺼낼까

### 01. Stack : LIFO

- LIFO, last in first out 으로 나중에 저장된 데이터 부터 꺼낼 수 있음
- 책을 쌓아놓은 더미를 생각하면됨 📚
- <img src="https://github.com/jongheonleee/data_structure/assets/87258372/115d0d39-6b56-4a9e-9281-68b2557117de"  width="500" height="500"/>
<br>

- <img src="https://github.com/jongheonleee/data_structure/assets/87258372/b1c32172-7dc0-4aa9-abe1-3061bd6e3a03"  width="500" height="500"/>
- 위의 문제를 푸는 핵심은 "열린 괄호에는 푸시, 닫힌 괄호 팝을 통해 가장 인접한 짝을 제거해 나가면됨"



## 📌 02. Tree : List를 업그레이드 시킨 버전 

### 01. Tree(트리) : empty(0), root와 트리의 집합으로 구성

### 01-1. 일반적인 트리 
- [일반적인 트리]
- <img src="https://github.com/jongheonleee/data_structure/assets/87258372/dae67c6b-4ef9-4aa2-ab36-b653e08e6843"  width="500" height="500"/>

<br>

- 트리 용어
  - 차수 : 자식 수
  - 레벨 : 루트가 레벨 1, 밑으로 갈수록 1 씩 증가
  - 높이 : 트리의 최대 레벨
  - 키 : 노드에 저장된 정보
  - leaf(잎) : 외부 노드, 단말 노드
  - leaf 이외의 노드 : 내부 노드 

<br>

### 01-2. 이진 트리 
- [포화/완전 이진 트리 형태]
- <img src="https://github.com/jongheonleee/data_structure/assets/87258372/32647bcc-ad2b-4e78-9063-5960485bf2e7"  width="500" height="500"/>
- 이진 트리 구현할 때 Node의 키값은 지네릭으로 제한
  - <Key extends Comparable<Key>> : 기본 정렬 기준을 구현한 Key 
    - 내부적으로 key 끼리 비교 가능해야함 

<br>

- [이진 트리 특징]
- <img src="https://github.com/jongheonleee/data_structure/assets/87258372/736b01ae-c882-4fcd-8c5e-6e8711c97844"  width="500" height="500"/>

<br>

- [배열을 활용한 이진 트리]
- <img src="https://github.com/jongheonleee/data_structure/assets/87258372/bb276b7a-3d44-451f-afd3-092edbf913ce"  width="500" height="500"/>
- (1) a[ i ]의 부모 => a[ i/2 ](i>1)
- (2) a[ i ]의 왼쪽 자식 => a[ 2*i ](2*i <= n)
- (3) a[ i ]의 오른쪽 자식 => a[ 2*i+1 ](2*i+1 <= n)

<br>

- [편향 이진 트리 & 완전 이진 트리]
- <img src="https://github.com/jongheonleee/data_structure/assets/87258372/55b9e57c-5e17-44eb-afc1-823cb2dd4ef5"  width="500" height="500"/>
- 한쪽으로 치우친 트리를 '편향 이진 트리'
- 링크드 리스트


<br>

- [이진트리 연산 진행 방향]
- 크게 4가지로 구성
  - (1) 전위(Preorder) : N-L-R
    - [방문 순서]
    - <img src="https://github.com/jongheonleee/data_structure/assets/87258372/b7e09bcb-22cc-4dd9-87f5-86992b7c58f7"  width="500" height="500"/>
    - [코드]
    - <img src="https://github.com/jongheonleee/data_structure/assets/87258372/bcf8b468-dead-40ae-9242-3ca4e0fba4b1"  width="500" height="500"/>
    
  - (2) 중위(Inorder) : L-N-R  
      - [방문 순서]
      - <img src="https://github.com/jongheonleee/data_structure/assets/87258372/bcb6d003-f190-4181-be74-f2d79cca63d2"  width="500" height="500"/>
      - [코드]
      - <img src="https://github.com/jongheonleee/data_structure/assets/87258372/337d1136-5639-4f16-8423-9507c39bce94"  width="500" height="500"/>
  
    
  - (3) 후위(Postorder) : L-R-N
      - [방문 순서]
      - <img src="https://github.com/jongheonleee/data_structure/assets/87258372/4f503e04-3f74-4d53-b8a5-538885643465"  width="500" height="500"/>
      - [코드]
      - <img src="https://github.com/jongheonleee/data_structure/assets/87258372/4d2b3101-30d9-4d90-b33a-08f5bcd9460e"  width="500" height="500"/>
    
    
  - (4) 레벨(Levelorder) : bfs, 레벨 단위로 탐색 
      - [방문 순서]
      - <img src="https://github.com/jongheonleee/data_structure/assets/87258372/a99c9c18-58c3-4d40-8398-d7b011b63e9c"  width="500" height="500"/>
      - [코드]
      - <img src="https://github.com/jongheonleee/data_structure/assets/87258372/66f761df-3c63-490e-bd35-38ddaf092778"  width="500" height="500"/>

<br>

- [이진트리 연산 기초]
  - 크게 3가지로 구성 
    - (1) size() : 트리의 노드 수 = 1 + left's nodes + right's nodes
        - [그림]
        - <img src="https://github.com/jongheonleee/data_structure/assets/87258372/8700bdf0-35a2-4f8e-8a5a-49fd966c6c4c"  width="500" height="500"/>
        - [코드]
        - <img src="https://github.com/jongheonleee/data_structure/assets/87258372/155ada90-e9c4-42aa-bfff-5a1bc12e2cdd"  width="500" height="500"/>
  
    - (2) height() : 트리의 높이 = 1 + max(left's height, right's height)
        - [그림]
        - <img src="https://github.com/jongheonleee/data_structure/assets/87258372/acd2eb44-c8eb-44d8-848f-02ebbac4172b"  width="500" height="500"/>
        - [코드]
        - <img src="https://github.com/jongheonleee/data_structure/assets/87258372/72871d39-dd4b-4ba7-baae-83801cd5a1e1"  width="500" height="500"/>
        
    - (3) isEqual() : inorder 순회 결과 비교 -> 같으면 true, 다르면 false
        - [코드]
        - <img src="https://github.com/jongheonleee/data_structure/assets/87258372/cc429921-bc5e-48a3-b82a-bad7f93b91b6"  width="500" height="500"/>

    
- [스레드 이진 트리]
- <img src="https://github.com/jongheonleee/data_structure/assets/87258372/976ed8da-0caa-4fcc-9387-888ce03dfa24"  width="500" height="500"/>
- null 참조 공간에 다음에 방문할 노드의 참조를 저장하는 것 
    
