package C5;

/* JADX INFO: loaded from: classes3.dex */
final class f implements z5.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final java.nio.charset.Charset f1311f = java.nio.charset.Charset.forName("UTF-8");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final z5.c f1312g = z5.c.a("key").b(C5.a.b().c(1).a()).a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final z5.c f1313h = z5.c.a("value").b(C5.a.b().c(2).a()).a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final z5.d f1314i = new z5.d() { // from class: C5.e
        @Override // z5.d
        public final void a(java.lang.Object obj, java.lang.Object obj2) {
            C5.f.w((java.util.Map.Entry) obj, (z5.e) obj2);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.io.OutputStream f1315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.Map f1316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.Map f1317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final z5.d f1318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C5.i f1319e = new C5.i(this);

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1320a;

        static {
            int[] iArr = new int[C5.d.a.values().length];
            f1320a = iArr;
            try {
                iArr[C5.d.a.DEFAULT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f1320a[C5.d.a.SIGNED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f1320a[C5.d.a.FIXED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    f(java.io.OutputStream outputStream, java.util.Map map, java.util.Map map2, z5.d dVar) {
        this.f1315a = outputStream;
        this.f1316b = map;
        this.f1317c = map2;
        this.f1318d = dVar;
    }

    private static java.nio.ByteBuffer p(int i6) {
        return java.nio.ByteBuffer.allocate(i6).order(java.nio.ByteOrder.LITTLE_ENDIAN);
    }

    private long q(z5.d dVar, java.lang.Object obj) throws java.io.IOException {
        C5.b bVar = new C5.b();
        try {
            java.io.OutputStream outputStream = this.f1315a;
            this.f1315a = bVar;
            try {
                dVar.a(obj, this);
                this.f1315a = outputStream;
                long jA = bVar.a();
                bVar.close();
                return jA;
            } catch (java.lang.Throwable th) {
                this.f1315a = outputStream;
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            try {
                bVar.close();
            } catch (java.lang.Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private C5.f r(z5.d dVar, z5.c cVar, java.lang.Object obj, boolean z6) throws java.io.IOException {
        long jQ = q(dVar, obj);
        if (z6 && jQ == 0) {
            return this;
        }
        x((v(cVar) << 3) | 2);
        y(jQ);
        dVar.a(obj, this);
        return this;
    }

    private C5.f s(z5.f fVar, z5.c cVar, java.lang.Object obj, boolean z6) {
        this.f1319e.b(cVar, z6);
        fVar.a(obj, this.f1319e);
        return this;
    }

    private static C5.d u(z5.c cVar) {
        C5.d dVar = (C5.d) cVar.c(C5.d.class);
        if (dVar != null) {
            return dVar;
        }
        throw new z5.b("Field has no @Protobuf config");
    }

    private static int v(z5.c cVar) {
        C5.d dVar = (C5.d) cVar.c(C5.d.class);
        if (dVar != null) {
            return dVar.tag();
        }
        throw new z5.b("Field has no @Protobuf config");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void w(java.util.Map.Entry entry, z5.e eVar) {
        eVar.g(f1312g, entry.getKey());
        eVar.g(f1313h, entry.getValue());
    }

    private void x(int i6) throws java.io.IOException {
        while ((i6 & (-128)) != 0) {
            this.f1315a.write((i6 & com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION) | 128);
            i6 >>>= 7;
        }
        this.f1315a.write(i6 & com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION);
    }

    private void y(long j6) throws java.io.IOException {
        while (((-128) & j6) != 0) {
            this.f1315a.write((((int) j6) & com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION) | 128);
            j6 >>>= 7;
        }
        this.f1315a.write(((int) j6) & com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION);
    }

    @Override // z5.e
    public z5.e c(z5.c cVar, double d6) {
        return m(cVar, d6, true);
    }

    @Override // z5.e
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public C5.f b(z5.c cVar, int i6) {
        return h(cVar, i6, true);
    }

    @Override // z5.e
    public z5.e g(z5.c cVar, java.lang.Object obj) {
        return o(cVar, obj, true);
    }

    C5.f h(z5.c cVar, int i6, boolean z6) throws java.io.IOException {
        if (z6 && i6 == 0) {
            return this;
        }
        C5.d dVarU = u(cVar);
        int i10 = C5.f.a.f1320a[dVarU.intEncoding().ordinal()];
        if (i10 == 1) {
            x(dVarU.tag() << 3);
            x(i6);
        } else if (i10 == 2) {
            x(dVarU.tag() << 3);
            x((i6 << 1) ^ (i6 >> 31));
        } else if (i10 == 3) {
            x((dVarU.tag() << 3) | 5);
            this.f1315a.write(p(4).putInt(i6).array());
        }
        return this;
    }

    @Override // z5.e
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public C5.f a(z5.c cVar, long j6) {
        return j(cVar, j6, true);
    }

    C5.f j(z5.c cVar, long j6, boolean z6) throws java.io.IOException {
        if (z6 && j6 == 0) {
            return this;
        }
        C5.d dVarU = u(cVar);
        int i6 = C5.f.a.f1320a[dVarU.intEncoding().ordinal()];
        if (i6 == 1) {
            x(dVarU.tag() << 3);
            y(j6);
        } else if (i6 == 2) {
            x(dVarU.tag() << 3);
            y((j6 >> 63) ^ (j6 << 1));
        } else if (i6 == 3) {
            x((dVarU.tag() << 3) | 1);
            this.f1315a.write(p(8).putLong(j6).array());
        }
        return this;
    }

    @Override // z5.e
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public C5.f d(z5.c cVar, boolean z6) {
        return l(cVar, z6, true);
    }

    C5.f l(z5.c cVar, boolean z6, boolean z10) {
        return h(cVar, z6 ? 1 : 0, z10);
    }

    z5.e m(z5.c cVar, double d6, boolean z6) throws java.io.IOException {
        if (z6 && d6 == 0.0d) {
            return this;
        }
        x((v(cVar) << 3) | 1);
        this.f1315a.write(p(8).putDouble(d6).array());
        return this;
    }

    z5.e n(z5.c cVar, float f6, boolean z6) throws java.io.IOException {
        if (z6 && f6 == 0.0f) {
            return this;
        }
        x((v(cVar) << 3) | 5);
        this.f1315a.write(p(4).putFloat(f6).array());
        return this;
    }

    z5.e o(z5.c cVar, java.lang.Object obj, boolean z6) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof java.lang.CharSequence) {
            java.lang.CharSequence charSequence = (java.lang.CharSequence) obj;
            if (z6 && charSequence.length() == 0) {
                return this;
            }
            x((v(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f1311f);
            x(bytes.length);
            this.f1315a.write(bytes);
            return this;
        }
        if (obj instanceof java.util.Collection) {
            java.util.Iterator it = ((java.util.Collection) obj).iterator();
            while (it.hasNext()) {
                o(cVar, it.next(), false);
            }
            return this;
        }
        if (obj instanceof java.util.Map) {
            java.util.Iterator it2 = ((java.util.Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                r(f1314i, cVar, (java.util.Map.Entry) it2.next(), false);
            }
            return this;
        }
        if (obj instanceof java.lang.Double) {
            return m(cVar, ((java.lang.Double) obj).doubleValue(), z6);
        }
        if (obj instanceof java.lang.Float) {
            return n(cVar, ((java.lang.Float) obj).floatValue(), z6);
        }
        if (obj instanceof java.lang.Number) {
            return j(cVar, ((java.lang.Number) obj).longValue(), z6);
        }
        if (obj instanceof java.lang.Boolean) {
            return l(cVar, ((java.lang.Boolean) obj).booleanValue(), z6);
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z6 && bArr.length == 0) {
                return this;
            }
            x((v(cVar) << 3) | 2);
            x(bArr.length);
            this.f1315a.write(bArr);
            return this;
        }
        z5.d dVar = (z5.d) this.f1316b.get(obj.getClass());
        if (dVar != null) {
            return r(dVar, cVar, obj, z6);
        }
        z5.f fVar = (z5.f) this.f1317c.get(obj.getClass());
        if (fVar != null) {
            return s(fVar, cVar, obj, z6);
        }
        if (obj instanceof C5.c) {
            return b(cVar, ((C5.c) obj).c());
        }
        return obj instanceof java.lang.Enum ? b(cVar, ((java.lang.Enum) obj).ordinal()) : r(this.f1318d, cVar, obj, z6);
    }

    C5.f t(java.lang.Object obj) {
        if (obj == null) {
            return this;
        }
        z5.d dVar = (z5.d) this.f1316b.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, this);
            return this;
        }
        throw new z5.b("No encoder for " + obj.getClass());
    }
}
