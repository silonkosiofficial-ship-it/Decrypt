package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.nr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4623nr0 extends com.google.android.gms.internal.ads.AbstractC4953qr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f37684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f37685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4403lr0 f37686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4293kr0 f37687d;

    /* synthetic */ C4623nr0(int i6, int i10, com.google.android.gms.internal.ads.C4403lr0 c4403lr0, com.google.android.gms.internal.ads.C4293kr0 c4293kr0, com.google.android.gms.internal.ads.AbstractC4513mr0 abstractC4513mr0) {
        this.f37684a = i6;
        this.f37685b = i10;
        this.f37686c = c4403lr0;
        this.f37687d = c4293kr0;
    }

    public static com.google.android.gms.internal.ads.C4183jr0 e() {
        return new com.google.android.gms.internal.ads.C4183jr0(null);
    }

    @Override // com.google.android.gms.internal.ads.Sl0
    public final boolean a() {
        return this.f37686c != com.google.android.gms.internal.ads.C4403lr0.f37244e;
    }

    public final int b() {
        return this.f37685b;
    }

    public final int c() {
        return this.f37684a;
    }

    public final int d() {
        com.google.android.gms.internal.ads.C4403lr0 c4403lr0 = this.f37686c;
        if (c4403lr0 == com.google.android.gms.internal.ads.C4403lr0.f37244e) {
            return this.f37685b;
        }
        if (c4403lr0 == com.google.android.gms.internal.ads.C4403lr0.f37241b || c4403lr0 == com.google.android.gms.internal.ads.C4403lr0.f37242c || c4403lr0 == com.google.android.gms.internal.ads.C4403lr0.f37243d) {
            return this.f37685b + 5;
        }
        throw new java.lang.IllegalStateException("Unknown variant");
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.ads.C4623nr0)) {
            return false;
        }
        com.google.android.gms.internal.ads.C4623nr0 c4623nr0 = (com.google.android.gms.internal.ads.C4623nr0) obj;
        return c4623nr0.f37684a == this.f37684a && c4623nr0.d() == d() && c4623nr0.f37686c == this.f37686c && c4623nr0.f37687d == this.f37687d;
    }

    public final com.google.android.gms.internal.ads.C4293kr0 f() {
        return this.f37687d;
    }

    public final com.google.android.gms.internal.ads.C4403lr0 g() {
        return this.f37686c;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(com.google.android.gms.internal.ads.C4623nr0.class, java.lang.Integer.valueOf(this.f37684a), java.lang.Integer.valueOf(this.f37685b), this.f37686c, this.f37687d);
    }

    public final java.lang.String toString() {
        com.google.android.gms.internal.ads.C4293kr0 c4293kr0 = this.f37687d;
        return "HMAC Parameters (variant: " + java.lang.String.valueOf(this.f37686c) + ", hashType: " + java.lang.String.valueOf(c4293kr0) + ", " + this.f37685b + "-byte tags, and " + this.f37684a + "-byte key)";
    }
}
