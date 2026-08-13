package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.r2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6455r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.lang.String f42607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.lang.String f42608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f42609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public android.os.Bundle f42610d;

    public C6455r2(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, long j6) {
        this.f42607a = str;
        this.f42608b = str2;
        this.f42610d = bundle == null ? new android.os.Bundle() : bundle;
        this.f42609c = j6;
    }

    public static com.google.android.gms.measurement.internal.C6455r2 b(com.google.android.gms.measurement.internal.E e6) {
        return new com.google.android.gms.measurement.internal.C6455r2(e6.f41772C, e6.f41774E, e6.f41773D.w(), e6.f41775F);
    }

    public final com.google.android.gms.measurement.internal.E a() {
        return new com.google.android.gms.measurement.internal.E(this.f42607a, new com.google.android.gms.measurement.internal.D(new android.os.Bundle(this.f42610d)), this.f42608b, this.f42609c);
    }

    public final java.lang.String toString() {
        return "origin=" + this.f42608b + ",name=" + this.f42607a + ",params=" + java.lang.String.valueOf(this.f42610d);
    }
}
