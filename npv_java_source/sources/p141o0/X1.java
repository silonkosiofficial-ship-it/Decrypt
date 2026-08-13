package p141o0;

/* JADX INFO: loaded from: classes.dex */
public abstract class X1 {
    public static final android.graphics.Rect a(Y0.r rVar) {
        return new android.graphics.Rect(rVar.g(), rVar.i(), rVar.h(), rVar.d());
    }

    public static final android.graphics.Rect b(p131n0.i iVar) {
        return new android.graphics.Rect((int) iVar.i(), (int) iVar.l(), (int) iVar.j(), (int) iVar.e());
    }

    public static final android.graphics.RectF c(p131n0.i iVar) {
        return new android.graphics.RectF(iVar.i(), iVar.l(), iVar.j(), iVar.e());
    }

    public static final Y0.r d(android.graphics.Rect rect) {
        return new Y0.r(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final p131n0.i e(android.graphics.Rect rect) {
        return new p131n0.i(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final p131n0.i f(android.graphics.RectF rectF) {
        return new p131n0.i(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }
}
