package A;

/* JADX INFO: loaded from: classes.dex */
public final class M implements A.L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final A.M f17a = new A.M();

    private M() {
    }

    @Override // A.L
    public androidx.compose.ui.d a(androidx.compose.ui.d dVar, float f6, boolean z6) {
        if (f6 > 0.0d) {
            return dVar.b(new androidx.compose.foundation.layout.LayoutWeightElement(E7.j.f(f6, Float.MAX_VALUE), z6));
        }
        throw new java.lang.IllegalArgumentException(("invalid weight " + f6 + "; must be greater than zero").toString());
    }
}
