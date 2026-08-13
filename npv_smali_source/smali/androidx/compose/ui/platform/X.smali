.class public final Landroidx/compose/ui/platform/X;
.super LW8/J;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/platform/X$c;
    }
.end annotation


# static fields
.field public static final O:Landroidx/compose/ui/platform/X$c;

.field public static final P:I

.field private static final Q:Li7/n;

.field private static final R:Ljava/lang/ThreadLocal;


# instance fields
.field private final E:Landroid/view/Choreographer;

.field private final F:Landroid/os/Handler;

.field private final G:Ljava/lang/Object;

.field private final H:Lj7/m;

.field private I:Ljava/util/List;

.field private J:Ljava/util/List;

.field private K:Z

.field private L:Z

.field private final M:Landroidx/compose/ui/platform/X$d;

.field private final N:LV/j0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/compose/ui/platform/X$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/compose/ui/platform/X$c;-><init>(Ly7/k;)V

    sput-object v0, Landroidx/compose/ui/platform/X;->O:Landroidx/compose/ui/platform/X$c;

    const/16 v0, 0x8

    sput v0, Landroidx/compose/ui/platform/X;->P:I

    sget-object v0, Landroidx/compose/ui/platform/X$a;->D:Landroidx/compose/ui/platform/X$a;

    invoke-static {v0}, Li7/o;->b(Lx7/a;)Li7/n;

    move-result-object v0

    sput-object v0, Landroidx/compose/ui/platform/X;->Q:Li7/n;

    new-instance v0, Landroidx/compose/ui/platform/X$b;

    invoke-direct {v0}, Landroidx/compose/ui/platform/X$b;-><init>()V

    sput-object v0, Landroidx/compose/ui/platform/X;->R:Ljava/lang/ThreadLocal;

    return-void
.end method

.method private constructor <init>(Landroid/view/Choreographer;Landroid/os/Handler;)V
    .locals 0

    invoke-direct {p0}, LW8/J;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/platform/X;->E:Landroid/view/Choreographer;

    iput-object p2, p0, Landroidx/compose/ui/platform/X;->F:Landroid/os/Handler;

    new-instance p2, Ljava/lang/Object;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Landroidx/compose/ui/platform/X;->G:Ljava/lang/Object;

    new-instance p2, Lj7/m;

    invoke-direct {p2}, Lj7/m;-><init>()V

    iput-object p2, p0, Landroidx/compose/ui/platform/X;->H:Lj7/m;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Landroidx/compose/ui/platform/X;->I:Ljava/util/List;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Landroidx/compose/ui/platform/X;->J:Ljava/util/List;

    new-instance p2, Landroidx/compose/ui/platform/X$d;

    invoke-direct {p2, p0}, Landroidx/compose/ui/platform/X$d;-><init>(Landroidx/compose/ui/platform/X;)V

    iput-object p2, p0, Landroidx/compose/ui/platform/X;->M:Landroidx/compose/ui/platform/X$d;

    new-instance p2, Landroidx/compose/ui/platform/Z;

    invoke-direct {p2, p1, p0}, Landroidx/compose/ui/platform/Z;-><init>(Landroid/view/Choreographer;Landroidx/compose/ui/platform/X;)V

    iput-object p2, p0, Landroidx/compose/ui/platform/X;->N:LV/j0;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/view/Choreographer;Landroid/os/Handler;Ly7/k;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/compose/ui/platform/X;-><init>(Landroid/view/Choreographer;Landroid/os/Handler;)V

    return-void
.end method

