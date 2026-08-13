.class public final LD/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD/P;
.implements LV/Z0;
.implements Ljava/lang/Runnable;
.implements Landroid/view/Choreographer$FrameCallback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LD/a$a;,
        LD/a$b;
    }
.end annotation


# static fields
.field public static final I:LD/a$a;

.field public static final J:I

.field private static K:J


# instance fields
.field private final C:Landroid/view/View;

.field private final D:LX/b;

.field private E:Z

.field private final F:Landroid/view/Choreographer;

.field private G:Z

.field private H:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LD/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LD/a$a;-><init>(Ly7/k;)V

    sput-object v0, LD/a;->I:LD/a$a;

    const/16 v0, 0x8

    sput v0, LD/a;->J:I

    return-void
.end method

.method public constructor <init>(Landroid/view/View;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LD/a;->C:Landroid/view/View;

    new-instance v0, LX/b;

    const/16 v1, 0x10

    new-array v1, v1, [LD/N;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LX/b;-><init>([Ljava/lang/Object;I)V

    iput-object v0, p0, LD/a;->D:LX/b;

    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    move-result-object v0

    iput-object v0, p0, LD/a;->F:Landroid/view/Choreographer;

    sget-object v0, LD/a;->I:LD/a$a;

    invoke-static {v0, p1}, LD/a$a;->a(LD/a$a;Landroid/view/View;)V

    return-void
.end method

.method public static final synthetic e()J
    .locals 2

    sget-wide v0, LD/a;->K:J

    return-wide v0
.end method

.method public static final synthetic f(J)V
    .locals 0

    sput-wide p0, LD/a;->K:J

    return-void
.end method


# virtual methods
.method public a(LD/N;)V
    .locals 1

    .prologue
    iget-object v0, p0, LD/a;->D:LX/b;

    invoke-virtual {v0, p1}, LX/b;->d(Ljava/lang/Object;)Z

    iget-boolean p1, p0, LD/a;->E:Z

    if-nez p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, LD/a;->E:Z

    iget-object p1, p0, LD/a;->C:Landroid/view/View;

    invoke-virtual {p1, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public b()V
    .locals 0

    return-void
.end method

.method public c()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, LD/a;->G:Z

    iget-object v0, p0, LD/a;->C:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v0, p0, LD/a;->F:Landroid/view/Choreographer;

    invoke-virtual {v0, p0}, Landroid/view/Choreographer;->removeFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    return-void
.end method

.method public d()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, LD/a;->G:Z

    return-void
.end method

.method public doFrame(J)V
    .locals 1

    .prologue
    iget-boolean v0, p0, LD/a;->G:Z

    if-eqz v0, :cond_0

    iput-wide p1, p0, LD/a;->H:J

    iget-object p1, p0, LD/a;->C:Landroid/view/View;

    invoke-virtual {p1, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public run()V
    .locals 7

    .prologue
    iget-object v0, p0, LD/a;->D:LX/b;

    invoke-virtual {v0}, LX/b;->w()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_5

    iget-boolean v0, p0, LD/a;->E:Z

    if-eqz v0, :cond_5

    iget-boolean v0, p0, LD/a;->G:Z

    if-eqz v0, :cond_5

    iget-object v0, p0, LD/a;->C:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getWindowVisibility()I

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    iget-wide v2, p0, LD/a;->H:J

    sget-wide v4, LD/a;->K:J

    add-long/2addr v2, v4

    new-instance v0, LD/a$b;

    invoke-direct {v0, v2, v3}, LD/a$b;-><init>(J)V

    move v2, v1

    :goto_0
    iget-object v3, p0, LD/a;->D:LX/b;

    invoke-virtual {v3}, LX/b;->x()Z

    move-result v3

    if-eqz v3, :cond_3

    if-nez v2, :cond_3

    invoke-virtual {v0}, LD/a$b;->a()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmp-long v3, v3, v5

    const/4 v4, 0x1

    if-lez v3, :cond_1

    iget-object v3, p0, LD/a;->D:LX/b;

    invoke-virtual {v3}, LX/b;->s()[Ljava/lang/Object;

    move-result-object v3

    aget-object v3, v3, v1

    check-cast v3, LD/N;

    invoke-interface {v3, v0}, LD/N;->b(LD/O;)Z

    move-result v3

    if-eqz v3, :cond_2

    :cond_1
    move v2, v4

    goto :goto_0

    :cond_2
    iget-object v3, p0, LD/a;->D:LX/b;

    invoke-virtual {v3, v1}, LX/b;->D(I)Ljava/lang/Object;

    goto :goto_0

    :cond_3
    if-eqz v2, :cond_4

    iget-object v0, p0, LD/a;->F:Landroid/view/Choreographer;

    invoke-virtual {v0, p0}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    goto :goto_1

    :cond_4
    iput-boolean v1, p0, LD/a;->E:Z

    :goto_1
    return-void

    :cond_5
    :goto_2
    iput-boolean v1, p0, LD/a;->E:Z

    return-void
.end method
