.class final Lf0/u$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf0/u;-><init>(Lx7/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lf0/u;


# direct methods
.method constructor <init>(Lf0/u;)V
    .locals 0

    iput-object p1, p0, Lf0/u$c;->D:Lf0/u;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    iget-object v0, p0, Lf0/u$c;->D:Lf0/u;

    invoke-static {v0}, Lf0/u;->f(Lf0/u;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lf0/u$c;->D:Lf0/u;

    invoke-static {v0}, Lf0/u;->d(Lf0/u;)LX/b;

    move-result-object v0

    iget-object v1, p0, Lf0/u$c;->D:Lf0/u;

    monitor-enter v0

    :try_start_0
    invoke-static {v1}, Lf0/u;->c(Lf0/u;)Lf0/u$a;

    move-result-object v1

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1, p1}, Lf0/u$a;->k(Ljava/lang/Object;)V

    sget-object p1, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1

    :cond_0
    :goto_0
    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lf0/u$c;->a(Ljava/lang/Object;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
