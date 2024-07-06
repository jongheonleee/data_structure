# 👨🏻‍💻data-structure(자료구조)

## 🫵🏻 자료구조의 핵심
> ### 그림과 핵심 아이디어(긴 설명보다 핵심을 파악하고 이를 그릴 수 있어야함)
> ### 자료구조는 각각의 특징들이 있음. 그 특징들은 무언가 개선하려는 노력으로부터 나옴
> ### 시간 복잡도 & 공간 복잡도

<br>

참고할만한 사이트(그림) : https://visualgo.net/en

### 📌 전반적인 자료구조 시간 복잡도

<img src="https://github.com/jongheonleee/data_structure/assets/87258372/659a6c6b-f03f-41a1-acbb-98fcc5b8874b"  width="500" height="500"/>

<br>
<br>

### 📌 전반적인 자료구조 시간 복잡도 그래프

<img src="https://github.com/jongheonleee/data_structure/assets/87258372/2915770a-5e60-4659-9714-31b85df1a9dd"  width="500" height="500"/>


## 📌 01. List : <strong>데이터가 나열되어 있음</strong>

> ### 👉 Array 
> ### - 데이터가 연속적으로 묶어서 관리
> ### - 조회 O(1), 삽입 & 삭제 O(n)

<br>

> ### 👉 List 
> ### - 데이터가 링크로 연결되어 나열된 형태
> ### - Array의 삽입 & 삭제 개선(O(n) -> O(1))
> ### - 조회 O(n)

<br>

### 01-1. ArrList : 데이터를 연속해서 나열한 구조로 저장 

- 동적 배열, 내부 공간을 효율적으로 활용
- 원소가 공간을 얼마나 차지하느냐에 따라 공간을 확장하고 축소함
- 조회는 O(1) 하지만, 삽입/삭제는 O(n), 빈공간을 채우기 위해 시프팅발생 

<img src="https://github.com/jongheonleee/data-structure/assets/87258372/ea7c8234-525d-45da-804a-20547e41d1c9"  width="500" height="500"/>
<img src="https://github.com/jongheonleee/data-structure/assets/87258372/126caa15-8a44-40ec-bffa-2e70f1ea3d30"  width="500" height="500"/>

<br>

### 01-2. Singly Linked List : 노드들이 링크로 연결되어 나열된 구조 

- 노드가 한 방향으로 연결되어 있음
- 배열에서 삽입, 삭제하면 O(n) 이를 O(1)으로 발전
- 하지만, 기본적인 조회는 O(n)
  
<img src="https://github.com/jongheonleee/data-structure/assets/87258372/4a90f25a-0fcb-4d03-b08b-662b7e29aff6"  width="500" height="500"/>
<img src="https://github.com/jongheonleee/data-structure/assets/87258372/daf03c0d-cd73-49f6-9804-0c5ef7ca7520"  width="500" height="500"/>

<br>

### 01-3. Doubly Linked List : 노드들이 2개의 링크로 연결(이전 노드/다음 노드)되어 나열된 구조 

- 노드가 양방향으로 연결되어 있음
- head, tail 사이에 양방향으로 연결된 노드 더미가 있음
- SLL에서 한방향 탐색의 문제를 개선하고자 등장, 하지만 O(n/2)여서 결론적으로는 O(n)임. 즉 약간의 성능 개선은 있음
- 물론 특정 노드를 기준으로 양방향으로 탐색가능하다는 것은 매우 유용함 

<img src="https://github.com/jongheonleee/data-structure/assets/87258372/98902baf-7cf3-4a3c-84d1-2da06a05f014"  width="500" height="500"/>
<img src="https://github.com/jongheonleee/data-structure/assets/87258372/88fb226c-3283-402f-ac40-b96f3111f493"  width="500" height="500"/>

<br>

### 01-4. Circular Linked List : 마지막 노드가 첫 노드와 연결되어 있는 구조(기본 형태는 SLL과 같음)

- 마지막 노드가 첫 노드와 연결된 단순 연결 리스트

<img src="https://github.com/jongheonleee/data_structure/assets/87258372/fc903da3-ea6c-4ed3-b8b0-af97fbc552e8"  width="500" height="500"/>
<img src="https://github.com/jongheonleee/data_structure/assets/87258372/5b2e2253-636b-4161-b0da-9464e7d99ca7"  width="500" height="500"/>

