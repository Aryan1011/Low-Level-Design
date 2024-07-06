package lld.designPatterns.chainOfResposability;

public class Main {
    public static void main(String[] args) {
        LogProcessor logProcessor = new WarnLogProcessor(new InfoLogProcessor(new DebugLogProcessor(null)));
        logProcessor.log(LogProcessor.DEBUG,"This is debug");
        logProcessor.log(LogProcessor.WARN,"This is warn");
        logProcessor.log(LogProcessor.INFO,"This is info");
    }
}
