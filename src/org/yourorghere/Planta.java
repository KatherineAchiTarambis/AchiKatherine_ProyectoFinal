package org.yourorghere;

import javax.media.opengl.GL;

public class Planta {

    GL gl;
    float x, y, z;
    float w, h, d;
    float rx, ry, rz;
    float r, g, b;
    Cilindro tallo;
    Esfera h1,h2,h3,h4,h5,h6,h7,h8,h9,h10,h11;
    

    public Planta(GL gl, float x, float y, float z, float w, float h, float d, float rx, float ry, float rz, float r, float g, float b) {
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
        this.tallo=new Cilindro(gl, 0, 0f, 0, 0.2f, 0.2f, 3f, -90, 0, 0, 0.8f, 0.5f, 0f, 10, 10, 0.3f, 0.3f);
        this.h1 = new Esfera(gl, 0.28f, 1f, 0, 0.10f, 0.5f, 0.10f, 90, 30, 90, 0.5f, 0.8f, 0.3f, 10, 60);
        this.h2 = new Esfera(gl, 0.28f, 0.8f, 0, 0.10f, 0.5f, 0.10f, 90, 30, 90, 0.3f, 1, 0.2f, 10, 60);
        this.h3 = new Esfera(gl, 0.28f, 0.6f, 0, 0.10f, 0.5f, 0.10f, 90, 30, 90, 0.5f, 0.8f, 0.3f, 10, 60);
        this.h4 = new Esfera(gl, 0.28f, 0.4f, 0, 0.10f, 0.5f, 0.10f, 90, 30, 90, 0.3f, 1, 0.2f, 10, 60);
        this.h5 = new Esfera(gl, 0.28f, 0.2f, 0, 0.10f, 0.5f, 0.10f, 90, 30, 90, 0.5f, 0.8f, 0.3f, 10, 60);
        this.h6 = new Esfera(gl, -0.28f, 1f, 0, 0.10f, 0.5f, 0.10f, 90, 150, 90, 0.3f, 1, 0.2f, 10, 60);
        this.h7 = new Esfera(gl, -0.28f, 0.8f, 0, 0.10f, 0.5f, 0.10f, 90, 150, 90, 0.5f, 0.8f, 0.3f, 10, 60);
        this.h8 = new Esfera(gl, -0.28f, 0.6f, 0, 0.10f, 0.5f, 0.10f, 90, 150, 90, 0.3f, 1, 0.2f, 10, 60);
        this.h9 = new Esfera(gl, -0.28f, 0.4f, 0, 0.10f, 0.5f, 0.10f, 90, 150, 90, 0.5f, 0.8f, 0.3f, 10, 60);
        this.h10 = new Esfera(gl, -0.28f,0.2f, 0, 0.10f, 0.5f, 0.10f, 90, 150, 90, 0.3f, 1, 0.2f, 10, 60);
        this.h11 = new Esfera(gl, 0,1.1f, 0, 0.10f, 0.5f, 0.10f, 0, 0, 0, 0.5f, 0.8f, 0.3f, 10, 60);
    }
    public void dibujarplanta() {
        gl.glPushMatrix();
        gl.glTranslatef(x, y, z);
        gl.glRotatef(this.rx, 1, 0, 0);
        gl.glRotatef(this.ry, 0, 1, 0);
        gl.glRotatef(this.rz, 0, 0, 1);
        gl.glScalef(w, h, d);
        this.tallo.dibujarcilindro();
        this.h1.dibujaresfera();
        this.h2.dibujaresfera();
        this.h3.dibujaresfera();
        this.h4.dibujaresfera();
        this.h5.dibujaresfera();
        this.h6.dibujaresfera();
        this.h7.dibujaresfera();
        this.h8.dibujaresfera();
        this.h9.dibujaresfera();
        this.h10.dibujaresfera();
        this.h11.dibujaresfera();

        gl.glEnd();
        gl.glPopMatrix();
    }
}
