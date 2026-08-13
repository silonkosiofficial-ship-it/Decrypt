package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.tf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5257tf {
    public static final android.content.SharedPreferences a(android.content.Context context) {
        try {
            return context.getSharedPreferences("google_ads_flags", 0);
        } catch (java.lang.IllegalStateException e6) {
            p224w3.p.h("", e6);
            return null;
        }
    }
}
