.class public final LW8/Y0;
.super Ljava/util/concurrent/CancellationException;
.source "SourceFile"

# interfaces
.implements LW8/D;


# instance fields
.field public final transient C:LW8/z0;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, LW8/Y0;-><init>(Ljava/lang/String;LW8/z0;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;LW8/z0;)V
    .locals 0

    invoke-direct {p0, p1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    iput-object p2, p0, LW8/Y0;->C:LW8/z0;

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ljava/lang/Throwable;
    .locals 1

    invoke-virtual {p0}, LW8/Y0;->b()LW8/Y0;

    move-result-object v0

    return-object v0
.end method

.method public b()LW8/Y0;
    .locals 3

    .prologue
    new-instance v0, LW8/Y0;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    const-string v1, ""

    :cond_0
    iget-object v2, p0, LW8/Y0;->C:LW8/z0;

    invoke-direct {v0, v1, v2}, LW8/Y0;-><init>(Ljava/lang/String;LW8/z0;)V

    invoke-virtual {v0, p0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    return-object v0
.end method
