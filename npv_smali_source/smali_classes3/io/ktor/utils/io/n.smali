.class public final Lio/ktor/utils/io/n;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/Throwable;


# direct methods
.method public constructor <init>(Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    if-eqz v0, :cond_3

    instance-of v0, p1, LW8/D;

    if-eqz v0, :cond_1

    :goto_0
    check-cast p1, LW8/D;

    invoke-interface {p1}, LW8/D;->a()Ljava/lang/Throwable;

    move-result-object p1

    goto :goto_1

    :cond_1
    move-object v0, p1

    check-cast v0, Ljava/util/concurrent/CancellationException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    const-string v0, "Channel was cancelled"

    :cond_2
    invoke-static {v0, p1}, LW8/o0;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;

    move-result-object p1

    goto :goto_1

    :cond_3
    instance-of v0, p1, Ljava/io/IOException;

    if-eqz v0, :cond_4

    instance-of v0, p1, LW8/D;

    if-eqz v0, :cond_4

    goto :goto_0

    :cond_4
    new-instance v0, Ljava/io/IOException;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_5

    const-string v1, "Channel was closed"

    :cond_5
    invoke-direct {v0, v1, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object p1, v0

    :goto_1
    iput-object p1, p0, Lio/ktor/utils/io/n;->a:Ljava/lang/Throwable;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Throwable;
    .locals 3

    .prologue
    iget-object v0, p0, Lio/ktor/utils/io/n;->a:Ljava/lang/Throwable;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    instance-of v1, v0, Ljava/io/IOException;

    if-eqz v1, :cond_2

    instance-of v1, v0, LW8/D;

    if-eqz v1, :cond_1

    check-cast v0, LW8/D;

    invoke-interface {v0}, LW8/D;->a()Ljava/lang/Throwable;

    move-result-object v0

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/io/IOException;

    iget-object v1, p0, Lio/ktor/utils/io/n;->a:Ljava/lang/Throwable;

    check-cast v1, Ljava/io/IOException;

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lio/ktor/utils/io/n;->a:Ljava/lang/Throwable;

    invoke-direct {v0, v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_2
    instance-of v1, v0, LW8/D;

    if-eqz v1, :cond_3

    check-cast v0, LW8/D;

    invoke-interface {v0}, LW8/D;->a()Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lio/ktor/utils/io/n;->a:Ljava/lang/Throwable;

    :cond_3
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lio/ktor/utils/io/n;->a:Ljava/lang/Throwable;

    invoke-static {v0, v1}, LW8/o0;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;

    move-result-object v0

    :cond_4
    :goto_0
    return-object v0
.end method
