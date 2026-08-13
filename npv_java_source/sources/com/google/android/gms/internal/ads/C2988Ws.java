package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ws, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2988Ws extends com.google.android.gms.internal.ads.AbstractC2880Ts {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static final java.util.Set f32816H = j$.util.DesugarCollections.synchronizedSet(new java.util.HashSet());

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private static final java.text.DecimalFormat f32817I = new java.text.DecimalFormat("#,###");

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final /* synthetic */ int f32818J = 0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private java.io.File f32819F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private boolean f32820G;

    public C2988Ws(com.google.android.gms.internal.ads.InterfaceC3746fs interfaceC3746fs) {
        super(interfaceC3746fs);
        java.io.File cacheDir = this.f32023C.getCacheDir();
        if (cacheDir == null) {
            p224w3.p.g("Context.getCacheDir() returned null");
            return;
        }
        java.io.File file = new java.io.File(com.google.android.gms.internal.ads.AbstractC4267ke0.a(com.google.android.gms.internal.ads.AbstractC4157je0.a(), cacheDir, "admobVideoStreams"));
        this.f32819F = file;
        if (!file.isDirectory() && !this.f32819F.mkdirs()) {
            p224w3.p.g("Could not create preload cache directory at ".concat(java.lang.String.valueOf(this.f32819F.getAbsolutePath())));
            this.f32819F = null;
        } else {
            if (this.f32819F.setReadable(true, false) && this.f32819F.setExecutable(true, false)) {
                return;
            }
            p224w3.p.g("Could not set cache file permissions at ".concat(java.lang.String.valueOf(this.f32819F.getAbsolutePath())));
            this.f32819F = null;
        }
    }

    private final java.io.File t(java.io.File file) {
        return new java.io.File(com.google.android.gms.internal.ads.AbstractC4267ke0.a(com.google.android.gms.internal.ads.AbstractC4157je0.a(), this.f32819F, java.lang.String.valueOf(file.getName()).concat(".done")));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2880Ts
    public final void c() {
        this.f32820G = true;
    }

    /* JADX WARN: Code duplicated, block: B:165:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:169:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:170:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:173:0x041c  */
    /* JADX WARN: Instruction removed from duplicated block: B:169:0x03e3, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:170:0x03fd, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.AbstractC2880Ts
    public final boolean p(final java.lang.String str) {
        int i6;
        java.lang.String str2;
        java.lang.String str3;
        java.io.FileOutputStream fileOutputStream;
        java.lang.String str4;
        java.lang.String str5;
        int responseCode;
        java.lang.String str6;
        boolean zDelete;
        java.io.FileOutputStream fileOutputStream2 = null;
        if (this.f32819F == null) {
            d(str, null, "noCacheDir", null);
            return false;
        }
        do {
            java.io.File file = this.f32819F;
            if (file == null) {
                i6 = 0;
            } else {
                i6 = 0;
                for (java.io.File file2 : file.listFiles()) {
                    if (!file2.getName().endsWith(".done")) {
                        i6++;
                    }
                }
            }
            if (i6 <= ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25661q)).intValue()) {
                java.io.File file3 = new java.io.File(com.google.android.gms.internal.ads.AbstractC4267ke0.a(com.google.android.gms.internal.ads.AbstractC4157je0.a(), this.f32819F, p224w3.g.h(str)));
                java.io.File fileT = t(file3);
                if (file3.isFile() && fileT.isFile()) {
                    int length = (int) file3.length();
                    p224w3.p.b("Stream cache hit at ".concat(java.lang.String.valueOf(str)));
                    e(str, file3.getAbsolutePath(), length);
                    return true;
                }
                java.lang.String strValueOf = java.lang.String.valueOf(this.f32819F.getAbsolutePath());
                java.lang.String strValueOf2 = java.lang.String.valueOf(str);
                java.util.Set set = f32816H;
                java.lang.String strConcat = strValueOf.concat(strValueOf2);
                synchronized (set) {
                    try {
                        if (set.contains(strConcat)) {
                            p224w3.p.g("Stream cache already in progress at " + str);
                            d(str, file3.getAbsolutePath(), "inProgress", null);
                            return false;
                        }
                        set.add(strConcat);
                        java.lang.String str7 = "error";
                        try {
                            java.net.HttpURLConnection httpURLConnectionS = com.google.android.gms.internal.ads.AbstractC5256te0.a().s(new com.google.android.gms.internal.ads.InterfaceC5916ze0() { // from class: com.google.android.gms.internal.ads.Vs
                                @Override // com.google.android.gms.internal.ads.InterfaceC5916ze0
                                public final java.net.URLConnection a() throws java.io.IOException {
                                    int i10 = com.google.android.gms.internal.ads.C2988Ws.f32818J;
                                    p174r3.v.A();
                                    int iIntValue = ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25338M)).intValue();
                                    java.net.URL url = new java.net.URL(str);
                                    int i11 = 0;
                                    while (true) {
                                        i11++;
                                        if (i11 > 20) {
                                            throw new java.io.IOException("Too many redirects (20)");
                                        }
                                        java.net.URLConnection uRLConnectionOpenConnection = url.openConnection();
                                        uRLConnectionOpenConnection.setConnectTimeout(iIntValue);
                                        uRLConnectionOpenConnection.setReadTimeout(iIntValue);
                                        if (!(uRLConnectionOpenConnection instanceof java.net.HttpURLConnection)) {
                                            throw new java.io.IOException("Invalid protocol.");
                                        }
                                        java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) uRLConnectionOpenConnection;
                                        p224w3.m mVar = new p224w3.m(null);
                                        mVar.c(httpURLConnection, null);
                                        httpURLConnection.setInstanceFollowRedirects(false);
                                        int responseCode2 = httpURLConnection.getResponseCode();
                                        mVar.e(httpURLConnection, responseCode2);
                                        if (responseCode2 / 100 != 3) {
                                            return httpURLConnection;
                                        }
                                        java.lang.String headerField = httpURLConnection.getHeaderField("Location");
                                        if (headerField == null) {
                                            throw new java.io.IOException("Missing Location header in redirect");
                                        }
                                        java.net.URL url2 = new java.net.URL(url, headerField);
                                        java.lang.String protocol = url2.getProtocol();
                                        if (protocol == null) {
                                            throw new java.io.IOException("Protocol is null");
                                        }
                                        if (!protocol.equals("http") && !protocol.equals("https")) {
                                            throw new java.io.IOException("Unsupported scheme: ".concat(protocol));
                                        }
                                        p224w3.p.b("Redirecting to ".concat(headerField));
                                        httpURLConnection.disconnect();
                                        url = url2;
                                    }
                                }
                            }, 265, -1);
                            if (!(httpURLConnectionS instanceof java.net.HttpURLConnection) || (responseCode = httpURLConnectionS.getResponseCode()) < 400) {
                                int contentLength = httpURLConnectionS.getContentLength();
                                if (contentLength < 0) {
                                    p224w3.p.g("Stream cache aborted, missing content-length header at " + str);
                                    d(str, file3.getAbsolutePath(), "contentLengthMissing", null);
                                    set.remove(strConcat);
                                    return false;
                                }
                                java.lang.String str8 = f32817I.format(contentLength);
                                int iIntValue = ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25671r)).intValue();
                                if (contentLength > iIntValue) {
                                    p224w3.p.g("Content length " + str8 + " exceeds limit at " + str);
                                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                    sb.append("File too big for full file cache. Size: ");
                                    sb.append(str8);
                                    d(str, file3.getAbsolutePath(), "sizeExceeded", sb.toString());
                                    set.remove(strConcat);
                                    return false;
                                }
                                p224w3.p.b("Caching " + str8 + " bytes from " + str);
                                java.nio.channels.ReadableByteChannel readableByteChannelNewChannel = java.nio.channels.Channels.newChannel(httpURLConnectionS.getInputStream());
                                java.io.FileOutputStream fileOutputStream3 = new java.io.FileOutputStream(file3);
                                try {
                                    java.nio.channels.FileChannel channel = fileOutputStream3.getChannel();
                                    java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(1048576);
                                    V3.f fVarC = p174r3.v.c();
                                    long jA = fVarC.a();
                                    p214v3.C7233a0 c7233a0 = new p214v3.C7233a0(((java.lang.Long) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25327L)).longValue());
                                    com.google.android.gms.internal.ads.AbstractC5037rf abstractC5037rf = com.google.android.gms.internal.ads.AbstractC2161Af.f25316K;
                                    com.google.android.gms.internal.ads.SharedPreferencesOnSharedPreferenceChangeListenerC5807yf sharedPreferencesOnSharedPreferenceChangeListenerC5807yfC = p184s3.A.c();
                                    long jLongValue = ((java.lang.Long) sharedPreferencesOnSharedPreferenceChangeListenerC5807yfC.a(abstractC5037rf)).longValue();
                                    int i10 = 0;
                                    while (true) {
                                        int i11 = readableByteChannelNewChannel.read(byteBufferAllocate);
                                        if (i11 >= 0) {
                                            i10 += i11;
                                            try {
                                                try {
                                                    if (i10 > iIntValue) {
                                                        java.lang.String str9 = "File too big for full file cache. Size: " + java.lang.Integer.toString(i10);
                                                        throw new java.io.IOException("stream cache file size limit exceeded");
                                                    }
                                                    try {
                                                        byteBufferAllocate.flip();
                                                        while (channel.write(byteBufferAllocate) > 0) {
                                                        }
                                                        byteBufferAllocate.clear();
                                                        if (fVarC.a() - jA > 1000 * jLongValue) {
                                                            java.lang.String str10 = "Timeout exceeded. Limit: " + java.lang.Long.toString(jLongValue) + " sec";
                                                            throw new java.io.IOException("stream cache time limit exceeded");
                                                        }
                                                        java.nio.ByteBuffer byteBuffer = byteBufferAllocate;
                                                        if (this.f32820G) {
                                                            throw new java.io.IOException("abort requested");
                                                        }
                                                        if (c7233a0.b()) {
                                                            str4 = str7;
                                                            try {
                                                                str5 = strConcat;
                                                                fileOutputStream = fileOutputStream3;
                                                                try {
                                                                    try {
                                                                        p224w3.g.f56228b.post(new com.google.android.gms.internal.ads.RunnableC2623Ms(this, str, file3.getAbsolutePath(), i10, contentLength, false));
                                                                    } catch (java.io.IOException e6) {
                                                                        e = e6;
                                                                    }
                                                                } catch (java.lang.RuntimeException e10) {
                                                                    e = e10;
                                                                }
                                                            } catch (java.io.IOException e11) {
                                                                e = e11;
                                                                fileOutputStream = fileOutputStream3;
                                                                str5 = strConcat;
                                                                str2 = str5;
                                                                str7 = str4;
                                                                fileOutputStream2 = fileOutputStream;
                                                                str3 = 0;
                                                                if (e instanceof java.lang.RuntimeException) {
                                                                    p174r3.v.s().x(e, "VideoStreamFullFileCache.preload");
                                                                }
                                                                fileOutputStream2.close();
                                                                if (this.f32820G) {
                                                                    p224w3.p.f("Preload aborted for URL \"" + str + "\"");
                                                                } else {
                                                                    p224w3.p.h("Preload failed for URL \"" + str + "\"", e);
                                                                }
                                                                if (file3.exists()) {
                                                                    p224w3.p.g("Could not delete partial cache file at ".concat(java.lang.String.valueOf(file3.getAbsolutePath())));
                                                                }
                                                                d(str, file3.getAbsolutePath(), str7, str3);
                                                                f32816H.remove(str2);
                                                                return false;
                                                            } catch (java.lang.RuntimeException e12) {
                                                                e = e12;
                                                                fileOutputStream = fileOutputStream3;
                                                                str5 = strConcat;
                                                                str2 = str5;
                                                                str7 = str4;
                                                                fileOutputStream2 = fileOutputStream;
                                                                str3 = 0;
                                                                if (e instanceof java.lang.RuntimeException) {
                                                                    p174r3.v.s().x(e, "VideoStreamFullFileCache.preload");
                                                                }
                                                                fileOutputStream2.close();
                                                                if (this.f32820G) {
                                                                    p224w3.p.f("Preload aborted for URL \"" + str + "\"");
                                                                } else {
                                                                    p224w3.p.h("Preload failed for URL \"" + str + "\"", e);
                                                                }
                                                                if (file3.exists()) {
                                                                    p224w3.p.g("Could not delete partial cache file at ".concat(java.lang.String.valueOf(file3.getAbsolutePath())));
                                                                }
                                                                d(str, file3.getAbsolutePath(), str7, str3);
                                                                f32816H.remove(str2);
                                                                return false;
                                                            }
                                                        } else {
                                                            fileOutputStream = fileOutputStream3;
                                                            str5 = strConcat;
                                                            str4 = str7;
                                                        }
                                                        byteBufferAllocate = byteBuffer;
                                                        readableByteChannelNewChannel = readableByteChannelNewChannel;
                                                        str7 = str4;
                                                        c7233a0 = c7233a0;
                                                        strConcat = str5;
                                                        channel = channel;
                                                        fileOutputStream3 = fileOutputStream;
                                                        iIntValue = iIntValue;
                                                        contentLength = contentLength;
                                                    } catch (java.io.IOException e13) {
                                                        e = e13;
                                                        fileOutputStream = fileOutputStream3;
                                                        str5 = strConcat;
                                                        str4 = str7;
                                                    } catch (java.lang.RuntimeException e14) {
                                                        e = e14;
                                                        fileOutputStream = fileOutputStream3;
                                                        str5 = strConcat;
                                                        str4 = str7;
                                                    }
                                                    str2 = str5;
                                                    str7 = str4;
                                                    fileOutputStream2 = fileOutputStream;
                                                    str3 = 0;
                                                } catch (java.io.IOException | java.lang.RuntimeException e15) {
                                                    e = e15;
                                                    str3 = sharedPreferencesOnSharedPreferenceChangeListenerC5807yfC;
                                                    str2 = str5;
                                                    fileOutputStream2 = fileOutputStream;
                                                }
                                            } catch (java.io.IOException | java.lang.RuntimeException e16) {
                                                e = e16;
                                                str2 = str5;
                                            }
                                        } else {
                                            fileOutputStream = fileOutputStream3;
                                            str5 = strConcat;
                                            str4 = str7;
                                            fileOutputStream.close();
                                            if (p224w3.p.j(3)) {
                                                p224w3.p.b("Preloaded " + f32817I.format(i10) + " bytes from " + str);
                                            }
                                            file3.setReadable(true, false);
                                            if (fileT.isFile()) {
                                                fileT.setLastModified(java.lang.System.currentTimeMillis());
                                            } else {
                                                try {
                                                    fileT.createNewFile();
                                                } catch (java.io.IOException unused) {
                                                }
                                            }
                                            e(str, file3.getAbsolutePath(), i10);
                                            str2 = str5;
                                            try {
                                                f32816H.remove(str2);
                                                return true;
                                            } catch (java.io.IOException e17) {
                                                e = e17;
                                            } catch (java.lang.RuntimeException e18) {
                                                e = e18;
                                            }
                                        }
                                    }
                                } catch (java.io.IOException | java.lang.RuntimeException e19) {
                                    e = e19;
                                    fileOutputStream = fileOutputStream3;
                                    str2 = strConcat;
                                    str4 = str7;
                                }
                            } else {
                                str7 = "badUrl";
                                try {
                                    java.lang.String str11 = "HTTP request failed. Code: " + java.lang.Integer.toString(responseCode);
                                    try {
                                        throw new java.io.IOException("HTTP status code " + responseCode + " at " + str);
                                    } catch (java.io.IOException | java.lang.RuntimeException e20) {
                                        e = e20;
                                        str6 = str11;
                                        str2 = strConcat;
                                        str3 = str6;
                                        if (e instanceof java.lang.RuntimeException) {
                                            p174r3.v.s().x(e, "VideoStreamFullFileCache.preload");
                                        }
                                        fileOutputStream2.close();
                                        if (this.f32820G) {
                                            p224w3.p.f("Preload aborted for URL \"" + str + "\"");
                                        } else {
                                            p224w3.p.h("Preload failed for URL \"" + str + "\"", e);
                                        }
                                        if (file3.exists()) {
                                            p224w3.p.g("Could not delete partial cache file at ".concat(java.lang.String.valueOf(file3.getAbsolutePath())));
                                        }
                                        d(str, file3.getAbsolutePath(), str7, str3);
                                        f32816H.remove(str2);
                                        return false;
                                    }
                                } catch (java.io.IOException | java.lang.RuntimeException e21) {
                                    e = e21;
                                    str6 = null;
                                }
                            }
                        } catch (java.io.IOException | java.lang.RuntimeException e22) {
                            e = e22;
                            str2 = strConcat;
                            str7 = "error";
                            str3 = 0;
                            fileOutputStream2 = null;
                        }
                        if (e instanceof java.lang.RuntimeException) {
                            p174r3.v.s().x(e, "VideoStreamFullFileCache.preload");
                        }
                        try {
                            fileOutputStream2.close();
                        } catch (java.io.IOException | java.lang.NullPointerException unused2) {
                        }
                        if (this.f32820G) {
                            p224w3.p.f("Preload aborted for URL \"" + str + "\"");
                        } else {
                            p224w3.p.h("Preload failed for URL \"" + str + "\"", e);
                        }
                        if (file3.exists() && !file3.delete()) {
                            p224w3.p.g("Could not delete partial cache file at ".concat(java.lang.String.valueOf(file3.getAbsolutePath())));
                        }
                        d(str, file3.getAbsolutePath(), str7, str3);
                        f32816H.remove(str2);
                        return false;
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
            }
            java.io.File file4 = this.f32819F;
            if (file4 == null) {
                break;
            }
            long j6 = Long.MAX_VALUE;
            java.io.File file5 = null;
            for (java.io.File file6 : file4.listFiles()) {
                if (!file6.getName().endsWith(".done")) {
                    long jLastModified = file6.lastModified();
                    if (jLastModified < j6) {
                        file5 = file6;
                        j6 = jLastModified;
                    }
                }
            }
            if (file5 != null) {
                zDelete = file5.delete();
                java.io.File fileT2 = t(file5);
                if (fileT2.isFile()) {
                    zDelete &= fileT2.delete();
                }
            } else {
                zDelete = false;
            }
        } while (zDelete);
        p224w3.p.g("Unable to expire stream cache");
        d(str, null, "expireFailed", null);
        return false;
    }
}
