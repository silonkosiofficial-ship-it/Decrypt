.class final Lt2/a$e;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt2/a;->j(Lh2/L$a;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field final synthetic H:Lt2/a;


# direct methods
.method constructor <init>(Lt2/a;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Lt2/a$e;->H:Lt2/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lt2/a$e;->G:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lt2/a$e;->H:Lt2/a;

    invoke-static {p1}, Lt2/a;->b(Lt2/a;)Lo2/n;

    move-result-object p1

    invoke-virtual {p1}, Lo2/n;->r()Landroidx/room/c;

    move-result-object p1

    iget-object v1, p0, Lt2/a$e;->H:Lt2/a;

    invoke-static {v1}, Lt2/a;->f(Lt2/a;)[Ljava/lang/String;

    move-result-object v1

    array-length v3, v1

    invoke-static {v1, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {p1, v1, v3}, Landroidx/room/c;->g([Ljava/lang/String;Z)LZ8/f;

    move-result-object p1

    new-instance v1, Lt2/a$e$a;

    iget-object v3, p0, Lt2/a$e;->H:Lt2/a;

    invoke-direct {v1, v3}, Lt2/a$e$a;-><init>(Lt2/a;)V

    iput v2, p0, Lt2/a$e;->G:I

    invoke-interface {p1, v1, p0}, LZ8/f;->b(LZ8/g;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final H(LW8/N;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lt2/a$e;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Lt2/a$e;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Lt2/a$e;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Lt2/a$e;->H(LW8/N;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 1

    new-instance p1, Lt2/a$e;

    iget-object v0, p0, Lt2/a$e;->H:Lt2/a;

    invoke-direct {p1, v0, p2}, Lt2/a$e;-><init>(Lt2/a;Lm7/e;)V

    return-object p1
.end method
