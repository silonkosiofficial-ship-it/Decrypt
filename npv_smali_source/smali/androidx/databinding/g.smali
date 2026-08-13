.class public abstract Landroidx/databinding/g;
.super Landroidx/databinding/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/databinding/g$i;
    }
.end annotation


# static fields
.field static l:I = 0x0

.field private static final m:I = 0x8

.field private static final n:Z

.field private static final o:Landroidx/databinding/c;

.field private static final p:Landroidx/databinding/c;

.field private static final q:Landroidx/databinding/c;

.field private static final r:Landroidx/databinding/c;

.field private static final s:Landroidx/databinding/b;

.field private static final t:Ljava/lang/ref/ReferenceQueue;

.field private static final u:Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field private final a:Ljava/lang/Runnable;

.field private b:Z

.field private c:Z

.field private d:[Landroidx/databinding/h;

.field private final e:Landroid/view/View;

.field private f:Z

.field private g:Landroid/view/Choreographer;

.field private final h:Landroid/view/Choreographer$FrameCallback;

.field private i:Landroid/os/Handler;

.field private j:Landroidx/databinding/g;

.field private k:Landroidx/lifecycle/r;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    sput v0, Landroidx/databinding/g;->l:I

    const/4 v0, 0x1

    sput-boolean v0, Landroidx/databinding/g;->n:Z

    new-instance v0, Landroidx/databinding/g$a;

    invoke-direct {v0}, Landroidx/databinding/g$a;-><init>()V

    sput-object v0, Landroidx/databinding/g;->o:Landroidx/databinding/c;

    new-instance v0, Landroidx/databinding/g$b;

    invoke-direct {v0}, Landroidx/databinding/g$b;-><init>()V

    sput-object v0, Landroidx/databinding/g;->p:Landroidx/databinding/c;

    new-instance v0, Landroidx/databinding/g$c;

    invoke-direct {v0}, Landroidx/databinding/g$c;-><init>()V

    sput-object v0, Landroidx/databinding/g;->q:Landroidx/databinding/c;

    new-instance v0, Landroidx/databinding/g$d;

    invoke-direct {v0}, Landroidx/databinding/g$d;-><init>()V

    sput-object v0, Landroidx/databinding/g;->r:Landroidx/databinding/c;

    new-instance v0, Landroidx/databinding/g$e;

    invoke-direct {v0}, Landroidx/databinding/g$e;-><init>()V

    sput-object v0, Landroidx/databinding/g;->s:Landroidx/databinding/b;

    new-instance v0, Ljava/lang/ref/ReferenceQueue;

    invoke-direct {v0}, Ljava/lang/ref/ReferenceQueue;-><init>()V

    sput-object v0, Landroidx/databinding/g;->t:Ljava/lang/ref/ReferenceQueue;

    new-instance v0, Landroidx/databinding/g$f;

    invoke-direct {v0}, Landroidx/databinding/g$f;-><init>()V

    sput-object v0, Landroidx/databinding/g;->u:Landroid/view/View$OnAttachStateChangeListener;

    return-void
.end method

.method protected constructor <init>(Landroidx/databinding/e;Landroid/view/View;I)V
    .locals 0

    .prologue
    invoke-direct {p0}, Landroidx/databinding/a;-><init>()V

    new-instance p1, Landroidx/databinding/g$g;

    invoke-direct {p1, p0}, Landroidx/databinding/g$g;-><init>(Landroidx/databinding/g;)V

    iput-object p1, p0, Landroidx/databinding/g;->a:Ljava/lang/Runnable;

    const/4 p1, 0x0

    iput-boolean p1, p0, Landroidx/databinding/g;->b:Z

    iput-boolean p1, p0, Landroidx/databinding/g;->c:Z

    new-array p1, p3, [Landroidx/databinding/h;

    iput-object p1, p0, Landroidx/databinding/g;->d:[Landroidx/databinding/h;

    iput-object p2, p0, Landroidx/databinding/g;->e:Landroid/view/View;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p1

    if-eqz p1, :cond_1

    sget-boolean p1, Landroidx/databinding/g;->n:Z

    if-eqz p1, :cond_0

    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    move-result-object p1

    iput-object p1, p0, Landroidx/databinding/g;->g:Landroid/view/Choreographer;

    new-instance p1, Landroidx/databinding/g$h;

    invoke-direct {p1, p0}, Landroidx/databinding/g$h;-><init>(Landroidx/databinding/g;)V

    iput-object p1, p0, Landroidx/databinding/g;->h:Landroid/view/Choreographer$FrameCallback;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/databinding/g;->h:Landroid/view/Choreographer$FrameCallback;

    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Landroidx/databinding/g;->i:Landroid/os/Handler;

    :goto_0
    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "DataBinding must be created in view\'s UI Thread"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method protected constructor <init>(Ljava/lang/Object;Landroid/view/View;I)V
    .locals 0

    invoke-static {p1}, Landroidx/databinding/g;->f(Ljava/lang/Object;)Landroidx/databinding/e;

    const/4 p1, 0x0

    invoke-direct {p0, p1, p2, p3}, Landroidx/databinding/g;-><init>(Landroidx/databinding/e;Landroid/view/View;I)V

    return-void
.end method

.method static synthetic a(Landroidx/databinding/g;)Ljava/lang/Runnable;
    .locals 0

    iget-object p0, p0, Landroidx/databinding/g;->a:Ljava/lang/Runnable;

    return-object p0
.end method

.method static synthetic b(Landroidx/databinding/g;Z)Z
    .locals 0

    iput-boolean p1, p0, Landroidx/databinding/g;->b:Z

    return p1
.end method

.method static synthetic c()V
    .locals 0

    invoke-static {}, Landroidx/databinding/g;->q()V

    return-void
.end method

.method static synthetic d(Landroidx/databinding/g;)Landroid/view/View;
    .locals 0

    iget-object p0, p0, Landroidx/databinding/g;->e:Landroid/view/View;

    return-object p0
.end method

.method static synthetic e()Landroid/view/View$OnAttachStateChangeListener;
    .locals 1

    sget-object v0, Landroidx/databinding/g;->u:Landroid/view/View$OnAttachStateChangeListener;

    return-object v0
.end method

.method private static f(Ljava/lang/Object;)Landroidx/databinding/e;
    .locals 1

    .prologue
    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private h()V
    .locals 1

    .prologue
    iget-boolean v0, p0, Landroidx/databinding/g;->f:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/databinding/g;->r()V

    return-void

    :cond_0
    invoke-virtual {p0}, Landroidx/databinding/g;->l()Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/databinding/g;->f:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/databinding/g;->c:Z

    invoke-virtual {p0}, Landroidx/databinding/g;->g()V

    iput-boolean v0, p0, Landroidx/databinding/g;->f:Z

    return-void
.end method

.method static j(Landroid/view/View;)Landroidx/databinding/g;
    .locals 1

    .prologue
    if-eqz p0, :cond_0

    sget v0, LK1/a;->a:I

    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/databinding/g;

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private static m(Ljava/lang/String;I)Z
    .locals 3

    .prologue
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    if-ne v0, p1, :cond_0

    return v1

    :cond_0
    :goto_0
    if-ge p1, v0, :cond_2

    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-static {v2}, Ljava/lang/Character;->isDigit(C)Z

    move-result v2

    if-nez v2, :cond_1

    return v1

    :cond_1
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x1

    return p0
.end method

.method private static n(Landroidx/databinding/e;Landroid/view/View;[Ljava/lang/Object;Landroidx/databinding/g$i;Landroid/util/SparseIntArray;Z)V
    .locals 8

    .prologue
    invoke-static {p1}, Landroidx/databinding/g;->j(Landroid/view/View;)Landroidx/databinding/g;

    move-result-object v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_1

    check-cast v0, Ljava/lang/String;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz p5, :cond_2

    if-eqz v0, :cond_2

    const-string p5, "layout"

    invoke-virtual {v0, p5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p5

    if-eqz p5, :cond_2

    const/16 p5, 0x5f

    invoke-virtual {v0, p5}, Ljava/lang/String;->lastIndexOf(I)I

    move-result p5

    if-lez p5, :cond_3

    add-int/2addr p5, v2

    invoke-static {v0, p5}, Landroidx/databinding/g;->m(Ljava/lang/String;I)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-static {v0, p5}, Landroidx/databinding/g;->p(Ljava/lang/String;I)I

    move-result p5

    aget-object v0, p2, p5

    if-nez v0, :cond_4

    aput-object p1, p2, p5

    goto :goto_1

    :cond_2
    if-eqz v0, :cond_3

    const-string p5, "binding_"

    invoke-virtual {v0, p5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p5

    if-eqz p5, :cond_3

    sget p5, Landroidx/databinding/g;->m:I

    invoke-static {v0, p5}, Landroidx/databinding/g;->p(Ljava/lang/String;I)I

    move-result p5

    aget-object v0, p2, p5

    if-nez v0, :cond_4

    aput-object p1, p2, p5

    goto :goto_1

    :cond_3
    move v2, v1

    :cond_4
    :goto_1
    if-nez v2, :cond_5

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p5

    if-lez p5, :cond_5

    if-eqz p4, :cond_5

    const/4 v0, -0x1

    invoke-virtual {p4, p5, v0}, Landroid/util/SparseIntArray;->get(II)I

    move-result p5

    if-ltz p5, :cond_5

    aget-object v0, p2, p5

    if-nez v0, :cond_5

    aput-object p1, p2, p5

    :cond_5
    instance-of p5, p1, Landroid/view/ViewGroup;

    if-eqz p5, :cond_6

    check-cast p1, Landroid/view/ViewGroup;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p5

    :goto_2
    if-ge v1, p5, :cond_6

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    const/4 v7, 0x0

    move-object v2, p0

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-static/range {v2 .. v7}, Landroidx/databinding/g;->n(Landroidx/databinding/e;Landroid/view/View;[Ljava/lang/Object;Landroidx/databinding/g$i;Landroid/util/SparseIntArray;Z)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_6
    return-void
.end method

.method protected static o(Landroidx/databinding/e;Landroid/view/View;ILandroidx/databinding/g$i;Landroid/util/SparseIntArray;)[Ljava/lang/Object;
    .locals 6

    new-array p2, p2, [Ljava/lang/Object;

    const/4 v5, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-static/range {v0 .. v5}, Landroidx/databinding/g;->n(Landroidx/databinding/e;Landroid/view/View;[Ljava/lang/Object;Landroidx/databinding/g$i;Landroid/util/SparseIntArray;Z)V

    return-object p2
.end method

.method private static p(Ljava/lang/String;I)I
    .locals 3

    .prologue
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge p1, v0, :cond_0

    mul-int/lit8 v1, v1, 0xa

    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    add-int/lit8 v2, v2, -0x30

    add-int/2addr v1, v2

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    return v1
.end method

.method private static q()V
    .locals 1

    .prologue
    :goto_0
    sget-object v0, Landroidx/databinding/g;->t:Ljava/lang/ref/ReferenceQueue;

    invoke-virtual {v0}, Ljava/lang/ref/ReferenceQueue;->poll()Ljava/lang/ref/Reference;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method protected abstract g()V
.end method

.method public i()V
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/databinding/g;->j:Landroidx/databinding/g;

    if-nez v0, :cond_0

    invoke-direct {p0}, Landroidx/databinding/g;->h()V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroidx/databinding/g;->i()V

    :goto_0
    return-void
.end method

.method public k()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Landroidx/databinding/g;->e:Landroid/view/View;

    return-object v0
.end method

.method public abstract l()Z
.end method

.method protected r()V
    .locals 2

    .prologue
    iget-object v0, p0, Landroidx/databinding/g;->j:Landroidx/databinding/g;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/databinding/g;->r()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/databinding/g;->k:Landroidx/lifecycle/r;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Landroidx/lifecycle/r;->u()Landroidx/lifecycle/k;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/lifecycle/k;->b()Landroidx/lifecycle/k$b;

    move-result-object v0

    sget-object v1, Landroidx/lifecycle/k$b;->F:Landroidx/lifecycle/k$b;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/k$b;->g(Landroidx/lifecycle/k$b;)Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Landroidx/databinding/g;->b:Z

    if-eqz v0, :cond_2

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_2
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/databinding/g;->b:Z

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-boolean v0, Landroidx/databinding/g;->n:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Landroidx/databinding/g;->g:Landroid/view/Choreographer;

    iget-object v1, p0, Landroidx/databinding/g;->h:Landroid/view/Choreographer$FrameCallback;

    invoke-virtual {v0, v1}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    goto :goto_0

    :cond_3
    iget-object v0, p0, Landroidx/databinding/g;->i:Landroid/os/Handler;

    iget-object v1, p0, Landroidx/databinding/g;->a:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :goto_0
    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method protected s(Landroid/view/View;)V
    .locals 1

    sget v0, LK1/a;->a:I

    invoke-virtual {p1, v0, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    return-void
.end method
