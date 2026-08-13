package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.l9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4329l9 extends com.google.android.gms.internal.ads.AbstractC4109j9 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.lang.String f37097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f37098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public java.lang.String f37099d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public java.lang.String f37100e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public java.lang.String f37101f;

    public C4329l9(java.lang.String str) {
        this.f37097b = "E";
        this.f37098c = -1L;
        this.f37099d = "E";
        this.f37100e = "E";
        this.f37101f = "E";
        java.util.HashMap mapA = com.google.android.gms.internal.ads.AbstractC4109j9.a(str);
        if (mapA != null) {
            this.f37097b = mapA.get(0) == null ? "E" : (java.lang.String) mapA.get(0);
            this.f37098c = mapA.get(1) != null ? ((java.lang.Long) mapA.get(1)).longValue() : -1L;
            this.f37099d = mapA.get(2) == null ? "E" : (java.lang.String) mapA.get(2);
            this.f37100e = mapA.get(3) == null ? "E" : (java.lang.String) mapA.get(3);
            this.f37101f = mapA.get(4) != null ? (java.lang.String) mapA.get(4) : "E";
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4109j9
    protected final java.util.HashMap b() {
        java.util.HashMap map = new java.util.HashMap();
        map.put(0, this.f37097b);
        map.put(4, this.f37101f);
        map.put(3, this.f37100e);
        map.put(2, this.f37099d);
        map.put(1, java.lang.Long.valueOf(this.f37098c));
        return map;
    }
}
