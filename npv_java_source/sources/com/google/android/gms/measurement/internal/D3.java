package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class D3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final android.content.Context f41756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    java.lang.String f41757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    java.lang.String f41758c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    java.lang.String f41759d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    java.lang.Boolean f41760e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    long f41761f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    com.google.android.gms.internal.measurement.C5979c1 f41762g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f41763h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    java.lang.Long f41764i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    java.lang.String f41765j;

    public D3(android.content.Context context, com.google.android.gms.internal.measurement.C5979c1 c5979c1, java.lang.Long l6) {
        this.f41763h = true;
        Q3.AbstractC1477p.l(context);
        android.content.Context applicationContext = context.getApplicationContext();
        Q3.AbstractC1477p.l(applicationContext);
        this.f41756a = applicationContext;
        this.f41764i = l6;
        if (c5979c1 != null) {
            this.f41762g = c5979c1;
            this.f41757b = c5979c1.f40810H;
            this.f41758c = c5979c1.f40809G;
            this.f41759d = c5979c1.f40808F;
            this.f41763h = c5979c1.f40807E;
            this.f41761f = c5979c1.f40806D;
            this.f41765j = c5979c1.f40812J;
            android.os.Bundle bundle = c5979c1.f40811I;
            if (bundle != null) {
                this.f41760e = java.lang.Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
