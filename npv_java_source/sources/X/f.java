package X;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p170r.K f15570a = p170r.V.d();

    public final void a(java.lang.Object obj, java.lang.Object obj2) {
        p170r.K k6 = this.f15570a;
        int iL = k6.l(obj);
        boolean z6 = iL < 0;
        java.lang.Object obj3 = z6 ? null : k6.f53335c[iL];
        if (obj3 != null) {
            if (obj3 instanceof p170r.L) {
                p247y7.AbstractC7350t.d(obj3, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.add$lambda$0>");
                ((p170r.L) obj3).h(obj2);
            } else if (obj3 != obj2) {
                p170r.L l6 = new p170r.L(0, 1, null);
                p247y7.AbstractC7350t.d(obj3, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.add$lambda$0");
                l6.h(obj3);
                l6.h(obj2);
                obj2 = l6;
            }
            obj2 = obj3;
        }
        if (!z6) {
            k6.f53335c[iL] = obj2;
            return;
        }
        int i6 = ~iL;
        k6.f53334b[i6] = obj;
        k6.f53335c[i6] = obj2;
    }

    public final void b() {
        this.f15570a.i();
    }

    public final boolean c(java.lang.Object obj) {
        return this.f15570a.b(obj);
    }

    public final p170r.K d() {
        return this.f15570a;
    }

    public final int e() {
        return this.f15570a.e();
    }

    public final boolean f(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object objC = this.f15570a.c(obj);
        if (objC == null) {
            return false;
        }
        if (!(objC instanceof p170r.L)) {
            if (!p247y7.AbstractC7350t.b(objC, obj2)) {
                return false;
            }
            this.f15570a.p(obj);
            return true;
        }
        p170r.L l6 = (p170r.L) objC;
        boolean zX = l6.x(obj2);
        if (zX && l6.d()) {
            this.f15570a.p(obj);
        }
        return zX;
    }

    public final void g(java.lang.Object obj) {
        boolean zD;
        p170r.K k6 = this.f15570a;
        long[] jArr = k6.f53333a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i6 = 0;
        while (true) {
            long j6 = jArr[i6];
            if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i6 - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j6) < 128) {
                        int i12 = (i6 << 3) + i11;
                        java.lang.Object obj2 = k6.f53334b[i12];
                        java.lang.Object obj3 = k6.f53335c[i12];
                        if (obj3 instanceof p170r.L) {
                            p247y7.AbstractC7350t.d(obj3, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScope$lambda$3>");
                            p170r.L l6 = (p170r.L) obj3;
                            l6.x(obj);
                            zD = l6.d();
                        } else {
                            zD = obj3 == obj;
                        }
                        if (zD) {
                            k6.q(i12);
                        }
                    }
                    j6 >>= 8;
                }
                if (i10 != 8) {
                    return;
                }
            }
            if (i6 == length) {
                return;
            } else {
                i6++;
            }
        }
    }

    public final void h(java.lang.Object obj, java.lang.Object obj2) {
        this.f15570a.s(obj, obj2);
    }
}
