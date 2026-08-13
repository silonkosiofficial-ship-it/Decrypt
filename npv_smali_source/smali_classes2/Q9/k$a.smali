.class public final LQ9/k$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LQ9/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly7/k;)V
    .locals 0

    invoke-direct {p0}, LQ9/k$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(LQ9/k$a;)LQ9/k;
    .locals 0

    invoke-direct {p0}, LQ9/k$a;->f()LQ9/k;

    move-result-object p0

    return-object p0
.end method

.method private final d()LQ9/k;
    .locals 1

    .prologue
    sget-object v0, LR9/e;->a:LR9/e;

    invoke-virtual {v0}, LR9/e;->b()V

    sget-object v0, LQ9/b;->e:LQ9/b$a;

    invoke-virtual {v0}, LQ9/b$a;->a()LQ9/k;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, LQ9/c;->f:LQ9/c$a;

    invoke-virtual {v0}, LQ9/c$a;->a()LQ9/k;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    :cond_0
    return-object v0
.end method

.method private final e()LQ9/k;
    .locals 1

    .prologue
    invoke-direct {p0}, LQ9/k$a;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, LQ9/e;->e:LQ9/e$a;

    invoke-virtual {v0}, LQ9/e$a;->b()LQ9/e;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-direct {p0}, LQ9/k$a;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, LQ9/d;->e:LQ9/d$a;

    invoke-virtual {v0}, LQ9/d$a;->a()LQ9/d;

    move-result-object v0

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    invoke-direct {p0}, LQ9/k$a;->k()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, LQ9/j;->e:LQ9/j$a;

    invoke-virtual {v0}, LQ9/j$a;->a()LQ9/j;

    move-result-object v0

    if-eqz v0, :cond_2

    return-object v0

    :cond_2
    sget-object v0, LQ9/i;->d:LQ9/i$a;

    invoke-virtual {v0}, LQ9/i$a;->a()LQ9/i;

    move-result-object v0

    if-eqz v0, :cond_3

    return-object v0

    :cond_3
    sget-object v0, LQ9/f;->i:LQ9/f$b;

    invoke-virtual {v0}, LQ9/f$b;->a()LQ9/k;

    move-result-object v0

    if-eqz v0, :cond_4

    return-object v0

    :cond_4
    new-instance v0, LQ9/k;

    invoke-direct {v0}, LQ9/k;-><init>()V

    return-object v0
.end method

.method private final f()LQ9/k;
    .locals 1

    .prologue
    invoke-virtual {p0}, LQ9/k$a;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, LQ9/k$a;->d()LQ9/k;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-direct {p0}, LQ9/k$a;->e()LQ9/k;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method private final i()Z
    .locals 2

    invoke-static {}, Ljava/security/Security;->getProviders()[Ljava/security/Provider;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0}, Ljava/security/Provider;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "BC"

    invoke-static {v1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method private final j()Z
    .locals 2

    invoke-static {}, Ljava/security/Security;->getProviders()[Ljava/security/Provider;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0}, Ljava/security/Provider;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Conscrypt"

    invoke-static {v1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method private final k()Z
    .locals 2

    invoke-static {}, Ljava/security/Security;->getProviders()[Ljava/security/Provider;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0}, Ljava/security/Provider;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "OpenJSSE"

    invoke-static {v1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method


# virtual methods
.method public final b(Ljava/util/List;)Ljava/util/List;
    .locals 4

    .prologue
    const-string v0, "protocols"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, LH9/y;

    sget-object v3, LH9/y;->E:LH9/y;

    if-eq v2, v3, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LH9/y;

    invoke-virtual {v1}, LH9/y;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    return-object p1
.end method

.method public final c(Ljava/util/List;)[B
    .locals 3

    .prologue
    const-string v0, "protocols"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LX9/d;

    invoke-direct {v0}, LX9/d;-><init>()V

    invoke-virtual {p0, p1}, LQ9/k$a;->b(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {v0, v2}, LX9/d;->v1(I)LX9/d;

    invoke-virtual {v0, v1}, LX9/d;->B1(Ljava/lang/String;)LX9/d;

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, LX9/d;->K0()[B

    move-result-object p1

    return-object p1
.end method

.method public final g()LQ9/k;
    .locals 1

    invoke-static {}, LQ9/k;->a()LQ9/k;

    move-result-object v0

    return-object v0
.end method

.method public final h()Z
    .locals 2

    const-string v0, "java.vm.name"

    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Dalvik"

    invoke-static {v1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method
