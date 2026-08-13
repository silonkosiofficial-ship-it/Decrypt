.class final LW8/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Executor;


# instance fields
.field public final C:LW8/J;


# direct methods
.method public constructor <init>(LW8/J;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LW8/c0;->C:LW8/J;

    return-void
.end method


# virtual methods
.method public execute(Ljava/lang/Runnable;)V
    .locals 2

    .prologue
    iget-object v0, p0, LW8/c0;->C:LW8/J;

    sget-object v1, Lm7/j;->C:Lm7/j;

    invoke-virtual {v0, v1}, LW8/J;->v1(Lm7/i;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LW8/c0;->C:LW8/J;

    invoke-virtual {v0, v1, p1}, LW8/J;->t1(Lm7/i;Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    :goto_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LW8/c0;->C:LW8/J;

    invoke-virtual {v0}, LW8/J;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
