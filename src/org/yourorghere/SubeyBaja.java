
package org.yourorghere;

import javax.media.opengl.GL;

public class SubeyBaja {
    GL gl;
    float x, y, z;
    float w, h, d;
    float rx, ry, rz;
    float r, g, b;
    Cilindro t1, t2, t3, t4, t5;
    Cilindro c1, c2, c3,c4,c5,c6;
    Cubo a1,a2,a3,a4,a5,a6;

    public SubeyBaja(GL gl, float x, float y, float z, float w, float h, float d, float rx, float ry, float rz, float r, float g, float b) {
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
        this.t1 = new Cilindro(gl, 0f, 0f, 0f, 2f, 2f, 40f, -75, 0, 0, 1f, 0f, 0f, 10, 10, 0.3f, 0.3f);
        this.t2 = new Cilindro(gl, 0f, 0f, 7f, 2f, 2f, 40f, -105, 0, 0, 1f, 0f, 0f, 10, 10, 0.3f, 0.3f);
        this.t3 = new Cilindro(gl, 30f, 0f, 0f, 2f, 2f, 40f, -75, 0, 0, 1f, 0f, 0f, 10, 10, 0.3f, 0.3f);
        this.t4 = new Cilindro(gl, 30f, 0f, 7f, 2f, 2f, 40f, -105, 0, 0, 1f, 0f, 0f, 10, 10, 0.3f, 0.3f);
        this.t5 = new Cilindro(gl, 0f, 11.5f, 3.25f, 2f, 2f, 100, 0, 90, 0, 1f, 0.6f, 0f, 10, 10, 0.3f, 0.3f);
        this.c1 = new Cilindro(gl, 5f, 15.5f, -8f, 2f, 2f, 75, 20, 0, 0, 1f, 0, 0, 10, 10, 0.3f, 0.3f);
        this.c2 = new Cilindro(gl, 15f, 7f, -8f, 2f, 2f, 75, -20, 0, 0, 1f, 0, 0, 10, 10, 0.3f, 0.3f);
        this.c3 = new Cilindro(gl, 25f, 15.5f, -8f, 2f, 2f, 75, 20, 0, 0, 1f, 0, 0, 10, 10, 0.3f, 0.3f);
        
        this.a1=new Cubo(gl, 25.5f, 7f, 15f, 2f, 0.5f, 2.5f, 0, 0, 0, 1f, 1f, 0f, 1f, 1f, 0);
        this.a2=new Cubo(gl, 15.5f, 14.5f, 15.5f, 2f, 0.5f, 2.5f, 0, 0, 0, 1f, 1f, 0f, 1f, 1f, 0);
        this.a3=new Cubo(gl, 5.5f, 7f, 15f, 2f, 0.5f, 2.5f, 0, 0, 0, 1f, 1f, 0f, 1f, 1f, 0);
        this.a4=new Cubo(gl, 25.5f, 16f, -9f, 2f, 0.5f, 2.5f, 0, 0, 0, 1f, 1f, 0f, 1f, 1f, 0);
        this.a5=new Cubo(gl, 15.5f, 7f, -9f, 2f, 0.5f, 2.5f, 0, 0, 0, 1f, 1f, 0f, 1f, 1f, 0);
        this.a6=new Cubo(gl, 5.5f, 16f, -9f, 2f, 0.5f, 2.5f, 0, 0, 0, 1f, 1f, 0f, 1f, 1f, 0);

    }

    public void dibujarsyb() {
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
        this.c1.dibujarcilindro();
        this.c2.dibujarcilindro();
        this.c3.dibujarcilindro();
        this.a1.dibuja();
        this.a2.dibuja();
        this.a3.dibuja();
        this.a4.dibuja();
        this.a5.dibuja();
        this.a6.dibuja();
        gl.glPopMatrix();
        gl.glEnd();
    
    }
    
}
