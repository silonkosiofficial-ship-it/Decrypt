package aa;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h {
    public static final da.a a(byte[] bArr) {
        p247y7.AbstractC7350t.f(bArr, "<this>");
        javax.xml.parsers.DocumentBuilderFactory documentBuilderFactoryNewInstance = javax.xml.parsers.DocumentBuilderFactory.newInstance();
        documentBuilderFactoryNewInstance.setNamespaceAware(true);
        org.w3c.dom.Element documentElement = documentBuilderFactoryNewInstance.newDocumentBuilder().parse(new org.xml.sax.InputSource(new java.io.ByteArrayInputStream(bArr))).getDocumentElement();
        p247y7.AbstractC7350t.e(documentElement, "getDocumentElement(...)");
        return new da.b(documentElement);
    }
}
