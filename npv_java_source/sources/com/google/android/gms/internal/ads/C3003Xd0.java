package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Xd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3003Xd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f33153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f33154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f33155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C3075Zd0 f33156d;

    /* synthetic */ C3003Xd0(com.google.android.gms.internal.ads.C3075Zd0 c3075Zd0, byte[] bArr, com.google.android.gms.internal.ads.AbstractC3039Yd0 abstractC3039Yd0) {
        this.f33156d = c3075Zd0;
        this.f33153a = bArr;
    }

    public final com.google.android.gms.internal.ads.C3003Xd0 a(int i6) {
        this.f33155c = i6;
        return this;
    }

    public final com.google.android.gms.internal.ads.C3003Xd0 b(int i6) {
        this.f33154b = i6;
        return this;
    }

    public final synchronized void c() {
        try {
            com.google.android.gms.internal.ads.C3075Zd0 c3075Zd0 = this.f33156d;
            if (c3075Zd0.f33633b) {
                c3075Zd0.f33632a.o0(this.f33153a);
                this.f33156d.f33632a.K(this.f33154b);
                this.f33156d.f33632a.D(this.f33155c);
                this.f33156d.f33632a.B0(null);
                this.f33156d.f33632a.e();
            }
        } catch (android.os.RemoteException e6) {
        }
    }
}
