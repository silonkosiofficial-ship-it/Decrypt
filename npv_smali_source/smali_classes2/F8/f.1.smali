.class public abstract LF8/f;
.super LF8/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF8/f$a;,
        LF8/f$b;
    }
.end annotation


# instance fields
.field private final b:LE8/i;

.field private final c:Z


# direct methods
.method public constructor <init>(LE8/n;)V
    .locals 3

    const-string v0, "storageManager"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LF8/l;-><init>()V

    new-instance v0, LF8/f$c;

    invoke-direct {v0, p0}, LF8/f$c;-><init>(LF8/f;)V

    sget-object v1, LF8/f$d;->D:LF8/f$d;

    new-instance v2, LF8/f$e;

    invoke-direct {v2, p0}, LF8/f$e;-><init>(LF8/f;)V

    invoke-interface {p1, v0, v1, v2}, LE8/n;->g(Lx7/a;Lx7/l;Lx7/l;)LE8/i;

    move-result-object p1

    iput-object p1, p0, LF8/f;->b:LE8/i;

    return-void
.end method

.method public static final synthetic e(LF8/f;LF8/e0;Z)Ljava/util/Collection;
    .locals 0

    invoke-direct {p0, p1, p2}, LF8/f;->f(LF8/e0;Z)Ljava/util/Collection;

    move-result-object p0

    return-object p0
.end method

.method private final f(LF8/e0;Z)Ljava/util/Collection;
    .locals 2

    .prologue
    instance-of v0, p1, LF8/f;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LF8/f;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    iget-object v1, v0, LF8/f;->b:LE8/i;

    invoke-interface {v1}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LF8/f$b;

    invoke-virtual {v1}, LF8/f$b;->a()Ljava/util/Collection;

    move-result-object v1

    invoke-virtual {v0, p2}, LF8/f;->i(Z)Ljava/util/Collection;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    invoke-static {v1, p2}, Lj7/v;->C0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p2

    if-eqz p2, :cond_1

    check-cast p2, Ljava/util/Collection;

    goto :goto_1

    :cond_1
    invoke-interface {p1}, LF8/e0;->u()Ljava/util/Collection;

    move-result-object p2

    const-string p1, "getSupertypes(...)"

    invoke-static {p2, p1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_1
    return-object p2
.end method


# virtual methods
.method protected abstract g()Ljava/util/Collection;
.end method

.method protected abstract h()LF8/E;
.end method

.method protected i(Z)Ljava/util/Collection;
    .locals 0

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1
.end method

.method protected j()Z
    .locals 1

    iget-boolean v0, p0, LF8/f;->c:Z

    return v0
.end method

.method protected abstract k()LO7/d0;
.end method

.method public l()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LF8/f;->b:LE8/i;

    invoke-interface {v0}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LF8/f$b;

    invoke-virtual {v0}, LF8/f$b;->b()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method protected m(Ljava/util/List;)Ljava/util/List;
    .locals 1

    const-string v0, "supertypes"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method protected n(LF8/E;)V
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method protected o(LF8/E;)V
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic u()Ljava/util/Collection;
    .locals 1

    invoke-virtual {p0}, LF8/f;->l()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    return-object v0
.end method

.method public v(LG8/g;)LF8/e0;
    .locals 1

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LF8/f$a;

    invoke-direct {v0, p0, p1}, LF8/f$a;-><init>(LF8/f;LG8/g;)V

    return-object v0
.end method
