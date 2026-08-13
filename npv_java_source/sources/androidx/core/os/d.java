package androidx.core.os;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static final android.os.Bundle a(p087i7.u... uVarArr) {
        android.os.Bundle bundle = new android.os.Bundle(uVarArr.length);
        for (p087i7.u uVar : uVarArr) {
            java.lang.String str = (java.lang.String) uVar.a();
            java.lang.Object objB = uVar.b();
            if (objB == null) {
                bundle.putString(str, null);
            } else if (objB instanceof java.lang.Boolean) {
                bundle.putBoolean(str, ((java.lang.Boolean) objB).booleanValue());
            } else if (objB instanceof java.lang.Byte) {
                bundle.putByte(str, ((java.lang.Number) objB).byteValue());
            } else if (objB instanceof java.lang.Character) {
                bundle.putChar(str, ((java.lang.Character) objB).charValue());
            } else if (objB instanceof java.lang.Double) {
                bundle.putDouble(str, ((java.lang.Number) objB).doubleValue());
            } else if (objB instanceof java.lang.Float) {
                bundle.putFloat(str, ((java.lang.Number) objB).floatValue());
            } else if (objB instanceof java.lang.Integer) {
                bundle.putInt(str, ((java.lang.Number) objB).intValue());
            } else if (objB instanceof java.lang.Long) {
                bundle.putLong(str, ((java.lang.Number) objB).longValue());
            } else if (objB instanceof java.lang.Short) {
                bundle.putShort(str, ((java.lang.Number) objB).shortValue());
            } else if (objB instanceof android.os.Bundle) {
                bundle.putBundle(str, (android.os.Bundle) objB);
            } else if (objB instanceof java.lang.CharSequence) {
                bundle.putCharSequence(str, (java.lang.CharSequence) objB);
            } else if (objB instanceof android.os.Parcelable) {
                bundle.putParcelable(str, (android.os.Parcelable) objB);
            } else if (objB instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) objB);
            } else if (objB instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) objB);
            } else if (objB instanceof char[]) {
                bundle.putCharArray(str, (char[]) objB);
            } else if (objB instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) objB);
            } else if (objB instanceof float[]) {
                bundle.putFloatArray(str, (float[]) objB);
            } else if (objB instanceof int[]) {
                bundle.putIntArray(str, (int[]) objB);
            } else if (objB instanceof long[]) {
                bundle.putLongArray(str, (long[]) objB);
            } else if (objB instanceof short[]) {
                bundle.putShortArray(str, (short[]) objB);
            } else if (objB instanceof java.lang.Object[]) {
                java.lang.Class<?> componentType = objB.getClass().getComponentType();
                p247y7.AbstractC7350t.c(componentType);
                if (android.os.Parcelable.class.isAssignableFrom(componentType)) {
                    p247y7.AbstractC7350t.d(objB, "null cannot be cast to non-null type kotlin.Array<android.os.Parcelable>");
                    bundle.putParcelableArray(str, (android.os.Parcelable[]) objB);
                } else if (java.lang.String.class.isAssignableFrom(componentType)) {
                    p247y7.AbstractC7350t.d(objB, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                    bundle.putStringArray(str, (java.lang.String[]) objB);
                } else if (java.lang.CharSequence.class.isAssignableFrom(componentType)) {
                    p247y7.AbstractC7350t.d(objB, "null cannot be cast to non-null type kotlin.Array<kotlin.CharSequence>");
                    bundle.putCharSequenceArray(str, (java.lang.CharSequence[]) objB);
                } else {
                    if (!java.io.Serializable.class.isAssignableFrom(componentType)) {
                        throw new java.lang.IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (java.io.Serializable) objB);
                }
            } else if (objB instanceof java.io.Serializable) {
                bundle.putSerializable(str, (java.io.Serializable) objB);
            } else if (objB instanceof android.os.IBinder) {
                bundle.putBinder(str, (android.os.IBinder) objB);
            } else if (objB instanceof android.util.Size) {
                androidx.core.os.b.a(bundle, str, (android.util.Size) objB);
            } else {
                if (!(objB instanceof android.util.SizeF)) {
                    throw new java.lang.IllegalArgumentException("Illegal value type " + objB.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                androidx.core.os.b.b(bundle, str, (android.util.SizeF) objB);
            }
        }
        return bundle;
    }
}
