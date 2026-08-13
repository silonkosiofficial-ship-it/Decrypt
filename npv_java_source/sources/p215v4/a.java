package p215v4;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f56000f = (int) java.lang.Math.round(5.1000000000000005d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f56001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f56002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f56003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f56004d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f56005e;

    public a(android.content.Context context) {
        this(B4.b.b(context, p125m4.a.f50524r, false), p195t4.a.b(context, p125m4.a.f50523q, 0), p195t4.a.b(context, p125m4.a.f50522p, 0), p195t4.a.b(context, p125m4.a.f50520n, 0), context.getResources().getDisplayMetrics().density);
    }

    public a(boolean z6, int i6, int i10, int i11, float f6) {
        this.f56001a = z6;
        this.f56002b = i6;
        this.f56003c = i10;
        this.f56004d = i11;
        this.f56005e = f6;
    }

    private boolean e(int i6) {
        return androidx.core.graphics.a.k(i6, 255) == this.f56004d;
    }

    public float a(float f6) {
        float f10 = this.f56005e;
        if (f10 <= 0.0f || f6 <= 0.0f) {
            return 0.0f;
        }
        return java.lang.Math.min(((((float) java.lang.Math.log1p(f6 / f10)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public int b(int i6, float f6) {
        int i10;
        float fA = a(f6);
        int iAlpha = android.graphics.Color.alpha(i6);
        int iJ = p195t4.a.j(androidx.core.graphics.a.k(i6, 255), this.f56002b, fA);
        if (fA > 0.0f && (i10 = this.f56003c) != 0) {
            iJ = p195t4.a.i(iJ, androidx.core.graphics.a.k(i10, f56000f));
        }
        return androidx.core.graphics.a.k(iJ, iAlpha);
    }

    public int c(int i6, float f6) {
        return (this.f56001a && e(i6)) ? b(i6, f6) : i6;
    }

    public boolean d() {
        return this.f56001a;
    }
}
