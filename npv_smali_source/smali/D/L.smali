.class public abstract LD/L;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LV/w0;)V
    .locals 0

    invoke-interface {p0}, LV/w0;->getValue()Ljava/lang/Object;

    return-void
.end method

.method public static b(LV/w0;)LV/w0;
    .locals 0

    return-object p0
.end method

.method public static synthetic c(LV/w0;ILy7/k;)LV/w0;
    .locals 0

    .prologue
    and-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_0

    sget-object p0, Li7/M;->a:Li7/M;

    invoke-static {}, LV/v1;->j()LV/u1;

    move-result-object p1

    invoke-static {p0, p1}, LV/v1;->h(Ljava/lang/Object;LV/u1;)LV/w0;

    move-result-object p0

    :cond_0
    invoke-static {p0}, LD/L;->b(LV/w0;)LV/w0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(LV/w0;)V
    .locals 1

    sget-object v0, Li7/M;->a:Li7/M;

    invoke-interface {p0, v0}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method
