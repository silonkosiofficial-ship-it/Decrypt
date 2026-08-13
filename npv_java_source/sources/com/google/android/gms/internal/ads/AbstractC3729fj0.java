package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.fj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3729fj0 {
    static int a(java.util.Set set) {
        java.util.Iterator it = set.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    public static com.google.android.gms.internal.ads.AbstractC3510dj0 b(java.util.Set set, java.util.Set set2) {
        com.google.android.gms.internal.ads.AbstractC2164Ag0.c(set, "set1");
        com.google.android.gms.internal.ads.AbstractC2164Ag0.c(set2, "set2");
        return new com.google.android.gms.internal.ads.C3085Zi0(set, set2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static java.util.Set c(java.util.Set set, com.google.android.gms.internal.ads.InterfaceC2201Bg0 interfaceC2201Bg0) {
        if (!(set instanceof java.util.SortedSet)) {
            if (!(set instanceof com.google.android.gms.internal.ads.C3181aj0)) {
                set.getClass();
                return new com.google.android.gms.internal.ads.C3181aj0(set, interfaceC2201Bg0);
            }
            com.google.android.gms.internal.ads.C3181aj0 c3181aj0 = (com.google.android.gms.internal.ads.C3181aj0) set;
            return new com.google.android.gms.internal.ads.C3181aj0((java.util.Set) c3181aj0.f40365C, com.google.android.gms.internal.ads.AbstractC2312Eg0.a(c3181aj0.f40366D, interfaceC2201Bg0));
        }
        java.util.SortedSet sortedSet = (java.util.SortedSet) set;
        if (!(sortedSet instanceof com.google.android.gms.internal.ads.C3181aj0)) {
            sortedSet.getClass();
            return new com.google.android.gms.internal.ads.C3291bj0(sortedSet, interfaceC2201Bg0);
        }
        com.google.android.gms.internal.ads.C3181aj0 c3181aj1 = (com.google.android.gms.internal.ads.C3181aj0) sortedSet;
        return new com.google.android.gms.internal.ads.C3291bj0((java.util.SortedSet) c3181aj1.f40365C, com.google.android.gms.internal.ads.AbstractC2312Eg0.a(c3181aj1.f40366D, interfaceC2201Bg0));
    }

    static boolean d(java.util.Set set, java.lang.Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof java.util.Set) {
            java.util.Set set2 = (java.util.Set) obj;
            try {
                if (set.size() == set2.size() && set.containsAll(set2)) {
                    return true;
                }
            } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            }
        }
        return false;
    }

    static boolean e(java.util.Set set, java.util.Collection collection) {
        collection.getClass();
        if (collection instanceof com.google.android.gms.internal.ads.InterfaceC2538Ki0) {
            collection = ((com.google.android.gms.internal.ads.InterfaceC2538Ki0) collection).a();
        }
        if (!(collection instanceof java.util.Set) || collection.size() <= set.size()) {
            return f(set, collection.iterator());
        }
        java.util.Iterator it = set.iterator();
        collection.getClass();
        boolean z6 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z6 = true;
            }
        }
        return z6;
    }

    static boolean f(java.util.Set set, java.util.Iterator it) {
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }
}