.method public static final synthetic A1(Landroidx/compose/ui/platform/X;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Landroidx/compose/ui/platform/X;->F:Landroid/os/Handler;

    return-object p0
.end method

.method public static final synthetic B1(Landroidx/compose/ui/platform/X;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Landroidx/compose/ui/platform/X;->G:Ljava/lang/Object;

    return-object p0
.end method

.method public static final synthetic C1()Li7/n;
    .locals 1

    sget-object v0, Landroidx/compose/ui/platform/X;->Q:Li7/n;

    return-object v0
.end method

.method public static final synthetic D1(Landroidx/compose/ui/platform/X;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Landroidx/compose/ui/platform/X;->I:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic E1(Landroidx/compose/ui/platform/X;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/compose/ui/platform/X;->K1(J)V

    return-void
.end method

.method public static final synthetic F1(Landroidx/compose/ui/platform/X;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/platform/X;->L1()V

    return-void
.end method

.method public static final synthetic G1(Landroidx/compose/ui/platform/X;Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/ui/platform/X;->L:Z

    return-void
.end method

.method private final J1()Ljava/lang/Runnable;
    .locals 2

    .prologue
    iget-object v0, p0, Landroidx/compose/ui/platform/X;->G:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/compose/ui/platform/X;->H:Lj7/m;

    invoke-virtual {v1}, Lj7/m;->S()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Runnable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method private final K1(J)V
    .locals 4

    .prologue
    iget-object v0, p0, Landroidx/compose/ui/platform/X;->G:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Landroidx/compose/ui/platform/X;->L:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x0

    :try_start_1
    iput-boolean v1, p0, Landroidx/compose/ui/platform/X;->L:Z

    iget-object v2, p0, Landroidx/compose/ui/platform/X;->I:Ljava/util/List;

    iget-object v3, p0, Landroidx/compose/ui/platform/X;->J:Ljava/util/List;

    iput-object v3, p0, Landroidx/compose/ui/platform/X;->I:Ljava/util/List;

    iput-object v2, p0, Landroidx/compose/ui/platform/X;->J:Ljava/util/List;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    :goto_0
    if-ge v1, v0, :cond_1

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/Choreographer$FrameCallback;

    invoke-interface {v3, p1, p2}, Landroid/view/Choreographer$FrameCallback;->doFrame(J)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    invoke-interface {v2}, Ljava/util/List;->clear()V

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method private final L1()V
    .locals 2

    .prologue
    :cond_0
    :goto_0
    invoke-direct {p0}, Landroidx/compose/ui/platform/X;->J1()Ljava/lang/Runnable;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Landroidx/compose/ui/platform/X;->G:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/compose/ui/platform/X;->H:Lj7/m;

    invoke-virtual {v1}, Lj7/m;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x0

    iput-boolean v1, p0, Landroidx/compose/ui/platform/X;->K:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v1

    goto :goto_2

    :cond_2
    const/4 v1, 0x1

    :goto_1
    monitor-exit v0

    if-nez v1, :cond_0

    return-void

    :goto_2
    monitor-exit v0

    throw v1
.end method

.method public static final synthetic z1()Ljava/lang/ThreadLocal;
    .locals 1

    sget-object v0, Landroidx/compose/ui/platform/X;->R:Ljava/lang/ThreadLocal;

    return-object v0
.end method


# virtual methods
.method public final H1()Landroid/view/Choreographer;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/X;->E:Landroid/view/Choreographer;

    return-object v0
.end method

.method public final I1()LV/j0;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/X;->N:LV/j0;

    return-object v0
.end method

.method public final M1(Landroid/view/Choreographer$FrameCallback;)V
    .locals 2

    .prologue
    iget-object v0, p0, Landroidx/compose/ui/platform/X;->G:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/compose/ui/platform/X;->I:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-boolean p1, p0, Landroidx/compose/ui/platform/X;->L:Z

    if-nez p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/compose/ui/platform/X;->L:Z

    iget-object p1, p0, Landroidx/compose/ui/platform/X;->E:Landroid/view/Choreographer;

    iget-object v1, p0, Landroidx/compose/ui/platform/X;->M:Landroidx/compose/ui/platform/X$d;

    invoke-virtual {p1, v1}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    sget-object p1, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0

    throw p1
.end method

.method public final N1(Landroid/view/Choreographer$FrameCallback;)V
    .locals 2

    .prologue
    iget-object v0, p0, Landroidx/compose/ui/platform/X;->G:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/compose/ui/platform/X;->I:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public t1(Lm7/i;Ljava/lang/Runnable;)V
    .locals 2

    .prologue
    iget-object p1, p0, Landroidx/compose/ui/platform/X;->G:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Landroidx/compose/ui/platform/X;->H:Lj7/m;

    invoke-virtual {v0, p2}, Lj7/m;->g(Ljava/lang/Object;)V

    iget-boolean p2, p0, Landroidx/compose/ui/platform/X;->K:Z

    if-nez p2, :cond_0

    const/4 p2, 0x1

    iput-boolean p2, p0, Landroidx/compose/ui/platform/X;->K:Z

    iget-object v0, p0, Landroidx/compose/ui/platform/X;->F:Landroid/os/Handler;

    iget-object v1, p0, Landroidx/compose/ui/platform/X;->M:Landroidx/compose/ui/platform/X$d;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    iget-boolean v0, p0, Landroidx/compose/ui/platform/X;->L:Z

    if-nez v0, :cond_0

    iput-boolean p2, p0, Landroidx/compose/ui/platform/X;->L:Z

    iget-object p2, p0, Landroidx/compose/ui/platform/X;->E:Landroid/view/Choreographer;

    iget-object v0, p0, Landroidx/compose/ui/platform/X;->M:Landroidx/compose/ui/platform/X$d;

    invoke-virtual {p2, v0}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    goto :goto_0

    :catchall_0
    move-exception p2

    goto :goto_1

    :cond_0
    :goto_0
    sget-object p2, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p1

    return-void

    :goto_1
    monitor-exit p1

    throw p2
.end method
