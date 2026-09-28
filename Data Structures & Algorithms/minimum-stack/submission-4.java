class MinStack {

    Stack<Long> st;
    long min;

    public MinStack() {
        st = new Stack<>();
        min = Long.MAX_VALUE;
    }

    public void push(int val) {

        if (st.isEmpty()) {
            min = val;
            st.push((long) val);
        } 
        else if (val >= min) {
            st.push((long) val);
        } 
        else {
            // Encode the value
            long encoded = 2L * val - min;
            st.push(encoded);
            min = val;
        }
    }

    public void pop() {

        if (st.isEmpty()) {
            return;
        }

        long x = st.pop();

        // Encoded value
        if (x < min) {
            min = 2L * min - x;
        }

        // Reset min when stack becomes empty
        if (st.isEmpty()) {
            min = Long.MAX_VALUE;
        }
    }

    public int top() {

        if (st.isEmpty()) {
            return -1;
        }

        long x = st.peek();

        // Encoded value means actual value is min
        if (x < min) {
            return (int) min;
        }

        return (int) x;
    }

    public int getMin() {

        if (st.isEmpty()) {
            return -1;
        }

        return (int) min;
    }
}