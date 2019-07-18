package org.yourorghere;

import javax.media.opengl.GL;

public class Bancas {

    GL gl;
    float x, y, z;
    float w, h, d;
    float rx, ry, rz;
    float r, g, b;
    Cilindro b1, b2, b3, b4, mesa, pm;
    Cilindro a1, a2, a3, a4, a5;

    public Bancas(GL gl, float x, float y, float z, float w, float h, float d, float rx, float ry, float rz, float r, float g, float b) {
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
        this.a1 = new Cilindro(gl, 1f, 0f, 0.95f, 0.6f, 0.6f, 0.6f, -90, 0, 0, 1f, 1f, 1f, 10, 10, 0.3f, 0.3f);
        this.a2 = new Cilindro(gl, 0.50f, 0f, 0.65f, 0.6f, 0.6f, 0.6f, -90, 0, 0, 1f, 1f, 1f, 10, 10, 0.3f, 0.3f);
        this.a3 = new Cilindro(gl, 0f, 0f, 0.55f, 0.6f, 0.6f, 0.6f, -90, 0, 0, 1f, 1f, 1f, 10, 10, 0.3f, 0.3f);
        this.a4 = new Cilindro(gl, -0.50f, 0f, 0.65f, 0.6f, 0.6f, 0.6f, -90, 0, 0, 1f, 1f, 1f, 10, 10, 0.3f, 0.3f);
        this.a5 = new Cilindro(gl, -1f, 0f, 0.95f, 0.6f, 0.6f, 0.6f, -90, 0, 0, 1f, 1f, 1f, 10, 10, 0.3f, 0.3f);
        
        this.b1 = new Cilindro(gl, 0.6f, 0f, 0.6f, 0.6f, 0.6f, 0.6f, -90, 0, 0, 1f, 1f, 1f, 10, 10, 0.3f, 0.3f);
        this.b2 = new Cilindro(gl, 0.6f, 0f, -0.6f, 0.6f, 0.6f, 0.6f, -90, 0, 0, 1f, 1f, 1f, 10, 10, 0.3f, 0.3f);
        this.b3 = new Cilindro(gl, -0.6f, 0f, 0.6f, 0.6f, 0.6f, 0.6f, -90, 0, 0, 1f, 1f, 1f, 10, 10, 0.3f, 0.3f);
        this.b4 = new Cilindro(gl, -0.6f, 0f, -0.6f, 0.6f, 0.6f, 0.6f, -90, 0, 0, 1f, 1f, 1f, 10, 10, 0.3f, 0.3f);
        this.mesa= new Cilindro(gl, 0f, 0.2f, 0f, 1.3f, 1.3f, 0.3f, -90, 0, 0, 1f, 1f, 1f, 10, 10, 0.3f, 0.3f);
        this.pm = new Cilindro(gl, 0f, 0f, 0f, 0.3f, 0.3f, 0.6f, -90, 0, 0, 1f, 1f, 1f, 10, 10, 0.3f, 0.3f);
        

    }

    public void dibujarbancas() {
        gl.glPushMatrix();
        gl.glTranslatef(x, y, z);
        gl.glRotatef(this.rx, 1, 0, 0);
        gl.glRotatef(this.ry, 0, 1, 0);
        gl.glRotatef(this.rz, 0, 0, 1);
        gl.glScalef(w, h, d);
        this.a1.dibujarcilindro();
        this.a2.dibujarcilindro();
        this.a3.dibujarcilindro();
        this.a4.dibujarcilindro();
        this.a5.dibujarcilindro();

        gl.glPopMatrix();
    }
    public void dibujarbancasmesa() {
        gl.glPushMatrix();
        gl.glTranslatef(x, y, z);
        gl.glRotatef(this.rx, 1, 0, 0);
        gl.glRotatef(this.ry, 0, 1, 0);
        gl.glRotatef(this.rz, 0, 0, 1);
        gl.glScalef(w, h, d);
        this.b1.dibujarcilindro();
        this.b2.dibujarcilindro();
        this.b3.dibujarcilindro();
        this.b4.dibujarcilindro();
        this.pm.dibujarcilindro();
        this.mesa.dibujarcilindro();

        gl.glPopMatrix();
    }
    
}
