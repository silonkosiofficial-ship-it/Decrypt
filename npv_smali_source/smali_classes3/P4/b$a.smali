.class final LP4/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LP4/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field final C:Ljava/util/concurrent/Future;

.field final D:LP4/a;


# direct methods
.method constructor <init>(Ljava/util/concurrent/Future;LP4/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LP4/b$a;->C:Ljava/util/concurrent/Future;

    iput-object p2, p0, LP4/b$a;->D:LP4/a;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    iget-object v0, p0, LP4/b$a;->C:Ljava/util/concurrent/Future;

    :try_start_0
    invoke-static {v0}, LP4/b;->b(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v1, p0, LP4/b$a;->D:LP4/a;

    invoke-interface {v1, v0}, LP4/a;->a(Ljava/lang/Object;)V

    return-void

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    :goto_0
    iget-object v1, p0, LP4/b$a;->D:LP4/a;

    invoke-interface {v1, v0}, LP4/a;->b(Ljava/lang/Throwable;)V

    return-void

    :catch_2
    move-exception v0

    iget-object v1, p0, LP4/b$a;->D:LP4/a;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    invoke-interface {v1, v0}, LP4/a;->b(Ljava/lang/Throwable;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    invoke-static {p0}, LM4/d;->a(Ljava/lang/Object;)LM4/d$b;

    move-result-object v0

    iget-object v1, p0, LP4/b$a;->D:LP4/a;

    invoke-virtual {v0, v1}, LM4/d$b;->c(Ljava/lang/Object;)LM4/d$b;

    move-result-object v0

    invoke-virtual {v0}, LM4/d$b;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
