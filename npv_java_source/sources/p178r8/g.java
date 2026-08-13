package p178r8;

/* JADX INFO: loaded from: classes2.dex */
public interface g {

    public enum a {
        CONFLICTS_ONLY,
        SUCCESS_ONLY,
        BOTH
    }

    public enum b {
        OVERRIDABLE,
        CONFLICT,
        INCOMPATIBLE,
        UNKNOWN
    }

    r8.g.a a();

    r8.g.b b(O7.InterfaceC1420a interfaceC1420a, O7.InterfaceC1420a interfaceC1420a2, O7.InterfaceC1424e interfaceC1424e);
}
