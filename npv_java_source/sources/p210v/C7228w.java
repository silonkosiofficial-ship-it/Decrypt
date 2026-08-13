package p210v;

/* JADX INFO: renamed from: v.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C7228w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f55727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f55728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f55729c = Y0.t.f16230b.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private android.widget.EdgeEffect f55730d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private android.widget.EdgeEffect f55731e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private android.widget.EdgeEffect f55732f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private android.widget.EdgeEffect f55733g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private android.widget.EdgeEffect f55734h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private android.widget.EdgeEffect f55735i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private android.widget.EdgeEffect f55736j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private android.widget.EdgeEffect f55737k;

    public C7228w(android.content.Context context, int i6) {
        this.f55727a = context;
        this.f55728b = i6;
    }

    private final android.widget.EdgeEffect e() {
        android.widget.EdgeEffect edgeEffectA = p210v.C7227v.f55726a.a(this.f55727a);
        edgeEffectA.setColor(this.f55728b);
        if (!Y0.t.e(this.f55729c, Y0.t.f16230b.a())) {
            edgeEffectA.setSize(Y0.t.g(this.f55729c), Y0.t.f(this.f55729c));
        }
        return edgeEffectA;
    }

    private final boolean n(android.widget.EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    private final boolean x(android.widget.EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !(p210v.C7227v.f55726a.b(edgeEffect) == 0.0f);
    }

    public final boolean A() {
        return x(this.f55730d);
    }

    public final void B(long j6) {
        this.f55729c = j6;
        android.widget.EdgeEffect edgeEffect = this.f55730d;
        if (edgeEffect != null) {
            edgeEffect.setSize(Y0.t.g(j6), Y0.t.f(j6));
        }
        android.widget.EdgeEffect edgeEffect2 = this.f55731e;
        if (edgeEffect2 != null) {
            edgeEffect2.setSize(Y0.t.g(j6), Y0.t.f(j6));
        }
        android.widget.EdgeEffect edgeEffect3 = this.f55732f;
        if (edgeEffect3 != null) {
            edgeEffect3.setSize(Y0.t.f(j6), Y0.t.g(j6));
        }
        android.widget.EdgeEffect edgeEffect4 = this.f55733g;
        if (edgeEffect4 != null) {
            edgeEffect4.setSize(Y0.t.f(j6), Y0.t.g(j6));
        }
        android.widget.EdgeEffect edgeEffect5 = this.f55734h;
        if (edgeEffect5 != null) {
            edgeEffect5.setSize(Y0.t.g(j6), Y0.t.f(j6));
        }
        android.widget.EdgeEffect edgeEffect6 = this.f55735i;
        if (edgeEffect6 != null) {
            edgeEffect6.setSize(Y0.t.g(j6), Y0.t.f(j6));
        }
        android.widget.EdgeEffect edgeEffect7 = this.f55736j;
        if (edgeEffect7 != null) {
            edgeEffect7.setSize(Y0.t.f(j6), Y0.t.g(j6));
        }
        android.widget.EdgeEffect edgeEffect8 = this.f55737k;
        if (edgeEffect8 != null) {
            edgeEffect8.setSize(Y0.t.f(j6), Y0.t.g(j6));
        }
    }

    public final android.widget.EdgeEffect f() {
        android.widget.EdgeEffect edgeEffect = this.f55731e;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        android.widget.EdgeEffect edgeEffectE = e();
        this.f55731e = edgeEffectE;
        return edgeEffectE;
    }

    public final android.widget.EdgeEffect g() {
        android.widget.EdgeEffect edgeEffect = this.f55735i;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        android.widget.EdgeEffect edgeEffectE = e();
        this.f55735i = edgeEffectE;
        return edgeEffectE;
    }

    public final android.widget.EdgeEffect h() {
        android.widget.EdgeEffect edgeEffect = this.f55732f;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        android.widget.EdgeEffect edgeEffectE = e();
        this.f55732f = edgeEffectE;
        return edgeEffectE;
    }

    public final android.widget.EdgeEffect i() {
        android.widget.EdgeEffect edgeEffect = this.f55736j;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        android.widget.EdgeEffect edgeEffectE = e();
        this.f55736j = edgeEffectE;
        return edgeEffectE;
    }

    public final android.widget.EdgeEffect j() {
        android.widget.EdgeEffect edgeEffect = this.f55733g;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        android.widget.EdgeEffect edgeEffectE = e();
        this.f55733g = edgeEffectE;
        return edgeEffectE;
    }

    public final android.widget.EdgeEffect k() {
        android.widget.EdgeEffect edgeEffect = this.f55737k;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        android.widget.EdgeEffect edgeEffectE = e();
        this.f55737k = edgeEffectE;
        return edgeEffectE;
    }

    public final android.widget.EdgeEffect l() {
        android.widget.EdgeEffect edgeEffect = this.f55730d;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        android.widget.EdgeEffect edgeEffectE = e();
        this.f55730d = edgeEffectE;
        return edgeEffectE;
    }

    public final android.widget.EdgeEffect m() {
        android.widget.EdgeEffect edgeEffect = this.f55734h;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        android.widget.EdgeEffect edgeEffectE = e();
        this.f55734h = edgeEffectE;
        return edgeEffectE;
    }

    public final boolean o() {
        return n(this.f55731e);
    }

    public final boolean p() {
        return x(this.f55735i);
    }

    public final boolean q() {
        return x(this.f55731e);
    }

    public final boolean r() {
        return n(this.f55732f);
    }

    public final boolean s() {
        return x(this.f55736j);
    }

    public final boolean t() {
        return x(this.f55732f);
    }

    public final boolean u() {
        return n(this.f55733g);
    }

    public final boolean v() {
        return x(this.f55737k);
    }

    public final boolean w() {
        return x(this.f55733g);
    }

    public final boolean y() {
        return n(this.f55730d);
    }

    public final boolean z() {
        return x(this.f55734h);
    }
}
