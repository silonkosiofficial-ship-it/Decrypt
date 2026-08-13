package V;

/* JADX INFO: loaded from: classes.dex */
public final class P0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f14698i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V.AbstractC1752w f14699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f14700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final V.u1 f14701c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final V.InterfaceC1753w0 f14702d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p237x7.l f14703e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f14704f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.lang.Object f14705g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f14706h = true;

    public P0(V.AbstractC1752w abstractC1752w, java.lang.Object obj, boolean z6, V.u1 u1Var, V.InterfaceC1753w0 interfaceC1753w0, p237x7.l lVar, boolean z10) {
        this.f14699a = abstractC1752w;
        this.f14700b = z6;
        this.f14701c = u1Var;
        this.f14702d = interfaceC1753w0;
        this.f14703e = lVar;
        this.f14704f = z10;
        this.f14705g = obj;
    }

    public final boolean a() {
        return this.f14706h;
    }

    public final V.AbstractC1752w b() {
        return this.f14699a;
    }

    public final p237x7.l c() {
        return this.f14703e;
    }

    public final java.lang.Object d() {
        if (this.f14700b) {
            return null;
        }
        V.InterfaceC1753w0 interfaceC1753w0 = this.f14702d;
        if (interfaceC1753w0 != null) {
            return interfaceC1753w0.getValue();
        }
        java.lang.Object obj = this.f14705g;
        if (obj != null) {
            return obj;
        }
        V.AbstractC1741q.s("Unexpected form of a provided value");
        throw new p087i7.C6665k();
    }

    public final V.u1 e() {
        return this.f14701c;
    }

    public final V.InterfaceC1753w0 f() {
        return this.f14702d;
    }

    public final java.lang.Object g() {
        return this.f14705g;
    }

    public final V.P0 h() {
        this.f14706h = false;
        return this;
    }

    public final boolean i() {
        return this.f14704f;
    }

    public final boolean j() {
        return (this.f14700b || g() != null) && !this.f14704f;
    }
}
