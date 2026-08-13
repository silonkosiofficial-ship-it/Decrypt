package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Da, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2262Da {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final java.lang.String f26723s = "Da";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final android.content.Context f26724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.util.concurrent.ExecutorService f26725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private dalvik.system.DexClassLoader f26726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C3930ha f26727d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private byte[] f26728e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f26732i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C3381ca f26735l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private com.google.android.gms.internal.ads.S9 f26736m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final java.util.Map f26739p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C5467va f26741r;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile p144o3.a f26729f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile boolean f26730g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private java.util.concurrent.Future f26731h = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile com.google.android.gms.internal.ads.Q8 f26733j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private java.util.concurrent.Future f26734k = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected boolean f26737n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected boolean f26738o = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f26740q = false;

    private C2262Da(android.content.Context context) {
        android.content.Context applicationContext = context.getApplicationContext();
        this.f26732i = applicationContext != null;
        context = applicationContext != null ? applicationContext : context;
        this.f26724a = context;
        this.f26739p = new java.util.HashMap();
        if (this.f26741r != null) {
            return;
        }
        this.f26741r = new com.google.android.gms.internal.ads.C5467va(context);
    }

    public static com.google.android.gms.internal.ads.C2262Da g(android.content.Context context, java.lang.String str, java.lang.String str2, boolean z6, com.google.android.gms.internal.ads.C3381ca c3381ca) throws java.lang.Throwable {
        com.google.android.gms.internal.ads.C2262Da c2262Da = new com.google.android.gms.internal.ads.C2262Da(context);
        try {
            c2262Da.f26725b = java.util.concurrent.Executors.newCachedThreadPool(new com.google.android.gms.internal.ads.ThreadFactoryC5797ya());
            c2262Da.f26730g = z6;
            if (z6) {
                c2262Da.f26731h = c2262Da.f26725b.submit(new com.google.android.gms.internal.ads.RunnableC2151Aa(c2262Da));
            }
            c2262Da.f26725b.execute(new com.google.android.gms.internal.ads.RunnableC2225Ca(c2262Da));
            try {
                N3.C1395h c1395hF = N3.C1395h.f();
                c2262Da.f26737n = c1395hF.a(c2262Da.f26724a) > 0;
                c2262Da.f26738o = c1395hF.g(c2262Da.f26724a) == 0;
            } catch (java.lang.Throwable unused) {
            }
            if (c3381ca != null) {
                c2262Da.f26735l = c3381ca;
            } else {
                c2262Da.o(0, true);
            }
            if (com.google.android.gms.internal.ads.AbstractC2373Ga.c() && ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25695t3)).booleanValue()) {
                throw new java.lang.IllegalStateException("Task Context initialization must not be called from the UI thread.");
            }
            com.google.android.gms.internal.ads.C3930ha c3930ha = new com.google.android.gms.internal.ads.C3930ha(null);
            c2262Da.f26727d = c3930ha;
            try {
                try {
                    byte[] bArrB = com.google.android.gms.internal.ads.AbstractC4219k9.b("NXPtv44zmdtGcAoKWfDQv5BuqJ7K37WVaE+QdtFiH0c=", false);
                    if (bArrB.length != 32) {
                        throw new com.google.android.gms.internal.ads.C3820ga(c3930ha);
                    }
                    byte[] bArr = new byte[16];
                    java.nio.ByteBuffer.wrap(bArrB, 4, 16).get(bArr);
                    for (int i6 = 0; i6 < 16; i6++) {
                        bArr[i6] = (byte) (bArr[i6] ^ 68);
                    }
                    c2262Da.f26728e = bArr;
                    try {
                        try {
                            java.io.File cacheDir = c2262Da.f26724a.getCacheDir();
                            if (cacheDir == null && (cacheDir = c2262Da.f26724a.getDir("dex", 0)) == null) {
                                throw new com.google.android.gms.internal.ads.C5137sa();
                            }
                            java.io.File file = new java.io.File(java.lang.String.format("%s/%s.jar", cacheDir, "1727730429792"));
                            if (!file.exists()) {
                                byte[] bArrB2 = c2262Da.f26727d.b(c2262Da.f26728e, "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");
                                file.createNewFile();
                                java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
                                if (android.os.Build.VERSION.SDK_INT >= 33) {
                                    file.setReadOnly();
                                }
                                fileOutputStream.write(bArrB2, 0, bArrB2.length);
                                fileOutputStream.close();
                            }
                            c2262Da.x(cacheDir, "1727730429792");
                            try {
                                try {
                                    c2262Da.f26726c = new dalvik.system.DexClassLoader(file.getAbsolutePath(), cacheDir.getAbsolutePath(), null, c2262Da.f26724a.getClassLoader());
                                    y(file);
                                    c2262Da.w(cacheDir, "1727730429792");
                                    z(java.lang.String.format("%s/%s.dex", cacheDir, "1727730429792"));
                                    c2262Da.f26736m = new com.google.android.gms.internal.ads.S9(c2262Da);
                                    c2262Da.f26740q = true;
                                } catch (java.lang.SecurityException e6) {
                                    throw new com.google.android.gms.internal.ads.C5137sa(e6);
                                }
                            } catch (java.lang.Throwable th) {
                                y(file);
                                c2262Da.w(cacheDir, "1727730429792");
                                z(java.lang.String.format("%s/%s.dex", cacheDir, "1727730429792"));
                                throw th;
                            }
                        } catch (com.google.android.gms.internal.ads.C3820ga e10) {
                            throw new com.google.android.gms.internal.ads.C5137sa(e10);
                        } catch (java.io.FileNotFoundException e11) {
                            throw new com.google.android.gms.internal.ads.C5137sa(e11);
                        }
                    } catch (java.io.IOException e12) {
                        throw new com.google.android.gms.internal.ads.C5137sa(e12);
                    } catch (java.lang.NullPointerException e13) {
                        throw new com.google.android.gms.internal.ads.C5137sa(e13);
                    }
                    return c2262Da;
                } catch (java.lang.IllegalArgumentException e14) {
                    throw new com.google.android.gms.internal.ads.C3820ga(c3930ha, e14);
                }
            } catch (com.google.android.gms.internal.ads.C3820ga e15) {
                throw new com.google.android.gms.internal.ads.C5137sa(e15);
            }
        } catch (com.google.android.gms.internal.ads.C5137sa unused2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v() {
        try {
            if (this.f26729f == null && this.f26732i) {
                p144o3.a aVar = new p144o3.a(this.f26724a);
                aVar.e();
                this.f26729f = aVar;
            }
        } catch (N3.C1396i | java.io.IOException unused) {
            this.f26729f = null;
        }
    }

    private final void w(java.io.File file, java.lang.String str) throws java.lang.Throwable {
        java.lang.Throwable th;
        java.io.FileOutputStream fileOutputStream;
        java.io.File file2 = new java.io.File(java.lang.String.format("%s/%s.tmp", file, "1727730429792"));
        if (file2.exists()) {
            return;
        }
        java.io.File file3 = new java.io.File(java.lang.String.format("%s/%s.dex", file, "1727730429792"));
        if (file3.exists()) {
            long length = file3.length();
            if (length > 0) {
                byte[] bArr = new byte[(int) length];
                java.io.FileInputStream fileInputStream = null;
                try {
                    java.io.FileInputStream fileInputStream2 = new java.io.FileInputStream(file3);
                    try {
                        try {
                            if (fileInputStream2.read(bArr) <= 0) {
                                try {
                                    fileInputStream2.close();
                                } catch (java.io.IOException unused) {
                                }
                                y(file3);
                                return;
                            }
                            java.io.PrintStream printStream = java.lang.System.out;
                            printStream.print("test");
                            printStream.print("test");
                            printStream.print("test");
                            com.google.android.gms.internal.ads.U8 u8B0 = com.google.android.gms.internal.ads.V8.b0();
                            byte[] bytes = android.os.Build.VERSION.SDK.getBytes();
                            com.google.android.gms.internal.ads.AbstractC3753fv0 abstractC3753fv0 = com.google.android.gms.internal.ads.AbstractC3753fv0.f35478D;
                            u8B0.B(com.google.android.gms.internal.ads.AbstractC3753fv0.T(bytes, 0, bytes.length));
                            byte[] bytes2 = "1727730429792".getBytes();
                            u8B0.C(com.google.android.gms.internal.ads.AbstractC3753fv0.T(bytes2, 0, bytes2.length));
                            byte[] bytes3 = this.f26727d.a(this.f26728e, bArr).getBytes();
                            u8B0.z(com.google.android.gms.internal.ads.AbstractC3753fv0.T(bytes3, 0, bytes3.length));
                            byte[] bArrF = com.google.android.gms.internal.ads.AbstractC5428v9.f(bytes3);
                            u8B0.A(com.google.android.gms.internal.ads.AbstractC3753fv0.T(bArrF, 0, bArrF.length));
                            file2.createNewFile();
                            fileOutputStream = new java.io.FileOutputStream(file2);
                            try {
                                byte[] bArrL = ((com.google.android.gms.internal.ads.V8) u8B0.u()).l();
                                fileOutputStream.write(bArrL, 0, bArrL.length);
                                fileOutputStream.close();
                                try {
                                    fileInputStream2.close();
                                } catch (java.io.IOException unused2) {
                                }
                                try {
                                    fileOutputStream.close();
                                } catch (java.io.IOException unused3) {
                                }
                                y(file3);
                                return;
                            } catch (com.google.android.gms.internal.ads.C3820ga | java.io.IOException | java.security.NoSuchAlgorithmException unused4) {
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                fileInputStream = fileInputStream2;
                                if (fileInputStream != null) {
                                    try {
                                        fileInputStream.close();
                                    } catch (java.io.IOException unused5) {
                                    }
                                }
                                if (fileOutputStream != null) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (java.io.IOException unused6) {
                                    }
                                }
                                y(file3);
                                throw th;
                            }
                        } catch (com.google.android.gms.internal.ads.C3820ga | java.io.IOException | java.security.NoSuchAlgorithmException unused7) {
                            fileOutputStream = null;
                        }
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        fileOutputStream = null;
                    }
                    fileInputStream = fileInputStream2;
                } catch (com.google.android.gms.internal.ads.C3820ga | java.io.IOException | java.security.NoSuchAlgorithmException unused8) {
                    fileOutputStream = null;
                } catch (java.lang.Throwable th4) {
                    th = th4;
                    fileOutputStream = null;
                }
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (java.io.IOException unused9) {
                    }
                }
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (java.io.IOException unused10) {
                    }
                }
                y(file3);
            }
        }
    }

    private final boolean x(java.io.File file, java.lang.String str) throws java.lang.Throwable {
        java.io.FileOutputStream fileOutputStream;
        java.io.File file2 = new java.io.File(java.lang.String.format("%s/%s.tmp", file, "1727730429792"));
        if (!file2.exists()) {
            return false;
        }
        java.io.File file3 = new java.io.File(java.lang.String.format("%s/%s.dex", file, "1727730429792"));
        if (!file3.exists()) {
            java.io.FileInputStream fileInputStream = null;
            try {
                long length = file2.length();
                if (length <= 0) {
                    y(file2);
                    return false;
                }
                byte[] bArr = new byte[(int) length];
                java.io.FileInputStream fileInputStream2 = new java.io.FileInputStream(file2);
                try {
                    try {
                        if (fileInputStream2.read(bArr) <= 0) {
                            java.lang.String str2 = f26723s;
                            y(file2);
                            try {
                                fileInputStream2.close();
                            } catch (java.io.IOException unused) {
                            }
                            return false;
                        }
                        try {
                            try {
                                com.google.android.gms.internal.ads.V8 v8D0 = com.google.android.gms.internal.ads.V8.d0(bArr, com.google.android.gms.internal.ads.C5730xv0.a());
                                if ("1727730429792".equals(new java.lang.String(v8D0.h0().d())) && java.util.Arrays.equals(v8D0.f0().d(), com.google.android.gms.internal.ads.AbstractC5428v9.f(v8D0.e0().d())) && java.util.Arrays.equals(v8D0.g0().d(), android.os.Build.VERSION.SDK.getBytes())) {
                                    byte[] bArrB = this.f26727d.b(this.f26728e, new java.lang.String(v8D0.e0().d()));
                                    file3.createNewFile();
                                    fileOutputStream = new java.io.FileOutputStream(file3);
                                    try {
                                        fileOutputStream.write(bArrB, 0, bArrB.length);
                                        try {
                                            fileInputStream2.close();
                                        } catch (java.io.IOException unused2) {
                                        }
                                        try {
                                            fileOutputStream.close();
                                        } catch (java.io.IOException unused3) {
                                        }
                                        return true;
                                    } catch (com.google.android.gms.internal.ads.C3820ga | java.io.IOException | java.security.NoSuchAlgorithmException unused4) {
                                        fileInputStream = fileInputStream2;
                                        if (fileInputStream != null) {
                                            try {
                                                fileInputStream.close();
                                            } catch (java.io.IOException unused5) {
                                            }
                                        }
                                        if (fileOutputStream != null) {
                                            try {
                                                fileOutputStream.close();
                                            } catch (java.io.IOException unused6) {
                                            }
                                        }
                                        return false;
                                    } catch (java.lang.Throwable th) {
                                        th = th;
                                        fileInputStream = fileInputStream2;
                                        if (fileInputStream != null) {
                                            try {
                                                fileInputStream.close();
                                            } catch (java.io.IOException unused7) {
                                            }
                                        }
                                        if (fileOutputStream == null) {
                                            throw th;
                                        }
                                        try {
                                            fileOutputStream.close();
                                            throw th;
                                        } catch (java.io.IOException unused8) {
                                            throw th;
                                        }
                                    }
                                }
                                y(file2);
                                try {
                                    fileInputStream2.close();
                                } catch (java.io.IOException unused9) {
                                }
                                return false;
                            } catch (java.lang.NullPointerException unused10) {
                                fileInputStream2.close();
                                return false;
                            }
                        } catch (java.io.IOException unused11) {
                            return false;
                        }
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        fileOutputStream = null;
                    }
                } catch (com.google.android.gms.internal.ads.C3820ga | java.io.IOException | java.security.NoSuchAlgorithmException unused12) {
                    fileOutputStream = null;
                }
            } catch (com.google.android.gms.internal.ads.C3820ga | java.io.IOException | java.security.NoSuchAlgorithmException unused13) {
                fileOutputStream = null;
            } catch (java.lang.Throwable th3) {
                th = th3;
                fileOutputStream = null;
            }
        }
        return false;
    }

    private static final void y(java.io.File file) {
        if (file.exists()) {
            file.delete();
        } else {
            java.lang.String str = f26723s;
            java.lang.String.format("File %s not found. No need for deletion", file.getAbsolutePath());
        }
    }

    private static final void z(java.lang.String str) {
        y(new java.io.File(str));
    }

    public final int a() {
        if (this.f26736m != null) {
            return com.google.android.gms.internal.ads.S9.d();
        }
        return Integer.MIN_VALUE;
    }

    public final android.content.Context b() {
        return this.f26724a;
    }

    public final com.google.android.gms.internal.ads.Q8 c() {
        com.google.android.gms.internal.ads.C3381ca c3381ca = this.f26735l;
        if (c3381ca == null) {
            return this.f26733j;
        }
        if (c3381ca.a() == null || !c3381ca.a().isDone()) {
            return com.google.android.gms.internal.ads.Q8.W0();
        }
        try {
            return (com.google.android.gms.internal.ads.Q8) this.f26735l.a().get();
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException unused) {
            return com.google.android.gms.internal.ads.Q8.W0();
        }
    }

    public final com.google.android.gms.internal.ads.S9 d() {
        return this.f26736m;
    }

    public final com.google.android.gms.internal.ads.C3930ha e() {
        return this.f26727d;
    }

    final com.google.android.gms.internal.ads.C5467va f() {
        return this.f26741r;
    }

    public final p144o3.a h() {
        java.util.concurrent.Future future;
        if (!this.f26730g) {
            return null;
        }
        if (this.f26729f == null && (future = this.f26731h) != null) {
            try {
                future.get(2000L, java.util.concurrent.TimeUnit.MILLISECONDS);
                this.f26731h = null;
            } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException unused) {
            } catch (java.util.concurrent.TimeoutException unused2) {
                this.f26731h.cancel(true);
            }
        }
        return this.f26729f;
    }

    public final dalvik.system.DexClassLoader i() {
        return this.f26726c;
    }

    public final java.lang.reflect.Method j(java.lang.String str, java.lang.String str2) {
        com.google.android.gms.internal.ads.C5139sb c5139sb = (com.google.android.gms.internal.ads.C5139sb) this.f26739p.get(new android.util.Pair(str, str2));
        if (c5139sb == null) {
            return null;
        }
        return c5139sb.a();
    }

    public final java.util.concurrent.ExecutorService k() {
        return this.f26725b;
    }

    public final java.util.concurrent.Future l() {
        com.google.android.gms.internal.ads.C3381ca c3381ca = this.f26735l;
        return c3381ca != null ? c3381ca.a() : this.f26734k;
    }

    final void o(int i6, boolean z6) {
        if (this.f26738o) {
            java.util.concurrent.Future<?> futureSubmit = this.f26725b.submit(new com.google.android.gms.internal.ads.RunnableC2188Ba(this, i6, true));
            if (i6 == 0) {
                this.f26734k = futureSubmit;
            }
        }
    }

    public final boolean p() {
        return this.f26738o;
    }

    public final boolean q() {
        return this.f26737n;
    }

    public final boolean r() {
        return this.f26740q;
    }

    public final boolean s() {
        return this.f26741r.a();
    }

    public final boolean t(java.lang.String str, java.lang.String str2, java.lang.Class... clsArr) {
        android.util.Pair pair = new android.util.Pair(str, str2);
        if (this.f26739p.containsKey(pair)) {
            return false;
        }
        this.f26739p.put(pair, new com.google.android.gms.internal.ads.C5139sb(this, str, str2, clsArr));
        return true;
    }

    public final byte[] u() {
        return this.f26728e;
    }
}
