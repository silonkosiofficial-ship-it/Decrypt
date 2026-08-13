package I6;

/* JADX INFO: loaded from: classes3.dex */
public class O extends java.lang.IllegalStateException {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final transient Q6.c f5157C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(Q6.c cVar, java.lang.String str) {
        super("Bad response: " + cVar + ". Text: \"" + str + '\"');
        p247y7.AbstractC7350t.f(cVar, "response");
        p247y7.AbstractC7350t.f(str, "cachedResponseText");
        this.f5157C = cVar;
    }
}
