package P9;

/* JADX INFO: loaded from: classes2.dex */
public enum b {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    SETTINGS_TIMEOUT(4),
    STREAM_CLOSED(5),
    FRAME_SIZE_ERROR(6),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);


    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final P9.b.a f8500D = new P9.b.a(null);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int f8516C;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final P9.b a(int i6) {
            for (P9.b bVar : P9.b.values()) {
                if (bVar.g() == i6) {
                    return bVar;
                }
            }
            return null;
        }
    }

    b(int i6) {
        this.f8516C = i6;
    }

    public final int g() {
        return this.f8516C;
    }
}
