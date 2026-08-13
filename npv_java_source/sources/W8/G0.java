package W8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class G0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p019b9.D f15445a = new p019b9.D("COMPLETING_ALREADY");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p019b9.D f15446b = new p019b9.D("COMPLETING_WAITING_CHILDREN");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final p019b9.D f15447c = new p019b9.D("COMPLETING_RETRY");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final p019b9.D f15448d = new p019b9.D("TOO_LATE_TO_CANCEL");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final p019b9.D f15449e = new p019b9.D("SEALED");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final W8.C1789i0 f15450f = new W8.C1789i0(false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final W8.C1789i0 f15451g = new W8.C1789i0(true);

    public static final java.lang.Object g(java.lang.Object obj) {
        return obj instanceof W8.InterfaceC1814v0 ? new W8.C1816w0((W8.InterfaceC1814v0) obj) : obj;
    }

    public static final java.lang.Object h(java.lang.Object obj) {
        W8.InterfaceC1814v0 interfaceC1814v0;
        W8.C1816w0 c1816w0 = obj instanceof W8.C1816w0 ? (W8.C1816w0) obj : null;
        return (c1816w0 == null || (interfaceC1814v0 = c1816w0.f15535a) == null) ? obj : interfaceC1814v0;
    }
}
