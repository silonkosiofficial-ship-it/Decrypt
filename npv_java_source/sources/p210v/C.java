package p210v;

/* JADX INFO: loaded from: classes.dex */
public final class C extends androidx.compose.ui.d.c implements F0.E0, F0.InterfaceC0934u {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final v.C.a f55573S = new v.C.a(null);

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final int f55574T = 8;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private boolean f55575P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private final boolean f55576Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private D0.InterfaceC0900t f55577R;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    private final p210v.D T1() {
        if (!A1()) {
            return null;
        }
        F0.E0 e0A = F0.F0.a(this, p210v.D.f55578R);
        if (e0A instanceof p210v.D) {
            return (p210v.D) e0A;
        }
        return null;
    }

    private final void U1() {
        p210v.D dT1;
        D0.InterfaceC0900t interfaceC0900t = this.f55577R;
        if (interfaceC0900t != null) {
            p247y7.AbstractC7350t.c(interfaceC0900t);
            if (!interfaceC0900t.K() || (dT1 = T1()) == null) {
                return;
            }
            dT1.T1(this.f55577R);
        }
    }

    @Override // F0.E0
    public java.lang.Object K() {
        return f55573S;
    }

    public final void V1(boolean z6) {
        if (z6 == this.f55575P) {
            return;
        }
        if (z6) {
            U1();
        } else {
            p210v.D dT1 = T1();
            if (dT1 != null) {
                dT1.T1(null);
            }
        }
        this.f55575P = z6;
    }

    @Override // F0.InterfaceC0934u
    public void s(D0.InterfaceC0900t interfaceC0900t) {
        this.f55577R = interfaceC0900t;
        if (this.f55575P) {
            if (interfaceC0900t.K()) {
                U1();
                return;
            }
            p210v.D dT1 = T1();
            if (dT1 != null) {
                dT1.T1(null);
            }
        }
    }

    @Override // androidx.compose.ui.d.c
    public boolean y1() {
        return this.f55576Q;
    }
}
