package go;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Universe {

    private static final class proxyerror extends java.lang.Exception implements go.Seq.Proxy, go.error {
        private final int refnum;

        proxyerror(int i6) {
            this.refnum = i6;
            go.Seq.trackGoRef(i6, this);
        }

        @Override // go.error
        public native java.lang.String error();

        @Override // java.lang.Throwable
        public java.lang.String getMessage() {
            return error();
        }

        @Override // go.Seq.GoObject
        public final int incRefnum() {
            go.Seq.incGoRef(this.refnum, this);
            return this.refnum;
        }
    }

    static {
        go.Seq.touch();
        _init();
    }

    private Universe() {
    }

    private static native void _init();

    public static void touch() {
    }
}
