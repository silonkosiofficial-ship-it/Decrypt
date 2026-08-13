package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Dm0 extends com.google.android.gms.internal.ads.AbstractC3406cm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f26768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f26769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f26770c = 16;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Bm0 f26771d;

    /* synthetic */ Dm0(int i6, int i10, int i11, com.google.android.gms.internal.ads.Bm0 bm0, com.google.android.gms.internal.ads.Cm0 cm0) {
        this.f26768a = i6;
        this.f26769b = i10;
        this.f26771d = bm0;
    }

    public static com.google.android.gms.internal.ads.Am0 d() {
        return new com.google.android.gms.internal.ads.Am0(null);
    }

    @Override // com.google.android.gms.internal.ads.Sl0
    public final boolean a() {
        return this.f26771d != com.google.android.gms.internal.ads.Bm0.f26017d;
    }

    public final int b() {
        return this.f26769b;
    }

    public final int c() {
        return this.f26768a;
    }

    public final com.google.android.gms.internal.ads.Bm0 e() {
        return this.f26771d;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.ads.Dm0)) {
            return false;
        }
        com.google.android.gms.internal.ads.Dm0 dm0 = (com.google.android.gms.internal.ads.Dm0) obj;
        return dm0.f26768a == this.f26768a && dm0.f26769b == this.f26769b && dm0.f26771d == this.f26771d;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(com.google.android.gms.internal.ads.Dm0.class, java.lang.Integer.valueOf(this.f26768a), java.lang.Integer.valueOf(this.f26769b), 16, this.f26771d);
    }

    public final java.lang.String toString() {
        return "AesEax Parameters (variant: " + java.lang.String.valueOf(this.f26771d) + ", " + this.f26769b + "-byte IV, 16-byte tag, and " + this.f26768a + "-byte key)";
    }
}
