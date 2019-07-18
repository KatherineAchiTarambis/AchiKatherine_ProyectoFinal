package org.yourorghere;

import com.sun.opengl.util.Animator;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import static java.nio.file.Files.size;
import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCanvas;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;
import com.sun.opengl.util.GLUT;
import java.awt.event.KeyEvent;
import javax.media.opengl.GLCapabilities;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import org.yourorghere.Cubo;

public class AchiKatherine_Proyecto extends JFrame implements KeyListener {

    //////////////FIJO//////////////////////////////////////
    public ArrayList<Bloques> bloques = new ArrayList<Bloques>();
    public ArrayList<Cesped> cesped = new ArrayList<Cesped>();
    public ArrayList<Casa> casa = new ArrayList<Casa>();
    public ArrayList<Planta> planta = new ArrayList<Planta>();
    public ArrayList<Cercado> malla = new ArrayList<Cercado>();
    public ArrayList<ArbolEsfera> ae = new ArrayList<ArbolEsfera>();
    public ArrayList<ArbolPir> ap = new ArrayList<ArbolPir>();
    public ArrayList<ArbolEsferamult> aem = new ArrayList<ArbolEsferamult>();
    public ArrayList<ArbolCubo> ac = new ArrayList<ArbolCubo>();

    Cubo cam;
    Cuadrado suelo, tierra;
    CanchaFutbol cancha;
    CanchaVolley cancha2;
    Casa c;
    Bloques b;
    Gradas grada1, grada2;
    Cesped h1, h2, h3, h4, h5, h6, h7, h8, h9, h10;
    Bancas banca1, banca2, banca3, bancam, bancam2, bancam3;
    Bolitas bol1, bol2, bol3,bol4,bol5,bol6,bol7;
    Pavimento pav;
    Vereda ver1, ver2, ver3, ver4, ver5, ver6, ver7, ver8, ver9, ver10, ver11, ver12, ver13, ver14, ver15, ver16, ver17, ver18, ver19, ver20, ver21;
    Poste pos1, pos2, pos3, pos4, pos5, pos6, pos7, pos9, pos10, pos12, pos13, pos14, pos15, pos16;
    Poste p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18;
    Planta pl;
    Cercado mal, m1, m2;
    Cuadrado c1, c2, c3, c4, c5, c6, c7, c8;
    Carro car1, car2, car3, car4, car5, car6, car7, car8, car9, car10, car11, car12, car13, car14, car15, car16, car17, car18, car19;
    Columpio col1, col2, col3, col4, col5, col6;
    EscaleraChina esc1, esc2, esc3;
    SubeyBaja syb1, syb2, syb3, syb4, syb5, syb6;
    Resbaladera res1, res2, res3, res4;
    Llantas llan1, llan2, llan3, llan4, llan5;
    JuegoMalla j1, j2;
    ArbolEsfera aep1, aeg1, aep2, aeg2, aep3, aeg3, aep4, aeg4;
    ArbolPir app1, apg1, app2, apg2, app3, apg3, app4, apg4;
    ArbolEsferamult aemp1, aemg1, aemp2, aemg2, aemp3, aemg3, aemp4, aemg4;
    ArbolCubo acp1, acg1, acp2, acg2, acp3, acg3, acp4, acg4;
    ////////////////////////////////////////////////////////////////

    public static int ncam = 1;
    float rotar, angulo;
    float x = 0;
    float y = 0;
    float z = -10;

    public AchiKatherine_Proyecto() {
        setTitle("Proyecto Final");
        setSize(700, 700);
        setLocation(10, 40);

        // Intancia de clase GraphicListener
        GraphicListener listener = new GraphicListener();
        GLCanvas canvas = new GLCanvas(new GLCapabilities());
        canvas.addGLEventListener(listener);
        getContentPane().add(canvas);
        Animator animator = new Animator(canvas);
        animator.start();

        addKeyListener(this); // Para que canvas reconozca las pulsaciones del teclado

    }

