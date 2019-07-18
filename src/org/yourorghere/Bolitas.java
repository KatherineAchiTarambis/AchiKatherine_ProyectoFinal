package org.yourorghere;

import javax.media.opengl.GL;

public class Bolitas {

    GL gl;
    float x, y, z;
    float w, h, d;
    float rx, ry, rz;
    float r, g, b;
    Dona dona;
    Planta p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13,p14;

    public Bolitas(GL gl, float x, float y, float z, float w, float h, float d, float rx, float ry, float rz, float r, float g, float b) {
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
        this.dona = new Dona(gl, 0, 0, 0, 0.35f, 0.35f, 0.35f, 90, 0, -10, 0.5f, 0.3f, 0f, 10, 10, 1.5f, 5);
        this.p1 = new Planta(gl, 1.7f, 0.5f, 0, 1.2f, 1.2f, 1.2f, 0, 10, 0, 1, 1, 1);
        this.p2 = new Planta(gl, 1.7f, 0.5f, 0.8f, 1.2f, 1.2f, 1.2f, 0, 20, 0, 1, 1, 1);
        this.p3 = new Planta(gl, 1.7f, 0.5f, -0.8f, 1.2f, 1.2f, 1.2f, 0, 30, 0, 1, 1, 1);
        this.p4 = new Planta(gl, 1f, 0.5f, 1.4f, 1.2f, 1.2f, 1.2f, 0, 0, 0, 1, 1, 1);
        this.p5 = new Planta(gl, -0.1f, 0.5f, 1.6f, 1.2f, 1.2f, 1.2f, 0, -40, 0, 1, 1, 1);
        this.p6 = new Planta(gl, -0.8f, 0.5f, 1.6f, 1.2f, 1.2f, 1.2f, 0, 90, 0, 1, 1, 1);
        this.p7 = new Planta(gl, 1.2f, 0.5f, -1.6f, 1.2f, 1.2f, 1.2f, 0, 40, 0, 1, 1, 1);
        this.p8 = new Planta(gl, -1.4f, 0.5f, 1.4f, 1.2f, 1.2f, 1.2f, 0, 60, 0, 1, 1, 1);
        this.p9 = new Planta(gl, 0.4f, 0.5f, -1.6f, 1.2f, 1.2f, 1.2f, 0, 80, 0, 1, 1, 1);
        this.p10 = new Planta(gl, -0.5f, 0.5f, -1.8f, 1.2f, 1.2f, 1.2f, 0, 80, 0, 1, 1, 1);
        this.p11 = new Planta(gl, -1.2f, 0.5f, -1.4f, 1.2f, 1.2f, 1.2f, 0, 80, 0, 1, 1, 1);
        this.p12 = new Planta(gl, -1.7f, 0.5f, 0.8f, 1.2f, 1.2f, 1.2f, 0, 30, 0, 1, 1, 1);
        this.p13 = new Planta(gl, -1.7f, 0.5f, -0.8f, 1.2f, 1.2f, 1.2f, 0, -40, 0, 1, 1, 1);
        this.p14 = new Planta(gl, -1.7f, 0.5f, 0, 1.2f, 1.2f, 1.2f, 0, -30, 0, 1, 1, 1);
    }

    public void dibujarbolita() {
        gl.glPushMatrix();
        gl.glTranslatef(x, y, z);
        gl.glRotatef(this.rx, 1, 0, 0);
        gl.glRotatef(this.ry, 0, 1, 0);
        gl.glRotatef(this.rz, 0, 0, 1);
        gl.glScalef(w, h, d);
        this.dona.dibujardona();
        this.p1.dibujarplanta();
        this.p2.dibujarplanta();
        this.p3.dibujarplanta();
        this.p4.dibujarplanta();
        this.p5.dibujarplanta();
        this.p6.dibujarplanta();
        this.p7.dibujarplanta();
        this.p8.dibujarplanta();
        this.p9.dibujarplanta();
        this.p10.dibujarplanta();
        this.p11.dibujarplanta();
        this.p12.dibujarplanta();
        this.p13.dibujarplanta();
        this.p14.dibujarplanta();

        gl.glPopMatrix();
    }
}
