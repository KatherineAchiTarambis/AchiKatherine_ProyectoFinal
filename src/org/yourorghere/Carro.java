package org.yourorghere;

import javax.media.opengl.GL;

public class Carro {

    GL gl;
    float x, y, z;
    float w, h, d;
    float rx, ry, rz;
    float r, g, b;
    Cubo c11, c12, c21, c22, c31, c32, c41, c42, c51, c52, c61, c62;
    Dona llanta1, llanta2, llanta3, llanta4;
    Cuadrado v1, v2, v3, v4, l1, l2, l3, l4;
    boolean valor = true;
    boolean valor2 = true;
    int cont = 0;
    int cont2 = 0;

    public Carro(GL gl, float x, float y, float z, float w, float h, float d, float rx, float ry, float rz, float r, float g, float b) {
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
        this.c11 = new Cubo(gl, 0, 0, 0, 2.5f, 0.5f, 1, 0, 0, 0, 0.6f, 0, 0.1f, 0.6f, 0.1f, 0.2f);
        this.c12 = new Cubo(gl, 0, 1f, 0, 1.35f, 0.5f, 1, 0, 0, 0, 0.6f, 0, 0.1f, 0.6f, 0.1f, 0.2f);
        this.c21 = new Cubo(gl, 0, 0, 0, 2.5f, 0.5f, 1, 0, 0, 0, 0.8f, 0.4f, 0.5f, 0.8f, 0.4f, 0.5f);
        this.c22 = new Cubo(gl, 0, 1f, 0, 1.35f, 0.5f, 1, 0, 0, 0, 0.8f, 0.4f, 0.5f, 0.8f, 0.4f, 0.5f);
        this.c31 = new Cubo(gl, 0, 0, 0, 2.5f, 0.5f, 1, 0, 0, 0, 0.8f, 1f, 0.2f, 0.8f, 1f, 0.2f);
        this.c32 = new Cubo(gl, 0, 1f, 0, 1.35f, 0.5f, 1, 0, 0, 0, 0.8f, 1f, 0.2f, 0.8f, 1f, 0.2f);
        this.c41 = new Cubo(gl, 0, 0, 0, 2.5f, 0.5f, 1, 0, 0, 0, 1f, 0.6f, 0f, 1f, 0.6f, 0f);
        this.c42 = new Cubo(gl, 0, 1f, 0, 1.35f, 0.5f, 1, 0, 0, 0, 1f, 0.6f, 0f, 1f, 0.6f, 0f);
        this.c51 = new Cubo(gl, 0, 0, 0, 2.5f, 0.5f, 1, 0, 0, 0, 0f, 0.1f, 0.6f, 0f, 0.1f, 0.6f);
        this.c52 = new Cubo(gl, 0, 1f, 0, 1.35f, 0.5f, 1, 0, 0, 0, 0f, 0.1f, 0.6f, 0f, 0.1f, 0.6f);
        this.c61 = new Cubo(gl, 0, 0, 0, 2.5f, 0.5f, 1, 0, 0, 0, 1, 1, 0, 1, 1, 1);
        this.c62 = new Cubo(gl, 0, 1f, 0, 1.35f, 0.5f, 1, 0, 0, 0, 1, 1, 0, 1, 1, 1);
        this.llanta1 = new Dona(gl, -1.3f, -0.5f, -1f, 0.10f, 0.10f, 0.10f, 0, 0, -10, 0.3f, 0.3f, 0.3f, 10, 10, 2f, 5);
        this.llanta2 = new Dona(gl, 1.3f, -0.5f, -1f, 0.10f, 0.10f, 0.10f, 0, 0, -10, 0.3f, 0.3f, 0.3f, 10, 10, 2f, 5);
        this.llanta3 = new Dona(gl, -1.3f, -0.5f, 1f, 0.10f, 0.10f, 0.10f, 0, 0, -10, 0.3f, 0.3f, 0.3f, 10, 10, 2f, 5);
        this.llanta4 = new Dona(gl, 1.3f, -0.5f, 1f, 0.10f, 0.10f, 0.10f, 0, 0, -10, 0.3f, 0.3f, 0.3f, 10, 10, 2f, 5);
        this.v1 = new Cuadrado(gl, 1.4f, 0.8f, 0.0f, 0.8f, 0.5f, 0, 90, 0, 0.7f, 1f, 1f, 1, 1, 1);
        this.v2 = new Cuadrado(gl, -1.4f, 0.8f, 0.0f, 0.8f, 0.5f, 0, 90, 0, 0.7f, 1f, 1f, 1, 1, 1);
        this.v3 = new Cuadrado(gl, 0f, 0.8f, 1.02f, 0.8f, 0.5f, 0, 0, 0, 0.7f, 1f, 1f, 1, 1, 1);
        this.v4 = new Cuadrado(gl, 0f, 0.8f, -1.02f, 0.8f, 0.5f, 0, 0, 0, 0.7f, 1f, 1f, 1, 1, 1);
        this.l1 = new Cuadrado(gl, 2.55f, 0.2f, 0.6f, 0.2f, 0.2f, 0, 90, 0, 1f, 1f, 0f, 1, 1, 1);
        this.l2 = new Cuadrado(gl, 2.55f, 0.2f, -0.6f, 0.2f, 0.2f, 0, 90, 0, 1f, 1f, 0f, 1, 1, 1);
        this.l3 = new Cuadrado(gl, -2.55f, 0.2f, 0.6f, 0.2f, 0.2f, 0, 90, 0, 1f, 1f, 0f, 1, 1, 1);
        this.l4 = new Cuadrado(gl, -2.55f, 0.2f, -0.6f, 0.2f, 0.2f, 0, 90, 0, 1f, 1f, 0f, 1, 1, 1);

    }

