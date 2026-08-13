package N5;

/* JADX INFO: loaded from: classes3.dex */
public class k extends Q4.m {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final N5.k.a f7799C;

    public enum a {
        UNKNOWN(0),
        CONFIG_UPDATE_STREAM_ERROR(1),
        CONFIG_UPDATE_MESSAGE_INVALID(2),
        CONFIG_UPDATE_NOT_FETCHED(3),
        CONFIG_UPDATE_UNAVAILABLE(4);


        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final int f7806C;

        a(int i6) {
            this.f7806C = i6;
        }
    }

    public k(java.lang.String str) {
        super(str);
        this.f7799C = N5.k.a.UNKNOWN;
    }

    public k(java.lang.String str, N5.k.a aVar) {
        super(str);
        this.f7799C = aVar;
    }

    public k(java.lang.String str, java.lang.Throwable th) {
        super(str, th);
        this.f7799C = N5.k.a.UNKNOWN;
    }

    public k(java.lang.String str, java.lang.Throwable th, N5.k.a aVar) {
        super(str, th);
        this.f7799C = aVar;
    }
}
