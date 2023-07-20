package behavioral.chain;

/**
 * @author tianbin
 * @date 2023/7/20
 * @Description
 * @since v1.0.0
 */
public class HandlerA implements Handler {
    private Handler nextHandler;

    @Override
    public void setNext(Handler next) {
        this.nextHandler = next;
    }

    @Override
    public void handle(Request request) {
        System.out.println("HandlerA 执行 代码逻辑，处理：" + request.getData());
        request.setData(request.getData().replace("AB", ""));
        if (null != nextHandler) {
            nextHandler.handle(request);
        } else {
            System.out.println("执行中止！");
        }
    }
}
