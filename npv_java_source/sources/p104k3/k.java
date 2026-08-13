package p104k3;

/* JADX INFO: loaded from: classes.dex */
public abstract class k extends android.view.ViewGroup {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    protected final p184s3.C7102i1 f49488C;

    protected k(android.content.Context context, int i6) {
        super(context);
        this.f49488C = new p184s3.C7102i1(this, i6);
    }

    public void a() {
        com.google.android.gms.internal.ads.AbstractC2161Af.a(getContext());
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2163Ag.f25766e.e()).booleanValue()) {
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Ya)).booleanValue()) {
                p224w3.c.f56225b.execute(new java.lang.Runnable() { // from class: k3.B
                    @Override // java.lang.Runnable
                    public final void run() {
                        p104k3.k kVar = this.f49442C;
                        try {
                            kVar.f49488C.k();
                        } catch (java.lang.IllegalStateException e6) {
                            com.google.android.gms.internal.ads.C4396lo.c(kVar.getContext()).a(e6, "BaseAdView.destroy");
                        }
                    }
                });
                return;
            }
        }
        this.f49488C.k();
    }

    public void b(final p104k3.g gVar) {
        Q3.AbstractC1477p.e("#008 Must be called on the main UI thread.");
        com.google.android.gms.internal.ads.AbstractC2161Af.a(getContext());
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2163Ag.f25767f.e()).booleanValue()) {
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.bb)).booleanValue()) {
                p224w3.c.f56225b.execute(new java.lang.Runnable() { // from class: k3.D
                    @Override // java.lang.Runnable
                    public final void run() {
                        p104k3.k kVar = this.f49444C;
                        try {
                            kVar.f49488C.m(gVar.f49466a);
                        } catch (java.lang.IllegalStateException e6) {
                            com.google.android.gms.internal.ads.C4396lo.c(kVar.getContext()).a(e6, "BaseAdView.loadAd");
                        }
                    }
                });
                return;
            }
        }
        this.f49488C.m(gVar.f49466a);
    }

    public void c() {
        com.google.android.gms.internal.ads.AbstractC2161Af.a(getContext());
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2163Ag.f25768g.e()).booleanValue()) {
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Za)).booleanValue()) {
                p224w3.c.f56225b.execute(new java.lang.Runnable() { // from class: k3.C
                    @Override // java.lang.Runnable
                    public final void run() {
                        p104k3.k kVar = this.f49443C;
                        try {
                            kVar.f49488C.n();
                        } catch (java.lang.IllegalStateException e6) {
                            com.google.android.gms.internal.ads.C4396lo.c(kVar.getContext()).a(e6, "BaseAdView.pause");
                        }
                    }
                });
                return;
            }
        }
        this.f49488C.n();
    }

    public void d() {
        com.google.android.gms.internal.ads.AbstractC2161Af.a(getContext());
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2163Ag.f25769h.e()).booleanValue()) {
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Xa)).booleanValue()) {
                p224w3.c.f56225b.execute(new java.lang.Runnable() { // from class: k3.A
                    @Override // java.lang.Runnable
                    public final void run() {
                        p104k3.k kVar = this.f49441C;
                        try {
                            kVar.f49488C.o();
                        } catch (java.lang.IllegalStateException e6) {
                            com.google.android.gms.internal.ads.C4396lo.c(kVar.getContext()).a(e6, "BaseAdView.resume");
                        }
                    }
                });
                return;
            }
        }
        this.f49488C.o();
    }

    public p104k3.AbstractC6887d getAdListener() {
        return this.f49488C.c();
    }

    public p104k3.h getAdSize() {
        return this.f49488C.d();
    }

    public java.lang.String getAdUnitId() {
        return this.f49488C.j();
    }

    public p104k3.o getOnPaidEventListener() {
        this.f49488C.e();
        return null;
    }

    public p104k3.u getResponseInfo() {
        return this.f49488C.f();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z6, int i6, int i10, int i11, int i12) {
        android.view.View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int i13 = ((i11 - i6) - measuredWidth) / 2;
        int i14 = ((i12 - i10) - measuredHeight) / 2;
        childAt.layout(i13, i14, measuredWidth + i13, measuredHeight + i14);
    }

    @Override // android.view.View
    protected void onMeasure(int i6, int i10) {
        p104k3.h adSize;
        int iB;
        int measuredWidth = 0;
        android.view.View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            try {
                adSize = getAdSize();
            } catch (java.lang.NullPointerException e6) {
                p224w3.p.e("Unable to retrieve ad size.", e6);
                adSize = null;
            }
            if (adSize != null) {
                android.content.Context context = getContext();
                int iD = adSize.d(context);
                iB = adSize.b(context);
                measuredWidth = iD;
            } else {
                iB = 0;
            }
        } else {
            measureChild(childAt, i6, i10);
            measuredWidth = childAt.getMeasuredWidth();
            iB = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(android.view.View.resolveSize(java.lang.Math.max(measuredWidth, getSuggestedMinimumWidth()), i6), android.view.View.resolveSize(java.lang.Math.max(iB, getSuggestedMinimumHeight()), i10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setAdListener(p104k3.AbstractC6887d abstractC6887d) {
        this.f49488C.q(abstractC6887d);
        if (abstractC6887d == 0) {
            this.f49488C.p(null);
            return;
        }
        if (abstractC6887d instanceof p184s3.InterfaceC7076a) {
            this.f49488C.p((p184s3.InterfaceC7076a) abstractC6887d);
        }
        if (abstractC6887d instanceof p114l3.c) {
            this.f49488C.u((p114l3.c) abstractC6887d);
        }
    }

    public void setAdSize(p104k3.h hVar) {
        this.f49488C.r(hVar);
    }

    public void setAdUnitId(java.lang.String str) {
        this.f49488C.t(str);
    }

    public void setOnPaidEventListener(p104k3.o oVar) {
        this.f49488C.v(oVar);
    }
}
