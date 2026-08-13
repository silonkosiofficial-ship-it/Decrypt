package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final androidx.recyclerview.widget.RecyclerView.p f23425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f23426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final android.graphics.Rect f23427c;

    class a extends androidx.recyclerview.widget.i {
        a(androidx.recyclerview.widget.RecyclerView.p pVar) {
            super(pVar, null);
        }

        @Override // androidx.recyclerview.widget.i
        public int d(android.view.View view) {
            return this.f23425a.Y(view) + ((android.view.ViewGroup.MarginLayoutParams) ((androidx.recyclerview.widget.RecyclerView.q) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int e(android.view.View view) {
            androidx.recyclerview.widget.RecyclerView.q qVar = (androidx.recyclerview.widget.RecyclerView.q) view.getLayoutParams();
            return this.f23425a.X(view) + ((android.view.ViewGroup.MarginLayoutParams) qVar).leftMargin + ((android.view.ViewGroup.MarginLayoutParams) qVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int f(android.view.View view) {
            androidx.recyclerview.widget.RecyclerView.q qVar = (androidx.recyclerview.widget.RecyclerView.q) view.getLayoutParams();
            return this.f23425a.W(view) + ((android.view.ViewGroup.MarginLayoutParams) qVar).topMargin + ((android.view.ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int g(android.view.View view) {
            return this.f23425a.V(view) - ((android.view.ViewGroup.MarginLayoutParams) ((androidx.recyclerview.widget.RecyclerView.q) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int h() {
            return this.f23425a.s0();
        }

        @Override // androidx.recyclerview.widget.i
        public int i() {
            return this.f23425a.s0() - this.f23425a.j0();
        }

        @Override // androidx.recyclerview.widget.i
        public int j() {
            return this.f23425a.j0();
        }

        @Override // androidx.recyclerview.widget.i
        public int k() {
            return this.f23425a.t0();
        }

        @Override // androidx.recyclerview.widget.i
        public int l() {
            return this.f23425a.c0();
        }

        @Override // androidx.recyclerview.widget.i
        public int m() {
            return this.f23425a.i0();
        }

        @Override // androidx.recyclerview.widget.i
        public int n() {
            return (this.f23425a.s0() - this.f23425a.i0()) - this.f23425a.j0();
        }

        @Override // androidx.recyclerview.widget.i
        public int p(android.view.View view) {
            this.f23425a.r0(view, true, this.f23427c);
            return this.f23427c.right;
        }

        @Override // androidx.recyclerview.widget.i
        public int q(android.view.View view) {
            this.f23425a.r0(view, true, this.f23427c);
            return this.f23427c.left;
        }

        @Override // androidx.recyclerview.widget.i
        public void r(int i6) {
            this.f23425a.G0(i6);
        }
    }

    class b extends androidx.recyclerview.widget.i {
        b(androidx.recyclerview.widget.RecyclerView.p pVar) {
            super(pVar, null);
        }

        @Override // androidx.recyclerview.widget.i
        public int d(android.view.View view) {
            return this.f23425a.T(view) + ((android.view.ViewGroup.MarginLayoutParams) ((androidx.recyclerview.widget.RecyclerView.q) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int e(android.view.View view) {
            androidx.recyclerview.widget.RecyclerView.q qVar = (androidx.recyclerview.widget.RecyclerView.q) view.getLayoutParams();
            return this.f23425a.W(view) + ((android.view.ViewGroup.MarginLayoutParams) qVar).topMargin + ((android.view.ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int f(android.view.View view) {
            androidx.recyclerview.widget.RecyclerView.q qVar = (androidx.recyclerview.widget.RecyclerView.q) view.getLayoutParams();
            return this.f23425a.X(view) + ((android.view.ViewGroup.MarginLayoutParams) qVar).leftMargin + ((android.view.ViewGroup.MarginLayoutParams) qVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int g(android.view.View view) {
            return this.f23425a.Z(view) - ((android.view.ViewGroup.MarginLayoutParams) ((androidx.recyclerview.widget.RecyclerView.q) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int h() {
            return this.f23425a.b0();
        }

        @Override // androidx.recyclerview.widget.i
        public int i() {
            return this.f23425a.b0() - this.f23425a.h0();
        }

        @Override // androidx.recyclerview.widget.i
        public int j() {
            return this.f23425a.h0();
        }

        @Override // androidx.recyclerview.widget.i
        public int k() {
            return this.f23425a.c0();
        }

        @Override // androidx.recyclerview.widget.i
        public int l() {
            return this.f23425a.t0();
        }

        @Override // androidx.recyclerview.widget.i
        public int m() {
            return this.f23425a.k0();
        }

        @Override // androidx.recyclerview.widget.i
        public int n() {
            return (this.f23425a.b0() - this.f23425a.k0()) - this.f23425a.h0();
        }

        @Override // androidx.recyclerview.widget.i
        public int p(android.view.View view) {
            this.f23425a.r0(view, true, this.f23427c);
            return this.f23427c.bottom;
        }

        @Override // androidx.recyclerview.widget.i
        public int q(android.view.View view) {
            this.f23425a.r0(view, true, this.f23427c);
            return this.f23427c.top;
        }

        @Override // androidx.recyclerview.widget.i
        public void r(int i6) {
            this.f23425a.H0(i6);
        }
    }

    private i(androidx.recyclerview.widget.RecyclerView.p pVar) {
        this.f23426b = Integer.MIN_VALUE;
        this.f23427c = new android.graphics.Rect();
        this.f23425a = pVar;
    }

    /* synthetic */ i(androidx.recyclerview.widget.RecyclerView.p pVar, androidx.recyclerview.widget.i.a aVar) {
        this(pVar);
    }

    public static androidx.recyclerview.widget.i a(androidx.recyclerview.widget.RecyclerView.p pVar) {
        return new androidx.recyclerview.widget.i.a(pVar);
    }

    public static androidx.recyclerview.widget.i b(androidx.recyclerview.widget.RecyclerView.p pVar, int i6) {
        if (i6 == 0) {
            return a(pVar);
        }
        if (i6 == 1) {
            return c(pVar);
        }
        throw new java.lang.IllegalArgumentException("invalid orientation");
    }

    public static androidx.recyclerview.widget.i c(androidx.recyclerview.widget.RecyclerView.p pVar) {
        return new androidx.recyclerview.widget.i.b(pVar);
    }

    public abstract int d(android.view.View view);

    public abstract int e(android.view.View view);

    public abstract int f(android.view.View view);

    public abstract int g(android.view.View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public int o() {
        if (Integer.MIN_VALUE == this.f23426b) {
            return 0;
        }
        return n() - this.f23426b;
    }

    public abstract int p(android.view.View view);

    public abstract int q(android.view.View view);

    public abstract void r(int i6);

    public void s() {
        this.f23426b = n();
    }
}
