package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class J implements androidx.lifecycle.InterfaceC2083o {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final androidx.lifecycle.M f22762C;

    public J(androidx.lifecycle.M m6) {
        p247y7.AbstractC7350t.f(m6, "provider");
        this.f22762C = m6;
    }

    @Override // androidx.lifecycle.InterfaceC2083o
    public void i(androidx.lifecycle.r rVar, androidx.lifecycle.AbstractC2079k.a aVar) {
        p247y7.AbstractC7350t.f(rVar, "source");
        p247y7.AbstractC7350t.f(aVar, "event");
        if (aVar == androidx.lifecycle.AbstractC2079k.a.ON_CREATE) {
            rVar.u().d(this);
            this.f22762C.d();
        } else {
            throw new java.lang.IllegalStateException(("Next event must be ON_CREATE, it was " + aVar).toString());
        }
    }
}
