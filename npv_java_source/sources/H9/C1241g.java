package H9;

/* JADX INFO: renamed from: H9.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1241g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final H9.C1241g.b f4621c = new H9.C1241g.b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final H9.C1241g f4622d = new H9.C1241g.a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Set f4623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final U9.c f4624b;

    /* JADX INFO: renamed from: H9.g$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.util.List f4625a = new java.util.ArrayList();

        /* JADX WARN: Multi-variable type inference failed */
        public final H9.C1241g a() {
            return new H9.C1241g(p097j7.AbstractC6879v.Y0(this.f4625a), null, 2, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: H9.g$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final java.lang.String a(java.security.cert.Certificate certificate) {
            p247y7.AbstractC7350t.f(certificate, "certificate");
            if (!(certificate instanceof java.security.cert.X509Certificate)) {
                throw new java.lang.IllegalArgumentException("Certificate pinning requires X509 certificates".toString());
            }
            return "sha256/" + b((java.security.cert.X509Certificate) certificate).e();
        }

        public final X9.C1839g b(java.security.cert.X509Certificate x509Certificate) {
            p247y7.AbstractC7350t.f(x509Certificate, "<this>");
            X9.C1839g.a aVar = X9.C1839g.f16149F;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            p247y7.AbstractC7350t.e(encoded, "publicKey.encoded");
            return X9.C1839g.a.e(aVar, encoded, 0, 0, 3, null).H();
        }
    }

    /* JADX INFO: renamed from: H9.g$c */
    static final class c extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ java.util.List f4627E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ java.lang.String f4628F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(java.util.List list, java.lang.String str) {
            super(0);
            this.f4627E = list;
            this.f4628F = str;
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.util.List b() {
            java.util.List listA;
            U9.c cVarD = H9.C1241g.this.d();
            if (cVarD == null || (listA = cVarD.a(this.f4627E, this.f4628F)) == null) {
                listA = this.f4627E;
            }
            java.util.List<java.security.cert.Certificate> list = listA;
            java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(list, 10));
            for (java.security.cert.Certificate certificate : list) {
                p247y7.AbstractC7350t.d(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                arrayList.add((java.security.cert.X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    public C1241g(java.util.Set set, U9.c cVar) {
        p247y7.AbstractC7350t.f(set, "pins");
        this.f4623a = set;
        this.f4624b = cVar;
    }

    public /* synthetic */ C1241g(java.util.Set set, U9.c cVar, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(set, (i6 & 2) != 0 ? null : cVar);
    }

    public final void a(java.lang.String str, java.util.List list) {
        p247y7.AbstractC7350t.f(str, "hostname");
        p247y7.AbstractC7350t.f(list, "peerCertificates");
        b(str, new H9.C1241g.c(list, str));
    }

    public final void b(java.lang.String str, p237x7.a aVar) throws javax.net.ssl.SSLPeerUnverifiedException {
        p247y7.AbstractC7350t.f(str, "hostname");
        p247y7.AbstractC7350t.f(aVar, "cleanedPeerCertificatesFn");
        java.util.List listC = c(str);
        if (listC.isEmpty()) {
            return;
        }
        java.util.List<java.security.cert.X509Certificate> list = (java.util.List) aVar.b();
        for (java.security.cert.X509Certificate x509Certificate : list) {
            java.util.Iterator it = listC.iterator();
            if (it.hasNext()) {
                androidx.appcompat.app.D.a(it.next());
                throw null;
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Certificate pinning failure!");
        sb.append("\n  Peer certificate chain:");
        for (java.security.cert.X509Certificate x509Certificate2 : list) {
            sb.append("\n    ");
            sb.append(f4621c.a(x509Certificate2));
            sb.append(": ");
            sb.append(x509Certificate2.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(str);
        sb.append(":");
        java.util.Iterator it2 = listC.iterator();
        while (it2.hasNext()) {
            androidx.appcompat.app.D.a(it2.next());
            sb.append("\n    ");
            sb.append((java.lang.Object) null);
        }
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "StringBuilder().apply(builderAction).toString()");
        throw new javax.net.ssl.SSLPeerUnverifiedException(string);
    }

    public final java.util.List c(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "hostname");
        java.util.Set set = this.f4623a;
        java.util.List listM = p097j7.AbstractC6879v.m();
        java.util.Iterator it = set.iterator();
        if (!it.hasNext()) {
            return listM;
        }
        androidx.appcompat.app.D.a(it.next());
        throw null;
    }

    public final U9.c d() {
        return this.f4624b;
    }

    public final H9.C1241g e(U9.c cVar) {
        p247y7.AbstractC7350t.f(cVar, "certificateChainCleaner");
        return p247y7.AbstractC7350t.b(this.f4624b, cVar) ? this : new H9.C1241g(this.f4623a, cVar);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof H9.C1241g) {
            H9.C1241g c1241g = (H9.C1241g) obj;
            if (p247y7.AbstractC7350t.b(c1241g.f4623a, this.f4623a) && p247y7.AbstractC7350t.b(c1241g.f4624b, this.f4624b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (1517 + this.f4623a.hashCode()) * 41;
        U9.c cVar = this.f4624b;
        return iHashCode + (cVar != null ? cVar.hashCode() : 0);
    }
}
