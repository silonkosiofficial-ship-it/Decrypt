package p009a9;

/* JADX INFO: renamed from: a9.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1885b {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private p009a9.d[] f17156C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f17157D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f17158E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private p009a9.B f17159F;

    protected final p009a9.d h() {
        p009a9.d dVarI;
        p009a9.B b6;
        synchronized (this) {
            try {
                p009a9.d[] dVarArrJ = this.f17156C;
                if (dVarArrJ == null) {
                    dVarArrJ = j(2);
                    this.f17156C = dVarArrJ;
                } else if (this.f17157D >= dVarArrJ.length) {
                    java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(dVarArrJ, dVarArrJ.length * 2);
                    p247y7.AbstractC7350t.e(objArrCopyOf, "copyOf(...)");
                    this.f17156C = (p009a9.d[]) objArrCopyOf;
                    dVarArrJ = (p009a9.d[]) objArrCopyOf;
                }
                int i6 = this.f17158E;
                do {
                    dVarI = dVarArrJ[i6];
                    if (dVarI == null) {
                        dVarI = i();
                        dVarArrJ[i6] = dVarI;
                    }
                    i6++;
                    if (i6 >= dVarArrJ.length) {
                        i6 = 0;
                    }
                    p247y7.AbstractC7350t.d(dVarI, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                } while (!dVarI.a(this));
                this.f17158E = i6;
                this.f17157D++;
                b6 = this.f17159F;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        if (b6 != null) {
            b6.c0(1);
        }
        return dVarI;
    }

    protected abstract p009a9.d i();

    protected abstract p009a9.d[] j(int i6);

    protected final void k(p009a9.d dVar) {
        p009a9.B b6;
        int i6;
        p127m7.e[] eVarArrB;
        synchronized (this) {
            try {
                int i10 = this.f17157D - 1;
                this.f17157D = i10;
                b6 = this.f17159F;
                if (i10 == 0) {
                    this.f17158E = 0;
                }
                p247y7.AbstractC7350t.d(dVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                eVarArrB = dVar.b(this);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        for (p127m7.e eVar : eVarArrB) {
            if (eVar != null) {
                i7.w.a aVar = p087i7.w.f46751D;
                eVar.t(p087i7.w.b(p087i7.M.f46721a));
            }
        }
        if (b6 != null) {
            b6.c0(-1);
        }
    }

    protected final int l() {
        return this.f17157D;
    }

    protected final p009a9.d[] o() {
        return this.f17156C;
    }

    public final Z8.N p() {
        p009a9.B b6;
        synchronized (this) {
            b6 = this.f17159F;
            if (b6 == null) {
                b6 = new p009a9.B(this.f17157D);
                this.f17159F = b6;
            }
        }
        return b6;
    }
}
