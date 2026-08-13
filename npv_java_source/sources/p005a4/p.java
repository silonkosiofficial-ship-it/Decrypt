package p005a4;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends O3.e implements H3.b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final O3.a.g f17053m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final O3.a.AbstractC0193a f17054n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final O3.a f17055o;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final android.content.Context f17056k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final N3.C1395h f17057l;

    static {
        O3.a.g gVar = new O3.a.g();
        f17053m = gVar;
        p005a4.n nVar = new p005a4.n();
        f17054n = nVar;
        f17055o = new O3.a("AppSet.API", nVar, gVar);
    }

    p(android.content.Context context, N3.C1395h c1395h) {
        super(context, f17055o, O3.a.d.f8030c, O3.e.a.f8042c);
        this.f17056k = context;
        this.f17057l = c1395h;
    }

    @Override // H3.b
    public final p115l4.AbstractC6931l a() {
        return this.f17057l.h(this.f17056k, 212800000) == 0 ? f(com.google.android.gms.common.api.internal.AbstractC2149d.a().d(H3.h.f4364a).b(new P3.i() { // from class: a4.m
            @Override // P3.i
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                ((p005a4.g) ((p005a4.d) obj).D()).L0(new H3.d(null, null), new p005a4.o(this.f17051a, (p115l4.C6932m) obj2));
            }
        }).c(false).e(27601).a()) : p115l4.AbstractC6934o.d(new O3.b(new com.google.android.gms.common.api.Status(17)));
    }
}
