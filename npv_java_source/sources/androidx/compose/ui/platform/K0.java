package androidx.compose.ui.platform;

/* JADX INFO: loaded from: classes.dex */
public final class K0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p237x7.p f19871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.graphics.Matrix f19872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private android.graphics.Matrix f19873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float[] f19874d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float[] f19875e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f19876f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f19877g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f19878h = true;

    public K0(p237x7.p pVar) {
        this.f19871a = pVar;
    }

    public final float[] a(java.lang.Object obj) {
        float[] fArrC = this.f19875e;
        if (fArrC == null) {
            fArrC = p141o0.J1.c(null, 1, null);
            this.f19875e = fArrC;
        }
        if (this.f19877g) {
            this.f19878h = androidx.compose.ui.platform.I0.a(b(obj), fArrC);
            this.f19877g = false;
        }
        if (this.f19878h) {
            return fArrC;
        }
        return null;
    }

    public final float[] b(java.lang.Object obj) {
        float[] fArrC = this.f19874d;
        if (fArrC == null) {
            fArrC = p141o0.J1.c(null, 1, null);
            this.f19874d = fArrC;
        }
        if (!this.f19876f) {
            return fArrC;
        }
        android.graphics.Matrix matrix = this.f19872b;
        if (matrix == null) {
            matrix = new android.graphics.Matrix();
            this.f19872b = matrix;
        }
        this.f19871a.u(obj, matrix);
        android.graphics.Matrix matrix2 = this.f19873c;
        if (matrix2 == null || !p247y7.AbstractC7350t.b(matrix, matrix2)) {
            p141o0.S.b(fArrC, matrix);
            this.f19872b = matrix2;
            this.f19873c = matrix;
        }
        this.f19876f = false;
        return fArrC;
    }

    public final void c() {
        this.f19876f = true;
        this.f19877g = true;
    }
}
