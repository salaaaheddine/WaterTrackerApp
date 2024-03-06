# Water Tracker App

## Overview

The Water Tracker App is a user-friendly web application designed to facilitate the monitoring and management of daily water intake. Users can effortlessly record the quantity of water consumed, view their hydration history, and visualize trends over time through interactive graphs. With a clean and intuitive interface, personalized dashboards, and Bootstrap styling ensuring responsiveness across devices, the app offers a seamless experience for tracking hydration habits and promoting healthier lifestyles.

## Table of Content

- ### General Context
- ### Used Technologies
- ### Project Workflow
- ### Project Implementation

## General Context

The Water Tracker App is a digital tool developed to assist individuals in monitoring and maintaining their daily water intake levels. By allowing users to easily log the amount of water consumed throughout the day, the app helps promote hydration awareness and encourages healthier habits. Through features such as personalized dashboards, historical data visualization, and interactive graphs, users can gain insights into their hydration patterns and track progress over time. With its user-friendly interface and cross-device compatibility, the Water Tracker App aims to support individuals in achieving their hydration goals and fostering overall well-being.

## Used Technologies

- ### Front End
  - #### HTML-CSS-JAVASCRIPT
    ![Alt Text](https://github.com/salaaaheddine/WaterTrackerApp/blob/main/readmeimgs/HtmlCssJs.jpeg)
    This project utilizes the following technologies:

    **HTML:** HTML (Hypertext Markup Language) is the standard markup language for creating web pages and web applications.
    **CSS:** CSS (Cascading Style Sheets) is a style sheet language used for describing the presentation of a document written in HTML.
    **JavaScript:** JavaScript is a programming language that enables interactive web pages and dynamic content. It is commonly used for client-side scripting.
    
  - #### BOOTSTRAP
    ![Alt Text](https://github.com/salaaaheddine/WaterTrackerApp/blob/main/readmeimgs/bootstrap.jpg)
    **Bootstrap** is a popular front-end framework for developing responsive and mobile-first websites. It provides pre-designed components and utilities to streamline the development process.
    
- ### Back End
  - #### SpringBoot
    ![Alt Text](https://github.com/salaaaheddine/WaterTrackerApp/blob/48bc19b4bc9d3011d7da71354ff1487de36d412b/readmeimgs/Docker.png)
    Spring Boot is an open-source Java-based framework built on top of the Spring Framework. It simplifies the process of creating stand-alone, production-grade Spring-based applications by providing a pre-configured environment and set of conventions. Spring Boot eliminates the need for manual configuration by auto-configuring many aspects of the application, such as the application server, database connections, and security. It also includes embedded servers like Tomcat, Jetty, or Undertow, making it easy to deploy applications with minimal setup. Spring Boot encourages convention over configuration and promotes best practices for building robust, scalable, and maintainable applications. It's widely used in enterprise environments for developing web applications, microservices, and RESTful APIs.

  - #### Docker
    ![Alt Text](https://github.com/salaaaheddine/WaterTrackerApp/blob/48bc19b4bc9d3011d7da71354ff1487de36d412b/readmeimgs/Docker.png)
    Docker is a platform that allows developers to package, distribute, and run applications within isolated environments called containers. Containers encapsulate everything an application needs to run, including the code, runtime, system tools, libraries, and settings, ensuring consistency and portability across different environments. Docker simplifies the process of building, shipping, and deploying applications by abstracting away the underlying infrastructure and providing a standardized way to manage application dependencies. It enables faster development cycles, improved collaboration between teams, and enhanced scalability and reliability of applications in production environments.

  - #### PostgreSQL
    ![Alt Text](https://github.com/salaaaheddine/WaterTrackerApp/blob/main/readmeimgs/postgres-logo.png)
    PostgreSQL is a powerful open-source relational database management system (RDBMS) known for its reliability, extensibility, and compliance with SQL standards. It offers features such as ACID compliance, multi-version concurrency control (MVCC), and full support for foreign keys, joins, and complex queries. PostgreSQL supports various data types, including primitive types, structured types (arrays, JSON, XML), and user-defined types. It provides advanced features like table inheritance, triggers, and stored procedures, along with support for indexing and full-text search. Additionally, PostgreSQL offers high availability and scalability options through built-in replication, clustering, and partitioning features. It is widely used in enterprise applications, web development, and data analytics due to its robustness, performance, and comprehensive feature set.

## Project Workflow
  - ### Project Setup:
    -Set up your development environment with the necessary tools and IDEs for front-end and back-end development.
    -Initialize a new Spring Boot project using Spring Initializr and configure it with the required dependencies, including web, JPA, and PostgreSQL.
  - ### Front-end Development:
    - Design the user interface (UI) of the water tracker app using HTML, CSS, and Bootstrap.
    - Create responsive layouts and components for recording water intake, displaying water history, and navigating between pages.
    - Implement client-side logic using JavaScript to handle user interactions, validate input, and update the UI dynamically.

  - ### Back-end Development:
    - Define the data model for the water records using JPA entities in Spring Boot.
    - Implement RESTful APIs to handle CRUD operations for managing water records, such as recording water intake and retrieving historical data.
    - Set up controllers to map incoming HTTP requests to appropriate service methods and return JSON responses.
  - ### Database Configuration:
    - Configure PostgreSQL as the database for storing water records.
    - Define database tables, columns, and relationships based on the data model specified in the JPA entities.
    - Establish a connection between the Spring Boot application and the PostgreSQL database using configuration properties.



    


