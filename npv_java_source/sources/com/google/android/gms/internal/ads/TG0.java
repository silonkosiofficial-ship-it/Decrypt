package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class TG0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f31912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f31913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f31914c;

    public TG0(java.lang.String str, boolean z6, boolean z10) {
        this.f31912a = str;
        this.f31913b = z6;
        this.f31914c = z10;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == com.google.android.gms.internal.ads.TG0.class) {
            com.google.android.gms.internal.ads.TG0 tg0 = (com.google.android.gms.internal.ads.TG0) obj;
            if (android.text.TextUtils.equals(this.f31912a, tg0.f31912a) && this.f31913b == tg0.f31913b && this.f31914c == tg0.f31914c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f31912a.hashCode() + 31) * 31) + (true != this.f31913b ? 1237 : 1231)) * 31) + (true != this.f31914c ? 1237 : 1231);
    }
}
