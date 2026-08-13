package C7;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends C7.a {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final C7.b.a f1372E = new C7.b.a();

    public static final class a extends java.lang.ThreadLocal {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public java.util.Random initialValue() {
            return new java.util.Random();
        }
    }

    @Override // C7.a
    public java.util.Random d() {
        java.lang.Object obj = this.f1372E.get();
        p247y7.AbstractC7350t.e(obj, "get(...)");
        return (java.util.Random) obj;
    }
}
