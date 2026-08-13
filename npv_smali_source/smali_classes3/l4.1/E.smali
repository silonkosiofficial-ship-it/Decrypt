.class final Ll4/E;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic C:Ll4/l;

.field final synthetic D:Ll4/F;


# direct methods
.method constructor <init>(Ll4/F;Ll4/l;)V
    .locals 0

    iput-object p1, p0, Ll4/E;->D:Ll4/F;

    iput-object p2, p0, Ll4/E;->C:Ll4/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    iget-object v0, p0, Ll4/E;->D:Ll4/F;

    invoke-static {v0}, Ll4/F;->b(Ll4/F;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ll4/E;->D:Ll4/F;

    invoke-static {v1}, Ll4/F;->a(Ll4/F;)Ll4/g;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-static {v1}, Ll4/F;->a(Ll4/F;)Ll4/g;

    move-result-object v1

    iget-object v2, p0, Ll4/E;->C:Ll4/l;

    invoke-virtual {v2}, Ll4/l;->k()Ljava/lang/Exception;

    move-result-object v2

    invoke-static {v2}, LQ3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Exception;

    invoke-interface {v1, v2}, Ll4/g;->d(Ljava/lang/Exception;)V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