    public static void main(String[] args) {

        AchiKatherine_Proyecto frame = new AchiKatherine_Proyecto();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public class GraphicListener implements GLEventListener {

        public void init(GLAutoDrawable drawable) {
            GL gl = drawable.getGL();
            System.err.println("INIT GL IS: " + gl.getClass().getName());
            gl.setSwapInterval(1);
            gl.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            gl.glShadeModel(GL.GL_SMOOTH);
            gl.glEnable(GL.GL_DEPTH_TEST);
            //*********************************************************************************
            ///////////////////CAMARA/////////////////////////
            cam = new Cubo(gl, 0, 0, 0, 100, 100, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0);

            ///////////////////PISO//////////////////////////////////////
            suelo = new Cuadrado(gl, 0, -20, 5, 60f, 65f, 90, 0, 0, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f);

            ///////////////////////////////////Bloques////////////////////////////////////////////
            for (int i = -3; i < 1; i++) {
                bloques.add(new Bloques(gl, -40, -18.9f, 40 + 6 * i, 6, 6, 6, 0, 90, 0));
                bloques.add(new Bloques(gl, -40, -18.9f, 6 * i, 6, 6, 6, 0, 90, 0));
                bloques.add(new Bloques(gl, -30 - 6 * i, -18.9f, 52.5f, 6, 6, 6, 0, 00, 0));
                bloques.add(new Bloques(gl, 10 - 6 * i, -18.9f, 52.5f, 6, 6, 6, 0, 00, 0));
                bloques.add(new Bloques(gl, 35, -18.9f, 40 + 6 * i, 6, 6, 6, 0, 90, 0));
                bloques.add(new Bloques(gl, 35, -18.9f, 6 * i, 6, 6, 6, 0, 90, 0));
            }

            /////////////////////////CANCHAS////////////////////////////////
            cancha = new CanchaFutbol(gl, 38.5f, -19.8f, -39, 13, 11, 11, 0, 90, 0, 1, 1, 1);
            cancha2 = new CanchaVolley(gl, 23.5f, -19.8f, -39, 8, 8, 6.5f, 0, 0, 0, 1, 1, 1);

            //////////////////////////GRADERIO///////////////////////////////    
            grada1 = new Gradas(gl, 38, -19.7f, -29.5f, 16, 2, 6, 0, 0, 0, 1, 1, 1);
            grada2 = new Gradas(gl, 17, -19.7f, -39f, 9, 2, 5, 0, 270, 0, 1, 1, 1);

            ///////////////////////////TIERRA///////////////////////
            tierra = new Cuadrado(gl, 31, -19.85f, -36, 19f, 10f, 90, 0, 0, 0.5f, 0.3f, 0f, 0.5f, 0.3f, 0f);

            //////////////////////CESPED//////////////////////////////////////
            for (int i = 0; i < 3; i++) {
                cesped.add(new Cesped(gl, -42.6f, -19.7f, 13.5f * i + 26.5f, 13.5f, 3, 15, 0, 90, 0, 1, 1, 1));
            }
            for (int i = 0; i < 6; i++) {
                cesped.add(new Cesped(gl, 45, -19.7f, 14.4f * i - 19, 15, 3, 10, 0, 90, 0, 1, 1, 1));
            }
            for (int i = 0; i < 1; i++) {
                for (int j = 0; j < 2; j++) {
                    cesped.add(new Cesped(gl, 10 * j - 30.5f, -19.7f, 15 * i + 27.5f, 17, 3, 10, 0, 90, 0, 1, 1, 1));
                    cesped.add(new Cesped(gl, 10 * j + 19.5f, -19.7f, 15 * i + 26.5f, 14.5f, 3, 10, 0, 90, 0, 1, 1, 1));
                }
            }
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    cesped.add(new Cesped(gl, 10 * j - 30.5f, -19.7f, 15 * i - 19f, 15, 3, 10, 0, 90, 0, 1, 1, 1));
                    cesped.add(new Cesped(gl, 10 * j + 19.5f, -19.7f, 15 * i - 19f, 15, 3, 10, 0, 90, 0, 1, 1, 1));

                }
            }

            for (int i = 0; i < 1; i++) {
                for (int j = 0; j < 3; j++) {
                    cesped.add(new Cesped(gl, 10 * j + 19.5f, -19.7f, 15 * i + 12f, 15, 3, 10, 0, 90, 0, 1, 1, 1));
                }
            }
            for (int i = 0; i < 1; i++) {
                for (int j = 0; j < 2; j++) {
                    cesped.add(new Cesped(gl, -14 * j - 29.5f, -19.7f, 15 * i - 26f, 10, 3, 10, 0, 00, 0, 1, 1, 1));
                }
            }
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 2; j++) {
                    cesped.add(new Cesped(gl, -11 * j - 31.3f, -19.7f, 10 * i - 40f, 15, 3, 12, 0, 00, 0, 1, 1, 1));
                }
            }
            h2 = new Cesped(gl, 29.5f, -19.7f, 3f, 30, 3, 5, 0, 0, 0, 1, 1, 1);
            h3 = new Cesped(gl, 36.5f, -19.7f, 41f, 37, 3, 8, 0, 90, 0, 1, 1, 1);
            h4 = new Cesped(gl, -45f, -19.7f, -6f, 19, 3, 10, 0, 90, 0, 1, 1, 1);
            h5 = new Cesped(gl, 37f, -19.7f, -21.5f, 10, 3, 10, 0, 270, 0, 1, 1, 1);
            h6 = new Cesped(gl, 12f, -19.7f, -31f, 30, 3, 4.5f, 0, 270, 0, 1, 1, 1);

            ///////////////////////PLANTAS////////////////////////////////
            for (int i = 0; i < 37; i++) {
                planta.add(new Planta(gl, -18, -19.8f, -26.5f + (0.8f) * i, 1, 1, 1, 0, 90, 0, 1, 1, 1));
                planta.add(new Planta(gl, -18, -19.8f, -26.5f + (0.8f) * i, 1, 1, 1, 0, 0, 0, 1, 1, 1));
                planta.add(new Planta(gl, 15.5f, -19.8f, -26.5f + (0.8f) * i, 1, 1, 1, 0, 90, 0, 1, 1, 1));
            }
            for (int i = 0; i < 21; i++) {
                planta.add(new Planta(gl, -18, -19.8f, 19.5f + (0.8f) * i, 1, 1, 1, 0, 90, 0, 1, 1, 1));
                planta.add(new Planta(gl, -18, -19.8f, 19.5f + (0.8f) * i, 1, 1, 1, 0, 0, 0, 1, 1, 1));
                planta.add(new Planta(gl, 15.5f, -19.8f, 17.5f + (0.8f) * i, 1, 1, 1, 0, 90, 0, 1, 1, 1));
                planta.add(new Planta(gl, 15.5f, -19.8f, 17.5f + (0.8f) * i, 1, 1, 1, 0, 0, 0, 1, 1, 1));
                planta.add(new Planta(gl, 15.5f, -19.8f, -26.5f + (0.8f) * i, 1, 1, 1, 0, 0, 0, 1, 1, 1));
            }

            //////////////////////CASAS///////////////////////
            for (int i = 0; i < 5; i++) {
                casa.add(new Casa(gl, 13, -18.5f, 19 + 3.2f * i, 5, 5, 5, 0, 90, 0));
            }
            for (int i = 0; i < 5; i++) {
                casa.add(new Casa(gl, 10.5f, -18.5f, 19 + 3.2f * i, 5, 5, 5, 0, -90, 0));
                casa.add(new Casa(gl, -13f, -18.5f, 20.5f + 3.2f * i, 5, 5, 5, 0, 90, 0));
                casa.add(new Casa(gl, -15.5f, -18.5f, 20.5f + 3.2f * i, 5, 5, 5, 0, -90, 0));
            }

            for (int i = 0; i < 9; i++) {
                casa.add(new Casa(gl, 13, -18.5f, -24.5f + 3.2f * i, 5, 5, 5, 0, 90, 0));
                casa.add(new Casa(gl, 10.5f, -18.5f, -24.5f + 3.2f * i, 5, 5, 5, 0, -90, 0));
                casa.add(new Casa(gl, -13, -18.5f, -24.5f + 3.2f * i, 5, 5, 5, 0, 90, 0));
                casa.add(new Casa(gl, -15.5f, -18.5f, -24.5f + 3.2f * i, 5, 5, 5, 0, -90, 0));
            }

            ///////////////////////////////BANCA//////////////////////////////////
            banca1 = new Bancas(gl, -23, -19.8f, -5, 2.5f, 2.5f, 2.5f, 0, 270, 0, 1, 1, 1);
            banca2 = new Bancas(gl, -23, -19.8f, -21, 2.5f, 2.5f, 2.5f, 0, 270, 0, 1, 1, 1);
            banca3 = new Bancas(gl, -34, -19.8f, -13, 2.5f, 2.5f, 2.5f, 0, 90, 0, 1, 1, 1);
            bancam = new Bancas(gl, -21, -19.8f, 0, 3, 3, 3, 0, 0, 0, 1, 1, 1);
            bancam2 = new Bancas(gl, 38, -19.8f, 8, 3, 3, 3, 0, 0, 0, 1, 1, 1);
            bancam3 = new Bancas(gl, 38, -19.8f, 15, 3, 3, 3, 0, 0, 0, 1, 1, 1);

            ///////////////////////////////////////////////////////////////////
            bol1 = new Bolitas(gl, -29, -19.8f, -5, 1.5f, 1.5f, 1.5f, 0, 90, 0, 1, 1, 1);
            bol2 = new Bolitas(gl, -28, -19.8f, -13, 1.5f, 1.5f, 1.5f, 0, 90, 0, 1, 1, 1);
            bol3 = new Bolitas(gl, -29, -19.8f, -21, 1.5f, 1.5f, 1.5f, 0, 90, 0, 1, 1, 1);
            bol4 = new Bolitas(gl, 44, -19.8f, 50, 1.5f, 1.5f, 1.5f, 0, 90, 0, 1, 1, 1);
            bol5 = new Bolitas(gl, -40, -19.8f, 50, 1.5f, 1.5f, 1.5f, 0, 90, 0, 1, 1, 1);
            bol6 = new Bolitas(gl, 37, -19.8f, 55, 1.5f, 1.5f, 1.5f, 0, 90, 0, 1, 1, 1);
            bol7 = new Bolitas(gl, -46, -19.8f, 55, 1.5f, 1.5f, 1.5f, 0, 90, 0, 1, 1, 1);

            /////////////////////////////PAVIMENTO//////////////////////////////////////
            pav = new Pavimento(gl, 0, -19.99f, 0, 10f, 10f, 10f, 0, 0, 0, 1, 1, 1);

            ///////////////////////////VEREDAS//////////////////////////////////////////
            ver1 = new Vereda(gl, -30.3f, -19.82f, 4.2f, 19.7f, 0.02f, 0.8f, 0, 180, 0, 1, 1, 1);
            ver2 = new Vereda(gl, -30.3f, -19.82f, 18.3f, 19.7f, 0.02f, 0.8f, 0, 0, 0, 1, 1, 1);
            ver3 = new Vereda(gl, -11.3f, -19.82f, 30.3f, 13f, 0.02f, 0.8f, 0, 270, 0, 1, 1, 1);
            ver4 = new Vereda(gl, -25.3f, -19.82f, 36.8f, 15f, 0.02f, 0.8f, 0, 180, 0, 1, 1, 1);
            ver5 = new Vereda(gl, -11.3f, -19.82f, -11.3f, 16f, 0.02f, 0.8f, 0, 270, 0, 1, 1, 1);
            ver6 = new Vereda(gl, -17.5f, -19.82f, -27, 7f, 0.02f, 0.8f, 0, 0, 0, 1, 1, 1);
            ver7 = new Vereda(gl, -23.1f, -19.82f, -36f, 10f, 0.02f, 0.8f, 0, 270, 0, 1, 1, 1);
            ver8 = new Vereda(gl, 9f, -19.82f, -21f, 25f, 0.02f, 0.8f, 0, 90, 0, 1, 1, 1);
            ver9 = new Vereda(gl, 12.5f, -19.82f, 3.5f, 4f, 0.02f, 0.8f, 0, 180, 0, 1, 1, 1);
            ver10 = new Vereda(gl, 12.5f, -19.82f, 17f, 4f, 0.02f, 0.8f, 0, 0, 0, 1, 1, 1);
            ver11 = new Vereda(gl, 8.7f, -19.82f, 28.5f, 12.5f, 0.02f, 0.8f, 0, 90, 0, 1, 1, 1);

            ver12 = new Vereda(gl, 21.5f, -19.82f, 34.5f, 14f, 0.02f, 0.8f, 0, 180, 0, 1, 1, 1);
            ver13 = new Vereda(gl, 13.8f, -19.82f, 12.5f, 9.5f, 0.02f, 0.8f, 0, 90, 0, 1, 1, 1);
            ver14 = new Vereda(gl, 19f, -19.82f, 51f, 13f, 0.02f, 0.8f, 0, 0, 0, 1, 1, 1);
            ver15 = new Vereda(gl, -21.5f, -19.82f, 51f, 13f, 0.02f, 0.8f, 0, 0, 0, 1, 1, 1);
            ver16 = new Vereda(gl, 6.5f, -19.82f, 53.5f, 3f, 0.02f, 0.8f, 0, 90, 0, 1, 1, 1);
            ver17 = new Vereda(gl, -8.5f, -19.82f, 53.5f, 3f, 0.02f, 0.8f, 0, 270, 0, 1, 1, 1);
            ver18 = new Vereda(gl, 32f, -19.82f, 53.5f, 3f, 0.02f, 0.8f, 0, -90, 0, 1, 1, 1);
            ver19 = new Vereda(gl, -34f, -19.82f, 53.5f, 3f, 0.02f, 0.8f, 0, 90, 0, 1, 1, 1);
            ver20 = new Vereda(gl, 33.5f, -19.82f, 41.5f, 7f, 0.02f, 0.8f, 0, 90, 0, 1, 1, 1);
            ver21 = new Vereda(gl, -34.5f, -19.82f, 41.5f, 7, 0.02f, 0.8f, 0, 270, 0, 1, 1, 1);

            //////////////////////////////POSTES//////////////////////////////////////////
            pos2 = new Poste(gl, -26, -19.9f, 2, 2f, 2f, 2f, 0, -90, 0, 1, 1, 1);
            pos3 = new Poste(gl, -26, -19.9f, -17, 2f, 2f, 2f, 0, -90, 0, 1, 1, 1);
            pos4 = new Poste(gl, -26, -19.9f, -28, 2f, 2f, 2f, 0, 90, 0, 1, 1, 1);
            pos1 = new Poste(gl, -26, -19.9f, -9, 2f, 2f, 2f, 0, 90, 0, 1, 1, 1);
            pos5 = new Poste(gl, -20, -19.9f, 21, 2f, 2f, 2f, 0, -90, 0, 1, 1, 1);
            pos6 = new Poste(gl, -20, -19.9f, 33, 2f, 2f, 2f, 0, -90, 0, 1, 1, 1);
            pos7 = new Poste(gl, 17, -19.9f, 0, 2f, 2f, 2f, 0, 90, 0, 1, 1, 1);
            pos9 = new Poste(gl, 17, -19.9f, -24, 2f, 2f, 2f, 0, 90, 0, 1, 1, 1);
            pos10 = new Poste(gl, 31, -19.9f, 0, 2f, 2f, 2f, 0, -90, 0, 1, 1, 1);
            pos12 = new Poste(gl, 31, -19.9f, -24, 2f, 2f, 2f, 0, -90, 0, 1, 1, 1);
            pos13 = new Poste(gl, 17, -19.9f, 20, 2f, 2f, 2f, 0, 90, 0, 1, 1, 1);
            pos14 = new Poste(gl, 17, -19.9f, 31, 2f, 2f, 2f, 0, 90, 0, 1, 1, 1);
            pos15 = new Poste(gl, 31, -19.9f, 20, 2f, 2f, 2f, 0, -90, 0, 1, 1, 1);
            pos16 = new Poste(gl, 31, -19.9f, 31, 2f, 2f, 2f, 0, -90, 0, 1, 1, 1);

            ///////////////////////////////POSTE CALLE//////////////////////////////////////
            p1 = new Poste(gl, 8.5f, -19.9f, 33, 2f, 2f, 2f, 0, -90, 0, 1, 1, 1);
            p2 = new Poste(gl, 8.5f, -19.9f, 17, 2f, 2f, 2f, 0, -90, 0, 1, 1, 1);
            p3 = new Poste(gl, 8.5f, -19.9f, 2, 2f, 2f, 2f, 0, -90, 0, 1, 1, 1);
            p4 = new Poste(gl, 8.5f, -19.9f, -13, 2f, 2f, 2f, 0, -90, 0, 1, 1, 1);
            p5 = new Poste(gl, 8.5f, -19.9f, -26, 2f, 2f, 2f, 0, -90, 0, 1, 1, 1);
            p6 = new Poste(gl, 8.5f, -19.9f, -39, 2f, 2f, 2f, 0, -90, 0, 1, 1, 1);
            p7 = new Poste(gl, -11f, -19.9f, 33, 2f, 2f, 2f, 0, 90, 0, 1, 1, 1);
            p8 = new Poste(gl, -11, -19.9f, 20, 2f, 2f, 2f, 0, 90, 0, 1, 1, 1);
            p9 = new Poste(gl, -11, -19.9f, 2, 2f, 2f, 2f, 0, 90, 0, 1, 1, 1);
            p10 = new Poste(gl, -11, -19.9f, -13, 2f, 2f, 2f, 0, 90, 0, 1, 1, 1);
            p11 = new Poste(gl, -11, -19.9f, -26, 2f, 2f, 2f, 0, 90, 0, 1, 1, 1);
            p12 = new Poste(gl, -23, -19.9f, -39, 2f, 2f, 2f, 0, 90, 0, 1, 1, 1);

            p13 = new Poste(gl, -34.5f, -19.9f, 47, 2f, 2f, 2f, 0, 90, 0, 1, 1, 1);
            p14 = new Poste(gl, 33.5f, -19.9f, 47, 2f, 2f, 2f, 0, -90, 0, 1, 1, 1);
            p15 = new Poste(gl, -8.5f, -19.9f, 53, 2f, 2f, 2f, 0, 0, 0, 1, 1, 1);
            p16 = new Poste(gl, 6.5f, -19.9f, 53, 2f, 2f, 2f, 0, 180, 0, 1, 1, 1);
            p17 = new Poste(gl, -43, -19.9f, 4.5f, 2f, 2f, 2f, 0, 0, 0, 1, 1, 1);
            p18 = new Poste(gl, -43, -19.9f, 18, 2f, 2f, 2f, 0, 180, 0, 1, 1, 1);

            ///////////////////////////MALLA///////////////////////////////////////
            for (int i = 0; i < 15; i++) {
                malla.add(new Cercado(gl, 50, -16, -42.5f + 7f * i, 0.35f, 0.35f, 0.5f, 0, 90, 0, 0.6f, 0.6f, 0.6f));
            }
            for (int i = 0; i < 7; i++) {
                malla.add(new Cercado(gl, -50, -16, -42.5f + 7.25f * i, 0.375f, 0.35f, 0.5f, 0, 90, 0, 0.6f, 0.6f, 0.6f));
            }
            for (int i = 0; i < 6; i++) {
                malla.add(new Cercado(gl, -50, -16, 21f + 7f * i, 0.35f, 0.35f, 0.5f, 0, 90, 0, 0.6f, 0.6f, 0.6f));
            }
            for (int i = 0; i < 6; i++) {
                malla.add(new Cercado(gl, -47f + 7f * i, -16, 60, 0.35f, 0.35f, 0.5f, 0, 0, 0, 0.6f, 0.6f, 0.6f));
                malla.add(new Cercado(gl, 12f + 7f * i, -16, 60, 0.35f, 0.35f, 0.5f, 0, 0, 0, 0.6f, 0.6f, 0.6f));
            }
            for (int i = 0; i < 14; i++) {
                malla.add(new Cercado(gl, -47f + 7f * i, -16, -46.5f, 0.35f, 0.35f, 0.5f, 0, 0, 0, 0.6f, 0.6f, 0.6f));
            }
            m1 = new Cercado(gl, 48.5f, -16, -46.5f, 0.15f, 0.35f, 0.5f, 0, 0, 0, 0.6f, 0.6f, 0.6f);

            ////////////////////////PARQUEADERO//////////////////////////////////////
            c1 = new Cuadrado(gl, -17, -19.85f, 40, 0.4f, 4, 90, 0, 0, 1, 1, 0, 1, 1, 0);
            c2 = new Cuadrado(gl, -22, -19.85f, 40, 0.4f, 4, 90, 0, 0, 1, 1, 0, 1, 1, 0);
            c3 = new Cuadrado(gl, -27, -19.85f, 40, 0.4f, 4, 90, 0, 0, 1, 1, 0, 1, 1, 0);
            c4 = new Cuadrado(gl, -32, -19.85f, 40, 0.4f, 4, 90, 0, 0, 1, 1, 0, 1, 1, 0);
            c5 = new Cuadrado(gl, 12, -19.85f, 38, 0.4f, 4, 90, 0, 0, 1, 1, 0, 1, 1, 0);
            c6 = new Cuadrado(gl, 17, -19.85f, 38, 0.4f, 4, 90, 0, 0, 1, 1, 0, 1, 1, 0);
            c7 = new Cuadrado(gl, 22, -19.85f, 38, 0.4f, 4, 90, 0, 0, 1, 1, 0, 1, 1, 0);
            c8 = new Cuadrado(gl, 27, -19.85f, 38, 0.4f, 4, 90, 0, 0, 1, 1, 0, 1, 1, 0);

            ///////////////////////CARROS////////////////////////////
            car1 = new Carro(gl, -14, -18.5f, 40, 1.3f, 1.3f, 1.3f, 0, 90, 0, 0, 0, 0);
            car2 = new Carro(gl, -19, -18.5f, 40, 1.3f, 1.3f, 1.3f, 0, 90, 0, 0, 0, 0);
            car3 = new Carro(gl, -24, -18.5f, 40, 1.3f, 1.3f, 1.3f, 0, 90, 0, 0, 0, 0);
            car4 = new Carro(gl, -29, -18.5f, 40, 1.3f, 1.3f, 1.3f, 0, 90, 0, 0, 0, 0);
            car5 = new Carro(gl, 14, -18.5f, 38, 1.3f, 1.3f, 1.3f, 0, 90, 0, 0, 0, 0);
            car6 = new Carro(gl, 19, -18.5f, 38, 1.3f, 1.3f, 1.3f, 0, 90, 0, 0, 0, 0);
            car7 = new Carro(gl, 24, -18.5f, 38, 1.3f, 1.3f, 1.3f, 0, 90, 0, 0, 0, 0);
            car8 = new Carro(gl, 29, -18.5f, 38, 1.3f, 1.3f, 1.3f, 0, 90, 0, 0, 0, 0);
            car9 = new Carro(gl, -19, -18.5f, 15, 1.3f, 1.3f, 1.3f, 0, 0, 0, 0, 0, 0);
            car10 = new Carro(gl, -27, -18.5f, 15, 1.3f, 1.3f, 1.3f, 0, 0, 0, 0, 0, 0);
            car11 = new Carro(gl, -35, -18.5f, 15, 1.3f, 1.3f, 1.3f, 0, 0, 0, 0, 0, 0);
            car12 = new Carro(gl, -43, -18.5f, 15, 1.3f, 1.3f, 1.3f, 0, 0, 0, 0, 0, 0);
            car13 = new Carro(gl, 5, -18.5f, -42, 1.3f, 1.3f, 1.3f, 0, 90, 0, 0, 0, 0);
            car14 = new Carro(gl, 1, -18.5f, -42, 1.3f, 1.3f, 1.3f, 0, 90, 0, 0, 0, 0);
            car15 = new Carro(gl, -3, -18.5f, 60, 1.3f, 1.3f, 1.3f, 0, 90, 0, 0, 0, 0);
            car16 = new Carro(gl, -7, -18.5f, -42, 1.3f, 1.3f, 1.3f, 0, 90, 0, 0, 0, 0);
            car17 = new Carro(gl, -11, -18.5f, -42, 1.3f, 1.3f, 1.3f, 0, 90, 0, 0, 0, 0);
            car18 = new Carro(gl, -15, -18.5f, -42, 1.3f, 1.3f, 1.3f, 0, 90, 0, 0, 0, 0);
            car19 = new Carro(gl, -19, -18.5f, -42, 1.3f, 1.3f, 1.3f, 0, 90, 0, 0, 0, 0);
            //////////////////////COLUMPIOS//////////////////////////////////////
            col1 = new Columpio(gl, 23, -19.85f, -5, 0.1f, 0.1f, 0.1f, 0, 0, 0, 0, 0, 0);
            col2 = new Columpio(gl, 23, -19.85f, -20, 0.1f, 0.1f, 0.1f, 0, 0, 0, 0, 0, 0);
            col3 = new Columpio(gl, 27, -19.85f, 30, 0.1f, 0.1f, 0.1f, 0, 90, 0, 0, 0, 0);
            col4 = new Columpio(gl, 20, -19.85f, 23, 0.1f, 0.1f, 0.1f, 0, 90, 0, 0, 0, 0);
            col5 = new Columpio(gl, -32, -19.85f, 25, 0.1f, 0.1f, 0.1f, 0, 90, 0, 0, 0, 0);
            col6 = new Columpio(gl, -26, -19.85f, 20, 0.1f, 0.1f, 0.1f, 0, 0, 0, 0, 0, 0);

            ////////////////ESCALERA CHINA///////////////////////////////////////////
            esc1 = new EscaleraChina(gl, 18, -19.85f, -8, 0.1f, 0.1f, 0.1f, 0, 90, 0, 0, 0, 0);
            esc2 = new EscaleraChina(gl, 20, -19.85f, 30, 0.1f, 0.1f, 0.1f, 0, 0, 0, 0, 0, 0);
            esc3 = new EscaleraChina(gl, -25, -19.85f, 28, 0.1f, 0.1f, 0.1f, 0, 0, 0, 0, 0, 0);

            //////////////////JUEGO MALLAS/////////////////////////////////////////////
            j1 = new JuegoMalla(gl, 30, -19.85f, -6, 0.1f, 0.1f, 0.1f, 0, 90, 0, 0, 0, 0);
            j2 = new JuegoMalla(gl, 26, -19.85f, 19, 0.1f, 0.1f, 0.1f, 0, 0, 0, 0, 0, 0);

            ///////////////////////LLANTAS/////////////////////////////////////////
            llan1 = new Llantas(gl, 30, -19.4f, -17, 0.05f, 0.05f, 0.05f, 0, 90, 0, 0, 0, 0);
            llan2 = new Llantas(gl, 30, -19.4f, -19, 0.05f, 0.05f, 0.05f, 0, 90, 0, 0, 0, 0);
            llan3 = new Llantas(gl, -33, -19.4f, 30, 0.05f, 0.05f, 0.05f, 0, 0, 0, 0, 0, 0);
            llan4 = new Llantas(gl, -33, -19.4f, 27, 0.05f, 0.05f, 0.05f, 0, 0, 0, 0, 0, 0);
            llan5 = new Llantas(gl, 19, -19.4f, 25, 0.05f, 0.05f, 0.05f, 0, 0, 0, 0, 0, 0);

            ///////////////////////RESBALADERA////////////////////////////////////////////
            res1 = new Resbaladera(gl, 18, -19.85f, -16, 0.1f, 0.1f, 0.1f, 0, 0, 0, 0, 0, 0);
            res2 = new Resbaladera(gl, 30, -19.85f, 24, 0.1f, 0.1f, 0.1f, 0, 180, 0, 0, 0, 0);
            res3 = new Resbaladera(gl, 30, -19.85f, -12, 0.1f, 0.1f, 0.1f, 0, 180, 0, 0, 0, 0);
            res4 = new Resbaladera(gl, -21, -19.85f, 25, 0.1f, 0.1f, 0.1f, 0, 180, 0, 0, 0, 0);

            ///////////////////////////SUBE Y BAJA//////////////////////////////////////////////////
            syb1 = new SubeyBaja(gl, 25, -19.85f, 28, 0.07f, 0.07f, 0.07f, 0, 180, 0, 0, 0, 0);
            syb2 = new SubeyBaja(gl, 24, -19.85f, -9, 0.07f, 0.07f, 0.07f, 0, 180, 0, 0, 0, 0);
            syb3 = new SubeyBaja(gl, 25, -19.85f, -15, 0.07f, 0.07f, 0.07f, 0, 90, 0, 0, 0, 0);
            syb4 = new SubeyBaja(gl, -26, -19.85f, 24, 0.07f, 0.07f, 0.07f, 0, 180, 0, 0, 0, 0);
            syb5 = new SubeyBaja(gl, 24, -19.85f, 24, 0.07f, 0.07f, 0.07f, 0, 90, 0, 0, 0, 0);
            ////////////////////////PUERTAS//////////////////////////////////////////

            //////////////////////////////ARBOLES////////////////////////////////
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 1; j++) {
                    ae.add(new ArbolEsfera(gl, -47 + 4.2f * i, -18.5f, -44 + 4.2f * j, 11, 11, 11, 0, 0, 0));
                    aem.add(new ArbolEsferamult(gl, -47 + 4.2f * i, -18.5f, -40 + 4f * j, 11, 11, 11, 0, 90, 0));
                    ac.add(new ArbolCubo(gl, -47 + 4.2f * i, -18.5f, -36 + 4f * j, 11, 11, 11, 0, 90, 0));
                    ap.add(new ArbolPir(gl, -47 + 4.2f * i, -18.5f, -32 + 4f * j, 11, 11, 11, 0, 90, 0));
                }
            }
            for (int i = 0; i < 1; i++) {
                for (int j = 0; j < 8; j++) {
                    aem.add(new ArbolEsferamult(gl, -47 + 4.2f * i, -18.5f, -27 + 4f * j, 7, 7, 7, 0, 0, 0));
                    ap.add(new ArbolPir(gl, -47 + 4.2f * i, -18.5f, 20 + 3.5f * j, 7, 7, 7, 0, 90, 0));
                    ac.add(new ArbolCubo(gl, 45 + 4.2f * i, -18.5f, -18 + 2.7f * j, 7, 7, 7, 0, 90, 0));
                    ae.add(new ArbolEsfera(gl, 45 + 4.2f * i, -18.5f, 22 + 3.2f * j, 7, 7, 7, 0, 0, 0));
                }
            }
            app1 = new ArbolPir(gl, 46, -18.5f, 55, 7, 7, 7, 0, 0, 0);
            app2 = new ArbolPir(gl, 43, -18.5f, 55, 7, 7, 7, 0, 0, 0);
            app3 = new ArbolPir(gl, -37, -18.5f, 55, 7, 7, 7, 0, 0, 0);
            app4 = new ArbolPir(gl, -40, -18.5f, 55, 7, 7, 7, 0, 0, 0);
            apg1 = new ArbolPir(gl, -32, -18.5f, 0, 11, 11, 11, 0, 0, 0);
            apg2 = new ArbolPir(gl, 18, -18.5f, -20, 11, 11, 11, 0, 0, 0);
            apg3 = new ArbolPir(gl, -32, -18.5f, -24, 11, 11, 11, 0, 0, 0);
            apg4 = new ArbolPir(gl, 42, -18.5f, -24, 11, 11, 11, 0, 0, 0);

            aemp1 = new ArbolEsferamult(gl, 38, -18.5f,11, 7, 7, 7, 0, 0, 0);
            aemp2 = new ArbolEsferamult(gl, 25, -18.5f, -8, 7, 7, 7, 0, 30, 0);
            aemp3 = new ArbolEsferamult(gl, -20, -18.5f, -7, 7, 7, 7, 0, 0, 0);
            aemp4 = new ArbolEsferamult(gl, -20, -18.5f, -22, 7, 7, 7, 0, 0, 0);
            aemg1 = new ArbolEsferamult(gl, 37, -18.5f, 48, 11, 11, 11, 0, 90, 0);
            aemg2 = new ArbolEsferamult(gl, -46, -18.5f, 48, 11, 11, 11, 0, 90, 0);
            aemg3 = new ArbolEsferamult(gl, -28, -18.5f, 30, 11, 11, 11, 0, 0, 0);
            aemg4 = new ArbolEsferamult(gl, -20, -18.5f, -15, 11, 11, 11, 0, 0, 0);
            
            aep1 = new ArbolEsfera(gl, 17, -18.5f, -6, 7, 7, 7, 0, 0, 0);
            aep2 = new ArbolEsfera(gl, 25, -18.5f, -24, 7, 7, 7, 0, 0, 0);
            aep3 = new ArbolEsfera(gl, 30, -18.5f, 27, -7, 7, 7, 0, 0, 0);
            aep4 = new ArbolEsfera(gl, -32, -18.5f, -9, 7, 7, 7, 0, 0, 0);
            aeg1 = new ArbolEsfera(gl, -32, -18.5f, -17, 11, 11, 11, 0, 0, 0);
            aeg2 = new ArbolEsfera(gl, 30, -18.5f, -2, 11, 11, 11, 0, 0, 0);
            aeg3 = new ArbolEsfera(gl, -32, -18.5f, 21, 11, 11, 11, 0, 0, 0);
            aeg4 = new ArbolEsfera(gl, 17, -18.5f, 30, 11, 11, 11, 0, 0, 0);
            
            acp1 = new ArbolCubo(gl, 37, -18.5f, -24, 7, 7, 7, 0, 0, 0);
            acp2 = new ArbolCubo(gl, 46, -18.5f, -24, 7, 7, 7, 0, 0, 0);
            acp3 = new ArbolCubo(gl, 32, -18.5f, -11, 7, 7, 7, 0, 0, 0);
            acp4 = new ArbolCubo(gl, -22, -18.5f, -10, 7, 7, 7, 0, 0, 0);         
            acg1 = new ArbolCubo(gl, -22, -18.5f, -19, 11, 11, 11, 0, 0, 0);
            acg2 = new ArbolCubo(gl, -20, -18.5f, 25, 11, 11, 11, 0, 0, 0);
            acg3 = new ArbolCubo(gl, -20, -18.5f, 30, 11, 11, 11, 0, 0, 0);
            acg4 = new ArbolCubo(gl, 20, -18.5f, -2, 11, 11, 11, 0, 0, 0);
            //            arbol3 = new Arbol(gl, -20, 0, -5, 40, 40, 40, 0, 0, 0);
            //*********************************************************************
        }

        public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
            GL gl = drawable.getGL();
            GLU glu = new GLU();
            GLUT glut = new GLUT();

            if (height <= 0) { // avoid a divide by zero error!

                height = 1;
            }
            final float h = (float) width / (float) height;
            gl.glViewport(0, 0, width, height);
            gl.glMatrixMode(GL.GL_PROJECTION);
            gl.glLoadIdentity();
            glu.gluPerspective(60, h, 1.0, 110.0);
            gl.glMatrixMode(GL.GL_MODELVIEW);
            gl.glLoadIdentity();
        }

        public void display(GLAutoDrawable drawable) {
            GL gl = drawable.getGL();
            gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);
            gl.glLoadIdentity();
            GLU glu = new GLU();
            //glu.gluLookAt(0, 5, -74, 0, 5, -70, 0, 1, 0);
