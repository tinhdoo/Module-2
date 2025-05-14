public class StopWatch {
    private long startTime;
    private long endTime;

    // Constructor không tham số
    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    // Bắt đầu lại đồng hồ
    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    // Dừng đồng hồ
    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    // Lấy thời gian bắt đầu
    public long getStartTime() {
        return startTime;
    }

    // Lấy thời gian kết thúc
    public long getEndTime() {
        return endTime;
    }

    // Tính thời gian đã trôi qua
    public long getElapsedTime() {
        return endTime - startTime;
    }
}
