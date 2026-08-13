package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.jk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractRunnableC4169jk0 extends com.google.android.gms.internal.ads.AbstractC2246Ck0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final /* synthetic */ int f36725L = 0;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    P4.d f36726J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    java.lang.Object f36727K;

    AbstractRunnableC4169jk0(P4.d dVar, java.lang.Object obj) {
        dVar.getClass();
        this.f36726J = dVar;
        this.f36727K = obj;
    }

    abstract java.lang.Object E(java.lang.Object obj, java.lang.Object obj2);

    abstract void F(java.lang.Object obj);

    @Override // com.google.android.gms.internal.ads.AbstractC3183ak0
    protected final java.lang.String c() {
        java.lang.String str;
        P4.d dVar = this.f36726J;
        java.lang.Object obj = this.f36727K;
        java.lang.String strC = super.c();
        if (dVar != null) {
            str = "inputFuture=[" + dVar.toString() + "], ";
        } else {
            str = "";
        }
        if (obj == null) {
            if (strC != null) {
                return str.concat(strC);
            }
            return null;
        }
        return str + "function=[" + obj.toString() + "]";
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3183ak0
    protected final void d() {
        u(this.f36726J);
        this.f36726J = null;
        this.f36727K = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        P4.d dVar = this.f36726J;
        java.lang.Object obj = this.f36727K;
        if ((isCancelled() | (dVar == null)) || (obj == null)) {
            return;
        }
        this.f36726J = null;
        if (dVar.isCancelled()) {
            v(dVar);
            return;
        }
        try {
            try {
                java.lang.Object objE = E(obj, com.google.android.gms.internal.ads.AbstractC2652Nk0.p(dVar));
                this.f36727K = null;
                F(objE);
            } catch (java.lang.Throwable th) {
                try {
                    com.google.android.gms.internal.ads.AbstractC3953hl0.a(th);
                    h(th);
                } finally {
                    this.f36727K = null;
                }
            }
        } catch (java.lang.Error e6) {
            h(e6);
        } catch (java.util.concurrent.CancellationException unused) {
            cancel(false);
        } catch (java.util.concurrent.ExecutionException e10) {
            h(e10.getCause());
        } catch (java.lang.Exception e11) {
            h(e11);
        }
    }
}
