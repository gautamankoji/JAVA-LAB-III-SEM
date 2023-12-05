# Case Study on Run-Time Polymorphism and Inheritance in Banking System

## Introduction

In the world of object-oriented programming, the principles of run-time polymorphism and inheritance play a crucial role in enhancing code reusability and maintaining a clear hierarchical structure. In this case study, we will explore how these concepts are implemented in a banking system where different banks offer varying rates of interest.

## Objective

The primary goal is to demonstrate how run-time polymorphism and inheritance facilitate the creation of a flexible and extensible banking system. The example will use a base class, "Bank," and three derived classes, "SBI," "ICICI," and "AXIS," each representing a specific bank.

## Implementation

### Base Class - Bank

The base class "Bank" serves as the blueprint for all types of banks. It contains a method `getRateOfInterest()` that returns the rate of interest as a floating-point value.

```java
class Bank {
    float getRateOfInterest() {
        return 0.0f; // Default implementation
    }
}
```

### Derived Classes - SBI, ICICI, AXIS

Each bank is represented by a class that extends the base class "Bank." The derived classes override the `getRateOfInterest()` method to provide their specific interest rates.

```java
class SBI extends Bank {
    float getRateOfInterest() {
        return 8.4f; // SBI's rate of interest
    }
}

class ICICI extends Bank {
    float getRateOfInterest() {
        return 7.3f; // ICICI's rate of interest
    }
}

class AXIS extends Bank {
    float getRateOfInterest() {
        return 9.7f; // AXIS's rate of interest
    }
}
```

## Run-Time Polymorphism

The concept of run-time polymorphism is exemplified by the ability to use a superclass reference variable to refer to objects of the subclass. For instance, `Bank bankObj = new SBI();` allows flexibility in referring to a specific bank object using a common reference type.

```java
Bank bankObj1 = new SBI();
Bank bankObj2 = new ICICI();
Bank bankObj3 = new AXIS();

float interest1 = bankObj1.getRateOfInterest(); // Calls SBI's overridden method
float interest2 = bankObj2.getRateOfInterest(); // Calls ICICI's overridden method
float interest3 = bankObj3.getRateOfInterest(); // Calls AXIS's overridden method
```

## Conclusion

In conclusion, run-time polymorphism and inheritance are powerful mechanisms that enable the creation of scalable and extensible systems. In the context of a banking system, the use of a base class and derived classes allows for a clear representation of different banks with varying rates of interest. This approach enhances code organization, reusability, and maintainability, showcasing the practical application of these fundamental object-oriented principles.
