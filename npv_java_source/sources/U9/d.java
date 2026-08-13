package U9;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements javax.net.ssl.HostnameVerifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final U9.d f14626a = new U9.d();

    private d() {
    }

    private final java.lang.String b(java.lang.String str) {
        if (!d(str)) {
            return str;
        }
        java.util.Locale locale = java.util.Locale.US;
        p247y7.AbstractC7350t.e(locale, "US");
        java.lang.String lowerCase = str.toLowerCase(locale);
        p247y7.AbstractC7350t.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    private final java.util.List c(java.security.cert.X509Certificate x509Certificate, int i6) {
        java.lang.Object obj;
        try {
            java.util.Collection<java.util.List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return p097j7.AbstractC6879v.m();
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.util.List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && p247y7.AbstractC7350t.b(list.get(0), java.lang.Integer.valueOf(i6)) && (obj = list.get(1)) != null) {
                    arrayList.add((java.lang.String) obj);
                }
            }
            return arrayList;
        } catch (java.security.cert.CertificateParsingException unused) {
            return p097j7.AbstractC6879v.m();
        }
    }

    private final boolean d(java.lang.String str) {
        return str.length() == ((int) X9.b0.b(str, 0, 0, 3, null));
    }

    private final boolean f(java.lang.String str, java.lang.String str2) {
        if (str != null && str.length() != 0 && !S8.r.V(str, ".", false, 2, null) && !S8.r.J(str, "..", false, 2, null) && str2 != null && str2.length() != 0 && !S8.r.V(str2, ".", false, 2, null) && !S8.r.J(str2, "..", false, 2, null)) {
            if (!S8.r.J(str, ".", false, 2, null)) {
                str = str + '.';
            }
            java.lang.String str3 = str;
            if (!S8.r.J(str2, ".", false, 2, null)) {
                str2 = str2 + '.';
            }
            java.lang.String strB = b(str2);
            if (!S8.r.c0(strB, "*", false, 2, null)) {
                return p247y7.AbstractC7350t.b(str3, strB);
            }
            if (!S8.r.V(strB, "*.", false, 2, null) || S8.r.o0(strB, '*', 1, false, 4, null) != -1 || str3.length() < strB.length() || p247y7.AbstractC7350t.b("*.", strB)) {
                return false;
            }
            java.lang.String strSubstring = strB.substring(1);
            p247y7.AbstractC7350t.e(strSubstring, "this as java.lang.String).substring(startIndex)");
            if (!S8.r.J(str3, strSubstring, false, 2, null)) {
                return false;
            }
            int length = str3.length() - strSubstring.length();
            return length <= 0 || S8.r.v0(str3, '.', length + (-1), false, 4, null) == -1;
        }
        return false;
    }

    private final boolean g(java.lang.String str, java.security.cert.X509Certificate x509Certificate) {
        java.lang.String strB = b(str);
        java.util.List listC = c(x509Certificate, 2);
        if ((listC instanceof java.util.Collection) && listC.isEmpty()) {
            return false;
        }
        java.util.Iterator it = listC.iterator();
        while (it.hasNext()) {
            if (f14626a.f(strB, (java.lang.String) it.next())) {
                return true;
            }
        }
        return false;
    }

    private final boolean h(java.lang.String str, java.security.cert.X509Certificate x509Certificate) {
        java.lang.String strE = I9.a.e(str);
        java.util.List listC = c(x509Certificate, 7);
        if ((listC instanceof java.util.Collection) && listC.isEmpty()) {
            return false;
        }
        java.util.Iterator it = listC.iterator();
        while (it.hasNext()) {
            if (p247y7.AbstractC7350t.b(strE, I9.a.e((java.lang.String) it.next()))) {
                return true;
            }
        }
        return false;
    }

    public final java.util.List a(java.security.cert.X509Certificate x509Certificate) {
        p247y7.AbstractC7350t.f(x509Certificate, "certificate");
        return p097j7.AbstractC6879v.C0(c(x509Certificate, 7), c(x509Certificate, 2));
    }

    public final boolean e(java.lang.String str, java.security.cert.X509Certificate x509Certificate) {
        p247y7.AbstractC7350t.f(str, "host");
        p247y7.AbstractC7350t.f(x509Certificate, "certificate");
        return I9.d.i(str) ? h(str, x509Certificate) : g(str, x509Certificate);
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(java.lang.String str, javax.net.ssl.SSLSession sSLSession) {
        p247y7.AbstractC7350t.f(str, "host");
        p247y7.AbstractC7350t.f(sSLSession, "session");
        if (!d(str)) {
            return false;
        }
        try {
            java.security.cert.Certificate certificate = sSLSession.getPeerCertificates()[0];
            p247y7.AbstractC7350t.d(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            return e(str, (java.security.cert.X509Certificate) certificate);
        } catch (javax.net.ssl.SSLException unused) {
            return false;
        }
    }
}
