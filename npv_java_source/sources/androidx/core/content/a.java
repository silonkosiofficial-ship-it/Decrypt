package androidx.core.content;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.Object f21483a = new java.lang.Object();

    /* JADX INFO: renamed from: androidx.core.content.a$a, reason: collision with other inner class name */
    static class C0403a {
        static java.io.File a(android.content.Context context) {
            return context.getCodeCacheDir();
        }

        static android.graphics.drawable.Drawable b(android.content.Context context, int i6) {
            return context.getDrawable(i6);
        }

        static java.io.File c(android.content.Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    static class b {
        static int a(android.content.Context context, int i6) {
            return context.getColor(i6);
        }

        static <T> T b(android.content.Context context, java.lang.Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        static java.lang.String c(android.content.Context context, java.lang.Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    static class c {
        static android.content.Context a(android.content.Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        static java.io.File b(android.content.Context context) {
            return context.getDataDir();
        }

        static boolean c(android.content.Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    static class d {
        static android.content.Intent a(android.content.Context context, android.content.BroadcastReceiver broadcastReceiver, android.content.IntentFilter intentFilter, java.lang.String str, android.os.Handler handler, int i6) {
            return ((i6 & 4) == 0 || str != null) ? context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i6 & 1) : context.registerReceiver(broadcastReceiver, intentFilter, androidx.core.content.a.g(context), handler);
        }

        static android.content.ComponentName b(android.content.Context context, android.content.Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    static class e {
        static android.content.Intent a(android.content.Context context, android.content.BroadcastReceiver broadcastReceiver, android.content.IntentFilter intentFilter, java.lang.String str, android.os.Handler handler, int i6) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i6);
        }
    }

    public static int a(android.content.Context context, java.lang.String str) {
        B1.c.d(str, "permission must be non-null");
        if (android.os.Build.VERSION.SDK_INT >= 33 || !android.text.TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, android.os.Process.myPid(), android.os.Process.myUid());
        }
        return androidx.core.app.m.b(context).a() ? 0 : -1;
    }

    public static android.content.Context b(android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            return androidx.core.content.a.c.a(context);
        }
        return null;
    }

    public static int c(android.content.Context context, int i6) {
        return androidx.core.content.a.b.a(context, i6);
    }

    public static android.content.res.ColorStateList d(android.content.Context context, int i6) {
        return androidx.core.content.res.h.d(context.getResources(), i6, context.getTheme());
    }

    public static android.graphics.drawable.Drawable e(android.content.Context context, int i6) {
        return androidx.core.content.a.C0403a.b(context, i6);
    }

    public static java.lang.Object f(android.content.Context context, java.lang.Class cls) {
        return androidx.core.content.a.b.b(context, cls);
    }

    static java.lang.String g(android.content.Context context) {
        java.lang.String str = context.getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
        if (androidx.core.content.d.b(context, str) == 0) {
            return str;
        }
        throw new java.lang.RuntimeException("Permission " + str + " is required by your application to receive broadcasts, please add it to your manifest");
    }

    public static android.content.Intent h(android.content.Context context, android.content.BroadcastReceiver broadcastReceiver, android.content.IntentFilter intentFilter, int i6) {
        return i(context, broadcastReceiver, intentFilter, null, null, i6);
    }

    public static android.content.Intent i(android.content.Context context, android.content.BroadcastReceiver broadcastReceiver, android.content.IntentFilter intentFilter, java.lang.String str, android.os.Handler handler, int i6) {
        int i10 = i6 & 1;
        if (i10 != 0 && (i6 & 4) != 0) {
            throw new java.lang.IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
        }
        if (i10 != 0) {
            i6 |= 2;
        }
        int i11 = i6;
        int i12 = i11 & 2;
        if (i12 == 0 && (i11 & 4) == 0) {
            throw new java.lang.IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
        }
        if (i12 != 0 && (i11 & 4) != 0) {
            throw new java.lang.IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
        }
        int i13 = android.os.Build.VERSION.SDK_INT;
        if (i13 >= 33) {
            return androidx.core.content.a.e.a(context, broadcastReceiver, intentFilter, str, handler, i11);
        }
        if (i13 >= 26) {
            return androidx.core.content.a.d.a(context, broadcastReceiver, intentFilter, str, handler, i11);
        }
        return ((i11 & 4) == 0 || str != null) ? context.registerReceiver(broadcastReceiver, intentFilter, str, handler) : context.registerReceiver(broadcastReceiver, intentFilter, g(context), handler);
    }

    public static void j(android.content.Context context, android.content.Intent intent, android.os.Bundle bundle) {
        context.startActivity(intent, bundle);
    }

    public static void k(android.content.Context context, android.content.Intent intent) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            androidx.core.content.a.d.b(context, intent);
        } else {
            context.startService(intent);
        }
    }
}
