package behavioral.chain;

/**
 * @author tianbin
 * @date 2023/7/20
 * @Description
 * @since v1.0.0
 */
public class Client {
    public static void main(String[] args) {
        HandlerA handlerA = new HandlerA();
        HandlerB handlerB = new HandlerB();
        HandlerC handlerC = new HandlerC();
        handlerA.setNext(handlerB);
        handlerB.setNext(handlerC);
        Request request = new Request();
        request.setData("请求数据ABCDE");
        handlerA.handle(request);
    }
}
