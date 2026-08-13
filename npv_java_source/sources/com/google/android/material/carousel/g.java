package com.google.android.material.carousel;

/* JADX INFO: loaded from: classes3.dex */
class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.material.carousel.f f43083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.List f43084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.List f43085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float[] f43086d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float[] f43087e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f43088f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f43089g;

    private g(com.google.android.material.carousel.f fVar, java.util.List list, java.util.List list2) {
        this.f43083a = fVar;
        this.f43084b = j$.util.DesugarCollections.unmodifiableList(list);
        this.f43085c = j$.util.DesugarCollections.unmodifiableList(list2);
        float f6 = ((com.google.android.material.carousel.f) list.get(list.size() - 1)).c().f43075a - fVar.c().f43075a;
        this.f43088f = f6;
        float f10 = fVar.j().f43075a - ((com.google.android.material.carousel.f) list2.get(list2.size() - 1)).j().f43075a;
        this.f43089g = f10;
        this.f43086d = m(f6, list, true);
        this.f43087e = m(f10, list2, false);
    }

    private com.google.android.material.carousel.f a(java.util.List list, float f6, float[] fArr) {
        float[] fArrO = o(list, f6, fArr);
        return (com.google.android.material.carousel.f) list.get((int) (fArrO[0] >= 0.5f ? fArrO[2] : fArrO[1]));
    }

    private static int b(com.google.android.material.carousel.f fVar, float f6) {
        for (int i6 = fVar.i(); i6 < fVar.g().size(); i6++) {
            if (f6 == ((com.google.android.material.carousel.f.c) fVar.g().get(i6)).f43077c) {
                return i6;
            }
        }
        return fVar.g().size() - 1;
    }

    private static int c(com.google.android.material.carousel.f fVar) {
        for (int i6 = 0; i6 < fVar.g().size(); i6++) {
            if (!((com.google.android.material.carousel.f.c) fVar.g().get(i6)).f43079e) {
                return i6;
            }
        }
        return -1;
    }

    private static int d(com.google.android.material.carousel.f fVar, float f6) {
        for (int iB = fVar.b() - 1; iB >= 0; iB--) {
            if (f6 == ((com.google.android.material.carousel.f.c) fVar.g().get(iB)).f43077c) {
                return iB;
            }
        }
        return 0;
    }

    private static int e(com.google.android.material.carousel.f fVar) {
        for (int size = fVar.g().size() - 1; size >= 0; size--) {
            if (!((com.google.android.material.carousel.f.c) fVar.g().get(size)).f43079e) {
                return size;
            }
        }
        return -1;
    }

    static com.google.android.material.carousel.g f(com.google.android.material.carousel.b bVar, com.google.android.material.carousel.f fVar, float f6, float f10, float f11) {
        return new com.google.android.material.carousel.g(fVar, p(bVar, fVar, f6, f10), n(bVar, fVar, f6, f11));
    }

    private static float[] m(float f6, java.util.List list, boolean z6) {
        int size = list.size();
        float[] fArr = new float[size];
        int i6 = 1;
        while (i6 < size) {
            int i10 = i6 - 1;
            com.google.android.material.carousel.f fVar = (com.google.android.material.carousel.f) list.get(i10);
            com.google.android.material.carousel.f fVar2 = (com.google.android.material.carousel.f) list.get(i6);
            fArr[i6] = i6 == size + (-1) ? 1.0f : fArr[i10] + ((z6 ? fVar2.c().f43075a - fVar.c().f43075a : fVar.j().f43075a - fVar2.j().f43075a) / f6);
            i6++;
        }
        return fArr;
    }

    private static java.util.List n(com.google.android.material.carousel.b bVar, com.google.android.material.carousel.f fVar, float f6, float f10) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(fVar);
        int iE = e(fVar);
        float fB = bVar.f() ? bVar.b() : bVar.c();
        if (r(bVar, fVar) || iE == -1) {
            if (f10 > 0.0f) {
                arrayList.add(u(fVar, f10, fB, false, f6));
            }
            return arrayList;
        }
        int i6 = iE - fVar.i();
        float f11 = fVar.c().f43076b - (fVar.c().f43078d / 2.0f);
        if (i6 <= 0 && fVar.h().f43080f > 0.0f) {
            arrayList.add(v(fVar, f11 - fVar.h().f43080f, fB));
            return arrayList;
        }
        float f12 = 0.0f;
        int i10 = 0;
        while (i10 < i6) {
            com.google.android.material.carousel.f fVar2 = (com.google.android.material.carousel.f) arrayList.get(arrayList.size() - 1);
            int i11 = iE - i10;
            float f13 = f12 + ((com.google.android.material.carousel.f.c) fVar.g().get(i11)).f43080f;
            int i12 = i11 + 1;
            int i13 = i10;
            com.google.android.material.carousel.f fVarT = t(fVar2, iE, i12 < fVar.g().size() ? d(fVar2, ((com.google.android.material.carousel.f.c) fVar.g().get(i12)).f43077c) + 1 : 0, f11 - f13, fVar.b() + i10 + 1, fVar.i() + i10 + 1, fB);
            if (i13 == i6 - 1 && f10 > 0.0f) {
                fVarT = u(fVarT, f10, fB, false, f6);
            }
            arrayList.add(fVarT);
            i10 = i13 + 1;
            f12 = f13;
        }
        return arrayList;
    }

    private static float[] o(java.util.List list, float f6, float[] fArr) {
        int size = list.size();
        float f10 = fArr[0];
        int i6 = 1;
        while (i6 < size) {
            float f11 = fArr[i6];
            if (f6 <= f11) {
                return new float[]{p135n4.a.b(0.0f, 1.0f, f10, f11, f6), i6 - 1, i6};
            }
            i6++;
            f10 = f11;
        }
        return new float[]{0.0f, 0.0f, 0.0f};
    }

    private static java.util.List p(com.google.android.material.carousel.b bVar, com.google.android.material.carousel.f fVar, float f6, float f10) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(fVar);
        int iC = c(fVar);
        float fB = bVar.f() ? bVar.b() : bVar.c();
        int i6 = 1;
        if (q(fVar) || iC == -1) {
            if (f10 > 0.0f) {
                arrayList.add(u(fVar, f10, fB, true, f6));
            }
            return arrayList;
        }
        int iB = fVar.b() - iC;
        float f11 = fVar.c().f43076b - (fVar.c().f43078d / 2.0f);
        if (iB <= 0 && fVar.a().f43080f > 0.0f) {
            arrayList.add(v(fVar, f11 + fVar.a().f43080f, fB));
            return arrayList;
        }
        int i10 = 0;
        float f12 = 0.0f;
        while (i10 < iB) {
            com.google.android.material.carousel.f fVar2 = (com.google.android.material.carousel.f) arrayList.get(arrayList.size() - i6);
            int i11 = iC + i10;
            int size = fVar.g().size() - i6;
            float f13 = f12 + ((com.google.android.material.carousel.f.c) fVar.g().get(i11)).f43080f;
            int i12 = i11 - i6;
            int iB2 = i12 >= 0 ? b(fVar2, ((com.google.android.material.carousel.f.c) fVar.g().get(i12)).f43077c) - i6 : size;
            int i13 = i10;
            com.google.android.material.carousel.f fVarT = t(fVar2, iC, iB2, f11 + f13, (fVar.b() - i10) - 1, (fVar.i() - i10) - 1, fB);
            if (i13 == iB - 1 && f10 > 0.0f) {
                fVarT = u(fVarT, f10, fB, true, f6);
            }
            arrayList.add(fVarT);
            i10 = i13 + 1;
            f12 = f13;
            i6 = 1;
        }
        return arrayList;
    }

    private static boolean q(com.google.android.material.carousel.f fVar) {
        return fVar.a().f43076b - (fVar.a().f43078d / 2.0f) >= 0.0f && fVar.a() == fVar.d();
    }

    private static boolean r(com.google.android.material.carousel.b bVar, com.google.android.material.carousel.f fVar) {
        int iC = bVar.c();
        if (bVar.f()) {
            iC = bVar.b();
        }
        return fVar.h().f43076b + (fVar.h().f43078d / 2.0f) <= ((float) iC) && fVar.h() == fVar.k();
    }

    private static com.google.android.material.carousel.f s(java.util.List list, float f6, float[] fArr) {
        float[] fArrO = o(list, f6, fArr);
        return com.google.android.material.carousel.f.m((com.google.android.material.carousel.f) list.get((int) fArrO[1]), (com.google.android.material.carousel.f) list.get((int) fArrO[2]), fArrO[0]);
    }

    private static com.google.android.material.carousel.f t(com.google.android.material.carousel.f fVar, int i6, int i10, float f6, int i11, int i12, float f10) {
        java.util.ArrayList arrayList = new java.util.ArrayList(fVar.g());
        arrayList.add(i10, (com.google.android.material.carousel.f.c) arrayList.remove(i6));
        com.google.android.material.carousel.f.b bVar = new com.google.android.material.carousel.f.b(fVar.f(), f10);
        int i13 = 0;
        while (i13 < arrayList.size()) {
            com.google.android.material.carousel.f.c cVar = (com.google.android.material.carousel.f.c) arrayList.get(i13);
            float f11 = cVar.f43078d;
            bVar.e(f6 + (f11 / 2.0f), cVar.f43077c, f11, i13 >= i11 && i13 <= i12, cVar.f43079e, cVar.f43080f);
            f6 += cVar.f43078d;
            i13++;
        }
        return bVar.i();
    }

    private static com.google.android.material.carousel.f u(com.google.android.material.carousel.f fVar, float f6, float f10, boolean z6, float f11) {
        java.util.ArrayList arrayList = new java.util.ArrayList(fVar.g());
        com.google.android.material.carousel.f.b bVar = new com.google.android.material.carousel.f.b(fVar.f(), f10);
        float fL = f6 / fVar.l();
        float f12 = z6 ? f6 : 0.0f;
        int i6 = 0;
        while (i6 < arrayList.size()) {
            com.google.android.material.carousel.f.c cVar = (com.google.android.material.carousel.f.c) arrayList.get(i6);
            if (cVar.f43079e) {
                bVar.e(cVar.f43076b, cVar.f43077c, cVar.f43078d, false, true, cVar.f43080f);
            } else {
                boolean z10 = i6 >= fVar.b() && i6 <= fVar.i();
                float f13 = cVar.f43078d - fL;
                float fB = com.google.android.material.carousel.d.b(f13, fVar.f(), f11);
                float f14 = (f13 / 2.0f) + f12;
                float f15 = f14 - cVar.f43076b;
                bVar.f(f14, fB, f13, z10, false, cVar.f43080f, z6 ? f15 : 0.0f, z6 ? 0.0f : f15);
                f12 += f13;
            }
            i6++;
        }
        return bVar.i();
    }

    private static com.google.android.material.carousel.f v(com.google.android.material.carousel.f fVar, float f6, float f10) {
        return t(fVar, 0, 0, f6, fVar.b(), fVar.i(), f10);
    }

    com.google.android.material.carousel.f g() {
        return this.f43083a;
    }

    com.google.android.material.carousel.f h() {
        java.util.List list = this.f43085c;
        return (com.google.android.material.carousel.f) list.get(list.size() - 1);
    }

    java.util.Map i(int i6, int i10, int i11, boolean z6) {
        float f6 = this.f43083a.f();
        java.util.HashMap map = new java.util.HashMap();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (i12 >= i6) {
                break;
            }
            int i14 = z6 ? (i6 - i12) - 1 : i12;
            if (i14 * f6 * (z6 ? -1 : 1) > i11 - this.f43089g || i12 >= i6 - this.f43085c.size()) {
                java.lang.Integer numValueOf = java.lang.Integer.valueOf(i14);
                java.util.List list = this.f43085c;
                map.put(numValueOf, (com.google.android.material.carousel.f) list.get(p222w1.a.b(i13, 0, list.size() - 1)));
                i13++;
            }
            i12++;
        }
        int i15 = 0;
        for (int i16 = i6 - 1; i16 >= 0; i16--) {
            int i17 = z6 ? (i6 - i16) - 1 : i16;
            if (i17 * f6 * (z6 ? -1 : 1) < i10 + this.f43088f || i16 < this.f43084b.size()) {
                java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(i17);
                java.util.List list2 = this.f43084b;
                map.put(numValueOf2, (com.google.android.material.carousel.f) list2.get(p222w1.a.b(i15, 0, list2.size() - 1)));
                i15++;
            }
        }
        return map;
    }

    public com.google.android.material.carousel.f j(float f6, float f10, float f11) {
        return k(f6, f10, f11, false);
    }

    com.google.android.material.carousel.f k(float f6, float f10, float f11, boolean z6) {
        float fB;
        java.util.List list;
        float[] fArr;
        float f12 = this.f43088f + f10;
        float f13 = f11 - this.f43089g;
        float f14 = l().a().f43081g;
        float f15 = h().h().f43082h;
        if (this.f43088f == f14) {
            f12 += f14;
        }
        if (this.f43089g == f15) {
            f13 -= f15;
        }
        if (f6 < f12) {
            fB = p135n4.a.b(1.0f, 0.0f, f10, f12, f6);
            list = this.f43084b;
            fArr = this.f43086d;
        } else {
            if (f6 <= f13) {
                return this.f43083a;
            }
            fB = p135n4.a.b(0.0f, 1.0f, f13, f11, f6);
            list = this.f43085c;
            fArr = this.f43087e;
        }
        return z6 ? a(list, fB, fArr) : s(list, fB, fArr);
    }

    com.google.android.material.carousel.f l() {
        java.util.List list = this.f43084b;
        return (com.google.android.material.carousel.f) list.get(list.size() - 1);
    }
}
