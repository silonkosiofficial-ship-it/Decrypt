package da;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends da.d implements da.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final org.w3c.dom.Element f44352b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(org.w3c.dom.Element element) {
        super(element);
        p247y7.AbstractC7350t.f(element, "element");
        this.f44352b = element;
    }

    @Override // da.a
    public java.lang.String a(java.lang.String str, java.lang.String str2) {
        p247y7.AbstractC7350t.f(str, "nameSpaceURI");
        p247y7.AbstractC7350t.f(str2, "localName");
        java.lang.String attributeNS = this.f44352b.getAttributeNS(str, str2);
        p247y7.AbstractC7350t.e(attributeNS, "getAttributeNS(...)");
        return attributeNS;
    }

    @Override // da.a
    public java.lang.String b(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "name");
        java.lang.String attribute = this.f44352b.getAttribute(str);
        p247y7.AbstractC7350t.e(attribute, "getAttribute(...)");
        return attribute;
    }
}
