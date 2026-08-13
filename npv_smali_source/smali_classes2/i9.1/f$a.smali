.class public abstract Li9/f$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li9/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static a(Li9/f;Li9/K;)V
    .locals 2

    const-string v0, "padding"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lk9/e;

    new-instance v1, Li9/u;

    invoke-direct {v1, p1}, Li9/u;-><init>(Li9/K;)V

    invoke-direct {v0, v1}, Lk9/e;-><init>(Lk9/l;)V

    invoke-interface {p0, v0}, Li9/f;->l(Lk9/o;)V

    return-void
.end method

.method public static b(Li9/f;Li9/K;)V
    .locals 2

    const-string v0, "padding"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lk9/e;

    new-instance v1, Li9/F;

    invoke-direct {v1, p1}, Li9/F;-><init>(Li9/K;)V

    invoke-direct {v0, v1}, Lk9/e;-><init>(Lk9/l;)V

    invoke-interface {p0, v0}, Li9/f;->l(Lk9/o;)V

    return-void
.end method

.method public static c(Li9/f;Li9/K;)V
    .locals 2

    const-string v0, "padding"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lk9/e;

    new-instance v1, Li9/M;

    invoke-direct {v1, p1}, Li9/M;-><init>(Li9/K;)V

    invoke-direct {v0, v1}, Lk9/e;-><init>(Lk9/l;)V

    invoke-interface {p0, v0}, Li9/f;->l(Lk9/o;)V

    return-void
.end method

.method public static d(Li9/f;I)V
    .locals 0

    invoke-static {p0, p1}, Li9/o$d$a;->d(Li9/o$d;I)V

    return-void
.end method

.method public static e(Li9/f;II)V
    .locals 8

    new-instance v0, Lk9/e;

    new-instance v7, Li9/t;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, v7

    move v2, p1

    move v3, p2

    invoke-direct/range {v1 .. v6}, Li9/t;-><init>(IILjava/util/List;ILy7/k;)V

    invoke-direct {v0, v7}, Lk9/e;-><init>(Lk9/l;)V

    invoke-interface {p0, v0}, Li9/f;->l(Lk9/o;)V

    return-void
.end method

.method public static f(Li9/f;Li9/n;)V
    .locals 1

    .prologue
    const-string v0, "format"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Li9/D;

    if-eqz v0, :cond_0

    check-cast p1, Li9/D;

    invoke-virtual {p1}, Li9/D;->c()Lk9/f;

    move-result-object p1

    invoke-interface {p0, p1}, Li9/f;->l(Lk9/o;)V

    :cond_0
    return-void
.end method
