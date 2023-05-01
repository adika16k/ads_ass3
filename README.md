# ads_ass3
### MyArrayListStack and MyArrayListQueue

These are Java implementations of the stack and queue using MyArrayList.

Let me show how methods in this implementetions are work.

MyArrayListStack
To create instance of the stack we call constructor
~~~java
MyArrayListStack<Integer> myStack = new MyArrayListStack<Integer>();
~~~

To push item to stack we use push method
~~~java
myStack.push(1)
~~~

To pop an item use method pop()
~~~java
int item = MyStack.pop();
~~~

To peek the item without removing it use method peek()
~~~java
int topItem = MyStack.peek();
~~~

To check if the stack is empty use isEmpty method
~~~java
boolean empty = myStack.isEmpty();
~~~

To get number of items in stack use method size()
~~~java
int numItems = myStack.size();
~~~



MyArrayListQueue
To create instance of the queue we call constructor
~~~java
MyArrayListQueue<Integer> myQueue = new MyArrayListQueue<Integer>();
~~~

To enqueue item to queue we use enqueue method
~~~java
myQueue.enqueue(1)
~~~

To dequeue an item from queue use method dequeue()
~~~java
int item = MyQueue.dequeue();
~~~

To peek the item without removing it use method peek()
~~~java
int frontItem = MyQueue.peek();
~~~

To check if the queue is empty use isEmpty method
~~~java
boolean empty = myQueue.isEmpty();
~~~

To get number of items in queue use method size()
~~~java
int numItems = myQueue.size();
~~~

