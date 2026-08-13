.class public Landroidx/room/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/room/c$b;,
        Landroidx/room/c$c;
    }
.end annotation


# static fields
.field public static final o:Landroidx/room/c$b;


# instance fields
.field private final a:Lo2/n;

.field private final b:Ljava/util/Map;

.field private final c:Ljava/util/Map;

.field private final d:[Ljava/lang/String;

.field private final e:Lo2/D;

.field private final f:Ljava/util/Map;

.field private final g:Ljava/util/concurrent/locks/ReentrantLock;

.field private h:Lv2/b;

.field private final i:Lx7/a;

.field private final j:Lx7/a;

.field private final k:Lo2/h;

.field private l:Landroid/content/Intent;

.field private m:Landroidx/room/d;

.field private final n:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/room/c$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/room/c$b;-><init>(Ly7/k;)V

    sput-object v0, Landroidx/room/c;->o:Landroidx/room/c$b;

    return-void
.end method

.method public varargs constructor <init>(Lo2/n;Ljava/util/Map;Ljava/util/Map;[Ljava/lang/String;)V
    .locals 8

    const-string v0, "database"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "shadowTablesMap"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewTables"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tableNames"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/room/c;->a:Lo2/n;

    iput-object p2, p0, Landroidx/room/c;->b:Ljava/util/Map;

    iput-object p3, p0, Landroidx/room/c;->c:Ljava/util/Map;

    iput-object p4, p0, Landroidx/room/c;->d:[Ljava/lang/String;

    new-instance v0, Lo2/D;

    invoke-virtual {p1}, Lo2/n;->B()Z

    move-result v6

    new-instance v7, Landroidx/room/c$d;

    invoke-direct {v7, p0}, Landroidx/room/c$d;-><init>(Ljava/lang/Object;)V

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v1 .. v7}, Lo2/D;-><init>(Lo2/n;Ljava/util/Map;Ljava/util/Map;[Ljava/lang/String;ZLx7/l;)V

    iput-object v0, p0, Landroidx/room/c;->e:Lo2/D;

    new-instance p2, Ljava/util/LinkedHashMap;

    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p2, p0, Landroidx/room/c;->f:Ljava/util/Map;

    new-instance p2, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {p2}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object p2, p0, Landroidx/room/c;->g:Ljava/util/concurrent/locks/ReentrantLock;

    new-instance p2, Landroidx/room/c$f;

    invoke-direct {p2, p0}, Landroidx/room/c$f;-><init>(Landroidx/room/c;)V

    iput-object p2, p0, Landroidx/room/c;->i:Lx7/a;

    new-instance p2, Landroidx/room/c$e;

    invoke-direct {p2, p0}, Landroidx/room/c$e;-><init>(Landroidx/room/c;)V

    iput-object p2, p0, Landroidx/room/c;->j:Lx7/a;

    new-instance p2, Lo2/h;

    invoke-direct {p2, p1}, Lo2/h;-><init>(Lo2/n;)V

    iput-object p2, p0, Landroidx/room/c;->k:Lo2/h;

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/room/c;->n:Ljava/lang/Object;

    new-instance p1, Landroidx/room/c$a;

    invoke-direct {p1, p0}, Landroidx/room/c$a;-><init>(Landroidx/room/c;)V

    invoke-virtual {v0, p1}, Lo2/D;->r(Lx7/a;)V

    return-void
.end method

.method public static final synthetic a(Landroidx/room/c;)Lv2/b;
    .locals 0

    iget-object p0, p0, Landroidx/room/c;->h:Lv2/b;

    return-object p0
.end method

.method public static final synthetic b(Landroidx/room/c;)Lo2/D;
    .locals 0

    iget-object p0, p0, Landroidx/room/c;->e:Lo2/D;

    return-object p0
.end method

.method public static final synthetic c(Landroidx/room/c;Ljava/util/Set;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/room/c;->m(Ljava/util/Set;)V

    return-void
.end method

.method public static final synthetic d(Landroidx/room/c;)V
    .locals 0

    invoke-direct {p0}, Landroidx/room/c;->o()V

    return-void
.end method

.method private final e(Landroidx/room/c$c;)Z
    .locals 4

    .prologue
    iget-object v0, p0, Landroidx/room/c;->e:Lo2/D;

    invoke-virtual {p1}, Landroidx/room/c$c;->a()[Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo2/D;->v([Ljava/lang/String;)Li7/u;

    move-result-object v0

    invoke-virtual {v0}, Li7/u;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/String;

    invoke-virtual {v0}, Li7/u;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    new-instance v2, Landroidx/room/e;

    invoke-direct {v2, p1, v0, v1}, Landroidx/room/e;-><init>(Landroidx/room/c$c;[I[Ljava/lang/String;)V

    iget-object v1, p0, Landroidx/room/c;->g:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    :try_start_0
    iget-object v3, p0, Landroidx/room/c;->f:Ljava/util/Map;

    invoke-interface {v3, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v2, p0, Landroidx/room/c;->f:Ljava/util/Map;

    invoke-static {v2, p1}, Lj7/S;->i(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_0
    check-cast p1, Landroidx/room/e;

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_0
    iget-object v3, p0, Landroidx/room/c;->f:Ljava/util/Map;

    invoke-interface {v3, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :goto_1
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    if-nez p1, :cond_1

    iget-object p1, p0, Landroidx/room/c;->e:Lo2/D;

    invoke-virtual {p1, v0}, Lo2/D;->l([I)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_2

    :cond_1
    const/4 p1, 0x0

    :goto_2
    return p1

    :goto_3
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw p1
.end method

.method private final h()Ljava/util/List;
    .locals 2

    .prologue
    iget-object v0, p0, Landroidx/room/c;->g:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    :try_start_0
    iget-object v1, p0, Landroidx/room/c;->f:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, Lj7/v;->T0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-object v1

    :catchall_0
    move-exception v1

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw v1
.end method

.method private final m(Ljava/util/Set;)V
    .locals 2

    .prologue
    iget-object v0, p0, Landroidx/room/c;->g:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    :try_start_0
    iget-object v1, p0, Landroidx/room/c;->f:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, Lj7/v;->T0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/room/e;

    invoke-virtual {v1, p1}, Landroidx/room/e;->c(Ljava/util/Set;)V

    goto :goto_0

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw p1
.end method

.method private final o()V
    .locals 6

    .prologue
    iget-object v0, p0, Landroidx/room/c;->n:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/room/c;->m:Landroidx/room/d;

    if-eqz v1, :cond_2

    invoke-direct {p0}, Landroidx/room/c;->h()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Landroidx/room/c$c;

    invoke-virtual {v5}, Landroidx/room/c$c;->b()Z

    move-result v5

    if-nez v5, :cond_0

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_1
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v1}, Landroidx/room/d;->l()V

    :cond_2
    iget-object v1, p0, Landroidx/room/c;->e:Lo2/D;

    invoke-virtual {v1}, Lo2/D;->p()V

    sget-object v1, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0

    throw v1
.end method

.method private final t(Landroidx/room/c$c;)Z
    .locals 2

    .prologue
    iget-object v0, p0, Landroidx/room/c;->g:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    :try_start_0
    iget-object v1, p0, Landroidx/room/c;->f:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/room/e;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    if-eqz p1, :cond_0

    iget-object v0, p0, Landroidx/room/c;->e:Lo2/D;

    invoke-virtual {p1}, Landroidx/room/e;->b()[I

    move-result-object p1

    invoke-virtual {v0, p1}, Lo2/D;->m([I)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw p1
.end method


# virtual methods
.method public final f(Landroidx/room/c$c;)V
    .locals 1

    .prologue
    const-string v0, "observer"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/room/c$c;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Landroidx/room/c;->e(Landroidx/room/c$c;)Z

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "isRemote was false of observer argument"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final g([Ljava/lang/String;Z)LZ8/f;
    .locals 2

    .prologue
    const-string v0, "tables"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/room/c;->e:Lo2/D;

    invoke-virtual {v0, p1}, Lo2/D;->v([Ljava/lang/String;)Li7/u;

    move-result-object p1

    invoke-virtual {p1}, Li7/u;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    invoke-virtual {p1}, Li7/u;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [I

    iget-object v1, p0, Landroidx/room/c;->e:Lo2/D;

    invoke-virtual {v1, v0, p1, p2}, Lo2/D;->j([Ljava/lang/String;[IZ)LZ8/f;

    move-result-object p1

    iget-object p2, p0, Landroidx/room/c;->m:Landroidx/room/d;

    if-eqz p2, :cond_0

    invoke-virtual {p2, v0}, Landroidx/room/d;->h([Ljava/lang/String;)LZ8/f;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-eqz p2, :cond_1

    const/4 v0, 0x2

    new-array v0, v0, [LZ8/f;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const/4 p1, 0x1

    aput-object p2, v0, p1

    invoke-static {v0}, LZ8/h;->E([LZ8/f;)LZ8/f;

    move-result-object p1

    :cond_1
    return-object p1
.end method

.method public final i()Lo2/n;
    .locals 1

    iget-object v0, p0, Landroidx/room/c;->a:Lo2/n;

    return-object v0
.end method

.method public final j()[Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Landroidx/room/c;->d:[Ljava/lang/String;

    return-object v0
.end method

.method public final k(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serviceIntent"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p3, p0, Landroidx/room/c;->l:Landroid/content/Intent;

    new-instance p3, Landroidx/room/d;

    invoke-direct {p3, p1, p2, p0}, Landroidx/room/d;-><init>(Landroid/content/Context;Ljava/lang/String;Landroidx/room/c;)V

    iput-object p3, p0, Landroidx/room/c;->m:Landroidx/room/d;

    return-void
.end method

.method public final l(Ly2/b;)V
    .locals 2

    .prologue
    const-string v0, "connection"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/room/c;->e:Lo2/D;

    invoke-virtual {v0, p1}, Lo2/D;->i(Ly2/b;)V

    iget-object p1, p0, Landroidx/room/c;->n:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Landroidx/room/c;->m:Landroidx/room/d;

    if-eqz v0, :cond_1

    iget-object v1, p0, Landroidx/room/c;->l:Landroid/content/Intent;

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Landroidx/room/d;->k(Landroid/content/Intent;)V

    sget-object v0, Li7/M;->a:Li7/M;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    const-string v0, "Required value was null."

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    :goto_0
    monitor-exit p1

    return-void

    :goto_1
    monitor-exit p1

    throw v0
.end method

.method public final n(Ljava/util/Set;)V
    .locals 3

    .prologue
    const-string v0, "tables"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/room/c;->g:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    :try_start_0
    iget-object v1, p0, Landroidx/room/c;->f:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, Lj7/v;->T0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/room/e;

    invoke-virtual {v1}, Landroidx/room/e;->a()Landroidx/room/c$c;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/room/c$c;->b()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v1, p1}, Landroidx/room/e;->d(Ljava/util/Set;)V

    goto :goto_0

    :cond_1
    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw p1
.end method

.method public final p([Ljava/lang/String;Lm7/e;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Landroidx/room/c;->e:Lo2/D;

    iget-object v1, p0, Landroidx/room/c;->i:Lx7/a;

    iget-object v2, p0, Landroidx/room/c;->j:Lx7/a;

    invoke-virtual {v0, p1, v1, v2, p2}, Lo2/D;->n([Ljava/lang/String;Lx7/a;Lx7/a;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final q()V
    .locals 3

    iget-object v0, p0, Landroidx/room/c;->e:Lo2/D;

    iget-object v1, p0, Landroidx/room/c;->i:Lx7/a;

    iget-object v2, p0, Landroidx/room/c;->j:Lx7/a;

    invoke-virtual {v0, v1, v2}, Lo2/D;->o(Lx7/a;Lx7/a;)V

    return-void
.end method

.method public r()V
    .locals 3

    iget-object v0, p0, Landroidx/room/c;->e:Lo2/D;

    iget-object v1, p0, Landroidx/room/c;->i:Lx7/a;

    iget-object v2, p0, Landroidx/room/c;->j:Lx7/a;

    invoke-virtual {v0, v1, v2}, Lo2/D;->o(Lx7/a;Lx7/a;)V

    return-void
.end method

.method public s(Landroidx/room/c$c;)V
    .locals 2

    .prologue
    const-string v0, "observer"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Landroidx/room/c;->t(Landroidx/room/c$c;)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Landroidx/room/c$g;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Landroidx/room/c$g;-><init>(Landroidx/room/c;Lm7/e;)V

    const/4 v1, 0x1

    invoke-static {v0, p1, v1, v0}, LW8/g;->f(Lm7/i;Lx7/p;ILjava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public final u(Lv2/b;)V
    .locals 1

    const-string v0, "autoCloser"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Landroidx/room/c;->h:Lv2/b;

    new-instance v0, Landroidx/room/c$h;

    invoke-direct {v0, p0}, Landroidx/room/c$h;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Lv2/b;->m(Lx7/a;)V

    return-void
.end method

.method public final v()V
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/room/c;->m:Landroidx/room/d;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/room/d;->l()V

    :cond_0
    return-void
.end method

.method public final w(Lm7/e;)Ljava/lang/Object;
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/room/c;->a:Lo2/n;

    invoke-virtual {v0}, Lo2/n;->C()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/room/c;->a:Lo2/n;

    invoke-virtual {v0}, Lo2/n;->K()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :cond_0
    iget-object v0, p0, Landroidx/room/c;->e:Lo2/D;

    invoke-virtual {v0, p1}, Lo2/D;->u(Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_1

    return-object p1

    :cond_1
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final x()V
    .locals 3

    new-instance v0, Landroidx/room/c$i;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Landroidx/room/c$i;-><init>(Landroidx/room/c;Lm7/e;)V

    const/4 v2, 0x1

    invoke-static {v1, v0, v2, v1}, LW8/g;->f(Lm7/i;Lx7/p;ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
