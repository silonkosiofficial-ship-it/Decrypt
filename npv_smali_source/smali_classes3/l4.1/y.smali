.class final Ll4/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic C:Ll4/l;

.field final synthetic D:Ll4/z;


# direct methods
.method constructor <init>(Ll4/z;Ll4/l;)V
    .locals 0

    iput-object p1, p0, Ll4/y;->D:Ll4/z;

    iput-object p2, p0, Ll4/y;->C:Ll4/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    :try_start_0
    iget-object v0, p0, Ll4/y;->D:Ll4/z;

    invoke-static {v0}, Ll4/z;->e(Ll4/z;)Ll4/c;

    move-result-object v0

    iget-object v1, p0, Ll4/y;->C:Ll4/l;

    invoke-interface {v0, v1}, Ll4/c;->a(Ll4/l;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll4/l;
    :try_end_0
    .catch Ll4/j; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v0, :cond_0

    iget-object v0, p0, Ll4/y;->D:Ll4/z;

    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "Continuation returned null"

    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ll4/z;->d(Ljava/lang/Exception;)V

    return-void

    :cond_0
    iget-object v1, p0, Ll4/y;->D:Ll4/z;

    sget-object v2, Ll4/n;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {v0, v2, v1}, Ll4/l;->f(Ljava/util/concurrent/Executor;Ll4/h;)Ll4/l;

    iget-object v1, p0, Ll4/y;->D:Ll4/z;

    invoke-virtual {v0, v2, v1}, Ll4/l;->d(Ljava/util/concurrent/Executor;Ll4/g;)Ll4/l;

    iget-object v1, p0, Ll4/y;->D:Ll4/z;

    invoke-virtual {v0, v2, v1}, Ll4/l;->a(Ljava/util/concurrent/Executor;Ll4/e;)Ll4/l;

    return-void

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_1

    :goto_0
    iget-object v1, p0, Ll4/y;->D:Ll4/z;

    invoke-static {v1}, Ll4/z;->f(Ll4/z;)Ll4/P;

    move-result-object v1

    invoke-virtual {v1, v0}, Ll4/P;->r(Ljava/lang/Exception;)V

    return-void

    :goto_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    instance-of v1, v1, Ljava/lang/Exception;

    if-eqz v1, :cond_1

    iget-object v1, p0, Ll4/y;->D:Ll4/z;

    invoke-static {v1}, Ll4/z;->f(Ll4/z;)Ll4/P;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    check-cast v0, Ljava/lang/Exception;

    invoke-virtual {v1, v0}, Ll4/P;->r(Ljava/lang/Exception;)V

    return-void

    :cond_1
    iget-object v1, p0, Ll4/y;->D:Ll4/z;

    invoke-static {v1}, Ll4/z;->f(Ll4/z;)Ll4/P;

    move-result-object v1

    invoke-virtual {v1, v0}, Ll4/P;->r(Ljava/lang/Exception;)V

    return-void
.end method
