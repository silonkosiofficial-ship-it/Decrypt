package K0;

/* JADX INFO: loaded from: classes.dex */
public final class c extends androidx.compose.ui.d.c implements F0.z0 {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private boolean f5942P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private boolean f5943Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private p237x7.l f5944R;

    public c(boolean z6, boolean z10, p237x7.l lVar) {
        this.f5942P = z6;
        this.f5943Q = z10;
        this.f5944R = lVar;
    }

    @Override // F0.z0
    public void M0(K0.w wVar) {
        this.f5944R.l(wVar);
    }

    public final void T1(boolean z6) {
        this.f5942P = z6;
    }

    public final void U1(p237x7.l lVar) {
        this.f5944R = lVar;
    }

    @Override // F0.z0
    public boolean h0() {
        return this.f5943Q;
    }

    @Override // F0.z0
    public boolean k1() {
        return this.f5942P;
    }
}
