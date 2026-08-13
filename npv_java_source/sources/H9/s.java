package H9;

/* JADX INFO: loaded from: classes2.dex */
public final class s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final H9.s.a f4800e = new H9.s.a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final H9.E f4801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final H9.i f4802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.List f4803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p087i7.InterfaceC6668n f4804d;

    public static final class a {

        /* JADX INFO: renamed from: H9.s$a$a, reason: collision with other inner class name */
        static final class C0111a extends p247y7.AbstractC7352v implements p237x7.a {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ java.util.List f4805D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0111a(java.util.List list) {
                super(0);
                this.f4805D = list;
            }

            @Override // p237x7.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.util.List b() {
                return this.f4805D;
            }
        }

        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        private final java.util.List b(java.security.cert.Certificate[] certificateArr) {
            return certificateArr != null ? I9.d.w(java.util.Arrays.copyOf(certificateArr, certificateArr.length)) : p097j7.AbstractC6879v.m();
        }

        public final H9.s a(javax.net.ssl.SSLSession sSLSession) throws java.io.IOException {
            java.util.List listM;
            p247y7.AbstractC7350t.f(sSLSession, "<this>");
            java.lang.String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                throw new java.lang.IllegalStateException("cipherSuite == null".toString());
            }
            if (p247y7.AbstractC7350t.b(cipherSuite, "TLS_NULL_WITH_NULL_NULL") ? true : p247y7.AbstractC7350t.b(cipherSuite, "SSL_NULL_WITH_NULL_NULL")) {
                throw new java.io.IOException("cipherSuite == " + cipherSuite);
            }
            H9.i iVarB = H9.i.f4685b.b(cipherSuite);
            java.lang.String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new java.lang.IllegalStateException("tlsVersion == null".toString());
            }
            if (p247y7.AbstractC7350t.b("NONE", protocol)) {
                throw new java.io.IOException("tlsVersion == NONE");
            }
            H9.E eA = H9.E.f4574D.a(protocol);
            try {
                listM = b(sSLSession.getPeerCertificates());
            } catch (javax.net.ssl.SSLPeerUnverifiedException unused) {
                listM = p097j7.AbstractC6879v.m();
            }
            return new H9.s(eA, iVarB, b(sSLSession.getLocalCertificates()), new H9.s.a.C0111a(listM));
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p237x7.a f4806D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p237x7.a aVar) {
            super(0);
            this.f4806D = aVar;
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.util.List b() {
            try {
                return (java.util.List) this.f4806D.b();
            } catch (javax.net.ssl.SSLPeerUnverifiedException unused) {
                return p097j7.AbstractC6879v.m();
            }
        }
    }

    public s(H9.E e6, H9.i iVar, java.util.List list, p237x7.a aVar) {
        p247y7.AbstractC7350t.f(e6, "tlsVersion");
        p247y7.AbstractC7350t.f(iVar, "cipherSuite");
        p247y7.AbstractC7350t.f(list, "localCertificates");
        p247y7.AbstractC7350t.f(aVar, "peerCertificatesFn");
        this.f4801a = e6;
        this.f4802b = iVar;
        this.f4803c = list;
        this.f4804d = p087i7.AbstractC6669o.b(new H9.s.b(aVar));
    }

    private final java.lang.String b(java.security.cert.Certificate certificate) {
        if (certificate instanceof java.security.cert.X509Certificate) {
            return ((java.security.cert.X509Certificate) certificate).getSubjectDN().toString();
        }
        java.lang.String type = certificate.getType();
        p247y7.AbstractC7350t.e(type, "type");
        return type;
    }

    public final H9.i a() {
        return this.f4802b;
    }

    public final java.util.List c() {
        return this.f4803c;
    }

    public final java.util.List d() {
        return (java.util.List) this.f4804d.getValue();
    }

    public final H9.E e() {
        return this.f4801a;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof H9.s) {
            H9.s sVar = (H9.s) obj;
            if (sVar.f4801a == this.f4801a && p247y7.AbstractC7350t.b(sVar.f4802b, this.f4802b) && p247y7.AbstractC7350t.b(sVar.d(), d()) && p247y7.AbstractC7350t.b(sVar.f4803c, this.f4803c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((527 + this.f4801a.hashCode()) * 31) + this.f4802b.hashCode()) * 31) + d().hashCode()) * 31) + this.f4803c.hashCode();
    }

    public java.lang.String toString() {
        java.util.List listD = d();
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(listD, 10));
        java.util.Iterator it = listD.iterator();
        while (it.hasNext()) {
            arrayList.add(b((java.security.cert.Certificate) it.next()));
        }
        java.lang.String string = arrayList.toString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Handshake{tlsVersion=");
        sb.append(this.f4801a);
        sb.append(" cipherSuite=");
        sb.append(this.f4802b);
        sb.append(" peerCertificates=");
        sb.append(string);
        sb.append(" localCertificates=");
        java.util.List list = this.f4803c;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(p097j7.AbstractC6879v.x(list, 10));
        java.util.Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(b((java.security.cert.Certificate) it2.next()));
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
