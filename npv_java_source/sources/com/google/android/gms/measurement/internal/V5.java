package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class V5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f42180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.google.android.gms.internal.measurement.C6097p2 f42181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.lang.String f42182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private java.util.Map f42183d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private p085i4.C f42184e;

    private V5(long j6, com.google.android.gms.internal.measurement.C6097p2 c6097p2, java.lang.String str, java.util.Map map, p085i4.C c6) {
        this.f42180a = j6;
        this.f42181b = c6097p2;
        this.f42182c = str;
        this.f42183d = map;
        this.f42184e = c6;
    }

    public final long a() {
        return this.f42180a;
    }

    public final com.google.android.gms.measurement.internal.I5 b() {
        return new com.google.android.gms.measurement.internal.I5(this.f42182c, this.f42183d, this.f42184e);
    }

    public final com.google.android.gms.internal.measurement.C6097p2 c() {
        return this.f42181b;
    }

    public final java.lang.String d() {
        return this.f42182c;
    }

    public final java.util.Map e() {
        return this.f42183d;
    }
}
