.class public abstract LF6/t;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/String;

.field private static final b:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const-string v0, "ktor-client"

    sput-object v0, LF6/t;->a:Ljava/lang/String;

    sget-object v0, LT6/v;->a:LT6/v;

    invoke-virtual {v0}, LT6/v;->j()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, LT6/v;->k()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, LT6/v;->n()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, LT6/v;->l()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, LT6/v;->m()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v1, v2, v3, v4, v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lj7/Z;->g([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, LF6/t;->b:Ljava/util/Set;

    return-void
.end method

.method public static synthetic a(Lx7/p;Ljava/lang/String;Ljava/util/List;)Li7/M;
    .locals 0

    invoke-static {p0, p1, p2}, LF6/t;->f(Lx7/p;Ljava/lang/String;Ljava/util/List;)Li7/M;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(LT6/p;LU6/b;LT6/q;)Li7/M;
    .locals 0

    invoke-static {p0, p1, p2}, LF6/t;->e(LT6/p;LU6/b;LT6/q;)Li7/M;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lm7/e;)Ljava/lang/Object;
    .locals 1

    invoke-interface {p0}, Lm7/e;->getContext()Lm7/i;

    move-result-object p0

    sget-object v0, LF6/m;->D:LF6/m$a;

    invoke-interface {p0, v0}, Lm7/i;->i(Lm7/i$c;)Lm7/i$b;

    move-result-object p0

    invoke-static {p0}, Ly7/t;->c(Ljava/lang/Object;)V

    check-cast p0, LF6/m;

    invoke-virtual {p0}, LF6/m;->a()Lm7/i;

    move-result-object p0

    return-object p0
.end method

.method public static final d(LT6/p;LU6/b;Lx7/p;)V
    .locals 3

    .prologue
    const-string v0, "requestHeaders"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "content"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "block"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LF6/p;

    invoke-direct {v0, p0, p1}, LF6/p;-><init>(LT6/p;LU6/b;)V

    invoke-static {v0}, LR6/d;->a(Lx7/l;)LT6/p;

    move-result-object v0

    new-instance v1, LF6/q;

    invoke-direct {v1, p2}, LF6/q;-><init>(Lx7/p;)V

    invoke-interface {v0, v1}, LW6/y;->e(Lx7/p;)V

    sget-object v0, LT6/v;->a:LT6/v;

    invoke-virtual {v0}, LT6/v;->q()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p0, v1}, LW6/y;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-virtual {p1}, LU6/b;->c()LT6/p;

    move-result-object v1

    invoke-virtual {v0}, LT6/v;->q()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, LW6/y;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-static {}, LF6/t;->g()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, LT6/v;->q()Ljava/lang/String;

    move-result-object v1

    sget-object v2, LF6/t;->a:Ljava/lang/String;

    invoke-interface {p2, v1, v2}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-virtual {p1}, LU6/b;->b()LT6/h;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, LT6/n;->toString()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_2

    :cond_1
    invoke-virtual {p1}, LU6/b;->c()LT6/p;

    move-result-object v1

    invoke-virtual {v0}, LT6/v;->h()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, LW6/y;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_2

    invoke-virtual {v0}, LT6/v;->h()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p0, v1}, LW6/y;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :cond_2
    invoke-virtual {p1}, LU6/b;->a()Ljava/lang/Long;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Ljava/lang/Long;->toString()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_4

    :cond_3
    invoke-virtual {p1}, LU6/b;->c()LT6/p;

    move-result-object p1

    invoke-virtual {v0}, LT6/v;->g()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v2}, LW6/y;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_4

    invoke-virtual {v0}, LT6/v;->g()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, LW6/y;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    :cond_4
    if-eqz v1, :cond_5

    invoke-virtual {v0}, LT6/v;->h()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p2, p0, v1}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    if-eqz v2, :cond_6

    invoke-virtual {v0}, LT6/v;->g()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p2, p0, v2}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    return-void
.end method

.method private static final e(LT6/p;LU6/b;LT6/q;)Li7/M;
    .locals 1

    const-string v0, "$this$buildHeaders"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, p0}, LW6/B;->g(LW6/y;)V

    invoke-virtual {p1}, LU6/b;->c()LT6/p;

    move-result-object p0

    invoke-virtual {p2, p0}, LW6/B;->g(LW6/y;)V

    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method

.method private static final f(Lx7/p;Ljava/lang/String;Ljava/util/List;)Li7/M;
    .locals 10

    .prologue
    const-string v0, "key"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "values"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LT6/v;->a:LT6/v;

    invoke-virtual {v0}, LT6/v;->g()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0

    :cond_0
    invoke-virtual {v0}, LT6/v;->h()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0

    :cond_1
    sget-object v1, LF6/t;->b:Ljava/util/Set;

    invoke-interface {v1, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {p0, p1, v0}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, LT6/v;->i()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "; "

    :goto_1
    move-object v2, v0

    goto :goto_2

    :cond_3
    const-string v0, ","

    goto :goto_1

    :goto_2
    move-object v1, p2

    check-cast v1, Ljava/lang/Iterable;

    const/16 v8, 0x3e

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Lj7/v;->r0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lx7/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p0, p1, p2}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method

.method private static final g()Z
    .locals 1

    sget-object v0, LW6/w;->a:LW6/w;

    invoke-virtual {v0}, LW6/w;->a()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method
