.class public abstract LV/L1;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(LV/n;)LV/n;
    .locals 0

    return-object p0
.end method

.method public static final b(LV/n;Lx7/l;)V
    .locals 2

    .prologue
    invoke-interface {p0}, LV/n;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Li7/M;->a:Li7/M;

    new-instance v1, LV/L1$a;

    invoke-direct {v1, p1}, LV/L1$a;-><init>(Lx7/l;)V

    invoke-interface {p0, v0, v1}, LV/n;->D(Ljava/lang/Object;Lx7/p;)V

    :cond_0
    return-void
.end method

.method public static final c(LV/n;Ljava/lang/Object;Lx7/p;)V
    .locals 1

    .prologue
    invoke-interface {p0}, LV/n;->o()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p0}, LV/n;->g()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    invoke-interface {p0, p1}, LV/n;->K(Ljava/lang/Object;)V

    invoke-interface {p0, p1, p2}, LV/n;->D(Ljava/lang/Object;Lx7/p;)V

    :cond_1
    return-void
.end method
