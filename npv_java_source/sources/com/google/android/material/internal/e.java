package com.google.android.material.internal;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e {
    private static java.lang.String a() {
        java.lang.String str = android.os.Build.MANUFACTURER;
        return str != null ? str.toLowerCase(java.util.Locale.ENGLISH) : "";
    }

    public static boolean b() {
        return a().equals("meizu");
    }
}
