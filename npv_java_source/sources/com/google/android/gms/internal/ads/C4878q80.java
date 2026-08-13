package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.q80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4878q80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.HashMap f38189a = new java.util.HashMap();

    public final com.google.android.gms.internal.ads.C4768p80 a(com.google.android.gms.internal.ads.EnumC3780g80 enumC3780g80, android.content.Context context, com.google.android.gms.internal.ads.X70 x70, com.google.android.gms.internal.ads.InterfaceC5537w80 interfaceC5537w80) {
        com.google.android.gms.internal.ads.C4768p80 c4768p80 = (com.google.android.gms.internal.ads.C4768p80) this.f38189a.get(enumC3780g80);
        if (c4768p80 != null) {
            return c4768p80;
        }
        com.google.android.gms.internal.ads.C3341c80 c3341c80 = new com.google.android.gms.internal.ads.C3341c80(com.google.android.gms.internal.ads.C4108j80.e(enumC3780g80, context));
        com.google.android.gms.internal.ads.C4768p80 c4768p81 = new com.google.android.gms.internal.ads.C4768p80(c3341c80, new com.google.android.gms.internal.ads.C5757y80(c3341c80, x70, interfaceC5537w80));
        this.f38189a.put(enumC3780g80, c4768p81);
        return c4768p81;
    }
}
