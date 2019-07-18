package org.yourorghere;

import java.util.ArrayList;
import javax.media.opengl.GL;

public class Pavimento {

    GL gl;
    float x, y, z;
    float w, h, d;
    float rx, ry, rz;
    float r, g, b;
    public ArrayList<Lineas> pav = new ArrayList<Lineas>();
    Lineas pol;

    public Pavimento(GL gl, float x, float y, float z, float w, float h, float d, float rx, float ry, float rz, float r, float g, float b) {
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
        for (int i = -29; i < 29; i++) {
            for (int j = -15; j < 20; j++) {
                pav.add(new Lineas(gl, 0.17f*i, 0.01f, j*0.3f, 0.08f, 0.08f, 90, 0, 0, 0.6f, 0.6f, 0.5f));   
            }               
            }
        for (int i = -29; i < 29; i++) {
            for (int j = -15; j < 20; j++) {
                pav.add(new Lineas(gl, 0.17f*i+0.08f, 0.01f, j*0.3f+0.15f, 0.08f, 0.08f, 90, 0, 0, 0.6f, 0.6f, 0.5f));
            }
            }
        
    }

    public void dibujarpavimento() {
        gl.glPushMatrix();
        gl.glTranslatef(x, y, z);
        gl.glRotatef(this.rx, 1, 0, 0);
        gl.glRotatef(this.ry, 0, 1, 0);
        gl.glRotatef(this.rz, 0, 0, 1);
        gl.glScalef(w, h, d);
        for (Lineas pol : pav) {
                pol.dibujarpentagono();
            }
        gl.glPopMatrix();
    }
}
