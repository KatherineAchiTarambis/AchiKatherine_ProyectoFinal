package org.yourorghere;

import javax.media.opengl.GL;

public class Bloques {

    GL gl;
    float x, y, z;
    float w, h, d;
    float rx, ry, rz;
    float r, g, b;

    Cubo piso1fr, piso2fr, piso3fr, piso4fr, terrazafr;
    Cubo piso1at, piso2at, piso3at, piso4at, terrazaat;
    Cubo balcon1, balcon2, balcon3, balcon4;
    Cubo centro;
    Gradas gradas1, gradas2, gradas3, gradas4;
    Gradas gradas5, gradas6, gradas7, gradas8;

    Cuadrado ventanad1, ventanai1, ventanac1;
    Cuadrado ventanad2, ventanai2, ventanac2;
    Cuadrado ventanad3, ventanai3, ventanac3;
    Cuadrado ventanad4, ventanai4, ventanac4;
    Cuadrado ventanad1ad, ventanai1ad, ventanac1ad;
    Cuadrado ventanad2ad, ventanai2ad, ventanac2ad;
    Cuadrado ventanad3ad, ventanai3ad, ventanac3ad;
    Cuadrado ventanad4ad, ventanai4ad, ventanac4ad;

    Cuadrado vi1, vd1, vi2, vd2, vi3, vd3, vi4, vd4;
    Cuadrado ivi1, ivd1, ivi2, ivd2, ivi3, ivd3, ivi4, ivd4;

    Cuadrado pii1, pid1, pii2, pid2, pii3, pid3, pii4, pid4;
    Cuadrado pei1, ped1, pei2, ped2, pei3, ped3, pei4, ped4;

