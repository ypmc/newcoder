package offer;

/**
 * @author kangkang lou
 * <p>
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。
 * <p>
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。
 * <p>
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。
 * <p>
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。
 * <p>
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。
 * <p>
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。
 * <p>
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。
 * <p>
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。
 */

/**
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。
 */

import java.util.Stack;

public class StackMin {
    int min;
    boolean flag = false;
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> s = new Stack<>();

    public void push(int node) {
        if (!flag) {
            min = node;
            flag = true;
        } else {
            if (node < min) {
                min = node;
            }
        }
        stack.push(node);
    }

    public void pop() {
        int temp = stack.pop();
        if (temp == min) {
            flag = false;
            while (!stack.empty()) {
                temp = stack.pop();
                if (!flag) {
                    min = temp;
                    flag = true;
                } else {
                    if (temp < min) {
                        min = temp;
                    }
                }
                s.push(temp);
            }
            while (!s.empty()) {
                stack.push(s.pop());
            }

        }
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return min;
    }
}
