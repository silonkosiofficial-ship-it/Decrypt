package U9;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements U9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map f14624a;

    public b(java.security.cert.X509Certificate... x509CertificateArr) {
        p247y7.AbstractC7350t.f(x509CertificateArr, "caCerts");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.security.cert.X509Certificate x509Certificate : x509CertificateArr) {
            javax.security.auth.x500.X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            p247y7.AbstractC7350t.e(subjectX500Principal, "caCert.subjectX500Principal");
            java.lang.Object linkedHashSet = linkedHashMap.get(subjectX500Principal);
            if (linkedHashSet == null) {
                linkedHashSet = new java.util.LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, linkedHashSet);
            }
            ((java.util.Set) linkedHashSet).add(x509Certificate);
        }
        this.f14624a = linkedHashMap;
    }

    @Override // U9.e
    public java.security.cert.X509Certificate a(java.security.cert.X509Certificate x509Certificate) {
        p247y7.AbstractC7350t.f(x509Certificate, "cert");
        java.util.Set set = (java.util.Set) this.f14624a.get(x509Certificate.getIssuerX500Principal());
        java.lang.Object obj = null;
        if (set == null) {
            return null;
        }
        for (java.lang.Object obj2 : set) {
            try {
                x509Certificate.verify(((java.security.cert.X509Certificate) obj2).getPublicKey());
                obj = obj2;
                break;
            } catch (java.lang.Exception unused) {
            }
        }
        return (java.security.cert.X509Certificate) obj;
    }

    public boolean equals(java.lang.Object obj) {
        return obj == this || ((obj instanceof U9.b) && p247y7.AbstractC7350t.b(((U9.b) obj).f14624a, this.f14624a));
    }

    public int hashCode() {
        return this.f14624a.hashCode();
    }
}
