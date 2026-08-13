package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class V6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f32409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f32410b;

    public V6(java.lang.String str, java.lang.String str2) {
        this.f32409a = str;
        this.f32410b = str2;
    }

    public final java.lang.String a() {
        return this.f32409a;
    }

    public final java.lang.String b() {
        return this.f32410b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && com.google.android.gms.internal.ads.V6.class == obj.getClass()) {
            com.google.android.gms.internal.ads.V6 v6 = (com.google.android.gms.internal.ads.V6) obj;
            if (android.text.TextUtils.equals(this.f32409a, v6.f32409a) && android.text.TextUtils.equals(this.f32410b, v6.f32410b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f32409a.hashCode() * 31) + this.f32410b.hashCode();
    }

    public final java.lang.String toString() {
        return "Header[name=" + this.f32409a + ",value=" + this.f32410b + "]";
    }
}
