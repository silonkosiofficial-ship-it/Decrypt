package V0;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static final android.text.style.TtsSpan a(M0.S s6) {
        if (s6 instanceof M0.U) {
            return b((M0.U) s6);
        }
        throw new p087i7.s();
    }

    public static final android.text.style.TtsSpan b(M0.U u6) {
        return new android.text.style.TtsSpan.VerbatimBuilder(u6.a()).build();
    }
}
