package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.mf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4489mf0 extends com.google.android.gms.internal.ads.AbstractC2716Pf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f37391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f37392b;

    /* synthetic */ C4489mf0(java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.AbstractC4379lf0 abstractC4379lf0) {
        this.f37391a = str;
        this.f37392b = str2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2716Pf0
    public final java.lang.String a() {
        return this.f37392b;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2716Pf0
    public final java.lang.String b() {
        return this.f37391a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.ads.AbstractC2716Pf0) {
            com.google.android.gms.internal.ads.AbstractC2716Pf0 abstractC2716Pf0 = (com.google.android.gms.internal.ads.AbstractC2716Pf0) obj;
            java.lang.String str = this.f37391a;
            if (str != null ? str.equals(abstractC2716Pf0.b()) : abstractC2716Pf0.b() == null) {
                java.lang.String str2 = this.f37392b;
                java.lang.String strA = abstractC2716Pf0.a();
                if (str2 != null ? str2.equals(strA) : strA == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.String str = this.f37391a;
        int iHashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.f37392b;
        return ((iHashCode ^ 1000003) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "OverlayDisplayUpdateRequest{sessionToken=" + this.f37391a + ", appId=" + this.f37392b + "}";
    }
}
