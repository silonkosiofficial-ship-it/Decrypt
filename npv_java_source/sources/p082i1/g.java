package p082i1;

/* JADX INFO: loaded from: classes.dex */
public final class g extends java.lang.Exception {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.String f46652C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f46653D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private java.lang.String f46654E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(java.lang.String str, p082i1.c cVar) {
        int iS;
        super(str);
        p247y7.AbstractC7350t.f(str, "reason");
        this.f46652C = str;
        if (cVar != null) {
            this.f46654E = cVar.D();
            iS = cVar.s();
        } else {
            this.f46654E = "unknown";
            iS = 0;
        }
        this.f46653D = iS;
    }

    public final java.lang.String a() {
        return this.f46652C + " (" + this.f46654E + " at line " + this.f46653D + ")";
    }

    @Override // java.lang.Throwable
    public java.lang.String toString() {
        return "CLParsingException (" + hashCode() + ") : " + a();
    }
}
