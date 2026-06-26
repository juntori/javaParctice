public class Student {
    private final int id;
    private final String name;
    private int score;

    public Student(int id, String name, int score){
        this.id = id;
        this.name = name;
        this.score = score;
    }


    public int getId() {
        return id;
    }

    public String getName(){
        return name;
    }

    public int getScore(){
        return score;
    }

    public void updateScore(int newscore){
        if (newscore < 0 || newscore > 100){
            throw new IllegalArgumentException("점수는 0점 이상 100점이하여야 합니다.");
        }
        this.score = newscore;
    }

    public String getPassStatus(){
        if (score>=60){
            return PassStatus.PASSED.getLabel();
        } else {
            return PassStatus.FAILED.getLabel();
        }
    }

    @Override
    public String toString(){
        return "id : " + id + " / 이름: " + name + " / 점수: " + score + " / " + getPassStatus();
    }
}
