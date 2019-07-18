package org.yourorghere;

import javax.media.opengl.GL;

public class EscaleraChina {

    GL gl;
    float x, y, z;
    float w, h, d;
    float rx, ry, rz;
    float r, g, b;
    Cilindro t1, t2, t3, t4, t5,t6;
    Cilindro c1, c2, c3, c4, c5, c6,c7,c8,c9,c10,c11;
    
    public EscaleraChina(GL gl, float x, float y, float z, float w, float h, float d, float rx, float ry, float rz, float r, float g, float b) {
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
        this.t3 = new Cilindro(gl, 30f, 0f, 0f, 2f, 2f, 80f, -90, 0, 0, 1f, 0f, 0f, 10, 10, 0.3f, 0.3f);
        this.t4 = new Cilindro(gl, 30f, 0f, 13f, 2f, 2f, 80f, -90, 0, 0, 1f, 0f, 0f, 10, 10, 0.3f, 0.3f);
        this.t5 = new Cilindro(gl, 0f, 24f, 13f, 2f, 2f, 100, 0, 90, 0, 1f, 0.6f, 0f, 10, 10, 0.3f, 0.3f);
        this.t6 = new Cilindro(gl, 0f, 24f, 0f, 2f, 2f, 100, 0, 90, 0, 1f, 0.6f, 0f, 10, 10, 0.3f, 0.3f);
        this.c1 = new Cilindro(gl, 5f, 24f, 0f, 2f, 2f, 42f, 0, 0, 0, 1f, 1f, 0f, 10, 10, 0.3f, 0.3f);
        this.c2 = new Cilindro(gl, 10f, 24f, 0f, 2f, 2f,42f, 0, 0, 0, 1f, 1f, 0f, 10, 10, 0.3f, 0.3f);
        this.c3 = new Cilindro(gl, 15f, 24f, 0f, 2f, 2f,42f, 0, 0, 0, 1f, 1f, 0f, 10, 10, 0.3f, 0.3f);
        this.c4 = new Cilindro(gl, 20f, 24f, 0f, 2f, 2f,42f, 0, 0, 0, 1f, 1f, 0f, 10, 10, 0.3f, 0.3f);
        this.c5 = new Cilindro(gl, 25f, 24f, 0f, 2f, 2f, 42, 0, 0, 0, 1f, 1f, 0f, 10, 10, 0.3f, 0.3f);
        this.c6 = new Cilindro(gl, 0f, 7f, 0f, 2f, 2f, 42, 0, 0, 0, 1f, 1f, 0f, 10, 10, 0.3f, 0.3f);
        this.c7 = new Cilindro(gl, 0f, 12f, 0f, 2f, 2f, 42, 0, 0, 0, 1f, 1f, 0f, 10, 10, 0.3f, 0.3f);
        this.c8 = new Cilindro(gl, 0f, 17f, 0f, 2f, 2f, 42, 0, 0, 0, 1f, 1f, 0f, 10, 10, 0.3f, 0.3f);
        this.c9 = new Cilindro(gl, 30f, 7f, 0f, 2f, 2f, 42, 0, 0, 0, 1f, 1f, 0f, 10, 10, 0.3f, 0.3f);
        this.c10 = new Cilindro(gl, 30f, 12f, 0f, 2f, 2f, 42, 0, 0, 0, 1f, 1f, 0f, 10, 10, 0.3f, 0.3f);
        this.c11 = new Cilindro(gl, 30f, 17f, 0f, 2f, 2f, 42, 0, 0, 0, 1f, 1f, 0f, 10, 10, 0.3f, 0.3f);
        
    }

    public void dibujarescalera() {
        gl.glPushMatrix();
        gl.glColor3f(this.r, this.g, this.b);
        gl.glTranslatef(this.x, this.y, this.z);
        gl.glRotatef(this.rx, 1, 0, 0);
        gl.glRotatef(this.ry, 0, 1, 0);
        gl.glRotatef(this.rz, 0, 0, 1);
        gl.glScalef(w, h, d);
        this.t1.dibujarcilindro();
        this.t2.dibujarcilindro();
        this.t3.dibujarcilindro();
        this.t4.dibujarcilindro();
        this.t5.dibujarcilindro();
        this.t6.dibujarcilindro();
        this.c1.dibujarcilindro();
        this.c2.dibujarcilindro();
        this.c3.dibujarcilindro();
        this.c4.dibujarcilindro();
        this.c5.dibujarcilindro();
        this.c6.dibujarcilindro();
        this.c7.dibujarcilindro();
        this.c8.dibujarcilindro();
        this.c9.dibujarcilindro();
        this.c10.dibujarcilindro();
        this.c11.dibujarcilindro();
        gl.glPopMatrix();
        gl.glEnd();
    }
}
