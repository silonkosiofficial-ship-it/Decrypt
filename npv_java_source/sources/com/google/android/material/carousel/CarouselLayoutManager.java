package com.google.android.material.carousel;

/* JADX INFO: loaded from: classes3.dex */
public class CarouselLayoutManager extends androidx.recyclerview.widget.RecyclerView.p implements com.google.android.material.carousel.b, androidx.recyclerview.widget.RecyclerView.z.b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f43025A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private java.util.Map f43026B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private com.google.android.material.carousel.c f43027C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final android.view.View.OnLayoutChangeListener f43028D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f43029E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f43030F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f43031G;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    int f43032s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f43033t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    int f43034u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f43035v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final com.google.android.material.carousel.CarouselLayoutManager.c f43036w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private com.google.android.material.carousel.d f43037x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private com.google.android.material.carousel.g f43038y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private com.google.android.material.carousel.f f43039z;

    class a extends androidx.recyclerview.widget.g {
        a(android.content.Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.z
        public android.graphics.PointF a(int i6) {
            return com.google.android.material.carousel.CarouselLayoutManager.this.d(i6);
        }

        @Override // androidx.recyclerview.widget.g
        public int t(android.view.View view, int i6) {
            if (com.google.android.material.carousel.CarouselLayoutManager.this.f43038y == null || !com.google.android.material.carousel.CarouselLayoutManager.this.f()) {
                return 0;
            }
            com.google.android.material.carousel.CarouselLayoutManager carouselLayoutManager = com.google.android.material.carousel.CarouselLayoutManager.this;
            return carouselLayoutManager.g2(carouselLayoutManager.l0(view));
        }

        @Override // androidx.recyclerview.widget.g
        public int u(android.view.View view, int i6) {
            if (com.google.android.material.carousel.CarouselLayoutManager.this.f43038y == null || com.google.android.material.carousel.CarouselLayoutManager.this.f()) {
                return 0;
            }
            com.google.android.material.carousel.CarouselLayoutManager carouselLayoutManager = com.google.android.material.carousel.CarouselLayoutManager.this;
            return carouselLayoutManager.g2(carouselLayoutManager.l0(view));
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final android.view.View f43041a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final float f43042b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final float f43043c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final com.google.android.material.carousel.CarouselLayoutManager.d f43044d;

        b(android.view.View view, float f6, float f10, com.google.android.material.carousel.CarouselLayoutManager.d dVar) {
            this.f43041a = view;
            this.f43042b = f6;
            this.f43043c = f10;
            this.f43044d = dVar;
        }
    }

    private static class c extends androidx.recyclerview.widget.RecyclerView.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final android.graphics.Paint f43045a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private java.util.List f43046b;

        c() {
            android.graphics.Paint paint = new android.graphics.Paint();
            this.f43045a = paint;
            this.f43046b = j$.util.DesugarCollections.unmodifiableList(new java.util.ArrayList());
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void i(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.A a6) {
            float fX2;
            float fA2;
            float fY2;
            float fV2;
            super.i(canvas, recyclerView, a6);
            this.f43045a.setStrokeWidth(recyclerView.getResources().getDimension(p125m4.c.f50583l));
            for (com.google.android.material.carousel.f.c cVar : this.f43046b) {
                this.f43045a.setColor(androidx.core.graphics.a.c(-65281, -16776961, cVar.f43077c));
                if (((com.google.android.material.carousel.CarouselLayoutManager) recyclerView.getLayoutManager()).f()) {
                    fX2 = cVar.f43076b;
                    fA2 = ((com.google.android.material.carousel.CarouselLayoutManager) recyclerView.getLayoutManager()).A2();
                    fY2 = cVar.f43076b;
                    fV2 = ((com.google.android.material.carousel.CarouselLayoutManager) recyclerView.getLayoutManager()).v2();
                } else {
                    fX2 = ((com.google.android.material.carousel.CarouselLayoutManager) recyclerView.getLayoutManager()).x2();
                    fA2 = cVar.f43076b;
                    fY2 = ((com.google.android.material.carousel.CarouselLayoutManager) recyclerView.getLayoutManager()).y2();
                    fV2 = cVar.f43076b;
                }
                canvas.drawLine(fX2, fA2, fY2, fV2, this.f43045a);
            }
        }

        void j(java.util.List list) {
            this.f43046b = j$.util.DesugarCollections.unmodifiableList(list);
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final com.google.android.material.carousel.f.c f43047a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final com.google.android.material.carousel.f.c f43048b;

        d(com.google.android.material.carousel.f.c cVar, com.google.android.material.carousel.f.c cVar2) {
            B1.i.a(cVar.f43075a <= cVar2.f43075a);
            this.f43047a = cVar;
            this.f43048b = cVar2;
        }
    }

    public CarouselLayoutManager() {
        this(new com.google.android.material.carousel.h());
    }

    @android.annotation.SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(android.content.Context context, android.util.AttributeSet attributeSet, int i6, int i10) {
        this.f43035v = false;
        this.f43036w = new com.google.android.material.carousel.CarouselLayoutManager.c();
        this.f43025A = 0;
        this.f43028D = new android.view.View.OnLayoutChangeListener() { // from class: q4.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(android.view.View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                this.f53120a.I2(view, i11, i12, i13, i14, i15, i16, i17, i18);
            }
        };
        this.f43030F = -1;
        this.f43031G = 0;
        T2(new com.google.android.material.carousel.h());
        S2(context, attributeSet);
    }

    public CarouselLayoutManager(com.google.android.material.carousel.d dVar) {
        this(dVar, 0);
    }

    public CarouselLayoutManager(com.google.android.material.carousel.d dVar, int i6) {
        this.f43035v = false;
        this.f43036w = new com.google.android.material.carousel.CarouselLayoutManager.c();
        this.f43025A = 0;
        this.f43028D = new android.view.View.OnLayoutChangeListener() { // from class: q4.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(android.view.View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                this.f53120a.I2(view, i11, i12, i13, i14, i15, i16, i17, i18);
            }
        };
        this.f43030F = -1;
        this.f43031G = 0;
        T2(dVar);
        U2(i6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int A2() {
        return this.f43027C.j();
    }

    private int B2() {
        if (R() || !this.f43037x.f()) {
            return 0;
        }
        return u2() == 1 ? h0() : j0();
    }

    private int C2(int i6, com.google.android.material.carousel.f fVar) {
        return F2() ? (int) (((n2() - fVar.h().f43075a) - (i6 * fVar.f())) - (fVar.f() / 2.0f)) : (int) (((i6 * fVar.f()) - fVar.a().f43075a) + (fVar.f() / 2.0f));
    }

    private int D2(int i6, com.google.android.material.carousel.f fVar) {
        int i10 = Integer.MAX_VALUE;
        for (com.google.android.material.carousel.f.c cVar : fVar.e()) {
            float f6 = (i6 * fVar.f()) + (fVar.f() / 2.0f);
            int iN2 = (F2() ? (int) ((n2() - cVar.f43075a) - f6) : (int) (f6 - cVar.f43075a)) - this.f43032s;
            if (java.lang.Math.abs(i10) > java.lang.Math.abs(iN2)) {
                i10 = iN2;
            }
        }
        return i10;
    }

    private static com.google.android.material.carousel.CarouselLayoutManager.d E2(java.util.List list, float f6, boolean z6) {
        float f10 = Float.MAX_VALUE;
        int i6 = -1;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        float f11 = -3.4028235E38f;
        float f12 = Float.MAX_VALUE;
        float f13 = Float.MAX_VALUE;
        for (int i13 = 0; i13 < list.size(); i13++) {
            com.google.android.material.carousel.f.c cVar = (com.google.android.material.carousel.f.c) list.get(i13);
            float f14 = z6 ? cVar.f43076b : cVar.f43075a;
            float fAbs = java.lang.Math.abs(f14 - f6);
            if (f14 <= f6 && fAbs <= f10) {
                i6 = i13;
                f10 = fAbs;
            }
            if (f14 > f6 && fAbs <= f12) {
                i11 = i13;
                f12 = fAbs;
            }
            if (f14 <= f13) {
                i10 = i13;
                f13 = f14;
            }
            if (f14 > f11) {
                i12 = i13;
                f11 = f14;
            }
        }
        if (i6 == -1) {
            i6 = i10;
        }
        if (i11 == -1) {
            i11 = i12;
        }
        return new com.google.android.material.carousel.CarouselLayoutManager.d((com.google.android.material.carousel.f.c) list.get(i6), (com.google.android.material.carousel.f.c) list.get(i11));
    }

    private boolean G2(float f6, com.google.android.material.carousel.CarouselLayoutManager.d dVar) {
        float fZ1 = Z1(f6, s2(f6, dVar) / 2.0f);
        if (F2()) {
            if (fZ1 >= 0.0f) {
                return false;
            }
        } else if (fZ1 <= n2()) {
            return false;
        }
        return true;
    }

    private boolean H2(float f6, com.google.android.material.carousel.CarouselLayoutManager.d dVar) {
        float fY1 = Y1(f6, s2(f6, dVar) / 2.0f);
        if (F2()) {
            if (fY1 <= n2()) {
                return false;
            }
        } else if (fY1 >= 0.0f) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I2(android.view.View view, int i6, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        if (i6 == i13 && i10 == i14 && i11 == i15 && i12 == i16) {
            return;
        }
        view.post(new java.lang.Runnable() { // from class: q4.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f53121C.N2();
            }
        });
    }

    private void J2() {
        if (this.f43035v && android.util.Log.isLoggable("CarouselLayoutManager", 3)) {
            for (int i6 = 0; i6 < O(); i6++) {
                android.view.View viewN = N(i6);
                java.lang.String str = "item position " + l0(viewN) + ", center:" + o2(viewN) + ", child index:" + i6;
            }
        }
    }

    private com.google.android.material.carousel.CarouselLayoutManager.b K2(androidx.recyclerview.widget.RecyclerView.v vVar, float f6, int i6) {
        android.view.View viewO = vVar.o(i6);
        E0(viewO, 0, 0);
        float fY1 = Y1(f6, this.f43039z.f() / 2.0f);
        com.google.android.material.carousel.CarouselLayoutManager.d dVarE2 = E2(this.f43039z.g(), fY1, false);
        return new com.google.android.material.carousel.CarouselLayoutManager.b(viewO, fY1, d2(viewO, fY1, dVarE2), dVarE2);
    }

    private float L2(android.view.View view, float f6, float f10, android.graphics.Rect rect) {
        float fY1 = Y1(f6, f10);
        com.google.android.material.carousel.CarouselLayoutManager.d dVarE2 = E2(this.f43039z.g(), fY1, false);
        float fD2 = d2(view, fY1, dVarE2);
        super.U(view, rect);
        V2(view, fY1, dVarE2);
        this.f43027C.l(view, rect, f10, fD2);
        return fD2;
    }

    private void M2(androidx.recyclerview.widget.RecyclerView.v vVar) {
        android.view.View viewO = vVar.o(0);
        E0(viewO, 0, 0);
        com.google.android.material.carousel.f fVarG = this.f43037x.g(this, viewO);
        if (F2()) {
            fVarG = com.google.android.material.carousel.f.n(fVarG, n2());
        }
        this.f43038y = com.google.android.material.carousel.g.f(this, fVarG, p2(), r2(), B2());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N2() {
        this.f43038y = null;
        x1();
    }

    private void O2(androidx.recyclerview.widget.RecyclerView.v vVar) {
        while (O() > 0) {
            android.view.View viewN = N(0);
            float fO2 = o2(viewN);
            if (!H2(fO2, E2(this.f43039z.g(), fO2, true))) {
                break;
            } else {
                q1(viewN, vVar);
            }
        }
        while (O() - 1 >= 0) {
            android.view.View viewN2 = N(O() - 1);
            float fO3 = o2(viewN2);
            if (!G2(fO3, E2(this.f43039z.g(), fO3, true))) {
                return;
            } else {
                q1(viewN2, vVar);
            }
        }
    }

    private int P2(int i6, androidx.recyclerview.widget.RecyclerView.v vVar, androidx.recyclerview.widget.RecyclerView.A a6) {
        if (O() == 0 || i6 == 0) {
            return 0;
        }
        if (this.f43038y == null) {
            M2(vVar);
        }
        int iH2 = h2(i6, this.f43032s, this.f43033t, this.f43034u);
        this.f43032s += iH2;
        W2(this.f43038y);
        float f6 = this.f43039z.f() / 2.0f;
        float fE2 = e2(l0(N(0)));
        android.graphics.Rect rect = new android.graphics.Rect();
        float f10 = (F2() ? this.f43039z.h() : this.f43039z.a()).f43076b;
        float f11 = Float.MAX_VALUE;
        for (int i10 = 0; i10 < O(); i10++) {
            android.view.View viewN = N(i10);
            float fAbs = java.lang.Math.abs(f10 - L2(viewN, fE2, f6, rect));
            if (viewN != null && fAbs < f11) {
                this.f43030F = l0(viewN);
                f11 = fAbs;
            }
            fE2 = Y1(fE2, this.f43039z.f());
        }
        k2(vVar, a6);
        return iH2;
    }

    private void Q2(androidx.recyclerview.widget.RecyclerView recyclerView, int i6) {
        if (f()) {
            recyclerView.scrollBy(i6, 0);
        } else {
            recyclerView.scrollBy(0, i6);
        }
    }

    private void S2(android.content.Context context, android.util.AttributeSet attributeSet) {
        if (attributeSet != null) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p125m4.j.f51072t0);
            R2(typedArrayObtainStyledAttributes.getInt(p125m4.j.f51080u0, 0));
            U2(typedArrayObtainStyledAttributes.getInt(p125m4.j.f50757F4, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private void V2(android.view.View view, float f6, com.google.android.material.carousel.CarouselLayoutManager.d dVar) {
    }

    private void W2(com.google.android.material.carousel.g gVar) {
        com.google.android.material.carousel.f fVarJ;
        int i6 = this.f43034u;
        int i10 = this.f43033t;
        if (i6 <= i10) {
            fVarJ = F2() ? gVar.h() : gVar.l();
        } else {
            fVarJ = gVar.j(this.f43032s, i10, i6);
        }
        this.f43039z = fVarJ;
        this.f43036w.j(this.f43039z.g());
    }

    private void X1(android.view.View view, int i6, com.google.android.material.carousel.CarouselLayoutManager.b bVar) {
        float f6 = this.f43039z.f() / 2.0f;
        j(view, i6);
        float f10 = bVar.f43043c;
        this.f43027C.k(view, (int) (f10 - f6), (int) (f10 + f6));
        V2(view, bVar.f43042b, bVar.f43044d);
    }

    private void X2() {
        int iA = a();
        int i6 = this.f43029E;
        if (iA == i6 || this.f43038y == null) {
            return;
        }
        if (this.f43037x.h(this, i6)) {
            N2();
        }
        this.f43029E = iA;
    }

    private float Y1(float f6, float f10) {
        return F2() ? f6 - f10 : f6 + f10;
    }

    private void Y2() {
        if (!this.f43035v || O() < 1) {
            return;
        }
        int i6 = 0;
        while (i6 < O() - 1) {
            int iL0 = l0(N(i6));
            int i10 = i6 + 1;
            int iL1 = l0(N(i10));
            if (iL0 > iL1) {
                J2();
                throw new java.lang.IllegalStateException("Detected invalid child order. Child at index [" + i6 + "] had adapter position [" + iL0 + "] and child at index [" + i10 + "] had adapter position [" + iL1 + "].");
            }
            i6 = i10;
        }
    }

    private float Z1(float f6, float f10) {
        return F2() ? f6 + f10 : f6 - f10;
    }

    private void a2(androidx.recyclerview.widget.RecyclerView.v vVar, int i6, int i10) {
        if (i6 < 0 || i6 >= a()) {
            return;
        }
        com.google.android.material.carousel.CarouselLayoutManager.b bVarK2 = K2(vVar, e2(i6), i6);
        X1(bVarK2.f43041a, i10, bVarK2);
    }

    private void b2(androidx.recyclerview.widget.RecyclerView.v vVar, androidx.recyclerview.widget.RecyclerView.A a6, int i6) {
        float fE2 = e2(i6);
        while (i6 < a6.b()) {
            com.google.android.material.carousel.CarouselLayoutManager.b bVarK2 = K2(vVar, fE2, i6);
            if (G2(bVarK2.f43043c, bVarK2.f43044d)) {
                return;
            }
            fE2 = Y1(fE2, this.f43039z.f());
            if (!H2(bVarK2.f43043c, bVarK2.f43044d)) {
                X1(bVarK2.f43041a, -1, bVarK2);
            }
            i6++;
        }
    }

    private void c2(androidx.recyclerview.widget.RecyclerView.v vVar, int i6) {
        float fE2 = e2(i6);
        while (i6 >= 0) {
            com.google.android.material.carousel.CarouselLayoutManager.b bVarK2 = K2(vVar, fE2, i6);
            if (H2(bVarK2.f43043c, bVarK2.f43044d)) {
                return;
            }
            fE2 = Z1(fE2, this.f43039z.f());
            if (!G2(bVarK2.f43043c, bVarK2.f43044d)) {
                X1(bVarK2.f43041a, 0, bVarK2);
            }
            i6--;
        }
    }

    private float d2(android.view.View view, float f6, com.google.android.material.carousel.CarouselLayoutManager.d dVar) {
        com.google.android.material.carousel.f.c cVar = dVar.f43047a;
        float f10 = cVar.f43076b;
        com.google.android.material.carousel.f.c cVar2 = dVar.f43048b;
        float fB = p135n4.a.b(f10, cVar2.f43076b, cVar.f43075a, cVar2.f43075a, f6);
        if (dVar.f43048b != this.f43039z.c() && dVar.f43047a != this.f43039z.j()) {
            return fB;
        }
        float fD = this.f43027C.d((androidx.recyclerview.widget.RecyclerView.q) view.getLayoutParams()) / this.f43039z.f();
        com.google.android.material.carousel.f.c cVar3 = dVar.f43048b;
        return fB + ((f6 - cVar3.f43075a) * ((1.0f - cVar3.f43077c) + fD));
    }

    private float e2(int i6) {
        return Y1(z2() - this.f43032s, this.f43039z.f() * i6);
    }

    private int f2(androidx.recyclerview.widget.RecyclerView.A a6, com.google.android.material.carousel.g gVar) {
        boolean zF2 = F2();
        com.google.android.material.carousel.f fVarL = zF2 ? gVar.l() : gVar.h();
        com.google.android.material.carousel.f.c cVarA = zF2 ? fVarL.a() : fVarL.h();
        int iB = (int) (((((a6.b() - 1) * fVarL.f()) * (zF2 ? -1.0f : 1.0f)) - (cVarA.f43075a - z2())) + (w2() - cVarA.f43075a) + (zF2 ? -cVarA.f43081g : cVarA.f43082h));
        return zF2 ? java.lang.Math.min(0, iB) : java.lang.Math.max(0, iB);
    }

    private static int h2(int i6, int i10, int i11, int i12) {
        int i13 = i10 + i6;
        if (i13 < i11) {
            return i11 - i10;
        }
        return i13 > i12 ? i12 - i10 : i6;
    }

    private int i2(com.google.android.material.carousel.g gVar) {
        boolean zF2 = F2();
        com.google.android.material.carousel.f fVarH = zF2 ? gVar.h() : gVar.l();
        return (int) (z2() - Z1((zF2 ? fVarH.h() : fVarH.a()).f43075a, fVarH.f() / 2.0f));
    }

    private int j2(int i6) {
        int iU2 = u2();
        if (i6 == 1) {
            return -1;
        }
        if (i6 == 2) {
            return 1;
        }
        if (i6 == 17) {
            if (iU2 == 0) {
                return F2() ? 1 : -1;
            }
            return Integer.MIN_VALUE;
        }
        if (i6 == 33) {
            return iU2 == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i6 == 66) {
            if (iU2 == 0) {
                return F2() ? -1 : 1;
            }
            return Integer.MIN_VALUE;
        }
        if (i6 == 130) {
            return iU2 == 1 ? 1 : Integer.MIN_VALUE;
        }
        java.lang.String str = "Unknown focus request:" + i6;
        return Integer.MIN_VALUE;
    }

    private void k2(androidx.recyclerview.widget.RecyclerView.v vVar, androidx.recyclerview.widget.RecyclerView.A a6) {
        O2(vVar);
        if (O() == 0) {
            c2(vVar, this.f43025A - 1);
            b2(vVar, a6, this.f43025A);
        } else {
            int iL0 = l0(N(0));
            int iL1 = l0(N(O() - 1));
            c2(vVar, iL0 - 1);
            b2(vVar, a6, iL1 + 1);
        }
        Y2();
    }

    private android.view.View l2() {
        return N(F2() ? 0 : O() - 1);
    }

    private android.view.View m2() {
        return N(F2() ? O() - 1 : 0);
    }

    private int n2() {
        return f() ? b() : c();
    }

    private float o2(android.view.View view) {
        android.graphics.Rect rect = new android.graphics.Rect();
        super.U(view, rect);
        return f() ? rect.centerX() : rect.centerY();
    }

    private int p2() {
        int i6;
        int i10;
        if (O() <= 0) {
            return 0;
        }
        androidx.recyclerview.widget.RecyclerView.q qVar = (androidx.recyclerview.widget.RecyclerView.q) N(0).getLayoutParams();
        if (this.f43027C.f43057a == 0) {
            i6 = ((android.view.ViewGroup.MarginLayoutParams) qVar).leftMargin;
            i10 = ((android.view.ViewGroup.MarginLayoutParams) qVar).rightMargin;
        } else {
            i6 = ((android.view.ViewGroup.MarginLayoutParams) qVar).topMargin;
            i10 = ((android.view.ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }
        return i6 + i10;
    }

    private com.google.android.material.carousel.f q2(int i6) {
        com.google.android.material.carousel.f fVar;
        java.util.Map map = this.f43026B;
        return (map == null || (fVar = (com.google.android.material.carousel.f) map.get(java.lang.Integer.valueOf(p222w1.a.b(i6, 0, java.lang.Math.max(0, a() + (-1)))))) == null) ? this.f43038y.g() : fVar;
    }

    private int r2() {
        if (R() || !this.f43037x.f()) {
            return 0;
        }
        return u2() == 1 ? k0() : i0();
    }

    private float s2(float f6, com.google.android.material.carousel.CarouselLayoutManager.d dVar) {
        com.google.android.material.carousel.f.c cVar = dVar.f43047a;
        float f10 = cVar.f43078d;
        com.google.android.material.carousel.f.c cVar2 = dVar.f43048b;
        return p135n4.a.b(f10, cVar2.f43078d, cVar.f43076b, cVar2.f43076b, f6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int v2() {
        return this.f43027C.e();
    }

    private int w2() {
        return this.f43027C.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int x2() {
        return this.f43027C.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int y2() {
        return this.f43027C.h();
    }

    private int z2() {
        return this.f43027C.i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int A(androidx.recyclerview.widget.RecyclerView.A a6) {
        return this.f43034u - this.f43033t;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int A1(int i6, androidx.recyclerview.widget.RecyclerView.v vVar, androidx.recyclerview.widget.RecyclerView.A a6) {
        if (p()) {
            return P2(i6, vVar, a6);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void B1(int i6) {
        this.f43030F = i6;
        if (this.f43038y == null) {
            return;
        }
        this.f43032s = C2(i6, q2(i6));
        this.f43025A = p222w1.a.b(i6, 0, java.lang.Math.max(0, a() - 1));
        W2(this.f43038y);
        x1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int C1(int i6, androidx.recyclerview.widget.RecyclerView.v vVar, androidx.recyclerview.widget.RecyclerView.A a6) {
        if (q()) {
            return P2(i6, vVar, a6);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void E0(android.view.View view, int i6, int i10) {
        throw new java.lang.IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    boolean F2() {
        return f() && d0() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public androidx.recyclerview.widget.RecyclerView.q I() {
        return new androidx.recyclerview.widget.RecyclerView.q(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void K0(androidx.recyclerview.widget.RecyclerView recyclerView) {
        super.K0(recyclerView);
        this.f43037x.e(recyclerView.getContext());
        N2();
        recyclerView.addOnLayoutChangeListener(this.f43028D);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void M0(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.v vVar) {
        super.M0(recyclerView, vVar);
        recyclerView.removeOnLayoutChangeListener(this.f43028D);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void M1(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.A a6, int i6) {
        com.google.android.material.carousel.CarouselLayoutManager.a aVar = new com.google.android.material.carousel.CarouselLayoutManager.a(recyclerView.getContext());
        aVar.p(i6);
        N1(aVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public android.view.View N0(android.view.View view, int i6, androidx.recyclerview.widget.RecyclerView.v vVar, androidx.recyclerview.widget.RecyclerView.A a6) {
        int iJ2;
        if (O() == 0 || (iJ2 = j2(i6)) == Integer.MIN_VALUE) {
            return null;
        }
        int iL0 = l0(view);
        if (iJ2 == -1) {
            if (iL0 == 0) {
                return null;
            }
            a2(vVar, l0(N(0)) - 1, 0);
            return m2();
        }
        if (iL0 == a() - 1) {
            return null;
        }
        a2(vVar, l0(N(O() - 1)) + 1, -1);
        return l2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void O0(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.O0(accessibilityEvent);
        if (O() > 0) {
            accessibilityEvent.setFromIndex(l0(N(0)));
            accessibilityEvent.setToIndex(l0(N(O() - 1)));
        }
    }

    public void R2(int i6) {
        this.f43031G = i6;
        N2();
    }

    public void T2(com.google.android.material.carousel.d dVar) {
        this.f43037x = dVar;
        N2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void U(android.view.View view, android.graphics.Rect rect) {
        super.U(view, rect);
        float fCenterY = rect.centerY();
        if (f()) {
            fCenterY = rect.centerX();
        }
        float fS2 = s2(fCenterY, E2(this.f43039z.g(), fCenterY, true));
        float fWidth = f() ? (rect.width() - fS2) / 2.0f : 0.0f;
        float fHeight = f() ? 0.0f : (rect.height() - fS2) / 2.0f;
        rect.set((int) (rect.left + fWidth), (int) (rect.top + fHeight), (int) (rect.right - fWidth), (int) (rect.bottom - fHeight));
    }

    public void U2(int i6) {
        if (i6 != 0 && i6 != 1) {
            throw new java.lang.IllegalArgumentException("invalid orientation:" + i6);
        }
        l(null);
        com.google.android.material.carousel.c cVar = this.f43027C;
        if (cVar == null || i6 != cVar.f43057a) {
            this.f43027C = com.google.android.material.carousel.c.b(this, i6);
            N2();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void V0(androidx.recyclerview.widget.RecyclerView recyclerView, int i6, int i10) {
        super.V0(recyclerView, i6, i10);
        X2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Y0(androidx.recyclerview.widget.RecyclerView recyclerView, int i6, int i10) {
        super.Y0(recyclerView, i6, i10);
        X2();
    }

    @Override // com.google.android.material.carousel.b
    public int b() {
        return s0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void b1(androidx.recyclerview.widget.RecyclerView.v vVar, androidx.recyclerview.widget.RecyclerView.A a6) {
        if (a6.b() <= 0 || n2() <= 0.0f) {
            o1(vVar);
            this.f43025A = 0;
            return;
        }
        boolean zF2 = F2();
        boolean z6 = this.f43038y == null;
        if (z6) {
            M2(vVar);
        }
        int iI2 = i2(this.f43038y);
        int iF2 = f2(a6, this.f43038y);
        this.f43033t = zF2 ? iF2 : iI2;
        if (zF2) {
            iF2 = iI2;
        }
        this.f43034u = iF2;
        if (z6) {
            this.f43032s = iI2;
            this.f43026B = this.f43038y.i(a(), this.f43033t, this.f43034u, F2());
            int i6 = this.f43030F;
            if (i6 != -1) {
                this.f43032s = C2(i6, q2(i6));
            }
        }
        int i10 = this.f43032s;
        this.f43032s = i10 + h2(0, i10, this.f43033t, this.f43034u);
        this.f43025A = p222w1.a.b(this.f43025A, 0, a6.b());
        W2(this.f43038y);
        B(vVar);
        k2(vVar, a6);
        this.f43029E = a();
    }

    @Override // com.google.android.material.carousel.b
    public int c() {
        return b0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void c1(androidx.recyclerview.widget.RecyclerView.A a6) {
        super.c1(a6);
        if (O() == 0) {
            this.f43025A = 0;
        } else {
            this.f43025A = l0(N(0));
        }
        Y2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z.b
    public android.graphics.PointF d(int i6) {
        if (this.f43038y == null) {
            return null;
        }
        int iT2 = t2(i6, q2(i6));
        return f() ? new android.graphics.PointF(iT2, 0.0f) : new android.graphics.PointF(0.0f, iT2);
    }

    @Override // com.google.android.material.carousel.b
    public int e() {
        return this.f43031G;
    }

    @Override // com.google.android.material.carousel.b
    public boolean f() {
        return this.f43027C.f43057a == 0;
    }

    int g2(int i6) {
        return (int) (this.f43032s - C2(i6, q2(i6)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean p() {
        return f();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean q() {
        return !f();
    }

    int t2(int i6, com.google.android.material.carousel.f fVar) {
        return C2(i6, fVar) - this.f43032s;
    }

    public int u2() {
        return this.f43027C.f43057a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int v(androidx.recyclerview.widget.RecyclerView.A a6) {
        if (O() == 0 || this.f43038y == null || a() <= 1) {
            return 0;
        }
        return (int) (s0() * (this.f43038y.g().f() / x(a6)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int w(androidx.recyclerview.widget.RecyclerView.A a6) {
        return this.f43032s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean w0() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean w1(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.View view, android.graphics.Rect rect, boolean z6, boolean z10) {
        int iD2;
        if (this.f43038y == null || (iD2 = D2(l0(view), q2(l0(view)))) == 0) {
            return false;
        }
        Q2(recyclerView, D2(l0(view), this.f43038y.j(this.f43032s + h2(iD2, this.f43032s, this.f43033t, this.f43034u), this.f43033t, this.f43034u)));
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int x(androidx.recyclerview.widget.RecyclerView.A a6) {
        return this.f43034u - this.f43033t;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int y(androidx.recyclerview.widget.RecyclerView.A a6) {
        if (O() == 0 || this.f43038y == null || a() <= 1) {
            return 0;
        }
        return (int) (b0() * (this.f43038y.g().f() / A(a6)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int z(androidx.recyclerview.widget.RecyclerView.A a6) {
        return this.f43032s;
    }
}
