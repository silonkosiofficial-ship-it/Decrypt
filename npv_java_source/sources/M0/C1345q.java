package M0;

/* JADX INFO: renamed from: M0.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1345q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final M0.InterfaceC1344p f6745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f6746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f6747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f6748d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f6749e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f6750f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f6751g;

    public C1345q(M0.InterfaceC1344p interfaceC1344p, int i6, int i10, int i11, int i12, float f6, float f10) {
        this.f6745a = interfaceC1344p;
        this.f6746b = i6;
        this.f6747c = i10;
        this.f6748d = i11;
        this.f6749e = i12;
        this.f6750f = f6;
        this.f6751g = f10;
    }

    public static /* synthetic */ long l(M0.C1345q c1345q, long j6, boolean z6, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            z6 = true;
        }
        return c1345q.k(j6, z6);
    }

    public final float a() {
        return this.f6751g;
    }

    public final int b() {
        return this.f6747c;
    }

    public final int c() {
        return this.f6749e;
    }

    public final int d() {
        return this.f6747c - this.f6746b;
    }

    public final M0.InterfaceC1344p e() {
        return this.f6745a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M0.C1345q)) {
            return false;
        }
        M0.C1345q c1345q = (M0.C1345q) obj;
        return p247y7.AbstractC7350t.b(this.f6745a, c1345q.f6745a) && this.f6746b == c1345q.f6746b && this.f6747c == c1345q.f6747c && this.f6748d == c1345q.f6748d && this.f6749e == c1345q.f6749e && java.lang.Float.compare(this.f6750f, c1345q.f6750f) == 0 && java.lang.Float.compare(this.f6751g, c1345q.f6751g) == 0;
    }

    public final int f() {
        return this.f6746b;
    }

    public final int g() {
        return this.f6748d;
    }

    public final float h() {
        return this.f6750f;
    }

    public int hashCode() {
        return (((((((((((this.f6745a.hashCode() * 31) + this.f6746b) * 31) + this.f6747c) * 31) + this.f6748d) * 31) + this.f6749e) * 31) + java.lang.Float.floatToIntBits(this.f6750f)) * 31) + java.lang.Float.floatToIntBits(this.f6751g);
    }

    public final p131n0.i i(p131n0.i iVar) {
        return iVar.t(p131n0.h.a(0.0f, this.f6750f));
    }

    public final p141o0.Q1 j(p141o0.Q1 q6) {
        q6.o(p131n0.h.a(0.0f, this.f6750f));
        return q6;
    }

    public final long k(long j6, boolean z6) {
        if (z6) {
            M0.N.a aVar = M0.N.f6666b;
            if (M0.N.g(j6, aVar.a())) {
                return aVar.a();
            }
        }
        return M0.O.b(m(M0.N.n(j6)), m(M0.N.i(j6)));
    }

    public final int m(int i6) {
        return i6 + this.f6746b;
    }

    public final int n(int i6) {
        return i6 + this.f6748d;
    }

    public final float o(float f6) {
        return f6 + this.f6750f;
    }

    public final p131n0.i p(p131n0.i iVar) {
        return iVar.t(p131n0.h.a(0.0f, -this.f6750f));
    }

    public final long q(long j6) {
        return p131n0.h.a(p131n0.g.m(j6), p131n0.g.n(j6) - this.f6750f);
    }

    public final int r(int i6) {
        return E7.j.k(i6, this.f6746b, this.f6747c) - this.f6746b;
    }

    public final int s(int i6) {
        return i6 - this.f6748d;
    }

    public final float t(float f6) {
        return f6 - this.f6750f;
    }

    public java.lang.String toString() {
        return "ParagraphInfo(paragraph=" + this.f6745a + ", startIndex=" + this.f6746b + ", endIndex=" + this.f6747c + ", startLineIndex=" + this.f6748d + ", endLineIndex=" + this.f6749e + ", top=" + this.f6750f + ", bottom=" + this.f6751g + ')';
    }
}
