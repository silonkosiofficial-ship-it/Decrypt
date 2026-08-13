package p251z0;

/* JADX INFO: renamed from: z0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7371g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final D0.InterfaceC0900t f57559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p251z0.C7378n f57560b = new p251z0.C7378n();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p170r.E f57561c = new p170r.E(10);

    public C7371g(D0.InterfaceC0900t interfaceC0900t) {
        this.f57559a = interfaceC0900t;
    }

    private final void f(long j6, p170r.I i6) {
        this.f57560b.i(j6, i6);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0080  */
    /* JADX WARN: Code duplicated, block: B:25:0x008a  */
    public final void a(long j6, java.util.List list, boolean z6) {
        p170r.E e6;
        java.lang.Object objB;
        java.lang.Object obj;
        p251z0.C7378n c7378n = this.f57560b;
        this.f57561c.g();
        int size = list.size();
        boolean z10 = true;
        for (int i6 = 0; i6 < size; i6++) {
            androidx.compose.ui.d.c cVar = (androidx.compose.ui.d.c) list.get(i6);
            if (z10) {
                X.b bVarG = c7378n.g();
                int iT = bVarG.t();
                if (iT <= 0) {
                    obj = null;
                    break;
                }
                java.lang.Object[] objArrS = bVarG.s();
                int i10 = 0;
                while (true) {
                    obj = objArrS[i10];
                    if (p247y7.AbstractC7350t.b(((p251z0.C7377m) obj).k(), cVar)) {
                        break;
                    }
                    i10++;
                    if (i10 >= iT) {
                        obj = null;
                        break;
                    }
                }
                p251z0.C7377m c7377m = (p251z0.C7377m) obj;
                if (c7377m != null) {
                    c7377m.n();
                    c7377m.l().b(j6);
                    p170r.E e10 = this.f57561c;
                    java.lang.Object objB2 = e10.b(j6);
                    if (objB2 == null) {
                        objB2 = new p170r.I(0, 1, null);
                        e10.o(j6, objB2);
                    }
                    ((p170r.I) objB2).g(c7377m);
                    c7378n = c7377m;
                } else {
                    z10 = false;
                    p251z0.C7377m c7377m2 = new p251z0.C7377m(cVar);
                    c7377m2.l().b(j6);
                    e6 = this.f57561c;
                    objB = e6.b(j6);
                    if (objB == null) {
                        objB = new p170r.I(0, 1, null);
                        e6.o(j6, objB);
                    }
                    ((p170r.I) objB).g(c7377m2);
                    c7378n.g().d(c7377m2);
                    c7378n = c7377m2;
                }
            } else {
                p251z0.C7377m c7377m3 = new p251z0.C7377m(cVar);
                c7377m3.l().b(j6);
                e6 = this.f57561c;
                objB = e6.b(j6);
                if (objB == null) {
                    objB = new p170r.I(0, 1, null);
                    e6.o(j6, objB);
                }
                ((p170r.I) objB).g(c7377m3);
                c7378n.g().d(c7377m3);
                c7378n = c7377m3;
            }
        }
        if (!z6) {
            return;
        }
        p170r.E e11 = this.f57561c;
        long[] jArr = e11.f53406b;
        java.lang.Object[] objArr = e11.f53407c;
        long[] jArr2 = e11.f53405a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j10 = jArr2[i11];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j10) < 128) {
                        int i14 = (i11 << 3) + i13;
                        f(jArr[i14], (p170r.I) objArr[i14]);
                    }
                    j10 >>= 8;
                }
                if (i12 != 8) {
                    return;
                }
            }
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }

    public final void b() {
        this.f57560b.c();
    }

    public final boolean c(p251z0.C7372h c7372h, boolean z6) {
        if (this.f57560b.a(c7372h.b(), this.f57559a, c7372h, z6)) {
            return this.f57560b.e(c7372h) || this.f57560b.f(c7372h.b(), this.f57559a, c7372h, z6);
        }
        return false;
    }

    public final void d() {
        this.f57560b.d();
        b();
    }

    public final void e() {
        this.f57560b.h();
    }
}
