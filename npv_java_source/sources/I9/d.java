package I9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f5547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final H9.t f5548b = H9.t.f4807D.g(new java.lang.String[0]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final H9.C f5549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final H9.A f5550d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final X9.N f5551e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final java.util.TimeZone f5552f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final S8.o f5553g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f5554h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final java.lang.String f5555i;

    static {
        byte[] bArr = new byte[0];
        f5547a = bArr;
        f5549c = H9.C.a.c(H9.C.f4567C, bArr, null, 1, null);
        f5550d = H9.A.a.b(H9.A.f4535a, bArr, null, 0, 0, 7, null);
        X9.N.a aVar = X9.N.f16078F;
        X9.C1839g.a aVar2 = X9.C1839g.f16149F;
        f5551e = aVar.d(aVar2.a("efbbbf"), aVar2.a("feff"), aVar2.a("fffe"), aVar2.a("0000ffff"), aVar2.a("ffff0000"));
        java.util.TimeZone timeZone = j$.util.DesugarTimeZone.getTimeZone("GMT");
        p247y7.AbstractC7350t.c(timeZone);
        f5552f = timeZone;
        f5553g = new S8.o("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        f5554h = false;
        java.lang.String name = H9.x.class.getName();
        p247y7.AbstractC7350t.e(name, "OkHttpClient::class.java.name");
        f5555i = S8.r.K0(S8.r.J0(name, "okhttp3."), "Client");
    }

    public static /* synthetic */ int A(java.lang.String str, int i6, int i10, int i11, java.lang.Object obj) {
        if ((i11 & 1) != 0) {
            i6 = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = str.length();
        }
        return z(str, i6, i10);
    }

    public static final int B(java.lang.String str, int i6, int i10) {
        p247y7.AbstractC7350t.f(str, "<this>");
        int i11 = i10 - 1;
        if (i6 <= i11) {
            while (true) {
                char cCharAt = str.charAt(i11);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i11 + 1;
                }
                if (i11 != i6) {
                    i11--;
                }
            }
        }
        return i6;
    }

    public static /* synthetic */ int C(java.lang.String str, int i6, int i10, int i11, java.lang.Object obj) {
        if ((i11 & 1) != 0) {
            i6 = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = str.length();
        }
        return B(str, i6, i10);
    }

    public static final int D(java.lang.String str, int i6) {
        p247y7.AbstractC7350t.f(str, "<this>");
        int length = str.length();
        while (i6 < length) {
            char cCharAt = str.charAt(i6);
            if (cCharAt != ' ' && cCharAt != '\t') {
                return i6;
            }
            i6++;
        }
        return str.length();
    }

    public static final java.lang.String[] E(java.lang.String[] strArr, java.lang.String[] strArr2, java.util.Comparator comparator) {
        p247y7.AbstractC7350t.f(strArr, "<this>");
        p247y7.AbstractC7350t.f(strArr2, "other");
        p247y7.AbstractC7350t.f(comparator, "comparator");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : strArr) {
            for (java.lang.String str2 : strArr2) {
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        return (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
    }

    public static final boolean F(java.net.Socket socket, X9.InterfaceC1838f interfaceC1838f) {
        p247y7.AbstractC7350t.f(socket, "<this>");
        p247y7.AbstractC7350t.f(interfaceC1838f, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !interfaceC1838f.j();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (java.net.SocketTimeoutException unused) {
            return true;
        } catch (java.io.IOException unused2) {
            return false;
        }
    }

    public static final boolean G(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "name");
        return S8.r.K(str, "Authorization", true) || S8.r.K(str, "Cookie", true) || S8.r.K(str, "Proxy-Authorization", true) || S8.r.K(str, "Set-Cookie", true);
    }

    public static final int H(char c6) {
        if ('0' <= c6 && c6 < ':') {
            return c6 - '0';
        }
        if ('a' <= c6 && c6 < 'g') {
            return c6 - 'W';
        }
        if ('A' > c6 || c6 >= 'G') {
            return -1;
        }
        return c6 - '7';
    }

    public static final int I(X9.InterfaceC1838f interfaceC1838f) {
        p247y7.AbstractC7350t.f(interfaceC1838f, "<this>");
        return d(interfaceC1838f.m(), 255) | (d(interfaceC1838f.m(), 255) << 16) | (d(interfaceC1838f.m(), 255) << 8);
    }

    public static final int J(X9.C1836d c1836d, byte b6) throws java.io.EOFException {
        p247y7.AbstractC7350t.f(c1836d, "<this>");
        int i6 = 0;
        while (!c1836d.j() && c1836d.r0(0L) == b6) {
            i6++;
            c1836d.m();
        }
        return i6;
    }

    public static final boolean K(X9.Z z6, int i6, java.util.concurrent.TimeUnit timeUnit) {
        p247y7.AbstractC7350t.f(z6, "<this>");
        p247y7.AbstractC7350t.f(timeUnit, "timeUnit");
        long jNanoTime = java.lang.System.nanoTime();
        long jC = z6.k().e() ? z6.k().c() - jNanoTime : Long.MAX_VALUE;
        z6.k().d(java.lang.Math.min(jC, timeUnit.toNanos(i6)) + jNanoTime);
        try {
            X9.C1836d c1836d = new X9.C1836d();
            while (z6.b0(c1836d, 8192L) != -1) {
                c1836d.a();
            }
            X9.a0 a0VarK = z6.k();
            if (jC == Long.MAX_VALUE) {
                a0VarK.a();
            } else {
                a0VarK.d(jNanoTime + jC);
            }
            return true;
        } catch (java.io.InterruptedIOException unused) {
            X9.a0 a0VarK2 = z6.k();
            if (jC == Long.MAX_VALUE) {
                a0VarK2.a();
            } else {
                a0VarK2.d(jNanoTime + jC);
            }
            return false;
        } catch (java.lang.Throwable th) {
            X9.a0 a0VarK3 = z6.k();
            if (jC == Long.MAX_VALUE) {
                a0VarK3.a();
            } else {
                a0VarK3.d(jNanoTime + jC);
            }
            throw th;
        }
    }

    public static final java.util.concurrent.ThreadFactory L(final java.lang.String str, final boolean z6) {
        p247y7.AbstractC7350t.f(str, "name");
        return new java.util.concurrent.ThreadFactory() { // from class: I9.c
            @Override // java.util.concurrent.ThreadFactory
            public final java.lang.Thread newThread(java.lang.Runnable runnable) {
                return I9.d.M(str, z6, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Thread M(java.lang.String str, boolean z6, java.lang.Runnable runnable) {
        p247y7.AbstractC7350t.f(str, "$name");
        java.lang.Thread thread = new java.lang.Thread(runnable, str);
        thread.setDaemon(z6);
        return thread;
    }

    public static final java.util.List N(H9.t tVar) {
        p247y7.AbstractC7350t.f(tVar, "<this>");
        E7.i iVarQ = E7.j.q(0, tVar.size());
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(iVarQ, 10));
        java.util.Iterator it = iVarQ.iterator();
        while (it.hasNext()) {
            int iB = ((p097j7.O) it).b();
            arrayList.add(new P9.c(tVar.e(iB), tVar.s(iB)));
        }
        return arrayList;
    }

    public static final H9.t O(java.util.List list) {
        p247y7.AbstractC7350t.f(list, "<this>");
        H9.t.a aVar = new H9.t.a();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            P9.c cVar = (P9.c) it.next();
            aVar.c(cVar.a().O(), cVar.b().O());
        }
        return aVar.d();
    }

    public static final java.lang.String P(int i6) {
        java.lang.String hexString = java.lang.Integer.toHexString(i6);
        p247y7.AbstractC7350t.e(hexString, "toHexString(this)");
        return hexString;
    }

    public static final java.lang.String Q(long j6) {
        java.lang.String hexString = java.lang.Long.toHexString(j6);
        p247y7.AbstractC7350t.e(hexString, "toHexString(this)");
        return hexString;
    }

    public static final java.lang.String R(H9.u uVar, boolean z6) {
        java.lang.String strH;
        p247y7.AbstractC7350t.f(uVar, "<this>");
        if (S8.r.c0(uVar.h(), ":", false, 2, null)) {
            strH = '[' + uVar.h() + ']';
        } else {
            strH = uVar.h();
        }
        if (!z6 && uVar.l() == H9.u.f4810k.c(uVar.p())) {
            return strH;
        }
        return strH + ':' + uVar.l();
    }

    public static /* synthetic */ java.lang.String S(H9.u uVar, boolean z6, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            z6 = false;
        }
        return R(uVar, z6);
    }

    public static final java.util.List T(java.util.List list) {
        p247y7.AbstractC7350t.f(list, "<this>");
        java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(p097j7.AbstractC6879v.W0(list));
        p247y7.AbstractC7350t.e(listUnmodifiableList, "unmodifiableList(toMutableList())");
        return listUnmodifiableList;
    }

    public static final java.util.Map U(java.util.Map map) {
        p247y7.AbstractC7350t.f(map, "<this>");
        if (map.isEmpty()) {
            return p097j7.S.h();
        }
        java.util.Map mapUnmodifiableMap = j$.util.DesugarCollections.unmodifiableMap(new java.util.LinkedHashMap(map));
        p247y7.AbstractC7350t.e(mapUnmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        return mapUnmodifiableMap;
    }

    public static final long V(java.lang.String str, long j6) {
        p247y7.AbstractC7350t.f(str, "<this>");
        try {
            return java.lang.Long.parseLong(str);
        } catch (java.lang.NumberFormatException unused) {
            return j6;
        }
    }

    public static final int W(java.lang.String str, int i6) {
        if (str != null) {
            try {
                long j6 = java.lang.Long.parseLong(str);
                if (j6 > 2147483647L) {
                    return Integer.MAX_VALUE;
                }
                if (j6 < 0) {
                    return 0;
                }
                return (int) j6;
            } catch (java.lang.NumberFormatException unused) {
            }
        }
        return i6;
    }

    public static final java.lang.String X(java.lang.String str, int i6, int i10) {
        p247y7.AbstractC7350t.f(str, "<this>");
        int iZ = z(str, i6, i10);
        java.lang.String strSubstring = str.substring(iZ, B(str, iZ, i10));
        p247y7.AbstractC7350t.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static /* synthetic */ java.lang.String Y(java.lang.String str, int i6, int i10, int i11, java.lang.Object obj) {
        if ((i11 & 1) != 0) {
            i6 = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = str.length();
        }
        return X(str, i6, i10);
    }

    public static final java.lang.Throwable Z(java.lang.Exception exc, java.util.List list) {
        p247y7.AbstractC7350t.f(exc, "<this>");
        p247y7.AbstractC7350t.f(list, "suppressed");
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            p087i7.AbstractC6661g.a(exc, (java.lang.Exception) it.next());
        }
        return exc;
    }

    public static final void a0(X9.InterfaceC1837e interfaceC1837e, int i6) {
        p247y7.AbstractC7350t.f(interfaceC1837e, "<this>");
        interfaceC1837e.U((i6 >>> 16) & 255);
        interfaceC1837e.U((i6 >>> 8) & 255);
        interfaceC1837e.U(i6 & 255);
    }

    public static final void c(java.util.List list, java.lang.Object obj) {
        p247y7.AbstractC7350t.f(list, "<this>");
        if (list.contains(obj)) {
            return;
        }
        list.add(obj);
    }

    public static final int d(byte b6, int i6) {
        return b6 & i6;
    }

    public static final int e(short s6, int i6) {
        return s6 & i6;
    }

    public static final long f(int i6, long j6) {
        return ((long) i6) & j6;
    }

    public static final H9.r.c g(final H9.r rVar) {
        p247y7.AbstractC7350t.f(rVar, "<this>");
        return new H9.r.c() { // from class: I9.b
            @Override // H9.r.c
            public final H9.r a(H9.InterfaceC1239e interfaceC1239e) {
                return I9.d.h(rVar, interfaceC1239e);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final H9.r h(H9.r rVar, H9.InterfaceC1239e interfaceC1239e) {
        p247y7.AbstractC7350t.f(rVar, "$this_asFactory");
        p247y7.AbstractC7350t.f(interfaceC1239e, "it");
        return rVar;
    }

    public static final boolean i(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "<this>");
        return f5553g.d(str);
    }

    public static final boolean j(H9.u uVar, H9.u uVar2) {
        p247y7.AbstractC7350t.f(uVar, "<this>");
        p247y7.AbstractC7350t.f(uVar2, "other");
        return p247y7.AbstractC7350t.b(uVar.h(), uVar2.h()) && uVar.l() == uVar2.l() && p247y7.AbstractC7350t.b(uVar.p(), uVar2.p());
    }

    public static final int k(java.lang.String str, long j6, java.util.concurrent.TimeUnit timeUnit) {
        p247y7.AbstractC7350t.f(str, "name");
        if (j6 < 0) {
            throw new java.lang.IllegalStateException((str + " < 0").toString());
        }
        if (timeUnit == null) {
            throw new java.lang.IllegalStateException("unit == null".toString());
        }
        long millis = timeUnit.toMillis(j6);
        if (millis > 2147483647L) {
            throw new java.lang.IllegalArgumentException((str + " too large.").toString());
        }
        if (millis != 0 || j6 <= 0) {
            return (int) millis;
        }
        throw new java.lang.IllegalArgumentException((str + " too small.").toString());
    }

    public static final void l(long j6, long j10, long j11) {
        if ((j10 | j11) < 0 || j10 > j6 || j6 - j10 < j11) {
            throw new java.lang.ArrayIndexOutOfBoundsException();
        }
    }

    public static final void m(java.io.Closeable closeable) {
        p247y7.AbstractC7350t.f(closeable, "<this>");
        try {
            closeable.close();
        } catch (java.lang.RuntimeException e6) {
            throw e6;
        } catch (java.lang.Exception unused) {
        }
    }

    public static final void n(java.net.Socket socket) {
        p247y7.AbstractC7350t.f(socket, "<this>");
        try {
            socket.close();
        } catch (java.lang.AssertionError e6) {
            throw e6;
        } catch (java.lang.RuntimeException e10) {
            if (!p247y7.AbstractC7350t.b(e10.getMessage(), "bio == null")) {
                throw e10;
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public static final java.lang.String[] o(java.lang.String[] strArr, java.lang.String str) {
        p247y7.AbstractC7350t.f(strArr, "<this>");
        p247y7.AbstractC7350t.f(str, "value");
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(strArr, strArr.length + 1);
        p247y7.AbstractC7350t.e(objArrCopyOf, "copyOf(this, newSize)");
        java.lang.String[] strArr2 = (java.lang.String[]) objArrCopyOf;
        strArr2[p097j7.AbstractC6872n.e0(strArr2)] = str;
        return strArr2;
    }

    public static final int p(java.lang.String str, char c6, int i6, int i10) {
        p247y7.AbstractC7350t.f(str, "<this>");
        while (i6 < i10) {
            if (str.charAt(i6) == c6) {
                return i6;
            }
            i6++;
        }
        return i10;
    }

    public static final int q(java.lang.String str, java.lang.String str2, int i6, int i10) {
        p247y7.AbstractC7350t.f(str, "<this>");
        p247y7.AbstractC7350t.f(str2, "delimiters");
        while (i6 < i10) {
            if (S8.r.b0(str2, str.charAt(i6), false, 2, null)) {
                return i6;
            }
            i6++;
        }
        return i10;
    }

    public static /* synthetic */ int r(java.lang.String str, char c6, int i6, int i10, int i11, java.lang.Object obj) {
        if ((i11 & 2) != 0) {
            i6 = 0;
        }
        if ((i11 & 4) != 0) {
            i10 = str.length();
        }
        return p(str, c6, i6, i10);
    }

    public static final boolean s(X9.Z z6, int i6, java.util.concurrent.TimeUnit timeUnit) {
        p247y7.AbstractC7350t.f(z6, "<this>");
        p247y7.AbstractC7350t.f(timeUnit, "timeUnit");
        try {
            return K(z6, i6, timeUnit);
        } catch (java.io.IOException unused) {
            return false;
        }
    }

    public static final java.lang.String t(java.lang.String str, java.lang.Object... objArr) {
        p247y7.AbstractC7350t.f(str, "format");
        p247y7.AbstractC7350t.f(objArr, "args");
        p247y7.V v6 = p247y7.V.f57259a;
        java.util.Locale locale = java.util.Locale.US;
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, objArr.length);
        java.lang.String str2 = java.lang.String.format(locale, str, java.util.Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        p247y7.AbstractC7350t.e(str2, "format(locale, format, *args)");
        return str2;
    }

    public static final boolean u(java.lang.String[] strArr, java.lang.String[] strArr2, java.util.Comparator comparator) {
        p247y7.AbstractC7350t.f(strArr, "<this>");
        p247y7.AbstractC7350t.f(comparator, "comparator");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (java.lang.String str : strArr) {
                java.util.Iterator itA = p247y7.AbstractC7334c.a(strArr2);
                while (itA.hasNext()) {
                    if (comparator.compare(str, (java.lang.String) itA.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long v(H9.B b6) {
        p247y7.AbstractC7350t.f(b6, "<this>");
        java.lang.String strD = b6.H().d("Content-Length");
        if (strD != null) {
            return V(strD, -1L);
        }
        return -1L;
    }

    public static final java.util.List w(java.lang.Object... objArr) {
        p247y7.AbstractC7350t.f(objArr, "elements");
        java.lang.Object[] objArr2 = (java.lang.Object[]) objArr.clone();
        java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(p097j7.AbstractC6879v.p(java.util.Arrays.copyOf(objArr2, objArr2.length)));
        p247y7.AbstractC7350t.e(listUnmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return listUnmodifiableList;
    }

    public static final int x(java.lang.String[] strArr, java.lang.String str, java.util.Comparator comparator) {
        p247y7.AbstractC7350t.f(strArr, "<this>");
        p247y7.AbstractC7350t.f(str, "value");
        p247y7.AbstractC7350t.f(comparator, "comparator");
        int length = strArr.length;
        for (int i6 = 0; i6 < length; i6++) {
            if (comparator.compare(strArr[i6], str) == 0) {
                return i6;
            }
        }
        return -1;
    }

    public static final int y(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "<this>");
        int length = str.length();
        for (int i6 = 0; i6 < length; i6++) {
            char cCharAt = str.charAt(i6);
            if (p247y7.AbstractC7350t.g(cCharAt, 31) <= 0 || p247y7.AbstractC7350t.g(cCharAt, com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION) >= 0) {
                return i6;
            }
        }
        return -1;
    }

    public static final int z(java.lang.String str, int i6, int i10) {
        p247y7.AbstractC7350t.f(str, "<this>");
        while (i6 < i10) {
            char cCharAt = str.charAt(i6);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i6;
            }
            i6++;
        }
        return i10;
    }
}
