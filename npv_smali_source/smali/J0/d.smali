.class public final LJ0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ScrollCaptureCallback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJ0/d$a;
    }
.end annotation


# instance fields
.field private final a:LK0/o;

.field private final b:LY0/r;

.field private final c:LJ0/d$a;

.field private final d:LW8/N;

.field private final e:LJ0/h;

.field private f:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LK0/o;LY0/r;LW8/N;LJ0/d$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJ0/d;->a:LK0/o;

    iput-object p2, p0, LJ0/d;->b:LY0/r;

    iput-object p4, p0, LJ0/d;->c:LJ0/d$a;

    sget-object p1, LJ0/g;->C:LJ0/g;

    invoke-static {p3, p1}, LW8/O;->i(LW8/N;Lm7/i;)LW8/N;

    move-result-object p1

    iput-object p1, p0, LJ0/d;->d:LW8/N;

    new-instance p1, LJ0/h;

    invoke-virtual {p2}, LY0/r;->f()I

    move-result p2

    new-instance p3, LJ0/d$f;

    const/4 p4, 0x0

    invoke-direct {p3, p0, p4}, LJ0/d$f;-><init>(LJ0/d;Lm7/e;)V

    invoke-direct {p1, p2, p3}, LJ0/h;-><init>(ILx7/p;)V

    iput-object p1, p0, LJ0/d;->e:LJ0/h;

    return-void
.end method

.method public static final synthetic a(LJ0/d;)LJ0/d$a;
    .locals 0

    iget-object p0, p0, LJ0/d;->c:LJ0/d$a;

    return-object p0
.end method

.method public static final synthetic b(LJ0/d;)LK0/o;
    .locals 0

    iget-object p0, p0, LJ0/d;->a:LK0/o;

    return-object p0
.end method

.method public static final synthetic c(LJ0/d;)LJ0/h;
    .locals 0

    iget-object p0, p0, LJ0/d;->e:LJ0/h;

    return-object p0
.end method

