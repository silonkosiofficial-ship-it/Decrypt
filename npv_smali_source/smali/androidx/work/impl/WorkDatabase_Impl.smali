.class public final Landroidx/work/impl/WorkDatabase_Impl;
.super Landroidx/work/impl/WorkDatabase;
.source "SourceFile"


# instance fields
.field private volatile q:LQ2/q;

.field private volatile r:LQ2/b;

.field private volatile s:LQ2/t;

.field private volatile t:LQ2/h;

.field private volatile u:LQ2/k;

.field private volatile v:LQ2/n;

.field private volatile w:LQ2/e;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/work/impl/WorkDatabase;-><init>()V

    return-void
.end method

.method static synthetic a0(Landroidx/work/impl/WorkDatabase_Impl;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lo2/n;->j:Ljava/util/List;

    return-object p0
.end method

.method static synthetic b0(Landroidx/work/impl/WorkDatabase_Impl;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lo2/n;->j:Ljava/util/List;

    return-object p0
.end method

.method static synthetic c0(Landroidx/work/impl/WorkDatabase_Impl;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lo2/n;->j:Ljava/util/List;

    return-object p0
.end method

.method static synthetic d0(Landroidx/work/impl/WorkDatabase_Impl;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lo2/n;->j:Ljava/util/List;

    return-object p0
.end method

.method static synthetic e0(Landroidx/work/impl/WorkDatabase_Impl;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lo2/n;->j:Ljava/util/List;

    return-object p0
.end method

.method static synthetic f0(Landroidx/work/impl/WorkDatabase_Impl;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lo2/n;->j:Ljava/util/List;

    return-object p0
.end method

.method static synthetic g0(Landroidx/work/impl/WorkDatabase_Impl;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lo2/n;->j:Ljava/util/List;

    return-object p0
.end method

.method static synthetic h0(Landroidx/work/impl/WorkDatabase_Impl;Lz2/d;)Lz2/d;
    .locals 0

    iput-object p1, p0, Lo2/n;->a:Lz2/d;

    return-object p1
.end method

.method static synthetic i0(Landroidx/work/impl/WorkDatabase_Impl;Lz2/d;)V
    .locals 0

    invoke-virtual {p0, p1}, Lo2/n;->I(Lz2/d;)V

    return-void
.end method

.method static synthetic j0(Landroidx/work/impl/WorkDatabase_Impl;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lo2/n;->j:Ljava/util/List;

    return-object p0
.end method

.method static synthetic k0(Landroidx/work/impl/WorkDatabase_Impl;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lo2/n;->j:Ljava/util/List;

    return-object p0
.end method


# virtual methods
.method public Q()LQ2/b;
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->r:LQ2/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->r:LQ2/b;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->r:LQ2/b;

    if-nez v0, :cond_1

    new-instance v0, LQ2/c;

    invoke-direct {v0, p0}, LQ2/c;-><init>(Lo2/n;)V

    iput-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->r:LQ2/b;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->r:LQ2/b;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public U()LQ2/e;
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->w:LQ2/e;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->w:LQ2/e;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->w:LQ2/e;

    if-nez v0, :cond_1

    new-instance v0, LQ2/f;

    invoke-direct {v0, p0}, LQ2/f;-><init>(Lo2/n;)V

    iput-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->w:LQ2/e;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->w:LQ2/e;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public V()LQ2/h;
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->t:LQ2/h;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->t:LQ2/h;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->t:LQ2/h;

    if-nez v0, :cond_1

    new-instance v0, LQ2/i;

    invoke-direct {v0, p0}, LQ2/i;-><init>(Lo2/n;)V

    iput-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->t:LQ2/h;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->t:LQ2/h;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public W()LQ2/k;
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->u:LQ2/k;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->u:LQ2/k;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->u:LQ2/k;

    if-nez v0, :cond_1

    new-instance v0, LQ2/l;

    invoke-direct {v0, p0}, LQ2/l;-><init>(Lo2/n;)V

    iput-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->u:LQ2/k;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->u:LQ2/k;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public X()LQ2/n;
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->v:LQ2/n;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->v:LQ2/n;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->v:LQ2/n;

    if-nez v0, :cond_1

    new-instance v0, LQ2/o;

    invoke-direct {v0, p0}, LQ2/o;-><init>(Lo2/n;)V

    iput-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->v:LQ2/n;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->v:LQ2/n;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public Y()LQ2/q;
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->q:LQ2/q;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->q:LQ2/q;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->q:LQ2/q;

    if-nez v0, :cond_1

    new-instance v0, LQ2/r;

    invoke-direct {v0, p0}, LQ2/r;-><init>(Lo2/n;)V

    iput-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->q:LQ2/q;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->q:LQ2/q;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public Z()LQ2/t;
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->s:LQ2/t;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->s:LQ2/t;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->s:LQ2/t;

    if-nez v0, :cond_1

    new-instance v0, LQ2/u;

    invoke-direct {v0, p0}, LQ2/u;-><init>(Lo2/n;)V

    iput-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->s:LQ2/t;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->s:LQ2/t;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method protected k()Landroidx/room/c;
    .locals 10

    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2, v1}, Ljava/util/HashMap;-><init>(I)V

    new-instance v1, Landroidx/room/c;

    const-string v8, "WorkProgress"

    const-string v9, "Preference"

    const-string v3, "Dependency"

    const-string v4, "WorkSpec"

    const-string v5, "WorkTag"

    const-string v6, "SystemIdInfo"

    const-string v7, "WorkName"

    filled-new-array/range {v3 .. v9}, [Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, p0, v0, v2, v3}, Landroidx/room/c;-><init>(Lo2/n;Ljava/util/Map;Ljava/util/Map;[Ljava/lang/String;)V

    return-object v1
.end method

.method protected m(Lo2/c;)Lz2/e;
    .locals 4

    new-instance v0, Lo2/t;

    new-instance v1, Landroidx/work/impl/WorkDatabase_Impl$a;

    const/16 v2, 0xc

    invoke-direct {v1, p0, v2}, Landroidx/work/impl/WorkDatabase_Impl$a;-><init>(Landroidx/work/impl/WorkDatabase_Impl;I)V

    const-string v2, "c103703e120ae8cc73c9248622f3cd1e"

    const-string v3, "49f946663a8deb7054212b8adda248c6"

    invoke-direct {v0, p1, v1, v2, v3}, Lo2/t;-><init>(Lo2/c;Lo2/t$b;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p1, Lo2/c;->a:Landroid/content/Context;

    invoke-static {v1}, Lz2/e$b;->a(Landroid/content/Context;)Lz2/e$b$a;

    move-result-object v1

    iget-object v2, p1, Lo2/c;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lz2/e$b$a;->c(Ljava/lang/String;)Lz2/e$b$a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lz2/e$b$a;->b(Lz2/e$a;)Lz2/e$b$a;

    move-result-object v0

    invoke-virtual {v0}, Lz2/e$b$a;->a()Lz2/e$b;

    move-result-object v0

    iget-object p1, p1, Lo2/c;->c:Lz2/e$c;

    invoke-interface {p1, v0}, Lz2/e$c;->a(Lz2/e$b;)Lz2/e;

    move-result-object p1

    return-object p1
.end method
