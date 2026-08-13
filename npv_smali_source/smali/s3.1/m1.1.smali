.class final Ls3/m1;
.super Lcom/google/android/gms/internal/ads/gk;
.source "SourceFile"


# instance fields
.field final synthetic C:Ls3/o1;


# direct methods
.method synthetic constructor <init>(Ls3/o1;Ls3/n1;)V
    .locals 0

    iput-object p1, p0, Ls3/m1;->C:Ls3/o1;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/gk;-><init>()V

    return-void
.end method


# virtual methods
.method public final L4(Ljava/util/List;)V
    .locals 4

    .prologue
    iget-object v0, p0, Ls3/m1;->C:Ls3/o1;

    invoke-static {v0}, Ls3/o1;->i(Ls3/o1;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ls3/m1;->C:Ls3/o1;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Ls3/o1;->l(Ls3/o1;Z)V

    iget-object v1, p0, Ls3/m1;->C:Ls3/o1;

    const/4 v3, 0x1

    invoke-static {v1, v3}, Ls3/o1;->k(Ls3/o1;Z)V

    new-instance v1, Ljava/util/ArrayList;

    iget-object v3, p0, Ls3/m1;->C:Ls3/o1;

    invoke-static {v3}, Ls3/o1;->j(Ls3/o1;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget-object v3, p0, Ls3/m1;->C:Ls3/o1;

    invoke-static {v3}, Ls3/o1;->j(Ls3/o1;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {p1}, Ls3/o1;->f(Ljava/util/List;)Lq3/b;

    move-result-object p1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    :goto_0
    if-ge v2, v0, :cond_0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lq3/c;

    invoke-interface {v3, p1}, Lq3/c;->a(Lq3/b;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
