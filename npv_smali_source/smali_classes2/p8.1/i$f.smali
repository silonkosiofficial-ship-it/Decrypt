.class public Lp8/i$f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp8/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "f"
.end annotation


# instance fields
.field final a:Lp8/p;

.field final b:Ljava/lang/Object;

.field final c:Lp8/p;

.field final d:Lp8/i$e;

.field final e:Ljava/lang/Class;

.field final f:Ljava/lang/reflect/Method;


# direct methods
.method constructor <init>(Lp8/p;Ljava/lang/Object;Lp8/p;Lp8/i$e;Ljava/lang/Class;)V
    .locals 2

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_3

    invoke-virtual {p4}, Lp8/i$e;->j()Lp8/y$b;

    move-result-object v0

    sget-object v1, Lp8/y$b;->O:Lp8/y$b;

    if-ne v0, v1, :cond_1

    if-eqz p3, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Null messageDefaultInstance"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iput-object p1, p0, Lp8/i$f;->a:Lp8/p;

    iput-object p2, p0, Lp8/i$f;->b:Ljava/lang/Object;

    iput-object p3, p0, Lp8/i$f;->c:Lp8/p;

    iput-object p4, p0, Lp8/i$f;->d:Lp8/i$e;

    iput-object p5, p0, Lp8/i$f;->e:Ljava/lang/Class;

    const-class p1, Lp8/j$a;

    invoke-virtual {p1, p5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    new-array p1, p1, [Ljava/lang/Class;

    sget-object p2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 p3, 0x0

    aput-object p2, p1, p3

    const-string p2, "valueOf"

    invoke-static {p5, p2, p1}, Lp8/i;->k(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    :goto_1
    iput-object p1, p0, Lp8/i$f;->f:Ljava/lang/reflect/Method;

    goto :goto_2

    :cond_2
    const/4 p1, 0x0

    goto :goto_1

    :goto_2
    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Null containingTypeDefaultInstance"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .prologue
    iget-object v0, p0, Lp8/i$f;->d:Lp8/i$e;

    invoke-virtual {v0}, Lp8/i$e;->h()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lp8/i$f;->d:Lp8/i$e;

    invoke-virtual {v0}, Lp8/i$e;->p()Lp8/y$c;

    move-result-object v0

    sget-object v1, Lp8/y$c;->K:Lp8/y$c;

    if-ne v0, v1, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast p1, Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v1}, Lp8/i$f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    return-object p1

    :cond_2
    invoke-virtual {p0, p1}, Lp8/i$f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public b()Lp8/p;
    .locals 1

    iget-object v0, p0, Lp8/i$f;->a:Lp8/p;

    return-object v0
.end method

.method public c()Lp8/p;
    .locals 1

    iget-object v0, p0, Lp8/i$f;->c:Lp8/p;

    return-object v0
.end method

.method public d()I
    .locals 1

    iget-object v0, p0, Lp8/i$f;->d:Lp8/i$e;

    invoke-virtual {v0}, Lp8/i$e;->c()I

    move-result v0

    return v0
.end method

.method e(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .prologue
    iget-object v0, p0, Lp8/i$f;->d:Lp8/i$e;

    invoke-virtual {v0}, Lp8/i$e;->p()Lp8/y$c;

    move-result-object v0

    sget-object v1, Lp8/y$c;->K:Lp8/y$c;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lp8/i$f;->f:Ljava/lang/reflect/Method;

    check-cast p1, Ljava/lang/Integer;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 p1, 0x0

    invoke-static {v0, p1, v1}, Lp8/i;->l(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .prologue
    iget-object v0, p0, Lp8/i$f;->d:Lp8/i$e;

    invoke-virtual {v0}, Lp8/i$e;->p()Lp8/y$c;

    move-result-object v0

    sget-object v1, Lp8/y$c;->K:Lp8/y$c;

    if-ne v0, v1, :cond_0

    check-cast p1, Lp8/j$a;

    invoke-interface {p1}, Lp8/j$a;->c()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    :cond_0
    return-object p1
.end method
