package da;

/* JADX INFO: loaded from: classes2.dex */
public class d implements da.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final org.w3c.dom.Node f44353a;

    public static final class a implements da.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f44354a;

        a() {
            this.f44354a = da.d.this.h().getChildNodes().getLength();
        }

        @Override // da.e
        public int a() {
            return this.f44354a;
        }

        @Override // da.e
        public da.c b(int i6) {
            org.w3c.dom.Node nodeItem = da.d.this.h().getChildNodes().item(i6);
            if (nodeItem instanceof org.w3c.dom.Element) {
                return new da.b((org.w3c.dom.Element) nodeItem);
            }
            p247y7.AbstractC7350t.c(nodeItem);
            return new da.d(nodeItem);
        }
    }

    public d(org.w3c.dom.Node node) {
        p247y7.AbstractC7350t.f(node, "n");
        this.f44353a = node;
    }

    @Override // da.c
    public java.lang.String c() {
        java.lang.String namespaceURI = this.f44353a.getNamespaceURI();
        p247y7.AbstractC7350t.e(namespaceURI, "getNamespaceURI(...)");
        return namespaceURI;
    }

    @Override // da.c
    public java.lang.String d() {
        java.lang.String localName = this.f44353a.getLocalName();
        p247y7.AbstractC7350t.e(localName, "getLocalName(...)");
        return localName;
    }

    @Override // da.c
    public java.lang.String e() {
        java.lang.String nodeName = this.f44353a.getNodeName();
        p247y7.AbstractC7350t.e(nodeName, "getNodeName(...)");
        return nodeName;
    }

    @Override // da.c
    public java.lang.String f(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "namespaceURI");
        java.lang.String strLookupPrefix = this.f44353a.lookupPrefix(str);
        p247y7.AbstractC7350t.e(strLookupPrefix, "lookupPrefix(...)");
        return strLookupPrefix;
    }

    @Override // da.c
    public da.e g() {
        return new da.d.a();
    }

    public final org.w3c.dom.Node h() {
        return this.f44353a;
    }
}
