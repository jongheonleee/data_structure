# data-structure

전반적인 자료구조 시간 복잡도
![image](https://github.com/jongheonleee/data_structure/assets/87258372/659a6c6b-f03f-41a1-acbb-98fcc5b8874b)


## 📌 List : <strong>데이터가 나열되어 있음</strong>

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


## 📌 Stack, Queue and Deque : 데이터를 어떤 방향으로 넣고 꺼낼까

### 01. Stack : LIFO

- LIFO, last in first out 으로 나중에 저장된 데이터 부터 꺼낼 수 있음
- 책을 쌓아놓은 더미를 생각하면됨 📚


- 위의 문제를 푸는 핵심은 "열린 괄호에는 푸시, 닫힌 괄호 팝을 통해 가장 인접한 짝을 제거해 나가면됨"

