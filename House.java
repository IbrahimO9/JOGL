package first;

import javax.media.opengl.*;
import javax.media.opengl.awt.*;
import com.jogamp.opengl.util.Animator;
import javax.media.opengl.glu.*;
import java.awt.*;
import javax.swing.*;

public class House extends JFrame implements GLEventListener {

	GLCanvas canvas;
	Animator animator;
	float dotX = -200, dotY = 0; // Dot position
	float velocityX = 2, velocityY = 1; // Dot velocity
	int score = 0; // Score

	public House() {
		super("Simple Moving Dot Game");

		canvas = new GLCanvas();
		add(canvas);
		canvas.addGLEventListener(this);
		animator = new Animator(canvas);
		animator.start();

		setSize(600, 400);
		setVisible(true);
		setLocation(200, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void init(GLAutoDrawable drawable) {
		GL2 gl = drawable.getGL().getGL2();
		GLU glu = new GLU();
		gl.glClearColor(0.0f, 0.0f, 0.0f, 0.0f); // Set background to black
		gl.glMatrixMode(GL2.GL_PROJECTION);
		glu.gluOrtho2D(-300, 300, -200, 200); // Set coordinate system
		gl.glMatrixMode(GL2.GL_MODELVIEW);
	}

	@Override
	public void display(GLAutoDrawable drawable) {
		GL2 gl = drawable.getGL().getGL2();
		gl.glClear(GL2.GL_COLOR_BUFFER_BIT); // Clear the screen

		// house frame
		gl.glColor3f(245 / 255.0f, 222 / 255.0f, 179 / 255.0f);
		gl.glLineWidth(3);
		gl.glBegin(GL2.GL_POLYGON);
		gl.glVertex2i(-190, -100);
		gl.glVertex2i(0, -100);
		gl.glVertex2i(0, -70);
		gl.glVertex2i(-30, -70);
		gl.glVertex2i(-30, 70);
		gl.glVertex2i(-110, 100);
		gl.glVertex2i(-190, 70);
		gl.glVertex2i(-190, 40);
		gl.glVertex2i(-210, 65);
		gl.glVertex2i(-230, 40);
		gl.glVertex2i(-230, -70);
		gl.glVertex2i(-250, -70);
		gl.glVertex2i(-250, -100);

		gl.glEnd();

		// door
		gl.glColor3f(139 / 255.0f, 69 / 255.0f, 19 / 255.0f);
		gl.glBegin(GL2.GL_POLYGON);
		gl.glVertex2i(-135, -100);
		gl.glVertex2i(-115, -100);
		gl.glVertex2i(-115, -30);
		gl.glVertex2i(-135, -30);
		gl.glEnd();

		// yellow point
		gl.glColor3f(1, 0.8f, 0);
		gl.glPointSize(30);
		gl.glBegin(GL2.GL_POINTS);
		gl.glVertex2i(-70, 20);
		gl.glEnd();

		gl.glPointSize(6);
		gl.glBegin(GL2.GL_POINTS);
		gl.glVertex2i(-120, -60);
		gl.glEnd();

		// fence
		int counter = 0;
		int x = -300;
		int y = -295;

		gl.glLineWidth(5);
		gl.glColor3f(150 / 255.0f, 100 / 255.0f, 2 / 255.0f);
		gl.glBegin(GL2.GL_LINES);
		gl.glVertex2i(-300, -105);
		gl.glVertex2i(300, -105);
		while (counter <= 60) {

			gl.glVertex2i(x, -110);
			gl.glVertex2i(x, -90);

			gl.glVertex2i(y, -110);
			gl.glVertex2i(y, -88);

			x += 10;
			y += 10;
			counter++;
		}
		gl.glEnd();

		// street
		gl.glBegin(GL2.GL_POLYGON);
		gl.glColor3f(128 / 255.0f, 128 / 255.0f, 128 / 255.0f);

		gl.glVertex2i(-300, -150);
		gl.glVertex2i(300, -150);
		gl.glVertex2i(300, -110);
		gl.glVertex2i(-300, -110);

		gl.glEnd();

		// stipple
		gl.glColor3f(1, 1, 1);
		gl.glEnable(GL2.GL_LINE_STIPPLE);
		gl.glLineStipple(1, (short) 0xFF00);

		gl.glBegin(GL2.GL_LINES);
		gl.glVertex2i(-300, -130);
		gl.glVertex2i(300, -130);
		gl.glEnd();
		gl.glDisable(GL2.GL_LINE_STIPPLE);

	}

	@Override
	public void dispose(GLAutoDrawable drawable) {
	}

	@Override
	public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
	}

	public static void main(String[] args) {
		new House();
	}
}