<br>
<br>


## 📌 02. Stack, Queue, Deque : 데이터를 어떤 방향으로 넣고 꺼낼까, LIFO, FIFO

<br>

> ### 👉 Stack, Queue, Deque
> ### - 데이터를 정해진 규칙에 맞게 꺼내옴
> ### - LIFO, FIFO, LIFO & FIFO

<br>

### 02-1. Stack : LIFO

- LIFO, last in first out 으로 나중에 저장된 데이터 부터 꺼낼 수 있음
- 책을 쌓아놓은 더미를 생각하면됨 📚
- <img src="https://github.com/jongheonleee/data_structure/assets/87258372/115d0d39-6b56-4a9e-9281-68b2557117de"  width="500" height="500"/>
<br>

- <img src="https://github.com/jongheonleee/data_structure/assets/87258372/b1c32172-7dc0-4aa9-abe1-3061bd6e3a03"  width="500" height="500"/>
- 위의 문제를 푸는 핵심은 "열린 괄호에는 푸시, 닫힌 괄호 팝을 통해 가장 인접한 짝을 제거해 나가면됨"

<br>

### 02-2. Queue : FIFO

<br>

### 02-3. Deque : LIFO & FIFO


<br>


## 📌 03. Tree : List를 업그레이드 시킨 버전 

<br>

> ### 👉 Tree
> ### - List를 업그레이드 시킨 버전(O(n) -> O(logn) 개선)
> ### - empty(0), root와 트리의 집합으로 구성
> ### - 성능과 직결되는 부분은 트리의 높이 -> 성능 개선을 하려면 이 높이를 관리 해줘야함 

<br>

### 03-1. Tree(트리) 
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

### 03-2. Binary Tree(이진 트리) 
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
- (1) a[ i ]의 부모 => a[ i/2 ] (i>1)
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
  
<br>
  
- [서로소 집합을 위한 트리 연산]
- <img src="https://github.com/jongheonleee/data_structure/assets/87258372/8351db2f-5c5a-4e31-a700-ecb3aa09554f"  width="500" height="500"/>
- 서로소 집합(Disjoint Set) : 어느 두 집합도 공통된 원소를 갖지 않는 경우
  - A && B = 0

<br>

- 서로소 집합들을 메모리에 저장하기 위해선 1차원 배열을 사용
  - 집합들의 모든 원소를 0, 1, 2, .. n-1로 놓으면 이를 배열의 인덱스로 활용 가능 
- 각 집합은 루트가 대표, 루트의 배열 원소에는 루트 자신이 저장되며, 루트가 아닌 노드의 원소에는 부모가 저장됨 

<br>

- 지원하는 연산은 두 가지
  - union : 2개의 집합을 하나의 집합으로 만드는 연산  
  - find : 인자로 주어지는 x가 속학 집합의 대표 노드, 즉, 루트를 찾는 연산 
  - 위의 연산을 효율적으로 처리 -
    - union -> rank에 기반하여 rank가 높은 루트가 union 후에도 승자(합쳐진 트리의 루트)가 되도록 함
    - [rank 기반 union]
    - <img src="https://github.com/jongheonleee/data_structure/assets/87258372/9f0539b5-54ff-483f-a630-e7b7622a1bc5"  width="500" height="500"/>
    - <img src="https://github.com/jongheonleee/data_structure/assets/87258372/cd81c6ff-4ea6-4cd5-86df-b53c071c753a"  width="500" height="500"/>

    <br>
    
    - find -> 루트까지 올라가는 경로상의 각 노드의 부모를 루트로 갱신(경로 압축) 
    - [find의 경로압축]
    - <img src="https://github.com/jongheonleee/data_structure/assets/87258372/4fbcda6a-f90f-45e2-b253-6de1fee250e6"  width="500" height="500"/>


<br>
<br>

### 03-3. 이진 탐색 트리(BST) : 크고 작음으로 분리함(left < x < right), 이진탐색(O(logn))

