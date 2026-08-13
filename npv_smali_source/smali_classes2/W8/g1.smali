.class public abstract LW8/g1;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lm7/e;)Ljava/lang/Object;
    .locals 4

    .prologue
    invoke-interface {p0}, Lm7/e;->getContext()Lm7/i;

    move-result-object v0

    invoke-static {v0}, LW8/C0;->l(Lm7/i;)V

    invoke-static {p0}, Ln7/b;->d(Lm7/e;)Lm7/e;

    move-result-object v1

    instance-of v2, v1, Lb9/h;

    if-eqz v2, :cond_0

    check-cast v1, Lb9/h;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_1

    sget-object v0, Li7/M;->a:Li7/M;

    goto :goto_2

    :cond_1
    iget-object v2, v1, Lb9/h;->F:LW8/J;

    invoke-virtual {v2, v0}, LW8/J;->v1(Lm7/i;)Z

    move-result v2

    if-eqz v2, :cond_2

    sget-object v2, Li7/M;->a:Li7/M;

    invoke-virtual {v1, v0, v2}, Lb9/h;->m(Lm7/i;Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    new-instance v2, LW8/f1;

    invoke-direct {v2}, LW8/f1;-><init>()V

    invoke-interface {v0, v2}, Lm7/i;->o0(Lm7/i;)Lm7/i;

    move-result-object v0

    sget-object v3, Li7/M;->a:Li7/M;

    invoke-virtual {v1, v0, v3}, Lb9/h;->m(Lm7/i;Ljava/lang/Object;)V

    iget-boolean v0, v2, LW8/f1;->D:Z

    if-eqz v0, :cond_3

    invoke-static {v1}, Lb9/i;->c(Lb9/h;)Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_3
    :goto_1
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    goto :goto_2

    :cond_4
    move-object v0, v3

    :goto_2
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_5

    invoke-static {p0}, Lo7/h;->c(Lm7/e;)V

    :cond_5
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p0

    if-ne v0, p0, :cond_6

    return-object v0

    :cond_6
    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method
