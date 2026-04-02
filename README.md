# Train Consist Management App

A comprehensive Java learning project demonstrating Java Collections Framework (JCF) through a train consist management system. This application showcases various collection types and their use cases through seven progressive use cases.

## Project Overview

The Train Consist Management App is an educational project that teaches students fundamental Java concepts including classes, the main method, static keywords, and most importantly, the Java Collections Framework. The app simulates a train management system where bogies (train coaches) are managed dynamically using different collection types.

## Use Case Highlights

### UC1: Initialize Train and Display Consist Summary

- **Concept**: ArrayList & List Interface
- **Highlights**:
  - Entry point of the application
  - Initializes an empty ArrayList to store bogies
  - Displays welcome banner and initial train status
  - Demonstrates application startup flow

### UC2: Add Passenger Bogies to Train

- **Concept**: ArrayList add() and remove() operations
- **Highlights**:
  - Add multiple bogie types (Sleeper, AC Chair, First Class)
  - Remove bogies from the consist
  - Display updated bogie list after modifications
  - Demonstrates dynamic collection manipulation

### UC3: Track Unique Bogie IDs

- **Concept**: HashSet for duplicate elimination
- **Highlights**:
  - Store unique bogie IDs using HashSet
  - Automatically removes duplicate insertions
  - Display unique bogie set
  - Demonstrates unordered unique collection storage

### UC4: Maintain Ordered Bogie Consist

- **Concept**: LinkedList for ordered operations
- **Highlights**:
  - Maintain train consist in specific order (Engine, Sleeper, AC, Cargo, Guard)
  - LinkedList for efficient insertion/deletion at both ends
  - Display ordered consist
  - Demonstrates sequential collection storage

### UC5: Preserve Insertion Order of Bogies

- **Concept**: LinkedHashSet for ordered uniqueness
- **Highlights**:
  - Preserve insertion order while maintaining uniqueness
  - Use LinkedHashSet to combine Set and order features
  - Handle duplicate insertions gracefully
  - Demonstrates insertion-order-preserving collection

### UC6: Map Bogie to Capacity

- **Concept**: HashMap for key-value pair storage
- **Highlights**:
  - Map bogie types to their passenger capacities
  - Store associations like "Sleeper -> 72 passengers"
  - Display bogie-capacity mappings
  - Demonstrates key-value map usage

### UC7: Sort Bogies by Capacity

- **Concept**: Comparator and custom object sorting
- **Highlights**:
  - Create custom Bogie class with name and capacity attributes
  - Sort bogies by capacity using Comparator
  - Display sorted results
  - Demonstrates custom object sorting and comparison

## Key Concepts Covered

- **Java Collections Framework (JCF)**: ArrayList, HashSet, LinkedList, LinkedHashSet, HashMap
- **List Interface**: Multiple implementations (ArrayList, LinkedList)
- **Set Interface**: Unique storage with various orderings
- **Map Interface**: Key-value pair storage and retrieval
- **Custom Comparator**: Sorting custom objects
- **Main Method**: Program entry point with static context
- **Console I/O**: System.out.println() for output

## How to Run

### Compile

```bash
javac UC1.java
javac UC2.java
# ... compile other UC files as needed
```

### Execute

```bash
java UC1
java UC2
# ... run other UC files as needed
```

## Author

**Name**: Yatin Annam<br>
**Registration Number**: RA2411030010101
