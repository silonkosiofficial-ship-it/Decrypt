package Q4;

/* JADX INFO: loaded from: classes3.dex */
public class m extends java.lang.Exception {
    protected m() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(java.lang.String str) {
        super(str);
        Q3.AbstractC1477p.g(str, "Detail message must not be empty");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(java.lang.String str, java.lang.Throwable th) {
        super(str, th);
        Q3.AbstractC1477p.g(str, "Detail message must not be empty");
    }
}
