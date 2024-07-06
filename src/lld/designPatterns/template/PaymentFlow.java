package lld.designPatterns.template;

public abstract class PaymentFlow {
    public abstract void validateRequest();
    public abstract void calculateFee();
    public abstract void debitAmount();
    public abstract void creditAmount();

    // made final so that no one can change the flow
    public final void sendMoney(){
        validateRequest();
        debitAmount();
        calculateFee();
        creditAmount();
    }
        // child class override it and provide its implementation

}
