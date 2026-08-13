package V3;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static java.util.List a(java.lang.Object obj) {
        return java.util.Collections.singletonList(obj);
    }

    public static java.util.List b(java.lang.Object... objArr) {
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? j$.util.DesugarCollections.unmodifiableList(java.util.Arrays.asList(objArr)) : java.util.Collections.singletonList(objArr[0]);
        }
        return java.util.Collections.emptyList();
    }

    public static java.util.Map c(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6) {
        java.util.Map mapG = g(3, false);
        mapG.put(obj, obj2);
        mapG.put(obj3, obj4);
        mapG.put(obj5, obj6);
        return j$.util.DesugarCollections.unmodifiableMap(mapG);
    }

    public static java.util.Map d(java.lang.Object[] objArr, java.lang.Object[] objArr2) {
        int length = objArr.length;
        int length2 = objArr2.length;
        if (length != length2) {
            throw new java.lang.IllegalArgumentException("Key and values array lengths not equal: " + length + " != " + length2);
        }
        if (length == 0) {
            return java.util.Collections.emptyMap();
        }
        if (length == 1) {
            return java.util.Collections.singletonMap(objArr[0], objArr2[0]);
        }
        java.util.Map mapG = g(length, false);
        for (int i6 = 0; i6 < objArr.length; i6++) {
            mapG.put(objArr[i6], objArr2[i6]);
        }
        return j$.util.DesugarCollections.unmodifiableMap(mapG);
    }

    public static java.util.Set e(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.util.Set setH = h(3, false);
        setH.add(obj);
        setH.add(obj2);
        setH.add(obj3);
        return j$.util.DesugarCollections.unmodifiableSet(setH);
    }

    public static java.util.Set f(java.lang.Object... objArr) {
        int length = objArr.length;
        if (length == 0) {
            return java.util.Collections.emptySet();
        }
        if (length == 1) {
            return java.util.Collections.singleton(objArr[0]);
        }
        if (length == 2) {
            java.lang.Object obj = objArr[0];
            java.lang.Object obj2 = objArr[1];
            java.util.Set setH = h(2, false);
            setH.add(obj);
            setH.add(obj2);
            return j$.util.DesugarCollections.unmodifiableSet(setH);
        }
        if (length == 3) {
            return e(objArr[0], objArr[1], objArr[2]);
        }
        if (length != 4) {
            java.util.Set setH2 = h(length, false);
            java.util.Collections.addAll(setH2, objArr);
            return j$.util.DesugarCollections.unmodifiableSet(setH2);
        }
        java.lang.Object obj3 = objArr[0];
        java.lang.Object obj4 = objArr[1];
        java.lang.Object obj5 = objArr[2];
        java.lang.Object obj6 = objArr[3];
        java.util.Set setH3 = h(4, false);
        setH3.add(obj3);
        setH3.add(obj4);
        setH3.add(obj5);
        setH3.add(obj6);
        return j$.util.DesugarCollections.unmodifiableSet(setH3);
    }

    private static java.util.Map g(int i6, boolean z6) {
        return i6 <= 256 ? new p170r.C7026a(i6) : new java.util.HashMap(i6, 1.0f);
    }

    private static java.util.Set h(int i6, boolean z6) {
        if (i6 <= (true != z6 ? 256 : 128)) {
            return new p170r.C7027b(i6);
        }
        return new java.util.HashSet(i6, true != z6 ? 1.0f : 0.75f);
    }
}
