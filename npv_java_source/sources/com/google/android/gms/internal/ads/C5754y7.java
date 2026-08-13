package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.y7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5754y7 implements com.google.android.gms.internal.ads.N6 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5644x7 f39990c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map f39988a = new java.util.LinkedHashMap(16, 0.75f, true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f39989b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f39991d = 5242880;

    public C5754y7(com.google.android.gms.internal.ads.InterfaceC5644x7 interfaceC5644x7, int i6) {
        this.f39990c = interfaceC5644x7;
    }

    public C5754y7(java.io.File file, int i6) {
        this.f39990c = new com.google.android.gms.internal.ads.C5314u7(this, file);
    }

    static int a(java.io.InputStream inputStream) {
        return (k(inputStream) << 24) | k(inputStream) | (k(inputStream) << 8) | (k(inputStream) << 16);
    }

    static long c(java.io.InputStream inputStream) {
        return (((long) k(inputStream)) & 255) | ((((long) k(inputStream)) & 255) << 8) | ((((long) k(inputStream)) & 255) << 16) | ((((long) k(inputStream)) & 255) << 24) | ((((long) k(inputStream)) & 255) << 32) | ((((long) k(inputStream)) & 255) << 40) | ((((long) k(inputStream)) & 255) << 48) | ((((long) k(inputStream)) & 255) << 56);
    }

    static java.lang.String e(com.google.android.gms.internal.ads.C5534w7 c5534w7) {
        return new java.lang.String(j(c5534w7, c(c5534w7)), "UTF-8");
    }

    static void g(java.io.OutputStream outputStream, int i6) throws java.io.IOException {
        outputStream.write(i6 & 255);
        outputStream.write((i6 >> 8) & 255);
        outputStream.write((i6 >> 16) & 255);
        outputStream.write((i6 >> 24) & 255);
    }

    static void h(java.io.OutputStream outputStream, long j6) throws java.io.IOException {
        outputStream.write((byte) j6);
        outputStream.write((byte) (j6 >>> 8));
        outputStream.write((byte) (j6 >>> 16));
        outputStream.write((byte) (j6 >>> 24));
        outputStream.write((byte) (j6 >>> 32));
        outputStream.write((byte) (j6 >>> 40));
        outputStream.write((byte) (j6 >>> 48));
        outputStream.write((byte) (j6 >>> 56));
    }

    static void i(java.io.OutputStream outputStream, java.lang.String str) throws java.io.IOException {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        h(outputStream, length);
        outputStream.write(bytes, 0, length);
    }

    static byte[] j(com.google.android.gms.internal.ads.C5534w7 c5534w7, long j6) throws java.io.IOException {
        long jA = c5534w7.a();
        if (j6 >= 0 && j6 <= jA) {
            int i6 = (int) j6;
            if (i6 == j6) {
                byte[] bArr = new byte[i6];
                new java.io.DataInputStream(c5534w7).readFully(bArr);
                return bArr;
            }
        }
        throw new java.io.IOException("streamToBytes length=" + j6 + ", maxLength=" + jA);
    }

    private static int k(java.io.InputStream inputStream) throws java.io.IOException {
        int i6 = inputStream.read();
        if (i6 != -1) {
            return i6;
        }
        throw new java.io.EOFException();
    }

    private final void l(java.lang.String str, com.google.android.gms.internal.ads.C5424v7 c5424v7) {
        if (this.f39988a.containsKey(str)) {
            this.f39989b += c5424v7.f39332a - ((com.google.android.gms.internal.ads.C5424v7) this.f39988a.get(str)).f39332a;
        } else {
            this.f39989b += c5424v7.f39332a;
        }
        this.f39988a.put(str, c5424v7);
    }

    private final void m(java.lang.String str) {
        com.google.android.gms.internal.ads.C5424v7 c5424v7 = (com.google.android.gms.internal.ads.C5424v7) this.f39988a.remove(str);
        if (c5424v7 != null) {
            this.f39989b -= c5424v7.f39332a;
        }
    }

    private static final java.lang.String n(java.lang.String str) {
        int length = str.length() / 2;
        return java.lang.String.valueOf(java.lang.String.valueOf(str.substring(0, length).hashCode())).concat(java.lang.String.valueOf(java.lang.String.valueOf(str.substring(length).hashCode())));
    }

    @Override // com.google.android.gms.internal.ads.N6
    public final synchronized void b() {
        synchronized (this) {
            java.io.File fileA = this.f39990c.a();
            if (fileA.exists()) {
                java.io.File[] fileArrListFiles = fileA.listFiles();
                if (fileArrListFiles != null) {
                    for (java.io.File file : fileArrListFiles) {
                        try {
                            long length = file.length();
                            com.google.android.gms.internal.ads.C5534w7 c5534w7 = new com.google.android.gms.internal.ads.C5534w7(new java.io.BufferedInputStream(new java.io.FileInputStream(file)), length);
                            try {
                                com.google.android.gms.internal.ads.C5424v7 c5424v7A = com.google.android.gms.internal.ads.C5424v7.a(c5534w7);
                                c5424v7A.f39332a = length;
                                l(c5424v7A.f39333b, c5424v7A);
                                c5534w7.close();
                            } catch (java.lang.Throwable th) {
                                c5534w7.close();
                                throw th;
                            }
                        } catch (java.io.IOException unused) {
                            file.delete();
                        }
                    }
                }
            } else if (!fileA.mkdirs()) {
                com.google.android.gms.internal.ads.AbstractC4545n7.b("Unable to create cache dir %s", fileA.getAbsolutePath());
            }
        }
    }

    public final java.io.File d(java.lang.String str) {
        return new java.io.File(this.f39990c.a(), n(str));
    }

    public final synchronized void f(java.lang.String str) {
        boolean zDelete = d(str).delete();
        m(str);
        if (zDelete) {
            return;
        }
        com.google.android.gms.internal.ads.AbstractC4545n7.a("Could not delete cache entry for key=%s, filename=%s", str, n(str));
    }

    @Override // com.google.android.gms.internal.ads.N6
    public final synchronized com.google.android.gms.internal.ads.M6 o(java.lang.String str) {
        com.google.android.gms.internal.ads.C5424v7 c5424v7 = (com.google.android.gms.internal.ads.C5424v7) this.f39988a.get(str);
        if (c5424v7 == null) {
            return null;
        }
        java.io.File fileD = d(str);
        try {
            com.google.android.gms.internal.ads.C5534w7 c5534w7 = new com.google.android.gms.internal.ads.C5534w7(new java.io.BufferedInputStream(new java.io.FileInputStream(fileD)), fileD.length());
            try {
                com.google.android.gms.internal.ads.C5424v7 c5424v7A = com.google.android.gms.internal.ads.C5424v7.a(c5534w7);
                if (!android.text.TextUtils.equals(str, c5424v7A.f39333b)) {
                    com.google.android.gms.internal.ads.AbstractC4545n7.a("%s: key=%s, found=%s", fileD.getAbsolutePath(), str, c5424v7A.f39333b);
                    m(str);
                    c5534w7.close();
                    return null;
                }
                byte[] bArrJ = j(c5534w7, c5534w7.a());
                com.google.android.gms.internal.ads.M6 m6 = new com.google.android.gms.internal.ads.M6();
                m6.f29656a = bArrJ;
                m6.f29657b = c5424v7.f39334c;
                m6.f29658c = c5424v7.f39335d;
                m6.f29659d = c5424v7.f39336e;
                m6.f29660e = c5424v7.f39337f;
                m6.f29661f = c5424v7.f39338g;
                java.util.List<com.google.android.gms.internal.ads.V6> list = c5424v7.f39339h;
                java.util.TreeMap treeMap = new java.util.TreeMap(java.lang.String.CASE_INSENSITIVE_ORDER);
                for (com.google.android.gms.internal.ads.V6 v6 : list) {
                    treeMap.put(v6.a(), v6.b());
                }
                m6.f29662g = treeMap;
                m6.f29663h = j$.util.DesugarCollections.unmodifiableList(c5424v7.f39339h);
                c5534w7.close();
                return m6;
            } catch (java.lang.Throwable th) {
                c5534w7.close();
                throw th;
            }
        } catch (java.io.IOException e6) {
            com.google.android.gms.internal.ads.AbstractC4545n7.a("%s: %s", fileD.getAbsolutePath(), e6.toString());
            f(str);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.N6
    public final synchronized void p(java.lang.String str, boolean z6) {
        com.google.android.gms.internal.ads.M6 m6O = o(str);
        if (m6O != null) {
            m6O.f29661f = 0L;
            m6O.f29660e = 0L;
            q(str, m6O);
        }
    }

    @Override // com.google.android.gms.internal.ads.N6
    public final synchronized void q(java.lang.String str, com.google.android.gms.internal.ads.M6 m6) {
        try {
            long j6 = this.f39989b;
            int length = m6.f29656a.length;
            long j10 = j6 + ((long) length);
            int i6 = this.f39991d;
            if (j10 <= i6 || length <= i6 * 0.9f) {
                java.io.File fileD = d(str);
                try {
                    java.io.BufferedOutputStream bufferedOutputStream = new java.io.BufferedOutputStream(new java.io.FileOutputStream(fileD));
                    com.google.android.gms.internal.ads.C5424v7 c5424v7 = new com.google.android.gms.internal.ads.C5424v7(str, m6);
                    try {
                        g(bufferedOutputStream, 538247942);
                        i(bufferedOutputStream, c5424v7.f39333b);
                        java.lang.String str2 = c5424v7.f39334c;
                        if (str2 == null) {
                            str2 = "";
                        }
                        i(bufferedOutputStream, str2);
                        h(bufferedOutputStream, c5424v7.f39335d);
                        h(bufferedOutputStream, c5424v7.f39336e);
                        h(bufferedOutputStream, c5424v7.f39337f);
                        h(bufferedOutputStream, c5424v7.f39338g);
                        java.util.List<com.google.android.gms.internal.ads.V6> list = c5424v7.f39339h;
                        if (list != null) {
                            g(bufferedOutputStream, list.size());
                            for (com.google.android.gms.internal.ads.V6 v6 : list) {
                                i(bufferedOutputStream, v6.a());
                                i(bufferedOutputStream, v6.b());
                            }
                        } else {
                            g(bufferedOutputStream, 0);
                        }
                        bufferedOutputStream.flush();
                        bufferedOutputStream.write(m6.f29656a);
                        bufferedOutputStream.close();
                        c5424v7.f39332a = fileD.length();
                        l(str, c5424v7);
                        if (this.f39989b >= this.f39991d) {
                            if (com.google.android.gms.internal.ads.AbstractC4545n7.f37506b) {
                                com.google.android.gms.internal.ads.AbstractC4545n7.d("Pruning old cache entries.", new java.lang.Object[0]);
                            }
                            long j11 = this.f39989b;
                            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                            java.util.Iterator it = this.f39988a.entrySet().iterator();
                            int i10 = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    j11 = j11;
                                    break;
                                }
                                com.google.android.gms.internal.ads.C5424v7 c5424v8 = (com.google.android.gms.internal.ads.C5424v7) ((java.util.Map.Entry) it.next()).getValue();
                                if (d(c5424v8.f39333b).delete()) {
                                    this.f39989b -= c5424v8.f39332a;
                                } else {
                                    java.lang.String str3 = c5424v8.f39333b;
                                    com.google.android.gms.internal.ads.AbstractC4545n7.a("Could not delete cache entry for key=%s, filename=%s", str3, n(str3));
                                }
                                it.remove();
                                i10++;
                                if (this.f39989b < this.f39991d * 0.9f) {
                                    break;
                                } else {
                                    j11 = j11;
                                }
                            }
                            if (com.google.android.gms.internal.ads.AbstractC4545n7.f37506b) {
                                com.google.android.gms.internal.ads.AbstractC4545n7.d("pruned %d files, %d bytes, %d ms", java.lang.Integer.valueOf(i10), java.lang.Long.valueOf(this.f39989b - j11), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - jElapsedRealtime));
                            }
                        }
                    } catch (java.io.IOException e6) {
                        com.google.android.gms.internal.ads.AbstractC4545n7.a("%s", e6.toString());
                        bufferedOutputStream.close();
                        com.google.android.gms.internal.ads.AbstractC4545n7.a("Failed to write header for %s", fileD.getAbsolutePath());
                        throw new java.io.IOException();
                    }
                } catch (java.io.IOException unused) {
                    if (!fileD.delete()) {
                        com.google.android.gms.internal.ads.AbstractC4545n7.a("Could not clean up file %s", fileD.getAbsolutePath());
                    }
                    if (!this.f39990c.a().exists()) {
                        com.google.android.gms.internal.ads.AbstractC4545n7.a("Re-initializing cache after external clearing.", new java.lang.Object[0]);
                        this.f39988a.clear();
                        this.f39989b = 0L;
                        b();
                    }
                }
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }
}
