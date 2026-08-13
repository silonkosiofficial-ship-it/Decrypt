.class public abstract synthetic LV/r0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(LV/s0;)Ljava/lang/Integer;
    .locals 0

    invoke-interface {p0}, LV/s0;->d()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic b(LV/s0;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p0}, LV/s0;->getValue()Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static c(LV/s0;I)V
    .locals 0

    invoke-interface {p0, p1}, LV/s0;->i(I)V

    return-void
.end method

.method public static bridge synthetic d(LV/s0;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-interface {p0, p1}, LV/s0;->l(I)V

    return-void
.end method
