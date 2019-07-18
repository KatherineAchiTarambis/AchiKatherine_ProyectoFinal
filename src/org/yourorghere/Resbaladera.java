package org.yourorghere;

import javax.media.opengl.GL;

public class Resbaladera {

    GL gl;
    float x, y, z;
    float w, h, d;
    float rx, ry, rz;
    float r, g, b;
    Cilindro t1, t2,c1,c2,c3;
    Cubo a1,a2,a3;

    public Resbaladera(GL gl, float x, float y, float z, float w, float h, float d, float rx, float ry, float rz, float r, float g, float b) {
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
        this.t1 = new Cilindro(gl, 0f, 0f, 0f, 2f, 2f, 80f, -90, 0, 0, 1f, 0f, 0f, 10, 10, 0.3f, 0.3f);
        this.t2 = new Cilindro(gl, 0f, 0f, 13f, 2f, 2f, 80f, -90, 0, 0, 1f, 0f, 0f, 10, 10, 0.3f, 0.3f);
        this.c1 = new Cilindro(gl, 0f, 5f, 0f, 2f, 2f, 42, 0, 0, 0, 1f, 1f, 0f, 10, 10, 0.3f, 0.3f);
        this.c2 = new Cilindro(gl, 0f, 10f, 0f, 2f, 2f, 42, 0, 0, 0, 1f, 1f, 0f, 10, 10, 0.3f, 0.3f);
        this.c3 = new Cilindro(gl, 0f, 15f, 0f, 2f, 2f, 42, 0, 0, 0, 1f, 1f, 0f, 10, 10, 0.3f, 0.3f);
        this.a1=new Cubo(gl, 3f, 21f, 6f, 3f, 0.5f, 6f, 0, 0, 0, 1f, 0.6f, 0f, 1f, 0.6f, 0);
        this.a2=new Cubo(gl, 14f, 11f, 6f, 13f, 0.5f, 6f, 0, 0, -50, 1f, 0.6f, 0f, 1f, 0.6f, 0);
        this.a3=new Cubo(gl, 25f, 1f, 6f, 3f, 0.5f, 6f, 0, 0, 0, 1f, 0.6f, 0f, 1f, 0.6f, 0);
    }

    public void dibujarresbaladera() {
        gl.glPushMatrix();
        gl.glColor3f(this.r, this.g, this.b);
        gl.glTranslatef(this.x, this.y, this.z);
        gl.glRotatef(this.rx, 1, 0, 0);
        gl.glRotatef(this.ry, 0, 1, 0);
        gl.glRotatef(this.rz, 0, 0, 1);
        gl.glScalef(w, h, d);
        this.t1.dibujarcilindro();
        this.t2.dibujarcilindro();
        this.c1.dibujarcilindro();
        this.c2.dibujarcilindro();
        this.c3.dibujarcilindro();
        this.a1.dibuja();
        this.a2.dibuja();
        this.a3.dibuja();
        gl.glPopMatrix();
        gl.glEnd();

    }
}