//            if (ncam == 1) {
//                glu.gluLookAt(cam.x + 100, cam.y - 18, cam.z, suelo.x, suelo.y, suelo.z, 0, 1, 0);
//            }
            if (ncam == 2) {
                //glu.gluLookAt(cam.x +120f, cam.y +30f, cam.z+5, suelo.x, suelo.y, suelo.z, 0, 1, 0);
                glu.gluLookAt(cam.x + 100, cam.y - 18, cam.z, suelo.x, suelo.y, suelo.z, 0, 1, 0);
            }
//            if (ncam == 2) {
//                 //glu.gluLookAt(cam.x + 100, cam.y - 18, cam.z, suelo.x, suelo.y, suelo.z, 0, 1, 0);
//                //glu.gluLookAt(cam.x + 100, cam.y - 18, cam.z, suelo.x, suelo.y, suelo.z, 0, 1, 0);
//                glu.gluLookAt(cam.x + 50, cam.y + 90, cam.z - 50, x, y, z, 0, 1, 0);
//            }
            if (ncam == 1) {
                glu.gluLookAt(x, cam.y + 78, z, 0, -20, 5, 0, 1, 0);
            }

            gl.glPushMatrix();
            /////////////////   BLOQUES   ///////////////////////
            for (Bloques b : bloques) {
                b.dibuja();
            }

            //////////////////////////////////////////////////////////////////////////////////
            suelo.dibuja();
            tierra.dibuja();
            pav.dibujarpavimento();

            //////////////////////////////////////////////////////////////////////////////////
            cancha.dibujarcancha();
            cancha2.dibujarcancha();

            ///////////////////////////////////////////////////////////////////////////////////
            grada1.dibuja();
            grada2.dibuja();

            ////////////////////////////////////////////////////////////////////////////////////
            for (Cesped h1 : cesped) {
                h1.dibujarcesped();
            }

            h2.dibujarcesped();
            h3.dibujarcesped();
            h4.dibujarcesped();
            h5.dibujarcesped();
            h6.dibujarcesped();
            ////////////////////////////////////////////////////////////////////////////////

            for (Planta pl : planta) {
                pl.dibujarplanta();
            }

            /////////////////////CASAS/////////////////////////
            for (Casa c : casa) {
                c.dibuja();
            }

            ///////////////////////////////////////////////////////////////////
            banca1.dibujarbancas();
            banca2.dibujarbancas();
            banca3.dibujarbancas();
            bancam.dibujarbancasmesa();
            bancam2.dibujarbancasmesa();
            bancam3.dibujarbancasmesa();

            ///////////////////////////////////////////////////////////////////
            bol1.dibujarbolita();
            bol2.dibujarbolita();
            bol3.dibujarbolita();
            bol4.dibujarbolita();
            bol5.dibujarbolita();
            bol6.dibujarbolita();
            bol7.dibujarbolita();

            ///////////////////////////////////////////////////////////////////
            ver1.dibujarvereda();
            ver2.dibujarvereda();
            ver3.dibujarvereda();
            ver4.dibujarvereda();
            ver5.dibujarvereda();
            ver6.dibujarvereda();
            ver7.dibujarvereda();
            ver8.dibujarvereda();
            ver9.dibujarvereda();
            ver10.dibujarvereda();
            ver11.dibujarvereda();
            ver12.dibujarvereda();
            ver13.dibujarvereda();
            ver14.dibujarvereda();
            ver15.dibujarvereda();
            ver16.dibujarvereda();
            ver17.dibujarvereda();
            ver18.dibujarvereda();
            ver19.dibujarvereda();
            ver20.dibujarvereda();
            ver21.dibujarvereda();
            /////////////////////////////////////////////////////////////////
            pos1.dibujarposte();
            pos2.dibujarposte();
            pos3.dibujarposte();
            pos4.dibujarposte();
            pos5.dibujarposte();
            pos6.dibujarposte();
            pos7.dibujarposte();
            pos9.dibujarposte();
            pos10.dibujarposte();
            pos12.dibujarposte();
            pos13.dibujarposte();
            pos14.dibujarposte();
            pos15.dibujarposte();
            pos16.dibujarposte();
            ////////////////////////////////////////////////////////////////////////////
            p1.dibujarposte();
            p2.dibujarposte();
            p3.dibujarposte();
            p4.dibujarposte();
            p5.dibujarposte();
            p6.dibujarposte();
            p7.dibujarposte();
            p8.dibujarposte();
            p9.dibujarposte();
            p10.dibujarposte();
            p11.dibujarposte();
            p12.dibujarposte();
            p13.dibujarposte();
            p14.dibujarposte();
            p15.dibujarposte();
            p16.dibujarposte();
            p17.dibujarposte();
            p18.dibujarposte();

            ////////////////////////////////////////////////////////////////////
            for (Cercado mal : malla) {
                mal.dibujarcerca();
            }
            m1.dibujarcerca();
            ////////////////////////////////////////////////////////////////////////
            c1.dibuja();
            c2.dibuja();
            c3.dibuja();
            c4.dibuja();
            c5.dibuja();
            c6.dibuja();
            c7.dibuja();
            c8.dibuja();
            ///////////////////////////////////////////////////////////////////////
            car1.dibujarcarro3();
            car2.dibujarcarro4();
            car3.dibujarcarro5();
            car4.dibujarcarro3();
            car5.dibujarcarro2();
            car6.dibujarcarro5();
            car7.dibujarcarro3();
            car8.dibujarcarro4();
            car9.dibujarcarro5();
            car10.dibujarcarro3();
            car11.dibujarcarro4();
            car12.dibujarcarro5();
            car13.dibujarcarro1();
            car14.dibujarcarro4();
            car15.dibujarcarro6();
            car16.dibujarcarro3();
            car17.dibujarcarro4();
            car18.dibujarcarro5();
            car19.dibujarcarro3();
            ///////////////////////////////////////////////////
            col1.dibujarcolumpio();
            col2.dibujarcolumpio();
            col3.dibujarcolumpio();
            col4.dibujarcolumpio();
            col5.dibujarcolumpio();
            col6.dibujarcolumpio();
            ///////////////////////////////////////////////////////
            esc1.dibujarescalera();
            esc2.dibujarescalera();
            esc3.dibujarescalera();
            ////////////////////////////////////////////////////////
            j1.dibujarjuego();
            j2.dibujarjuego();
            //////////////////////////////////////////////////////////////
            llan1.dibujarllantas();
            llan2.dibujarllantas();
            llan3.dibujarllantas();
            llan4.dibujarllantas();
            llan5.dibujarllantas();
            ///////////////////////////////////////////////////////////////////
            res1.dibujarresbaladera();
            res2.dibujarresbaladera();
            res3.dibujarresbaladera();
            res4.dibujarresbaladera();
            /////////////////////////////////////////////////////////////////////////
            syb1.dibujarsyb();
            syb2.dibujarsyb();
            syb3.dibujarsyb();
            syb4.dibujarsyb();
            syb5.dibujarsyb();
            ///////////////////////////////////////////////////////////////////////////
            for (ArbolEsfera aeg1 : ae) {
                aeg1.dibujararbol();
            }

            for (ArbolEsferamult aemg1 : aem) {
                aemg1.dibujararbol();
            }
            for (ArbolPir apg1 : ap) {
                apg1.dibujararbol();
            }

            for (ArbolCubo acg1 : ac) {
                acg1.dibujararbol();
            }

            app1.dibujararbol();
            app2.dibujararbol();
            app3.dibujararbol();
            app4.dibujararbol();
            aemp1.dibujararbol();
            aemp2.dibujararbol();
            aemp3.dibujararbol();
            aemp4.dibujararbol();
            aep1.dibujararbol();
            aep2.dibujararbol();
            aep3.dibujararbol();
            aep4.dibujararbol();
            acp1.dibujararbol();
            acp2.dibujararbol();
            acp3.dibujararbol();
            acp4.dibujararbol();
            apg1.dibujararbol();
            apg2.dibujararbol();
            apg3.dibujararbol();
            apg4.dibujararbol();
            aemg1.dibujararbol();
            aemg2.dibujararbol();
            aemg3.dibujararbol();
            aemg4.dibujararbol();
            aeg1.dibujararbol();
            aeg2.dibujararbol();
            aeg3.dibujararbol();
            aeg4.dibujararbol();
            acg1.dibujararbol();
            acg2.dibujararbol();
            acg3.dibujararbol();
            acg4.dibujararbol();
