
package org.yourorghere;

import javax.media.opengl.GL;

public class JuegoMalla {
    GL gl;
    float x, y, z;
    float w, h, d;
    float rx, ry, rz;
    float r, g, b;
    Lineas malla1,malla2;
    Cilindro t1, t2, t3, t4, t5;

    public JuegoMalla(GL gl, float x, float y, float z, float w, float h, float d, float rx, float ry, float rz, float r, float g, float b) {
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
        this.malla1 = new Lineas(gl, 15.3f, 13,4, 1.5f, 1f, 15, 0, 0, 1f, 1f, 0.5f);
        this.malla2 = new Lineas(gl, 15.3f, 13,10, 1.5f, 1f, -15, 0, 0, 1f, 1f, 0.5f);
        this.t1 = new Cilindro(gl, 0f, 0f, 0f, 2f, 2f, 80f, -75, 0, 0, 1f, 0f, 0f, 10, 10, 0.3f, 0.3f);
        this.t2 = new Cilindro(gl, 0f, 0f, 13f, 2f, 2f, 80f, -105, 0, 0, 1f, 0f, 0f, 10, 10, 0.3f, 0.3f);
        this.t3 = new Cilindro(gl, 30f, 0f, 0f, 2f, 2f, 80f, -75, 0, 0, 1f, 0f, 0f, 10, 10, 0.3f, 0.3f);
        this.t4 = new Cilindro(gl, 30f, 0f, 13f, 2f, 2f, 80f, -105, 0, 0, 1f, 0f, 0f, 10, 10, 0.3f, 0.3f);
        this.t5 = new Cilindro(gl, 0f, 23f, 6.5f, 2f, 2f, 100, 0, 90, 0, 1f, 0.6f, 0f, 10, 10, 0.3f, 0.3f);
    }
    public void dibujarjuego() {
        gl.glPushMatrix();
        gl.glTranslatef(x, y, z);
        gl.glRotatef(this.rx, 1, 0, 0);
        gl.glRotatef(this.ry, 0, 1, 0);
        gl.glRotatef(this.rz, 0, 0, 1);
        gl.glScalef(w, h, d);
        this.malla1.dibujarmalla();
        this.malla2.dibujarmalla();
        this.t1.dibujarcilindro();
        this.t2.dibujarcilindro();
        this.t3.dibujarcilindro();
        this.t4.dibujarcilindro();
        this.t5.dibujarcilindro();
        gl.glPopMatrix();
    }

}
