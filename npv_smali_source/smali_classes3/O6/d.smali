.class public final LO6/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT6/y;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LO6/d$a;
    }
.end annotation


# static fields
.field public static final g:LO6/d$a;


# instance fields
.field private final a:LT6/M;

.field private b:LT6/A;

.field private final c:LT6/q;

.field private d:Ljava/lang/Object;

.field private e:LW8/z0;

.field private final f:LW6/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LO6/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LO6/d$a;-><init>(Ly7/k;)V

    sput-object v0, LO6/d;->g:LO6/d$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 13

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v12, LT6/M;

    const/16 v10, 0x1ff

    const/4 v11, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v0, v12

    invoke-direct/range {v0 .. v11}, LT6/M;-><init>(LT6/U;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;LT6/G;Ljava/lang/String;ZILy7/k;)V

    iput-object v12, p0, LO6/d;->a:LT6/M;

    sget-object v0, LT6/A;->b:LT6/A$a;

    invoke-virtual {v0}, LT6/A$a;->a()LT6/A;

    move-result-object v0

    iput-object v0, p0, LO6/d;->b:LT6/A;

    new-instance v0, LT6/q;

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, LT6/q;-><init>(IILy7/k;)V

    iput-object v0, p0, LO6/d;->c:LT6/q;

    sget-object v0, LR6/b;->a:LR6/b;

    iput-object v0, p0, LO6/d;->d:Ljava/lang/Object;

    invoke-static {v3, v2, v3}, LW8/U0;->b(LW8/z0;ILjava/lang/Object;)LW8/y;

    move-result-object v0

    iput-object v0, p0, LO6/d;->e:LW8/z0;

    invoke-static {v2}, LW6/d;->a(Z)LW6/b;

    move-result-object v0

    iput-object v0, p0, LO6/d;->f:LW6/b;

    return-void
.end method

.method public static synthetic b()Ljava/util/Map;
    .locals 1

    invoke-static {}, LO6/d;->n()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method private static final n()Ljava/util/Map;
    .locals 1

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()LT6/q;
    .locals 1

    iget-object v0, p0, LO6/d;->c:LT6/q;

    return-object v0
.end method

.method public final c()LO6/e;
    .locals 8

    .prologue
    new-instance v7, LO6/e;

    iget-object v0, p0, LO6/d;->a:LT6/M;

    invoke-virtual {v0}, LT6/M;->b()LT6/g0;

    move-result-object v1

    iget-object v2, p0, LO6/d;->b:LT6/A;

    invoke-virtual {p0}, LO6/d;->a()LT6/q;

    move-result-object v0

    invoke-virtual {v0}, LT6/q;->q()LT6/p;

    move-result-object v3

    iget-object v0, p0, LO6/d;->d:Ljava/lang/Object;

    instance-of v4, v0, LU6/b;

    if-eqz v4, :cond_0

    check-cast v0, LU6/b;

    :goto_0
    move-object v4, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    if-eqz v4, :cond_1

    iget-object v5, p0, LO6/d;->e:LW8/z0;

    iget-object v6, p0, LO6/d;->f:LW6/b;

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, LO6/e;-><init>(LT6/g0;LT6/A;LT6/p;LU6/b;LW8/z0;LW6/b;)V

    return-object v7

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No request transformation found: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LO6/d;->d:Ljava/lang/Object;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final d()LW6/b;
    .locals 1

    iget-object v0, p0, LO6/d;->f:LW6/b;

    return-object v0
.end method

.method public final e()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LO6/d;->d:Ljava/lang/Object;

    return-object v0
.end method

