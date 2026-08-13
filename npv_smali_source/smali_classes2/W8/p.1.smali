.class public abstract LW8/p;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LW8/l;LW8/f0;)V
    .locals 1

    new-instance v0, LW8/g0;

    invoke-direct {v0, p1}, LW8/g0;-><init>(LW8/f0;)V

    invoke-static {p0, v0}, LW8/p;->c(LW8/l;LW8/k;)V

    return-void
.end method

.method public static final b(Lm7/e;)LW8/n;
    .locals 2

    .prologue
    instance-of v0, p0, Lb9/h;

    if-nez v0, :cond_0

    new-instance v0, LW8/n;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, LW8/n;-><init>(Lm7/e;I)V

    return-object v0

    :cond_0
    move-object v0, p0

    check-cast v0, Lb9/h;

    invoke-virtual {v0}, Lb9/h;->l()LW8/n;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, LW8/n;->R()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    return-object v0

    :cond_3
    :goto_1
    new-instance v0, LW8/n;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, LW8/n;-><init>(Lm7/e;I)V

    return-object v0
.end method

.method public static final c(LW8/l;LW8/k;)V
    .locals 1

    .prologue
    instance-of v0, p0, LW8/n;

    if-eqz v0, :cond_0

    check-cast p0, LW8/n;

    invoke-virtual {p0, p1}, LW8/n;->K(LW8/k;)V

    return-void

    :cond_0
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "third-party implementation of CancellableContinuation is not supported"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
