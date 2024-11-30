# Simple House with OpenGL

This project demonstrates a simple graphical application using Java and OpenGL. It features a 2D scene of a house with additional elements like a fence and a street, implemented using the JOGL (Java OpenGL) library.

## Features

- **2D Graphics:** Displays a 2D house with detailed components like a door, fence, and street.
- **Animation:** A moving dot that demonstrates basic animation.
- **Interactive Window:** Built with Swing for window management and rendering with JOGL.
- **Custom Coordinate System:** Uses an orthogonal projection for rendering.

## Prerequisites

To run this project, ensure you have the following installed:

- **Java Development Kit (JDK)** (version 8 or higher)
- **JOGL Library** (Java Binding for OpenGL)

## Getting Started

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/house-game-opengl.git

Set up JOGL in your IDE or build environment:

Add the JOGL .jar files to your project's classpath.
Configure the native library path for JOGL.

Compile and run the project:
javac -cp jogl-all.jar;. House.java
java -cp jogl-all.jar;. House


How It Works
Initialization
The GLCanvas is added to a JFrame for rendering.
A coordinate system is set up using gluOrtho2D.
Rendering
The display method is called repeatedly by an Animator to redraw the scene.
OpenGL functions (glBegin, glVertex2i, glEnd) are used to create geometric shapes for the house, fence, street, and moving dot.
Animation
The moving dot's position is updated frame by frame.
Project Structure
House.java: Main file containing the entire application logic.
Dependencies: JOGL library files required for OpenGL rendering.

Screenshots
Here’s a preview of the Simple House with OpenGL:
![Simple House Screenshot](example.png)
