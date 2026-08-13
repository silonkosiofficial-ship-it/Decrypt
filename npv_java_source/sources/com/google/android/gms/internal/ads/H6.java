package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
abstract class H6 extends java.security.cert.X509Certificate {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.security.cert.X509Certificate f27978C;

    public H6(java.security.cert.X509Certificate x509Certificate) {
        this.f27978C = x509Certificate;
    }

    @Override // java.security.cert.X509Certificate
    public final void checkValidity() throws java.security.cert.CertificateNotYetValidException, java.security.cert.CertificateExpiredException {
        this.f27978C.checkValidity();
    }

    @Override // java.security.cert.X509Certificate
    public final void checkValidity(java.util.Date date) throws java.security.cert.CertificateNotYetValidException, java.security.cert.CertificateExpiredException {
        this.f27978C.checkValidity(date);
    }

    @Override // java.security.cert.X509Certificate
    public final int getBasicConstraints() {
        return this.f27978C.getBasicConstraints();
    }

    @Override // java.security.cert.X509Extension
    public final java.util.Set getCriticalExtensionOIDs() {
        return this.f27978C.getCriticalExtensionOIDs();
    }

    @Override // java.security.cert.X509Extension
    public final byte[] getExtensionValue(java.lang.String str) {
        return this.f27978C.getExtensionValue(str);
    }

    @Override // java.security.cert.X509Certificate
    public final java.security.Principal getIssuerDN() {
        return this.f27978C.getIssuerDN();
    }

    @Override // java.security.cert.X509Certificate
    public final boolean[] getIssuerUniqueID() {
        return this.f27978C.getIssuerUniqueID();
    }

    @Override // java.security.cert.X509Certificate
    public final boolean[] getKeyUsage() {
        return this.f27978C.getKeyUsage();
    }

    @Override // java.security.cert.X509Extension
    public final java.util.Set getNonCriticalExtensionOIDs() {
        return this.f27978C.getNonCriticalExtensionOIDs();
    }

    @Override // java.security.cert.X509Certificate
    public final java.util.Date getNotAfter() {
        return this.f27978C.getNotAfter();
    }

    @Override // java.security.cert.X509Certificate
    public final java.util.Date getNotBefore() {
        return this.f27978C.getNotBefore();
    }

    @Override // java.security.cert.Certificate
    public final java.security.PublicKey getPublicKey() {
        return this.f27978C.getPublicKey();
    }

    @Override // java.security.cert.X509Certificate
    public final java.math.BigInteger getSerialNumber() {
        return this.f27978C.getSerialNumber();
    }

    @Override // java.security.cert.X509Certificate
    public final java.lang.String getSigAlgName() {
        return this.f27978C.getSigAlgName();
    }

    @Override // java.security.cert.X509Certificate
    public final java.lang.String getSigAlgOID() {
        return this.f27978C.getSigAlgOID();
    }

    @Override // java.security.cert.X509Certificate
    public final byte[] getSigAlgParams() {
        return this.f27978C.getSigAlgParams();
    }

    @Override // java.security.cert.X509Certificate
    public final byte[] getSignature() {
        return this.f27978C.getSignature();
    }

    @Override // java.security.cert.X509Certificate
    public final java.security.Principal getSubjectDN() {
        return this.f27978C.getSubjectDN();
    }

    @Override // java.security.cert.X509Certificate
    public final boolean[] getSubjectUniqueID() {
        return this.f27978C.getSubjectUniqueID();
    }

    @Override // java.security.cert.X509Certificate
    public final byte[] getTBSCertificate() {
        return this.f27978C.getTBSCertificate();
    }

    @Override // java.security.cert.X509Certificate
    public final int getVersion() {
        return this.f27978C.getVersion();
    }

    @Override // java.security.cert.X509Extension
    public final boolean hasUnsupportedCriticalExtension() {
        return this.f27978C.hasUnsupportedCriticalExtension();
    }

    @Override // java.security.cert.Certificate
    public final java.lang.String toString() {
        return this.f27978C.toString();
    }

    @Override // java.security.cert.Certificate
    public final void verify(java.security.PublicKey publicKey) throws java.security.NoSuchAlgorithmException, java.security.SignatureException, java.security.InvalidKeyException, java.security.cert.CertificateException, java.security.NoSuchProviderException {
        this.f27978C.verify(publicKey);
    }

    @Override // java.security.cert.Certificate
    public final void verify(java.security.PublicKey publicKey, java.lang.String str) throws java.security.NoSuchAlgorithmException, java.security.SignatureException, java.security.InvalidKeyException, java.security.cert.CertificateException, java.security.NoSuchProviderException {
        this.f27978C.verify(publicKey, str);
    }
}
