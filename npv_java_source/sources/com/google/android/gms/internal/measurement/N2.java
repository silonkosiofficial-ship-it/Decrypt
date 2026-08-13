package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public final class N2 implements com.google.android.gms.internal.measurement.K2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicBoolean f40584a = new java.util.concurrent.atomic.AtomicBoolean();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.util.HashMap f40585b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.HashMap f40586c = new java.util.HashMap(16, 1.0f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.HashMap f40587d = new java.util.HashMap(16, 1.0f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.util.HashMap f40588e = new java.util.HashMap(16, 1.0f);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.util.HashMap f40589f = new java.util.HashMap(16, 1.0f);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private java.lang.Object f40590g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f40591h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private java.lang.String[] f40592i = new java.lang.String[0];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.google.android.gms.internal.measurement.Q2 f40593j = new com.google.android.gms.internal.measurement.O2();

    @Override // com.google.android.gms.internal.measurement.K2
    public final java.lang.String a(android.content.ContentResolver contentResolver, java.lang.String str, java.lang.String str2) {
        if (contentResolver == null) {
            throw new java.lang.IllegalStateException("ContentResolver needed with GservicesDelegateSupplier.init()");
        }
        synchronized (this) {
            try {
                if (this.f40585b == null) {
                    this.f40584a.set(false);
                    this.f40585b = new java.util.HashMap(16, 1.0f);
                    this.f40590g = new java.lang.Object();
                    contentResolver.registerContentObserver(com.google.android.gms.internal.measurement.I2.f40541a, true, new com.google.android.gms.internal.measurement.P2(this, null));
                } else if (this.f40584a.getAndSet(false)) {
                    this.f40585b.clear();
                    this.f40586c.clear();
                    this.f40587d.clear();
                    this.f40588e.clear();
                    this.f40589f.clear();
                    this.f40590g = new java.lang.Object();
                    this.f40591h = false;
                }
                java.lang.Object obj = this.f40590g;
                if (this.f40585b.containsKey(str)) {
                    java.lang.String str3 = (java.lang.String) this.f40585b.get(str);
                    return str3 != null ? str3 : null;
                }
                for (java.lang.String str4 : this.f40592i) {
                    if (str.startsWith(str4)) {
                        if (!this.f40591h) {
                            try {
                                java.util.HashMap map = (java.util.HashMap) this.f40593j.b(contentResolver, this.f40592i, new com.google.android.gms.internal.measurement.R2() { // from class: com.google.android.gms.internal.measurement.M2
                                    @Override // com.google.android.gms.internal.measurement.R2
                                    public final java.util.Map r(int i6) {
                                        return new java.util.HashMap(i6, 1.0f);
                                    }
                                });
                                if (!map.isEmpty()) {
                                    java.util.Set setKeySet = map.keySet();
                                    setKeySet.removeAll(this.f40586c.keySet());
                                    setKeySet.removeAll(this.f40587d.keySet());
                                    setKeySet.removeAll(this.f40588e.keySet());
                                    setKeySet.removeAll(this.f40589f.keySet());
                                }
                                if (!map.isEmpty()) {
                                    if (this.f40585b.isEmpty()) {
                                        this.f40585b = map;
                                    } else {
                                        this.f40585b.putAll(map);
                                    }
                                }
                                this.f40591h = true;
                            } catch (com.google.android.gms.internal.measurement.U2 unused) {
                            }
                            if (this.f40585b.containsKey(str)) {
                                java.lang.String str5 = (java.lang.String) this.f40585b.get(str);
                                return str5 != null ? str5 : null;
                            }
                        }
                        return null;
                    }
                }
                try {
                    java.lang.String strA = this.f40593j.a(contentResolver, str);
                    if (strA != null && strA.equals(null)) {
                        strA = null;
                    }
                    synchronized (this) {
                        try {
                            if (obj == this.f40590g) {
                                this.f40585b.put(str, strA);
                            }
                        } catch (java.lang.Throwable th) {
                            throw th;
                        }
                    }
                    if (strA != null) {
                        return strA;
                    }
                    return null;
                } catch (com.google.android.gms.internal.measurement.U2 unused2) {
                    return null;
                }
            } catch (java.lang.Throwable th2) {
                throw th2;
            }
        }
    }
}
