package org.yourorghere;

import java.util.ArrayList;
import javax.media.opengl.GL;

public class Cesped {

    GL gl;
    float x, y, z;
    float w, h, d;
    float rx, ry, rz;
    float r, g, b;

    Cubo cesped;
    public ArrayList<Cilindro> h1 = new ArrayList<Cilindro>();
    Cilindro v1, h2, h3, h4;

    public Cesped(GL gl, float x, float y, float z, float w, float h, float d, float rx, float ry, float rz, float r, float g, float b) {
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
        this.cesped = new Cubo(gl, 0, 0, 0, 0.5f, 0f, 0.5f, 0, 0, 0, 0f, 0.9f, 0f, 0f, 0.9f, 0f);
        for (int i = -8; i < 8; i++) {
            for (int j = -8; j < 8; j++) {
                h1.add(new Cilindro(gl, i * 0.06f, 0f, j * 0.06f, 0.02f, 0.02f, 0.5f, -90, 20, 0, 0.1f, 1f, 0.3f, 10, 10, 0.3f, 0.3f));
            }
        }
    }

    public void dibujarcesped() {
        gl.glPushMatrix();
        gl.glTranslatef(x, y, z);
        gl.glRotatef(this.rx, 1, 0, 0);
        gl.glRotatef(this.ry, 0, 1, 0);
        gl.glRotatef(this.rz, 0, 0, 1);
        gl.glScalef(w, h, d);
        this.cesped.dibuja();
        for (Cilindro v1 : h1) {
            v1.dibujarcilindro();
        }
        gl.glPopMatrix();
    }

}
