package A;

/* JADX INFO: loaded from: classes.dex */
public final class z extends androidx.compose.ui.d.c implements F0.r0 {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private float f169P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private boolean f170Q;

    public z(float f6, boolean z6) {
        this.f169P = f6;
        this.f170Q = z6;
    }

    @Override // F0.r0
    /* JADX INFO: renamed from: T1, reason: merged with bridge method [inline-methods] */
    public A.H G(Y0.e eVar, java.lang.Object obj) {
        A.H h6 = obj instanceof A.H ? (A.H) obj : null;
        if (h6 == null) {
            h6 = new A.H(0.0f, false, null, null, 15, null);
        }
        h6.g(this.f169P);
        h6.f(this.f170Q);
        return h6;
    }

    public final void U1(boolean z6) {
        this.f170Q = z6;
    }

    public final void V1(float f6) {
        this.f169P = f6;
    }
}
