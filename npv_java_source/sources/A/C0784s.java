package A;

/* JADX INFO: renamed from: A.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0784s extends androidx.compose.ui.d.c implements F0.r0 {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private h0.c.b f148P;

    public C0784s(h0.c.b bVar) {
        this.f148P = bVar;
    }

    @Override // F0.r0
    /* JADX INFO: renamed from: T1, reason: merged with bridge method [inline-methods] */
    public A.H G(Y0.e eVar, java.lang.Object obj) {
        A.H h6 = obj instanceof A.H ? (A.H) obj : null;
        if (h6 == null) {
            h6 = new A.H(0.0f, false, null, null, 15, null);
        }
        h6.e(A.AbstractC0780n.f130a.a(this.f148P));
        return h6;
    }

    public final void U1(h0.c.b bVar) {
        this.f148P = bVar;
    }
}
