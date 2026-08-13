package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.r8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4986r8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.util.HashSet f38439a = new java.util.HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static java.lang.String f38440b = "media3.common";

    public static synchronized java.lang.String a() {
        return f38440b;
    }

    public static synchronized void b(java.lang.String str) {
        if (f38439a.add(str)) {
            f38440b = f38440b + ", " + str;
        }
    }
}
