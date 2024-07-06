package lld.designPatterns.chainOfResposability;

public class DebugLogProcessor extends LogProcessor{
    public DebugLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }
    public void log(int logLevel,String message){
        if(logLevel==DEBUG){
            System.out.println(message);
            return;
        }
        super.log(logLevel,message);
    }
}
