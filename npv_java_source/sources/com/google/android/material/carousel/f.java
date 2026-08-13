package com.google.android.material.carousel;

/* JADX INFO: loaded from: classes3.dex */
final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f43062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.List f43063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f43064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f43065d;

    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f43066a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float f43067b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private com.google.android.material.carousel.f.c f43069d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private com.google.android.material.carousel.f.c f43070e;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final java.util.List f43068c = new java.util.ArrayList();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f43071f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f43072g = -1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private float f43073h = 0.0f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f43074i = -1;

        b(float f6, float f10) {
            this.f43066a = f6;
            this.f43067b = f10;
        }

        private static float j(float f6, float f10, int i6, int i10) {
            return (f6 - (i6 * f10)) + (i10 * f10);
        }

        com.google.android.material.carousel.f.b a(float f6, float f10, float f11) {
            return d(f6, f10, f11, false, true);
        }

        com.google.android.material.carousel.f.b b(float f6, float f10, float f11) {
            return c(f6, f10, f11, false);
        }

        com.google.android.material.carousel.f.b c(float f6, float f10, float f11, boolean z6) {
            return d(f6, f10, f11, z6, false);
        }

        com.google.android.material.carousel.f.b d(float f6, float f10, float f11, boolean z6, boolean z10) {
            float fAbs;
            float f12 = f11 / 2.0f;
            float f13 = f6 - f12;
            float f14 = f12 + f6;
            float f15 = this.f43067b;
            if (f14 > f15) {
                fAbs = java.lang.Math.abs(f14 - java.lang.Math.max(f14 - f11, f15));
            } else {
                fAbs = 0.0f;
                if (f13 < 0.0f) {
                    fAbs = java.lang.Math.abs(f13 - java.lang.Math.min(f13 + f11, 0.0f));
                }
            }
            return e(f6, f10, f11, z6, z10, fAbs);
        }

        com.google.android.material.carousel.f.b e(float f6, float f10, float f11, boolean z6, boolean z10, float f12) {
            return f(f6, f10, f11, z6, z10, f12, 0.0f, 0.0f);
        }

        com.google.android.material.carousel.f.b f(float f6, float f10, float f11, boolean z6, boolean z10, float f12, float f13, float f14) {
            if (f11 <= 0.0f) {
                return this;
            }
            if (z10) {
                if (z6) {
                    throw new java.lang.IllegalArgumentException("Anchor keylines cannot be focal.");
                }
                int i6 = this.f43074i;
                if (i6 != -1 && i6 != 0) {
                    throw new java.lang.IllegalArgumentException("Anchor keylines must be either the first or last keyline.");
                }
                this.f43074i = this.f43068c.size();
            }
            com.google.android.material.carousel.f.c cVar = new com.google.android.material.carousel.f.c(Float.MIN_VALUE, f6, f10, f11, z10, f12, f13, f14);
            com.google.android.material.carousel.f.c cVar2 = this.f43069d;
            if (z6) {
                if (cVar2 == null) {
                    this.f43069d = cVar;
                    this.f43071f = this.f43068c.size();
                }
                if (this.f43072g != -1 && this.f43068c.size() - this.f43072g > 1) {
                    throw new java.lang.IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                }
                if (f11 != this.f43069d.f43078d) {
                    throw new java.lang.IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
                this.f43070e = cVar;
                this.f43072g = this.f43068c.size();
            } else {
                if (cVar2 == null && cVar.f43078d < this.f43073h) {
                    throw new java.lang.IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
                }
                if (this.f43070e != null && cVar.f43078d > this.f43073h) {
                    throw new java.lang.IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                }
            }
            this.f43073h = cVar.f43078d;
            this.f43068c.add(cVar);
            return this;
        }

        com.google.android.material.carousel.f.b g(float f6, float f10, float f11, int i6) {
            return h(f6, f10, f11, i6, false);
        }

        com.google.android.material.carousel.f.b h(float f6, float f10, float f11, int i6, boolean z6) {
            if (i6 > 0 && f11 > 0.0f) {
                for (int i10 = 0; i10 < i6; i10++) {
                    c((i10 * f11) + f6, f10, f11, z6);
                }
            }
            return this;
        }

        com.google.android.material.carousel.f i() {
            if (this.f43069d == null) {
                throw new java.lang.IllegalStateException("There must be a keyline marked as focal.");
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i6 = 0; i6 < this.f43068c.size(); i6++) {
                com.google.android.material.carousel.f.c cVar = (com.google.android.material.carousel.f.c) this.f43068c.get(i6);
                arrayList.add(new com.google.android.material.carousel.f.c(j(this.f43069d.f43076b, this.f43066a, this.f43071f, i6), cVar.f43076b, cVar.f43077c, cVar.f43078d, cVar.f43079e, cVar.f43080f, cVar.f43081g, cVar.f43082h));
            }
            return new com.google.android.material.carousel.f(this.f43066a, arrayList, this.f43071f, this.f43072g);
        }
    }

    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final float f43075a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final float f43076b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final float f43077c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final float f43078d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final boolean f43079e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final float f43080f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final float f43081g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final float f43082h;

        c(float f6, float f10, float f11, float f12) {
            this(f6, f10, f11, f12, false, 0.0f, 0.0f, 0.0f);
        }

        c(float f6, float f10, float f11, float f12, boolean z6, float f13, float f14, float f15) {
            this.f43075a = f6;
            this.f43076b = f10;
            this.f43077c = f11;
            this.f43078d = f12;
            this.f43079e = z6;
            this.f43080f = f13;
            this.f43081g = f14;
            this.f43082h = f15;
        }

        static com.google.android.material.carousel.f.c a(com.google.android.material.carousel.f.c cVar, com.google.android.material.carousel.f.c cVar2, float f6) {
            return new com.google.android.material.carousel.f.c(p135n4.a.a(cVar.f43075a, cVar2.f43075a, f6), p135n4.a.a(cVar.f43076b, cVar2.f43076b, f6), p135n4.a.a(cVar.f43077c, cVar2.f43077c, f6), p135n4.a.a(cVar.f43078d, cVar2.f43078d, f6));
        }
    }

    private f(float f6, java.util.List list, int i6, int i10) {
        this.f43062a = f6;
        this.f43063b = j$.util.DesugarCollections.unmodifiableList(list);
        this.f43064c = i6;
        this.f43065d = i10;
    }

    static com.google.android.material.carousel.f m(com.google.android.material.carousel.f fVar, com.google.android.material.carousel.f fVar2, float f6) {
        if (fVar.f() != fVar2.f()) {
            throw new java.lang.IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
        }
        java.util.List listG = fVar.g();
        java.util.List listG2 = fVar2.g();
        if (listG.size() != listG2.size()) {
            throw new java.lang.IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i6 = 0; i6 < fVar.g().size(); i6++) {
            arrayList.add(com.google.android.material.carousel.f.c.a((com.google.android.material.carousel.f.c) listG.get(i6), (com.google.android.material.carousel.f.c) listG2.get(i6), f6));
        }
        return new com.google.android.material.carousel.f(fVar.f(), arrayList, p135n4.a.c(fVar.b(), fVar2.b(), f6), p135n4.a.c(fVar.i(), fVar2.i(), f6));
    }

    static com.google.android.material.carousel.f n(com.google.android.material.carousel.f fVar, float f6) {
        com.google.android.material.carousel.f.b bVar = new com.google.android.material.carousel.f.b(fVar.f(), f6);
        float f10 = (f6 - fVar.j().f43076b) - (fVar.j().f43078d / 2.0f);
        int size = fVar.g().size() - 1;
        while (size >= 0) {
            com.google.android.material.carousel.f.c cVar = (com.google.android.material.carousel.f.c) fVar.g().get(size);
            bVar.d(f10 + (cVar.f43078d / 2.0f), cVar.f43077c, cVar.f43078d, size >= fVar.b() && size <= fVar.i(), cVar.f43079e);
            f10 += cVar.f43078d;
            size--;
        }
        return bVar.i();
    }

    com.google.android.material.carousel.f.c a() {
        return (com.google.android.material.carousel.f.c) this.f43063b.get(this.f43064c);
    }

    int b() {
        return this.f43064c;
    }

    com.google.android.material.carousel.f.c c() {
        return (com.google.android.material.carousel.f.c) this.f43063b.get(0);
    }

    com.google.android.material.carousel.f.c d() {
        for (int i6 = 0; i6 < this.f43063b.size(); i6++) {
            com.google.android.material.carousel.f.c cVar = (com.google.android.material.carousel.f.c) this.f43063b.get(i6);
            if (!cVar.f43079e) {
                return cVar;
            }
        }
        return null;
    }

    java.util.List e() {
        return this.f43063b.subList(this.f43064c, this.f43065d + 1);
    }

    float f() {
        return this.f43062a;
    }

    java.util.List g() {
        return this.f43063b;
    }

    com.google.android.material.carousel.f.c h() {
        return (com.google.android.material.carousel.f.c) this.f43063b.get(this.f43065d);
    }

    int i() {
        return this.f43065d;
    }

    com.google.android.material.carousel.f.c j() {
        java.util.List list = this.f43063b;
        return (com.google.android.material.carousel.f.c) list.get(list.size() - 1);
    }

    com.google.android.material.carousel.f.c k() {
        for (int size = this.f43063b.size() - 1; size >= 0; size--) {
            com.google.android.material.carousel.f.c cVar = (com.google.android.material.carousel.f.c) this.f43063b.get(size);
            if (!cVar.f43079e) {
                return cVar;
            }
        }
        return null;
    }

    int l() {
        java.util.Iterator it = this.f43063b.iterator();
        int i6 = 0;
        while (it.hasNext()) {
            if (((com.google.android.material.carousel.f.c) it.next()).f43079e) {
                i6++;
            }
        }
        return this.f43063b.size() - i6;
    }
}
