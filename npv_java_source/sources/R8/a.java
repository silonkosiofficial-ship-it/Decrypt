package R8;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements R8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReference f9741a;

    public a(R8.h hVar) {
        p247y7.AbstractC7350t.f(hVar, "sequence");
        this.f9741a = new java.util.concurrent.atomic.AtomicReference(hVar);
    }

    @Override // R8.h
    public java.util.Iterator iterator() {
        R8.h hVar = (R8.h) this.f9741a.getAndSet(null);
        if (hVar != null) {
            return hVar.iterator();
        }
        throw new java.lang.IllegalStateException("This sequence can be consumed only once.");
    }
}
