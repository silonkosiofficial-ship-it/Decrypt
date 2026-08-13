.class public abstract Lf5/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf5/j$a;
    }
.end annotation


# direct methods
.method public static a()Ljava/util/concurrent/Executor;
    .locals 1

    sget-object v0, Lf5/j$a;->C:Lf5/j$a;

    return-object v0
.end method

.method public static b(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;
    .locals 1

    new-instance v0, Lf5/k;

    invoke-direct {v0, p0}, Lf5/k;-><init>(Ljava/util/concurrent/Executor;)V

    return-object v0
.end method
