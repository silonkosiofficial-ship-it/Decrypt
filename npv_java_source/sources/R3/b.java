package R3;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    public static class a extends java.lang.RuntimeException {
        public a(java.lang.String str, android.os.Parcel parcel) {
            super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
        }
    }

    private static void A(android.os.Parcel parcel, int i6, int i10) {
        int iW = w(parcel, i6);
        if (iW == i10) {
            return;
        }
        throw new R3.b.a("Expected size " + i10 + " got " + iW + " (0x" + java.lang.Integer.toHexString(iW) + ")", parcel);
    }

    public static android.os.Bundle a(android.os.Parcel parcel, int i6) {
        int iW = w(parcel, i6);
        int iDataPosition = parcel.dataPosition();
        if (iW == 0) {
            return null;
        }
        android.os.Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iW);
        return bundle;
    }

    public static byte[] b(android.os.Parcel parcel, int i6) {
        int iW = w(parcel, i6);
        int iDataPosition = parcel.dataPosition();
        if (iW == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iW);
        return bArrCreateByteArray;
    }

    public static int[] c(android.os.Parcel parcel, int i6) {
        int iW = w(parcel, i6);
        int iDataPosition = parcel.dataPosition();
        if (iW == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iW);
        return iArrCreateIntArray;
    }

    public static java.util.ArrayList d(android.os.Parcel parcel, int i6) {
        int iW = w(parcel, i6);
        int iDataPosition = parcel.dataPosition();
        if (iW == 0) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i10 = parcel.readInt();
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(java.lang.Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(iDataPosition + iW);
        return arrayList;
    }

    public static android.os.Parcelable e(android.os.Parcel parcel, int i6, android.os.Parcelable.Creator creator) {
        int iW = w(parcel, i6);
        int iDataPosition = parcel.dataPosition();
        if (iW == 0) {
            return null;
        }
        android.os.Parcelable parcelable = (android.os.Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iW);
        return parcelable;
    }

    public static java.lang.String f(android.os.Parcel parcel, int i6) {
        int iW = w(parcel, i6);
        int iDataPosition = parcel.dataPosition();
        if (iW == 0) {
            return null;
        }
        java.lang.String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iW);
        return string;
    }

    public static java.lang.String[] g(android.os.Parcel parcel, int i6) {
        int iW = w(parcel, i6);
        int iDataPosition = parcel.dataPosition();
        if (iW == 0) {
            return null;
        }
        java.lang.String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iDataPosition + iW);
        return strArrCreateStringArray;
    }

    public static java.util.ArrayList h(android.os.Parcel parcel, int i6) {
        int iW = w(parcel, i6);
        int iDataPosition = parcel.dataPosition();
        if (iW == 0) {
            return null;
        }
        java.util.ArrayList<java.lang.String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iW);
        return arrayListCreateStringArrayList;
    }

    public static java.lang.Object[] i(android.os.Parcel parcel, int i6, android.os.Parcelable.Creator creator) {
        int iW = w(parcel, i6);
        int iDataPosition = parcel.dataPosition();
        if (iW == 0) {
            return null;
        }
        java.lang.Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iW);
        return objArrCreateTypedArray;
    }

    public static java.util.ArrayList j(android.os.Parcel parcel, int i6, android.os.Parcelable.Creator creator) {
        int iW = w(parcel, i6);
        int iDataPosition = parcel.dataPosition();
        if (iW == 0) {
            return null;
        }
        java.util.ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iW);
        return arrayListCreateTypedArrayList;
    }

    public static void k(android.os.Parcel parcel, int i6) {
        if (parcel.dataPosition() == i6) {
            return;
        }
        throw new R3.b.a("Overread allowed size end=" + i6, parcel);
    }

    public static int l(int i6) {
        return (char) i6;
    }

    public static boolean m(android.os.Parcel parcel, int i6) {
        A(parcel, i6, 4);
        return parcel.readInt() != 0;
    }

    public static java.lang.Boolean n(android.os.Parcel parcel, int i6) {
        int iW = w(parcel, i6);
        if (iW == 0) {
            return null;
        }
        z(parcel, i6, iW, 4);
        return java.lang.Boolean.valueOf(parcel.readInt() != 0);
    }

    public static java.lang.Double o(android.os.Parcel parcel, int i6) {
        int iW = w(parcel, i6);
        if (iW == 0) {
            return null;
        }
        z(parcel, i6, iW, 8);
        return java.lang.Double.valueOf(parcel.readDouble());
    }

    public static float p(android.os.Parcel parcel, int i6) {
        A(parcel, i6, 4);
        return parcel.readFloat();
    }

    public static java.lang.Float q(android.os.Parcel parcel, int i6) {
        int iW = w(parcel, i6);
        if (iW == 0) {
            return null;
        }
        z(parcel, i6, iW, 4);
        return java.lang.Float.valueOf(parcel.readFloat());
    }

    public static int r(android.os.Parcel parcel) {
        return parcel.readInt();
    }

    public static android.os.IBinder s(android.os.Parcel parcel, int i6) {
        int iW = w(parcel, i6);
        int iDataPosition = parcel.dataPosition();
        if (iW == 0) {
            return null;
        }
        android.os.IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iW);
        return strongBinder;
    }

    public static int t(android.os.Parcel parcel, int i6) {
        A(parcel, i6, 4);
        return parcel.readInt();
    }

    public static long u(android.os.Parcel parcel, int i6) {
        A(parcel, i6, 8);
        return parcel.readLong();
    }

    public static java.lang.Long v(android.os.Parcel parcel, int i6) {
        int iW = w(parcel, i6);
        if (iW == 0) {
            return null;
        }
        z(parcel, i6, iW, 8);
        return java.lang.Long.valueOf(parcel.readLong());
    }

    public static int w(android.os.Parcel parcel, int i6) {
        return (i6 & (-65536)) != -65536 ? (char) (i6 >> 16) : parcel.readInt();
    }

    public static void x(android.os.Parcel parcel, int i6) {
        parcel.setDataPosition(parcel.dataPosition() + w(parcel, i6));
    }

    public static int y(android.os.Parcel parcel) {
        int iR = r(parcel);
        int iW = w(parcel, iR);
        int iL = l(iR);
        int iDataPosition = parcel.dataPosition();
        if (iL != 20293) {
            throw new R3.b.a("Expected object header. Got 0x".concat(java.lang.String.valueOf(java.lang.Integer.toHexString(iR))), parcel);
        }
        int i6 = iW + iDataPosition;
        if (i6 >= iDataPosition && i6 <= parcel.dataSize()) {
            return i6;
        }
        throw new R3.b.a("Size read is invalid start=" + iDataPosition + " end=" + i6, parcel);
    }

    private static void z(android.os.Parcel parcel, int i6, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        throw new R3.b.a("Expected size " + i11 + " got " + i10 + " (0x" + java.lang.Integer.toHexString(i10) + ")", parcel);
    }
}
