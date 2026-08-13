package androidx.compose.ui.platform;

/* JADX INFO: renamed from: androidx.compose.ui.platform.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1969q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.os.Parcel f20214a;

    public C1969q0(java.lang.String str) {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        this.f20214a = parcelObtain;
        byte[] bArrDecode = android.util.Base64.decode(str, 0);
        parcelObtain.unmarshall(bArrDecode, 0, bArrDecode.length);
        parcelObtain.setDataPosition(0);
    }

    private final int a() {
        return this.f20214a.dataAvail();
    }

    private final float b() {
        return X0.a.c(e());
    }

    private final byte c() {
        return this.f20214a.readByte();
    }

    private final float e() {
        return this.f20214a.readFloat();
    }

    private final int i() {
        return this.f20214a.readInt();
    }

    private final p141o0.c2 j() {
        return new p141o0.c2(d(), p131n0.h.a(e(), e()), e(), null);
    }

    private final java.lang.String l() {
        return this.f20214a.readString();
    }

    private final X0.k m() {
        int i6 = i();
        X0.k.a aVar = X0.k.f15631b;
        boolean z6 = (aVar.b().e() & i6) != 0;
        boolean z10 = (i6 & aVar.d().e()) != 0;
        if (z6 && z10) {
            return aVar.a(p097j7.AbstractC6879v.p(aVar.b(), aVar.d()));
        }
        if (z6) {
            return aVar.b();
        }
        return z10 ? aVar.d() : aVar.c();
    }

    private final X0.p n() {
        return new X0.p(e(), e());
    }

    private final long p() {
        return p087i7.G.g(this.f20214a.readLong());
    }

    public final long d() {
        return p141o0.C7016y0.j(p());
    }

    public final int f() {
        byte bC = c();
        return (bC != 0 && bC == 1) ? R0.o.f9321b.a() : R0.o.f9321b.b();
    }

    public final int g() {
        byte bC = c();
        if (bC != 0) {
            if (bC == 1) {
                return R0.p.f9325b.a();
            }
            if (bC == 3) {
                return R0.p.f9325b.c();
            }
            if (bC == 2) {
                return R0.p.f9325b.d();
            }
        }
        return R0.p.f9325b.b();
    }

    public final R0.q h() {
        return new R0.q(i());
    }

    public final M0.C k() {
        androidx.compose.ui.platform.N0 n6;
        androidx.compose.ui.platform.N0 n10 = n0;
        androidx.compose.ui.platform.N0 n11 = new androidx.compose.ui.platform.N0(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 16383, null);
        while (this.f20214a.dataAvail() > 1) {
            byte bC = c();
            if (bC != 1) {
                n6 = n10;
                if (bC == 2) {
                    if (a() < 5) {
                        return n6.m();
                    }
                    n6.e(o());
                    n10 = n6;
                } else if (bC == 3) {
                    if (a() < 4) {
                        return n6.m();
                    }
                    n6.h(h());
                    n10 = n6;
                } else if (bC == 4) {
                    if (a() < 1) {
                        return n6.m();
                    }
                    n6.f(R0.o.c(f()));
                    n10 = n6;
                } else if (bC != 5) {
                    if (bC == 6) {
                        n6.d(l());
                    } else if (bC == 7) {
                        if (a() < 5) {
                            return n6.m();
                        }
                        n6.i(o());
                    } else if (bC == 8) {
                        if (a() < 4) {
                            return n6.m();
                        }
                        n6.b(X0.a.b(b()));
                    } else if (bC == 9) {
                        if (a() < 8) {
                            return n6.m();
                        }
                        n6.l(n());
                    } else if (bC == 10) {
                        if (a() < 8) {
                            return n6.m();
                        }
                        n6.a(d());
                    } else if (bC == 11) {
                        if (a() < 4) {
                            return n6.m();
                        }
                        n6.k(m());
                    } else if (bC == 12) {
                        if (a() < 20) {
                            return n6.m();
                        }
                        n6.j(j());
                    }
                    n10 = n6;
                } else {
                    if (a() < 1) {
                        return n6.m();
                    }
                    n6.g(R0.p.e(g()));
                    n10 = n6;
                }
            } else {
                if (a() < 8) {
                    break;
                }
                n10.c(d());
            }
        }
        n6 = n10;
        return n6.m();
    }

    public final long o() {
        long jA;
        byte bC = c();
        if (bC == 1) {
            jA = Y0.z.f16241b.b();
        } else {
            jA = bC == 2 ? Y0.z.f16241b.a() : Y0.z.f16241b.c();
        }
        return Y0.z.g(jA, Y0.z.f16241b.c()) ? Y0.x.f16237b.a() : Y0.y.a(e(), jA);
    }
}
