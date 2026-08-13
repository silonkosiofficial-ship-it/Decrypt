package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Xy0 {
    static java.util.HashSet a(int i6) {
        return new java.util.HashSet(d(i6));
    }

    public static java.util.LinkedHashMap b(int i6) {
        return new java.util.LinkedHashMap(d(i6));
    }

    public static java.util.List c(int i6) {
        return i6 == 0 ? java.util.Collections.emptyList() : new java.util.ArrayList(i6);
    }

    private static int d(int i6) {
        if (i6 < 3) {
            return i6 + 1;
        }
        if (i6 < 1073741824) {
            return (int) ((i6 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }
}
