package org.yourorghere;

import javax.media.opengl.GL;

public class Lineas {

    GL gl;
    float x, y, z;
    float w, h;
    float ax, ay, az;
    float r, g, b;
    

    public Lineas(GL gl, float x, float y, float z, float w, float h, float ax, float ay, float az, float r, float g, float b) {
        this.gl = gl;
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
        this.h = h;
        this.ax = ax;
        this.ay = ay;
        this.az = az;
        this.r = r;
        this.g = g;
        this.b = b;
        
    }

    public void dibujarcuadradolineas() {

        gl.glPushMatrix();

        gl.glTranslated(this.x, this.y, this.z);
        gl.glRotatef(ax, 1, 0, 0);
        gl.glRotatef(ay, 0, 1, 0);
        gl.glRotatef(az, 0, 0, 1);
        gl.glScaled(w, h, 0);

        gl.glBegin(gl.GL_LINES);
        gl.glColor3f(r, g, b);
        gl.glVertex2d(1, 1);
        gl.glVertex2d(1, -1);
        gl.glVertex2d(1, -1);
        gl.glVertex2d(-1, -1);
        gl.glVertex2d(-1, -1);
        gl.glVertex2d(-1, 1);
        gl.glVertex2d(-1, 1);
        gl.glVertex2d(1, 1);
        gl.glEnd();
        gl.glPopMatrix();

    }

    public void dibujarpentagono() {

        gl.glPushMatrix();

        gl.glTranslated(this.x, this.y, this.z);
        gl.glRotatef(ax, 1, 0, 0);
        gl.glRotatef(ay, 0, 1, 0);
        gl.glRotatef(az, 0, 0, 1);
        gl.glScaled(w, h, 0);

        gl.glBegin(gl.GL_POLYGON);
        gl.glColor3f(r, g, b);
        gl.glVertex2d(0, 1);
        gl.glVertex2d(1, 0.5f);
        gl.glVertex2d(1, -0.5f);
        gl.glVertex2d(0, -1);
        gl.glVertex2d(-1, -0.5f);
        gl.glVertex2d(-1, 0.5f);
        gl.glVertex2d(0, 1);
        gl.glEnd();
        gl.glPopMatrix();
    }

    public void dibujarmalla() {

        gl.glPushMatrix();

        gl.glTranslated(this.x, this.y, this.z);
        gl.glRotatef(ax, 1, 0, 0);
        gl.glRotatef(ay, 0, 1, 0);
        gl.glRotatef(az, 0, 0, 1);
        gl.glScaled(w, h, 0);

        gl.glBegin(gl.GL_LINES);
        gl.glColor3f(r, g, b);
        gl.glVertex2d(0, 10);
        gl.glVertex2d(0, -10);
        gl.glVertex2d(1, 10);
        gl.glVertex2d(1, -10);
        gl.glVertex2d(2, 10);
        gl.glVertex2d(2, -10);
        gl.glVertex2d(3, 10);
        gl.glVertex2d(3, -10);
        gl.glVertex2d(4, 10);
        gl.glVertex2d(4, -10);
        gl.glVertex2d(5, 10);
        gl.glVertex2d(5, -10);
        gl.glVertex2d(6, 10);
        gl.glVertex2d(6, -10);
        gl.glVertex2d(7, 10);
        gl.glVertex2d(7, -10);
        gl.glVertex2d(8, 10);
        gl.glVertex2d(8, -10);
        gl.glVertex2d(9, 10);
        gl.glVertex2d(9, -10);
        gl.glVertex2d(10, 10);
        gl.glVertex2d(10, -10);

        gl.glVertex2d(-1, 10);
        gl.glVertex2d(-1, -10);
        gl.glVertex2d(-2, 10);
        gl.glVertex2d(-2, -10);
        gl.glVertex2d(-3, 10);
        gl.glVertex2d(-3, -10);
        gl.glVertex2d(-4, 10);
        gl.glVertex2d(-4, -10);
        gl.glVertex2d(-5, 10);
        gl.glVertex2d(-5, -10);
        gl.glVertex2d(-6, 10);
        gl.glVertex2d(-6, -10);
        gl.glVertex2d(-7, 10);
        gl.glVertex2d(-7, -10);
        gl.glVertex2d(-8, 10);
        gl.glVertex2d(-8, -10);
        gl.glVertex2d(-9, 10);
        gl.glVertex2d(-9, -10);
        gl.glVertex2d(-10, 10);
        gl.glVertex2d(-10, -10);

        gl.glVertex2d(-10, 0);
        gl.glVertex2d(10, 0);
        gl.glVertex2d(-10, 1);
        gl.glVertex2d(10, 1);
        gl.glVertex2d(-10, 2);
        gl.glVertex2d(10, 2);
        gl.glVertex2d(-10, 3);
        gl.glVertex2d(10, 3);
        gl.glVertex2d(-10, 4);
        gl.glVertex2d(10, 4);
        gl.glVertex2d(-10, 5);
        gl.glVertex2d(10, 5);
        gl.glVertex2d(-10, 6);
        gl.glVertex2d(10, 6);
        gl.glVertex2d(-10, 7);
        gl.glVertex2d(10, 7);
        gl.glVertex2d(-10, 8);
        gl.glVertex2d(10, 8);
        gl.glVertex2d(-10, 9);
        gl.glVertex2d(10, 9);
        gl.glVertex2d(-10, 10);
        gl.glVertex2d(10, 10);

        gl.glVertex2d(-10, -1);
        gl.glVertex2d(10, -1);
        gl.glVertex2d(-10, -2);
        gl.glVertex2d(10, -2);
        gl.glVertex2d(-10, -3);
        gl.glVertex2d(10, -3);
        gl.glVertex2d(-10, -4);
        gl.glVertex2d(10, -4);
        gl.glVertex2d(-10, -5);
        gl.glVertex2d(10, -5);
        gl.glVertex2d(-10, -6);
        gl.glVertex2d(10, -6);
        gl.glVertex2d(-10, -7);
        gl.glVertex2d(10, -7);
        gl.glVertex2d(-10, -8);
        gl.glVertex2d(10, -8);
        gl.glVertex2d(-10, -9);
        gl.glVertex2d(10, -9);
        gl.glVertex2d(-10, -10);
        gl.glVertex2d(10, -10);
        gl.glEnd();
        gl.glPopMatrix();

    }

}
