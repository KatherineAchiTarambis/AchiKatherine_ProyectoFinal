
package org.yourorghere;

import javax.media.opengl.GL;

public class Vereda {
    GL gl;
    float x, y, z;
    float w, h, d;
    float rx, ry, rz;
    float r, g, b;

    Cubo vereda,fil1,fil2,fil3;

    public Vereda(GL gl, float x, float y, float z, float w, float h, float d, float rx, float ry, float rz, float r, float g, float b) {
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
        this.vereda = new Cubo(gl, 0, 0, 0, 1f, 0.1f, 1f, 0, 0, 0, 0.5f, 0.5f, 0.5f, 0.2f, 0.2f, 0.2f);
        this.fil1 = new Cubo(gl, 0, 0, -1.1f, 1f, 0.1f, 0.1f, 0, 0, 0, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f);
        
    }
    
    public void dibujarvereda() {
        gl.glPushMatrix();
        gl.glTranslatef(x, y, z);
        gl.glRotatef(this.rx, 1, 0, 0);
        gl.glRotatef(this.ry, 0, 1, 0);
        gl.glRotatef(this.rz, 0, 0, 1);
        gl.glScalef(w, h, d);
        this.vereda.dibuja();
        this.fil1.dibuja();
        gl.glPopMatrix();
    }
    
}
