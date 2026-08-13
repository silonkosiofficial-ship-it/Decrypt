package j$.time.format;

/* JADX INFO: loaded from: classes4.dex */
final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map f47893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.HashMap f47894b;

    z(java.util.Map map) {
        this.f47893a = map;
        java.util.HashMap map2 = new java.util.HashMap();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.util.HashMap map3 = new java.util.HashMap();
            for (java.util.Map.Entry entry2 : ((java.util.Map) entry.getValue()).entrySet()) {
                java.lang.String str = (java.lang.String) entry2.getValue();
                java.lang.String str2 = (java.lang.String) entry2.getValue();
                java.lang.Long l6 = (java.lang.Long) entry2.getKey();
                int i6 = j$.time.format.A.f47782d;
                map3.put(str, new java.util.AbstractMap.SimpleImmutableEntry(str2, l6));
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(map3.values());
            java.util.Collections.sort(arrayList2, j$.time.format.A.f47780b);
            map2.put((j$.time.format.TextStyle) entry.getKey(), arrayList2);
            arrayList.addAll(arrayList2);
            map2.put(null, arrayList);
        }
        java.util.Collections.sort(arrayList, j$.time.format.A.f47780b);
        this.f47894b = map2;
    }

    final java.lang.String a(long j6, j$.time.format.TextStyle textStyle) {
        java.util.Map map = (java.util.Map) this.f47893a.get(textStyle);
        if (map != null) {
            return (java.lang.String) map.get(java.lang.Long.valueOf(j6));
        }
        return null;
    }

    final java.util.Iterator b(j$.time.format.TextStyle textStyle) {
        java.util.List list = (java.util.List) this.f47894b.get(textStyle);
        if (list != null) {
            return list.iterator();
        }
        return null;
    }
}
