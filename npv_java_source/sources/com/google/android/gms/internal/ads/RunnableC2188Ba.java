package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ba, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC2188Ba implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ int f25980C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C2262Da f25981D;

    RunnableC2188Ba(com.google.android.gms.internal.ads.C2262Da c2262Da, int i6, boolean z6) {
        this.f25980C = i6;
        this.f25981D = c2262Da;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.ads.Q8 q8A;
        int i6 = this.f25980C;
        com.google.android.gms.internal.ads.C2262Da c2262Da = this.f25981D;
        if (i6 > 0) {
            try {
                java.lang.Thread.sleep(i6 * 1000);
            } catch (java.lang.InterruptedException unused) {
            }
        }
        try {
            android.content.pm.PackageInfo packageInfo = c2262Da.f26724a.getPackageManager().getPackageInfo(c2262Da.f26724a.getPackageName(), 0);
            android.content.Context context = c2262Da.f26724a;
            q8A = com.google.android.gms.internal.ads.AbstractC3498dd0.a(context, context.getPackageName(), java.lang.Integer.toString(packageInfo.versionCode));
        } catch (java.lang.Throwable unused2) {
            q8A = null;
        }
        this.f25981D.f26733j = q8A;
        if (this.f25980C < 4) {
            if (q8A != null && q8A.L0() && !q8A.a1().equals("0000000000000000000000000000000000000000000000000000000000000000") && q8A.M0() && q8A.Y0().g0() && q8A.Y0().b0() != -2) {
                return;
            }
            this.f25981D.o(this.f25980C + 1, true);
        }
    }
}
