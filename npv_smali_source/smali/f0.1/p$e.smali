.class final Lf0/p$e;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf0/p;->b0(Lx7/l;)Lf0/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lx7/l;


# direct methods
.method constructor <init>(Lx7/l;)V
    .locals 0

    iput-object p1, p0, Lf0/p$e;->D:Lx7/l;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lf0/n;)Lf0/k;
    .locals 3

    .prologue
    iget-object v0, p0, Lf0/p$e;->D:Lx7/l;

    invoke-interface {v0, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lf0/k;

    invoke-static {}, Lf0/p;->I()Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    invoke-static {}, Lf0/p;->j()Lf0/n;

    move-result-object v1

    invoke-virtual {p1}, Lf0/k;->f()I

    move-result v2

    invoke-virtual {v1, v2}, Lf0/n;->N(I)Lf0/n;

    move-result-object v1

    invoke-static {v1}, Lf0/p;->v(Lf0/n;)V

    sget-object v1, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lf0/n;

    invoke-virtual {p0, p1}, Lf0/p$e;->a(Lf0/n;)Lf0/k;

    move-result-object p1

    return-object p1
.end method
