package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public abstract class n extends androidx.recyclerview.widget.RecyclerView.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    androidx.recyclerview.widget.RecyclerView f23436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.widget.Scroller f23437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.recyclerview.widget.RecyclerView.t f23438c = new androidx.recyclerview.widget.n.a();

    class a extends androidx.recyclerview.widget.RecyclerView.t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f23439a = false;

        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void a(androidx.recyclerview.widget.RecyclerView recyclerView, int i6) {
            super.a(recyclerView, i6);
            if (i6 == 0 && this.f23439a) {
                this.f23439a = false;
                androidx.recyclerview.widget.n.this.j();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void b(androidx.recyclerview.widget.RecyclerView recyclerView, int i6, int i10) {
            if (i6 == 0 && i10 == 0) {
                return;
            }
            this.f23439a = true;
        }
    }

    private void e() {
        this.f23436a.Y0(this.f23438c);
        this.f23436a.setOnFlingListener(null);
    }

    private void h() {
        if (this.f23436a.getOnFlingListener() != null) {
            throw new java.lang.IllegalStateException("An instance of OnFlingListener already set.");
        }
        this.f23436a.k(this.f23438c);
        this.f23436a.setOnFlingListener(this);
    }

    private boolean i(androidx.recyclerview.widget.RecyclerView.p pVar, int i6, int i10) {
        androidx.recyclerview.widget.RecyclerView.z zVarD;
        int iG;
        if (!(pVar instanceof androidx.recyclerview.widget.RecyclerView.z.b) || (zVarD = d(pVar)) == null || (iG = g(pVar, i6, i10)) == -1) {
            return false;
        }
        zVarD.p(iG);
        pVar.N1(zVarD);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public boolean a(int i6, int i10) {
        androidx.recyclerview.widget.RecyclerView.p layoutManager = this.f23436a.getLayoutManager();
        if (layoutManager == null || this.f23436a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f23436a.getMinFlingVelocity();
        return (java.lang.Math.abs(i10) > minFlingVelocity || java.lang.Math.abs(i6) > minFlingVelocity) && i(layoutManager, i6, i10);
    }

    public void b(androidx.recyclerview.widget.RecyclerView recyclerView) {
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f23436a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            e();
        }
        this.f23436a = recyclerView;
        if (recyclerView != null) {
            h();
            this.f23437b = new android.widget.Scroller(this.f23436a.getContext(), new android.view.animation.DecelerateInterpolator());
            j();
        }
    }

    public abstract int[] c(androidx.recyclerview.widget.RecyclerView.p pVar, android.view.View view);

    protected abstract androidx.recyclerview.widget.RecyclerView.z d(androidx.recyclerview.widget.RecyclerView.p pVar);

    public abstract android.view.View f(androidx.recyclerview.widget.RecyclerView.p pVar);

    public abstract int g(androidx.recyclerview.widget.RecyclerView.p pVar, int i6, int i10);

    void j() {
        androidx.recyclerview.widget.RecyclerView.p layoutManager;
        android.view.View viewF;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f23436a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewF = f(layoutManager)) == null) {
            return;
        }
        int[] iArrC = c(layoutManager, viewF);
        int i6 = iArrC[0];
        if (i6 == 0 && iArrC[1] == 0) {
            return;
        }
        this.f23436a.l1(i6, iArrC[1]);
    }
}
