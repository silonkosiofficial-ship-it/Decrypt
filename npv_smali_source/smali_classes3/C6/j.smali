.class public final LC6/j;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/util/Map;

.field private final b:Ljava/util/Map;

.field private final c:Ljava/util/Map;

.field private d:Lx7/l;

.field private e:Z

.field private f:Z

.field private g:Z

.field private h:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, LC6/j;->a:Ljava/util/Map;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, LC6/j;->b:Ljava/util/Map;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, LC6/j;->c:Ljava/util/Map;

    new-instance v0, LC6/e;

    invoke-direct {v0}, LC6/e;-><init>()V

    iput-object v0, p0, LC6/j;->d:Lx7/l;

    const/4 v0, 0x1

    iput-boolean v0, p0, LC6/j;->e:Z

    iput-boolean v0, p0, LC6/j;->f:Z

    sget-object v0, LW6/w;->a:LW6/w;

    invoke-virtual {v0}, LW6/w;->b()Z

    move-result v0

    iput-boolean v0, p0, LC6/j;->h:Z

    return-void
.end method

.method public static synthetic a(LF6/j;)Li7/M;
    .locals 0

    invoke-static {p0}, LC6/j;->i(LF6/j;)Li7/M;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(LI6/r;LC6/c;)Li7/M;
    .locals 0

    invoke-static {p0, p1}, LC6/j;->t(LI6/r;LC6/c;)Li7/M;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lx7/l;Lx7/l;Ljava/lang/Object;)Li7/M;
    .locals 0

    invoke-static {p0, p1, p2}, LC6/j;->s(Lx7/l;Lx7/l;Ljava/lang/Object;)Li7/M;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d()LW6/b;
    .locals 1

    invoke-static {}, LC6/j;->u()LW6/b;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e(Lx7/l;Lx7/l;LF6/j;)Li7/M;
    .locals 0

    invoke-static {p0, p1, p2}, LC6/j;->h(Lx7/l;Lx7/l;LF6/j;)Li7/M;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Ljava/lang/Object;)Li7/M;
    .locals 0

    invoke-static {p0}, LC6/j;->r(Ljava/lang/Object;)Li7/M;

    move-result-object p0

    return-object p0
.end method

.method private static final h(Lx7/l;Lx7/l;LF6/j;)Li7/M;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p2}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1, p2}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method

.method private static final i(LF6/j;)Li7/M;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method

.method public static synthetic q(LC6/j;LI6/r;Lx7/l;ILjava/lang/Object;)V
    .locals 0

    .prologue
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    new-instance p2, LC6/f;

    invoke-direct {p2}, LC6/f;-><init>()V

    :cond_0
    invoke-virtual {p0, p1, p2}, LC6/j;->o(LI6/r;Lx7/l;)V

    return-void
.end method

.method private static final r(Ljava/lang/Object;)Li7/M;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method

.method private static final s(Lx7/l;Lx7/l;Ljava/lang/Object;)Li7/M;
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_0

    invoke-interface {p0, p2}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-interface {p1, p2}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method

.method private static final t(LI6/r;LC6/c;)Li7/M;
    .locals 3

    const-string v0, "scope"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LC6/c;->x0()LW6/b;

    move-result-object v0

    invoke-static {}, LI6/s;->a()LW6/a;

    move-result-object v1

    new-instance v2, LC6/i;

    invoke-direct {v2}, LC6/i;-><init>()V

    invoke-interface {v0, v1, v2}, LW6/b;->g(LW6/a;Lx7/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LW6/b;

    invoke-virtual {p1}, LC6/c;->o()LC6/j;

    move-result-object v1

    iget-object v1, v1, LC6/j;->b:Ljava/util/Map;

    invoke-interface {p0}, LI6/r;->getKey()LW6/a;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    check-cast v1, Lx7/l;

    invoke-interface {p0, v1}, LI6/r;->a(Lx7/l;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p0, v1, p1}, LI6/r;->b(Ljava/lang/Object;LC6/c;)V

    invoke-interface {p0}, LI6/r;->getKey()LW6/a;

    move-result-object p0

    invoke-interface {v0, p0, v1}, LW6/b;->f(LW6/a;Ljava/lang/Object;)V

    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method

.method private static final u()LW6/b;
    .locals 1

    const/4 v0, 0x1

    invoke-static {v0}, LW6/d;->a(Z)LW6/b;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final g(Lx7/l;)V
    .locals 2

    const-string v0, "block"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LC6/j;->d:Lx7/l;

    new-instance v1, LC6/d;

    invoke-direct {v1, v0, p1}, LC6/d;-><init>(Lx7/l;Lx7/l;)V

    iput-object v1, p0, LC6/j;->d:Lx7/l;

    return-void
.end method

.method public final j()Lx7/l;
    .locals 1

    iget-object v0, p0, LC6/j;->d:Lx7/l;

    return-object v0
.end method

.method public final k()Z
    .locals 1

    iget-boolean v0, p0, LC6/j;->g:Z

    return v0
.end method

.method public final l()Z
    .locals 1

    iget-boolean v0, p0, LC6/j;->e:Z

    return v0
.end method

.method public final m()Z
    .locals 1

    iget-boolean v0, p0, LC6/j;->f:Z

    return v0
.end method

.method public final n(LC6/c;)V
    .locals 2

    .prologue
    const-string v0, "client"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LC6/j;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx7/l;

    invoke-interface {v1, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iget-object v0, p0, LC6/j;->c:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx7/l;

    invoke-interface {v1, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_1
    return-void
.end method

.method public final o(LI6/r;Lx7/l;)V
    .locals 4

    .prologue
    const-string v0, "plugin"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configure"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LC6/j;->b:Ljava/util/Map;

    invoke-interface {p1}, LI6/r;->getKey()LW6/a;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx7/l;

    iget-object v1, p0, LC6/j;->b:Ljava/util/Map;

    invoke-interface {p1}, LI6/r;->getKey()LW6/a;

    move-result-object v2

    new-instance v3, LC6/g;

    invoke-direct {v3, v0, p2}, LC6/g;-><init>(Lx7/l;Lx7/l;)V

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p0, LC6/j;->a:Ljava/util/Map;

    invoke-interface {p1}, LI6/r;->getKey()LW6/a;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    return-void

    :cond_0
    iget-object p2, p0, LC6/j;->a:Ljava/util/Map;

    invoke-interface {p1}, LI6/r;->getKey()LW6/a;

    move-result-object v0

    new-instance v1, LC6/h;

    invoke-direct {v1, p1}, LC6/h;-><init>(LI6/r;)V

    invoke-interface {p2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final p(Ljava/lang/String;Lx7/l;)V
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "block"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LC6/j;->c:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final v(LC6/j;)V
    .locals 2

    const-string v0, "other"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p1, LC6/j;->e:Z

    iput-boolean v0, p0, LC6/j;->e:Z

    iget-boolean v0, p1, LC6/j;->f:Z

    iput-boolean v0, p0, LC6/j;->f:Z

    iget-boolean v0, p1, LC6/j;->g:Z

    iput-boolean v0, p0, LC6/j;->g:Z

    iget-object v0, p0, LC6/j;->a:Ljava/util/Map;

    iget-object v1, p1, LC6/j;->a:Ljava/util/Map;

    invoke-interface {v0, v1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    iget-object v0, p0, LC6/j;->b:Ljava/util/Map;

    iget-object v1, p1, LC6/j;->b:Ljava/util/Map;

    invoke-interface {v0, v1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    iget-object v0, p0, LC6/j;->c:Ljava/util/Map;

    iget-object p1, p1, LC6/j;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-void
.end method
