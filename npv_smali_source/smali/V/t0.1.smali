.class public abstract synthetic LV/t0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(LV/u0;)Ljava/lang/Long;
    .locals 2

    invoke-interface {p0}, LV/u0;->a()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic b(LV/u0;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p0}, LV/u0;->getValue()Ljava/lang/Long;

    move-result-object p0

    return-object p0
.end method

.method public static c(LV/u0;J)V
    .locals 0

    invoke-interface {p0, p1, p2}, LV/u0;->j(J)V

    return-void
.end method

.method public static bridge synthetic d(LV/u0;Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-interface {p0, v0, v1}, LV/u0;->k(J)V

    return-void
.end method
