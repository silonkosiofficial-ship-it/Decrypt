package W0;

/* JADX INFO: loaded from: classes.dex */
public final class a extends android.text.style.CharacterStyle implements android.text.style.UpdateAppearance {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p161q0.h f15300a;

    public a(p161q0.h hVar) {
        this.f15300a = hVar;
    }

    private final android.graphics.Paint.Cap a(int i6) {
        o0.g2.a aVar = p141o0.g2.f52226a;
        if (!p141o0.g2.e(i6, aVar.a())) {
            if (p141o0.g2.e(i6, aVar.b())) {
                return android.graphics.Paint.Cap.ROUND;
            }
            if (p141o0.g2.e(i6, aVar.c())) {
                return android.graphics.Paint.Cap.SQUARE;
            }
        }
        return android.graphics.Paint.Cap.BUTT;
    }

    private final android.graphics.Paint.Join b(int i6) {
        o0.h2.a aVar = p141o0.h2.f52230a;
        if (!p141o0.h2.e(i6, aVar.b())) {
            if (p141o0.h2.e(i6, aVar.c())) {
                return android.graphics.Paint.Join.ROUND;
            }
            if (p141o0.h2.e(i6, aVar.a())) {
                return android.graphics.Paint.Join.BEVEL;
            }
        }
        return android.graphics.Paint.Join.MITER;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint textPaint) {
        if (textPaint != null) {
            p161q0.h hVar = this.f15300a;
            if (p247y7.AbstractC7350t.b(hVar, p161q0.l.f52928a)) {
                textPaint.setStyle(android.graphics.Paint.Style.FILL);
                return;
            }
            if (hVar instanceof p161q0.m) {
                textPaint.setStyle(android.graphics.Paint.Style.STROKE);
                textPaint.setStrokeWidth(((p161q0.m) this.f15300a).f());
                textPaint.setStrokeMiter(((p161q0.m) this.f15300a).d());
                textPaint.setStrokeJoin(b(((p161q0.m) this.f15300a).c()));
                textPaint.setStrokeCap(a(((p161q0.m) this.f15300a).b()));
                ((p161q0.m) this.f15300a).e();
                textPaint.setPathEffect(null);
            }
        }
    }
}