- [이진탐색트리 형태]
- <img src="https://github.com/jongheonleee/data_structure/assets/87258372/437f66c6-d4dc-43c1-b35d-c8304285920b"  width="500" height="500"/>
- 이진 탐색 O(logn)이 핵심
- BST는 이진 탐색을 수행하기 위해 링크드 리스트를 변형한 구조 


- [이진탐색트리 특징1]
- <img src="https://github.com/jongheonleee/data_structure/assets/87258372/53ccea28-5f17-4f5a-9300-56d07d669104"  width="500" height="500"/>
- '정렬'과 '범위탐색'에 유리함 

<br>

- BST의 주요 연산은 크게 5가지가 있음 
  - (1) 탐색 연산 -> O(logn)
  - [탐색 연산 과정]
    - <img src="https://github.com/jongheonleee/data_structure/assets/87258372/e34d1598-e2f1-4312-b5dd-f533a8df8ff5"  width="500" height="500"/>
    - 탐색 연산 -> O(logn), 실질적으로 트리의 높이와 성능이 직결되기 때문에 balance를 맞추는 것이 중요함
    - 루트 -> target 
    - BST의 각 노드들은 <Key extends Comparable<Key>, Value> 로 지네릭 제한을 걸어줘야함
    - 내부적으로 크고 작음을 비교하여 저장하기 때문 left < x < right
  
  <br>

  - (2) 삽입 연산 -> O(logn)
  - [삽입 연산 과정]
    - <img src="https://github.com/jongheonleee/data_structure/assets/87258372/e859b50b-5a63-4848-a829-a9154ebd3600"  width="500" height="500"/>
    - <img src="https://github.com/jongheonleee/data_structure/assets/87258372/abd3cf2f-3fa7-4fcb-bc34-77dca0df880e"  width="500" height="500"/>
    - 내부적으로 탐색을 통해 올바른 위치를 찾아가기 때문에 O(logn)
    - put()의 경우, 현재 데이터를 올바른 위치에 넣어준 뒤 루트를 다시 가리키도록 하고 수행 종료
      - (1) 탐색으로 위치 찾기
      - (2) 노드 생성 및 링크 연결
      - (3) root 로 이동 및 반환 
  

  <br>

  - (3) 삭제 연산 -> O(logn)
  - [삭제 연산 경우]
    - <img src="https://github.com/jongheonleee/data_structure/assets/87258372/67f65bf6-4b64-4e67-8ac5-d2e8f0ff1344"  width="500" height="500"/>
    - (1) 삭제되는 노드의 자식 0 -> null 처리
    - (2) 삭제되는 노드의 자식 1 -> x 부모 <-> x 자식, 직접 연결 
    - (3) 삭제되는 노드의 자식 2 -> 자리 이동
        -> left의 Max를 x로 이동
        -> right의 Min을 x로 이동 
    - 최악의 경우를 고려해보면, 계속 링크를 재연결하면서 올라오는 경우가 생김. 또한 타겟을 찾기 위해서 탐색하는 과정을 거쳐야 하기 때문에 O(logn)
    

  <br>

  - (4) 최대값/최소값 찾기
    - [최대값/최소값 연산 과정]
      - <img src="https://github.com/jongheonleee/data_structure/assets/87258372/977c7dd4-ae5e-4730-8e81-c57e606b80b4"  width="500" height="500"/>
  
<br>
<br>

### 03-4. AVL 트리 : 트리의 핵심은 Balance, 내부적으로 Balance를 맞추는 BST, 모든 연산 => O(logn) (height = logn)

- AVL 트리 : Balance를 유지하는 BST, 트리의 높이를 최소화하려고 함 
  - 트리의 연산 성능은 해당 트리의 높이와 직결됨
  - 따라서, 편향 이진 트리를 방지하고 최대한 양쪽 밸런스를 잡는 것이 중요함 
  - 즉, 연산(삽입/삭제) 로 인행 밸런스가 깨지면 이를 내부적으로 잡아줌

<br>

- n개의 노드를 가진 AVL 트리의 높이는 O(logn) 임

<br>

