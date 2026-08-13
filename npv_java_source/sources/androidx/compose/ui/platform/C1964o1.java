package androidx.compose.ui.platform;

/* JADX INFO: renamed from: androidx.compose.ui.platform.o1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1964o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final K0.k f20164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p170r.D f20165b = p170r.AbstractC7042q.b();

    public C1964o1(K0.o oVar, p170r.AbstractC7039n abstractC7039n) {
        this.f20164a = oVar.w();
        java.util.List listT = oVar.t();
        int size = listT.size();
        for (int i6 = 0; i6 < size; i6++) {
            K0.o oVar2 = (K0.o) listT.get(i6);
            if (abstractC7039n.a(oVar2.o())) {
                this.f20165b.f(oVar2.o());
            }
        }
    }

    public final p170r.D a() {
        return this.f20165b;
    }

    public final K0.k b() {
        return this.f20164a;
    }
}
