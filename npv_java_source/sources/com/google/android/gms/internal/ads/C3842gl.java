package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.gl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3842gl extends com.google.android.gms.internal.ads.AbstractC5281tr {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p214v3.F f35671d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.Object f35670c = new java.lang.Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f35672e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f35673f = 0;

    public C3842gl(p214v3.F f6) {
        this.f35671d = f6;
    }

    public final com.google.android.gms.internal.ads.C3294bl g() {
        com.google.android.gms.internal.ads.C3294bl c3294bl = new com.google.android.gms.internal.ads.C3294bl(this);
        p214v3.AbstractC7265q0.k("createNewReference: Trying to acquire lock");
        synchronized (this.f35670c) {
            p214v3.AbstractC7265q0.k("createNewReference: Lock acquired");
            f(new com.google.android.gms.internal.ads.C3403cl(this, c3294bl), new com.google.android.gms.internal.ads.C3513dl(this, c3294bl));
            Q3.AbstractC1477p.o(this.f35673f >= 0);
            this.f35673f++;
        }
        p214v3.AbstractC7265q0.k("createNewReference: Lock released");
        return c3294bl;
    }

    public final void h() {
        p214v3.AbstractC7265q0.k("markAsDestroyable: Trying to acquire lock");
        synchronized (this.f35670c) {
            p214v3.AbstractC7265q0.k("markAsDestroyable: Lock acquired");
            Q3.AbstractC1477p.o(this.f35673f >= 0);
            p214v3.AbstractC7265q0.k("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.f35672e = true;
            i();
        }
        p214v3.AbstractC7265q0.k("markAsDestroyable: Lock released");
    }

    protected final void i() {
        p214v3.AbstractC7265q0.k("maybeDestroy: Trying to acquire lock");
        synchronized (this.f35670c) {
            try {
                p214v3.AbstractC7265q0.k("maybeDestroy: Lock acquired");
                Q3.AbstractC1477p.o(this.f35673f >= 0);
                if (this.f35672e && this.f35673f == 0) {
                    p214v3.AbstractC7265q0.k("No reference is left (including root). Cleaning up engine.");
                    f(new com.google.android.gms.internal.ads.C3732fl(this), new com.google.android.gms.internal.ads.C4842pr());
                } else {
                    p214v3.AbstractC7265q0.k("There are still references to the engine. Not destroying.");
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        p214v3.AbstractC7265q0.k("maybeDestroy: Lock released");
    }

    protected final void j() {
        p214v3.AbstractC7265q0.k("releaseOneReference: Trying to acquire lock");
        synchronized (this.f35670c) {
            p214v3.AbstractC7265q0.k("releaseOneReference: Lock acquired");
            Q3.AbstractC1477p.o(this.f35673f > 0);
            p214v3.AbstractC7265q0.k("Releasing 1 reference for JS Engine");
            this.f35673f--;
            i();
        }
        p214v3.AbstractC7265q0.k("releaseOneReference: Lock released");
    }
}
