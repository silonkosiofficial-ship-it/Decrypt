package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.su0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5178su0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final com.google.android.gms.internal.ads.C5178su0 f38818b = new com.google.android.gms.internal.ads.C5178su0(new com.google.android.gms.internal.ads.C5288tu0());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final com.google.android.gms.internal.ads.C5178su0 f38819c = new com.google.android.gms.internal.ads.C5178su0(new com.google.android.gms.internal.ads.C5838yu0());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC4959qu0 f38820a;

    static {
        new com.google.android.gms.internal.ads.C5178su0(new com.google.android.gms.internal.ads.Au0());
        new com.google.android.gms.internal.ads.C5178su0(new com.google.android.gms.internal.ads.C5948zu0());
        new com.google.android.gms.internal.ads.C5178su0(new com.google.android.gms.internal.ads.C5398uu0());
        new com.google.android.gms.internal.ads.C5178su0(new com.google.android.gms.internal.ads.C5728xu0());
        new com.google.android.gms.internal.ads.C5178su0(new com.google.android.gms.internal.ads.C5508vu0());
    }

    public C5178su0(com.google.android.gms.internal.ads.Bu0 bu0) {
        this.f38820a = !com.google.android.gms.internal.ads.AbstractC3851gp0.b() ? "The Android Project".equals(java.lang.System.getProperty("java.vendor")) ? new com.google.android.gms.internal.ads.C4629nu0(bu0, null) : new com.google.android.gms.internal.ads.C4739ou0(bu0, null) : new com.google.android.gms.internal.ads.C4849pu0(bu0, null);
    }

    public static java.util.List b(java.lang.String... strArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : strArr) {
            java.security.Provider provider = java.security.Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    public final java.lang.Object a(java.lang.String str) {
        return this.f38820a.o(str);
    }
}