- AVL의 핵심 기능 Rotate(회전 연산)
  - [rotateRight]
  - <img src="https://github.com/jongheonleee/data_structure/assets/87258372/4c1f4fd4-b871-4ef8-b659-53883b17c279"  width="500" height="500"/>
  
  <br>

  - [rotateLeft]
  - <img src="https://github.com/jongheonleee/data_structure/assets/87258372/9a9597bf-48e7-42df-823f-a6a1226472c8"  width="500" height="500"/>

  <br>

  - [LL-rotate]
  - <img src="https://github.com/jongheonleee/data_structure/assets/87258372/3b633b7c-1cf8-4f40-b916-e02bc4c19c21"  width="500" height="500"/>
  - LL-rotate : rotateRight

  <br>

  - [RR-rotate]
  - <img src="https://github.com/jongheonleee/data_structure/assets/87258372/36360145-2ca6-46bd-9af4-0d94a300ed9e"  width="500" height="500"/>
  - RR-rotate : rotateLeft

  <br>

  - [LR-rotate]
  - <img src="https://github.com/jongheonleee/data_structure/assets/87258372/1539b348-a328-4e46-a1b8-41ca263d5ecb"  width="500" height="500"/>
  - LR-rotate : rotateLeft -> rotateRight 

  <br>

  - [RL-rotate]
  - <img src="https://github.com/jongheonleee/data_structure/assets/87258372/bb6d4837-8793-4a5c-ba6e-6a65324a5249"  width="500" height="500"/>
  - RL-rotate : rotateRight -> rotateLeft 

<br>

- 연산에서 발생되는 rotate
  - [삽입]
  - <img src="https://github.com/jongheonleee/data_structure/assets/87258372/00442ac1-0222-4aba-ba7a-999ce94eff60"  width="500" height="500"/>
  - <img src="https://github.com/jongheonleee/data_structure/assets/87258372/30b455ef-6a73-4c3f-98bf-e803ce8944a0"  width="500" height="500"/>

  - [삭제]
  - <img src="https://github.com/jongheonleee/data_structure/assets/87258372/b6139cb5-340b-466c-a581-15e0feeb654e"  width="500" height="500"/>


<br>
<br>

### 03-5. 2-3 트리 : BST 보다 더 세분화해서 노드를 저장, 2개 영역 -> 3개 영역으로 확장

- 내부 노드의 차수가 2 / 3인 완전 균형 탐색 트리
  - 2-노드 : 차수 = 2
  - 3-노드 : 차수 = 3

<br>

- 2-3 트리는 leaf가 동일한 층에 있어야함 -> 트리가 위로 자라나거나 위에서 낮아짐

<br>


- [2-3 트리]
- <img src="https://github.com/jongheonleee/data_structure/assets/87258372/a89015a7-1fbd-4f66-8e52-f3854e16037d"  width="500" height="500"/>
- <img src="https://github.com/jongheonleee/data_structure/assets/87258372/04e4fd14-1111-4ce1-bbcd-e83ea3a8f08c"  width="500" height="500"/>

<br>

- [탐색 연산]
- <img src="https://github.com/jongheonleee/data_structure/assets/87258372/f4621266-839b-4c27-b2d8-e85beb4b1c22"  width="500" height="500"/>
- 이진 탐색과 같은 형식임, 하지만 3 범위를 확인함
- 예를 들어서, 그림과 같이 80을 50<80 -> 70 < 80 < 90 범위를 찾아나감

<br>

- [삽입 연산]
- <img src="https://github.com/jongheonleee/data_structure/assets/87258372/23c5d034-96d0-4245-9931-ebec1c00c9f8"  width="500" height="500"/>
- <img src="https://github.com/jongheonleee/data_structure/assets/87258372/fd5f36b2-054d-4ceb-9d23-870879c6af68"  width="500" height="500"/>
- 위로 자라난다의 의미가 이 부분
- 삽입 이후에 split 가 발생하여 가운데 노드가 위로 올라감 

<br>

- [이동 연산]
- <img src="https://github.com/jongheonleee/data_structure/assets/87258372/ed4bdb5e-428a-46af-838f-6041ef067e11"  width="500" height="500"/>
- 키가 삭제되어 노드가 empty, 이 노드의 형제 노드와 부모의 도움을 받아 1개의 키를 empty 노드로 이동

<br>

