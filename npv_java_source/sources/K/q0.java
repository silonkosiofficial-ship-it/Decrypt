package K;

/* JADX INFO: loaded from: classes.dex */
public abstract class q0 implements S0.P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private K.q0.a f5903a;

    public interface a {
        D0.InterfaceC0900t I0();

        N.F d0();

        androidx.compose.ui.platform.InterfaceC1975s1 getSoftwareKeyboardController();

        androidx.compose.ui.platform.A1 getViewConfiguration();

        H.C1230w i1();

        W8.InterfaceC1822z0 z0(p237x7.p pVar);
    }

    @Override // S0.P
    public final void c() {
        androidx.compose.ui.platform.InterfaceC1975s1 softwareKeyboardController;
        K.q0.a aVar = this.f5903a;
        if (aVar == null || (softwareKeyboardController = aVar.getSoftwareKeyboardController()) == null) {
            return;
        }
        softwareKeyboardController.b();
    }

    @Override // S0.P
    public final void h() {
        androidx.compose.ui.platform.InterfaceC1975s1 softwareKeyboardController;
        K.q0.a aVar = this.f5903a;
        if (aVar == null || (softwareKeyboardController = aVar.getSoftwareKeyboardController()) == null) {
            return;
        }
        softwareKeyboardController.a();
    }

    protected final K.q0.a i() {
        return this.f5903a;
    }

    public final void j(K.q0.a aVar) {
        if (this.f5903a != null) {
            throw new java.lang.IllegalStateException("Expected textInputModifierNode to be null".toString());
        }
        this.f5903a = aVar;
    }

    public abstract void k();

    public final void l(K.q0.a aVar) {
        if (this.f5903a == aVar) {
            this.f5903a = null;
            return;
        }
        throw new java.lang.IllegalStateException(("Expected textInputModifierNode to be " + aVar + " but was " + this.f5903a).toString());
    }
}
