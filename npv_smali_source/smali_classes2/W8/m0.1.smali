.class public abstract LW8/m0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a()LW8/j0;
    .locals 2

    new-instance v0, LW8/f;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-direct {v0, v1}, LW8/f;-><init>(Ljava/lang/Thread;)V

    return-object v0
.end method
