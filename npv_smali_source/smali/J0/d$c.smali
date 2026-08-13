.class final LJ0/d$c;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ0/d;->onScrollCaptureImageRequest(Landroid/view/ScrollCaptureSession;Landroid/os/CancellationSignal;Landroid/graphics/Rect;Ljava/util/function/Consumer;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field final synthetic H:LJ0/d;

.field final synthetic I:Landroid/view/ScrollCaptureSession;

.field final synthetic J:Landroid/graphics/Rect;

.field final synthetic K:Ljava/util/function/Consumer;


# direct methods
.method constructor <init>(LJ0/d;Landroid/view/ScrollCaptureSession;Landroid/graphics/Rect;Ljava/util/function/Consumer;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LJ0/d$c;->H:LJ0/d;

    iput-object p2, p0, LJ0/d$c;->I:Landroid/view/ScrollCaptureSession;

    iput-object p3, p0, LJ0/d$c;->J:Landroid/graphics/Rect;

    iput-object p4, p0, LJ0/d$c;->K:Ljava/util/function/Consumer;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LJ0/d$c;->G:I

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

    iget-object p1, p0, LJ0/d$c;->H:LJ0/d;

    iget-object v1, p0, LJ0/d$c;->I:Landroid/view/ScrollCaptureSession;

    iget-object v3, p0, LJ0/d$c;->J:Landroid/graphics/Rect;

    invoke-static {v3}, Lo0/X1;->d(Landroid/graphics/Rect;)LY0/r;

    move-result-object v3

    iput v2, p0, LJ0/d$c;->G:I

    invoke-static {p1, v1, v3, p0}, LJ0/d;->d(LJ0/d;Landroid/view/ScrollCaptureSession;LY0/r;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, LY0/r;

    iget-object v0, p0, LJ0/d$c;->K:Ljava/util/function/Consumer;

    invoke-static {p1}, Lo0/X1;->a(LY0/r;)Landroid/graphics/Rect;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final H(LW8/N;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LJ0/d$c;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LJ0/d$c;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LJ0/d$c;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, LJ0/d$c;->H(LW8/N;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 6

    new-instance p1, LJ0/d$c;

    iget-object v1, p0, LJ0/d$c;->H:LJ0/d;

    iget-object v2, p0, LJ0/d$c;->I:Landroid/view/ScrollCaptureSession;

    iget-object v3, p0, LJ0/d$c;->J:Landroid/graphics/Rect;

    iget-object v4, p0, LJ0/d$c;->K:Ljava/util/function/Consumer;

    move-object v0, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, LJ0/d$c;-><init>(LJ0/d;Landroid/view/ScrollCaptureSession;Landroid/graphics/Rect;Ljava/util/function/Consumer;Lm7/e;)V

    return-object p1
.end method
