package androidx.emoji2.text;

/* JADX INFO: loaded from: classes.dex */
public class p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final java.lang.ThreadLocal f22338d = new java.lang.ThreadLocal();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f22339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.emoji2.text.n f22340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile int f22341c = 0;

    p(androidx.emoji2.text.n nVar, int i6) {
        this.f22340b = nVar;
        this.f22339a = i6;
    }

    private S1.a g() {
        java.lang.ThreadLocal threadLocal = f22338d;
        S1.a aVar = (S1.a) threadLocal.get();
        if (aVar == null) {
            aVar = new S1.a();
            threadLocal.set(aVar);
        }
        this.f22340b.d().j(aVar, this.f22339a);
        return aVar;
    }

    public void a(android.graphics.Canvas canvas, float f6, float f10, android.graphics.Paint paint) {
        android.graphics.Typeface typefaceG = this.f22340b.g();
        android.graphics.Typeface typeface = paint.getTypeface();
        paint.setTypeface(typefaceG);
        canvas.drawText(this.f22340b.c(), this.f22339a * 2, 2, f6, f10, paint);
        paint.setTypeface(typeface);
    }

    public int b(int i6) {
        return g().h(i6);
    }

    public int c() {
        return g().i();
    }

    public int d() {
        return this.f22341c & 3;
    }

    public int e() {
        return g().k();
    }

    public int f() {
        return g().l();
    }

    public short h() {
        return g().m();
    }

    public int i() {
        return g().n();
    }

    public boolean j() {
        return g().j();
    }

    public boolean k() {
        return (this.f22341c & 4) > 0;
    }

    public void l(boolean z6) {
        int iD = d();
        if (z6) {
            this.f22341c = iD | 4;
        } else {
            this.f22341c = iD;
        }
    }

    public void m(boolean z6) {
        int i6 = this.f22341c & 4;
        this.f22341c = z6 ? i6 | 2 : i6 | 1;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(java.lang.Integer.toHexString(f()));
        sb.append(", codepoints:");
        int iC = c();
        for (int i6 = 0; i6 < iC; i6++) {
            sb.append(java.lang.Integer.toHexString(b(i6)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
