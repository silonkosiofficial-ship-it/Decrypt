package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class VS extends com.google.android.gms.internal.ads.AbstractC3155aT {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f32501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f32502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final android.graphics.drawable.Drawable f32503c;

    VS(java.lang.String str, java.lang.String str2, android.graphics.drawable.Drawable drawable) {
        this.f32501a = str;
        if (str2 == null) {
            throw new java.lang.NullPointerException("Null imageUrl");
        }
        this.f32502b = str2;
        this.f32503c = drawable;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3155aT
    final android.graphics.drawable.Drawable a() {
        return this.f32503c;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3155aT
    final java.lang.String b() {
        return this.f32501a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3155aT
    final java.lang.String c() {
        return this.f32502b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.ads.AbstractC3155aT) {
            com.google.android.gms.internal.ads.AbstractC3155aT abstractC3155aT = (com.google.android.gms.internal.ads.AbstractC3155aT) obj;
            java.lang.String str = this.f32501a;
            if (str != null ? str.equals(abstractC3155aT.b()) : abstractC3155aT.b() == null) {
                if (this.f32502b.equals(abstractC3155aT.c())) {
                    android.graphics.drawable.Drawable drawable = this.f32503c;
                    android.graphics.drawable.Drawable drawableA = abstractC3155aT.a();
                    if (drawable != null ? drawable.equals(drawableA) : drawableA == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.String str = this.f32501a;
        int iHashCode = (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f32502b.hashCode();
        android.graphics.drawable.Drawable drawable = this.f32503c;
        return (iHashCode * 1000003) ^ (drawable != null ? drawable.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "OfflineAdAssets{advertiserName=" + this.f32501a + ", imageUrl=" + this.f32502b + ", icon=" + java.lang.String.valueOf(this.f32503c) + "}";
    }
}
