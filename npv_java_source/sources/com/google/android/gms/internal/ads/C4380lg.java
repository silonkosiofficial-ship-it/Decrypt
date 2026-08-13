package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.lg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C4380lg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f37195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.Object f37196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f37197c;

    protected C4380lg(java.lang.String str, java.lang.Object obj, int i6) {
        this.f37195a = str;
        this.f37196b = obj;
        this.f37197c = i6;
    }

    public static com.google.android.gms.internal.ads.C4380lg a(java.lang.String str, double d6) {
        return new com.google.android.gms.internal.ads.C4380lg(str, java.lang.Double.valueOf(d6), 3);
    }

    public static com.google.android.gms.internal.ads.C4380lg b(java.lang.String str, long j6) {
        return new com.google.android.gms.internal.ads.C4380lg(str, java.lang.Long.valueOf(j6), 2);
    }

    public static com.google.android.gms.internal.ads.C4380lg c(java.lang.String str, java.lang.String str2) {
        return new com.google.android.gms.internal.ads.C4380lg("gad:dynamite_module:experiment_id", "", 4);
    }

    public static com.google.android.gms.internal.ads.C4380lg d(java.lang.String str, boolean z6) {
        return new com.google.android.gms.internal.ads.C4380lg(str, java.lang.Boolean.valueOf(z6), 1);
    }

    public final java.lang.Object e() {
        com.google.android.gms.internal.ads.InterfaceC2828Sg interfaceC2828SgA = com.google.android.gms.internal.ads.AbstractC2900Ug.a();
        if (interfaceC2828SgA == null) {
            com.google.android.gms.internal.ads.AbstractC2900Ug.b();
            return this.f37196b;
        }
        int i6 = this.f37197c - 1;
        if (i6 == 0) {
            return interfaceC2828SgA.d(this.f37195a, ((java.lang.Boolean) this.f37196b).booleanValue());
        }
        if (i6 != 1) {
            return i6 != 2 ? interfaceC2828SgA.a(this.f37195a, (java.lang.String) this.f37196b) : interfaceC2828SgA.b(this.f37195a, ((java.lang.Double) this.f37196b).doubleValue());
        }
        return interfaceC2828SgA.c(this.f37195a, ((java.lang.Long) this.f37196b).longValue());
    }
}
