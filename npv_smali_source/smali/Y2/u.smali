.class public LY2/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LY2/t;


# static fields
.field private static volatile e:LY2/v;


# instance fields
.field private final a:Li3/a;

.field private final b:Li3/a;

.field private final c:Le3/e;

.field private final d:Lf3/r;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method constructor <init>(Li3/a;Li3/a;Le3/e;Lf3/r;Lf3/v;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LY2/u;->a:Li3/a;

    iput-object p2, p0, LY2/u;->b:Li3/a;

    iput-object p3, p0, LY2/u;->c:Le3/e;

    iput-object p4, p0, LY2/u;->d:Lf3/r;

    invoke-virtual {p5}, Lf3/v;->c()V

    return-void
.end method

.method private b(LY2/o;)LY2/i;
    .locals 4

    invoke-static {}, LY2/i;->a()LY2/i$a;

    move-result-object v0

    iget-object v1, p0, LY2/u;->a:Li3/a;

    invoke-interface {v1}, Li3/a;->a()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, LY2/i$a;->i(J)LY2/i$a;

    move-result-object v0

    iget-object v1, p0, LY2/u;->b:Li3/a;

    invoke-interface {v1}, Li3/a;->a()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, LY2/i$a;->o(J)LY2/i$a;

    move-result-object v0

    invoke-virtual {p1}, LY2/o;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LY2/i$a;->n(Ljava/lang/String;)LY2/i$a;

    move-result-object v0

    new-instance v1, LY2/h;

    invoke-virtual {p1}, LY2/o;->b()LW2/b;

    move-result-object v2

    invoke-virtual {p1}, LY2/o;->d()[B

    move-result-object v3

    invoke-direct {v1, v2, v3}, LY2/h;-><init>(LW2/b;[B)V

    invoke-virtual {v0, v1}, LY2/i$a;->h(LY2/h;)LY2/i$a;

    move-result-object v0

    invoke-virtual {p1}, LY2/o;->c()LW2/c;

    move-result-object v1

    invoke-virtual {v1}, LW2/c;->a()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, LY2/i$a;->g(Ljava/lang/Integer;)LY2/i$a;

    move-result-object v0

    invoke-virtual {p1}, LY2/o;->c()LW2/c;

    move-result-object v1

    invoke-virtual {v1}, LW2/c;->e()LW2/f;

    invoke-virtual {p1}, LY2/o;->c()LW2/c;

    move-result-object p1

    invoke-virtual {p1}, LW2/c;->b()LW2/d;

    invoke-virtual {v0}, LY2/i$a;->d()LY2/i;

    move-result-object p1

    return-object p1
.end method

.method public static c()LY2/u;
    .locals 2

    .prologue
    sget-object v0, LY2/u;->e:LY2/v;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LY2/v;->f()LY2/u;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Not initialized!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static d(LY2/f;)Ljava/util/Set;
    .locals 1

    .prologue
    instance-of v0, p0, LY2/g;

    if-eqz v0, :cond_0

    check-cast p0, LY2/g;

    invoke-interface {p0}, LY2/g;->a()Ljava/util/Set;

    move-result-object p0

    invoke-static {p0}, Lj$/util/DesugarCollections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p0

    return-object p0

    :cond_0
    const-string p0, "proto"

    invoke-static {p0}, LW2/b;->b(Ljava/lang/String;)LW2/b;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method public static f(Landroid/content/Context;)V
    .locals 2

    .prologue
    sget-object v0, LY2/u;->e:LY2/v;

    if-nez v0, :cond_1

    const-class v0, LY2/u;

    monitor-enter v0

    :try_start_0
    sget-object v1, LY2/u;->e:LY2/v;

    if-nez v1, :cond_0

    invoke-static {}, LY2/e;->a()LY2/v$a;

    move-result-object v1

    invoke-interface {v1, p0}, LY2/v$a;->a(Landroid/content/Context;)LY2/v$a;

    move-result-object p0

    invoke-interface {p0}, LY2/v$a;->i()LY2/v;

    move-result-object p0

    sput-object p0, LY2/u;->e:LY2/v;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_1
    :goto_2
    return-void
.end method


# virtual methods
.method public a(LY2/o;LW2/j;)V
    .locals 3

    iget-object v0, p0, LY2/u;->c:Le3/e;

    invoke-virtual {p1}, LY2/o;->f()LY2/p;

    move-result-object v1

    invoke-virtual {p1}, LY2/o;->c()LW2/c;

    move-result-object v2

    invoke-virtual {v2}, LW2/c;->d()LW2/e;

    move-result-object v2

    invoke-virtual {v1, v2}, LY2/p;->f(LW2/e;)LY2/p;

    move-result-object v1

    invoke-direct {p0, p1}, LY2/u;->b(LY2/o;)LY2/i;

    move-result-object p1

    invoke-interface {v0, v1, p1, p2}, Le3/e;->a(LY2/p;LY2/i;LW2/j;)V

    return-void
.end method

.method public e()Lf3/r;
    .locals 1

    iget-object v0, p0, LY2/u;->d:Lf3/r;

    return-object v0
.end method

.method public g(LY2/f;)LW2/i;
    .locals 4

    new-instance v0, LY2/q;

    invoke-static {p1}, LY2/u;->d(LY2/f;)Ljava/util/Set;

    move-result-object v1

    invoke-static {}, LY2/p;->a()LY2/p$a;

    move-result-object v2

    invoke-interface {p1}, LY2/f;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, LY2/p$a;->b(Ljava/lang/String;)LY2/p$a;

    move-result-object v2

    invoke-interface {p1}, LY2/f;->getExtras()[B

    move-result-object p1

    invoke-virtual {v2, p1}, LY2/p$a;->c([B)LY2/p$a;

    move-result-object p1

    invoke-virtual {p1}, LY2/p$a;->a()LY2/p;

    move-result-object p1

    invoke-direct {v0, v1, p1, p0}, LY2/q;-><init>(Ljava/util/Set;LY2/p;LY2/t;)V

    return-object v0
.end method
