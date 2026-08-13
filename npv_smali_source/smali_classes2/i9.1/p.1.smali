.class public abstract Li9/p;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Li9/o;[Lx7/l;Lx7/l;)V
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "alternativeFormats"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "primaryFormat"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Li9/b;

    if-eqz v0, :cond_0

    check-cast p0, Li9/b;

    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lx7/l;

    const/4 v0, 0x1

    invoke-static {p2, v0}, Ly7/W;->f(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lx7/l;

    invoke-interface {p0, p1, p2}, Li9/b;->p([Lx7/l;Lx7/l;)V

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "impossible"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final b(Li9/o;C)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Li9/o;->c(Ljava/lang/String;)V

    return-void
.end method

.method public static final c(Li9/o;Ljava/lang/String;Lx7/l;)V
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ifZero"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "format"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Li9/b;

    if-eqz v0, :cond_0

    check-cast p0, Li9/b;

    const/4 v0, 0x1

    invoke-static {p2, v0}, Ly7/W;->f(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lx7/l;

    invoke-interface {p0, p1, p2}, Li9/b;->i(Ljava/lang/String;Lx7/l;)V

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "impossible"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic d(Li9/o;Ljava/lang/String;Lx7/l;ILjava/lang/Object;)V
    .locals 0

    .prologue
    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const-string p1, ""

    :cond_0
    invoke-static {p0, p1, p2}, Li9/p;->c(Li9/o;Ljava/lang/String;Lx7/l;)V

    return-void
.end method
