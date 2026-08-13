package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.qf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4929qf0 {
    public static com.google.android.gms.internal.ads.InterfaceC4819pf0 a(android.content.Context context) {
        android.content.Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return new com.google.android.gms.internal.ads.C5038rf0(new com.google.android.gms.internal.ads.C2421Hf0(context));
    }
}
