package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public class j extends androidx.recyclerview.widget.n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private androidx.recyclerview.widget.i f23428d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private androidx.recyclerview.widget.i f23429e;

    class a extends androidx.recyclerview.widget.g {
        a(android.content.Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.g, androidx.recyclerview.widget.RecyclerView.z
        protected void o(android.view.View view, androidx.recyclerview.widget.RecyclerView.A a6, androidx.recyclerview.widget.RecyclerView.z.a aVar) {
            androidx.recyclerview.widget.j jVar = androidx.recyclerview.widget.j.this;
            int[] iArrC = jVar.c(jVar.f23436a.getLayoutManager(), view);
            int i6 = iArrC[0];
            int i10 = iArrC[1];
            int iW = w(java.lang.Math.max(java.lang.Math.abs(i6), java.lang.Math.abs(i10)));
            if (iW > 0) {
                aVar.d(i6, i10, iW, this.f23417j);
            }
        }

        @Override // androidx.recyclerview.widget.g
        protected float v(android.util.DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.g
        protected int x(int i6) {
            return java.lang.Math.min(100, super.x(i6));
        }
    }

    private int k(android.view.View view, androidx.recyclerview.widget.i iVar) {
        return (iVar.g(view) + (iVar.e(view) / 2)) - (iVar.m() + (iVar.n() / 2));
    }

    private android.view.View l(androidx.recyclerview.widget.RecyclerView.p pVar, androidx.recyclerview.widget.i iVar) {
        int iO = pVar.O();
        android.view.View view = null;
        if (iO == 0) {
            return null;
        }
        int iM = iVar.m() + (iVar.n() / 2);
        int i6 = Integer.MAX_VALUE;
        for (int i10 = 0; i10 < iO; i10++) {
            android.view.View viewN = pVar.N(i10);
            int iAbs = java.lang.Math.abs((iVar.g(viewN) + (iVar.e(viewN) / 2)) - iM);
            if (iAbs < i6) {
                view = viewN;
                i6 = iAbs;
            }
        }
        return view;
    }

    private androidx.recyclerview.widget.i m(androidx.recyclerview.widget.RecyclerView.p pVar) {
        androidx.recyclerview.widget.i iVar = this.f23429e;
        if (iVar == null || iVar.f23425a != pVar) {
            this.f23429e = androidx.recyclerview.widget.i.a(pVar);
        }
        return this.f23429e;
    }

    private androidx.recyclerview.widget.i n(androidx.recyclerview.widget.RecyclerView.p pVar) {
        if (pVar.q()) {
            return o(pVar);
        }
        if (pVar.p()) {
            return m(pVar);
        }
        return null;
    }

    private androidx.recyclerview.widget.i o(androidx.recyclerview.widget.RecyclerView.p pVar) {
        androidx.recyclerview.widget.i iVar = this.f23428d;
        if (iVar == null || iVar.f23425a != pVar) {
            this.f23428d = androidx.recyclerview.widget.i.c(pVar);
        }
        return this.f23428d;
    }

    private boolean p(androidx.recyclerview.widget.RecyclerView.p pVar, int i6, int i10) {
        if (pVar.p()) {
            return i6 > 0;
        }
        return i10 > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean q(androidx.recyclerview.widget.RecyclerView.p pVar) {
        android.graphics.PointF pointFD;
        int iA = pVar.a();
        if (!(pVar instanceof androidx.recyclerview.widget.RecyclerView.z.b) || (pointFD = ((androidx.recyclerview.widget.RecyclerView.z.b) pVar).d(iA - 1)) == null) {
            return false;
        }
        return pointFD.x < 0.0f || pointFD.y < 0.0f;
    }

    @Override // androidx.recyclerview.widget.n
    public int[] c(androidx.recyclerview.widget.RecyclerView.p pVar, android.view.View view) {
        int[] iArr = new int[2];
        if (pVar.p()) {
            iArr[0] = k(view, m(pVar));
        } else {
            iArr[0] = 0;
        }
        if (pVar.q()) {
            iArr[1] = k(view, o(pVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.n
    protected androidx.recyclerview.widget.RecyclerView.z d(androidx.recyclerview.widget.RecyclerView.p pVar) {
        if (pVar instanceof androidx.recyclerview.widget.RecyclerView.z.b) {
            return new androidx.recyclerview.widget.j.a(this.f23436a.getContext());
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.n
    public android.view.View f(androidx.recyclerview.widget.RecyclerView.p pVar) {
        androidx.recyclerview.widget.i iVarM;
        if (pVar.q()) {
            iVarM = o(pVar);
        } else {
            if (!pVar.p()) {
                return null;
            }
            iVarM = m(pVar);
        }
        return l(pVar, iVarM);
    }

    @Override // androidx.recyclerview.widget.n
    public int g(androidx.recyclerview.widget.RecyclerView.p pVar, int i6, int i10) {
        androidx.recyclerview.widget.i iVarN;
        int iA = pVar.a();
        if (iA == 0 || (iVarN = n(pVar)) == null) {
            return -1;
        }
        int iO = pVar.O();
        android.view.View view = null;
        int i11 = Integer.MAX_VALUE;
        int i12 = Integer.MIN_VALUE;
        android.view.View view2 = null;
        for (int i13 = 0; i13 < iO; i13++) {
            android.view.View viewN = pVar.N(i13);
            if (viewN != null) {
                int iK = k(viewN, iVarN);
                if (iK <= 0 && iK > i12) {
                    view2 = viewN;
                    i12 = iK;
                }
                if (iK >= 0 && iK < i11) {
                    view = viewN;
                    i11 = iK;
                }
            }
        }
        boolean zP = p(pVar, i6, i10);
        if (zP && view != null) {
            return pVar.l0(view);
        }
        if (!zP && view2 != null) {
            return pVar.l0(view2);
        }
        if (zP) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int iL0 = pVar.l0(view) + (q(pVar) == zP ? -1 : 1);
        if (iL0 < 0 || iL0 >= iA) {
            return -1;
        }
        return iL0;
    }
}
