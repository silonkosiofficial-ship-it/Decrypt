package com.google.android.material.progressindicator;

/* JADX INFO: loaded from: classes3.dex */
final class c extends com.google.android.material.progressindicator.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f43498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f43499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f43500d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f43501e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f43502f;

    c(com.google.android.material.progressindicator.e eVar) {
        super(eVar);
    }

    private void h(android.graphics.Canvas canvas, android.graphics.Paint paint, float f6, float f10, int i6, int i10, int i11) {
        float f11 = f10 >= f6 ? f10 - f6 : (f10 + 1.0f) - f6;
        float f12 = f6 % 1.0f;
        if (this.f43502f < 1.0f) {
            float f13 = f12 + f11;
            if (f13 > 1.0f) {
                h(canvas, paint, f12, 1.0f, i6, i10, 0);
                h(canvas, paint, 1.0f, f13, i6, 0, i11);
                return;
            }
        }
        float degrees = (float) java.lang.Math.toDegrees(this.f43499c / this.f43500d);
        if (f12 == 0.0f && f11 >= 0.99f) {
            f11 += ((f11 - 0.99f) * ((degrees * 2.0f) / 360.0f)) / 0.01f;
        }
        float fB = p235x4.a.b(1.0f - this.f43502f, 1.0f, f12);
        float fB2 = p235x4.a.b(0.0f, this.f43502f, f11);
        float degrees2 = (float) java.lang.Math.toDegrees(i10 / this.f43500d);
        float degrees3 = ((fB2 * 360.0f) - degrees2) - ((float) java.lang.Math.toDegrees(i11 / this.f43500d));
        float f14 = (fB * 360.0f) + degrees2;
        if (degrees3 <= 0.0f) {
            return;
        }
        paint.setAntiAlias(true);
        paint.setColor(i6);
        paint.setStrokeWidth(this.f43498b);
        float f15 = degrees * 2.0f;
        if (degrees3 < f15) {
            float f16 = degrees3 / f15;
            paint.setStyle(android.graphics.Paint.Style.FILL);
            j(canvas, paint, f14 + (degrees * f16), this.f43499c * 2.0f, this.f43498b, f16);
            return;
        }
        float f17 = this.f43500d;
        android.graphics.RectF rectF = new android.graphics.RectF(-f17, -f17, f17, f17);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeCap(this.f43501e ? android.graphics.Paint.Cap.ROUND : android.graphics.Paint.Cap.BUTT);
        float f18 = f14 + degrees;
        canvas.drawArc(rectF, f18, degrees3 - f15, false, paint);
        if (this.f43501e || this.f43499c <= 0.0f) {
            return;
        }
        paint.setStyle(android.graphics.Paint.Style.FILL);
        i(canvas, paint, f18, this.f43499c * 2.0f, this.f43498b);
        i(canvas, paint, (f14 + degrees3) - degrees, this.f43499c * 2.0f, this.f43498b);
    }

    private void i(android.graphics.Canvas canvas, android.graphics.Paint paint, float f6, float f10, float f11) {
        j(canvas, paint, f6, f10, f11, 1.0f);
    }

    private void j(android.graphics.Canvas canvas, android.graphics.Paint paint, float f6, float f10, float f11, float f12) {
        float fMin = (int) java.lang.Math.min(f11, this.f43498b);
        float f13 = f10 / 2.0f;
        float fMin2 = java.lang.Math.min(f13, (this.f43499c * fMin) / this.f43498b);
        android.graphics.RectF rectF = new android.graphics.RectF((-fMin) / 2.0f, (-f10) / 2.0f, fMin / 2.0f, f13);
        canvas.save();
        double d6 = f6;
        canvas.translate((float) (((double) this.f43500d) * java.lang.Math.cos(java.lang.Math.toRadians(d6))), (float) (((double) this.f43500d) * java.lang.Math.sin(java.lang.Math.toRadians(d6))));
        canvas.rotate(f6);
        canvas.scale(f12, f12);
        canvas.drawRoundRect(rectF, fMin2, fMin2, paint);
        canvas.restore();
    }

    private int k() {
        com.google.android.material.progressindicator.b bVar = this.f43544a;
        return ((com.google.android.material.progressindicator.e) bVar).f43518h + (((com.google.android.material.progressindicator.e) bVar).f43519i * 2);
    }

    @Override // com.google.android.material.progressindicator.h
    void a(android.graphics.Canvas canvas, android.graphics.Rect rect, float f6, boolean z6, boolean z10) {
        float f10;
        float fWidth = rect.width() / f();
        float fHeight = rect.height() / e();
        com.google.android.material.progressindicator.b bVar = this.f43544a;
        float f11 = (((com.google.android.material.progressindicator.e) bVar).f43518h / 2.0f) + ((com.google.android.material.progressindicator.e) bVar).f43519i;
        canvas.translate((f11 * fWidth) + rect.left, (f11 * fHeight) + rect.top);
        canvas.rotate(-90.0f);
        canvas.scale(fWidth, fHeight);
        if (((com.google.android.material.progressindicator.e) this.f43544a).f43520j != 0) {
            canvas.scale(1.0f, -1.0f);
        }
        float f12 = -f11;
        canvas.clipRect(f12, f12, f11, f11);
        com.google.android.material.progressindicator.b bVar2 = this.f43544a;
        this.f43501e = ((com.google.android.material.progressindicator.e) bVar2).f43491a / 2 <= ((com.google.android.material.progressindicator.e) bVar2).f43492b;
        this.f43498b = ((com.google.android.material.progressindicator.e) bVar2).f43491a * f6;
        this.f43499c = java.lang.Math.min(((com.google.android.material.progressindicator.e) bVar2).f43491a / 2, ((com.google.android.material.progressindicator.e) bVar2).f43492b) * f6;
        com.google.android.material.progressindicator.b bVar3 = this.f43544a;
        float f13 = (((com.google.android.material.progressindicator.e) bVar3).f43518h - ((com.google.android.material.progressindicator.e) bVar3).f43491a) / 2.0f;
        this.f43500d = f13;
        if (z6 || z10) {
            if ((z6 && ((com.google.android.material.progressindicator.e) bVar3).f43495e == 2) || (z10 && ((com.google.android.material.progressindicator.e) bVar3).f43496f == 1)) {
                f10 = f13 + (((1.0f - f6) * ((com.google.android.material.progressindicator.e) bVar3).f43491a) / 2.0f);
            } else if ((z6 && ((com.google.android.material.progressindicator.e) bVar3).f43495e == 1) || (z10 && ((com.google.android.material.progressindicator.e) bVar3).f43496f == 2)) {
                f10 = f13 - (((1.0f - f6) * ((com.google.android.material.progressindicator.e) bVar3).f43491a) / 2.0f);
            }
            this.f43500d = f10;
        }
        if (z10 && ((com.google.android.material.progressindicator.e) bVar3).f43496f == 3) {
            this.f43502f = f6;
        } else {
            this.f43502f = 1.0f;
        }
    }

    @Override // com.google.android.material.progressindicator.h
    void b(android.graphics.Canvas canvas, android.graphics.Paint paint, int i6, int i10) {
    }

    @Override // com.google.android.material.progressindicator.h
    void c(android.graphics.Canvas canvas, android.graphics.Paint paint, com.google.android.material.progressindicator.h.a aVar, int i6) {
        int iA = p195t4.a.a(aVar.f43547c, i6);
        float f6 = aVar.f43545a;
        float f10 = aVar.f43546b;
        int i10 = aVar.f43548d;
        h(canvas, paint, f6, f10, iA, i10, i10);
    }

    @Override // com.google.android.material.progressindicator.h
    void d(android.graphics.Canvas canvas, android.graphics.Paint paint, float f6, float f10, int i6, int i10, int i11) {
        h(canvas, paint, f6, f10, p195t4.a.a(i6, i10), i11, i11);
    }

    @Override // com.google.android.material.progressindicator.h
    int e() {
        return k();
    }

    @Override // com.google.android.material.progressindicator.h
    int f() {
        return k();
    }
}
