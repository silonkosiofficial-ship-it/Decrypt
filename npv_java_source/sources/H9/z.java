package H9;

/* JADX INFO: loaded from: classes2.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final H9.u f4908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f4909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final H9.t f4910c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final H9.A f4911d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.util.Map f4912e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private H9.C1238d f4913f;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private H9.u f4914a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private java.lang.String f4915b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private H9.t.a f4916c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private H9.A f4917d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private java.util.Map f4918e;

        public a() {
            this.f4918e = new java.util.LinkedHashMap();
            this.f4915b = "GET";
            this.f4916c = new H9.t.a();
        }

        public a(H9.z zVar) {
            p247y7.AbstractC7350t.f(zVar, "request");
            this.f4918e = new java.util.LinkedHashMap();
            this.f4914a = zVar.i();
            this.f4915b = zVar.g();
            this.f4917d = zVar.a();
            this.f4918e = zVar.c().isEmpty() ? new java.util.LinkedHashMap() : p097j7.S.u(zVar.c());
            this.f4916c = zVar.e().g();
        }

        public H9.z.a a(java.lang.String str, java.lang.String str2) {
            p247y7.AbstractC7350t.f(str, "name");
            p247y7.AbstractC7350t.f(str2, "value");
            this.f4916c.a(str, str2);
            return this;
        }

        public H9.z b() {
            H9.u uVar = this.f4914a;
            if (uVar != null) {
                return new H9.z(uVar, this.f4915b, this.f4916c.d(), this.f4917d, I9.d.U(this.f4918e));
            }
            throw new java.lang.IllegalStateException("url == null".toString());
        }

        public H9.z.a c(java.lang.String str, java.lang.String str2) {
            p247y7.AbstractC7350t.f(str, "name");
            p247y7.AbstractC7350t.f(str2, "value");
            this.f4916c.g(str, str2);
            return this;
        }

        public H9.z.a d(H9.t tVar) {
            p247y7.AbstractC7350t.f(tVar, "headers");
            this.f4916c = tVar.g();
            return this;
        }

        public H9.z.a e(java.lang.String str, H9.A a6) {
            p247y7.AbstractC7350t.f(str, "method");
            if (str.length() <= 0) {
                throw new java.lang.IllegalArgumentException("method.isEmpty() == true".toString());
            }
            if (a6 == null) {
                if (!(!N9.f.d(str))) {
                    throw new java.lang.IllegalArgumentException(("method " + str + " must have a request body.").toString());
                }
            } else if (!N9.f.a(str)) {
                throw new java.lang.IllegalArgumentException(("method " + str + " must not have a request body.").toString());
            }
            this.f4915b = str;
            this.f4917d = a6;
            return this;
        }

        public H9.z.a f(java.lang.String str) {
            p247y7.AbstractC7350t.f(str, "name");
            this.f4916c.f(str);
            return this;
        }

        public H9.z.a g(H9.u uVar) {
            p247y7.AbstractC7350t.f(uVar, "url");
            this.f4914a = uVar;
            return this;
        }

        public H9.z.a h(java.lang.String str) {
            java.lang.StringBuilder sb;
            int i6;
            p247y7.AbstractC7350t.f(str, "url");
            if (!S8.r.T(str, "ws:", true)) {
                if (S8.r.T(str, "wss:", true)) {
                    sb = new java.lang.StringBuilder();
                    sb.append("https:");
                    i6 = 4;
                }
                return g(H9.u.f4810k.d(str));
            }
            sb = new java.lang.StringBuilder();
            sb.append("http:");
            i6 = 3;
            java.lang.String strSubstring = str.substring(i6);
            p247y7.AbstractC7350t.e(strSubstring, "this as java.lang.String).substring(startIndex)");
            sb.append(strSubstring);
            str = sb.toString();
            return g(H9.u.f4810k.d(str));
        }
    }

    public z(H9.u uVar, java.lang.String str, H9.t tVar, H9.A a6, java.util.Map map) {
        p247y7.AbstractC7350t.f(uVar, "url");
        p247y7.AbstractC7350t.f(str, "method");
        p247y7.AbstractC7350t.f(tVar, "headers");
        p247y7.AbstractC7350t.f(map, "tags");
        this.f4908a = uVar;
        this.f4909b = str;
        this.f4910c = tVar;
        this.f4911d = a6;
        this.f4912e = map;
    }

    public final H9.A a() {
        return this.f4911d;
    }

    public final H9.C1238d b() {
        H9.C1238d c1238d = this.f4913f;
        if (c1238d != null) {
            return c1238d;
        }
        H9.C1238d c1238dB = H9.C1238d.f4597n.b(this.f4910c);
        this.f4913f = c1238dB;
        return c1238dB;
    }

    public final java.util.Map c() {
        return this.f4912e;
    }

    public final java.lang.String d(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "name");
        return this.f4910c.d(str);
    }

    public final H9.t e() {
        return this.f4910c;
    }

    public final boolean f() {
        return this.f4908a.i();
    }

    public final java.lang.String g() {
        return this.f4909b;
    }

    public final H9.z.a h() {
        return new H9.z.a(this);
    }

    public final H9.u i() {
        return this.f4908a;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Request{method=");
        sb.append(this.f4909b);
        sb.append(", url=");
        sb.append(this.f4908a);
        if (this.f4910c.size() != 0) {
            sb.append(", headers=[");
            int i6 = 0;
            for (java.lang.Object obj : this.f4910c) {
                int i10 = i6 + 1;
                if (i6 < 0) {
                    p097j7.AbstractC6879v.w();
                }
                p087i7.u uVar = (p087i7.u) obj;
                java.lang.String str = (java.lang.String) uVar.a();
                java.lang.String str2 = (java.lang.String) uVar.b();
                if (i6 > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                sb.append(str2);
                i6 = i10;
            }
            sb.append(']');
        }
        if (!this.f4912e.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.f4912e);
        }
        sb.append('}');
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
