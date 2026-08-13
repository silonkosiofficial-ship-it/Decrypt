.class final Lt2/a$e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ8/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt2/a$e;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic C:Lt2/a;


# direct methods
.method constructor <init>(Lt2/a;)V
    .locals 0

    iput-object p1, p0, Lt2/a$e$a;->C:Lt2/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/Set;

    invoke-virtual {p0, p1, p2}, Lt2/a$e$a;->b(Ljava/util/Set;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/util/Set;Lm7/e;)Ljava/lang/Object;
    .locals 0

    .prologue
    iget-object p1, p0, Lt2/a$e$a;->C:Lt2/a;

    invoke-static {p1}, Lt2/a;->d(Lt2/a;)Lt2/b;

    move-result-object p1

    invoke-virtual {p1}, Lh2/L;->a()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lt2/a$e$a;->C:Lt2/a;

    invoke-static {p1}, Lt2/a;->d(Lt2/a;)Lt2/b;

    move-result-object p1

    invoke-virtual {p1}, Lh2/L;->e()V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :cond_0
    new-instance p1, Ljava/util/concurrent/CancellationException;

    const-string p2, "PagingSource is invalid"

    invoke-direct {p1, p2}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
