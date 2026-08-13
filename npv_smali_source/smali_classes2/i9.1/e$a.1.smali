.class public abstract Li9/e$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li9/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static a(Li9/e;Li9/n;)V
    .locals 1

    .prologue
    const-string v0, "format"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Li9/W;

    if-eqz v0, :cond_0

    check-cast p1, Li9/W;

    invoke-virtual {p1}, Li9/W;->c()Lk9/f;

    move-result-object p1

    invoke-interface {p0, p1}, Li9/e;->t(Lk9/o;)V

    :cond_0
    return-void
.end method

.method public static b(Li9/e;Li9/K;)V
    .locals 3

    const-string v0, "padding"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lk9/z;

    new-instance v1, Lk9/e;

    new-instance v2, Li9/a0;

    invoke-direct {v2, p1}, Li9/a0;-><init>(Li9/K;)V

    invoke-direct {v1, v2}, Lk9/e;-><init>(Lk9/l;)V

    const/4 p1, 0x1

    invoke-direct {v0, v1, p1}, Lk9/z;-><init>(Lk9/o;Z)V

    invoke-interface {p0, v0}, Li9/e;->t(Lk9/o;)V

    return-void
.end method

.method public static c(Li9/e;Li9/K;)V
    .locals 2

    const-string v0, "padding"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lk9/e;

    new-instance v1, Li9/Y;

    invoke-direct {v1, p1}, Li9/Y;-><init>(Li9/K;)V

    invoke-direct {v0, v1}, Lk9/e;-><init>(Lk9/l;)V

    invoke-interface {p0, v0}, Li9/e;->t(Lk9/o;)V

    return-void
.end method

.method public static d(Li9/e;Li9/K;)V
    .locals 2

    const-string v0, "padding"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lk9/e;

    new-instance v1, Li9/Z;

    invoke-direct {v1, p1}, Li9/Z;-><init>(Li9/K;)V

    invoke-direct {v0, v1}, Lk9/e;-><init>(Lk9/l;)V

    invoke-interface {p0, v0}, Li9/e;->t(Lk9/o;)V

    return-void
.end method
