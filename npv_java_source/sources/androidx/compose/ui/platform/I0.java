package androidx.compose.ui.platform;

/* JADX INFO: loaded from: classes.dex */
public abstract class I0 {
    public static final boolean a(float[] fArr, float[] fArr2) {
        float f6 = fArr[0];
        float f10 = fArr[1];
        float f11 = fArr[2];
        float f12 = fArr[3];
        float f13 = fArr[4];
        float f14 = fArr[5];
        float f15 = fArr[6];
        float f16 = fArr[7];
        float f17 = fArr[8];
        float f18 = fArr[9];
        float f19 = fArr[10];
        float f20 = fArr[11];
        float f21 = fArr[12];
        float f22 = fArr[13];
        float f23 = fArr[14];
        float f24 = fArr[15];
        float f25 = (f6 * f14) - (f10 * f13);
        float f26 = (f6 * f15) - (f11 * f13);
        float f27 = (f6 * f16) - (f12 * f13);
        float f28 = (f10 * f15) - (f11 * f14);
        float f29 = (f10 * f16) - (f12 * f14);
        float f30 = (f11 * f16) - (f12 * f15);
        float f31 = (f17 * f22) - (f18 * f21);
        float f32 = (f17 * f23) - (f19 * f21);
        float f33 = (f17 * f24) - (f20 * f21);
        float f34 = (f18 * f23) - (f19 * f22);
        float f35 = (f18 * f24) - (f20 * f22);
        float f36 = (f19 * f24) - (f20 * f23);
        float f37 = (((((f25 * f36) - (f26 * f35)) + (f27 * f34)) + (f28 * f33)) - (f29 * f32)) + (f30 * f31);
        if (f37 == 0.0f) {
            return false;
        }
        float f38 = 1.0f / f37;
        fArr2[0] = (((f14 * f36) - (f15 * f35)) + (f16 * f34)) * f38;
        fArr2[1] = ((((-f10) * f36) + (f11 * f35)) - (f12 * f34)) * f38;
        fArr2[2] = (((f22 * f30) - (f23 * f29)) + (f24 * f28)) * f38;
        fArr2[3] = ((((-f18) * f30) + (f19 * f29)) - (f20 * f28)) * f38;
        float f39 = -f13;
        fArr2[4] = (((f39 * f36) + (f15 * f33)) - (f16 * f32)) * f38;
        fArr2[5] = (((f36 * f6) - (f11 * f33)) + (f12 * f32)) * f38;
        float f40 = -f21;
        fArr2[6] = (((f40 * f30) + (f23 * f27)) - (f24 * f26)) * f38;
        fArr2[7] = (((f30 * f17) - (f19 * f27)) + (f20 * f26)) * f38;
        fArr2[8] = (((f13 * f35) - (f14 * f33)) + (f16 * f31)) * f38;
        fArr2[9] = ((((-f6) * f35) + (f33 * f10)) - (f12 * f31)) * f38;
        fArr2[10] = (((f21 * f29) - (f22 * f27)) + (f24 * f25)) * f38;
        fArr2[11] = ((((-f17) * f29) + (f27 * f18)) - (f20 * f25)) * f38;
        fArr2[12] = (((f39 * f34) + (f14 * f32)) - (f15 * f31)) * f38;
        fArr2[13] = (((f6 * f34) - (f10 * f32)) + (f11 * f31)) * f38;
        fArr2[14] = (((f40 * f28) + (f22 * f26)) - (f23 * f25)) * f38;
        fArr2[15] = (((f17 * f28) - (f18 * f26)) + (f19 * f25)) * f38;
        return true;
    }
}
