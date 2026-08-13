package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ta, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5247ta extends com.google.android.gms.internal.ads.AbstractC4109j9 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.lang.Long f38971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.lang.Boolean f38972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public java.lang.Boolean f38973d;

    public C5247ta(java.lang.String str) {
        java.util.HashMap mapA = com.google.android.gms.internal.ads.AbstractC4109j9.a(str);
        if (mapA != null) {
            this.f38971b = (java.lang.Long) mapA.get(0);
            this.f38972c = (java.lang.Boolean) mapA.get(1);
            this.f38973d = (java.lang.Boolean) mapA.get(2);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4109j9
    protected final java.util.HashMap b() {
        java.util.HashMap map = new java.util.HashMap();
        map.put(0, this.f38971b);
        map.put(1, this.f38972c);
        map.put(2, this.f38973d);
        return map;
    }
}
