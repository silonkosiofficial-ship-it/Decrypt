.class public abstract LF6/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LW8/M;

.field private static final b:LW6/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    new-instance v0, LW8/M;

    const-string v1, "call-context"

    invoke-direct {v0, v1}, LW8/M;-><init>(Ljava/lang/String;)V

    sput-object v0, LF6/l;->a:LW8/M;

    const-class v0, LC6/j;

    invoke-static {v0}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v1

    :try_start_0
    sget-object v2, LF7/q;->c:LF7/q$a;

    invoke-virtual {v2}, LF7/q$a;->c()LF7/q;

    move-result-object v2

    invoke-static {v0, v2}, Ly7/P;->q(Ljava/lang/Class;LF7/q;)LF7/o;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    const/4 v0, 0x0

    :goto_0
    new-instance v2, Lb7/a;

    invoke-direct {v2, v1, v0}, Lb7/a;-><init>(LF7/c;LF7/o;)V

    new-instance v0, LW6/a;

    const-string v1, "client-config"

    invoke-direct {v0, v1, v2}, LW6/a;-><init>(Ljava/lang/String;Lb7/a;)V

    sput-object v0, LF6/l;->b:LW6/a;

    return-void
.end method

.method public static final synthetic a(LO6/e;)V
    .locals 0

    invoke-static {p0}, LF6/l;->d(LO6/e;)V

    return-void
.end method

.method public static final b(LF6/b;LW8/z0;Lm7/e;)Ljava/lang/Object;
    .locals 6

    .prologue
    invoke-static {p1}, LW8/C0;->a(LW8/z0;)LW8/y;

    move-result-object p1

    invoke-interface {p0}, LW8/N;->getCoroutineContext()Lm7/i;

    move-result-object p0

    invoke-interface {p0, p1}, Lm7/i;->o0(Lm7/i;)Lm7/i;

    move-result-object p0

    sget-object v0, LF6/l;->a:LW8/M;

    invoke-interface {p0, v0}, Lm7/i;->o0(Lm7/i;)Lm7/i;

    move-result-object p0

    invoke-interface {p2}, Lm7/e;->getContext()Lm7/i;

    move-result-object p2

    sget-object v0, LW8/z0;->h:LW8/z0$b;

    invoke-interface {p2, v0}, Lm7/i;->i(Lm7/i$c;)Lm7/i$b;

    move-result-object p2

    move-object v0, p2

    check-cast v0, LW8/z0;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v3, LF6/s;

    invoke-direct {v3, p1}, LF6/s;-><init>(LW8/z0;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, LW8/z0$a;->d(LW8/z0;ZZLx7/l;ILjava/lang/Object;)LW8/f0;

    move-result-object p2

    new-instance v0, LF6/r;

    invoke-direct {v0, p2}, LF6/r;-><init>(LW8/f0;)V

    invoke-interface {p1, v0}, LW8/z0;->e1(Lx7/l;)LW8/f0;

    :goto_0
    return-object p0
.end method

.method public static final c()LW6/a;
    .locals 1

    sget-object v0, LF6/l;->b:LW6/a;

    return-object v0
.end method

.method private static final d(LO6/e;)V
    .locals 4

    .prologue
    invoke-virtual {p0}, LO6/e;->e()LT6/p;

    move-result-object p0

    invoke-interface {p0}, LW6/y;->names()Ljava/util/Set;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ljava/lang/String;

    sget-object v3, LT6/v;->a:LT6/v;

    invoke-virtual {v3}, LT6/v;->p()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    if-nez p0, :cond_2

    return-void

    :cond_2
    new-instance p0, LT6/Y;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, LT6/Y;-><init>(Ljava/lang/String;)V

    throw p0
.end method
