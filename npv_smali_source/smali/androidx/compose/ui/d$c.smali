.class public abstract Landroidx/compose/ui/d$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF0/j;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/ui/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "c"
.end annotation


# instance fields
.field private C:Landroidx/compose/ui/d$c;

.field private D:LW8/N;

.field private E:I

.field private F:I

.field private G:Landroidx/compose/ui/d$c;

.field private H:Landroidx/compose/ui/d$c;

.field private I:LF0/k0;

.field private J:LF0/d0;

.field private K:Z

.field private L:Z

.field private M:Z

.field private N:Z

.field private O:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Landroidx/compose/ui/d$c;->C:Landroidx/compose/ui/d$c;

    const/4 v0, -0x1

    iput v0, p0, Landroidx/compose/ui/d$c;->F:I

    return-void
.end method


# virtual methods
.method public final A1()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/ui/d$c;->O:Z

    return v0
.end method

.method public B1()V
    .locals 2

    .prologue
    iget-boolean v0, p0, Landroidx/compose/ui/d$c;->O:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    if-nez v0, :cond_0

    const-string v0, "node attached multiple times"

    invoke-static {v0}, LC0/a;->b(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/d$c;->J:LF0/d0;

    if-eqz v0, :cond_1

    move v0, v1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    const-string v0, "attach invoked on a node without a coordinator"

    invoke-static {v0}, LC0/a;->b(Ljava/lang/String;)V

    :cond_2
    iput-boolean v1, p0, Landroidx/compose/ui/d$c;->O:Z

    iput-boolean v1, p0, Landroidx/compose/ui/d$c;->M:Z

    return-void
.end method

.method public C1()V
    .locals 2

    .prologue
    iget-boolean v0, p0, Landroidx/compose/ui/d$c;->O:Z

    if-nez v0, :cond_0

    const-string v0, "Cannot detach a node that is not attached"

    invoke-static {v0}, LC0/a;->b(Ljava/lang/String;)V

    :cond_0
    iget-boolean v0, p0, Landroidx/compose/ui/d$c;->M:Z

    xor-int/lit8 v0, v0, 0x1

    if-nez v0, :cond_1

    const-string v0, "Must run runAttachLifecycle() before markAsDetached()"

    invoke-static {v0}, LC0/a;->b(Ljava/lang/String;)V

    :cond_1
    iget-boolean v0, p0, Landroidx/compose/ui/d$c;->N:Z

    xor-int/lit8 v0, v0, 0x1

    if-nez v0, :cond_2

    const-string v0, "Must run runDetachLifecycle() before markAsDetached()"

    invoke-static {v0}, LC0/a;->b(Ljava/lang/String;)V

    :cond_2
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/compose/ui/d$c;->O:Z

    iget-object v0, p0, Landroidx/compose/ui/d$c;->D:LW8/N;

    if-eqz v0, :cond_3

    new-instance v1, Lh0/h;

    invoke-direct {v1}, Lh0/h;-><init>()V

    invoke-static {v0, v1}, LW8/O;->d(LW8/N;Ljava/util/concurrent/CancellationException;)V

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/compose/ui/d$c;->D:LW8/N;

    :cond_3
    return-void
.end method

.method public D1()V
    .locals 0

    return-void
.end method

.method public final E0()Landroidx/compose/ui/d$c;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/d$c;->C:Landroidx/compose/ui/d$c;

    return-object v0
.end method

.method public E1()V
    .locals 0

    return-void
.end method

.method public F1()V
    .locals 0

    return-void
.end method

.method public G1()V
    .locals 1

    .prologue
    iget-boolean v0, p0, Landroidx/compose/ui/d$c;->O:Z

    if-nez v0, :cond_0

    const-string v0, "reset() called on an unattached node"

    invoke-static {v0}, LC0/a;->b(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->F1()V

    return-void
.end method

.method public H1()V
    .locals 1

    .prologue
    iget-boolean v0, p0, Landroidx/compose/ui/d$c;->O:Z

    if-nez v0, :cond_0

    const-string v0, "Must run markAsAttached() prior to runAttachLifecycle"

    invoke-static {v0}, LC0/a;->b(Ljava/lang/String;)V

    :cond_0
    iget-boolean v0, p0, Landroidx/compose/ui/d$c;->M:Z

    if-nez v0, :cond_1

    const-string v0, "Must run runAttachLifecycle() only once after markAsAttached()"

    invoke-static {v0}, LC0/a;->b(Ljava/lang/String;)V

    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/compose/ui/d$c;->M:Z

    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->D1()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/compose/ui/d$c;->N:Z

    return-void
.end method

.method public I1()V
    .locals 2

    .prologue
    iget-boolean v0, p0, Landroidx/compose/ui/d$c;->O:Z

    if-nez v0, :cond_0

    const-string v0, "node detached multiple times"

    invoke-static {v0}, LC0/a;->b(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/d$c;->J:LF0/d0;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    move v0, v1

    :goto_0
    if-nez v0, :cond_2

    const-string v0, "detach invoked on a node without a coordinator"

    invoke-static {v0}, LC0/a;->b(Ljava/lang/String;)V

    :cond_2
    iget-boolean v0, p0, Landroidx/compose/ui/d$c;->N:Z

    if-nez v0, :cond_3

    const-string v0, "Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()"

    invoke-static {v0}, LC0/a;->b(Ljava/lang/String;)V

    :cond_3
    iput-boolean v1, p0, Landroidx/compose/ui/d$c;->N:Z

    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->E1()V

    return-void
.end method

.method public final J1(I)V
    .locals 0

    iput p1, p0, Landroidx/compose/ui/d$c;->F:I

    return-void
.end method

.method public K1(Landroidx/compose/ui/d$c;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/d$c;->C:Landroidx/compose/ui/d$c;

    return-void
.end method

.method public final L1(Landroidx/compose/ui/d$c;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/d$c;->H:Landroidx/compose/ui/d$c;

    return-void
.end method

.method public final M1(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/ui/d$c;->K:Z

    return-void
.end method

.method public final N1(I)V
    .locals 0

    iput p1, p0, Landroidx/compose/ui/d$c;->E:I

    return-void
.end method

.method public final O1(LF0/k0;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/d$c;->I:LF0/k0;

    return-void
.end method

.method public final P1(Landroidx/compose/ui/d$c;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/d$c;->G:Landroidx/compose/ui/d$c;

    return-void
.end method

.method public final Q1(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/ui/d$c;->L:Z

    return-void
.end method

.method public final R1(Lx7/a;)V
    .locals 1

    invoke-static {p0}, LF0/k;->n(LF0/j;)LF0/o0;

    move-result-object v0

    invoke-interface {v0, p1}, LF0/o0;->x(Lx7/a;)V

    return-void
.end method

.method public S1(LF0/d0;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/d$c;->J:LF0/d0;

    return-void
.end method

.method public final q1()I
    .locals 1

    iget v0, p0, Landroidx/compose/ui/d$c;->F:I

    return v0
.end method

.method public final r1()Landroidx/compose/ui/d$c;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/d$c;->H:Landroidx/compose/ui/d$c;

    return-object v0
.end method

.method public final s1()LF0/d0;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/d$c;->J:LF0/d0;

    return-object v0
.end method

.method public final t1()LW8/N;
    .locals 3

    .prologue
    iget-object v0, p0, Landroidx/compose/ui/d$c;->D:LW8/N;

    if-nez v0, :cond_0

    invoke-static {p0}, LF0/k;->n(LF0/j;)LF0/o0;

    move-result-object v0

    invoke-interface {v0}, LF0/o0;->getCoroutineContext()Lm7/i;

    move-result-object v0

    invoke-static {p0}, LF0/k;->n(LF0/j;)LF0/o0;

    move-result-object v1

    invoke-interface {v1}, LF0/o0;->getCoroutineContext()Lm7/i;

    move-result-object v1

    sget-object v2, LW8/z0;->h:LW8/z0$b;

    invoke-interface {v1, v2}, Lm7/i;->i(Lm7/i$c;)Lm7/i$b;

    move-result-object v1

    check-cast v1, LW8/z0;

    invoke-static {v1}, LW8/C0;->a(LW8/z0;)LW8/y;

    move-result-object v1

    invoke-interface {v0, v1}, Lm7/i;->o0(Lm7/i;)Lm7/i;

    move-result-object v0

    invoke-static {v0}, LW8/O;->a(Lm7/i;)LW8/N;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/ui/d$c;->D:LW8/N;

    :cond_0
    return-object v0
.end method

.method public final u1()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/ui/d$c;->K:Z

    return v0
.end method

.method public final v1()I
    .locals 1

    iget v0, p0, Landroidx/compose/ui/d$c;->E:I

    return v0
.end method

.method public final w1()LF0/k0;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/d$c;->I:LF0/k0;

    return-object v0
.end method

.method public final x1()Landroidx/compose/ui/d$c;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/d$c;->G:Landroidx/compose/ui/d$c;

    return-object v0
.end method

.method public y1()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final z1()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/ui/d$c;->L:Z

    return v0
.end method
