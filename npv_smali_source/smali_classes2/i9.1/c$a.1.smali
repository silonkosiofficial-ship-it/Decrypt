.class public abstract Li9/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li9/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static a(Li9/c;Li9/n;)V
    .locals 1

    .prologue
    const-string v0, "format"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Li9/z;

    if-eqz v0, :cond_0

    check-cast p1, Li9/z;

    invoke-virtual {p1}, Li9/z;->c()Lk9/f;

    move-result-object p1

    invoke-interface {p0, p1}, Li9/c;->v(Lk9/o;)V

    :cond_0
    return-void
.end method

.method public static b(Li9/c;Li9/K;)V
    .locals 2

    const-string v0, "padding"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lk9/e;

    new-instance v1, Li9/q;

    invoke-direct {v1, p1}, Li9/q;-><init>(Li9/K;)V

    invoke-direct {v0, v1}, Lk9/e;-><init>(Lk9/l;)V

    invoke-interface {p0, v0}, Li9/c;->v(Lk9/o;)V

    return-void
.end method

.method public static c(Li9/c;Li9/s;)V
    .locals 2

    const-string v0, "names"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lk9/e;

    new-instance v1, Li9/r;

    invoke-direct {v1, p1}, Li9/r;-><init>(Li9/s;)V

    invoke-direct {v0, v1}, Lk9/e;-><init>(Lk9/l;)V

    invoke-interface {p0, v0}, Li9/c;->v(Lk9/o;)V

    return-void
.end method

.method public static d(Li9/c;Li9/I;)V
    .locals 2

    const-string v0, "names"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lk9/e;

    new-instance v1, Li9/H;

    invoke-direct {v1, p1}, Li9/H;-><init>(Li9/I;)V

    invoke-direct {v0, v1}, Lk9/e;-><init>(Lk9/l;)V

    invoke-interface {p0, v0}, Li9/c;->v(Lk9/o;)V

    return-void
.end method

.method public static e(Li9/c;Li9/K;)V
    .locals 2

    const-string v0, "padding"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lk9/e;

    new-instance v1, Li9/G;

    invoke-direct {v1, p1}, Li9/G;-><init>(Li9/K;)V

    invoke-direct {v0, v1}, Lk9/e;-><init>(Lk9/l;)V

    invoke-interface {p0, v0}, Li9/c;->v(Lk9/o;)V

    return-void
.end method

.method public static f(Li9/c;Li9/K;)V
    .locals 5

    const-string v0, "padding"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lk9/e;

    new-instance v1, Li9/c0;

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v1, p1, v4, v2, v3}, Li9/c0;-><init>(Li9/K;ZILy7/k;)V

    invoke-direct {v0, v1}, Lk9/e;-><init>(Lk9/l;)V

    invoke-interface {p0, v0}, Li9/c;->v(Lk9/o;)V

    return-void
.end method

.method public static g(Li9/c;I)V
    .locals 5

    new-instance v0, Lk9/e;

    new-instance v1, Li9/L;

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v1, p1, v4, v2, v3}, Li9/L;-><init>(IZILy7/k;)V

    invoke-direct {v0, v1}, Lk9/e;-><init>(Lk9/l;)V

    invoke-interface {p0, v0}, Li9/c;->v(Lk9/o;)V

    return-void
.end method
