.class public abstract LP4/b;
.super LP4/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LP4/b$a;
    }
.end annotation


# direct methods
.method public static a(LP4/d;LP4/a;Ljava/util/concurrent/Executor;)V
    .locals 1

    invoke-static {p1}, LM4/h;->i(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, LP4/b$a;

    invoke-direct {v0, p0, p1}, LP4/b$a;-><init>(Ljava/util/concurrent/Future;LP4/a;)V

    invoke-interface {p0, v0, p2}, LP4/d;->e(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public static b(Ljava/util/concurrent/Future;)Ljava/lang/Object;
    .locals 2

    invoke-interface {p0}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v0

    const-string v1, "Future was expected to be done: %s"

    invoke-static {v0, v1, p0}, LM4/h;->p(ZLjava/lang/String;Ljava/lang/Object;)V

    invoke-static {p0}, LP4/e;->a(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
