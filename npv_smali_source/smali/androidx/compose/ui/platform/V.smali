.class public final Landroidx/compose/ui/platform/V;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/platform/T0;
.implements LW8/N;


# instance fields
.field private final C:Landroid/view/View;

.field private final D:LS0/X;

.field private final E:LW8/N;

.field private final F:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/view/View;LS0/X;LW8/N;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/platform/V;->C:Landroid/view/View;

    iput-object p2, p0, Landroidx/compose/ui/platform/V;->D:LS0/X;

    iput-object p3, p0, Landroidx/compose/ui/platform/V;->E:LW8/N;

    invoke-static {}, Lh0/o;->a()Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/ui/platform/V;->F:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method public static final synthetic c(Landroidx/compose/ui/platform/V;)LW8/N;
    .locals 0

    iget-object p0, p0, Landroidx/compose/ui/platform/V;->E:LW8/N;

    return-object p0
.end method

.method public static final synthetic d(Landroidx/compose/ui/platform/V;)LS0/X;
    .locals 0

    iget-object p0, p0, Landroidx/compose/ui/platform/V;->D:LS0/X;

    return-object p0
.end method


# virtual methods
.method public a()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/V;->C:Landroid/view/View;

    return-object v0
.end method

.method public b(Landroidx/compose/ui/platform/Q0;Lm7/e;)Ljava/lang/Object;
    .locals 5

    .prologue
    instance-of v0, p2, Landroidx/compose/ui/platform/V$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Landroidx/compose/ui/platform/V$a;

    iget v1, v0, Landroidx/compose/ui/platform/V$a;->H:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Landroidx/compose/ui/platform/V$a;->H:I

    goto :goto_0

    :cond_0
    new-instance v0, Landroidx/compose/ui/platform/V$a;

    invoke-direct {v0, p0, p2}, Landroidx/compose/ui/platform/V$a;-><init>(Landroidx/compose/ui/platform/V;Lm7/e;)V

    :goto_0
    iget-object p2, v0, Landroidx/compose/ui/platform/V$a;->F:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Landroidx/compose/ui/platform/V$a;->H:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v3, :cond_1

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p2, p0, Landroidx/compose/ui/platform/V;->F:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v2, Landroidx/compose/ui/platform/V$b;

    invoke-direct {v2, p1, p0}, Landroidx/compose/ui/platform/V$b;-><init>(Landroidx/compose/ui/platform/Q0;Landroidx/compose/ui/platform/V;)V

    new-instance p1, Landroidx/compose/ui/platform/V$c;

    const/4 v4, 0x0

    invoke-direct {p1, p0, v4}, Landroidx/compose/ui/platform/V$c;-><init>(Landroidx/compose/ui/platform/V;Lm7/e;)V

    iput v3, v0, Landroidx/compose/ui/platform/V$a;->H:I

    invoke-static {p2, v2, p1, v0}, Lh0/o;->d(Ljava/util/concurrent/atomic/AtomicReference;Lx7/l;Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1
.end method

.method public final e(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/compose/ui/platform/V;->F:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0}, Lh0/o;->c(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/platform/C0;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroidx/compose/ui/platform/C0;->c(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final f()Z
    .locals 3

    .prologue
    iget-object v0, p0, Landroidx/compose/ui/platform/V;->F:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0}, Lh0/o;->c(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/platform/C0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/compose/ui/platform/C0;->e()Z

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    move v1, v2

    :cond_0
    return v1
.end method

.method public getCoroutineContext()Lm7/i;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/V;->E:LW8/N;

    invoke-interface {v0}, LW8/N;->getCoroutineContext()Lm7/i;

    move-result-object v0

    return-object v0
.end method
