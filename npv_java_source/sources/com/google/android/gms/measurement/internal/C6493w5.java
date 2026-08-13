package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.w5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6493w5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.measurement.internal.C6445p5 f42690a;

    C6493w5(com.google.android.gms.measurement.internal.C6445p5 c6445p5) {
        this.f42690a = c6445p5;
    }

    private final void c(long j6, boolean z6) {
        this.f42690a.n();
        if (this.f42690a.f42679a.p()) {
            this.f42690a.h().f42739r.b(j6);
            this.f42690a.j().K().b("Session started, time", java.lang.Long.valueOf(this.f42690a.b().c()));
            long j10 = j6 / 1000;
            this.f42690a.r().k0("auto", "_sid", java.lang.Long.valueOf(j10), j6);
            this.f42690a.h().f42740s.b(j10);
            this.f42690a.h().f42735n.a(false);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putLong("_sid", j10);
            this.f42690a.r().e0("auto", "_s", j6, bundle);
            java.lang.String strA = this.f42690a.h().f42745x.a();
            if (android.text.TextUtils.isEmpty(strA)) {
                return;
            }
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putString("_ffr", strA);
            this.f42690a.r().e0("auto", "_ssr", j6, bundle2);
        }
    }

    final void a() {
        this.f42690a.n();
        if (this.f42690a.h().z(this.f42690a.b().a())) {
            this.f42690a.h().f42735n.a(true);
            android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new android.app.ActivityManager.RunningAppProcessInfo();
            android.app.ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.f42690a.j().K().a("Detected application was in foreground");
                c(this.f42690a.b().a(), false);
            }
        }
    }

    final void b(long j6, boolean z6) {
        this.f42690a.n();
        this.f42690a.G();
        if (this.f42690a.h().z(j6)) {
            this.f42690a.h().f42735n.a(true);
            this.f42690a.p().I();
        }
        this.f42690a.h().f42739r.b(j6);
        if (this.f42690a.h().f42735n.b()) {
            c(j6, z6);
        }
    }
}
