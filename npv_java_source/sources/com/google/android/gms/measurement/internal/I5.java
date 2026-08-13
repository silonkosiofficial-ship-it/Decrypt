package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class I5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.String f41995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.util.Map f41996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p085i4.C f41997c;

    I5(java.lang.String str, p085i4.C c6) {
        this.f41995a = str;
        this.f41997c = c6;
    }

    I5(java.lang.String str, java.util.Map map, p085i4.C c6) {
        this.f41995a = str;
        this.f41996b = map;
        this.f41997c = c6;
    }

    public final p085i4.C a() {
        return this.f41997c;
    }

    public final java.lang.String b() {
        return this.f41995a;
    }

    public final java.util.Map c() {
        java.util.Map map = this.f41996b;
        return map == null ? java.util.Collections.emptyMap() : map;
    }
}
