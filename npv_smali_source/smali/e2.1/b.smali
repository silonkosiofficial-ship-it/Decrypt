.class public abstract Le2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a()Le2/a;
    .locals 4

    .prologue
    :try_start_0
    invoke-static {}, LW8/d0;->c()LW8/J0;

    move-result-object v0

    invoke-virtual {v0}, LW8/J0;->z1()LW8/J0;

    move-result-object v0
    :try_end_0
    .catch Li7/t; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    sget-object v0, Lm7/j;->C:Lm7/j;

    :goto_0
    new-instance v1, Le2/a;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v3, v2, v3}, LW8/U0;->b(LW8/z0;ILjava/lang/Object;)LW8/y;

    move-result-object v2

    invoke-interface {v0, v2}, Lm7/i;->o0(Lm7/i;)Lm7/i;

    move-result-object v0

    invoke-direct {v1, v0}, Le2/a;-><init>(Lm7/i;)V

    return-object v1
.end method
