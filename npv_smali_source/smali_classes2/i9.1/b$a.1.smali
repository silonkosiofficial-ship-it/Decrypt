.class public abstract Li9/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li9/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static a(Li9/b;[Lx7/l;Lx7/l;)V
    .locals 5

    .prologue
    const-string v0, "otherFormats"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mainFormat"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, p1, v2

    invoke-interface {p0}, Li9/b;->w()Li9/b;

    move-result-object v4

    invoke-interface {v3, v4}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v4}, Li9/b;->a()Lk9/d;

    move-result-object v3

    invoke-virtual {v3}, Lk9/d;->b()Lk9/h;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Li9/b;->w()Li9/b;

    move-result-object p1

    invoke-interface {p2, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1}, Li9/b;->a()Lk9/d;

    move-result-object p1

    invoke-virtual {p1}, Lk9/d;->b()Lk9/h;

    move-result-object p1

    invoke-interface {p0}, Li9/b;->a()Lk9/d;

    move-result-object p0

    new-instance p2, Lk9/c;

    invoke-direct {p2, p1, v0}, Lk9/c;-><init>(Lk9/o;Ljava/util/List;)V

    invoke-virtual {p0, p2}, Lk9/d;->a(Lk9/o;)V

    return-void
.end method

.method public static b(Li9/b;Ljava/lang/String;Lx7/l;)V
    .locals 1

    const-string v0, "onZero"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "format"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Li9/b;->a()Lk9/d;

    move-result-object v0

    invoke-interface {p0}, Li9/b;->w()Li9/b;

    move-result-object p0

    invoke-interface {p2, p0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-interface {p0}, Li9/b;->a()Lk9/d;

    move-result-object p0

    invoke-virtual {p0}, Lk9/d;->b()Lk9/h;

    move-result-object p0

    new-instance p2, Lk9/t;

    invoke-direct {p2, p1, p0}, Lk9/t;-><init>(Ljava/lang/String;Lk9/o;)V

    invoke-virtual {v0, p2}, Lk9/d;->a(Lk9/o;)V

    return-void
.end method

.method public static c(Li9/b;)Lk9/f;
    .locals 1

    new-instance v0, Lk9/f;

    invoke-interface {p0}, Li9/b;->a()Lk9/d;

    move-result-object p0

    invoke-virtual {p0}, Lk9/d;->b()Lk9/h;

    move-result-object p0

    invoke-virtual {p0}, Lk9/h;->c()Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, Lk9/f;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public static d(Li9/b;Ljava/lang/String;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Li9/b;->a()Lk9/d;

    move-result-object p0

    new-instance v0, Lk9/j;

    invoke-direct {v0, p1}, Lk9/j;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lk9/d;->a(Lk9/o;)V

    return-void
.end method
