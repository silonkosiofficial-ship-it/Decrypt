package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.da, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3491da extends com.google.android.gms.internal.ads.AbstractC4109j9 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.lang.Long f34750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.lang.Long f34751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public java.lang.Long f34752d;

    public C3491da(java.lang.String str) {
        java.util.HashMap mapA = com.google.android.gms.internal.ads.AbstractC4109j9.a(str);
        if (mapA != null) {
            this.f34750b = (java.lang.Long) mapA.get(0);
            this.f34751c = (java.lang.Long) mapA.get(1);
            this.f34752d = (java.lang.Long) mapA.get(2);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4109j9
    protected final java.util.HashMap b() {
        java.util.HashMap map = new java.util.HashMap();
        map.put(0, this.f34750b);
        map.put(1, this.f34751c);
        map.put(2, this.f34752d);
        return map;
    }
}
