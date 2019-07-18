
package org.yourorghere;

import javax.media.opengl.GL;

public class Poste {
     GL gl;
    float x, y, z;
    float w, h, d;
    float rx, ry, rz;
    float r, g, b;
    Cilindro poste,c1,c2,c3;
    Esfera l1,l2;

    public Poste(GL gl, float x, float y, float z, float w, float h, float d, float rx, float ry, float rz, float r, float g, float b) {
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
        this.poste=new Cilindro(gl, 0f, 0f, 0f, 0.25f, 0.25f, 12f, -90, 0, 0, 0.5f, 0.6f, 0.5f, 10, 10, 0.3f, 0.3f);
        this.c1=new Cilindro(gl, 0f, 2.5f, 0f, 0.10f, 0.10f, 4f, 0, 0, 0, 0.5f, 0.6f, 0.5f, 10, 10, 0.3f, 0.3f);
        this.c2=new Cilindro(gl, 0f, 1.9f, -0.6f, 0.10f, 0.10f, 4f, 0, 0, 0, 0.5f, 0.6f, 0.5f, 10, 10, 0.3f, 0.3f);
        this.c3=new Cilindro(gl, 0f, 3f, -0.4f, 0.10f, 0.10f, 3f, 0, 0, 0, 0.5f, 0.6f, 0.5f, 10, 10, 0.3f, 0.3f);
        this.l1=new Esfera(gl, 0f, 2.2f, 1.2f, 0.4f, 0.4f, 0.4f, 0, 0, 0, 1f, 1, 0f, 50, 50);
        this.l2=new Esfera(gl, 0f, 2.3f, 1.2f, 0.4f, 0.4f, 0.4f, 0, 90, 0, 0.5f, 0.6f, 0.5f, 30, 30);

    }
     public void dibujarposte() {
        gl.glPushMatrix();
        gl.glTranslatef(x, y, z);
        gl.glRotatef(this.rx, 1, 0, 0);
        gl.glRotatef(this.ry, 0, 1, 0);
        gl.glRotatef(this.rz, 0, 0, 1);
        gl.glScalef(w, h, d);
        this.poste.dibujarcilindro();
        this.c1.dibujarcilindro();
        this.c2.dibujarcilindro();
        this.c3.dibujarcilindro();
        this.c3.dibujarcilindro();
        this.l1.dibujaresfera();
        this.l2.dibujaresfera();

        gl.glPopMatrix();
    }

}
