package org.yourorghere;

import javax.media.opengl.GL;

public class Casa {

    GL gl;
    float x, y, z;
    float w, h, d;
    float rx, ry, rz;
    float r, g, b;

    Cubo paredes, balcon;
    Cuadrado ventana1, ventana2, puerta, p1, p2;
    Cubo p3, p4;

    public Casa(GL gl, float x, float y, float z, float w, float h, float d, float rx, float ry, float rz) {
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
        this.paredes = new Cubo(gl, 0, 0, 0, 0.3f, 0.25f, 0.2f, 0, 0, 0, 1f, 1f, 0.7f, 1f, 1f, 0.9f);
        this.balcon = new Cubo(gl, 0.0f, 0.23f, 0.15f, 0.18f, 0.1f, 0.1f, 0, 0, 0, 0.8f, 1f, 0.3f, 0.8f, 1f, 0.3f);
        this.puerta = new Cuadrado(gl, 0, -0.1f, 0.21f, 0.08f, 0.15f, 0, 0, 0, 1f, 1f, 1f, 1, 1, 1);
        this.ventana1 = new Cuadrado(gl, -0.18f, -0.01f, 0.21f, 0.07f, 0.12f, 0, 0, 0, 0.3f, 0.6f, 0.8f, 1, 1, 1);
        this.ventana2 = new Cuadrado(gl, 0.18f, -0.01f, 0.21f, 0.07f, 0.12f, 0, 0, 0, 0.3f, 0.6f, 0.8f, 1, 1, 1);
        this.p1 = new Cuadrado(gl, 0f, 0.25f, 0.19f, 0.3f, 0.06f, 0, 0, 0, 1f, 1f, 0.7f, 1f, 1f, 0.7f);
        this.p2 = new Cuadrado(gl, 0f, 0.25f, -0.19f, 0.3f, 0.06f, 0, 0, 0, 1f, 1f, 0.7f, 1f, 1f, 0.7f);
        this.p3 = new Cubo(gl, 0.3f, 0.27f, 0.0f, 0.04f,0, 0.2f, 0, 0, 90, 1f, 1f, 0.9f, 1f, 1f, 0.9f);
        this.p4 = new Cubo(gl, 0.3f, -0.27f, 0.0f, 0.04f,0, 0.2f, 0, 0, 90, 1f, 1f, 0.9f, 1f, 1f, 0.9f);
    }

    public void dibuja() {
        gl.glPushMatrix();
        gl.glTranslatef(x, y, z);
        gl.glRotatef(this.rx, 1, 0, 0);
        gl.glRotatef(this.ry, 0, 1, 0);
        gl.glRotatef(this.rz, 0, 0, 1);
        gl.glScalef(w, h, d);
        this.paredes.dibuja();
        this.balcon.dibuja();
        this.puerta.dibuja();
        this.ventana1.dibuja();
        this.ventana2.dibuja();
        this.p1.dibuja();
        this.p2.dibuja();
        this.p3.dibuja();
        this.p4.dibuja();
        gl.glPopMatrix();
    }

}
