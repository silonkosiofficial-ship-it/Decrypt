.class public final Lio/ktor/utils/io/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/ktor/utils/io/d;


# instance fields
.field private final b:Lo9/q;

.field private volatile closed:Lio/ktor/utils/io/n;


# direct methods
.method public constructor <init>(Lo9/q;)V
    .locals 1

    const-string v0, "source"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/ktor/utils/io/r;->b:Lo9/q;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Throwable;
    .locals 1

    .prologue
    iget-object v0, p0, Lio/ktor/utils/io/r;->closed:Lio/ktor/utils/io/n;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/ktor/utils/io/n;->a()Ljava/lang/Throwable;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public d()Lo9/q;
    .locals 1

    .prologue
    invoke-virtual {p0}, Lio/ktor/utils/io/r;->a()Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lio/ktor/utils/io/r;->b:Lo9/q;

    return-object v0

    :cond_0
    throw v0
.end method

.method public f(ILm7/e;)Ljava/lang/Object;
    .locals 2

    .prologue
    invoke-virtual {p0}, Lio/ktor/utils/io/r;->a()Ljava/lang/Throwable;

    move-result-object p2

    if-nez p2, :cond_1

    iget-object p2, p0, Lio/ktor/utils/io/r;->b:Lo9/q;

    invoke-static {p2}, Ld7/d;->d(Lo9/q;)J

    move-result-wide v0

    int-to-long p1, p1

    cmp-long p1, v0, p1

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Lo7/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_1
    throw p2
.end method

.method public h()Z
    .locals 1

    iget-object v0, p0, Lio/ktor/utils/io/r;->b:Lo9/q;

    invoke-interface {v0}, Lo9/q;->j()Z

    move-result v0

    return v0
.end method

.method public k(Ljava/lang/Throwable;)V
    .locals 3

    .prologue
    iget-object v0, p0, Lio/ktor/utils/io/r;->closed:Lio/ktor/utils/io/n;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lio/ktor/utils/io/r;->b:Lo9/q;

    invoke-interface {v0}, Lo9/h;->close()V

    new-instance v0, Lio/ktor/utils/io/n;

    new-instance v1, Ljava/io/IOException;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_2

    :cond_1
    const-string v2, "Channel was cancelled"

    :cond_2
    invoke-direct {v1, v2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {v0, v1}, Lio/ktor/utils/io/n;-><init>(Ljava/lang/Throwable;)V

    iput-object v0, p0, Lio/ktor/utils/io/r;->closed:Lio/ktor/utils/io/n;

    return-void
.end method
