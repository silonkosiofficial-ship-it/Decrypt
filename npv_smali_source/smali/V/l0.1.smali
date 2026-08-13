.class public abstract LV/l0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lm7/i;)LV/j0;
    .locals 1

    .prologue
    sget-object v0, LV/j0;->f:LV/j0$b;

    invoke-interface {p0, v0}, Lm7/i;->i(Lm7/i$c;)Lm7/i$b;

    move-result-object p0

    check-cast p0, LV/j0;

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final b(Lx7/l;Lm7/e;)Ljava/lang/Object;
    .locals 2

    invoke-interface {p1}, Lm7/e;->getContext()Lm7/i;

    move-result-object v0

    invoke-static {v0}, LV/l0;->a(Lm7/i;)LV/j0;

    move-result-object v0

    new-instance v1, LV/k0;

    invoke-direct {v1, p0}, LV/k0;-><init>(Lx7/l;)V

    invoke-interface {v0, v1, p1}, LV/j0;->R(Lx7/l;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lx7/l;Lm7/e;)Ljava/lang/Object;
    .locals 1

    invoke-interface {p1}, Lm7/e;->getContext()Lm7/i;

    move-result-object v0

    invoke-static {v0}, LV/l0;->a(Lm7/i;)LV/j0;

    move-result-object v0

    invoke-interface {v0, p0, p1}, LV/j0;->R(Lx7/l;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
