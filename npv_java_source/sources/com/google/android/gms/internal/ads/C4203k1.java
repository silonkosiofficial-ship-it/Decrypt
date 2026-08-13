package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.k1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4203k1 implements com.google.android.gms.internal.ads.T0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f36883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C4533n1 f36884b;

    public C4203k1(com.google.android.gms.internal.ads.C4533n1 c4533n1, long j6) {
        this.f36884b = c4533n1;
        this.f36883a = j6;
    }

    @Override // com.google.android.gms.internal.ads.T0
    public final long a() {
        return this.f36883a;
    }

    @Override // com.google.android.gms.internal.ads.T0
    public final com.google.android.gms.internal.ads.R0 b(long j6) {
        com.google.android.gms.internal.ads.R0 r0A = this.f36884b.f37469i[0].a(j6);
        int i6 = 1;
        while (true) {
            com.google.android.gms.internal.ads.C4533n1 c4533n1 = this.f36884b;
            if (i6 >= c4533n1.f37469i.length) {
                return r0A;
            }
            com.google.android.gms.internal.ads.R0 r0A2 = c4533n1.f37469i[i6].a(j6);
            if (r0A2.f31105a.f32079b < r0A.f31105a.f32079b) {
                r0A = r0A2;
            }
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.ads.T0
    public final boolean g() {
        return true;
    }
}
