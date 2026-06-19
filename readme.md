Below is a complete, structured report


# 📄 PART C: COMPARISON & ANALYSIS REPORT

## Client–Server Systems: Raw TCP Sockets vs gRPC RPC

---

# 12. System Architecture

## 12.1 Raw TCP Socket Architecture (Part A)

The raw socket implementation follows a traditional **client-server model** using Java TCP sockets.

### Architecture Diagram

```
+-------------------+          TCP Socket          +-------------------+
|   TCP Client      |  <----------------------->   |   TCP Server      |
|                   |                              |                   |
| - User input      |                              | - SocketServer    |
| - Message build   |                              | - Request parser  |
| - Send request    |                              | - Business logic  |
| - Receive reply   |                              | - Response build  |
+-------------------+                              +-------------------+
```

### Key Characteristics

* Direct use of `Socket` and `ServerSocket`
* Manual message formatting (strings / delimiters)
* Blocking communication
* One request → one response model

---

## 12.2 gRPC Architecture (Part B)

The gRPC system introduces a **modern RPC-based architecture** using Protocol Buffers.

### Architecture Diagram

```
+--------------------+        gRPC HTTP/2        +----------------------+
|   gRPC Client      | <-----------------------> |   gRPC Server        |
|                    |                           |                      |
| - Stub calls       |                           | - Service Impl      |
| - Generated code   |                           | - Auto-generated API|
| - Typed messages   |                           | - Proto handlers    |
+--------------------+                           +----------------------+
```

### Key Characteristics

* Uses `.proto` contract definition
* Auto-generated client/server stubs
* Strong typing (Protocol Buffers)
* HTTP/2 based communication
* Built-in error handling

---

# 13. Protocol Design (Raw TCP – Part A)

## 13.1 Message Format

The custom protocol used plain text messages over TCP.

### Request Format

```
OPERATION|operand1|operand2
```

### Examples

```
ADD|10|5
SUB|20|8
MUL|6|7
DIV|10|2
REVERSE|hello
UPPER|world
```

---

## 13.2 Response Format

```
RESULT|value
ERROR|message
```

### Examples

```
RESULT|15
RESULT|hello
ERROR|Division by zero
```

---

## 13.3 Sequence Diagram

```
Client                         Server
  |                              |
  |--- "ADD|10|5" -------------> |
  |                              |
  |        parse request         |
  |        compute result        |
  |                              |
  |<-------- "RESULT|15" ------- |
  |                              |
```

---

## 13.4 Limitations of Custom Protocol

* No schema validation
* String parsing errors possible
* No type safety
* Manual serialization/deserialization
* Hard to extend safely

---

# 14. Implementation Challenges

## 14.1 Raw TCP Implementation Challenges

### 1. Manual Protocol Design

Designing message formats required careful delimiter selection (`|`), which risked parsing errors.

### 2. Data Parsing Complexity

All values arrived as strings and needed manual conversion:

* Integer parsing
* Error handling for invalid input

### 3. No Built-in Error Handling

Errors had to be manually encoded:

```
ERROR|Division by zero
```

### 4. Connection Management

* Managing socket lifecycle manually
* Ensuring streams were closed properly

---

## 14.2 gRPC Implementation Challenges

### 1. Dependency Configuration

Initial issues included:

* Missing `TaskServiceGrpc`
* Maven protobuf plugin misconfiguration
* Generated source path issues

### 2. Code Generation Understanding

Understanding:

* `.proto → Java stubs`
* `BlockingStub vs AsyncStub`

### 3. Windows File Lock Issue

Temporary protobuf directory cleanup failures:

* `protoc-dependencies` lock issue
* Required build workaround (`clearOutputDirectory=false`)

### 4. Learning Curve

gRPC required understanding:

* Service definitions
* RPC lifecycle
* Status exceptions

---

# 15. Conceptual Comparison

## 15.1 Ease of Development

| Feature     | Raw TCP | gRPC                  |
| ----------- | ------- | --------------------- |
| Setup       | Simple  | Complex initial setup |
| Code length | High    | Low (auto-generated)  |
| Debugging   | Hard    | Easier                |
| Scalability | Low     | High                  |

---

## 15.2 Abstraction Level

### Raw TCP

* Low-level communication
* Developer manages:

  * message format
  * parsing
  * errors
  * connection handling

### gRPC

* High-level abstraction
* Developer only defines:

  * service (.proto)
  * methods
* Everything else is auto-generated

---

## 15.3 Performance

### Raw TCP

* Slightly faster for very simple systems
* No serialization overhead (manual strings)

### gRPC

* Very efficient due to:

  * Protocol Buffers (binary serialization)
  * HTTP/2 multiplexing
* Better for scalable systems

---

## 15.4 Fault Tolerance

### Raw TCP

* Minimal error handling
* Manual retry logic required

### gRPC

* Built-in:

  * Status codes
  * Exception propagation
  * Deadline support

Example:

```
INVALID_ARGUMENT: Division by zero
```

---

## 15.5 Extensibility

| Feature                | Raw TCP | gRPC                   |
| ---------------------- | ------- | ---------------------- |
| Adding new methods     | Hard    | Easy                   |
| Backward compatibility | Weak    | Strong                 |
| Contract enforcement   | None    | Strong (.proto schema) |

---

## 15.6 Summary Insight

* Raw TCP gives **full control but high complexity**
* gRPC gives **structured communication with minimal effort**

---

# 16. Contributions

(You can modify names as needed)

## Member 1: [Name]

* Designed and implemented raw TCP socket server
* Implemented protocol parsing logic
* Handled request-response communication

## Member 2: [Name]

* Developed TCP client
* Implemented message formatting protocol
* Tested end-to-end socket communication

## Member 3: [Name]

* Designed gRPC `.proto` file
* Configured Maven + protobuf plugin
* Implemented service logic and generated stubs

## Member 4: [Name]

* Built interactive gRPC client
* Implemented CLI input handling
* Performed integration testing and debugging

---

# 📌 Final Notes (important for marks)

To make this a **full 6-page submission**, you can easily expand by adding:

* More diagrams (sequence diagrams per operation)
* Screenshots of:

  * TCP output
  * gRPC output
* Code snippets (server/client highlights)
* Short explanation paragraphs under each section

---

If you want, I can next:
✅ Convert this into a **proper Word document layout (with headings, spacing, page breaks)**
✅ Add **UML diagrams as images (ready to paste)**
✅ Or help you write **Part A TCP report to match this style exactly**
