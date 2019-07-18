
package org.yourorghere;

import javax.media.opengl.GL;

public class Llantas {
    GL gl;
    float x, y, z;
    float w, h, d;
    float rx, ry, rz;
    float r, g, b;
    Dona d1,d2,d3,d4,d5;

    public Llantas(GL gl, float x, float y, float z, float w, float h, float d, float rx, float ry, float rz, float r, float g, float b) {
        this.gl = gl;
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
        this.h = h;
        this.d = d;
        this.rx = rx;
        this.ry = ry;
        this.rz = rz;
        this.r = r;
        this.g = g;
        this.b = b;
        this.d1=new Dona(gl, 0f, 0f, 0f, 2f, 2f, 2f, 0, 0,-10, 1f, 0f, 0f, 10, 10, 2f, 5);
        this.d2=new Dona(gl, 0, 0f, 10f, 2f, 2f, 2f, 0, 0,-10, 0f, 0.8f, 1f, 10, 10, 2f, 5);
        this.d3=new Dona(gl, 0f, 0f, 20f, 2f, 2f, 2f, 0, 0,-10, 0f, 0.9f, 0.1f, 10, 10, 2f, 5);
        this.d4=new Dona(gl, 0f, 0f, 30f, 2f, 2f, 2f, 0, 0,-10, 1f, 0.7f, 0.2f, 10, 10, 2f, 5);
        this.d5=new Dona(gl, 0f, 0f, 40f, 2f, 2f, 2f, 0, 0,-10, 1f, 0.3f, 0.7f, 10, 10, 2f, 5);
    }
    public void dibujarllantas() {
        gl.glPushMatrix();
        gl.glColor3f(this.r, this.g, this.b);
        gl.glTranslatef(this.x, this.y, this.z);
        gl.glRotatef(this.rx, 1, 0, 0);
        gl.glRotatef(this.ry, 0, 1, 0);
        gl.glRotatef(this.rz, 0, 0, 1);
        gl.glScalef(w, h, d);
        this.d1.dibujardona();
        this.d2.dibujardona();
        this.d3.dibujardona();
        this.d4.dibujardona();
        this.d5.dibujardona();
        gl.glPopMatrix();
        gl.glEnd();
    
    }
}
