package p258z9;

/* JADX INFO: renamed from: z9.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7408v extends p258z9.C7401n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f57778c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7408v(p258z9.A a6, boolean z6) {
        super(a6);
        p247y7.AbstractC7350t.f(a6, "writer");
        this.f57778c = z6;
    }

    @Override // p258z9.C7401n
    public void e(byte b6) {
        boolean z6 = this.f57778c;
        java.lang.String strN = p087i7.C.n(p087i7.C.g(b6));
        if (z6) {
            n(strN);
        } else {
            k(strN);
        }
    }

    @Override // p258z9.C7401n
    public void i(int i6) {
        boolean z6 = this.f57778c;
        int iG = p087i7.E.g(i6);
        if (z6) {
            n(java.lang.Long.toString(((long) iG) & 4294967295L, 10));
        } else {
            k(java.lang.Long.toString(((long) iG) & 4294967295L, 10));
        }
    }

    @Override // p258z9.C7401n
    public void j(long j6) {
        boolean z6 = this.f57778c;
        long jG = p087i7.G.g(j6);
        if (z6) {
            n(p258z9.AbstractC7407u.a(jG, 10));
        } else {
            k(p258z9.AbstractC7406t.a(jG, 10));
        }
    }

    @Override // p258z9.C7401n
    public void l(short s6) {
        boolean z6 = this.f57778c;
        java.lang.String strN = p087i7.J.n(p087i7.J.g(s6));
        if (z6) {
            n(strN);
        } else {
            k(strN);
        }
    }
}
