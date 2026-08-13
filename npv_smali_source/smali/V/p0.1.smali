.class public abstract synthetic LV/p0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(LV/q0;)Ljava/lang/Float;
    .locals 0

    invoke-interface {p0}, LV/q0;->b()F

    move-result p0

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic b(LV/q0;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p0}, LV/q0;->getValue()Ljava/lang/Float;

    move-result-object p0

    return-object p0
.end method

.method public static c(LV/q0;F)V
    .locals 0

    invoke-interface {p0, p1}, LV/q0;->h(F)V

    return-void
.end method

.method public static bridge synthetic d(LV/q0;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    invoke-interface {p0, p1}, LV/q0;->m(F)V

    return-void
.end method
