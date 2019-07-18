package org.yourorghere;

import javax.media.opengl.GL;

public class CanchaVolley {

    GL gl;
    float x, y, z;
    float w, h, d;
    float rx, ry, rz;
    float r, g, b;

    Cubo piso;
    Lineas lineaaf;
    Lineas lineat, linea1, cuad1, cuad2, cp1, cp2;
    
    Cilindro poste1,poste2,pa1;

    public CanchaVolley(GL gl, float x, float y, float z, float w, float h, float d, float rx, float ry, float rz, float r, float g, float b) {
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
        this.piso = new Cubo(gl, 0, 0, 0, 0.5f, 0f, 1f, 0, 0, 0, 0f, 0f, 1, 0f, 0f, 1f);
        this.lineaaf = new Lineas(gl, 0f, 0f, 0f, 0.5f, 1, 90, 0, 0, 0, 0, 0);
        this.lineat = new Lineas(gl, 0f, 0f, 0f, 0.45f, 0.95f, 90, 0, 0, 1, 1, 1);
        this.linea1 = new Lineas(gl, 0f, 0f, 0.475f, 0.45f, 0.475f, 90, 0, 0, 1, 1, 1);
        this.cuad1 = new Lineas(gl, 0f, 0f, 0.78f, 0.35f, 0.17f, 90, 0, 0, 1, 1, 1);
        this.cuad2 = new Lineas(gl, 0f, 0f, -0.78f, 0.35f, 0.17f, 90, 0, 0, 1, 1, 1);
        this.cp1 = new Lineas(gl, 0f, 0f, 0.9f, 0.17f, 0.05f, 90, 0, 0, 1, 1, 1);
        this.cp2 = new Lineas(gl, 0f, 0f, -0.9f, 0.17f, 0.05f, 90, 0, 0, 1, 1, 1);
        
        this.poste1=new Cilindro(gl, 0.45f, 0f, 0, 0.03f, 0.03f, 1.2f, -90, 0, 0, 1f, 1f, 1f, 10, 10, 0.3f, 0.3f);
        this.poste2=new Cilindro(gl, -0.45f, 0f, 0, 0.03f, 0.03f, 1.2f, -90, 0, 0, 1f, 1f, 1f, 10, 10, 0.3f, 0.3f);
        this.pa1=new Cilindro(gl, -0.44f, 0.35f, 00f, 0.03f, 0.03f, 3f, 0, 90, 0, 1f, 1f, 1f, 10, 10, 0.3f, 0.3f);
        

    }

    public void dibujarcancha() {
        gl.glPushMatrix();
        gl.glTranslatef(x, y, z);
        gl.glRotatef(this.rx, 1, 0, 0);
        gl.glRotatef(this.ry, 0, 1, 0);
        gl.glRotatef(this.rz, 0, 0, 1);
        gl.glScalef(w, h, d);
        this.piso.dibuja();
        this.lineaaf.dibujarcuadradolineas();
        this.lineat.dibujarcuadradolineas();
        this.linea1.dibujarcuadradolineas();
        this.cuad1.dibujarcuadradolineas();
        this.cuad2.dibujarcuadradolineas();
        this.cp1.dibujarcuadradolineas();
        this.cp2.dibujarcuadradolineas();
        
        this.poste1.dibujarcilindro();
        this.poste2.dibujarcilindro();
        this.pa1.dibujarcilindro();
        

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
