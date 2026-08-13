package O7;

/* JADX INFO: renamed from: O7.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC1421b extends O7.InterfaceC1420a, O7.C {

    /* JADX INFO: renamed from: O7.b$a */
    public enum a {
        DECLARATION,
        FAKE_OVERRIDE,
        DELEGATION,
        SYNTHESIZED;

        public boolean e() {
            return this != FAKE_OVERRIDE;
        }
    }

    void G0(java.util.Collection collection);

    @Override // O7.InterfaceC1420a, O7.InterfaceC1432m
    O7.InterfaceC1421b a();

    @Override // O7.InterfaceC1420a
    java.util.Collection f();

    O7.InterfaceC1421b i0(O7.InterfaceC1432m interfaceC1432m, O7.D d6, O7.AbstractC1439u abstractC1439u, O7.InterfaceC1421b.a aVar, boolean z6);

    O7.InterfaceC1421b.a j();
}