    public void dibujarcarro1() {
        gl.glPushMatrix();
        gl.glTranslatef(x, y, z);
        gl.glRotatef(this.rx, 1, 0, 0);
        gl.glRotatef(this.ry, 0, 1, 0);
        gl.glRotatef(this.rz, 0, 0, 1);
        gl.glScalef(w, h, d);
        this.c11.dibuja();
        this.c12.dibuja();
        this.llanta1.dibujardona();
        this.llanta2.dibujardona();
        this.llanta3.dibujardona();
        this.llanta4.dibujardona();
        this.l1.dibuja();
        this.l2.dibuja();
        this.l3.dibuja();
        this.l4.dibuja();
        this.v1.dibuja();
        this.v2.dibuja();
        this.v3.dibuja();
        this.v4.dibuja();
        valorcarro1();
        muevecarro1();
        gl.glEnd();
        gl.glPopMatrix();
    }

    public void dibujarcarro2() {
        gl.glPushMatrix();
        gl.glTranslatef(x, y, z);
        gl.glRotatef(this.rx, 1, 0, 0);
        gl.glRotatef(this.ry, 0, 1, 0);
        gl.glRotatef(this.rz, 0, 0, 1);
        gl.glScalef(w, h, d);
        this.c21.dibuja();
        this.c22.dibuja();
        this.llanta1.dibujardona();
        this.llanta2.dibujardona();
        this.llanta3.dibujardona();
        this.llanta4.dibujardona();
        this.l1.dibuja();
        this.l2.dibuja();
        this.l3.dibuja();
        this.l4.dibuja();
        this.v1.dibuja();
        this.v2.dibuja();
        this.v3.dibuja();
        this.v4.dibuja();
        z = 46;
        this.ry = 180;
        valorcarro2();
        muevecarro2();
        gl.glPopMatrix();
//        System.out.println(cont2);
    }

