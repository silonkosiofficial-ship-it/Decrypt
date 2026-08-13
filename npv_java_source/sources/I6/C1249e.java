package I6;

/* JADX INFO: renamed from: I6.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1249e extends I6.O {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.lang.String f5182D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1249e(Q6.c cVar, java.lang.String str) {
        super(cVar, str);
        p247y7.AbstractC7350t.f(cVar, "response");
        p247y7.AbstractC7350t.f(str, "cachedResponseText");
        this.f5182D = "Client request(" + cVar.H0().d().u0().d() + ' ' + cVar.H0().d().r() + ") invalid: " + cVar.e() + ". Text: \"" + str + '\"';
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
        return this.f5182D;
    }
}
