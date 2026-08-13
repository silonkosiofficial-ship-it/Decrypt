package p019b9;

/* JADX INFO: renamed from: b9.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C2128o {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f24372C = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(p019b9.C2128o.class, java.lang.Object.class, "_next$volatile");

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f24373D = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(p019b9.C2128o.class, java.lang.Object.class, "_prev$volatile");

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f24374E = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(p019b9.C2128o.class, java.lang.Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ java.lang.Object _next$volatile = this;
    private volatile /* synthetic */ java.lang.Object _prev$volatile = this;
    private volatile /* synthetic */ java.lang.Object _removedRef$volatile;

    private final p019b9.C2128o i() {
        java.lang.Object obj;
        while (true) {
            p019b9.C2128o c2128o = (p019b9.C2128o) f24373D.get(this);
            p019b9.C2128o c2128o2 = c2128o;
            while (true) {
                p019b9.C2128o c2128o3 = null;
                while (true) {
                    obj = f24372C.get(c2128o2);
                    if (obj == this) {
                        if (c2128o != c2128o2 && !androidx.concurrent.futures.b.a(f24373D, this, c2128o, c2128o2)) {
                            break;
                        }
                        return c2128o2;
                    }
                    if (r()) {
                        return null;
                    }
                    if (!(obj instanceof p019b9.x)) {
                        p247y7.AbstractC7350t.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                        c2128o3 = c2128o2;
                        c2128o2 = (p019b9.C2128o) obj;
                    } else {
                        if (c2128o3 != null) {
                            break;
                        }
                        c2128o2 = (p019b9.C2128o) f24373D.get(c2128o2);
                    }
                }
                if (!androidx.concurrent.futures.b.a(f24372C, c2128o3, c2128o2, ((p019b9.x) obj).f24390a)) {
                    break;
                }
                c2128o2 = c2128o3;
            }
        }
    }

    private final p019b9.C2128o j(p019b9.C2128o c2128o) {
        while (c2128o.r()) {
            c2128o = (p019b9.C2128o) f24373D.get(c2128o);
        }
        return c2128o;
    }

    private final void k(p019b9.C2128o c2128o) {
        p019b9.C2128o c2128o2;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24373D;
        do {
            c2128o2 = (p019b9.C2128o) atomicReferenceFieldUpdater.get(c2128o);
            if (l() != c2128o) {
                return;
            }
        } while (!androidx.concurrent.futures.b.a(f24373D, c2128o, c2128o2, this));
        if (r()) {
            c2128o.i();
        }
    }

    private final p019b9.x u() {
        p019b9.x xVar = (p019b9.x) f24374E.get(this);
        if (xVar != null) {
            return xVar;
        }
        p019b9.x xVar2 = new p019b9.x(this);
        f24374E.set(this, xVar2);
        return xVar2;
    }

    public final boolean b(p019b9.C2128o c2128o, int i6) {
        p019b9.C2128o c2128oN;
        do {
            c2128oN = n();
            if (c2128oN instanceof p019b9.C2126m) {
                return (((p019b9.C2126m) c2128oN).f24371F & i6) == 0 && c2128oN.b(c2128o, i6);
            }
        } while (!c2128oN.c(c2128o, this));
        return true;
    }

    public final boolean c(p019b9.C2128o c2128o, p019b9.C2128o c2128o2) {
        f24373D.set(c2128o, this);
        f24372C.set(c2128o, c2128o2);
        if (!androidx.concurrent.futures.b.a(f24372C, this, c2128o2, c2128o)) {
            return false;
        }
        c2128o.k(c2128o2);
        return true;
    }

    public final boolean d(p019b9.C2128o c2128o) {
        f24373D.set(c2128o, this);
        f24372C.set(c2128o, this);
        while (l() == this) {
            if (androidx.concurrent.futures.b.a(f24372C, this, this, c2128o)) {
                c2128o.k(this);
                return true;
            }
        }
        return false;
    }

    public final void h(int i6) {
        b(new p019b9.C2126m(i6), i6);
    }

    public final java.lang.Object l() {
        return f24372C.get(this);
    }

    public final p019b9.C2128o m() {
        p019b9.C2128o c2128o;
        java.lang.Object objL = l();
        p019b9.x xVar = objL instanceof p019b9.x ? (p019b9.x) objL : null;
        if (xVar != null && (c2128o = xVar.f24390a) != null) {
            return c2128o;
        }
        p247y7.AbstractC7350t.d(objL, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (p019b9.C2128o) objL;
    }

    public final p019b9.C2128o n() {
        p019b9.C2128o c2128oI = i();
        return c2128oI == null ? j((p019b9.C2128o) f24373D.get(this)) : c2128oI;
    }

    public boolean r() {
        return l() instanceof p019b9.x;
    }

    public boolean s() {
        return t() == null;
    }

    public final p019b9.C2128o t() {
        java.lang.Object objL;
        p019b9.C2128o c2128o;
        do {
            objL = l();
            if (objL instanceof p019b9.x) {
                return ((p019b9.x) objL).f24390a;
            }
            if (objL == this) {
                return (p019b9.C2128o) objL;
            }
            p247y7.AbstractC7350t.d(objL, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            c2128o = (p019b9.C2128o) objL;
        } while (!androidx.concurrent.futures.b.a(f24372C, this, objL, c2128o.u()));
        c2128o.i();
        return null;
    }

    public java.lang.String toString() {
        return new p247y7.E(this) { // from class: b9.o.a
            @Override // F7.l
            public java.lang.Object get() {
                return W8.S.a(this.f57287D);
            }
        } + '@' + W8.S.b(this);
    }
}
