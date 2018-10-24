package desarrollojhlibreros.com.ejercicio12canvassenocoseno;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

public class Lienzo extends View {

    Paint p;
    Path r;
    int x, y, x0, y0;

    public Lienzo(Context context) {
        super(context);
    }

    protected void onDraw(Canvas c){
        super.onDraw(c); // Canvas pinta atributos
        p = new Paint(); // Paint asigna atributos
        r = new Path();
        x = c.getWidth(); x0=x/2; // También: getMeasuredWidth(), o getRight(), x=480
        y = c.getHeight(); y0=y/2; // También: getMeasuredHeight(), o getBottom(), y=762

        p.setColor(Color.WHITE); // Fondo blanco
        c.drawPaint(p);
        p.setColor(Color.BLACK); // Texto negro
        p.setTextSize(20);
        c.drawText("0,0", x0 + 5, y0 + 20, p);
        p.setColor(Color.rgb(0, 0, 255)); // Ejes azules
        c.drawLine(x0, 0, x0, y, p);
        c.drawLine(0, y0, x, y0, p);
        p.setColor(Color.BLUE); c.drawText("senA", 20, 20, p);
        p.setColor(Color.RED); c.drawText("cosA", 20, 50, p);
        p.setStyle(Paint.Style.STROKE);
        p.setStrokeWidth(2);
        p.setAntiAlias(true);


        r = new Path();
        x = getMeasuredWidth();

        //Funciones Seno con EJE VERTICAL ACOTADO
        p.setColor(Color.rgb(255, 0, 0));
        c.drawLine(x0+(int)Math.PI, 0, x0+(int)Math.PI, y, p);
        c.drawLine(0, 2*((float)Math.sin(Math.PI/2f)*(180f)), x, 2*((float)Math.sin(Math.PI/2f)*(180f)), p); //EJE AMPLITUD
        r.moveTo(0, 0); p.setColor(Color.BLUE);
        for(int i=1; i<x; i++)
            r.lineTo(i, 2*((float) Math.sin(i / 20f) * (-80f)));
        r.offset(-10, y0); c.drawPath(r, p);


        r = new Path();
        //Funciones coseno con EJE VERTICAL ACOTADO
        r.moveTo(0, 0); p.setColor(Color.RED);
        for(int i=1; i<x; i++)
            r.lineTo(i, 3*((float) Math.cos(i / 20f) * (-100f)));

        r.offset(-10, y0);
        c.drawPath(r, p);
    }



}