    public void dibujarcarro3() {
        gl.glPushMatrix();
        gl.glTranslatef(x, y, z);
        gl.glRotatef(this.rx, 1, 0, 0);
        gl.glRotatef(this.ry, 0, 1, 0);
        gl.glRotatef(this.rz, 0, 0, 1);
        gl.glScalef(w, h, d);
        this.c31.dibuja();
        this.c32.dibuja();
        this.llanta1.dibujardona();
        this.llanta2.dibujardona();
        this.llanta3.dibujardona();
        this.llanta4.dibujardona();
        this.l1.dibuja();
        this.l2.dibuja();
        this.l3.dibuja();
        this.l4.dibuja();
        this.v1.dibuja();
        this.v2.dibuja();
        this.v3.dibuja();
        this.v4.dibuja();
        gl.glPopMatrix();
    }

    public void dibujarcarro4() {
        gl.glPushMatrix();
        gl.glTranslatef(x, y, z);
        gl.glRotatef(this.rx, 1, 0, 0);
        gl.glRotatef(this.ry, 0, 1, 0);
        gl.glRotatef(this.rz, 0, 0, 1);
        gl.glScalef(w, h, d);
        this.c41.dibuja();
        this.c42.dibuja();
        this.llanta1.dibujardona();
        this.llanta2.dibujardona();
        this.llanta3.dibujardona();
        this.llanta4.dibujardona();
        this.l1.dibuja();
        this.l2.dibuja();
        this.l3.dibuja();
        this.l4.dibuja();
        this.v1.dibuja();
        this.v2.dibuja();
        this.v3.dibuja();
        this.v4.dibuja();
//     this.rx = rx + 2f;
//        this.ry = ry + 2f;
//        this.z = z + 8f;
        gl.glEnd();
        gl.glPopMatrix();
//        System.out.println(z);
    }

    public void dibujarcarro5() {
        gl.glPushMatrix();
        gl.glTranslatef(x, y, z);
        gl.glRotatef(this.rx, 1, 0, 0);
        gl.glRotatef(this.ry, 0, 1, 0);
        gl.glRotatef(this.rz, 0, 0, 1);
        gl.glScalef(w, h, d);
        this.c51.dibuja();
        this.c52.dibuja();
        this.llanta1.dibujardona();
        this.llanta2.dibujardona();
        this.llanta3.dibujardona();
        this.llanta4.dibujardona();
        this.l1.dibuja();
        this.l2.dibuja();
        this.l3.dibuja();
        this.l4.dibuja();
        this.v1.dibuja();
        this.v2.dibuja();
        this.v3.dibuja();
        this.v4.dibuja();
        gl.glPopMatrix();
    }

    public void dibujarcarro6() {
        gl.glPushMatrix();
        gl.glTranslatef(x, y, z);
        gl.glRotatef(this.rx, 1, 0, 0);
        gl.glRotatef(this.ry, 0, 1, 0);
        gl.glRotatef(this.rz, 0, 0, 1);
        gl.glScalef(w, h, d);
        this.c61.dibuja();
        this.c62.dibuja();
        this.llanta1.dibujardona();
        this.llanta2.dibujardona();
        this.llanta3.dibujardona();
        this.llanta4.dibujardona();
        this.l1.dibuja();
        this.l2.dibuja();
        this.l3.dibuja();
        this.l4.dibuja();
        this.v1.dibuja();
        this.v2.dibuja();
        this.v3.dibuja();
        this.v4.dibuja();
        traslada();
        if (this.z==-55) {
            z=55;
        }
        System.out.println(z);
        gl.glPopMatrix();
    }

    void valorcarro1() {
        if (cont <= 11) {
            cont++;
        } else {
            cont = 1;
            valor = !valor;
        }
    }

    void valorcarro2() {
        if (cont2 <= 0) {
            cont2++;
        } else {
            cont2 = -9;
            valor2 = !valor2;
        }
    }

    void muevecarro1() {
        if (valor) {
            this.z = this.z + 8f;
        } else {
            this.z = this.z - 8f;

        }
    }

    void muevecarro2() {
        if (valor2) {
            this.x = this.x + 4f;
        } else {
            this.x = this.x - 4f;

        }
    }
    void traslada(){
        this.z=this.z-5f;
        gl.glTranslatef(x,y,z);
    }

}
