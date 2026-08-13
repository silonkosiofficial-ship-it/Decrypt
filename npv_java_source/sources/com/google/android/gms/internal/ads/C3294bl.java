package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.bl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3294bl extends com.google.android.gms.internal.ads.AbstractC5281tr {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.Object f34366c = new java.lang.Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3842gl f34367d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f34368e;

    public C3294bl(com.google.android.gms.internal.ads.C3842gl c3842gl) {
        this.f34367d = c3842gl;
    }

    public final void h() {
        p214v3.AbstractC7265q0.k("release: Trying to acquire lock");
        synchronized (this.f34366c) {
            try {
                p214v3.AbstractC7265q0.k("release: Lock acquired");
                if (this.f34368e) {
                    p214v3.AbstractC7265q0.k("release: Lock already released");
                    return;
                }
                this.f34368e = true;
                f(new com.google.android.gms.internal.ads.C3052Yk(this), new com.google.android.gms.internal.ads.C4842pr());
                f(new com.google.android.gms.internal.ads.C3088Zk(this), new com.google.android.gms.internal.ads.C3184al(this));
                p214v3.AbstractC7265q0.k("release: Lock released");
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
