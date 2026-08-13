package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.La, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2558La implements android.app.AppOpsManager$OnOpActiveChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C2631Na f29520a;

    C2558La(com.google.android.gms.internal.ads.C2631Na c2631Na) {
        this.f29520a = c2631Na;
    }

    public final void onOpActiveChanged(java.lang.String str, int i6, java.lang.String str2, boolean z6) {
        com.google.android.gms.internal.ads.C2631Na c2631Na;
        boolean z10;
        com.google.android.gms.internal.ads.C2631Na c2631Na2 = this.f29520a;
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        if (z6) {
            c2631Na2.f30329a = jCurrentTimeMillis;
            c2631Na = this.f29520a;
            z10 = true;
        } else {
            if (c2631Na2.f30330b > 0) {
                com.google.android.gms.internal.ads.C2631Na c2631Na3 = this.f29520a;
                if (jCurrentTimeMillis >= c2631Na3.f30330b) {
                    c2631Na3.f30331c = jCurrentTimeMillis - c2631Na3.f30330b;
                }
            }
            c2631Na = this.f29520a;
            z10 = false;
        }
        c2631Na.f30332d = z10;
    }
}
