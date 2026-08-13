package com.google.android.material.carousel;

/* JADX INFO: loaded from: classes3.dex */
abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f43057a;

    class a extends com.google.android.material.carousel.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.google.android.material.carousel.CarouselLayoutManager f43058b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i6, com.google.android.material.carousel.CarouselLayoutManager carouselLayoutManager) {
            super(i6, null);
            this.f43058b = carouselLayoutManager;
        }

        @Override // com.google.android.material.carousel.c
        public float d(androidx.recyclerview.widget.RecyclerView.q qVar) {
            return ((android.view.ViewGroup.MarginLayoutParams) qVar).topMargin + ((android.view.ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }

        @Override // com.google.android.material.carousel.c
        int e() {
            return this.f43058b.b0();
        }

        @Override // com.google.android.material.carousel.c
        int f() {
            return e();
        }

        @Override // com.google.android.material.carousel.c
        int g() {
            return this.f43058b.i0();
        }

        @Override // com.google.android.material.carousel.c
        int h() {
            return this.f43058b.s0() - this.f43058b.j0();
        }

        @Override // com.google.android.material.carousel.c
        int i() {
            return j();
        }

        @Override // com.google.android.material.carousel.c
        int j() {
            return 0;
        }

        @Override // com.google.android.material.carousel.c
        public void k(android.view.View view, int i6, int i10) {
            int iG = g();
            this.f43058b.D0(view, iG, i6, iG + m(view), i10);
        }

        @Override // com.google.android.material.carousel.c
        public void l(android.view.View view, android.graphics.Rect rect, float f6, float f10) {
            view.offsetTopAndBottom((int) (f10 - (rect.top + f6)));
        }

        int m(android.view.View view) {
            androidx.recyclerview.widget.RecyclerView.q qVar = (androidx.recyclerview.widget.RecyclerView.q) view.getLayoutParams();
            return this.f43058b.X(view) + ((android.view.ViewGroup.MarginLayoutParams) qVar).leftMargin + ((android.view.ViewGroup.MarginLayoutParams) qVar).rightMargin;
        }
    }

    class b extends com.google.android.material.carousel.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.google.android.material.carousel.CarouselLayoutManager f43059b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i6, com.google.android.material.carousel.CarouselLayoutManager carouselLayoutManager) {
            super(i6, null);
            this.f43059b = carouselLayoutManager;
        }

        @Override // com.google.android.material.carousel.c
        public float d(androidx.recyclerview.widget.RecyclerView.q qVar) {
            return ((android.view.ViewGroup.MarginLayoutParams) qVar).rightMargin + ((android.view.ViewGroup.MarginLayoutParams) qVar).leftMargin;
        }

        @Override // com.google.android.material.carousel.c
        int e() {
            return this.f43059b.b0() - this.f43059b.h0();
        }

        @Override // com.google.android.material.carousel.c
        int f() {
            return this.f43059b.F2() ? g() : h();
        }

        @Override // com.google.android.material.carousel.c
        int g() {
            return 0;
        }

        @Override // com.google.android.material.carousel.c
        int h() {
            return this.f43059b.s0();
        }

        @Override // com.google.android.material.carousel.c
        int i() {
            return this.f43059b.F2() ? h() : g();
        }

        @Override // com.google.android.material.carousel.c
        int j() {
            return this.f43059b.k0();
        }

        @Override // com.google.android.material.carousel.c
        public void k(android.view.View view, int i6, int i10) {
            int iJ = j();
            this.f43059b.D0(view, i6, iJ, i10, iJ + m(view));
        }

        @Override // com.google.android.material.carousel.c
        public void l(android.view.View view, android.graphics.Rect rect, float f6, float f10) {
            view.offsetLeftAndRight((int) (f10 - (rect.left + f6)));
        }

        int m(android.view.View view) {
            androidx.recyclerview.widget.RecyclerView.q qVar = (androidx.recyclerview.widget.RecyclerView.q) view.getLayoutParams();
            return this.f43059b.W(view) + ((android.view.ViewGroup.MarginLayoutParams) qVar).topMargin + ((android.view.ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }
    }

    private c(int i6) {
        this.f43057a = i6;
    }

    /* synthetic */ c(int i6, com.google.android.material.carousel.c.a aVar) {
        this(i6);
    }

    private static com.google.android.material.carousel.c a(com.google.android.material.carousel.CarouselLayoutManager carouselLayoutManager) {
        return new com.google.android.material.carousel.c.b(0, carouselLayoutManager);
    }

    static com.google.android.material.carousel.c b(com.google.android.material.carousel.CarouselLayoutManager carouselLayoutManager, int i6) {
        if (i6 == 0) {
            return a(carouselLayoutManager);
        }
        if (i6 == 1) {
            return c(carouselLayoutManager);
        }
        throw new java.lang.IllegalArgumentException("invalid orientation");
    }

    private static com.google.android.material.carousel.c c(com.google.android.material.carousel.CarouselLayoutManager carouselLayoutManager) {
        return new com.google.android.material.carousel.c.a(1, carouselLayoutManager);
    }

    abstract float d(androidx.recyclerview.widget.RecyclerView.q qVar);

    abstract int e();

    abstract int f();

    abstract int g();

    abstract int h();

    abstract int i();

    abstract int j();

    abstract void k(android.view.View view, int i6, int i10);

    abstract void l(android.view.View view, android.graphics.Rect rect, float f6, float f10);
}
