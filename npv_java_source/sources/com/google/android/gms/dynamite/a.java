package com.google.android.gms.dynamite;

/* JADX INFO: loaded from: classes.dex */
final class a extends dalvik.system.PathClassLoader {
    a(java.lang.String str, java.lang.ClassLoader classLoader) {
        super(str, classLoader);
    }

    @Override // java.lang.ClassLoader
    protected final java.lang.Class loadClass(java.lang.String str, boolean z6) {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (java.lang.ClassNotFoundException unused) {
            }
        }
        return super.loadClass(str, z6);
    }
}