- [통합 연산]
- <img src="https://github.com/jongheonleee/data_structure/assets/87258372/d1b29ed5-c68f-4b83-ab4a-754cd9129591"  width="500" height="500"/>
- 노드가 empty인데 이동 연산이 불가능한 경우 발생
- empty 노드와 그의 형제 노드를 하나의 노드로 통합하고, empty 노드와 그의 형제 노드의 분기점 역할을 하던 부모의 키를 통합된 노드로 끌어내려 저장하는 연산

<br>
<br>

### 03-6. Red-Black Tree : 2-3트리를 색깔로 구분한 것 

<br>

- 노드의 색을 부여하여 balance를 잡음 -> Red, Black
- 모든 연산인 O(logn)을 넘지 않음
  - 웹 브라우저에서 화면 레이아웃 잡을 때 사용

<br>

- 정의
  - (1) 루트와 null -> Black
  - (2) 루트로부터 각 null까지 2개의 연속된 Red link 없음
  - (3) 루트로부터 각 null까지 경로에 있는 Black link 수는 모두 같음
  - (4) Red link 는 왼쪽으로 기울어짐(Red Link 좌편향 규칙)

- [Red-Black 트리 특징]
- <img src="https://github.com/jongheonleee/data_structure/assets/87258372/43a6d394-570c-4f38-9575-cb0d28790d23"  width="500" height="500"/>
- <img src="https://github.com/jongheonleee/data_structure/assets/87258372/0caa8948-8d86-4602-86eb-5a8a68f581fd"  width="500" height="500"/>


<br>

- BST : 작고 큼을 분리 -> left/right
- 2-3 Tree : 세 영역으로 분리 -> left/mid/right
- Red Black Tree : 크고 작음, 세 영역을 분리를 색깔로 구분


<br>

- Red-Black 트리의 기본 연산 크게 3가지
  - (1) rotateLeft : 노드의 오른쪽 Red Link를 왼쪽으로 옮김
  - <img src="https://github.com/jongheonleee/data_structure/assets/87258372/7b008f51-1fdc-4ede-8d08-ef1f3d14b4e8"  width="500" height="500"/>
  
  <br>
  
  - (2) rotateRight : 노드의 왼쪽 Red Link를 오른쪽으로 옮김
  - <img src="https://github.com/jongheonleee/data_structure/assets/87258372/1debfaf6-3c9c-41b9-8139-310d14edf9b4"  width="500" height="500"/>
  
  <br>
    
  - (3) flipColors : 노드의 두 Link의 색이 같을 때, 둘 다 다른 색으로 바꾸는 연산
  - <img src="https://github.com/jongheonleee/data_structure/assets/87258372/cad21f60-f55f-4080-a96c-b6f3e2efdab4"  width="500" height="500"/>
  

<br>

- [삽입 연산]
- <img src="https://github.com/jongheonleee/data_structure/assets/87258372/443e623d-34e0-480d-afcb-c4f999cadc46"  width="500" height="500"/>
- <img src="https://github.com/jongheonleee/data_structure/assets/87258372/77ef7552-7694-498d-8266-b48151543bc1"  width="500" height="500"/>

- [최소값 삭제 연산]
- <img src="https://github.com/jongheonleee/data_structure/assets/87258372/ed7b6dfa-db82-454f-a31d-ff0b5877a8b6"  width="500" height="500"/>
- <img src="https://github.com/jongheonleee/data_structure/assets/87258372/a8d3341c-8b0f-41d2-be25-9678e091a6e9"  width="500" height="500"/>
- <img src="https://github.com/jongheonleee/data_structure/assets/87258372/fa19b5ef-53e6-4ad7-bff6-5b3fe81983cf"  width="500" height="500"/>
- <img src="https://github.com/jongheonleee/data_structure/assets/87258372/3a4f8e83-147a-4b56-962b-8e7ba0dcebee"  width="500" height="500"/>
- 루트로부터 삭제하는 노드 방향으로 Red Link를 옮김
- 삭제되는 노드를 Red로 만든후 삭제 



<br>
<br>

### 03-7. B-Tree : 다수의 키를 가진 노드로 구성, 다방향 탐색이 가능한 균형 트리

