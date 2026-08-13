package Y8;

/* JADX INFO: loaded from: classes2.dex */
public final class p extends p019b9.A {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Y8.h f16560e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceArray f16561f;

    public p(long j6, Y8.p pVar, Y8.h hVar, int i6) {
        super(j6, pVar, i6);
        this.f16560e = hVar;
        this.f16561f = new java.util.concurrent.atomic.AtomicReferenceArray(Y8.i.f16533b * 2);
    }

    private final void E(int i6, java.lang.Object obj) {
        z().set(i6 * 2, obj);
    }

    private final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceArray z() {
        return this.f16561f;
    }

    public final java.lang.Object A(int i6) {
        return z().get(i6 * 2);
    }

    public final java.lang.Object B(int i6) {
        return z().get((i6 * 2) + 1);
    }

    public final void C(int i6, boolean z6) {
        if (z6) {
            y().o1((this.f24329c * ((long) Y8.i.f16533b)) + ((long) i6));
        }
        t();
    }

    public final java.lang.Object D(int i6) {
        java.lang.Object objA = A(i6);
        w(i6);
        return objA;
    }

    public final void F(int i6, java.lang.Object obj) {
        z().set((i6 * 2) + 1, obj);
    }

    public final void G(int i6, java.lang.Object obj) {
        E(i6, obj);
    }

    @Override // p019b9.A
    public int r() {
        return Y8.i.f16533b;
    }

    @Override // p019b9.A
    public void s(int i6, java.lang.Throwable th, p127m7.i iVar) {
        p237x7.l lVar;
        p237x7.l lVar2;
        int i10 = Y8.i.f16533b;
        boolean z6 = i6 >= i10;
        if (z6) {
            i6 -= i10;
        }
        java.lang.Object objA = A(i6);
        while (true) {
            java.lang.Object objB = B(i6);
            if ((objB instanceof W8.e1) || (objB instanceof Y8.D)) {
                if (v(i6, objB, z6 ? Y8.i.f16541j : Y8.i.f16542k)) {
                    w(i6);
                    C(i6, !z6);
                    if (!z6 || (lVar = y().f16517D) == null) {
                        return;
                    }
                    p019b9.w.a(lVar, objA, iVar);
                    return;
                }
            } else {
                if (objB == Y8.i.f16541j || objB == Y8.i.f16542k) {
                    break;
                }
                if (objB != Y8.i.f16538g && objB != Y8.i.f16537f) {
                    if (objB == Y8.i.f16540i || objB == Y8.i.f16535d || objB == Y8.i.z()) {
                        return;
                    }
                    throw new java.lang.IllegalStateException(("unexpected state: " + objB).toString());
                }
            }
        }
        w(i6);
        if (!z6 || (lVar2 = y().f16517D) == null) {
            return;
        }
        p019b9.w.a(lVar2, objA, iVar);
    }

    public final boolean v(int i6, java.lang.Object obj, java.lang.Object obj2) {
        return Y8.o.a(z(), (i6 * 2) + 1, obj, obj2);
    }

    public final void w(int i6) {
        E(i6, null);
    }

    public final java.lang.Object x(int i6, java.lang.Object obj) {
        return z().getAndSet((i6 * 2) + 1, obj);
    }

    public final Y8.h y() {
        Y8.h hVar = this.f16560e;
        p247y7.AbstractC7350t.c(hVar);
        return hVar;
    }
}
