package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.cf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3392cf0 extends com.google.android.gms.internal.ads.AbstractC4709of0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f34551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f34552b;

    /* synthetic */ C3392cf0(java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.AbstractC3283bf0 abstractC3283bf0) {
        this.f34551a = str;
        this.f34552b = str2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4709of0
    public final java.lang.String a() {
        return this.f34552b;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4709of0
    public final java.lang.String b() {
        return this.f34551a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.ads.AbstractC4709of0) {
            com.google.android.gms.internal.ads.AbstractC4709of0 abstractC4709of0 = (com.google.android.gms.internal.ads.AbstractC4709of0) obj;
            java.lang.String str = this.f34551a;
            if (str != null ? str.equals(abstractC4709of0.b()) : abstractC4709of0.b() == null) {
                java.lang.String str2 = this.f34552b;
                java.lang.String strA = abstractC4709of0.a();
                if (str2 != null ? str2.equals(strA) : strA == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.String str = this.f34551a;
        int iHashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.f34552b;
        return ((iHashCode ^ 1000003) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "OverlayDisplayDismissRequest{sessionToken=" + this.f34551a + ", appId=" + this.f34552b + "}";
    }
}
