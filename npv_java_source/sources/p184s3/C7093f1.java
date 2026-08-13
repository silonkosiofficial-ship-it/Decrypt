package p184s3;

/* JADX INFO: renamed from: s3.f1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7093f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f54233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.List f54234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.Set f54235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final android.os.Bundle f54236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.util.Map f54237e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.lang.String f54238f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.lang.String f54239g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f54240h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final java.util.Set f54241i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final android.os.Bundle f54242j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final java.util.Set f54243k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f54244l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final java.lang.String f54245m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f54246n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f54247o = 0;

    public C7093f1(p184s3.C7090e1 c7090e1, G3.a aVar) {
        this.f54233a = c7090e1.f54221g;
        this.f54234b = c7090e1.f54222h;
        this.f54235c = j$.util.DesugarCollections.unmodifiableSet(c7090e1.f54215a);
        this.f54236d = c7090e1.f54216b;
        this.f54237e = j$.util.DesugarCollections.unmodifiableMap(c7090e1.f54217c);
        this.f54238f = c7090e1.f54223i;
        this.f54239g = c7090e1.f54224j;
        this.f54240h = c7090e1.f54225k;
        this.f54241i = j$.util.DesugarCollections.unmodifiableSet(c7090e1.f54218d);
        this.f54242j = c7090e1.f54219e;
        this.f54243k = j$.util.DesugarCollections.unmodifiableSet(c7090e1.f54220f);
        this.f54244l = c7090e1.f54226l;
        this.f54245m = c7090e1.f54227m;
        this.f54246n = c7090e1.f54228n;
    }

    public final int a() {
        return this.f54246n;
    }

    public final int b() {
        return this.f54240h;
    }

    public final long c() {
        return this.f54247o;
    }

    public final android.os.Bundle d() {
        return this.f54242j;
    }

    public final android.os.Bundle e(java.lang.Class cls) {
        return this.f54236d.getBundle(cls.getName());
    }

    public final android.os.Bundle f() {
        return this.f54236d;
    }

    public final G3.a g() {
        return null;
    }

    public final java.lang.String h() {
        return this.f54245m;
    }

    public final java.lang.String i() {
        return this.f54233a;
    }

    public final java.lang.String j() {
        return this.f54238f;
    }

    public final java.lang.String k() {
        return this.f54239g;
    }

    public final java.util.List l() {
        return new java.util.ArrayList(this.f54234b);
    }

    public final java.util.Set m() {
        return this.f54243k;
    }

    public final java.util.Set n() {
        return this.f54235c;
    }

    public final void o(long j6) {
        this.f54247o = j6;
    }

    public final boolean p() {
        return this.f54244l;
    }

    public final boolean q(android.content.Context context) {
        p104k3.t tVarE = p184s3.C7120o1.h().e();
        p184s3.C7147y.b();
        java.util.Set set = this.f54241i;
        java.lang.String strA = p224w3.g.A(context);
        return set.contains(strA) || tVarE.e().contains(strA);
    }
}