    public Bloques(GL gl, float x, float y, float z, float w, float h, float d, float rx, float ry, float rz) {
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
        this.piso1fr = new Cubo(gl, 0, 0, 0, 0.5f, 0.2f, 0.17f, 0, 0, 0, 0.6f, 0.6f, 0.7f, 0.5f, 0.5f, 0.5f);
        this.piso2fr = new Cubo(gl, 0, 0.4f, -0.01f, 0.5f, 0.2f, 0.18f, 0, 0, 0, 1f, 1f, 0.7f, 1f, 0.9f, 0.6f);
        this.piso3fr = new Cubo(gl, 0, 0.8f, 0, 0.5f, 0.2f, 0.17f, 0, 0, 0, 0.9f, 0.5f, 0f, 1f, 0.6f, 0.3f);
        this.piso4fr = new Cubo(gl, 0, 1.2f, -0.01f, 0.5f, 0.2f, 0.18f, 0, 0, 0, 1f, 1f, 0.7f, 1f, 0.9f, 0.6f);
        this.terrazafr = new Cubo(gl, 0, 1.45f, 0, 0.5f, 0.05f, 0.17f, 0, 0, 0, 0.9f, 0.5f, 0f, 1f, 0.6f, 0.3f);

        this.piso1at = new Cubo(gl, 0, 0, 0.6f, 0.5f, 0.2f, 0.17f, 0, 0, 0, 0.6f, 0.6f, 0.7f, 0.5f, 0.5f, 0.5f);
        this.piso2at = new Cubo(gl, 0, 0.4f, 0.61f, 0.5f, 0.2f, 0.18f, 0, 0, 0, 1f, 1f, 0.7f, 1f, 0.9f, 0.6f);
        this.piso3at = new Cubo(gl, 0, 0.8f, 0.6f, 0.5f, 0.2f, 0.17f, 0, 0, 0, 0.9f, 0.5f, 0f, 1f, 0.6f, 0.3f);
        this.piso4at = new Cubo(gl, 0, 1.2f, 0.61f, 0.5f, 0.2f, 0.18f, 0, 0, 0, 1f, 1f, 0.7f, 1f, 0.9f, 0.6f);
        this.terrazaat = new Cubo(gl, 0, 1.45f, 0.6f, 0.5f, 0.05f, 0.17f, 0, 0, 0, 0.9f, 0.5f, 0f, 1f, 0.6f, 0.3f);

        this.balcon1 = new Cubo(gl, 0, 0.75f, 0.8f, 0.20f, 0.085f, 0.08f, 0, 0, 0, 0.4f, 0.4f, 0.5f, 0.7f, 0.7f, 0.6f);
        this.balcon2 = new Cubo(gl, 0, 1.15f, 0.8f, 0.20f, 0.085f, 0.08f, 0, 0, 0, 0.4f, 0.4f, 0.5f, 0.7f, 0.7f, 0.6f);
        this.balcon3 = new Cubo(gl, 0, 0.75f, -0.2f, 0.20f, 0.085f, 0.08f, 0, 0, 0, 0.4f, 0.4f, 0.5f, 0.7f, 0.7f, 0.6f);
        this.balcon4 = new Cubo(gl, 0, 1.15f, -0.2f, 0.20f, 0.085f, 0.08f, 0, 0, 0, 0.4f, 0.4f, 0.5f, 0.7f, 0.7f, 0.6f);

        this.ventanad1 = new Cuadrado(gl, -0.3f, 0.03f, 0.78f, 0.11f, 0.11f, 0, 0, 0, 0.3f, 0.6f, 0.8f, 1, 1, 1);
        this.ventanai1 = new Cuadrado(gl, 0.3f, 0.03f, 0.78f, 0.11f, 0.11f, 0, 0, 0, 0.3f, 0.6f, 0.8f, 1, 1, 1);
        this.ventanac1 = new Cuadrado(gl, 0f, 0.03f, 0.78f, 0.13f, 0.13f, 0, 0, 0, 0.3f, 0.6f, 0.8f, 1, 1, 1);
        this.ventanad2 = new Cuadrado(gl, -0.3f, 0.43f, 0.80f, 0.11f, 0.11f, 0, 0, 0, 0.3f, 0.6f, 0.8f, 1, 1, 1);
        this.ventanai2 = new Cuadrado(gl, 0.3f, 0.43f, 0.80f, 0.11f, 0.11f, 0, 0, 0, 0.3f, 0.6f, 0.8f, 1, 1, 1);
        this.ventanac2 = new Cuadrado(gl, 0f, 0.43f, 0.80f, 0.13f, 0.13f, 0, 0, 0, 0.3f, 0.6f, 0.8f, 1, 1, 1);
        this.ventanad3 = new Cuadrado(gl, -0.3f, 0.83f, 0.78f, 0.11f, 0.11f, 0, 0, 0, 0.3f, 0.6f, 0.8f, 1, 1, 1);
        this.ventanai3 = new Cuadrado(gl, 0.3f, 0.83f, 0.78f, 0.11f, 0.11f, 0, 0, 0, 0.3f, 0.6f, 0.8f, 1, 1, 1);
        this.ventanac3 = new Cuadrado(gl, 0f, 0.83f, 0.78f, 0.13f, 0.13f, 0, 0, 0, 0.3f, 0.6f, 0.8f, 1, 1, 1);
        this.ventanad4 = new Cuadrado(gl, -0.3f, 1.23f, 0.8f, 0.11f, 0.11f, 0, 0, 0, 0.3f, 0.6f, 0.8f, 1, 1, 1);
        this.ventanai4 = new Cuadrado(gl, 0.3f, 1.23f, 0.8f, 0.11f, 0.11f, 0, 0, 0, 0.3f, 0.6f, 0.8f, 1, 1, 1);
        this.ventanac4 = new Cuadrado(gl, 0f, 1.23f, 0.8f, 0.13f, 0.13f, 0, 0, 0, 0.3f, 0.6f, 0.8f, 1, 1, 1);

        this.ventanad1ad = new Cuadrado(gl, -0.3f, 0.03f, -0.18f, 0.11f, 0.11f, 0, 0, 0, 0.3f, 0.6f, 0.8f, 1, 1, 1);
        this.ventanai1ad = new Cuadrado(gl, 0.3f, 0.03f, -0.18f, 0.11f, 0.11f, 0, 0, 0, 0.3f, 0.6f, 0.8f, 1, 1, 1);
        this.ventanac1ad = new Cuadrado(gl, 0f, 0.03f, -0.18f, 0.13f, 0.13f, 0, 0, 0, 0.3f, 0.6f, 0.8f, 1, 1, 1);
        this.ventanad2ad = new Cuadrado(gl, -0.3f, 0.43f, -0.20f, 0.11f, 0.11f, 0, 0, 0, 0.3f, 0.6f, 0.8f, 1, 1, 1);
        this.ventanai2ad = new Cuadrado(gl, 0.3f, 0.43f, -0.20f, 0.11f, 0.11f, 0, 0, 0, 0.3f, 0.6f, 0.8f, 1, 1, 1);
        this.ventanac2ad = new Cuadrado(gl, 0f, 0.43f, -0.20f, 0.13f, 0.13f, 0, 0, 0, 0.3f, 0.6f, 0.8f, 1, 1, 1);
        this.ventanad3ad = new Cuadrado(gl, -0.3f, 0.83f, -0.18f, 0.11f, 0.11f, 0, 0, 0, 0.3f, 0.6f, 0.8f, 1, 1, 1);
        this.ventanai3ad = new Cuadrado(gl, 0.3f, 0.83f, -0.18f, 0.11f, 0.11f, 0, 0, 0, 0.3f, 0.6f, 0.8f, 1, 1, 1);
        this.ventanac3ad = new Cuadrado(gl, 0f, 0.83f, -0.18f, 0.13f, 0.13f, 0, 0, 0, 0.3f, 0.6f, 0.8f, 1, 1, 1);
        this.ventanad4ad = new Cuadrado(gl, -0.3f, 1.23f, -0.20f, 0.11f, 0.11f, 0, 0, 0, 0.3f, 0.6f, 0.8f, 1, 1, 1);
        this.ventanai4ad = new Cuadrado(gl, 0.3f, 1.23f, -0.20f, 0.11f, 0.11f, 0, 0, 0, 0.3f, 0.6f, 0.8f, 1, 1, 1);
        this.ventanac4ad = new Cuadrado(gl, 0f, 1.23f, -0.20f, 0.13f, 0.13f, 0, 0, 0, 0.3f, 0.6f, 0.8f, 1, 1, 1);

        this.vi1 = new Cuadrado(gl, -0.35f, 0.03f, 0.175f, 0.08f, 0.12f, 0, 0, 0, 0.3f, 0.6f, 0.8f, 1, 1, 1);
        this.vd1 = new Cuadrado(gl, 0.35f, 0.03f, 0.175f, 0.08f, 0.12f, 0, 0, 0, 0.3f, 0.6f, 0.8f, 1, 1, 1);
        this.vi2 = new Cuadrado(gl, -0.35f, 0.43f, 0.175f, 0.08f, 0.12f, 0, 0, 0, 0.3f, 0.6f, 0.8f, 1, 1, 1);
        this.vd2 = new Cuadrado(gl, 0.35f, 0.43f, 0.175f, 0.08f, 0.12f, 0, 0, 0, 0.3f, 0.6f, 0.8f, 1, 1, 1);
        this.vi3 = new Cuadrado(gl, -0.35f, 0.83f, 0.175f, 0.08f, 0.12f, 0, 0, 0, 0.3f, 0.6f, 0.8f, 1, 1, 1);
        this.vd3 = new Cuadrado(gl, 0.35f, 0.83f, 0.175f, 0.08f, 0.12f, 0, 0, 0, 0.3f, 0.6f, 0.8f, 1, 1, 1);
        this.vi4 = new Cuadrado(gl, -0.35f, 1.23f, 0.175f, 0.08f, 0.12f, 0, 0, 0, 0.3f, 0.6f, 0.8f, 1, 1, 1);
        this.vd4 = new Cuadrado(gl, 0.35f, 1.23f, 0.175f, 0.08f, 0.12f, 0, 0, 0, 0.3f, 0.6f, 0.8f, 1, 1, 1);

        this.ivi1 = new Cuadrado(gl, -0.35f, 0.03f, 0.42f, 0.08f, 0.12f, 0, 0, 0, 0.3f, 0.6f, 0.8f, 1, 1, 1);
        this.ivd1 = new Cuadrado(gl, 0.35f, 0.03f, 0.42f, 0.08f, 0.12f, 0, 0, 0, 0.3f, 0.6f, 0.8f, 1, 1, 1);
        this.ivi2 = new Cuadrado(gl, -0.35f, 0.43f, 0.42f, 0.08f, 0.12f, 0, 0, 0, 0.3f, 0.6f, 0.8f, 1, 1, 1);
        this.ivd2 = new Cuadrado(gl, 0.35f, 0.43f, 0.42f, 0.08f, 0.12f, 0, 0, 0, 0.3f, 0.6f, 0.8f, 1, 1, 1);
        this.ivi3 = new Cuadrado(gl, -0.35f, 0.83f, 0.42f, 0.08f, 0.12f, 0, 0, 0, 0.3f, 0.6f, 0.8f, 1, 1, 1);
        this.ivd3 = new Cuadrado(gl, 0.35f, 0.83f, 0.42f, 0.08f, 0.12f, 0, 0, 0, 0.3f, 0.6f, 0.8f, 1, 1, 1);
        this.ivi4 = new Cuadrado(gl, -0.35f, 1.23f, 0.42f, 0.08f, 0.12f, 0, 0, 0, 0.3f, 0.6f, 0.8f, 1, 1, 1);
        this.ivd4 = new Cuadrado(gl, 0.35f, 1.23f, 0.42f, 0.08f, 0.12f, 0, 0, 0, 0.3f, 0.6f, 0.8f, 1, 1, 1);

        this.pii1 = new Cuadrado(gl, -0.15f, 0.02f, 0.175f, 0.08f, 0.16f, 0, 0, 0, 1, 1, 1, 1, 1, 1);
        this.pid1 = new Cuadrado(gl, 0.15f, 0.02f, 0.175f, 0.08f, 0.16f, 0, 0, 0, 1, 1, 1, 1, 1, 1);
        this.pii2 = new Cuadrado(gl, -0.15f, 0.42f, 0.175f, 0.08f, 0.16f, 0, 0, 0, 1, 1, 1, 1, 1, 1);
        this.pid2 = new Cuadrado(gl, 0.15f, 0.42f, 0.175f, 0.08f, 0.16f, 0, 0, 0, 1, 1, 1, 1, 1, 1);
        this.pii3 = new Cuadrado(gl, -0.15f, 0.82f, 0.175f, 0.08f, 0.16f, 0, 0, 0, 1, 1, 1, 1, 1, 1);
        this.pid3 = new Cuadrado(gl, 0.15f, 0.82f, 0.175f, 0.08f, 0.16f, 0, 0, 0, 1, 1, 1, 1, 1, 1);
        this.pii4 = new Cuadrado(gl, -0.15f, 1.22f, 0.175f, 0.08f, 0.16f, 0, 0, 0, 1, 1, 1, 1, 1, 1);
        this.pid4 = new Cuadrado(gl, 0.15f, 1.22f, 0.175f, 0.08f, 0.16f, 0, 0, 0, 1, 1, 1, 1, 1, 1);

        this.pei1 = new Cuadrado(gl, -0.15f, 0.02f, 0.42f, 0.08f, 0.16f, 0, 0, 0, 1, 1, 1, 1, 1, 1);
        this.ped1 = new Cuadrado(gl, 0.15f, 0.02f, 0.42f, 0.08f, 0.16f, 0, 0, 0, 1, 1, 1, 1, 1, 1);
        this.pei2 = new Cuadrado(gl, -0.15f, 0.42f, 0.42f, 0.08f, 0.16f, 0, 0, 0, 1, 1, 1, 1, 1, 1);
        this.ped2 = new Cuadrado(gl, 0.15f, 0.42f, 0.42f, 0.08f, 0.16f, 0, 0, 0, 1, 1, 1, 1, 1, 1);
        this.pei3 = new Cuadrado(gl, -0.15f, 0.82f, 0.42f, 0.08f, 0.16f, 0, 0, 0, 1, 1, 1, 1, 1, 1);
        this.ped3 = new Cuadrado(gl, 0.15f, 0.82f, 0.42f, 0.08f, 0.16f, 0, 0, 0, 1, 1, 1, 1, 1, 1);
        this.pei4 = new Cuadrado(gl, -0.15f, 1.22f, 0.42f, 0.08f, 0.16f, 0, 0, 0, 1, 1, 1, 1, 1, 1);
        this.ped4 = new Cuadrado(gl, 0.15f, 1.22f, 0.42f, 0.08f, 0.16f, 0, 0, 0, 1, 1, 1, 1, 1, 1);

        this.gradas1 = new Gradas(gl, -0.05f, -0.18f, 0.225f, 0.13f, 0.15f, 0.13f, 0, 0, 0, 1, 1, 1);
        this.gradas2 = new Gradas(gl, -0.05f, 0.20f, 0.36f, 0.13f, 0.15f, 0.13f, 0, 180, 0, 1, 1, 1);
        this.gradas3 = new Gradas(gl, -0.05f, 0.60f, 0.225f, 0.13f, 0.15f, 0.13f, 0, 0, 0, 1, 1, 1);
        this.gradas4 = new Gradas(gl, -0.05f, 1.1f, 0.36f, 0.13f, 0.15f, 0.13f, 0, 180, 0, 1, 1, 1);
        this.gradas5 = new Gradas(gl, -0.05f, -0.18f, 0.36f, 0.13f, 0.15f, 0.13f, 0, 180, 0, 1, 1, 1);
        this.gradas6 = new Gradas(gl, -0.05f, 0.20f, 0.225f, 0.13f, 0.15f, 0.13f, 0, 0, 0, 1, 1, 1);
        this.gradas7 = new Gradas(gl, -0.05f, 0.60f, 0.36f, 0.13f, 0.15f, 0.13f, 0, 180, 0, 1, 1, 1);
        this.gradas8 = new Gradas(gl, -0.05f, 1.1f, 0.225f, 0.13f, 0.15f, 0.13f, 0, 0, 0, 1, 1, 1);
        this.centro = new Cubo(gl, -0.05f, 0.6f, 0.29f, 0.08f, 0.8f, 0.05f, 0, 0, 0, 0.9f, 0.5f, 0f, 1f, 0.6f, 0.3f);
//        
//        this.ventana2 = new Cuadrado(gl, 0.1f, 0.1f, 0.21f, 0.05f, 0.05f, 0, 0, 0, 0.3f, 0.6f, 0.8f, 1, 1, 1);
    }

