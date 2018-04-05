# 1. JDK源码
> **src**:   the source array. 


> **startPos**: starting position in the source array.


>	**dest**: the destination array. 

> **destPos**: starting position in the destination data.

> **length**: the number of array elements to be copied.


# 2. 解释
> 新数组 = des到destPos为止 + src从startPos开始（插入length个）+des剩下的。

```
Byte[] src = { 1, 2, 3, 4, 5, 6, 7 };
System.arraycopy(src, 1, src, 2, 4);
for (int i = 0; i < src.length; i++) {
  System.out.print("-> " + src[i]);// 输出-> 1-> 2-> 2-> 3-> 4-> 5-> 7
}
```
> 对于常用的插入方法中：插入后变为1 2 3 3 4 5 6 7，然后将第二个3替换为element。

```
public void add(int index, E element) {
  rangeCheckForAdd(index);

  ensureCapacityInternal(size + 1);  // Increments modCount!!
  System.arraycopy(elementData, index, elementData, index + 1, size - index);
  elementData[index] = element;
  size++;
}
```
