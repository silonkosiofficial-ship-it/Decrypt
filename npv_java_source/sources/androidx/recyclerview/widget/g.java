package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public class g extends androidx.recyclerview.widget.RecyclerView.z {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected android.graphics.PointF f23418k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final android.util.DisplayMetrics f23419l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f23421n;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected final android.view.animation.LinearInterpolator f23416i = new android.view.animation.LinearInterpolator();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected final android.view.animation.DecelerateInterpolator f23417j = new android.view.animation.DecelerateInterpolator();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f23420m = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected int f23422o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected int f23423p = 0;

    public g(android.content.Context context) {
        this.f23419l = context.getResources().getDisplayMetrics();
    }

    private float A() {
        if (!this.f23420m) {
            this.f23421n = v(this.f23419l);
            this.f23420m = true;
        }
        return this.f23421n;
    }

    private int y(int i6, int i10) {
        int i11 = i6 - i10;
        if (i6 * i11 <= 0) {
            return 0;
        }
        return i11;
    }

    protected int B() {
        android.graphics.PointF pointF = this.f23418k;
        if (pointF != null) {
            float f6 = pointF.y;
            if (f6 != 0.0f) {
                return f6 > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    protected void C(androidx.recyclerview.widget.RecyclerView.z.a aVar) {
        android.graphics.PointF pointFA = a(f());
        if (pointFA == null || (pointFA.x == 0.0f && pointFA.y == 0.0f)) {
            aVar.b(f());
            r();
            return;
        }
        i(pointFA);
        this.f23418k = pointFA;
        this.f23422o = (int) (pointFA.x * 10000.0f);
        this.f23423p = (int) (pointFA.y * 10000.0f);
        aVar.d((int) (this.f23422o * 1.2f), (int) (this.f23423p * 1.2f), (int) (x(10000) * 1.2f), this.f23416i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z
    protected void l(int i6, int i10, androidx.recyclerview.widget.RecyclerView.A a6, androidx.recyclerview.widget.RecyclerView.z.a aVar) {
        if (c() == 0) {
            r();
            return;
        }
        this.f23422o = y(this.f23422o, i6);
        int iY = y(this.f23423p, i10);
        this.f23423p = iY;
        if (this.f23422o == 0 && iY == 0) {
            C(aVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z
    protected void m() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z
    protected void n() {
        this.f23423p = 0;
        this.f23422o = 0;
        this.f23418k = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z
    protected void o(android.view.View view, androidx.recyclerview.widget.RecyclerView.A a6, androidx.recyclerview.widget.RecyclerView.z.a aVar) {
        int iT = t(view, z());
        int iU = u(view, B());
        int iW = w((int) java.lang.Math.sqrt((iT * iT) + (iU * iU)));
        if (iW > 0) {
            aVar.d(-iT, -iU, iW, this.f23417j);
        }
    }

    public int s(int i6, int i10, int i11, int i12, int i13) {
        if (i13 == -1) {
            return i11 - i6;
        }
        if (i13 != 0) {
            if (i13 == 1) {
                return i12 - i10;
            }
            throw new java.lang.IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i14 = i11 - i6;
        if (i14 > 0) {
            return i14;
        }
        int i15 = i12 - i10;
        if (i15 < 0) {
            return i15;
        }
        return 0;
    }

    public int t(android.view.View view, int i6) {
        androidx.recyclerview.widget.RecyclerView.p pVarE = e();
        if (pVarE == null || !pVarE.p()) {
            return 0;
        }
        androidx.recyclerview.widget.RecyclerView.q qVar = (androidx.recyclerview.widget.RecyclerView.q) view.getLayoutParams();
        return s(pVarE.V(view) - ((android.view.ViewGroup.MarginLayoutParams) qVar).leftMargin, pVarE.Y(view) + ((android.view.ViewGroup.MarginLayoutParams) qVar).rightMargin, pVarE.i0(), pVarE.s0() - pVarE.j0(), i6);
    }

    public int u(android.view.View view, int i6) {
        androidx.recyclerview.widget.RecyclerView.p pVarE = e();
        if (pVarE == null || !pVarE.q()) {
            return 0;
        }
        androidx.recyclerview.widget.RecyclerView.q qVar = (androidx.recyclerview.widget.RecyclerView.q) view.getLayoutParams();
        return s(pVarE.Z(view) - ((android.view.ViewGroup.MarginLayoutParams) qVar).topMargin, pVarE.T(view) + ((android.view.ViewGroup.MarginLayoutParams) qVar).bottomMargin, pVarE.k0(), pVarE.b0() - pVarE.h0(), i6);
    }

    protected float v(android.util.DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    protected int w(int i6) {
        return (int) java.lang.Math.ceil(((double) x(i6)) / 0.3356d);
    }

    protected int x(int i6) {
        return (int) java.lang.Math.ceil(java.lang.Math.abs(i6) * A());
    }

    protected int z() {
        android.graphics.PointF pointF = this.f23418k;
        if (pointF != null) {
            float f6 = pointF.x;
            if (f6 != 0.0f) {
                return f6 > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }
}
