package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.qn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4945qn0 extends com.google.android.gms.internal.ads.AbstractC3406cm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f38336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4835pn0 f38337b;

    private C4945qn0(java.lang.String str, com.google.android.gms.internal.ads.C4835pn0 c4835pn0) {
        this.f38336a = str;
        this.f38337b = c4835pn0;
    }

    public static com.google.android.gms.internal.ads.C4945qn0 c(java.lang.String str, com.google.android.gms.internal.ads.C4835pn0 c4835pn0) {
        return new com.google.android.gms.internal.ads.C4945qn0(str, c4835pn0);
    }

    @Override // com.google.android.gms.internal.ads.Sl0
    public final boolean a() {
        return this.f38337b != com.google.android.gms.internal.ads.C4835pn0.f38076c;
    }

    public final com.google.android.gms.internal.ads.C4835pn0 b() {
        return this.f38337b;
    }

    public final java.lang.String d() {
        return this.f38336a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.ads.C4945qn0)) {
            return false;
        }
        com.google.android.gms.internal.ads.C4945qn0 c4945qn0 = (com.google.android.gms.internal.ads.C4945qn0) obj;
        return c4945qn0.f38336a.equals(this.f38336a) && c4945qn0.f38337b.equals(this.f38337b);
    }

    public final int hashCode() {
        return j$.util.Objects.hash(com.google.android.gms.internal.ads.C4945qn0.class, this.f38336a, this.f38337b);
    }

    public final java.lang.String toString() {
        return "LegacyKmsAead Parameters (keyUri: " + this.f38336a + ", variant: " + this.f38337b.toString() + ")";
    }
}
