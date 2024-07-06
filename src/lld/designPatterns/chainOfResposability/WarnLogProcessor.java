package lld.designPatterns.chainOfResposability;

public class WarnLogProcessor extends LogProcessor{

    public WarnLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }
    public void log(int logLevel, String message){
        if(logLevel==WARN){
            System.out.println(message);
            return;
        }
        super.log(logLevel,message);
    }
}
