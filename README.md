# Rest_API_Client

**COMPANY:** CODTECH IT SOLUTIONS

**NAME:** HARSHITHA PATI

**INTERN ID:** CT08DM1234

**DOMAIN:** JAVA PROGRAMMING

**DURATION:** 8 WEEKS

**MENTOR:** NEELA SANTOSH

---

**DESCRIPTION:**

During my internship at **Codtech**, I was assigned a project to build a simple **console-based Weather Application** using **Java**. The goal was to develop a Java program that **consumes a public REST API (OpenWeatherMap)**, makes HTTP requests, parses **JSON responses**, and **displays the weather data in a structured format**. The application was intended to be lightweight and accessible, especially for those learning how to integrate APIs in Java.

#

**What the Tool Does:**

The application runs in the terminal and allows the user to input the name of any city. It then fetches and displays the following structured weather information using the OpenWeatherMap REST API:

1. **Temperature** (in Celsius)
2. **Humidity**
3. **Weather Description** (e.g., clear sky, scattered clouds)
4. **Wind Speed**

If the user enters an invalid city name or there’s a network/API issue, the application handles the situation gracefully and informs the user accordingly.

#

**How I Built It:**

I built the application using **Java 17**, the **OpenWeatherMap API**, and the **Gson** library to handle and parse **JSON responses** from the API. The entire application is modular, clean, and designed for maintainability.

The Java program is organized into the following classes:

* **Main.java**: The main entry point; accepts city name input and triggers the data retrieval process.
* **WeatherService.java**: Handles API integration by fetching weather data and converting it into Java objects.
* **HttpClientUtil.java**: Sends HTTP GET requests and manages API communication.
* **WeatherData.java**: A POJO class used to map and structure the JSON response.

The **JSON response** from the OpenWeatherMap API is parsed using Gson, which maps it directly into Java objects, making the output readable and well-structured.

#

**Handling Errors and Edge Cases:**

From the outset, I ensured that the program incorporated proper **error handling** to manage various scenarios:

* Invalid or misspelled city names are caught and handled with user-friendly messages.
* HTTP connection issues or unexpected responses are gracefully managed without crashing the application.
* The program checks for proper API key configuration before making any HTTP requests.

This attention to edge cases ensures that the program is **robust**, **user-friendly**, and **reliable**.

#

**Tools and Environment:**

The application was developed using:

* **Java 17**
* **IntelliJ IDEA** (as the development environment)
* **OpenWeatherMap API** (for weather data)

#

**What I Learned:**

This project helped me gain practical experience in:

* **Consuming REST APIs** in Java
* Handling **HTTP requests** and managing responses
* **Parsing JSON** into Java objects using Gson
* Structuring and organizing Java applications for clarity

Ultimately, the project taught me how to develop a functional Java application that interacts with real-world APIs and presents **structured, meaningful output** to users—an essential skill for many modern software applications.

---

**OUTPUT:**

![Image](https://github.com/user-attachments/assets/49f1f492-ea78-4c02-ac7a-5dc3e2df2558)
