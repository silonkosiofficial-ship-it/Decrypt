package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.La0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2559La0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f29521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.concurrent.Executor f29522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Zk0 f29523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p224w3.v f29524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2189Ba0 f29525e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.T90 f29526f;

    C2559La0(android.content.Context context, java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.Zk0 zk0, p224w3.v vVar, com.google.android.gms.internal.ads.C2189Ba0 c2189Ba0, com.google.android.gms.internal.ads.T90 t90) {
        this.f29521a = context;
        this.f29522b = executor;
        this.f29523c = zk0;
        this.f29524d = vVar;
        this.f29525e = c2189Ba0;
        this.f29526f = t90;
    }

    final /* synthetic */ p224w3.u a(java.lang.String str) {
        return this.f29524d.o(str);
    }

    final P4.d c(final java.lang.String str, p224w3.w wVar) {
        if (wVar == null) {
            return this.f29523c.H0(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.Ha0
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    return this.f28072a.a(str);
                }
            });
        }
        return new com.google.android.gms.internal.ads.C2152Aa0(wVar.b(), this.f29524d, this.f29523c, this.f29525e).d(str);
    }

    public final void d(final java.lang.String str, final p224w3.w wVar, com.google.android.gms.internal.ads.Q90 q90) {
        if (!com.google.android.gms.internal.ads.T90.a() || !((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC5479vg.f39433d.e()).booleanValue()) {
            this.f29522b.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.Ia0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f28477C.c(str, wVar);
                }
            });
            return;
        }
        com.google.android.gms.internal.ads.E90 e90A = com.google.android.gms.internal.ads.D90.a(this.f29521a, 14);
        e90A.h();
        com.google.android.gms.internal.ads.AbstractC2652Nk0.r(c(str, wVar), new com.google.android.gms.internal.ads.C2485Ja0(this, e90A, q90), this.f29522b);
    }

    public final void e(java.util.List list, p224w3.w wVar) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            d((java.lang.String) it.next(), wVar, null);
        }
    }
}
