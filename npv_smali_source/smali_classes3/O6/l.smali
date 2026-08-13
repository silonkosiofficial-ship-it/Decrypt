.class public abstract LO6/l;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LO6/d;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "key"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    invoke-virtual {p0}, LO6/d;->j()LT6/M;

    move-result-object p0

    invoke-virtual {p0}, LT6/M;->k()LT6/H;

    move-result-object p0

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p0, p1, p2}, LW6/z;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method
