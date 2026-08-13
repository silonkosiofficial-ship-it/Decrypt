.class public abstract synthetic Lv/F;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lv/G;Lz/j;LV/n;I)Lv/H;
    .locals 1

    .prologue
    const p0, 0x4af582f5    # 8044922.5f

    invoke-interface {p2, p0}, LV/n;->T(I)V

    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, -0x1

    const-string v0, "androidx.compose.foundation.Indication.rememberUpdatedInstance (Indication.kt:75)"

    invoke-static {p0, p3, p1, v0}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p0, Lv/O;->C:Lv/O;

    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {}, LV/q;->P()V

    :cond_1
    invoke-interface {p2}, LV/n;->J()V

    return-object p0
.end method
