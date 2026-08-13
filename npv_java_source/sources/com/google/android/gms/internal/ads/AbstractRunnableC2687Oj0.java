package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Oj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractRunnableC2687Oj0 extends com.google.android.gms.internal.ads.AbstractC2246Ck0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    P4.d f30554J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    java.lang.Class f30555K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    java.lang.Object f30556L;

    AbstractRunnableC2687Oj0(P4.d dVar, java.lang.Class cls, java.lang.Object obj) {
        dVar.getClass();
        this.f30554J = dVar;
        this.f30555K = cls;
        this.f30556L = obj;
    }

    abstract java.lang.Object E(java.lang.Object obj, java.lang.Throwable th);

    abstract void F(java.lang.Object obj);

    @Override // com.google.android.gms.internal.ads.AbstractC3183ak0
    protected final java.lang.String c() {
        java.lang.String str;
        P4.d dVar = this.f30554J;
        java.lang.Class cls = this.f30555K;
        java.lang.Object obj = this.f30556L;
        java.lang.String strC = super.c();
        if (dVar != null) {
            str = "inputFuture=[" + dVar.toString() + "], ";
        } else {
            str = "";
        }
        if (cls == null || obj == null) {
            if (strC != null) {
                return str.concat(strC);
            }
            return null;
        }
        return str + "exceptionType=[" + cls.toString() + "], fallback=[" + obj.toString() + "]";
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3183ak0
    protected final void d() {
        u(this.f30554J);
        this.f30554J = null;
        this.f30555K = null;
        this.f30556L = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object objP;
        P4.d dVar = this.f30554J;
        java.lang.Class cls = this.f30555K;
        java.lang.Object obj = this.f30556L;
        if (((obj == null) || ((dVar == 0) | (cls == null))) || isCancelled()) {
            return;
        }
        this.f30554J = null;
        try {
            th = dVar instanceof com.google.android.gms.internal.ads.AbstractC5160sl0 ? ((com.google.android.gms.internal.ads.AbstractC5160sl0) dVar).a() : null;
            objP = th == null ? com.google.android.gms.internal.ads.AbstractC2652Nk0.p(dVar) : null;
        } catch (java.util.concurrent.ExecutionException e6) {
            java.lang.Throwable cause = e6.getCause();
            if (cause == null) {
                cause = new java.lang.NullPointerException("Future type " + java.lang.String.valueOf(dVar.getClass()) + " threw " + java.lang.String.valueOf(e6.getClass()) + " without a cause");
            }
            th = cause;
        } catch (java.lang.Throwable th) {
            th = th;
        }
        if (th == null) {
            f(objP);
            return;
        }
        if (!cls.isInstance(th)) {
            v(dVar);
            return;
        }
        try {
            java.lang.Object objE = E(obj, th);
            this.f30555K = null;
            this.f30556L = null;
            F(objE);
        } catch (java.lang.Throwable th2) {
            try {
                com.google.android.gms.internal.ads.AbstractC3953hl0.a(th2);
                h(th2);
            } finally {
                this.f30555K = null;
                this.f30556L = null;
            }
        }
    }
}
