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

bash
Copy code
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
Future Enhancements
Add user interaction to control the animation.
Improve graphical details with textures or additional shapes.
Incorporate a scoring mechanism for the moving dot.
Screenshots
Here’s a preview of the Simple House with OpenGL:



License
This project is licensed under the MIT License. See LICENSE for more details.

markdown
Copy code

### What to Do Next:
1. Save this as your `README.md` file in your repository.
2. Make sure the `example.png` image is in the same folder as your `README.md` file, or update the path in the `![Simple House Screenshot](example.png)` line to match the actual location of the image.
3. Commit and push the changes to your GitHub repository.
