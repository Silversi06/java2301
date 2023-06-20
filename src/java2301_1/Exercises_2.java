package java2301_1;
 interface Playable {


    abstract public void play(); // 추상 메소드
    abstract public void pause(); // 추상 메소드
    abstract public void stop(); // 추상 메소드
}

class AudioPlayer implements Playable{
    @Override
    public void play() {
        System.out.println("오디오를 재생합니다");
    }
    @Override
    public void pause() {
        System.out.println("오디오를 잠깐 멈춥니다");
    }
    @Override
    public void stop() {
        System.out.println("오디오를 멈춥니다");
    }
}

class VidioPlayer implements Playable{
    @Override
    public void play() {
        System.out.println("비디오를 재생합니다");
    }

    @Override
    public void pause() {
        System.out.println("비디오를 잠깐 멈춥니다");
    }
    @Override
    public void stop() {
        System.out.println("비디오를 멈춥니다");
    }
}

public class Exercises_2 {
    public static void main(String[] args) {
        
    }
    
}
