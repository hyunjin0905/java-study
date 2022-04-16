/*
* 클래스란?
* 자바의 클래스틑 개별 객체들의 상태 정보를 저장하기 위한 데이터필드과 개별 객체들의 행위를 나타내는 멤버 메소드로 구성된다
* <접근제어자> class <클래스이름> {
* <필드선언>
* <메소드 선언>
*
* 접근제어자  정의된 클래스를 어디에서 사용 할 수 있는지를 의미하는 접근 또는 사용법위를 지정하는 용도에 쓰인다
* 생략: 접근제어자가 생략되어 정의된 클래스와 같은 패키지에 있는 다른 클래스에서 사용할 수 있따
* 하지만 다른 패키지에 존재하는 클래스에서 사용이 불가능하다
* public: public 정의된 클래스는 어디서나 사용할 수 있다 단 주의할점은 하나의 소스 파일에는 하나의 public 클래스만 존재 할수 있다
* 소스파일의 이름은 그안에 들어있는 public 클래스의 이름과 일치해야한다
* private: 중첩 클래스에서 내부 클래스를 정의 할때에만 사용할수있따
* protected: 중첩 클래스에서 내부 클래스를 정의 할때에만 사용할수 있다
*
*
* */

public class Electronics {
    private int nVoltage = 0;
    public void turnOn(int nInputVoltage){
        nVoltage = nInputVoltage;
    }
    public void turnOff() {
        nVoltage = 0;
    }
    public int getVoltage () {
        return nVoltage;
    }
}