.method public final f()Lb7/a;
    .locals 2

    iget-object v0, p0, LO6/d;->f:LW6/b;

    invoke-static {}, LO6/j;->a()LW6/a;

    move-result-object v1

    invoke-interface {v0, v1}, LW6/b;->c(LW6/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb7/a;

    return-object v0
.end method

.method public final g(LF6/h;)Ljava/lang/Object;
    .locals 2

    .prologue
    const-string v0, "key"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LO6/d;->f:LW6/b;

    invoke-static {}, LF6/i;->a()LW6/a;

    move-result-object v1

    invoke-interface {v0, v1}, LW6/b;->c(LW6/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final h()LW8/z0;
    .locals 1

    iget-object v0, p0, LO6/d;->e:LW8/z0;

    return-object v0
.end method

.method public final i()LT6/A;
    .locals 1

    iget-object v0, p0, LO6/d;->b:LT6/A;

    return-object v0
.end method

.method public final j()LT6/M;
    .locals 1

    iget-object v0, p0, LO6/d;->a:LT6/M;

    return-object v0
.end method

.method public final k(Ljava/lang/Object;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LO6/d;->d:Ljava/lang/Object;

    return-void
.end method

.method public final l(Lb7/a;)V
    .locals 2

    .prologue
    if-eqz p1, :cond_0

    iget-object v0, p0, LO6/d;->f:LW6/b;

    invoke-static {}, LO6/j;->a()LW6/a;

    move-result-object v1

    invoke-interface {v0, v1, p1}, LW6/b;->f(LW6/a;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, LO6/d;->f:LW6/b;

    invoke-static {}, LO6/j;->a()LW6/a;

    move-result-object v0

    invoke-interface {p1, v0}, LW6/b;->d(LW6/a;)V

    :goto_0
    return-void
.end method

.method public final m(LF6/h;Ljava/lang/Object;)V
    .locals 3

    const-string v0, "key"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "capability"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LO6/d;->f:LW6/b;

    invoke-static {}, LF6/i;->a()LW6/a;

    move-result-object v1

    new-instance v2, LO6/c;

    invoke-direct {v2}, LO6/c;-><init>()V

    invoke-interface {v0, v1, v2}, LW6/b;->g(LW6/a;Lx7/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final o(LW8/z0;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LO6/d;->e:LW8/z0;

    return-void
.end method

.method public final p(LT6/A;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LO6/d;->b:LT6/A;

    return-void
.end method

.method public final q(LO6/d;)LO6/d;
    .locals 2

    const-string v0, "builder"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, LO6/d;->b:LT6/A;

    iput-object v0, p0, LO6/d;->b:LT6/A;

    iget-object v0, p1, LO6/d;->d:Ljava/lang/Object;

    iput-object v0, p0, LO6/d;->d:Ljava/lang/Object;

    invoke-virtual {p1}, LO6/d;->f()Lb7/a;

    move-result-object v0

    invoke-virtual {p0, v0}, LO6/d;->l(Lb7/a;)V

    iget-object v0, p0, LO6/d;->a:LT6/M;

    iget-object v1, p1, LO6/d;->a:LT6/M;

    invoke-static {v0, v1}, LT6/X;->i(LT6/M;LT6/M;)LT6/M;

    iget-object v0, p0, LO6/d;->a:LT6/M;

    invoke-virtual {v0}, LT6/M;->g()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, LT6/M;->v(Ljava/util/List;)V

    invoke-virtual {p0}, LO6/d;->a()LT6/q;

    move-result-object v0

    invoke-virtual {p1}, LO6/d;->a()LT6/q;

    move-result-object v1

    invoke-static {v0, v1}, LW6/D;->c(LW6/z;LW6/z;)LW6/z;

    iget-object v0, p0, LO6/d;->f:LW6/b;

    iget-object p1, p1, LO6/d;->f:LW6/b;

    invoke-static {v0, p1}, LW6/e;->a(LW6/b;LW6/b;)V

    return-object p0
.end method

.method public final r(LO6/d;)LO6/d;
    .locals 1

    const-string v0, "builder"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, LO6/d;->e:LW8/z0;

    iput-object v0, p0, LO6/d;->e:LW8/z0;

    invoke-virtual {p0, p1}, LO6/d;->q(LO6/d;)LO6/d;

    move-result-object p1

    return-object p1
.end method
