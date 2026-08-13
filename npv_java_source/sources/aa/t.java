package aa;

/* JADX INFO: loaded from: classes2.dex */
public abstract class t {

    public static final class a implements aa.r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p087i7.InterfaceC6668n f17327a = p087i7.AbstractC6669o.b(aa.t.a.C0336a.f17328D);

        /* JADX INFO: renamed from: aa.t$a$a, reason: collision with other inner class name */
        static final class C0336a extends p247y7.AbstractC7352v implements p237x7.a {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            public static final aa.t.a.C0336a f17328D = new aa.t.a.C0336a();

            C0336a() {
                super(0);
            }

            @Override // p237x7.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final android.content.res.AssetManager b() {
                android.content.Context contextB = org.jetbrains.compose.resources.a.b();
                if (contextB != null) {
                    return contextB.getAssets();
                }
                throw new java.lang.IllegalStateException("Android context is not initialized. If it happens in the Preview mode then call PreviewContextConfigurationEffect() function.".toString());
            }
        }

        a() {
        }

        private final android.content.res.AssetManager c() {
            java.lang.Object value = this.f17327a.getValue();
            p247y7.AbstractC7350t.e(value, "getValue(...)");
            return (android.content.res.AssetManager) value;
        }

        private final java.lang.ClassLoader d() {
            java.lang.ClassLoader classLoader = aa.t.a.class.getClassLoader();
            if (classLoader != null) {
                return classLoader;
            }
            throw new java.lang.IllegalStateException("Cannot find class loader".toString());
        }

        private final android.content.res.AssetManager e() {
            try {
                return org.jetbrains.compose.resources.a.c().getAssets();
            } catch (java.lang.NoClassDefFoundError unused) {
                return null;
            }
        }

        private final java.io.InputStream f(java.lang.String str) throws aa.j, java.io.IOException {
            try {
                try {
                    java.io.InputStream inputStreamOpen = c().open(str);
                    p247y7.AbstractC7350t.c(inputStreamOpen);
                    return inputStreamOpen;
                } catch (java.io.FileNotFoundException unused) {
                    java.io.InputStream inputStreamZqubf = com.napsternetlabs.napsternetv.ProtectedMyApplication.zqubf(d(), str);
                    if (inputStreamZqubf != null) {
                        return inputStreamZqubf;
                    }
                    throw new aa.j(str);
                }
            } catch (java.io.FileNotFoundException unused2) {
                return g(e(), str);
            }
        }

        private final java.io.InputStream g(android.content.res.AssetManager assetManager, java.lang.String str) throws java.io.FileNotFoundException {
            java.io.InputStream inputStreamOpen = assetManager != null ? assetManager.open(str) : null;
            if (inputStreamOpen != null) {
                return inputStreamOpen;
            }
            throw new java.io.FileNotFoundException("Current AssetManager is null.");
        }

        private final void h(java.io.InputStream inputStream, byte[] bArr, int i6, int i10) throws java.io.IOException {
            int i11 = 0;
            while (i11 < i10) {
                int i12 = inputStream.read(bArr, i6 + i11, i10 - i11);
                if (i12 <= 0) {
                    return;
                } else {
                    i11 += i12;
                }
            }
        }

        private final void i(java.io.InputStream inputStream, long j6) throws java.io.IOException {
            long j10 = 0;
            while (j10 < j6) {
                long jSkip = inputStream.skip(j6 - j10);
                if (jSkip == 0) {
                    return;
                } else {
                    j10 += jSkip;
                }
            }
        }

        @Override // aa.r
        public java.lang.Object a(java.lang.String str, long j6, long j10, p127m7.e eVar) throws aa.j, java.io.IOException {
            java.io.InputStream inputStreamF = f(str);
            int i6 = (int) j10;
            byte[] bArr = new byte[i6];
            try {
                i(inputStreamF, j6);
                h(inputStreamF, bArr, 0, i6);
                p087i7.M m6 = p087i7.M.f46721a;
                p197t7.b.a(inputStreamF, null);
                return bArr;
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    p197t7.b.a(inputStreamF, th);
                    throw th2;
                }
            }
        }

        @Override // aa.r
        public java.lang.Object b(java.lang.String str, p127m7.e eVar) throws aa.j, java.io.IOException {
            java.io.InputStream inputStreamF = f(str);
            try {
                byte[] bArrC = p197t7.a.c(inputStreamF);
                p197t7.b.a(inputStreamF, null);
                return bArrC;
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    p197t7.b.a(inputStreamF, th);
                    throw th2;
                }
            }
        }
    }

    public static final aa.r a(V.O0 o6, V.InterfaceC1734n interfaceC1734n, int i6) {
        p247y7.AbstractC7350t.f(o6, "<this>");
        interfaceC1734n.T(-1260790148);
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(-1260790148, i6, -1, "org.jetbrains.compose.resources.<get-currentOrPreview> (ResourceReader.android.kt:108)");
        }
        org.jetbrains.compose.resources.a.a(interfaceC1734n, 0);
        aa.r rVar = (aa.r) interfaceC1734n.n(o6);
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        interfaceC1734n.J();
        return rVar;
    }

    public static final aa.r b() {
        return new aa.t.a();
    }
}
