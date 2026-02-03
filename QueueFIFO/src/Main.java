void main() {
  Box box = new Box();
  Consumer cons = new Consumer(box);
  Producer prod = new Producer(box);
  prod.start();
  cons.start();
}
