package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ug0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5370ug0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f39204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5260tg0 f39205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C5260tg0 f39206c;

    /* synthetic */ C5370ug0(java.lang.String str, com.google.android.gms.internal.ads.AbstractC5480vg0 abstractC5480vg0) {
        com.google.android.gms.internal.ads.C5260tg0 c5260tg0 = new com.google.android.gms.internal.ads.C5260tg0();
        this.f39205b = c5260tg0;
        this.f39206c = c5260tg0;
        str.getClass();
        this.f39204a = str;
    }

    public final com.google.android.gms.internal.ads.C5370ug0 a(java.lang.Object obj) {
        com.google.android.gms.internal.ads.C5260tg0 c5260tg0 = new com.google.android.gms.internal.ads.C5260tg0();
        this.f39206c.f39008b = c5260tg0;
        this.f39206c = c5260tg0;
        c5260tg0.f39007a = obj;
        return this;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(32);
        sb.append(this.f39204a);
        sb.append('{');
        com.google.android.gms.internal.ads.C5260tg0 c5260tg0 = this.f39205b.f39008b;
        java.lang.String str = "";
        while (c5260tg0 != null) {
            java.lang.Object obj = c5260tg0.f39007a;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                java.lang.String strDeepToString = java.util.Arrays.deepToString(new java.lang.Object[]{obj});
                sb.append((java.lang.CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
            }
            c5260tg0 = c5260tg0.f39008b;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
