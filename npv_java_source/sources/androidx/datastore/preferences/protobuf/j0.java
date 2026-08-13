package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
abstract class j0 {

    class a implements androidx.datastore.preferences.protobuf.j0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.datastore.preferences.protobuf.AbstractC2047g f22060a;

        a(androidx.datastore.preferences.protobuf.AbstractC2047g abstractC2047g) {
            this.f22060a = abstractC2047g;
        }

        @Override // androidx.datastore.preferences.protobuf.j0.b
        public byte a(int i6) {
            return this.f22060a.e(i6);
        }

        @Override // androidx.datastore.preferences.protobuf.j0.b
        public int size() {
            return this.f22060a.size();
        }
    }

    private interface b {
        byte a(int i6);

        int size();
    }

    static java.lang.String a(androidx.datastore.preferences.protobuf.AbstractC2047g abstractC2047g) {
        return b(new androidx.datastore.preferences.protobuf.j0.a(abstractC2047g));
    }

    static java.lang.String b(androidx.datastore.preferences.protobuf.j0.b bVar) {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(bVar.size());
        for (int i6 = 0; i6 < bVar.size(); i6++) {
            int iA = bVar.a(i6);
            if (iA == 34) {
                str = "\\\"";
            } else if (iA == 39) {
                str = "\\'";
            } else if (iA != 92) {
                switch (iA) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (iA < 32 || iA > 126) {
                            sb.append('\\');
                            sb.append((char) (((iA >>> 6) & 3) + 48));
                            sb.append((char) (((iA >>> 3) & 7) + 48));
                            iA = (iA & 7) + 48;
                        }
                        sb.append((char) iA);
                        continue;
                        break;
                }
            } else {
                str = "\\\\";
            }
            sb.append(str);
        }
        return sb.toString();
    }

    static java.lang.String c(java.lang.String str) {
        return a(androidx.datastore.preferences.protobuf.AbstractC2047g.s(str));
    }
}
