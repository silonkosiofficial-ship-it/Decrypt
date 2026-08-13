package I6;

/* JADX INFO: loaded from: classes3.dex */
public final class T extends I6.O {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.lang.String f5159D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(Q6.c cVar, java.lang.String str) {
        super(cVar, str);
        p247y7.AbstractC7350t.f(cVar, "response");
        p247y7.AbstractC7350t.f(str, "cachedResponseText");
        this.f5159D = "Server error(" + cVar.H0().d().u0().d() + ' ' + cVar.H0().d().r() + ": " + cVar.e() + ". Text: \"" + str + '\"';
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
        return this.f5159D;
    }
}
