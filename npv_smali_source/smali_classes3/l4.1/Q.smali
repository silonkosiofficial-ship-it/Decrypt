.class final Ll4/Q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic C:Ll4/P;

.field final synthetic D:Ljava/util/concurrent/Callable;


# direct methods
.method constructor <init>(Ll4/P;Ljava/util/concurrent/Callable;)V
    .locals 0

    iput-object p1, p0, Ll4/Q;->C:Ll4/P;

    iput-object p2, p0, Ll4/Q;->D:Ljava/util/concurrent/Callable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    :try_start_0
    iget-object v0, p0, Ll4/Q;->C:Ll4/P;

    iget-object v1, p0, Ll4/Q;->D:Ljava/util/concurrent/Callable;

    invoke-interface {v1}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll4/P;->s(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :goto_0
    iget-object v1, p0, Ll4/Q;->C:Ll4/P;

    new-instance v2, Ljava/lang/RuntimeException;

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v1, v2}, Ll4/P;->r(Ljava/lang/Exception;)V

    return-void

    :goto_1
    iget-object v1, p0, Ll4/Q;->C:Ll4/P;

    invoke-virtual {v1, v0}, Ll4/P;->r(Ljava/lang/Exception;)V

    return-void
.end method
