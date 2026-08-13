package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Me0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2603Me0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static com.google.android.gms.internal.ads.C2603Me0 f29809c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f29810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.content.SharedPreferences f29811b;

    private C2603Me0(android.content.Context context) {
        this.f29810a = context.getPackageName();
        this.f29811b = context.getSharedPreferences("paid_storage_sp", 0);
    }

    static com.google.android.gms.internal.ads.C2603Me0 b(android.content.Context context) {
        if (f29809c == null) {
            f29809c = new com.google.android.gms.internal.ads.C2603Me0(context);
        }
        return f29809c;
    }

    final long a(java.lang.String str, long j6) {
        return this.f29811b.getLong(str, -1L);
    }

    final java.lang.String c(java.lang.String str, java.lang.String str2) {
        return this.f29811b.getString(str, null);
    }

    final void d(java.lang.String str, java.lang.Object obj) throws java.io.IOException {
        android.content.SharedPreferences.Editor editorPutInt;
        if (obj instanceof java.lang.String) {
            editorPutInt = this.f29811b.edit().putString(str, (java.lang.String) obj);
        } else if (obj instanceof java.lang.Long) {
            editorPutInt = this.f29811b.edit().putLong(str, ((java.lang.Long) obj).longValue());
        } else {
            if (!(obj instanceof java.lang.Boolean)) {
                if (obj instanceof java.lang.Integer) {
                    editorPutInt = this.f29811b.edit().putInt(str, ((java.lang.Integer) obj).intValue());
                } else {
                    java.lang.String str2 = "Unexpected object class " + java.lang.String.valueOf(obj.getClass()) + " for app " + this.f29810a;
                }
                throw new java.io.IOException("Failed to store " + str + " for app " + this.f29810a);
            }
            editorPutInt = this.f29811b.edit().putBoolean(str, ((java.lang.Boolean) obj).booleanValue());
        }
        if (editorPutInt.commit()) {
            return;
        }
        throw new java.io.IOException("Failed to store " + str + " for app " + this.f29810a);
    }

    final void e(java.lang.String str) throws java.io.IOException {
        if (this.f29811b.edit().remove(str).commit()) {
            return;
        }
        throw new java.io.IOException("Failed to remove " + str + " for app " + this.f29810a);
    }

    final boolean f(java.lang.String str, boolean z6) {
        return this.f29811b.getBoolean(str, true);
    }

    final boolean g(java.lang.String str) {
        return this.f29811b.contains(str);
    }
}
