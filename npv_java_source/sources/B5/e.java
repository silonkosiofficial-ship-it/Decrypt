package B5;

/* JADX INFO: loaded from: classes3.dex */
final class e implements z5.e, z5.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private B5.e f802a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f803b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final android.util.JsonWriter f804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.Map f805d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.util.Map f806e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final z5.d f807f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f808g;

    e(java.io.Writer writer, java.util.Map map, java.util.Map map2, z5.d dVar, boolean z6) {
        this.f804c = new android.util.JsonWriter(writer);
        this.f805d = map;
        this.f806e = map2;
        this.f807f = dVar;
        this.f808g = z6;
    }

    private boolean t(java.lang.Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof java.util.Collection) || (obj instanceof java.util.Date) || (obj instanceof java.lang.Enum) || (obj instanceof java.lang.Number);
    }

    private B5.e w(java.lang.String str, java.lang.Object obj) throws java.io.IOException {
        y();
        this.f804c.name(str);
        if (obj != null) {
            return k(obj, false);
        }
        this.f804c.nullValue();
        return this;
    }

    private B5.e x(java.lang.String str, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            return this;
        }
        y();
        this.f804c.name(str);
        return k(obj, false);
    }

    private void y() throws java.io.IOException {
        if (!this.f803b) {
            throw new java.lang.IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        B5.e eVar = this.f802a;
        if (eVar != null) {
            eVar.y();
            this.f802a.f803b = false;
            this.f802a = null;
            this.f804c.endObject();
        }
    }

    @Override // z5.e
    public z5.e a(z5.c cVar, long j6) {
        return o(cVar.b(), j6);
    }

    @Override // z5.e
    public z5.e b(z5.c cVar, int i6) {
        return n(cVar.b(), i6);
    }

    @Override // z5.e
    public z5.e c(z5.c cVar, double d6) {
        return m(cVar.b(), d6);
    }

    @Override // z5.e
    public z5.e d(z5.c cVar, boolean z6) {
        return q(cVar.b(), z6);
    }

    @Override // z5.e
    public z5.e g(z5.c cVar, java.lang.Object obj) {
        return p(cVar.b(), obj);
    }

    public B5.e h(double d6) throws java.io.IOException {
        y();
        this.f804c.value(d6);
        return this;
    }

    public B5.e i(int i6) throws java.io.IOException {
        y();
        this.f804c.value(i6);
        return this;
    }

    public B5.e j(long j6) throws java.io.IOException {
        y();
        this.f804c.value(j6);
        return this;
    }

    B5.e k(java.lang.Object obj, boolean z6) {
        int i6 = 0;
        if (z6 && t(obj)) {
            throw new z5.b(java.lang.String.format("%s cannot be encoded inline", obj == null ? null : obj.getClass()));
        }
        if (obj == null) {
            this.f804c.nullValue();
            return this;
        }
        if (obj instanceof java.lang.Number) {
            this.f804c.value((java.lang.Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof java.util.Collection) {
                this.f804c.beginArray();
                java.util.Iterator it = ((java.util.Collection) obj).iterator();
                while (it.hasNext()) {
                    k(it.next(), false);
                }
                this.f804c.endArray();
                return this;
            }
            if (obj instanceof java.util.Map) {
                this.f804c.beginObject();
                for (java.util.Map.Entry entry : ((java.util.Map) obj).entrySet()) {
                    java.lang.Object key = entry.getKey();
                    try {
                        p((java.lang.String) key, entry.getValue());
                    } catch (java.lang.ClassCastException e6) {
                        throw new z5.b(java.lang.String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e6);
                    }
                }
                this.f804c.endObject();
                return this;
            }
            z5.d dVar = (z5.d) this.f805d.get(obj.getClass());
            if (dVar != null) {
                return v(dVar, obj, z6);
            }
            z5.f fVar = (z5.f) this.f806e.get(obj.getClass());
            if (fVar != null) {
                fVar.a(obj, this);
                return this;
            }
            if (!(obj instanceof java.lang.Enum)) {
                return v(this.f807f, obj, z6);
            }
            if (obj instanceof B5.f) {
                i(((B5.f) obj).c());
            } else {
                e(((java.lang.Enum) obj).name());
            }
            return this;
        }
        if (obj instanceof byte[]) {
            return s((byte[]) obj);
        }
        this.f804c.beginArray();
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length = iArr.length;
            while (i6 < length) {
                this.f804c.value(iArr[i6]);
                i6++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i6 < length2) {
                j(jArr[i6]);
                i6++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i6 < length3) {
                this.f804c.value(dArr[i6]);
                i6++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i6 < length4) {
                this.f804c.value(zArr[i6]);
                i6++;
            }
        } else if (obj instanceof java.lang.Number[]) {
            for (java.lang.Number number : (java.lang.Number[]) obj) {
                k(number, false);
            }
        } else {
            for (java.lang.Object obj2 : (java.lang.Object[]) obj) {
                k(obj2, false);
            }
        }
        this.f804c.endArray();
        return this;
    }

    @Override // z5.g
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public B5.e e(java.lang.String str) throws java.io.IOException {
        y();
        this.f804c.value(str);
        return this;
    }

    public B5.e m(java.lang.String str, double d6) throws java.io.IOException {
        y();
        this.f804c.name(str);
        return h(d6);
    }

    public B5.e n(java.lang.String str, int i6) throws java.io.IOException {
        y();
        this.f804c.name(str);
        return i(i6);
    }

    public B5.e o(java.lang.String str, long j6) throws java.io.IOException {
        y();
        this.f804c.name(str);
        return j(j6);
    }

    public B5.e p(java.lang.String str, java.lang.Object obj) {
        return this.f808g ? x(str, obj) : w(str, obj);
    }

    public B5.e q(java.lang.String str, boolean z6) throws java.io.IOException {
        y();
        this.f804c.name(str);
        return f(z6);
    }

    @Override // z5.g
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public B5.e f(boolean z6) throws java.io.IOException {
        y();
        this.f804c.value(z6);
        return this;
    }

    public B5.e s(byte[] bArr) throws java.io.IOException {
        y();
        if (bArr == null) {
            this.f804c.nullValue();
        } else {
            this.f804c.value(android.util.Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    void u() {
        y();
        this.f804c.flush();
    }

    B5.e v(z5.d dVar, java.lang.Object obj, boolean z6) throws java.io.IOException {
        if (!z6) {
            this.f804c.beginObject();
        }
        dVar.a(obj, this);
        if (!z6) {
            this.f804c.endObject();
        }
        return this;
    }
}