    public void dibuja() {
        gl.glPushMatrix();
        gl.glTranslatef(x, y, z);
        gl.glRotatef(this.rx, 1, 0, 0);
        gl.glRotatef(this.ry, 0, 1, 0);
        gl.glRotatef(this.rz, 0, 0, 1);
        gl.glScalef(w, h, d);
        this.piso1fr.dibuja();
        this.piso2fr.dibuja();
        this.piso3fr.dibuja();
        this.piso4fr.dibuja();
        this.terrazafr.dibuja();
        this.piso1at.dibuja();
        this.piso2at.dibuja();
        this.piso3at.dibuja();
        this.piso4at.dibuja();
        this.terrazaat.dibuja();
        this.balcon1.dibuja();
        this.balcon2.dibuja();
        this.balcon3.dibuja();
        this.balcon4.dibuja();
//        this.techo.dibuja();
//        this.puerta.dibuja();
        this.ventanad1.dibuja();
        this.ventanai1.dibuja();
        this.ventanac1.dibuja();
        this.ventanad2.dibuja();
        this.ventanai2.dibuja();
        this.ventanac2.dibuja();
        this.ventanad3.dibuja();
        this.ventanai3.dibuja();
        this.ventanac3.dibuja();
        this.ventanad4.dibuja();
        this.ventanai4.dibuja();
        this.ventanac4.dibuja();

        this.ventanad1ad.dibuja();
        this.ventanai1ad.dibuja();
        this.ventanac1ad.dibuja();
        this.ventanad2ad.dibuja();
        this.ventanai2ad.dibuja();
        this.ventanac2ad.dibuja();
        this.ventanad3ad.dibuja();
        this.ventanai3ad.dibuja();
        this.ventanac3ad.dibuja();
        this.ventanad4ad.dibuja();
        this.ventanai4ad.dibuja();
        this.ventanac4ad.dibuja();

        this.vi1.dibuja();
        this.vd1.dibuja();
        this.vi2.dibuja();
        this.vd2.dibuja();
        this.vi3.dibuja();
        this.vd3.dibuja();
        this.vi4.dibuja();
        this.vd4.dibuja();

        this.ivi1.dibuja();
        this.ivd1.dibuja();
        this.ivi2.dibuja();
        this.ivd2.dibuja();
        this.ivi3.dibuja();
        this.ivd3.dibuja();
        this.ivi4.dibuja();
        this.ivd4.dibuja();

        this.pii1.dibuja();
        this.pid1.dibuja();
        this.pii2.dibuja();
        this.pid2.dibuja();
        this.pii3.dibuja();
        this.pid3.dibuja();
        this.pii4.dibuja();
        this.pid4.dibuja();

        this.pei1.dibuja();
        this.ped1.dibuja();
        this.pei2.dibuja();
        this.ped2.dibuja();
        this.pei3.dibuja();
        this.ped3.dibuja();
        this.pei4.dibuja();
        this.ped4.dibuja();
        this.gradas1.dibuja();
        this.gradas2.dibuja();
        this.gradas3.dibuja();
        this.gradas4.dibuja();
        this.gradas5.dibuja();
        this.gradas6.dibuja();
        this.gradas7.dibuja();
        this.gradas8.dibuja();
        this.centro.dibuja();

        gl.glPopMatrix();
    }

}
