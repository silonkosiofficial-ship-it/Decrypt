package U9;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends U9.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final U9.a.C0284a f14622c = new U9.a.C0284a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final U9.e f14623b;

    /* JADX INFO: renamed from: U9.a$a, reason: collision with other inner class name */
    public static final class C0284a {
        private C0284a() {
        }

        public /* synthetic */ C0284a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public a(U9.e eVar) {
        p247y7.AbstractC7350t.f(eVar, "trustRootIndex");
        this.f14623b = eVar;
    }

    private final boolean b(java.security.cert.X509Certificate x509Certificate, java.security.cert.X509Certificate x509Certificate2) {
        if (!p247y7.AbstractC7350t.b(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN())) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (java.security.GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // U9.c
    public java.util.List a(java.util.List list, java.lang.String str) throws javax.net.ssl.SSLPeerUnverifiedException {
        java.security.cert.X509Certificate x509Certificate;
        p247y7.AbstractC7350t.f(list, "chain");
        p247y7.AbstractC7350t.f(str, "hostname");
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque(list);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.Object objRemoveFirst = arrayDeque.removeFirst();
        p247y7.AbstractC7350t.e(objRemoveFirst, "queue.removeFirst()");
        arrayList.add(objRemoveFirst);
        boolean z6 = false;
        for (int i6 = 0; i6 < 9; i6++) {
            java.lang.Object obj = arrayList.get(arrayList.size() - 1);
            p247y7.AbstractC7350t.d(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            java.security.cert.X509Certificate x509Certificate2 = (java.security.cert.X509Certificate) obj;
            java.security.cert.X509Certificate x509CertificateA = this.f14623b.a(x509Certificate2);
            if (x509CertificateA != null) {
                if (arrayList.size() > 1 || !p247y7.AbstractC7350t.b(x509Certificate2, x509CertificateA)) {
                    arrayList.add(x509CertificateA);
                }
                if (b(x509CertificateA, x509CertificateA)) {
                    return arrayList;
                }
                z6 = true;
            } else {
                java.util.Iterator it = arrayDeque.iterator();
                p247y7.AbstractC7350t.e(it, "queue.iterator()");
                do {
                    if (!it.hasNext()) {
                        if (z6) {
                            return arrayList;
                        }
                        throw new javax.net.ssl.SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate2);
                    }
                    java.lang.Object next = it.next();
                    p247y7.AbstractC7350t.d(next, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    x509Certificate = (java.security.cert.X509Certificate) next;
                } while (!b(x509Certificate2, x509Certificate));
                it.remove();
                arrayList.add(x509Certificate);
            }
        }
        throw new javax.net.ssl.SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof U9.a) && p247y7.AbstractC7350t.b(((U9.a) obj).f14623b, this.f14623b);
    }

    public int hashCode() {
        return this.f14623b.hashCode();
    }
}
