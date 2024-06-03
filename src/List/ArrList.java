package List;


import java.util.NoSuchElementException;

/*
 배열로 리스트 구현

 기본 연산자 정의 - 조회, 삽입, 삭제

 01. 조회 peek(int k)
    - 인덱스가 k인 원소를 조회

 02. 삽입 insert(int k, E val)
    - 인덱스 k에 val 값 삽입

 03. 삭제 delete(int k)
    - 인덱스가 k인 값 삭제

 04. 리사이징(더블링) resize()
    - 기존의 사이즈 * 2 만큼 늘림


 */
public class ArrList<E> {

    private E[] a; // 저장 공간
    private int size; // 저장 공간의 크기

    public ArrList() { // 초기 상태
        a = (E[]) new Object[1];
        size = 0;
    }

    public E peek(int k) { // k번째 값 조회
        if ( size == 0) {
            throw new NoSuchElementException();
        }

        return a[k];
    }

    public void insert(int k, E e) { // k번째에 값 삽입
        if (size == a.length) { // 사이즈가 현재 배열의 크기와 같은 경우, 공간 확보
            resize(2*a.length);
        }

        for (int i=size-1; i>=k; i--) a[i+1] = a[i]; // k부터 쉬프팅

        a[k] = e; // 삽입
        size++; // 사이즈업
    }

    public void insertLast(E e) { // 마지막에 값 삽입
        if (size == a.length) { // 사이즈가 현재 배열의 크기와 같은 경우, 공간 확보
            resize(2*a.length);
        }

        a[size++] = e; // 삽입 및 사이즈업
    }

    public E delete(int k) { // k번째 값 삭제
        if (size == 0) { // 아무 값도 없는 경우, 예외 발생
            throw new NoSuchElementException();
        }

        E target = a[k]; // k번째 값 저장
        for (int i=k; i<size; i++) a[i] = a[i+1]; // 앞으로 한칸씩 쉬프팅
        size--; // 사이즈 다운

        if (size > 0 && size == a.length/4) resize(a.length/2); // 현재 배열의 1/4만 있는 경우, 공간 축소

        return target; //
    }

    private void resize(int newSize) { // 공간 newSize만큼 확보
        E[] tmp = (E[]) new Object[newSize]; // newSize 크기의 배열 선언

        for (int i=0; i<size; i++) tmp[i] = a[i];  // 기존의 값들 복사

        a = tmp; // a에 새로운 배열 할당
    }

}
