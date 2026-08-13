.class final Ll4/I;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic C:Ll4/l;

.field final synthetic D:Ll4/J;


# direct methods
.method constructor <init>(Ll4/J;Ll4/l;)V
    .locals 0

    iput-object p1, p0, Ll4/I;->D:Ll4/J;

    iput-object p2, p0, Ll4/I;->C:Ll4/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    :try_start_0
    iget-object v0, p0, Ll4/I;->D:Ll4/J;

    invoke-static {v0}, Ll4/J;->e(Ll4/J;)Ll4/k;

    move-result-object v0

    iget-object v1, p0, Ll4/I;->C:Ll4/l;

    invoke-virtual {v1}, Ll4/l;->l()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ll4/k;->a(Ljava/lang/Object;)Ll4/l;

    move-result-object v0
    :try_end_0
    .catch Ll4/j; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v0, :cond_0

    iget-object v0, p0, Ll4/I;->D:Ll4/J;

    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "Continuation returned null"

    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ll4/J;->d(Ljava/lang/Exception;)V

    return-void

    :cond_0
    iget-object v1, p0, Ll4/I;->D:Ll4/J;

    sget-object v2, Ll4/n;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {v0, v2, v1}, Ll4/l;->f(Ljava/util/concurrent/Executor;Ll4/h;)Ll4/l;

    iget-object v1, p0, Ll4/I;->D:Ll4/J;

    invoke-virtual {v0, v2, v1}, Ll4/l;->d(Ljava/util/concurrent/Executor;Ll4/g;)Ll4/l;

    iget-object v1, p0, Ll4/I;->D:Ll4/J;

    invoke-virtual {v0, v2, v1}, Ll4/l;->a(Ljava/util/concurrent/Executor;Ll4/e;)Ll4/l;

    return-void

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_1

    :goto_0
    iget-object v1, p0, Ll4/I;->D:Ll4/J;

    invoke-virtual {v1, v0}, Ll4/J;->d(Ljava/lang/Exception;)V

    return-void

    :catch_2
    iget-object v0, p0, Ll4/I;->D:Ll4/J;

    invoke-virtual {v0}, Ll4/J;->b()V

    return-void

    :goto_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    instance-of v1, v1, Ljava/lang/Exception;

    if-eqz v1, :cond_1

    iget-object v1, p0, Ll4/I;->D:Ll4/J;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    check-cast v0, Ljava/lang/Exception;

    invoke-virtual {v1, v0}, Ll4/J;->d(Ljava/lang/Exception;)V

    return-void

    :cond_1
    iget-object v1, p0, Ll4/I;->D:Ll4/J;

    invoke-virtual {v1, v0}, Ll4/J;->d(Ljava/lang/Exception;)V

    return-void
.end method
