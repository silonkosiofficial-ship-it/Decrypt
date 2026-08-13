package p019b9;

/* JADX INFO: loaded from: classes2.dex */
public class O {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f24343b = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(p019b9.O.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p019b9.P[] f24344a;

    private final p019b9.P[] g() {
        p019b9.P[] pArr = this.f24344a;
        if (pArr == null) {
            p019b9.P[] pArr2 = new p019b9.P[4];
            this.f24344a = pArr2;
            return pArr2;
        }
        if (c() < pArr.length) {
            return pArr;
        }
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(pArr, c() * 2);
        p247y7.AbstractC7350t.e(objArrCopyOf, "copyOf(...)");
        p019b9.P[] pArr3 = (p019b9.P[]) objArrCopyOf;
        this.f24344a = pArr3;
        return pArr3;
    }

    private final void k(int i6) {
        f24343b.set(this, i6);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    private final void l(int i6) {
        while (true) {
            int i10 = i6 * 2;
            int i11 = i10 + 1;
            if (i11 >= c()) {
                return;
            }
            p019b9.P[] pArr = this.f24344a;
            p247y7.AbstractC7350t.c(pArr);
            int i12 = i10 + 2;
            if (i12 < c()) {
                p019b9.P p6 = pArr[i12];
                p247y7.AbstractC7350t.c(p6);
                p019b9.P p10 = pArr[i11];
                p247y7.AbstractC7350t.c(p10);
                if (((java.lang.Comparable) p6).compareTo(p10) >= 0) {
                    i12 = i11;
                }
            } else {
                i12 = i11;
            }
            p019b9.P p11 = pArr[i6];
            p247y7.AbstractC7350t.c(p11);
            p019b9.P p12 = pArr[i12];
            p247y7.AbstractC7350t.c(p12);
            if (((java.lang.Comparable) p11).compareTo(p12) <= 0) {
                return;
            }
            n(i6, i12);
            i6 = i12;
        }
    }

    private final void m(int i6) {
        while (i6 > 0) {
            p019b9.P[] pArr = this.f24344a;
            p247y7.AbstractC7350t.c(pArr);
            int i10 = (i6 - 1) / 2;
            p019b9.P p6 = pArr[i10];
            p247y7.AbstractC7350t.c(p6);
            p019b9.P p10 = pArr[i6];
            p247y7.AbstractC7350t.c(p10);
            if (((java.lang.Comparable) p6).compareTo(p10) <= 0) {
                return;
            }
            n(i6, i10);
            i6 = i10;
        }
    }

    private final void n(int i6, int i10) {
        p019b9.P[] pArr = this.f24344a;
        p247y7.AbstractC7350t.c(pArr);
        p019b9.P p6 = pArr[i10];
        p247y7.AbstractC7350t.c(p6);
        p019b9.P p10 = pArr[i6];
        p247y7.AbstractC7350t.c(p10);
        pArr[i6] = p6;
        pArr[i10] = p10;
        p6.setIndex(i6);
        p10.setIndex(i10);
    }

    public final void a(p019b9.P p6) {
        p6.m(this);
        p019b9.P[] pArrG = g();
        int iC = c();
        k(iC + 1);
        pArrG[iC] = p6;
        p6.setIndex(iC);
        m(iC);
    }

    public final p019b9.P b() {
        p019b9.P[] pArr = this.f24344a;
        if (pArr != null) {
            return pArr[0];
        }
        return null;
    }

    public final int c() {
        return f24343b.get(this);
    }

    public final boolean e() {
        return c() == 0;
    }

    public final p019b9.P f() {
        p019b9.P pB;
        synchronized (this) {
            pB = b();
        }
        return pB;
    }

    public final boolean h(p019b9.P p6) {
        boolean z6;
        synchronized (this) {
            if (p6.i() == null) {
                z6 = false;
            } else {
                i(p6.getIndex());
                z6 = true;
            }
        }
        return z6;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x003a  */
    public final p019b9.P i(int i6) {
        p019b9.P[] pArr = this.f24344a;
        p247y7.AbstractC7350t.c(pArr);
        k(c() - 1);
        if (i6 < c()) {
            n(i6, c());
            int i10 = (i6 - 1) / 2;
            if (i6 > 0) {
                p019b9.P p6 = pArr[i6];
                p247y7.AbstractC7350t.c(p6);
                p019b9.P p10 = pArr[i10];
                p247y7.AbstractC7350t.c(p10);
                if (((java.lang.Comparable) p6).compareTo(p10) < 0) {
                    n(i6, i10);
                    m(i10);
                } else {
                    l(i6);
                }
            } else {
                l(i6);
            }
        }
        p019b9.P p11 = pArr[c()];
        p247y7.AbstractC7350t.c(p11);
        p11.m(null);
        p11.setIndex(-1);
        pArr[c()] = null;
        return p11;
    }

    public final p019b9.P j() {
        p019b9.P pI;
        synchronized (this) {
            pI = c() > 0 ? i(0) : null;
        }
        return pI;
    }
}
