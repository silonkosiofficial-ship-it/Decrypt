.class public abstract LD0/F;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LF0/U;)LF0/U;
    .locals 2

    .prologue
    invoke-virtual {p0}, LF0/U;->o1()LF0/J;

    move-result-object p0

    :goto_0
    invoke-virtual {p0}, LF0/J;->o0()LF0/J;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LF0/J;->b0()LF0/J;

    move-result-object v0

    goto :goto_1

    :cond_0
    move-object v0, v1

    :goto_1
    if-eqz v0, :cond_3

    invoke-virtual {p0}, LF0/J;->o0()LF0/J;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LF0/J;->b0()LF0/J;

    move-result-object v1

    :cond_1
    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1}, LF0/J;->O0()Z

    move-result v0

    invoke-virtual {p0}, LF0/J;->o0()LF0/J;

    move-result-object p0

    invoke-static {p0}, Ly7/t;->c(Ljava/lang/Object;)V

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, LF0/J;->b0()LF0/J;

    move-result-object p0

    invoke-static {p0}, Ly7/t;->c(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, LF0/J;->m0()LF0/d0;

    move-result-object p0

    invoke-virtual {p0}, LF0/d0;->j2()LF0/U;

    move-result-object p0

    invoke-static {p0}, Ly7/t;->c(Ljava/lang/Object;)V

    return-object p0
.end method
