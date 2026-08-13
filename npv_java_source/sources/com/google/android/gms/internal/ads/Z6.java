package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Z6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f33500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f33501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.Map f33502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.List f33503d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f33504e;

    private Z6(int i6, byte[] bArr, java.util.Map map, java.util.List list, boolean z6, long j6) {
        this.f33500a = i6;
        this.f33501b = bArr;
        this.f33502c = map;
        this.f33503d = list == null ? null : j$.util.DesugarCollections.unmodifiableList(list);
        this.f33504e = z6;
    }

    public Z6(int i6, byte[] bArr, java.util.Map map, boolean z6, long j6) {
        this(i6, bArr, map, a(map), z6, j6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Z6(int i6, byte[] bArr, boolean z6, long j6, java.util.List list) {
        java.util.Map treeMap;
        if (list == null) {
            treeMap = null;
        } else if (list.isEmpty()) {
            treeMap = java.util.Collections.emptyMap();
        } else {
            treeMap = new java.util.TreeMap(java.lang.String.CASE_INSENSITIVE_ORDER);
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.google.android.gms.internal.ads.V6 v6 = (com.google.android.gms.internal.ads.V6) it.next();
                treeMap.put(v6.a(), v6.b());
            }
        }
        this(i6, bArr, treeMap, list, z6, j6);
    }

    public Z6(byte[] bArr, java.util.Map map) {
        this(200, bArr, map, a(map), false, 0L);
    }

    private static java.util.List a(java.util.Map map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return java.util.Collections.emptyList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
        for (java.util.Map.Entry entry : map.entrySet()) {
            arrayList.add(new com.google.android.gms.internal.ads.V6((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue()));
        }
        return arrayList;
    }
}
