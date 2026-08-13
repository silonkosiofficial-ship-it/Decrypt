package R;

/* JADX INFO: loaded from: classes.dex */
public final class j extends android.view.ViewGroup {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int f9216C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.util.List f9217D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.util.List f9218E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final R.l f9219F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f9220G;

    public j(android.content.Context context) {
        super(context);
        this.f9216C = 5;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f9217D = arrayList;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        this.f9218E = arrayList2;
        this.f9219F = new R.l();
        setClipChildren(false);
        R.n nVar = new R.n(context);
        addView(nVar);
        arrayList.add(nVar);
        arrayList2.add(nVar);
        this.f9220G = 1;
        setTag(p071h0.l.f45814J, java.lang.Boolean.TRUE);
    }

    public final void a(R.k kVar) {
        kVar.i0();
        R.n nVarB = this.f9219F.b(kVar);
        if (nVarB != null) {
            nVarB.d();
            this.f9219F.c(kVar);
            this.f9218E.add(nVarB);
        }
    }

    public final R.n b(R.k kVar) {
        R.n nVarB = this.f9219F.b(kVar);
        if (nVarB != null) {
            return nVarB;
        }
        R.n nVar = (R.n) p097j7.AbstractC6879v.K(this.f9218E);
        if (nVar == null) {
            if (this.f9220G > p097j7.AbstractC6879v.o(this.f9217D)) {
                nVar = new R.n(getContext());
                addView(nVar);
                this.f9217D.add(nVar);
            } else {
                nVar = (R.n) this.f9217D.get(this.f9220G);
                R.k kVarA = this.f9219F.a(nVar);
                if (kVarA != null) {
                    kVarA.i0();
                    this.f9219F.c(kVarA);
                    nVar.d();
                }
            }
            int i6 = this.f9220G;
            this.f9220G = i6 < this.f9216C + (-1) ? i6 + 1 : 0;
        }
        this.f9219F.d(kVar, nVar);
        return nVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z6, int i6, int i10, int i11, int i12) {
    }

    @Override // android.view.View
    protected void onMeasure(int i6, int i10) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
    }
}
