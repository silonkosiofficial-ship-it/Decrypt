package p119l9;

/* JADX INFO: loaded from: classes2.dex */
public interface e {

    public static final class a {
        public static /* synthetic */ void a(p119l9.e eVar, java.lang.Object obj, java.lang.Appendable appendable, boolean z6, int i6, java.lang.Object obj2) {
            if (obj2 != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: format");
            }
            if ((i6 & 4) != 0) {
                z6 = false;
            }
            eVar.a(obj, appendable, z6);
        }
    }

    void a(java.lang.Object obj, java.lang.Appendable appendable, boolean z6);
}
