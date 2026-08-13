package androidx.transition;

/* JADX INFO: loaded from: classes.dex */
public class v extends androidx.transition.AbstractC2108k {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    int f23670q0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    java.util.ArrayList f23668o0 = new java.util.ArrayList();

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private boolean f23669p0 = true;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    boolean f23671r0 = false;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private int f23672s0 = 0;

    class a extends androidx.transition.s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.transition.AbstractC2108k f23673a;

        a(androidx.transition.AbstractC2108k abstractC2108k) {
            this.f23673a = abstractC2108k;
        }

        @Override // androidx.transition.AbstractC2108k.f
        public void d(androidx.transition.AbstractC2108k abstractC2108k) {
            this.f23673a.d0();
            abstractC2108k.Z(this);
        }
    }

    static class b extends androidx.transition.s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        androidx.transition.v f23675a;

        b(androidx.transition.v vVar) {
            this.f23675a = vVar;
        }

        @Override // androidx.transition.s, androidx.transition.AbstractC2108k.f
        public void a(androidx.transition.AbstractC2108k abstractC2108k) {
            androidx.transition.v vVar = this.f23675a;
            if (vVar.f23671r0) {
                return;
            }
            vVar.m0();
            this.f23675a.f23671r0 = true;
        }

        @Override // androidx.transition.AbstractC2108k.f
        public void d(androidx.transition.AbstractC2108k abstractC2108k) {
            androidx.transition.v vVar = this.f23675a;
            int i6 = vVar.f23670q0 - 1;
            vVar.f23670q0 = i6;
            if (i6 == 0) {
                vVar.f23671r0 = false;
                vVar.t();
            }
            abstractC2108k.Z(this);
        }
    }

    private void A0() {
        androidx.transition.v.b bVar = new androidx.transition.v.b(this);
        java.util.Iterator it = this.f23668o0.iterator();
        while (it.hasNext()) {
            ((androidx.transition.AbstractC2108k) it.next()).a(bVar);
        }
        this.f23670q0 = this.f23668o0.size();
    }

    private void r0(androidx.transition.AbstractC2108k abstractC2108k) {
        this.f23668o0.add(abstractC2108k);
        abstractC2108k.f23630T = this;
    }

    @Override // androidx.transition.AbstractC2108k
    public void X(android.view.View view) {
        super.X(view);
        int size = this.f23668o0.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((androidx.transition.AbstractC2108k) this.f23668o0.get(i6)).X(view);
        }
    }

    @Override // androidx.transition.AbstractC2108k
    public void b0(android.view.View view) {
        super.b0(view);
        int size = this.f23668o0.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((androidx.transition.AbstractC2108k) this.f23668o0.get(i6)).b0(view);
        }
    }

    @Override // androidx.transition.AbstractC2108k
    protected void cancel() {
        super.cancel();
        int size = this.f23668o0.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((androidx.transition.AbstractC2108k) this.f23668o0.get(i6)).cancel();
        }
    }

    @Override // androidx.transition.AbstractC2108k
    protected void d0() {
        if (this.f23668o0.isEmpty()) {
            m0();
            t();
            return;
        }
        A0();
        if (this.f23669p0) {
            java.util.Iterator it = this.f23668o0.iterator();
            while (it.hasNext()) {
                ((androidx.transition.AbstractC2108k) it.next()).d0();
            }
            return;
        }
        for (int i6 = 1; i6 < this.f23668o0.size(); i6++) {
            ((androidx.transition.AbstractC2108k) this.f23668o0.get(i6 - 1)).a(new androidx.transition.v.a((androidx.transition.AbstractC2108k) this.f23668o0.get(i6)));
        }
        androidx.transition.AbstractC2108k abstractC2108k = (androidx.transition.AbstractC2108k) this.f23668o0.get(0);
        if (abstractC2108k != null) {
            abstractC2108k.d0();
        }
    }

    @Override // androidx.transition.AbstractC2108k
    public void h(androidx.transition.x xVar) {
        if (M(xVar.f23678b)) {
            for (androidx.transition.AbstractC2108k abstractC2108k : this.f23668o0) {
                if (abstractC2108k.M(xVar.f23678b)) {
                    abstractC2108k.h(xVar);
                    xVar.f23679c.add(abstractC2108k);
                }
            }
        }
    }

    @Override // androidx.transition.AbstractC2108k
    public void h0(androidx.transition.AbstractC2108k.e eVar) {
        super.h0(eVar);
        this.f23672s0 |= 8;
        int size = this.f23668o0.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((androidx.transition.AbstractC2108k) this.f23668o0.get(i6)).h0(eVar);
        }
    }

    @Override // androidx.transition.AbstractC2108k
    public void j0(androidx.transition.AbstractC2104g abstractC2104g) {
        super.j0(abstractC2104g);
        this.f23672s0 |= 4;
        if (this.f23668o0 != null) {
            for (int i6 = 0; i6 < this.f23668o0.size(); i6++) {
                ((androidx.transition.AbstractC2108k) this.f23668o0.get(i6)).j0(abstractC2104g);
            }
        }
    }

    @Override // androidx.transition.AbstractC2108k
    void k(androidx.transition.x xVar) {
        super.k(xVar);
        int size = this.f23668o0.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((androidx.transition.AbstractC2108k) this.f23668o0.get(i6)).k(xVar);
        }
    }

    @Override // androidx.transition.AbstractC2108k
    public void k0(androidx.transition.u uVar) {
        super.k0(uVar);
        this.f23672s0 |= 2;
        int size = this.f23668o0.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((androidx.transition.AbstractC2108k) this.f23668o0.get(i6)).k0(uVar);
        }
    }

    @Override // androidx.transition.AbstractC2108k
    public void l(androidx.transition.x xVar) {
        if (M(xVar.f23678b)) {
            for (androidx.transition.AbstractC2108k abstractC2108k : this.f23668o0) {
                if (abstractC2108k.M(xVar.f23678b)) {
                    abstractC2108k.l(xVar);
                    xVar.f23679c.add(abstractC2108k);
                }
            }
        }
    }

    @Override // androidx.transition.AbstractC2108k
    java.lang.String n0(java.lang.String str) {
        java.lang.String strN0 = super.n0(str);
        for (int i6 = 0; i6 < this.f23668o0.size(); i6++) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(strN0);
            sb.append("\n");
            sb.append(((androidx.transition.AbstractC2108k) this.f23668o0.get(i6)).n0(str + "  "));
            strN0 = sb.toString();
        }
        return strN0;
    }

    @Override // androidx.transition.AbstractC2108k
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public androidx.transition.v a(androidx.transition.AbstractC2108k.f fVar) {
        return (androidx.transition.v) super.a(fVar);
    }

    @Override // androidx.transition.AbstractC2108k
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public androidx.transition.AbstractC2108k clone() {
        androidx.transition.v vVar = (androidx.transition.v) super.clone();
        vVar.f23668o0 = new java.util.ArrayList();
        int size = this.f23668o0.size();
        for (int i6 = 0; i6 < size; i6++) {
            vVar.r0(((androidx.transition.AbstractC2108k) this.f23668o0.get(i6)).clone());
        }
        return vVar;
    }

    @Override // androidx.transition.AbstractC2108k
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public androidx.transition.v b(android.view.View view) {
        for (int i6 = 0; i6 < this.f23668o0.size(); i6++) {
            ((androidx.transition.AbstractC2108k) this.f23668o0.get(i6)).b(view);
        }
        return (androidx.transition.v) super.b(view);
    }

    public androidx.transition.v q0(androidx.transition.AbstractC2108k abstractC2108k) {
        r0(abstractC2108k);
        long j6 = this.f23615E;
        if (j6 >= 0) {
            abstractC2108k.f0(j6);
        }
        if ((this.f23672s0 & 1) != 0) {
            abstractC2108k.i0(w());
        }
        if ((this.f23672s0 & 2) != 0) {
            A();
            abstractC2108k.k0(null);
        }
        if ((this.f23672s0 & 4) != 0) {
            abstractC2108k.j0(z());
        }
        if ((this.f23672s0 & 8) != 0) {
            abstractC2108k.h0(v());
        }
        return this;
    }

    @Override // androidx.transition.AbstractC2108k
    void r(android.view.ViewGroup viewGroup, androidx.transition.y yVar, androidx.transition.y yVar2, java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        long jE = E();
        int size = this.f23668o0.size();
        for (int i6 = 0; i6 < size; i6++) {
            androidx.transition.AbstractC2108k abstractC2108k = (androidx.transition.AbstractC2108k) this.f23668o0.get(i6);
            if (jE > 0 && (this.f23669p0 || i6 == 0)) {
                long jE2 = abstractC2108k.E();
                if (jE2 > 0) {
                    abstractC2108k.l0(jE2 + jE);
                } else {
                    abstractC2108k.l0(jE);
                }
            }
            abstractC2108k.r(viewGroup, yVar, yVar2, arrayList, arrayList2);
        }
    }

    public androidx.transition.AbstractC2108k s0(int i6) {
        if (i6 < 0 || i6 >= this.f23668o0.size()) {
            return null;
        }
        return (androidx.transition.AbstractC2108k) this.f23668o0.get(i6);
    }

    public int t0() {
        return this.f23668o0.size();
    }

    @Override // androidx.transition.AbstractC2108k
    /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
    public androidx.transition.v Z(androidx.transition.AbstractC2108k.f fVar) {
        return (androidx.transition.v) super.Z(fVar);
    }

    @Override // androidx.transition.AbstractC2108k
    /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
    public androidx.transition.v a0(android.view.View view) {
        for (int i6 = 0; i6 < this.f23668o0.size(); i6++) {
            ((androidx.transition.AbstractC2108k) this.f23668o0.get(i6)).a0(view);
        }
        return (androidx.transition.v) super.a0(view);
    }

    @Override // androidx.transition.AbstractC2108k
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public androidx.transition.v f0(long j6) {
        java.util.ArrayList arrayList;
        super.f0(j6);
        if (this.f23615E >= 0 && (arrayList = this.f23668o0) != null) {
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                ((androidx.transition.AbstractC2108k) this.f23668o0.get(i6)).f0(j6);
            }
        }
        return this;
    }

    @Override // androidx.transition.AbstractC2108k
    /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
    public androidx.transition.v i0(android.animation.TimeInterpolator timeInterpolator) {
        this.f23672s0 |= 1;
        java.util.ArrayList arrayList = this.f23668o0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                ((androidx.transition.AbstractC2108k) this.f23668o0.get(i6)).i0(timeInterpolator);
            }
        }
        return (androidx.transition.v) super.i0(timeInterpolator);
    }

    public androidx.transition.v y0(int i6) {
        if (i6 == 0) {
            this.f23669p0 = true;
        } else {
            if (i6 != 1) {
                throw new android.util.AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i6);
            }
            this.f23669p0 = false;
        }
        return this;
    }

    @Override // androidx.transition.AbstractC2108k
    /* JADX INFO: renamed from: z0, reason: merged with bridge method [inline-methods] */
    public androidx.transition.v l0(long j6) {
        return (androidx.transition.v) super.l0(j6);
    }
}
