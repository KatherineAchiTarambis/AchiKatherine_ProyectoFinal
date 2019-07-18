package org.yourorghere;

import javax.media.opengl.GL;

public class Gradas {

    GL gl;
    float x, y, z;
    float w, h, d;
    float rx, ry, rz;
    float r, g, b;

    Cubo p1, p2, p3, p4, p5, p6, p7, p8;

    public Gradas(GL gl, float x, float y, float z, float w, float h, float d, float rx, float ry, float rz, float r, float g, float b) {
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

        this.p1 = new Cubo(gl, 0, 0, 0, 0.6f, 0.1f, 0.4f, 0, 0, 0, 0.6f, 0.6f, 0.7f, 0.4f, 0.4f, 0.4f);
        this.p2 = new Cubo(gl, 0, 0.2f, 0.05f, 0.6f, 0.1f, 0.35f, 0, 0, 0, 0.4f, 0.4f, 0.4f, 0.6f, 0.6f, 0.7f);
        this.p3 = new Cubo(gl, 0, 0.4f, 0.1f, 0.6f, 0.1f, 0.30f, 0, 0, 0, 0.6f, 0.6f, 0.7f, 0.4f, 0.4f, 0.4f);
        this.p4 = new Cubo(gl, 0, 0.6f, 0.15f, 0.6f, 0.1f, 0.25f, 0, 0, 0, 0.4f, 0.4f, 0.4f, 0.6f, 0.6f, 0.7f);
        this.p5 = new Cubo(gl, 0, 0.8f, 0.20f, 0.6f, 0.1f, 0.20f, 0, 0, 0, 0.6f, 0.6f, 0.7f, 0.4f, 0.4f, 0.4f);
        this.p6 = new Cubo(gl, 0, 1f, 0.25f, 0.6f, 0.1f, 0.15f, 0, 0, 0, 0.4f, 0.4f, 0.4f, 0.6f, 0.6f, 0.7f);
        this.p7 = new Cubo(gl, 0, 1.2f, 0.30f, 0.6f, 0.1f, 0.10f, 0, 0, 0, 0.6f, 0.6f, 0.7f, 0.4f, 0.4f, 0.4f);
        this.p8 = new Cubo(gl, 0, 1.4f, 0.35f, 0.6f, 0.1f, 0.05f, 0, 0, 0, 0.4f, 0.4f, 0.4f, 0.6f, 0.6f, 0.7f);
       
    }

    public void dibuja() {
        gl.glPushMatrix();
        gl.glTranslatef(x, y, z);
        gl.glRotatef(this.rx, 1, 0, 0);
        gl.glRotatef(this.ry, 0, 1, 0);
        gl.glRotatef(this.rz, 0, 0, 1);
        gl.glScalef(w, h, d);
        this.p1.dibuja();
        this.p2.dibuja();
        this.p3.dibuja();
        this.p4.dibuja();
        this.p5.dibuja();
        this.p6.dibuja();
        this.p7.dibuja();
        this.p8.dibuja();
        //this.ry = ry + 0.8f;

        gl.glPopMatrix();
    }
}
