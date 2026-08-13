package M0;

/* JADX INFO: loaded from: classes.dex */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final M0.C1332d f6643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final M0.P f6644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.List f6645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f6646d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f6647e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f6648f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Y0.e f6649g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Y0.v f6650h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final R0.AbstractC1494h.b f6651i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f6652j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private R0.InterfaceC1493g f6653k;

    private J(M0.C1332d c1332d, M0.P p6, java.util.List list, int i6, boolean z6, int i10, Y0.e eVar, Y0.v vVar, R0.InterfaceC1493g interfaceC1493g, R0.AbstractC1494h.b bVar, long j6) {
        this.f6643a = c1332d;
        this.f6644b = p6;
        this.f6645c = list;
        this.f6646d = i6;
        this.f6647e = z6;
        this.f6648f = i10;
        this.f6649g = eVar;
        this.f6650h = vVar;
        this.f6651i = bVar;
        this.f6652j = j6;
        this.f6653k = interfaceC1493g;
    }

    private J(M0.C1332d c1332d, M0.P p6, java.util.List list, int i6, boolean z6, int i10, Y0.e eVar, Y0.v vVar, R0.AbstractC1494h.b bVar, long j6) {
        this(c1332d, p6, list, i6, z6, i10, eVar, vVar, (R0.InterfaceC1493g) null, bVar, j6);
    }

    public /* synthetic */ J(M0.C1332d c1332d, M0.P p6, java.util.List list, int i6, boolean z6, int i10, Y0.e eVar, Y0.v vVar, R0.AbstractC1494h.b bVar, long j6, p247y7.AbstractC7342k abstractC7342k) {
        this(c1332d, p6, list, i6, z6, i10, eVar, vVar, bVar, j6);
    }

    public final long a() {
        return this.f6652j;
    }

    public final Y0.e b() {
        return this.f6649g;
    }

    public final R0.AbstractC1494h.b c() {
        return this.f6651i;
    }

    public final Y0.v d() {
        return this.f6650h;
    }

    public final int e() {
        return this.f6646d;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M0.J)) {
            return false;
        }
        M0.J j6 = (M0.J) obj;
        return p247y7.AbstractC7350t.b(this.f6643a, j6.f6643a) && p247y7.AbstractC7350t.b(this.f6644b, j6.f6644b) && p247y7.AbstractC7350t.b(this.f6645c, j6.f6645c) && this.f6646d == j6.f6646d && this.f6647e == j6.f6647e && X0.u.e(this.f6648f, j6.f6648f) && p247y7.AbstractC7350t.b(this.f6649g, j6.f6649g) && this.f6650h == j6.f6650h && p247y7.AbstractC7350t.b(this.f6651i, j6.f6651i) && Y0.C1859b.f(this.f6652j, j6.f6652j);
    }

    public final int f() {
        return this.f6648f;
    }

    public final java.util.List g() {
        return this.f6645c;
    }

    public final boolean h() {
        return this.f6647e;
    }

    public int hashCode() {
        return (((((((((((((((((this.f6643a.hashCode() * 31) + this.f6644b.hashCode()) * 31) + this.f6645c.hashCode()) * 31) + this.f6646d) * 31) + p190t.h.a(this.f6647e)) * 31) + X0.u.f(this.f6648f)) * 31) + this.f6649g.hashCode()) * 31) + this.f6650h.hashCode()) * 31) + this.f6651i.hashCode()) * 31) + Y0.C1859b.o(this.f6652j);
    }

    public final M0.P i() {
        return this.f6644b;
    }

    public final M0.C1332d j() {
        return this.f6643a;
    }

    public java.lang.String toString() {
        return "TextLayoutInput(text=" + ((java.lang.Object) this.f6643a) + ", style=" + this.f6644b + ", placeholders=" + this.f6645c + ", maxLines=" + this.f6646d + ", softWrap=" + this.f6647e + ", overflow=" + ((java.lang.Object) X0.u.g(this.f6648f)) + ", density=" + this.f6649g + ", layoutDirection=" + this.f6650h + ", fontFamilyResolver=" + this.f6651i + ", constraints=" + ((java.lang.Object) Y0.C1859b.q(this.f6652j)) + ')';
    }
}
