package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ff, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2346Ff {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    java.lang.String f27435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    android.content.Context f27436e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    java.lang.String f27437f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private java.util.concurrent.atomic.AtomicBoolean f27439h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private java.io.File f27440i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final java.util.concurrent.BlockingQueue f27432a = new java.util.concurrent.ArrayBlockingQueue(100);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final java.util.LinkedHashMap f27433b = new java.util.LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final java.util.Map f27434c = new java.util.HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.util.HashSet f27438g = new java.util.HashSet(java.util.Arrays.asList("noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"));

    public static /* synthetic */ void c(com.google.android.gms.internal.ads.C2346Ff c2346Ff) throws java.lang.Throwable {
        while (true) {
            try {
                com.google.android.gms.internal.ads.C2752Qf c2752Qf = (com.google.android.gms.internal.ads.C2752Qf) c2346Ff.f27432a.take();
                com.google.android.gms.internal.ads.C2678Of c2678OfA = c2752Qf.a();
                if (!android.text.TextUtils.isEmpty(c2678OfA.b())) {
                    c2346Ff.g(c2346Ff.b(c2346Ff.f27433b, c2752Qf.b()), c2678OfA);
                }
            } catch (java.lang.InterruptedException e6) {
                p224w3.p.h("CsiReporter:reporter interrupted", e6);
                return;
            }
        }
    }

    private final void g(java.util.Map map, com.google.android.gms.internal.ads.C2678Of c2678Of) throws java.lang.Throwable {
        android.net.Uri.Builder builderBuildUpon = android.net.Uri.parse(this.f27435d).buildUpon();
        for (java.util.Map.Entry entry : map.entrySet()) {
            builderBuildUpon.appendQueryParameter((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
        }
        java.lang.String string = builderBuildUpon.build().toString();
        if (c2678Of != null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(string);
            if (!android.text.TextUtils.isEmpty(c2678Of.b())) {
                sb.append("&it=");
                sb.append(c2678Of.b());
            }
            if (!android.text.TextUtils.isEmpty(c2678Of.a())) {
                sb.append("&blat=");
                sb.append(c2678Of.a());
            }
            string = sb.toString();
        }
        if (!this.f27439h.get()) {
            p174r3.v.t();
            p214v3.E0.m(this.f27436e, this.f27437f, string);
            return;
        }
        java.io.File file = this.f27440i;
        if (file == null) {
            p224w3.p.g("CsiReporter: File doesn't exist. Cannot write CSI data to file.");
            return;
        }
        java.io.FileOutputStream fileOutputStream = null;
        try {
            try {
                java.io.FileOutputStream fileOutputStream2 = new java.io.FileOutputStream(file, true);
                try {
                    fileOutputStream2.write(string.getBytes());
                    fileOutputStream2.write(10);
                    try {
                        fileOutputStream2.close();
                    } catch (java.io.IOException e6) {
                        p224w3.p.h("CsiReporter: Cannot close file: sdk_csi_data.txt.", e6);
                    }
                } catch (java.io.IOException e10) {
                    e = e10;
                    fileOutputStream = fileOutputStream2;
                    p224w3.p.h("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (java.io.IOException e11) {
                            p224w3.p.h("CsiReporter: Cannot close file: sdk_csi_data.txt.", e11);
                        }
                    }
                } catch (java.lang.Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (java.io.IOException e12) {
                            p224w3.p.h("CsiReporter: Cannot close file: sdk_csi_data.txt.", e12);
                        }
                    }
                    throw th;
                }
            } catch (java.io.IOException e13) {
                e = e13;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    public final com.google.android.gms.internal.ads.AbstractC2568Lf a(java.lang.String str) {
        com.google.android.gms.internal.ads.AbstractC2568Lf abstractC2568Lf = (com.google.android.gms.internal.ads.AbstractC2568Lf) this.f27434c.get(str);
        return abstractC2568Lf != null ? abstractC2568Lf : com.google.android.gms.internal.ads.AbstractC2568Lf.f29536a;
    }

    final java.util.Map b(java.util.Map map, java.util.Map map2) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(map);
        for (java.util.Map.Entry entry : map2.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.lang.String str2 = (java.lang.String) entry.getValue();
            linkedHashMap.put(str, a(str).a((java.lang.String) linkedHashMap.get(str), str2));
        }
        return linkedHashMap;
    }

    public final void d(android.content.Context context, java.lang.String str, java.lang.String str2, java.util.Map map) {
        java.io.File externalStorageDirectory;
        this.f27436e = context;
        this.f27437f = str;
        this.f27435d = str2;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f27439h = atomicBoolean;
        atomicBoolean.set(((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC5699xg.f39898c.e()).booleanValue());
        if (this.f27439h.get() && (externalStorageDirectory = android.os.Environment.getExternalStorageDirectory()) != null) {
            this.f27440i = new java.io.File(com.google.android.gms.internal.ads.AbstractC4267ke0.a(com.google.android.gms.internal.ads.AbstractC4157je0.a(), externalStorageDirectory, "sdk_csi_data.txt"));
        }
        for (java.util.Map.Entry entry : map.entrySet()) {
            this.f27433b.put((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
        }
        com.google.android.gms.internal.ads.AbstractC3524dr.f34795a.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.Ef
            @Override // java.lang.Runnable
            public final void run() throws java.lang.Throwable {
                com.google.android.gms.internal.ads.C2346Ff.c(this.f27097C);
            }
        });
        java.util.Map map2 = this.f27434c;
        com.google.android.gms.internal.ads.AbstractC2568Lf abstractC2568Lf = com.google.android.gms.internal.ads.AbstractC2568Lf.f29537b;
        map2.put("action", abstractC2568Lf);
        this.f27434c.put("ad_format", abstractC2568Lf);
        this.f27434c.put("e", com.google.android.gms.internal.ads.AbstractC2568Lf.f29538c);
    }

    public final void e(java.lang.String str) throws java.lang.Throwable {
        if (this.f27438g.contains(str)) {
            return;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("sdkVersion", this.f27437f);
        linkedHashMap.put("ue", str);
        g(b(this.f27433b, linkedHashMap), null);
    }

    public final boolean f(com.google.android.gms.internal.ads.C2752Qf c2752Qf) {
        return this.f27432a.offer(c2752Qf);
    }
}
