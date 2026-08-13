package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.n4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6430n4 implements android.app.Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.F3 f42554C;

    C6430n4(com.google.android.gms.measurement.internal.F3 f6) {
        this.f42554C = f6;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x010f  */
    static /* synthetic */ void a(com.google.android.gms.measurement.internal.C6430n4 c6430n4, boolean z6, android.net.Uri uri, java.lang.String str, java.lang.String str2) {
        android.os.Bundle bundleC;
        c6430n4.f42554C.n();
        try {
            com.google.android.gms.measurement.internal.d6 d6VarI = c6430n4.f42554C.i();
            boolean z10 = com.google.android.gms.internal.measurement.S6.a() && c6430n4.f42554C.d().t(com.google.android.gms.measurement.internal.G.f41851U0);
            java.lang.String str3 = "Activity created with data 'referrer' without required params";
            if (android.text.TextUtils.isEmpty(str2)) {
                bundleC = null;
            } else if (str2.contains("gclid") || ((z10 && str2.contains("gbraid")) || str2.contains("utm_campaign") || str2.contains("utm_source") || str2.contains("utm_medium") || str2.contains("utm_id") || str2.contains("dclid") || str2.contains("srsltid") || str2.contains("sfmc_id"))) {
                bundleC = d6VarI.C(android.net.Uri.parse("https://google.com/search?" + str2), z10);
                if (bundleC != null) {
                    bundleC.putString("_cis", "referrer");
                }
            } else {
                d6VarI.j().F().a("Activity created with data 'referrer' without required params");
                bundleC = null;
            }
            if (z6) {
                android.os.Bundle bundleC2 = c6430n4.f42554C.i().C(uri, com.google.android.gms.internal.measurement.S6.a() && c6430n4.f42554C.d().t(com.google.android.gms.measurement.internal.G.f41851U0));
                if (bundleC2 != null) {
                    bundleC2.putString("_cis", "intent");
                    if (!bundleC2.containsKey("gclid") && bundleC != null && bundleC.containsKey("gclid")) {
                        bundleC2.putString("_cer", java.lang.String.format("gclid=%s", bundleC.getString("gclid")));
                    }
                    c6430n4.f42554C.b1(str, "_cmp", bundleC2);
                    c6430n4.f42554C.f41796q.b(str, bundleC2);
                } else {
                    str3 = "Activity created with data 'referrer' without required params";
                }
            } else {
                str3 = "Activity created with data 'referrer' without required params";
            }
            if (android.text.TextUtils.isEmpty(str2)) {
                return;
            }
            c6430n4.f42554C.j().F().b("Activity created with referrer", str2);
            if (c6430n4.f42554C.d().t(com.google.android.gms.measurement.internal.G.f41910r0)) {
                if (bundleC != null) {
                    c6430n4.f42554C.b1(str, "_cmp", bundleC);
                    c6430n4.f42554C.f41796q.b(str, bundleC);
                } else {
                    c6430n4.f42554C.j().F().b("Referrer does not contain valid parameters", str2);
                }
                c6430n4.f42554C.l0("auto", "_ldl", null, true);
                return;
            }
            if (!str2.contains("gclid") || (!str2.contains("utm_campaign") && !str2.contains("utm_source") && !str2.contains("utm_medium") && !str2.contains("utm_term") && !str2.contains("utm_content"))) {
                c6430n4.f42554C.j().F().a(str3);
            } else {
                if (android.text.TextUtils.isEmpty(str2)) {
                    return;
                }
                c6430n4.f42554C.l0("auto", "_ldl", str2, true);
            }
        } catch (java.lang.RuntimeException e6) {
            c6430n4.f42554C.j().G().b("Throwable caught in handleReferrerForOnActivityCreated", e6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0049  */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        try {
            try {
                this.f42554C.j().K().a("onActivityCreated");
                android.content.Intent intent = activity.getIntent();
                if (intent != null) {
                    android.net.Uri data = intent.getData();
                    if (data == null || !data.isHierarchical()) {
                        android.os.Bundle extras = intent.getExtras();
                        if (extras != null) {
                            java.lang.String string = extras.getString("com.android.vending.referral_url");
                            if (android.text.TextUtils.isEmpty(string)) {
                                data = null;
                            } else {
                                data = android.net.Uri.parse(string);
                            }
                        } else {
                            data = null;
                        }
                    }
                    android.net.Uri uri = data;
                    if (uri != null && uri.isHierarchical()) {
                        this.f42554C.i();
                        this.f42554C.l().D(new com.google.android.gms.measurement.internal.RunnableC6451q4(this, bundle == null, uri, com.google.android.gms.measurement.internal.d6.f0(intent) ? "gs" : "auto", uri.getQueryParameter("referrer")));
                    }
                }
            } catch (java.lang.RuntimeException e6) {
                this.f42554C.j().G().b("Throwable caught in onActivityCreated", e6);
            }
        } finally {
            this.f42554C.s().F(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity activity) {
        this.f42554C.s().E(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) {
        this.f42554C.s().Q(activity);
        com.google.android.gms.measurement.internal.C6445p5 c6445p5U = this.f42554C.u();
        c6445p5U.l().D(new com.google.android.gms.measurement.internal.RunnableC6452q5(c6445p5U, c6445p5U.b().c()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity activity) {
        com.google.android.gms.measurement.internal.C6445p5 c6445p5U = this.f42554C.u();
        c6445p5U.l().D(new com.google.android.gms.measurement.internal.RunnableC6458r5(c6445p5U, c6445p5U.b().c()));
        this.f42554C.s().S(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
        this.f42554C.s().R(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity activity) {
    }
}
