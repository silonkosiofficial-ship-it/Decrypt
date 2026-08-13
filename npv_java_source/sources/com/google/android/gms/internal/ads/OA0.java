package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class OA0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f30458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.google.android.gms.internal.ads.C5103sB0 f30459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f30460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f30461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f30462e;

    public OA0(com.google.android.gms.internal.ads.C5103sB0 c5103sB0) {
        this.f30459b = c5103sB0;
    }

    public final void a(int i6) {
        this.f30458a = 1 == ((this.f30458a ? 1 : 0) | i6);
        this.f30460c += i6;
    }

    public final void b(com.google.android.gms.internal.ads.C5103sB0 c5103sB0) {
        this.f30458a |= this.f30459b != c5103sB0;
        this.f30459b = c5103sB0;
    }

    public final void c(int i6) {
        if (this.f30461d && this.f30462e != 5) {
            com.google.android.gms.internal.ads.LC.d(i6 == 5);
            return;
        }
        this.f30458a = true;
        this.f30461d = true;
        this.f30462e = i6;
    }
}