- B-Tree는 대용량의 데이터를 위해 고안됨, 주로 DB의 기본 자료구조로 쓰임
- 노드에 수 많은 키를 저장하여 트리의 높이를 낮춤

<br>

- 정의
  - (1) 모든 Leaf은 동일한 깊이를 가짐
  - (2) 루트가 아닌 각 노드의 자식 수는 -> [M/2] <= k <= M (M은 차수)
  - (3) 루트의 자식 수는 2 이상 

- [B-Tree 특징]
- <img src="https://github.com/jongheonleee/data_structure/assets/87258372/fe3cf0f9-50b2-4ad8-94b1-92f6c8e1b197"  width="500" height="500"/>
- <img src="https://github.com/jongheonleee/data_structure/assets/87258372/3f0211bf-1d9b-4e84-bbb8-936a0353d446"  width="500" height="500"/>
- <img src="https://github.com/jongheonleee/data_structure/assets/87258372/7bea5569-003e-48c1-bcb9-6b1e34bacefb"  width="500" height="500"/>

<br>

- [탐색 연산]
- <img src="https://github.com/jongheonleee/data_structure/assets/87258372/76aa435e-23fc-4f59-be1f-936f929683a1"  width="500" height="500"/>
- 방문한 각 노드에서는 탐색하고자 하는 키와 노드의 키들을 비교, 적절한 서브트리 탐색
- 각 노드에서는 이진 탐색 수행

<br>

- [삽입 연산]
- <img src="https://github.com/jongheonleee/data_structure/assets/87258372/b6de8713-b931-428f-8f6e-e16f2d924c95"  width="500" height="500"/>
- 탐색 과정 거침
- 노드의 키들이 정렬 상태를 유지하도록 삽입
- leaf의 개수 = M-1 
  - M-1개의 키들과 새로운 키 중에서 중간값이 되는 키를 부모로 올림
  - 남은 M-1개의 키들을 반씩 나누어 각각 별도의 노드에 저장(split 연산)

<br>

- [삭제 연산]
- <img src="https://github.com/jongheonleee/data_structure/assets/87258372/bdfa76ee-e563-4bd4-b554-0760e2997b8e"  width="500" height="500"/>
- <img src="https://github.com/jongheonleee/data_structure/assets/87258372/635b7805-406d-4f80-a701-73a0773e1cf3"  width="500" height="500"/>
- <img src="https://github.com/jongheonleee/data_structure/assets/87258372/7bcb8c39-ed44-4d3a-8d99-243f6cdc98ad"  width="500" height="500"/>
- 삭제는 항상 leaf에서 이루어짐
- 삭제할 노드가 leaf가 아님
  - 중위 선행자/중위 후속자를 삭제할 키와 교환
  - leaf에서 삭제 수행
  - 이동 연산 & 통합 연산 수행 


<br>

- B-Tree 확장 버전(개선)
  - (1) B* - Tree 
    - B-Tree, 루트를 제외한 다른 노드의 자식수가 2/3 * M ~ M
      - 각 노드는 적어도 2/3 이상이 키들로 채워져야함
    - B-Tree가 루트가 아닌 노드에 약 1/2 이상이 키들로 채워져야함
    - 즉, B*-Tree는 노드의 공간을 B-Tree 보다 효율적으로 활용함 
  
  <br>
  - (2) B+ - Tree 
    - <img src="https://github.com/jongheonleee/data_structure/assets/87258372/8955c362-9710-4946-859a-cc443f749e83"  width="500" height="500"/>
    - 키들만을 가지고 B -Tree 구성
    - leaf에 키와 관련 정보를 저장함
      - 키들로 구성한 B-Tree는 탐색/삽입/삭제 연산을 위해 관련된 leaf을 빨리 찾을 수 있도록 안내
  
<br>
<br>

> ## 🧑🏻‍🏫 Tree 파트 요약
> ### <img src="https://github.com/jongheonleee/data_structure/assets/87258372/42ca83a7-52da-4299-b4c2-d3e557543568"  width="500" height="500"/>
> ### <img src="https://github.com/jongheonleee/data_structure/assets/87258372/e3de108b-7bc4-4fd2-9df9-75285c91b601"  width="500" height="500"/>
