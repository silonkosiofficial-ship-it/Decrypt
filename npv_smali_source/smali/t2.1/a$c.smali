.class final Lt2/a$c;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt2/a;->i(Lh2/L$a;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field synthetic H:Ljava/lang/Object;

.field final synthetic I:Lt2/a;

.field final synthetic J:Lh2/L$a;


# direct methods
.method constructor <init>(Lt2/a;Lh2/L$a;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Lt2/a$c;->I:Lt2/a;

    iput-object p2, p0, Lt2/a$c;->J:Lh2/L$a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lt2/a$c;->G:I

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

    iget-object p1, p0, Lt2/a$c;->H:Ljava/lang/Object;

    check-cast p1, Lo2/B;

    sget-object v1, Lo2/B$a;->C:Lo2/B$a;

    new-instance v3, Lt2/a$c$a;

    iget-object v4, p0, Lt2/a$c;->I:Lt2/a;

    iget-object v5, p0, Lt2/a$c;->J:Lh2/L$a;

    const/4 v6, 0x0

    invoke-direct {v3, v4, v5, v6}, Lt2/a$c$a;-><init>(Lt2/a;Lh2/L$a;Lm7/e;)V

    iput v2, p0, Lt2/a$c;->G:I

    invoke-interface {p1, v1, v3, p0}, Lo2/B;->c(Lo2/B$a;Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    return-object p1
.end method

.method public final H(Lo2/B;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lt2/a$c;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Lt2/a$c;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Lt2/a$c;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lo2/B;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Lt2/a$c;->H(Lo2/B;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 3

    new-instance v0, Lt2/a$c;

    iget-object v1, p0, Lt2/a$c;->I:Lt2/a;

    iget-object v2, p0, Lt2/a$c;->J:Lh2/L$a;

    invoke-direct {v0, v1, v2, p2}, Lt2/a$c;-><init>(Lt2/a;Lh2/L$a;Lm7/e;)V

    iput-object p1, v0, Lt2/a$c;->H:Ljava/lang/Object;

    return-object v0
.end method
