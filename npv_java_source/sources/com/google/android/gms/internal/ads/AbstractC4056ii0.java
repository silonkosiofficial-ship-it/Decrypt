package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ii0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4056ii0 {
    public static java.lang.Object a(java.lang.Iterable iterable, java.lang.Object obj) {
        com.google.android.gms.internal.ads.AbstractC4167jj0 it = ((com.google.android.gms.internal.ads.C3085Zi0) iterable).iterator();
        return it.hasNext() ? it.next() : obj;
    }

    public static boolean b(java.lang.Iterable iterable, com.google.android.gms.internal.ads.InterfaceC2201Bg0 interfaceC2201Bg0) {
        if ((iterable instanceof java.util.RandomAccess) && (iterable instanceof java.util.List)) {
            interfaceC2201Bg0.getClass();
            return d((java.util.List) iterable, interfaceC2201Bg0);
        }
        java.util.Iterator it = iterable.iterator();
        interfaceC2201Bg0.getClass();
        boolean z6 = false;
        while (it.hasNext()) {
            if (interfaceC2201Bg0.b(it.next())) {
                it.remove();
                z6 = true;
            }
        }
        return z6;
    }

    private static void c(java.util.List list, com.google.android.gms.internal.ads.InterfaceC2201Bg0 interfaceC2201Bg0, int i6, int i10) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i10) {
                break;
            } else if (interfaceC2201Bg0.b(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i10--;
            if (i10 < i6) {
                return;
            } else {
                list.remove(i10);
            }
        }
    }

    private static boolean d(java.util.List list, com.google.android.gms.internal.ads.InterfaceC2201Bg0 interfaceC2201Bg0) {
        int i6 = 0;
        int i10 = 0;
        while (i6 < list.size()) {
            java.lang.Object obj = list.get(i6);
            if (!interfaceC2201Bg0.b(obj)) {
                if (i6 > i10) {
                    try {
                        list.set(i10, obj);
                    } catch (java.lang.IllegalArgumentException unused) {
                        c(list, interfaceC2201Bg0, i10, i6);
                        return true;
                    } catch (java.lang.UnsupportedOperationException unused2) {
                        c(list, interfaceC2201Bg0, i10, i6);
                        return true;
                    }
                }
                i10++;
            }
            i6++;
        }
        list.subList(i10, list.size()).clear();
        return i6 != i10;
    }
}
