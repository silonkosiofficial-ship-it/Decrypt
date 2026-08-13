package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.mi0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4495mi0 {
    static java.lang.Object a(java.util.Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        java.lang.Object next = it.next();
        it.remove();
        return next;
    }

    static void b(java.util.Iterator it) {
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static boolean c(java.util.Collection collection, java.util.Iterator it) {
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= collection.add(it.next());
        }
        return zAdd;
    }
}
