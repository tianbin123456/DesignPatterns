package behavioral.visitor;

/**
 * @author tianbin
 * @date 2023/7/20
 * @Description
 * @since v1.0.0
 */
public class ElementA implements Element{
    private int stateForA = 0;
    @Override
    public void accept(Visitor v) {
        System.out.println("=== 开始访问元素 A......");
        v.visitA(this);
    }
    public int getAState(){
        return stateForA;
    }
    public void setAState(int value){
        stateForA = value;
    }
}
