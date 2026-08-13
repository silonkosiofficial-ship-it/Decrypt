package N9;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements H9.v.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final M9.e f7918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.List f7919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f7920c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final M9.c f7921d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final H9.z f7922e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f7923f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f7924g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f7925h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f7926i;

    public g(M9.e eVar, java.util.List list, int i6, M9.c cVar, H9.z zVar, int i10, int i11, int i12) {
        p247y7.AbstractC7350t.f(eVar, "call");
        p247y7.AbstractC7350t.f(list, "interceptors");
        p247y7.AbstractC7350t.f(zVar, "request");
        this.f7918a = eVar;
        this.f7919b = list;
        this.f7920c = i6;
        this.f7921d = cVar;
        this.f7922e = zVar;
        this.f7923f = i10;
        this.f7924g = i11;
        this.f7925h = i12;
    }

    public static /* synthetic */ N9.g d(N9.g gVar, int i6, M9.c cVar, H9.z zVar, int i10, int i11, int i12, int i13, java.lang.Object obj) {
        if ((i13 & 1) != 0) {
            i6 = gVar.f7920c;
        }
        if ((i13 & 2) != 0) {
            cVar = gVar.f7921d;
        }
        M9.c cVar2 = cVar;
        if ((i13 & 4) != 0) {
            zVar = gVar.f7922e;
        }
        H9.z zVar2 = zVar;
        if ((i13 & 8) != 0) {
            i10 = gVar.f7923f;
        }
        int i14 = i10;
        if ((i13 & 16) != 0) {
            i11 = gVar.f7924g;
        }
        int i15 = i11;
        if ((i13 & 32) != 0) {
            i12 = gVar.f7925h;
        }
        return gVar.c(i6, cVar2, zVar2, i14, i15, i12);
    }

    @Override // H9.v.a
    public H9.B a(H9.z zVar) {
        p247y7.AbstractC7350t.f(zVar, "request");
        if (this.f7920c >= this.f7919b.size()) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        this.f7926i++;
        M9.c cVar = this.f7921d;
        if (cVar != null) {
            if (!cVar.j().g(zVar.i())) {
                throw new java.lang.IllegalStateException(("network interceptor " + this.f7919b.get(this.f7920c - 1) + " must retain the same host and port").toString());
            }
            if (this.f7926i != 1) {
                throw new java.lang.IllegalStateException(("network interceptor " + this.f7919b.get(this.f7920c - 1) + " must call proceed() exactly once").toString());
            }
        }
        N9.g gVarD = d(this, this.f7920c + 1, null, zVar, 0, 0, 0, 58, null);
        H9.v vVar = (H9.v) this.f7919b.get(this.f7920c);
        H9.B bA = vVar.a(gVarD);
        if (bA == null) {
            throw new java.lang.NullPointerException("interceptor " + vVar + " returned null");
        }
        if (this.f7921d != null && this.f7920c + 1 < this.f7919b.size() && gVarD.f7926i != 1) {
            throw new java.lang.IllegalStateException(("network interceptor " + vVar + " must call proceed() exactly once").toString());
        }
        if (bA.a() != null) {
            return bA;
        }
        throw new java.lang.IllegalStateException(("interceptor " + vVar + " returned a response with no body").toString());
    }

    @Override // H9.v.a
    public H9.z b() {
        return this.f7922e;
    }

    public final N9.g c(int i6, M9.c cVar, H9.z zVar, int i10, int i11, int i12) {
        p247y7.AbstractC7350t.f(zVar, "request");
        return new N9.g(this.f7918a, this.f7919b, i6, cVar, zVar, i10, i11, i12);
    }

    @Override // H9.v.a
    public H9.InterfaceC1239e call() {
        return this.f7918a;
    }

    public final M9.e e() {
        return this.f7918a;
    }

    public final int f() {
        return this.f7923f;
    }

    public final M9.c g() {
        return this.f7921d;
    }

    public final int h() {
        return this.f7924g;
    }

    public final H9.z i() {
        return this.f7922e;
    }

    public final int j() {
        return this.f7925h;
    }

    public int k() {
        return this.f7924g;
    }
}
