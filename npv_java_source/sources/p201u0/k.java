package p201u0;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float[] f55310a = new float[0];

    private static final void a(p141o0.Q1 q6, double d6, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        double d18 = d11;
        double d19 = 4;
        int iCeil = (int) java.lang.Math.ceil(java.lang.Math.abs((d17 * d19) / 3.141592653589793d));
        double dCos = java.lang.Math.cos(d15);
        double dSin = java.lang.Math.sin(d15);
        double dCos2 = java.lang.Math.cos(d16);
        double dSin2 = java.lang.Math.sin(d16);
        double d20 = -d18;
        double d21 = d20 * dCos;
        double d22 = d12 * dSin;
        double d23 = (d21 * dSin2) - (d22 * dCos2);
        double d24 = d20 * dSin;
        double d25 = d12 * dCos;
        double d26 = (dSin2 * d24) + (dCos2 * d25);
        double d27 = d17 / ((double) iCeil);
        double d28 = d13;
        double d29 = d26;
        double d30 = d23;
        int i6 = 0;
        double d31 = d14;
        double d32 = d16;
        while (i6 < iCeil) {
            double d33 = d32 + d27;
            double dSin3 = java.lang.Math.sin(d33);
            double dCos3 = java.lang.Math.cos(d33);
            int i10 = iCeil;
            double d34 = (d6 + ((d18 * dCos) * dCos3)) - (d22 * dSin3);
            double d35 = d10 + (d18 * dSin * dCos3) + (d25 * dSin3);
            double d36 = (d21 * dSin3) - (d22 * dCos3);
            double d37 = (dSin3 * d24) + (dCos3 * d25);
            double d38 = d33 - d32;
            double dTan = java.lang.Math.tan(d38 / ((double) 2));
            double dSin4 = (java.lang.Math.sin(d38) * (java.lang.Math.sqrt(d19 + ((3.0d * dTan) * dTan)) - ((double) 1))) / ((double) 3);
            q6.m((float) (d28 + (d30 * dSin4)), (float) (d31 + (d29 * dSin4)), (float) (d34 - (dSin4 * d36)), (float) (d35 - (dSin4 * d37)), (float) d34, (float) d35);
            i6++;
            d27 = d27;
            dSin = dSin;
            d28 = d34;
            d24 = d24;
            d32 = d33;
            d29 = d37;
            d19 = d19;
            d30 = d36;
            dCos = dCos;
            iCeil = i10;
            d31 = d35;
            d18 = d11;
        }
    }

    private static final void b(p141o0.Q1 q6, double d6, double d10, double d11, double d12, double d13, double d14, double d15, boolean z6, boolean z10) {
        double d16;
        double d17;
        double d18 = (d15 / ((double) 180)) * 3.141592653589793d;
        double dCos = java.lang.Math.cos(d18);
        double dSin = java.lang.Math.sin(d18);
        double d19 = ((d6 * dCos) + (d10 * dSin)) / d13;
        double d20 = (((-d6) * dSin) + (d10 * dCos)) / d14;
        double d21 = ((d11 * dCos) + (d12 * dSin)) / d13;
        double d22 = (((-d11) * dSin) + (d12 * dCos)) / d14;
        double d23 = d19 - d21;
        double d24 = d20 - d22;
        double d25 = 2;
        double d26 = (d19 + d21) / d25;
        double d27 = (d20 + d22) / d25;
        double d28 = (d23 * d23) + (d24 * d24);
        if (d28 == 0.0d) {
            return;
        }
        double d29 = (1.0d / d28) - 0.25d;
        if (d29 < 0.0d) {
            double dSqrt = (float) (java.lang.Math.sqrt(d28) / 1.99999d);
            b(q6, d6, d10, d11, d12, d13 * dSqrt, d14 * dSqrt, d15, z6, z10);
            return;
        }
        double dSqrt2 = java.lang.Math.sqrt(d29);
        double d30 = d23 * dSqrt2;
        double d31 = dSqrt2 * d24;
        if (z6 == z10) {
            d16 = d26 - d31;
            d17 = d27 + d30;
        } else {
            d16 = d26 + d31;
            d17 = d27 - d30;
        }
        double dAtan2 = java.lang.Math.atan2(d20 - d17, d19 - d16);
        double dAtan3 = java.lang.Math.atan2(d22 - d17, d21 - d16) - dAtan2;
        if (z10 != (dAtan3 >= 0.0d)) {
            dAtan3 = dAtan3 > 0.0d ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
        }
        double d32 = d16 * d13;
        double d33 = d17 * d14;
        a(q6, (d32 * dCos) - (d33 * dSin), (d32 * dSin) + (d33 * dCos), d13, d14, d6, d10, d18, dAtan2, dAtan3);
    }

    public static final p141o0.Q1 c(java.util.List list, p141o0.Q1 q6) {
        float f6;
        float f10;
        float fC;
        float fE;
        float fD;
        float fD2;
        float f11;
        float f12;
        float f13;
        float f14;
        float fE2;
        float fD3;
        float f15;
        float f16;
        float f17;
        java.util.List list2 = list;
        p141o0.Q1 q10 = q6;
        int i6 = q6.i();
        q6.n();
        q10.g(i6);
        p201u0.h hVar = list.isEmpty() ? u0.h.b.f55256c : (p201u0.h) list2.get(0);
        int size = list.size();
        float f18 = 0.0f;
        int i10 = 0;
        float fC2 = 0.0f;
        float fD4 = 0.0f;
        float fC3 = 0.0f;
        float fD5 = 0.0f;
        float f19 = 0.0f;
        float f20 = 0.0f;
        while (i10 < size) {
            p201u0.h hVar2 = (p201u0.h) list2.get(i10);
            if (hVar2 instanceof u0.h.b) {
                q6.close();
                hVar2 = hVar2;
                f18 = f18;
                i10 = i10;
                size = size;
                fC2 = f19;
                fC3 = fC2;
                fD4 = f20;
                fD5 = fD4;
            } else {
                if (hVar2 instanceof u0.h.n) {
                    u0.h.n nVar = (u0.h.n) hVar2;
                    fC3 += nVar.c();
                    fD5 += nVar.d();
                    q10.e(nVar.c(), nVar.d());
                    f19 = fC3;
                } else if (hVar2 instanceof u0.h.f) {
                    u0.h.f fVar = (u0.h.f) hVar2;
                    float fC4 = fVar.c();
                    float fD6 = fVar.d();
                    q10.l(fVar.c(), fVar.d());
                    fC3 = fC4;
                    f19 = fC3;
                    fD5 = fD6;
                } else {
                    if (hVar2 instanceof u0.h.m) {
                        u0.h.m mVar = (u0.h.m) hVar2;
                        q10.q(mVar.c(), mVar.d());
                        fC3 += mVar.c();
                        f12 = mVar.d();
                    } else {
                        if (hVar2 instanceof u0.h.e) {
                            u0.h.e eVar = (u0.h.e) hVar2;
                            q10.r(eVar.c(), eVar.d());
                            fD2 = eVar.c();
                            f11 = eVar.d();
                        } else {
                            if (hVar2 instanceof u0.h.l) {
                                u0.h.l lVar = (u0.h.l) hVar2;
                                q10.q(lVar.c(), f18);
                                fC3 += lVar.c();
                            } else if (hVar2 instanceof u0.h.d) {
                                u0.h.d dVar = (u0.h.d) hVar2;
                                q10.r(dVar.c(), fD5);
                                fC3 = dVar.c();
                            } else if (hVar2 instanceof u0.h.r) {
                                u0.h.r rVar = (u0.h.r) hVar2;
                                q10.q(f18, rVar.c());
                                f12 = rVar.c();
                            } else if (hVar2 instanceof u0.h.s) {
                                u0.h.s sVar = (u0.h.s) hVar2;
                                q10.r(fC3, sVar.c());
                                fD5 = sVar.c();
                            } else {
                                if (hVar2 instanceof u0.h.k) {
                                    u0.h.k kVar = (u0.h.k) hVar2;
                                    q6.f(kVar.c(), kVar.f(), kVar.d(), kVar.g(), kVar.e(), kVar.h());
                                    fC = kVar.d() + fC3;
                                    fE = kVar.g() + fD5;
                                    fC3 += kVar.e();
                                    fD = kVar.h();
                                } else {
                                    if (hVar2 instanceof u0.h.c) {
                                        u0.h.c cVar = (u0.h.c) hVar2;
                                        q6.m(cVar.c(), cVar.f(), cVar.d(), cVar.g(), cVar.e(), cVar.h());
                                        fC = cVar.d();
                                        fE2 = cVar.g();
                                        fD3 = cVar.e();
                                        f15 = cVar.h();
                                    } else if (hVar2 instanceof u0.h.p) {
                                        if (hVar.a()) {
                                            f17 = fD5 - fD4;
                                            f16 = fC3 - fC2;
                                        } else {
                                            f16 = f18;
                                            f17 = f16;
                                        }
                                        u0.h.p pVar = (u0.h.p) hVar2;
                                        q6.f(f16, f17, pVar.c(), pVar.e(), pVar.d(), pVar.f());
                                        fC = pVar.c() + fC3;
                                        fE = pVar.e() + fD5;
                                        fC3 += pVar.d();
                                        fD = pVar.f();
                                    } else if (hVar2 instanceof p201u0.h.C0724h) {
                                        if (hVar.a()) {
                                            float f21 = 2;
                                            f14 = (f21 * fD5) - fD4;
                                            f13 = (fC3 * f21) - fC2;
                                        } else {
                                            f13 = fC3;
                                            f14 = fD5;
                                        }
                                        p201u0.h.C0724h c0724h = (p201u0.h.C0724h) hVar2;
                                        q6.m(f13, f14, c0724h.c(), c0724h.e(), c0724h.d(), c0724h.f());
                                        fC = c0724h.c();
                                        fE2 = c0724h.e();
                                        fD3 = c0724h.d();
                                        f15 = c0724h.f();
                                    } else if (hVar2 instanceof u0.h.o) {
                                        u0.h.o oVar = (u0.h.o) hVar2;
                                        q10.b(oVar.c(), oVar.e(), oVar.d(), oVar.f());
                                        fC2 = oVar.c() + fC3;
                                        fD4 = oVar.e() + fD5;
                                        fC3 += oVar.d();
                                        f12 = oVar.f();
                                    } else if (hVar2 instanceof u0.h.g) {
                                        u0.h.g gVar = (u0.h.g) hVar2;
                                        q10.h(gVar.c(), gVar.e(), gVar.d(), gVar.f());
                                        fC2 = gVar.c();
                                        fD4 = gVar.e();
                                        fD2 = gVar.d();
                                        f11 = gVar.f();
                                    } else if (hVar2 instanceof u0.h.q) {
                                        if (hVar.b()) {
                                            f6 = fC3 - fC2;
                                            f10 = fD5 - fD4;
                                        } else {
                                            f6 = f18;
                                            f10 = f6;
                                        }
                                        u0.h.q qVar = (u0.h.q) hVar2;
                                        q10.b(f6, f10, qVar.c(), qVar.d());
                                        fC = f6 + fC3;
                                        fE = f10 + fD5;
                                        fC3 += qVar.c();
                                        fD = qVar.d();
                                    } else if (hVar2 instanceof u0.h.i) {
                                        if (hVar.b()) {
                                            float f22 = 2;
                                            fC3 = (fC3 * f22) - fC2;
                                            fD5 = (f22 * fD5) - fD4;
                                        }
                                        u0.h.i iVar = (u0.h.i) hVar2;
                                        q10.h(fC3, fD5, iVar.c(), iVar.d());
                                        float fC5 = iVar.c();
                                        fD4 = fD5;
                                        hVar2 = hVar2;
                                        f18 = f18;
                                        i10 = i10;
                                        size = size;
                                        fD5 = iVar.d();
                                        float f23 = fC3;
                                        fC3 = fC5;
                                        fC2 = f23;
                                    } else if (hVar2 instanceof u0.h.j) {
                                        u0.h.j jVar = (u0.h.j) hVar2;
                                        float fC6 = jVar.c() + fC3;
                                        float fD7 = jVar.d() + fD5;
                                        hVar2 = hVar2;
                                        i10 = i10;
                                        f18 = 0.0f;
                                        size = size;
                                        b(q6, fC3, fD5, fC6, fD7, jVar.e(), jVar.g(), jVar.f(), jVar.h(), jVar.i());
                                        fD4 = fD7;
                                        fD5 = fD4;
                                        fC2 = fC6;
                                        fC3 = fC2;
                                    } else {
                                        hVar2 = hVar2;
                                        f18 = f18;
                                        i10 = i10;
                                        size = size;
                                        if (hVar2 instanceof u0.h.a) {
                                            u0.h.a aVar = (u0.h.a) hVar2;
                                            b(q6, fC3, fD5, aVar.c(), aVar.d(), aVar.e(), aVar.g(), aVar.f(), aVar.h(), aVar.i());
                                            fC3 = aVar.c();
                                            fD4 = aVar.d();
                                            fD5 = fD4;
                                            fC2 = fC3;
                                        }
                                    }
                                    fC3 = fD3;
                                    fD5 = f15;
                                    fD4 = fE2;
                                    fC2 = fC;
                                }
                                fD5 += fD;
                                fD4 = fE;
                                fC2 = fC;
                            }
                            hVar2 = hVar2;
                            f18 = f18;
                            i10 = i10;
                            size = size;
                        }
                        fD5 = f11;
                        fC3 = fD2;
                        hVar2 = hVar2;
                        f18 = f18;
                        i10 = i10;
                        size = size;
                    }
                    fD5 += f12;
                    hVar2 = hVar2;
                    f18 = f18;
                    i10 = i10;
                    size = size;
                }
                f20 = fD5;
                hVar2 = hVar2;
                f18 = f18;
                i10 = i10;
                size = size;
            }
            i10++;
            q10 = q6;
            hVar = hVar2;
            f18 = f18;
            size = size;
            list2 = list;
        }
        return q6;
    }
}
