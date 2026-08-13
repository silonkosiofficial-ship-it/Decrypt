package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.lB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4333lB {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f37108a = new java.lang.Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j$.util.concurrent.ConcurrentHashMap f37109b = new j$.util.concurrent.ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j$.util.concurrent.ConcurrentHashMap f37110c = new j$.util.concurrent.ConcurrentHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final j$.util.concurrent.ConcurrentHashMap f37111d = new j$.util.concurrent.ConcurrentHashMap();

    public final int a(java.lang.String str) {
        java.lang.Integer num = (java.lang.Integer) this.f37109b.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public final long b(java.lang.String str) {
        java.lang.Long l6 = (java.lang.Long) this.f37111d.get(str);
        if (l6 == null) {
            return -1L;
        }
        return l6.longValue();
    }

    public final void c(java.lang.String str) {
        synchronized (this.f37108a) {
            try {
                java.lang.Integer num = (java.lang.Integer) this.f37109b.get(str);
                this.f37109b.put(str, num == null ? 1 : java.lang.Integer.valueOf(num.intValue() + 1));
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void d(java.lang.String str, java.lang.String str2, long j6) {
        java.lang.Long l6 = (java.lang.Long) this.f37110c.get(str2);
        if (l6 == null) {
            return;
        }
        this.f37110c.remove(str2);
        this.f37111d.put(str, java.lang.Long.valueOf(j6 - l6.longValue()));
    }

    public final void e(java.lang.String str, long j6) {
        this.f37110c.put(str, java.lang.Long.valueOf(j6));
    }
}
