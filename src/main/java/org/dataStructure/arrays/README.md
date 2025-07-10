## 📝 All About Arrays

### 1. What is an Array?
* It's a fundamental data structure that holds a collection of **elements of the same type**.
* Each element has a unique **index**, which allows for fast, direct access to data.

### 2. Characteristics of Arrays
* **Indexing**: Each element has a unique index starting from `0`. The last element's index is `array size - 1`.
* **Memory Storage**: Data is stored **contiguously** in memory (one after another).
* **Fixed Size**: Once an array is created, its size cannot be changed. To add more elements than its capacity, you must create a new, larger array and copy the old elements over.

---

### 3. How to Use Arrays in Java

#### Declaration
This creates a reference variable that will point to an array.
```java
// dataType[] arrayName;
int[] myArray;
```

#### Initialization
This allocates actual memory for the array using the `new` keyword.
```
// arrayName = new dataType[size];
myArray = new int[4]; // Allocates space for 4 integer values.
```
* If not explicitly initialized, elements are set to a default value (e.g., `0` for numbers, `null` for objects).

#### Declaration and Initialization in One Step
```
int[] myArray = new int[4];
```

#### Adding & Updating Elements
Use the index to assign or change a value at a specific position.
```
myArray[0] = 10;
myArray[1] = 20;
myArray[1] = 99; // Updates the value at index 1 to 99.
```
> ⚠️ **Warning:** Accessing an index outside the array's bounds (e.g., `myArray[4]` in this case) will cause an `ArrayIndexOutOfBoundsException`.

#### Array Literals
This is the simplest way to initialize an array when you already know the values.
```
int[] myArray = {10, 20, 30, 40};
```



