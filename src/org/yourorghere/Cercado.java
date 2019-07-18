package org.yourorghere;

import javax.media.opengl.GL;

public class Cercado {

    GL gl;
    float x, y, z;
    float w, h, d;
    float rx, ry, rz;
    float r, g, b;
    Lineas malla;
    Cilindro tubo1, tubo2;
    Cubo pared;

    public Cercado(GL gl, float x, float y, float z, float w, float h, float d, float rx, float ry, float rz, float r, float g, float b) {
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
        this.malla = new Lineas(gl, 0, 0, 0, 1f, 1f, 0, 0, 0, 0.6f, 0.6f, 0.6f);
        this.tubo1 = new Cilindro(gl, 10f, 10.25f, 0, 2f, 2f, 68f, 90, 0, 0, 0.6f, 0.6f, 0.6f, 10, 10, 0.3f, 0.3f);
        this.tubo2 = new Cilindro(gl, -10f, 10.25f, 0, 2f, 2f, 68f, 90, 0, 0, 0.6f, 0.6f, 0.6f, 10, 10, 0.3f, 0.3f);
        this.pared = new Cubo(gl, 0, -8, 0, 10, 4f, 1.5f, 0, 0, 0, 0.6f, 0.6f, 0.6f, 0.6f, 0.6f, 0.6f);
    }

    public void dibujarcerca() {
        gl.glPushMatrix();
        gl.glTranslatef(x, y, z);
        gl.glRotatef(this.rx, 1, 0, 0);
        gl.glRotatef(this.ry, 0, 1, 0);
        gl.glRotatef(this.rz, 0, 0, 1);
        gl.glScalef(w, h, d);
        this.malla.dibujarmalla();
        this.tubo1.dibujarcilindro();
        this.tubo2.dibujarcilindro();
        this.pared.dibuja();
        gl.glPopMatrix();
    }

}
