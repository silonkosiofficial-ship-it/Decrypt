.class public abstract LO7/E;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LO7/e;)Z
    .locals 2

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LO7/e;->q()LO7/D;

    move-result-object v0

    sget-object v1, LO7/D;->D:LO7/D;

    if-ne v0, v1, :cond_0

    invoke-interface {p0}, LO7/e;->j()LO7/f;

    move-result-object p0

    sget-object v0, LO7/f;->F:LO7/f;

    if-eq p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
