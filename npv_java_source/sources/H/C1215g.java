package H;

/* JADX INFO: renamed from: H.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1215g extends p247y7.AbstractC7352v implements p237x7.p {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final /* synthetic */ H.C f3900D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1215g(H.C c6) {
        super(2);
        this.f3900D = c6;
    }

    public final java.lang.String a(V.InterfaceC1734n interfaceC1734n, int i6) {
        interfaceC1734n.T(-1451087197);
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(-1451087197, i6, -1, "androidx.compose.foundation.text.TextItem.<anonymous> (ContextMenu.android.kt:98)");
        }
        java.lang.String strG = this.f3900D.g(interfaceC1734n, 0);
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        interfaceC1734n.J();
        return strG;
    }

    @Override // p237x7.p
    public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
        return a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
    }
}
