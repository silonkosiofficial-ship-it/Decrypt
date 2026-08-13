package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
abstract class L {
    static int a(int i6, java.lang.String str) {
        if (i6 >= 0) {
            return i6;
        }
        throw new java.lang.IllegalArgumentException(str + " cannot be negative but was: " + i6);
    }

    static void b(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null) {
            throw new java.lang.NullPointerException("null key in entry: null=".concat(java.lang.String.valueOf(obj2)));
        }
        if (obj2 != null) {
            return;
        }
        throw new java.lang.NullPointerException("null value in entry: " + obj.toString() + "=null");
    }
}
