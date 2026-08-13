package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.kH0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4236kH0 implements com.google.android.gms.internal.ads.NH0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.ArrayList f36924a = new java.util.ArrayList(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.HashSet f36925b = new java.util.HashSet(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.VH0 f36926c = new com.google.android.gms.internal.ads.VH0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.SF0 f36927d = new com.google.android.gms.internal.ads.SF0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private android.os.Looper f36928e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.google.android.gms.internal.ads.AbstractC4942qm f36929f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C3244bE0 f36930g;

    @Override // com.google.android.gms.internal.ads.NH0
    public /* synthetic */ com.google.android.gms.internal.ads.AbstractC4942qm R() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.NH0
    public final void a(com.google.android.gms.internal.ads.MH0 mh0) {
        this.f36924a.remove(mh0);
        if (!this.f36924a.isEmpty()) {
            f(mh0);
            return;
        }
        this.f36928e = null;
        this.f36929f = null;
        this.f36930g = null;
        this.f36925b.clear();
        w();
    }

    @Override // com.google.android.gms.internal.ads.NH0
    public abstract /* synthetic */ void c(com.google.android.gms.internal.ads.Q7 q10);

    @Override // com.google.android.gms.internal.ads.NH0
    public final void f(com.google.android.gms.internal.ads.MH0 mh0) {
        boolean z6 = !this.f36925b.isEmpty();
        this.f36925b.remove(mh0);
        if (z6 && this.f36925b.isEmpty()) {
            r();
        }
    }

    @Override // com.google.android.gms.internal.ads.NH0
    public final void g(com.google.android.gms.internal.ads.MH0 mh0, com.google.android.gms.internal.ads.Pv0 pv0, com.google.android.gms.internal.ads.C3244bE0 c3244bE0) {
        android.os.Looper looperMyLooper = android.os.Looper.myLooper();
        android.os.Looper looper = this.f36928e;
        boolean z6 = true;
        if (looper != null && looper != looperMyLooper) {
            z6 = false;
        }
        com.google.android.gms.internal.ads.LC.d(z6);
        this.f36930g = c3244bE0;
        com.google.android.gms.internal.ads.AbstractC4942qm abstractC4942qm = this.f36929f;
        this.f36924a.add(mh0);
        if (this.f36928e == null) {
            this.f36928e = looperMyLooper;
            this.f36925b.add(mh0);
            t(pv0);
        } else if (abstractC4942qm != null) {
            i(mh0);
            mh0.a(this, abstractC4942qm);
        }
    }

    @Override // com.google.android.gms.internal.ads.NH0
    public final void h(com.google.android.gms.internal.ads.WH0 wh0) {
        this.f36926c.i(wh0);
    }

    @Override // com.google.android.gms.internal.ads.NH0
    public final void i(com.google.android.gms.internal.ads.MH0 mh0) {
        this.f36928e.getClass();
        java.util.HashSet hashSet = this.f36925b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(mh0);
        if (zIsEmpty) {
            s();
        }
    }

    @Override // com.google.android.gms.internal.ads.NH0
    public final void j(android.os.Handler handler, com.google.android.gms.internal.ads.TF0 tf0) {
        this.f36927d.b(handler, tf0);
    }

    @Override // com.google.android.gms.internal.ads.NH0
    public final void k(com.google.android.gms.internal.ads.TF0 tf0) {
        this.f36927d.c(tf0);
    }

    @Override // com.google.android.gms.internal.ads.NH0
    public final void l(android.os.Handler handler, com.google.android.gms.internal.ads.WH0 wh0) {
        this.f36926c.b(handler, wh0);
    }

    protected final com.google.android.gms.internal.ads.C3244bE0 m() {
        com.google.android.gms.internal.ads.C3244bE0 c3244bE0 = this.f36930g;
        com.google.android.gms.internal.ads.LC.b(c3244bE0);
        return c3244bE0;
    }

    protected final com.google.android.gms.internal.ads.SF0 n(com.google.android.gms.internal.ads.LH0 lh0) {
        return this.f36927d.a(0, lh0);
    }

    protected final com.google.android.gms.internal.ads.SF0 o(int i6, com.google.android.gms.internal.ads.LH0 lh0) {
        return this.f36927d.a(0, lh0);
    }

    protected final com.google.android.gms.internal.ads.VH0 p(com.google.android.gms.internal.ads.LH0 lh0) {
        return this.f36926c.a(0, lh0);
    }

    protected final com.google.android.gms.internal.ads.VH0 q(int i6, com.google.android.gms.internal.ads.LH0 lh0) {
        return this.f36926c.a(0, lh0);
    }

    protected void r() {
    }

    protected void s() {
    }

    protected abstract void t(com.google.android.gms.internal.ads.Pv0 pv0);

    protected final void u(com.google.android.gms.internal.ads.AbstractC4942qm abstractC4942qm) {
        this.f36929f = abstractC4942qm;
        java.util.ArrayList arrayList = this.f36924a;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((com.google.android.gms.internal.ads.MH0) arrayList.get(i6)).a(this, abstractC4942qm);
        }
    }

    @Override // com.google.android.gms.internal.ads.NH0
    public /* synthetic */ boolean v() {
        return true;
    }

    protected abstract void w();

    protected final boolean x() {
        return !this.f36925b.isEmpty();
    }
}
