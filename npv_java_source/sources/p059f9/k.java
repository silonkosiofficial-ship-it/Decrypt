package p059f9;

/* JADX INFO: loaded from: classes2.dex */
final class k extends p019b9.A {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceArray f45425e;

    public k(long j6, p059f9.k kVar, int i6) {
        super(j6, kVar, i6);
        this.f45425e = new java.util.concurrent.atomic.AtomicReferenceArray(p059f9.j.f45424f);
    }

    @Override // p019b9.A
    public int r() {
        return p059f9.j.f45424f;
    }

    @Override // p019b9.A
    public void s(int i6, java.lang.Throwable th, p127m7.i iVar) {
        v().set(i6, p059f9.j.f45423e);
        t();
    }

    public java.lang.String toString() {
        return "SemaphoreSegment[id=" + this.f24329c + ", hashCode=" + hashCode() + ']';
    }

    public final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceArray v() {
        return this.f45425e;
    }
}
