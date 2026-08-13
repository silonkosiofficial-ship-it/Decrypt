package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.nH0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4566nH0 implements com.google.android.gms.internal.ads.EI0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.internal.ads.EI0 f37554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f37555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C4676oH0 f37556c;

    public C4566nH0(com.google.android.gms.internal.ads.C4676oH0 c4676oH0, com.google.android.gms.internal.ads.EI0 ei0) {
        this.f37556c = c4676oH0;
        this.f37554a = ei0;
    }

    @Override // com.google.android.gms.internal.ads.EI0
    public final int a(long j6) {
        if (this.f37556c.n()) {
            return -3;
        }
        return this.f37554a.a(j6);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003b  */
    @Override // com.google.android.gms.internal.ads.EI0
    public final int b(com.google.android.gms.internal.ads.UA0 ua0, com.google.android.gms.internal.ads.C5518vz0 c5518vz0, int i6) {
        com.google.android.gms.internal.ads.C4676oH0 c4676oH0 = this.f37556c;
        if (c4676oH0.n()) {
            return -3;
        }
        if (this.f37555b) {
            c5518vz0.c(4);
            return -4;
        }
        long jB = c4676oH0.b();
        int iB = this.f37554a.b(ua0, c5518vz0, i6);
        if (iB != -5) {
            long j6 = this.f37556c.f37761G;
            if (j6 == Long.MIN_VALUE || ((iB != -4 || c5518vz0.f39488f < j6) && !(iB == -3 && jB == Long.MIN_VALUE && !c5518vz0.f39487e))) {
                return iB;
            }
            c5518vz0.b();
            c5518vz0.c(4);
            this.f37555b = true;
            return -4;
        }
        com.google.android.gms.internal.ads.D d6 = ua0.f32158a;
        d6.getClass();
        int i10 = d6.f26554G;
        if (i10 != 0) {
            int i11 = this.f37556c.f37761G == Long.MIN_VALUE ? d6.f26555H : 0;
            com.google.android.gms.internal.ads.C4682oK0 c4682oK0B = d6.b();
            c4682oK0B.g(i10);
            c4682oK0B.h(i11);
            ua0.f32158a = c4682oK0B.H();
        } else if (d6.f26555H != 0) {
            i10 = 0;
            if (this.f37556c.f37761G == Long.MIN_VALUE) {
            }
            com.google.android.gms.internal.ads.C4682oK0 c4682oK0B2 = d6.b();
            c4682oK0B2.g(i10);
            c4682oK0B2.h(i11);
            ua0.f32158a = c4682oK0B2.H();
        }
        return -5;
    }

    public final void c() {
        this.f37555b = false;
    }

    @Override // com.google.android.gms.internal.ads.EI0
    public final boolean d() {
        return !this.f37556c.n() && this.f37554a.d();
    }

    @Override // com.google.android.gms.internal.ads.EI0
    public final void f() {
        this.f37554a.f();
    }
}
