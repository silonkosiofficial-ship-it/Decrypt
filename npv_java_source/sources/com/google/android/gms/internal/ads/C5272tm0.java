package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.tm0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5272tm0 extends com.google.android.gms.internal.ads.AbstractC3406cm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f39024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f39025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f39026c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f39027d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5052rm0 f39028e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4943qm0 f39029f;

    /* synthetic */ C5272tm0(int i6, int i10, int i11, int i12, com.google.android.gms.internal.ads.C5052rm0 c5052rm0, com.google.android.gms.internal.ads.C4943qm0 c4943qm0, com.google.android.gms.internal.ads.AbstractC5162sm0 abstractC5162sm0) {
        this.f39024a = i6;
        this.f39025b = i10;
        this.f39026c = i11;
        this.f39027d = i12;
        this.f39028e = c5052rm0;
        this.f39029f = c4943qm0;
    }

    public static com.google.android.gms.internal.ads.C4833pm0 f() {
        return new com.google.android.gms.internal.ads.C4833pm0(null);
    }

    @Override // com.google.android.gms.internal.ads.Sl0
    public final boolean a() {
        return this.f39028e != com.google.android.gms.internal.ads.C5052rm0.f38555d;
    }

    public final int b() {
        return this.f39024a;
    }

    public final int c() {
        return this.f39025b;
    }

    public final int d() {
        return this.f39026c;
    }

    public final int e() {
        return this.f39027d;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.ads.C5272tm0)) {
            return false;
        }
        com.google.android.gms.internal.ads.C5272tm0 c5272tm0 = (com.google.android.gms.internal.ads.C5272tm0) obj;
        return c5272tm0.f39024a == this.f39024a && c5272tm0.f39025b == this.f39025b && c5272tm0.f39026c == this.f39026c && c5272tm0.f39027d == this.f39027d && c5272tm0.f39028e == this.f39028e && c5272tm0.f39029f == this.f39029f;
    }

    public final com.google.android.gms.internal.ads.C4943qm0 g() {
        return this.f39029f;
    }

    public final com.google.android.gms.internal.ads.C5052rm0 h() {
        return this.f39028e;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(com.google.android.gms.internal.ads.C5272tm0.class, java.lang.Integer.valueOf(this.f39024a), java.lang.Integer.valueOf(this.f39025b), java.lang.Integer.valueOf(this.f39026c), java.lang.Integer.valueOf(this.f39027d), this.f39028e, this.f39029f);
    }

    public final java.lang.String toString() {
        com.google.android.gms.internal.ads.C4943qm0 c4943qm0 = this.f39029f;
        return "AesCtrHmacAead Parameters (variant: " + java.lang.String.valueOf(this.f39028e) + ", hashType: " + java.lang.String.valueOf(c4943qm0) + ", " + this.f39026c + "-byte IV, and " + this.f39027d + "-byte tags, and " + this.f39024a + "-byte AES key, and " + this.f39025b + "-byte HMAC key)";
    }
}
