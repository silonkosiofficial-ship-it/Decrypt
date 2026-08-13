package p019b9;

/* JADX INFO: renamed from: b9.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C2129p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f24375a = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(p019b9.C2129p.class, java.lang.Object.class, "_cur$volatile");
    private volatile /* synthetic */ java.lang.Object _cur$volatile;

    public C2129p(boolean z6) {
        this._cur$volatile = new p019b9.C2130q(8, z6);
    }

    public final boolean a(java.lang.Object obj) {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24375a;
        while (true) {
            p019b9.C2130q c2130q = (p019b9.C2130q) atomicReferenceFieldUpdater.get(this);
            int iA = c2130q.a(obj);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                androidx.concurrent.futures.b.a(f24375a, this, c2130q, c2130q.l());
            } else if (iA == 2) {
                return false;
            }
        }
    }

    public final void b() {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24375a;
        while (true) {
            p019b9.C2130q c2130q = (p019b9.C2130q) atomicReferenceFieldUpdater.get(this);
            if (c2130q.d()) {
                return;
            } else {
                androidx.concurrent.futures.b.a(f24375a, this, c2130q, c2130q.l());
            }
        }
    }

    public final int c() {
        return ((p019b9.C2130q) f24375a.get(this)).g();
    }

    public final java.lang.Object e() {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24375a;
        while (true) {
            p019b9.C2130q c2130q = (p019b9.C2130q) atomicReferenceFieldUpdater.get(this);
            java.lang.Object objM = c2130q.m();
            if (objM != p019b9.C2130q.f24379h) {
                return objM;
            }
            androidx.concurrent.futures.b.a(f24375a, this, c2130q, c2130q.l());
        }
    }
}