.method public static final synthetic d(LJ0/d;Landroid/view/ScrollCaptureSession;LY0/r;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LJ0/d;->e(Landroid/view/ScrollCaptureSession;LY0/r;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final e(Landroid/view/ScrollCaptureSession;LY0/r;Lm7/e;)Ljava/lang/Object;
    .locals 8

    .prologue
    instance-of v0, p3, LJ0/d$d;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, LJ0/d$d;

    iget v1, v0, LJ0/d$d;->M:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LJ0/d$d;->M:I

    goto :goto_0

    :cond_0
    new-instance v0, LJ0/d$d;

    invoke-direct {v0, p0, p3}, LJ0/d$d;-><init>(LJ0/d;Lm7/e;)V

    :goto_0
    iget-object p3, v0, LJ0/d$d;->K:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LJ0/d$d;->M:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget p1, v0, LJ0/d$d;->J:I

    iget p2, v0, LJ0/d$d;->I:I

    iget-object v1, v0, LJ0/d$d;->H:Ljava/lang/Object;

    check-cast v1, LY0/r;

    iget-object v2, v0, LJ0/d$d;->G:Ljava/lang/Object;

    invoke-static {v2}, LJ0/a;->a(Ljava/lang/Object;)Landroid/view/ScrollCaptureSession;

    move-result-object v2

    iget-object v0, v0, LJ0/d$d;->F:Ljava/lang/Object;

    check-cast v0, LJ0/d;

    invoke-static {p3}, Li7/x;->b(Ljava/lang/Object;)V

    move-object p3, v2

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget p1, v0, LJ0/d$d;->J:I

    iget p2, v0, LJ0/d$d;->I:I

    iget-object v2, v0, LJ0/d$d;->H:Ljava/lang/Object;

    check-cast v2, LY0/r;

    iget-object v4, v0, LJ0/d$d;->G:Ljava/lang/Object;

    invoke-static {v4}, LJ0/a;->a(Ljava/lang/Object;)Landroid/view/ScrollCaptureSession;

    move-result-object v4

    iget-object v5, v0, LJ0/d$d;->F:Ljava/lang/Object;

    check-cast v5, LJ0/d;

    invoke-static {p3}, Li7/x;->b(Ljava/lang/Object;)V

    move p3, p2

    move-object p2, v2

    move v2, p1

    move-object p1, v4

    goto :goto_1

    :cond_3
    invoke-static {p3}, Li7/x;->b(Ljava/lang/Object;)V

    invoke-virtual {p2}, LY0/r;->i()I

    move-result p3

    invoke-virtual {p2}, LY0/r;->d()I

    move-result v2

    iget-object v5, p0, LJ0/d;->e:LJ0/h;

    iput-object p0, v0, LJ0/d$d;->F:Ljava/lang/Object;

    iput-object p1, v0, LJ0/d$d;->G:Ljava/lang/Object;

    iput-object p2, v0, LJ0/d$d;->H:Ljava/lang/Object;

    iput p3, v0, LJ0/d$d;->I:I

    iput v2, v0, LJ0/d$d;->J:I

    iput v4, v0, LJ0/d$d;->M:I

    invoke-virtual {v5, p3, v2, v0}, LJ0/h;->f(IILm7/e;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_4

    return-object v1

    :cond_4
    move-object v5, p0

    :goto_1
    sget-object v4, LJ0/d$e;->D:LJ0/d$e;

    iput-object v5, v0, LJ0/d$d;->F:Ljava/lang/Object;

    iput-object p1, v0, LJ0/d$d;->G:Ljava/lang/Object;

    iput-object p2, v0, LJ0/d$d;->H:Ljava/lang/Object;

    iput p3, v0, LJ0/d$d;->I:I

    iput v2, v0, LJ0/d$d;->J:I

    iput v3, v0, LJ0/d$d;->M:I

    invoke-static {v4, v0}, LV/l0;->c(Lx7/l;Lm7/e;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_5

    return-object v1

    :cond_5
    move-object v1, p2

    move p2, p3

    move-object v0, v5

    move-object p3, p1

    move p1, v2

    :goto_2
    iget-object v2, v0, LJ0/d;->e:LJ0/h;

    invoke-virtual {v2, p2}, LJ0/h;->c(I)I

    move-result p2

    iget-object v2, v0, LJ0/d;->e:LJ0/h;

    invoke-virtual {v2, p1}, LJ0/h;->c(I)I

    move-result p1

    const/4 v6, 0x5

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    move v3, p2

    move v5, p1

    invoke-static/range {v1 .. v7}, LY0/r;->c(LY0/r;IIIIILjava/lang/Object;)LY0/r;

    move-result-object v1

    if-ne p2, p1, :cond_6

    sget-object p1, LY0/r;->e:LY0/r$a;

    invoke-virtual {p1}, LY0/r$a;->a()LY0/r;

    move-result-object p1

    return-object p1

    :cond_6
    iget-object p1, v0, LJ0/d;->a:LK0/o;

    invoke-virtual {p1}, LK0/o;->e()LF0/d0;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-static {p3}, LJ0/b;->a(Landroid/view/ScrollCaptureSession;)Landroid/view/Surface;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/Surface;->lockHardwareCanvas()Landroid/graphics/Canvas;

    move-result-object p2

    :try_start_0
    invoke-static {}, Lo0/a;->a()Landroid/graphics/BlendMode;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {p2, v3, v2}, LJ0/c;->a(Landroid/graphics/Canvas;ILandroid/graphics/BlendMode;)V

    invoke-static {p2}, Lo0/H;->b(Landroid/graphics/Canvas;)Lo0/q0;

    move-result-object v2

    invoke-virtual {v1}, LY0/r;->g()I

    move-result v4

    int-to-float v4, v4

    neg-float v4, v4

    invoke-virtual {v1}, LY0/r;->i()I

    move-result v5

    int-to-float v5, v5

    neg-float v5, v5

    invoke-interface {v2, v4, v5}, Lo0/q0;->d(FF)V

    const/4 v4, 0x0

    invoke-virtual {p1, v2, v4}, LF0/d0;->W1(Lo0/q0;Lr0/c;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {p3}, LJ0/b;->a(Landroid/view/ScrollCaptureSession;)Landroid/view/Surface;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/view/Surface;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V

    iget-object p1, v0, LJ0/d;->e:LJ0/h;

    invoke-virtual {p1}, LJ0/h;->b()F

    move-result p1

    invoke-static {p1}, LA7/a;->d(F)I

    move-result p1

    invoke-virtual {v1, v3, p1}, LY0/r;->m(II)LY0/r;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    invoke-static {p3}, LJ0/b;->a(Landroid/view/ScrollCaptureSession;)Landroid/view/Surface;

    move-result-object p3

    invoke-virtual {p3, p2}, Landroid/view/Surface;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V

    throw p1

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Could not find coordinator for semantics node."

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public onScrollCaptureEnd(Ljava/lang/Runnable;)V
    .locals 6

    iget-object v0, p0, LJ0/d;->d:LW8/N;

    sget-object v1, LW8/L0;->D:LW8/L0;

    new-instance v3, LJ0/d$b;

    const/4 v2, 0x0

    invoke-direct {v3, p0, p1, v2}, LJ0/d$b;-><init>(LJ0/d;Ljava/lang/Runnable;Lm7/e;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    return-void
.end method

.method public onScrollCaptureImageRequest(Landroid/view/ScrollCaptureSession;Landroid/os/CancellationSignal;Landroid/graphics/Rect;Ljava/util/function/Consumer;)V
    .locals 8

    iget-object v0, p0, LJ0/d;->d:LW8/N;

    new-instance v7, LJ0/d$c;

    const/4 v6, 0x0

    move-object v1, v7

    move-object v2, p0

    move-object v3, p1

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v1 .. v6}, LJ0/d$c;-><init>(LJ0/d;Landroid/view/ScrollCaptureSession;Landroid/graphics/Rect;Ljava/util/function/Consumer;Lm7/e;)V

    invoke-static {v0, p2, v7}, LJ0/f;->b(LW8/N;Landroid/os/CancellationSignal;Lx7/p;)LW8/z0;

    return-void
.end method

.method public onScrollCaptureSearch(Landroid/os/CancellationSignal;Ljava/util/function/Consumer;)V
    .locals 0

    iget-object p1, p0, LJ0/d;->b:LY0/r;

    invoke-static {p1}, Lo0/X1;->a(LY0/r;)Landroid/graphics/Rect;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public onScrollCaptureStart(Landroid/view/ScrollCaptureSession;Landroid/os/CancellationSignal;Ljava/lang/Runnable;)V
    .locals 0

    iget-object p1, p0, LJ0/d;->e:LJ0/h;

    invoke-virtual {p1}, LJ0/h;->d()V

    const/4 p1, 0x0

    iput p1, p0, LJ0/d;->f:I

    iget-object p1, p0, LJ0/d;->c:LJ0/d$a;

    invoke-interface {p1}, LJ0/d$a;->a()V

    invoke-interface {p3}, Ljava/lang/Runnable;->run()V

    return-void
.end method
