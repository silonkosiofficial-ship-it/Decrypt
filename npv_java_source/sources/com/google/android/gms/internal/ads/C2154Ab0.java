package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ab0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2154Ab0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f25194a;

    final void a(android.content.Context context) {
        com.google.android.gms.internal.ads.AbstractC5692xc0.c(context, "Application Context cannot be null");
        if (this.f25194a) {
            return;
        }
        this.f25194a = true;
        com.google.android.gms.internal.ads.C3605ec0.c().d(context);
        com.google.android.gms.internal.ads.C2927Vb0.i().d(context);
        com.google.android.gms.internal.ads.AbstractC5142sc0.b(context);
        com.google.android.gms.internal.ads.AbstractC5252tc0.d(context);
        com.google.android.gms.internal.ads.AbstractC5582wc0.a(context);
        com.google.android.gms.internal.ads.C3277bc0.b().c(context);
        com.google.android.gms.internal.ads.C2891Ub0.b().d(context);
        com.google.android.gms.internal.ads.C3825gc0.a().e(context);
    }

    final boolean b() {
        return this.f25194a;
    }
}
