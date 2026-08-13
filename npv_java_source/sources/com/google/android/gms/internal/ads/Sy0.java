package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Sy0 {
    public static com.google.android.gms.internal.ads.Sy0 b(java.lang.Class cls) {
        return java.lang.System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik") ? new com.google.android.gms.internal.ads.Ny0(cls.getSimpleName()) : new com.google.android.gms.internal.ads.Py0(cls.getSimpleName());
    }

    public abstract void a(java.lang.String str);
}
