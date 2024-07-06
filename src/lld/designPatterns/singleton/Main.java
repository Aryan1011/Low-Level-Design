package lld.designPatterns.singleton;

public class Main {
    // Eager - make variable static and initialize it and constructor private
    // and one method to return this

    // Lazy - All same just initialize it in getVar Method only be an if check

    // Sychronized - because that if block can fail in case of thread so make method synchronised
    // problem is if 1000 threads then all will lock it and then use, this is very expensive

    // locking **used - dont make method synchronized, use a synchronised block and have 2 checks
    /*if(obj==null){
        synchronized (OBJ.class){
            if(obj==null){
                initialize obj
            }
        }
    }
    return obj; */

    // but there is issue due to Reordering and L1 cache
    // to fix this add volatile keyword to the variable for which you want Singleton
    // volatile has 2 property
    // 1) Read and write from memory  (solves L1 cache)
    // 2) CPU can reorder instruction before it, then it dump in memory then
    // do volatile instruction, then do reordering of after instruction


}
