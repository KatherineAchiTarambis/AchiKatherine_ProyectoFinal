
package org.yourorghere;

import javax.media.opengl.GL;

public class Malla {
    GL gl;
    float x, y, z;
    float w, h, d;
    float rx, ry, rz;
    float r, g, b;
    
    Cilindro p1, p2, p3, p4;

    public Malla(GL gl, float x, float y, float z, float w, float h, float d, float rx, float ry, float rz, float r, float g, float b) {
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
        this.p1=new Cilindro(gl, 0.45f, 0f, 0, 0.03f, 0.03f, 1.2f, -90, 0, 0, 1f, 1f, 1f, 10, 10, 0.3f, 0.3f);
        this.p2=new Cilindro(gl, -0.45f, 0f, 0, 0.03f, 0.03f, 1.2f, -90, 0, 0, 1f, 1f, 1f, 10, 10, 0.3f, 0.3f);
        this.p3=new Cilindro(gl, -0.44f, 0.35f, 00f, 0.03f, 0.03f, 3f, 0, 90, 0, 1f, 1f, 1f, 10, 10, 0.3f, 0.3f);
        this.p4=new Cilindro(gl, -0.44f, -0.35f, 00f, 0.03f, 0.03f, 3f, 0, 90, 0, 1f, 1f, 1f, 10, 10, 0.3f, 0.3f);
    }
    public void dibujarmalla() {
        gl.glPushMatrix();
        gl.glTranslatef(x, y, z);
        gl.glRotatef(this.rx, 1, 0, 0);
        gl.glRotatef(this.ry, 0, 1, 0);
        gl.glRotatef(this.rz, 0, 0, 1);
        gl.glScalef(w, h, d);
                
        this.p1.dibujarcilindro();
        this.p2.dibujarcilindro();
        this.p3.dibujarcilindro();
        this.p4.dibujarcilindro();
        

//        this.rx = rx + 0.8f;
        //this.ry = ry + 0.8f;
////        this.rz = rz + 0.8f;
//        do {
//            this.h = h + 0.01f;
//            //this.w = w + 0.01f;
//        } while (h < 10);
        gl.glPopMatrix();
    }

}
