# Simple Calculator with Java RMI

This is a simple **Java Remote Method Invocation (RMI) Calculator System** that demonstrates how to invoke methods on a remote object. The system allows clients to perform basic arithmetic operations (addition, subtraction, multiplication, and division) by calling methods on a remote server.

## Features
- Remote method invocation using Java RMI
- Four arithmetic operations: addition, subtraction, multiplication, and division
- Server registers the remote object
- Client connects to the server and invokes remote methods

## Technologies Used
- Java
- Java RMI API

## Project Structure
```plaintext
📂 src
 ├── 📂 com/ictec/cal
 │   ├── MyCalcInter.java  # Remote Interface
 │   ├── MyCalculator.java  # Implementation of Remote Object
 ├── 📂 com/ictec/server
 │   ├── MyServer.java  # Server to register remote object
 │   ├── 📂 com/ictec/client
 │   │   ├── MyClient.java  # Client to invoke remote methods
 │── README.md
```



## How It Works
1. **`MyCalcInter.java`** (Interface) defines remote methods.
2. **`MyCalculator.java`** implements the interface and extends `UnicastRemoteObject`.
3. **`MyServer.java`** creates an RMI registry, binds the remote object, and starts the server.
4. **`MyClient.java`** looks up the remote object from the registry and calls the methods.

## Example Output (Client Side)
```plaintext
Summation of two integers: 15
```

---
### 📌 **Contributions**
Contributions are welcome! Feel free to submit issues or pull requests. 😊

