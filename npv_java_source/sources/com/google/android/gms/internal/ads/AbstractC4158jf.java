package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.jf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4158jf {
    public static int a(android.content.Context context) {
        return f(context, "crash_without_write");
    }

    public static int b(android.content.Context context) {
        return f(context, "init_without_write");
    }

    public static void c(android.content.Context context) {
        g(context, "crash_without_write");
    }

    public static void d(android.content.Context context) {
        g(context, "init_without_write");
    }

    public static void e(android.content.Context context) {
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("admob", 0);
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().putInt("init_without_write", 0).putInt("crash_without_write", 0).commit();
    }

    private static int f(android.content.Context context, java.lang.String str) {
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("admob", 0);
        if (sharedPreferences == null) {
            return 0;
        }
        try {
            return sharedPreferences.getInt(str, 0);
        } catch (java.lang.ClassCastException unused) {
            return 0;
        }
    }

    private static void g(android.content.Context context, java.lang.String str) {
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("admob", 0);
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().putInt(str, f(context, str) + 1).commit();
    }
}
