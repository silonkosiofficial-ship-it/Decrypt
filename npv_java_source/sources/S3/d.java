package S3;

/* JADX INFO: loaded from: classes.dex */
public final class d extends O3.e implements Q3.InterfaceC1482v {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final O3.a.g f12428k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final O3.a.AbstractC0193a f12429l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final O3.a f12430m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f12431n = 0;

    static {
        O3.a.g gVar = new O3.a.g();
        f12428k = gVar;
        S3.c cVar = new S3.c();
        f12429l = cVar;
        f12430m = new O3.a("ClientTelemetry.API", cVar, gVar);
    }

    public d(android.content.Context context, Q3.C1483w c1483w) {
        super(context, f12430m, c1483w, O3.e.a.f8042c);
    }

    @Override // Q3.InterfaceC1482v
    public final p115l4.AbstractC6931l b(final Q3.C1480t c1480t) {
        com.google.android.gms.common.api.internal.AbstractC2149d.a aVarA = com.google.android.gms.common.api.internal.AbstractC2149d.a();
        aVarA.d(p035d4.d.f44294a);
        aVarA.c(false);
        aVarA.b(new P3.i() { // from class: S3.b
            @Override // P3.i
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                int i6 = S3.d.f12431n;
                ((S3.a) ((S3.e) obj).D()).c2(c1480t);
                ((p115l4.C6932m) obj2).c(null);
            }
        });
        return e(aVarA.a());
    }
}
