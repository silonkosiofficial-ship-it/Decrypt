package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.sd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5143sd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f38779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f38780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C5363ud f38781c;

    /* synthetic */ C5143sd(com.google.android.gms.internal.ads.C5363ud c5363ud, byte[] bArr, com.google.android.gms.internal.ads.AbstractC5253td abstractC5253td) {
        this.f38781c = c5363ud;
        this.f38779a = bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void d() {
        try {
            com.google.android.gms.internal.ads.C5363ud c5363ud = this.f38781c;
            if (c5363ud.f39189b) {
                c5363ud.f39188a.o0(this.f38779a);
                this.f38781c.f39188a.K(0);
                this.f38781c.f39188a.D(this.f38780b);
                this.f38781c.f39188a.B0(null);
                this.f38781c.f39188a.e();
            }
        } catch (android.os.RemoteException e6) {
            p224w3.p.c("Clearcut log failed", e6);
        }
    }

    public final com.google.android.gms.internal.ads.C5143sd a(int i6) {
        this.f38780b = i6;
        return this;
    }

    public final synchronized void c() {
        this.f38781c.f39190c.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.rd
            @Override // java.lang.Runnable
            public final void run() {
                this.f38517C.d();
            }
        });
    }
}
