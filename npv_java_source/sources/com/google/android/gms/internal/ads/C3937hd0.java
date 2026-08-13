package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.hd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3937hd0 implements Q3.AbstractC1464c.a, Q3.AbstractC1464c.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2269Dd0 f36099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5694xd0 f36100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.Object f36101c = new java.lang.Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f36102d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f36103e = false;

    C3937hd0(android.content.Context context, android.os.Looper looper, com.google.android.gms.internal.ads.C5694xd0 c5694xd0) {
        this.f36100b = c5694xd0;
        this.f36099a = new com.google.android.gms.internal.ads.C2269Dd0(context, looper, this, this, 12800000);
    }

    private final void b() {
        synchronized (this.f36101c) {
            try {
                if (this.f36099a.j() || this.f36099a.e()) {
                    this.f36099a.h();
                }
                android.os.Binder.flushPendingCommands();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // Q3.AbstractC1464c.a
    public final void L0(android.os.Bundle bundle) {
        synchronized (this.f36101c) {
            try {
                if (this.f36103e) {
                    return;
                }
                this.f36103e = true;
                try {
                    this.f36099a.j0().f3(new com.google.android.gms.internal.ads.C2195Bd0(this.f36100b.l()));
                } catch (java.lang.Exception unused) {
                } finally {
                    b();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    final void a() {
        synchronized (this.f36101c) {
            try {
                if (!this.f36102d) {
                    this.f36102d = true;
                    this.f36099a.q();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // Q3.AbstractC1464c.b
    public final void q0(N3.C1389b c1389b) {
    }

    @Override // Q3.AbstractC1464c.a
    public final void y0(int i6) {
    }
}
