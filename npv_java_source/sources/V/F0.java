package V;

/* JADX INFO: loaded from: classes.dex */
final class F0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List f14658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f14659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f14660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.List f14661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p170r.C f14662e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p087i7.InterfaceC6668n f14663f;

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {
        a() {
            super(0);
        }

        public final p170r.K a() {
            p170r.K kI = V.AbstractC1741q.I(V.F0.this.b().size());
            V.F0 f6 = V.F0.this;
            int size = f6.b().size();
            for (int i6 = 0; i6 < size; i6++) {
                V.C1702c0 c1702c0 = (V.C1702c0) f6.b().get(i6);
                V.C1751v0.f(kI, V.AbstractC1741q.A(c1702c0), c1702c0);
            }
            return kI;
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            return V.C1751v0.a(a());
        }
    }

    public F0(java.util.List list, int i6) {
        this.f14658a = list;
        this.f14659b = i6;
        if (!(i6 >= 0)) {
            V.I0.a("Invalid start index");
        }
        this.f14661d = new java.util.ArrayList();
        p170r.C c6 = new p170r.C(0, 1, null);
        int size = list.size();
        int iC = 0;
        for (int i10 = 0; i10 < size; i10++) {
            V.C1702c0 c1702c0 = (V.C1702c0) this.f14658a.get(i10);
            c6.s(c1702c0.b(), new V.T(i10, iC, c1702c0.c()));
            iC += c1702c0.c();
        }
        this.f14662e = c6;
        this.f14663f = p087i7.AbstractC6669o.b(new V.F0.a());
    }

    public final int a() {
        return this.f14660c;
    }

    public final java.util.List b() {
        return this.f14658a;
    }

    public final p170r.K c() {
        return ((V.C1751v0) this.f14663f.getValue()).h();
    }

    public final V.C1702c0 d(int i6, java.lang.Object obj) {
        return (V.C1702c0) V.C1751v0.e(c(), obj != null ? new V.C1699b0(java.lang.Integer.valueOf(i6), obj) : java.lang.Integer.valueOf(i6));
    }

    public final int e() {
        return this.f14659b;
    }

    public final java.util.List f() {
        return this.f14661d;
    }

    public final int g(V.C1702c0 c1702c0) {
        V.T t6 = (V.T) this.f14662e.c(c1702c0.b());
        if (t6 != null) {
            return t6.b();
        }
        return -1;
    }

    public final boolean h(V.C1702c0 c1702c0) {
        return this.f14661d.add(c1702c0);
    }

    public final void i(V.C1702c0 c1702c0, int i6) {
        this.f14662e.s(c1702c0.b(), new V.T(-1, i6, 0));
    }

    public final void j(int i6, int i10, int i11) {
        int i12;
        int i13;
        char c6 = 7;
        long j6 = -9187201950435737472L;
        if (i6 > i10) {
            p170r.C c10 = this.f14662e;
            java.lang.Object[] objArr = c10.f53395c;
            long[] jArr = c10.f53393a;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i14 = 0;
            while (true) {
                long j10 = jArr[i14];
                if ((((~j10) << 7) & j10 & j6) != j6) {
                    int i15 = 8 - ((~(i14 - length)) >>> 31);
                    for (int i16 = 0; i16 < i15; i16++) {
                        if ((j10 & 255) < 128) {
                            V.T t6 = (V.T) objArr[(i14 << 3) + i16];
                            int iB = t6.b();
                            if (i6 <= iB && iB < i6 + i11) {
                                i13 = (iB - i6) + i10;
                            } else if (i10 <= iB && iB < i6) {
                                i13 = iB + i11;
                            }
                            t6.e(i13);
                        }
                        j10 >>= 8;
                    }
                    if (i15 != 8) {
                        return;
                    }
                }
                if (i14 == length) {
                    return;
                }
                i14++;
                j6 = -9187201950435737472L;
            }
        } else {
            if (i10 <= i6) {
                return;
            }
            p170r.C c11 = this.f14662e;
            java.lang.Object[] objArr2 = c11.f53395c;
            long[] jArr2 = c11.f53393a;
            int length2 = jArr2.length - 2;
            if (length2 < 0) {
                return;
            }
            int i17 = 0;
            while (true) {
                long j11 = jArr2[i17];
                if ((((~j11) << c6) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i18 = 8 - ((~(i17 - length2)) >>> 31);
                    for (int i19 = 0; i19 < i18; i19++) {
                        if ((j11 & 255) < 128) {
                            V.T t10 = (V.T) objArr2[(i17 << 3) + i19];
                            int iB2 = t10.b();
                            if (i6 <= iB2 && iB2 < i6 + i11) {
                                i12 = (iB2 - i6) + i10;
                            } else if (i6 + 1 <= iB2 && iB2 < i10) {
                                i12 = iB2 - i11;
                            }
                            t10.e(i12);
                        }
                        j11 >>= 8;
                    }
                    if (i18 != 8) {
                        return;
                    }
                }
                if (i17 == length2) {
                    return;
                }
                i17++;
                c6 = 7;
            }
        }
    }

    public final void k(int i6, int i10) {
        char c6 = 7;
        long j6 = -9187201950435737472L;
        if (i6 > i10) {
            p170r.C c10 = this.f14662e;
            java.lang.Object[] objArr = c10.f53395c;
            long[] jArr = c10.f53393a;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i11 = 0;
            while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & j6) != j6) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((j10 & 255) < 128) {
                            V.T t6 = (V.T) objArr[(i11 << 3) + i13];
                            int iC = t6.c();
                            if (iC == i6) {
                                t6.f(i10);
                            } else if (i10 <= iC && iC < i6) {
                                t6.f(iC + 1);
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i12 != 8) {
                        return;
                    }
                }
                if (i11 == length) {
                    return;
                }
                i11++;
                j6 = -9187201950435737472L;
            }
        } else {
            if (i10 <= i6) {
                return;
            }
            p170r.C c11 = this.f14662e;
            java.lang.Object[] objArr2 = c11.f53395c;
            long[] jArr2 = c11.f53393a;
            int length2 = jArr2.length - 2;
            if (length2 < 0) {
                return;
            }
            int i14 = 0;
            while (true) {
                long j11 = jArr2[i14];
                if ((((~j11) << c6) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i15 = 8 - ((~(i14 - length2)) >>> 31);
                    for (int i16 = 0; i16 < i15; i16++) {
                        if ((j11 & 255) < 128) {
                            V.T t10 = (V.T) objArr2[(i14 << 3) + i16];
                            int iC2 = t10.c();
                            if (iC2 == i6) {
                                t10.f(i10);
                            } else if (i6 + 1 <= iC2 && iC2 < i10) {
                                t10.f(iC2 - 1);
                            }
                        }
                        j11 >>= 8;
                    }
                    if (i15 != 8) {
                        return;
                    }
                }
                if (i14 == length2) {
                    return;
                }
                i14++;
                c6 = 7;
            }
        }
    }

    public final void l(int i6) {
        this.f14660c = i6;
    }

    public final int m(V.C1702c0 c1702c0) {
        V.T t6 = (V.T) this.f14662e.c(c1702c0.b());
        if (t6 != null) {
            return t6.c();
        }
        return -1;
    }

    public final boolean n(int i6, int i10) {
        int iB;
        V.T t6 = (V.T) this.f14662e.c(i6);
        if (t6 == null) {
            return false;
        }
        int iB2 = t6.b();
        int iA = i10 - t6.a();
        t6.d(i10);
        if (iA == 0) {
            return true;
        }
        p170r.C c6 = this.f14662e;
        java.lang.Object[] objArr = c6.f53395c;
        long[] jArr = c6.f53393a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i11 = 0;
        while (true) {
            long j6 = jArr[i11];
            if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j6) < 128) {
                        V.T t10 = (V.T) objArr[(i11 << 3) + i13];
                        if (t10.b() >= iB2 && !p247y7.AbstractC7350t.b(t10, t6) && (iB = t10.b() + iA) >= 0) {
                            t10.e(iB);
                        }
                    }
                    j6 >>= 8;
                }
                if (i12 != 8) {
                    return true;
                }
            }
            if (i11 == length) {
                return true;
            }
            i11++;
        }
    }

    public final int o(V.C1702c0 c1702c0) {
        V.T t6 = (V.T) this.f14662e.c(c1702c0.b());
        return t6 != null ? t6.a() : c1702c0.c();
    }
}
