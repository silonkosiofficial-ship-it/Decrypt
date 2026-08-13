package p023c2;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.lifecycle.X f24411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.lifecycle.V.c f24412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p023c2.a f24413c;

    public g(androidx.lifecycle.X x6, androidx.lifecycle.V.c cVar, p023c2.a aVar) {
        p247y7.AbstractC7350t.f(x6, "store");
        p247y7.AbstractC7350t.f(cVar, "factory");
        p247y7.AbstractC7350t.f(aVar, "extras");
        this.f24411a = x6;
        this.f24412b = cVar;
        this.f24413c = aVar;
    }

    public static /* synthetic */ androidx.lifecycle.T b(p023c2.g gVar, F7.c cVar, java.lang.String str, int i6, java.lang.Object obj) {
        if ((i6 & 2) != 0) {
            str = p043e2.g.f44643a.e(cVar);
        }
        return gVar.a(cVar, str);
    }

    public final androidx.lifecycle.T a(F7.c cVar, java.lang.String str) {
        p247y7.AbstractC7350t.f(cVar, "modelClass");
        p247y7.AbstractC7350t.f(str, "key");
        androidx.lifecycle.T tB = this.f24411a.b(str);
        if (!cVar.d(tB)) {
            p023c2.d dVar = new p023c2.d(this.f24413c);
            dVar.c(e2.g.a.f44644a, str);
            androidx.lifecycle.T tA = p023c2.h.a(this.f24412b, cVar, dVar);
            this.f24411a.d(str, tA);
            return tA;
        }
        java.lang.Object obj = this.f24412b;
        if (obj instanceof androidx.lifecycle.V.e) {
            p247y7.AbstractC7350t.c(tB);
            ((androidx.lifecycle.V.e) obj).d(tB);
        }
        p247y7.AbstractC7350t.d(tB, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
        return tB;
    }
}
