package Y8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Y8.p f16532a = new Y8.p(-1, null, null, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f16533b = p019b9.G.e("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f16534c = p019b9.G.e("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p019b9.D f16535d = new p019b9.D("BUFFERED");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final p019b9.D f16536e = new p019b9.D("SHOULD_BUFFER");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final p019b9.D f16537f = new p019b9.D("S_RESUMING_BY_RCV");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final p019b9.D f16538g = new p019b9.D("RESUMING_BY_EB");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final p019b9.D f16539h = new p019b9.D("POISONED");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final p019b9.D f16540i = new p019b9.D("DONE_RCV");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final p019b9.D f16541j = new p019b9.D("INTERRUPTED_SEND");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final p019b9.D f16542k = new p019b9.D("INTERRUPTED_RCV");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final p019b9.D f16543l = new p019b9.D("CHANNEL_CLOSED");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final p019b9.D f16544m = new p019b9.D("SUSPEND");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final p019b9.D f16545n = new p019b9.D("SUSPEND_NO_WAITER");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final p019b9.D f16546o = new p019b9.D("FAILED");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final p019b9.D f16547p = new p019b9.D("NO_RECEIVE_RESULT");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final p019b9.D f16548q = new p019b9.D("CLOSE_HANDLER_CLOSED");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final p019b9.D f16549r = new p019b9.D("CLOSE_HANDLER_INVOKED");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final p019b9.D f16550s = new p019b9.D("NO_CLOSE_CAUSE");

    /* synthetic */ class a extends p247y7.C7348q implements p237x7.p {

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public static final Y8.i.a f16551L = new Y8.i.a();

        a() {
            super(2, Y8.i.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
        }

        public final Y8.p s(long j6, Y8.p pVar) {
            return Y8.i.x(j6, pVar);
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            return s(((java.lang.Number) obj).longValue(), (Y8.p) obj2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long A(int i6) {
        if (i6 == 0) {
            return 0L;
        }
        if (i6 != Integer.MAX_VALUE) {
            return i6;
        }
        return Long.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean B(W8.InterfaceC1794l interfaceC1794l, java.lang.Object obj, p237x7.q qVar) {
        java.lang.Object objS = interfaceC1794l.s(obj, null, qVar);
        if (objS == null) {
            return false;
        }
        interfaceC1794l.J(objS);
        return true;
    }

    static /* synthetic */ boolean C(W8.InterfaceC1794l interfaceC1794l, java.lang.Object obj, p237x7.q qVar, int i6, java.lang.Object obj2) {
        if ((i6 & 2) != 0) {
            qVar = null;
        }
        return B(interfaceC1794l, obj, qVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long v(long j6, boolean z6) {
        return (z6 ? 4611686018427387904L : 0L) + j6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long w(long j6, int i6) {
        return (((long) i6) << 60) + j6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Y8.p x(long j6, Y8.p pVar) {
        return new Y8.p(j6, pVar, pVar.y(), 0);
    }

    public static final F7.f y() {
        return Y8.i.a.f16551L;
    }

    public static final p019b9.D z() {
        return f16543l;
    }
}
