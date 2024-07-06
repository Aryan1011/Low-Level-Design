package lld.designPatterns.chainOfResposability;

public abstract class LogProcessor {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int WARN = 3;

    LogProcessor nextLogProcessor;

    protected LogProcessor(LogProcessor nextLogProcessor) {
        this.nextLogProcessor = nextLogProcessor;
    }
    public void log(int logLevel, String message){
        if(nextLogProcessor!=null){
            nextLogProcessor.log(logLevel,message);
        }
    }
}
