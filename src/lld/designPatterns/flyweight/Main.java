package lld.designPatterns.flyweight;

public class Main {
    // Design word processor(text editor)  or a game
    // when we need to reduce memory Hint = memory is limited
    // it reduce by sharing data among multiple objects
    // Suppose you have a Robot object which has a Sprite(some very large image object)
    // Now if you make 10 lakh object then in constructor you pass it and
    // 10 lakh * Sprite size = is very large

    // Extrinsic data - That cant be shared b/w objects ( position )
    // intrinsic - that can be shared (like behaviour)
    public static void main(String[] args) {
    // Remove all extrinsic data and keep intrinsic (make it flyweight class)
        // make class immutable
        // Extrinsic data is passed to flyweight class in its method parameter
        // once FW object is created, it is cached and reused whenever required
    }
}
