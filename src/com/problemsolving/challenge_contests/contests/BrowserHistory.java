package com.problemsolving.challenge_contests.contests;

import java.util.Stack;

class BrowserHistory {

    Stack<String> fstack;
    Stack<String> bstack;
    public BrowserHistory(String homepage) {
        fstack = new Stack<>();
        bstack = new Stack<>();
        bstack.push(homepage);
    }

    public void visit(String url) {
        bstack.push(url);
        fstack = new Stack<>();
    }

    public String back(int steps) {
        while(!bstack.isEmpty() && steps>0){
            String elem = bstack.pop();
            fstack.push(elem);
            --steps;
        }
        return bstack.peek();
    }

    public String forward(int steps) {
        while (!fstack.isEmpty() && steps > 0) {
            String elem = fstack.pop();
            bstack.push(elem);
            --steps;
        }
        if (fstack.isEmpty()) {
            return bstack.peek();
        } else {
            return fstack.peek();
        }
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */