package lld.designPatterns.chainOfResposability;

public class InfoLogProcessor extends LogProcessor{
    public InfoLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }
    public void log(int logLevel, String message){
        if(logLevel==INFO){
            System.out.println(message);
            return;
        }
        super.log(logLevel,message);
    }

}