//            arbopl3.dibujararbol();
//            arbol4.dibujararbol();

//            arbol3.dibujararbol();
            gl.glPopMatrix();

            gl.glFlush();
        }

        public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    }

    public void keyTyped(KeyEvent e) {
        if (e.getKeyChar() == '1') {
            AchiKatherine_Proyecto.ncam = 1;
        }

        if (e.getKeyChar() == '2') {
            AchiKatherine_Proyecto.ncam = 2;
        }
        if (e.getKeyChar() == '3') {
            AchiKatherine_Proyecto.ncam = 3;
        }
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            cam.x += 0.5;
            System.out.println("Valor en la traslacion de X: " + cam.x);
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            cam.x -= 0.5;
            cam.setX(cam.getX());
            System.out.println("Valor en la traslacion de X: " + cam.x);
        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            cam.y += 0.5;
            cam.setY(cam.getY());
            System.out.println("Valor en la traslacion de Y: " + cam.y);
        }

        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            cam.y -= 0.5;
            cam.setY(cam.getY());
            System.out.println("Valor en la traslacion de Y: " + cam.y);
        }
        if (e.getKeyCode() == KeyEvent.VK_X) {
            cam.z += 0.5;
            cam.setZ(cam.getZ());
            System.out.println("Valor en la traslacion de Z: " + cam.z);
        }

        if (e.getKeyCode() == KeyEvent.VK_Z) {
            cam.z -= 0.5;
            cam.setZ(cam.getZ());
            System.out.println("Valor en la traslacion de Z: " + cam.z);
        }
    }

    public void keyReleased(KeyEvent e) {
    }
}
