package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class K implements androidx.lifecycle.InterfaceC2083o, java.io.Closeable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.String f22763C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final androidx.lifecycle.I f22764D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f22765E;

    public K(java.lang.String str, androidx.lifecycle.I i6) {
        p247y7.AbstractC7350t.f(str, "key");
        p247y7.AbstractC7350t.f(i6, "handle");
        this.f22763C = str;
        this.f22764D = i6;
    }

    public final void a(p233x2.d dVar, androidx.lifecycle.AbstractC2079k abstractC2079k) {
        p247y7.AbstractC7350t.f(dVar, "registry");
        p247y7.AbstractC7350t.f(abstractC2079k, "lifecycle");
        if (!(!this.f22765E)) {
            throw new java.lang.IllegalStateException("Already attached to lifecycleOwner".toString());
        }
        this.f22765E = true;
        abstractC2079k.a(this);
        dVar.h(this.f22763C, this.f22764D.c());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // androidx.lifecycle.InterfaceC2083o
    public void i(androidx.lifecycle.r rVar, androidx.lifecycle.AbstractC2079k.a aVar) {
        p247y7.AbstractC7350t.f(rVar, "source");
        p247y7.AbstractC7350t.f(aVar, "event");
        if (aVar == androidx.lifecycle.AbstractC2079k.a.ON_DESTROY) {
            this.f22765E = false;
            rVar.u().d(this);
        }
    }

    public final androidx.lifecycle.I r() {
        return this.f22764D;
    }

    public final boolean s() {
        return this.f22765E;
    }
}
