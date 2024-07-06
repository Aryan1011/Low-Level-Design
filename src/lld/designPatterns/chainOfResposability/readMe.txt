ATM/Vending machine
Design Logger (Amazon)

when a sender sends request and doesnt care who will fill it
Receiver 1 will check if it can full fill or not else forwarded
similarly receiver 2 will check
So they will keep on forwarding it

Suppose you request withdraw 2000
and there are 100 rs handler, 2000 rs handler, 500 rs handler

Client has a handler (abstract) which has handleRequestMethod()
and it is implemented by concreteHandler1 2 and so on
It will keep on iterating the handlers

In logger you have levels like info, warn, debug
