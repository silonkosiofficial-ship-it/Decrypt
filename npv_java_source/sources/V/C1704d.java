package V;

/* JADX INFO: renamed from: V.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1704d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f14842a;

    public C1704d(int i6) {
        this.f14842a = i6;
    }

    public final int a() {
        return this.f14842a;
    }

    public final boolean b() {
        return this.f14842a != Integer.MIN_VALUE;
    }

    public final void c(int i6) {
        this.f14842a = i6;
    }

    public final int d(V.C1718h1 c1718h1) {
        return c1718h1.e(this);
    }

    public final int e(V.C1727k1 c1727k1) {
        return c1727k1.F(this);
    }

    public java.lang.String toString() {
        return super.toString() + "{ location = " + this.f14842a + " }";
    }
}
