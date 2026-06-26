public enum PassStatus {
    PASSED("합격"),
    FAILED("불합격");

    private final String label;

    PassStatus(String label){
        this.label = label;
    }

    String getLabel(){
        return label;
    }
}
