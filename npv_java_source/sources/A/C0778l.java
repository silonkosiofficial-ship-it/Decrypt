package A;

/* JADX INFO: renamed from: A.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0778l implements A.InterfaceC0777k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final A.C0778l f127a = new A.C0778l();

    private C0778l() {
    }

    @Override // A.InterfaceC0777k
    public androidx.compose.ui.d a(androidx.compose.ui.d dVar, float f6, boolean z6) {
        if (f6 > 0.0d) {
            return dVar.b(new androidx.compose.foundation.layout.LayoutWeightElement(E7.j.f(f6, Float.MAX_VALUE), z6));
        }
        throw new java.lang.IllegalArgumentException(("invalid weight " + f6 + "; must be greater than zero").toString());
    }

    @Override // A.InterfaceC0777k
    public androidx.compose.ui.d b(androidx.compose.ui.d dVar, h0.c.b bVar) {
        return dVar.b(new androidx.compose.foundation.layout.HorizontalAlignElement(bVar));
    }
}
