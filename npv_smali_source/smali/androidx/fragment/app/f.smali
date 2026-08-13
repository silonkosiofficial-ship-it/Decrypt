.class public abstract Landroidx/fragment/app/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ComponentCallbacks;
.implements Landroid/view/View$OnCreateContextMenuListener;
.implements Landroidx/lifecycle/r;
.implements Landroidx/lifecycle/Y;
.implements Landroidx/lifecycle/i;
.implements Lx2/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/fragment/app/f$h;,
        Landroidx/fragment/app/f$g;,
        Landroidx/fragment/app/f$i;,
        Landroidx/fragment/app/f$j;
    }
.end annotation


# static fields
.field static final E0:Ljava/lang/Object;


# instance fields
.field private A0:I

.field private final B0:Ljava/util/concurrent/atomic/AtomicInteger;

.field C:I

.field private final C0:Ljava/util/ArrayList;

.field D:Landroid/os/Bundle;

.field private final D0:Landroidx/fragment/app/f$j;

.field E:Landroid/util/SparseArray;

.field F:Landroid/os/Bundle;

.field G:Ljava/lang/Boolean;

.field H:Ljava/lang/String;

.field I:Landroid/os/Bundle;

.field J:Landroidx/fragment/app/f;

.field K:Ljava/lang/String;

.field L:I

.field private M:Ljava/lang/Boolean;

.field N:Z

.field O:Z

.field P:Z

.field Q:Z

.field R:Z

.field S:Z

.field T:Z

.field U:I

.field V:Landroidx/fragment/app/n;

.field W:Landroidx/fragment/app/k;

.field X:Landroidx/fragment/app/n;

.field Y:Landroidx/fragment/app/f;

.field Z:I

.field a0:I

.field b0:Ljava/lang/String;

.field c0:Z

.field d0:Z

.field e0:Z

.field f0:Z

.field g0:Z

.field h0:Z

.field private i0:Z

.field j0:Landroid/view/ViewGroup;

.field k0:Landroid/view/View;

.field l0:Z

.field m0:Z

.field n0:Landroidx/fragment/app/f$g;

.field o0:Landroid/os/Handler;

.field p0:Ljava/lang/Runnable;

.field q0:Z

.field r0:Landroid/view/LayoutInflater;

.field s0:Z

.field public t0:Ljava/lang/String;

.field u0:Landroidx/lifecycle/k$b;

.field v0:Landroidx/lifecycle/t;

.field w0:Landroidx/fragment/app/y;

.field x0:Landroidx/lifecycle/z;

.field y0:Landroidx/lifecycle/V$c;

.field z0:Lx2/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Landroidx/fragment/app/f;->E0:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Landroidx/fragment/app/f;->C:I

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/f;->H:Ljava/lang/String;

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/fragment/app/f;->K:Ljava/lang/String;

    iput-object v0, p0, Landroidx/fragment/app/f;->M:Ljava/lang/Boolean;

    new-instance v0, Landroidx/fragment/app/o;

    invoke-direct {v0}, Landroidx/fragment/app/o;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/f;->X:Landroidx/fragment/app/n;

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/f;->h0:Z

    iput-boolean v0, p0, Landroidx/fragment/app/f;->m0:Z

    new-instance v0, Landroidx/fragment/app/f$a;

    invoke-direct {v0, p0}, Landroidx/fragment/app/f$a;-><init>(Landroidx/fragment/app/f;)V

    iput-object v0, p0, Landroidx/fragment/app/f;->p0:Ljava/lang/Runnable;

    sget-object v0, Landroidx/lifecycle/k$b;->G:Landroidx/lifecycle/k$b;

    iput-object v0, p0, Landroidx/fragment/app/f;->u0:Landroidx/lifecycle/k$b;

    new-instance v0, Landroidx/lifecycle/z;

    invoke-direct {v0}, Landroidx/lifecycle/z;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/f;->x0:Landroidx/lifecycle/z;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/f;->B0:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/f;->C0:Ljava/util/ArrayList;

    new-instance v0, Landroidx/fragment/app/f$b;

    invoke-direct {v0, p0}, Landroidx/fragment/app/f$b;-><init>(Landroidx/fragment/app/f;)V

    iput-object v0, p0, Landroidx/fragment/app/f;->D0:Landroidx/fragment/app/f$j;

    invoke-direct {p0}, Landroidx/fragment/app/f;->X()V

    return-void
.end method

.method private E()I
    .locals 2

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/f;->u0:Landroidx/lifecycle/k$b;

    sget-object v1, Landroidx/lifecycle/k$b;->D:Landroidx/lifecycle/k$b;

    if-eq v0, v1, :cond_1

    iget-object v1, p0, Landroidx/fragment/app/f;->Y:Landroidx/fragment/app/f;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    iget-object v1, p0, Landroidx/fragment/app/f;->Y:Landroidx/fragment/app/f;

    invoke-direct {v1}, Landroidx/fragment/app/f;->E()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    return v0

    :cond_1
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    return v0
.end method

.method private U(Z)Landroidx/fragment/app/f;
    .locals 1

    .prologue
    if-eqz p1, :cond_0

    invoke-static {p0}, LW1/c;->h(Landroidx/fragment/app/f;)V

    :cond_0
    iget-object p1, p0, Landroidx/fragment/app/f;->J:Landroidx/fragment/app/f;

    if-eqz p1, :cond_1

    return-object p1

    :cond_1
    iget-object p1, p0, Landroidx/fragment/app/f;->V:Landroidx/fragment/app/n;

    if-eqz p1, :cond_2

    iget-object v0, p0, Landroidx/fragment/app/f;->K:Ljava/lang/String;

    if-eqz v0, :cond_2

    invoke-virtual {p1, v0}, Landroidx/fragment/app/n;->c0(Ljava/lang/String;)Landroidx/fragment/app/f;

    move-result-object p1

    return-object p1

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method private X()V
    .locals 2

    .prologue
    new-instance v0, Landroidx/lifecycle/t;

    invoke-direct {v0, p0}, Landroidx/lifecycle/t;-><init>(Landroidx/lifecycle/r;)V

    iput-object v0, p0, Landroidx/fragment/app/f;->v0:Landroidx/lifecycle/t;

    invoke-static {p0}, Lx2/e;->a(Lx2/f;)Lx2/e;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/f;->z0:Lx2/e;

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/fragment/app/f;->y0:Landroidx/lifecycle/V$c;

    iget-object v0, p0, Landroidx/fragment/app/f;->C0:Ljava/util/ArrayList;

    iget-object v1, p0, Landroidx/fragment/app/f;->D0:Landroidx/fragment/app/f$j;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/fragment/app/f;->D0:Landroidx/fragment/app/f$j;

    invoke-direct {p0, v0}, Landroidx/fragment/app/f;->n1(Landroidx/fragment/app/f$j;)V

    :cond_0
    return-void
.end method

.method public static Z(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/fragment/app/f;
    .locals 3

    .prologue
    const-string v0, ": make sure class name exists, is public, and has an empty constructor that is public"

    const-string v1, "Unable to instantiate fragment "

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p0

    invoke-static {p0, p1}, Landroidx/fragment/app/j;->d(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0

    const/4 v2, 0x0

    invoke-virtual {p0, v2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p0

    invoke-virtual {p0, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/fragment/app/f;

    if-eqz p2, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {p2, v2}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    invoke-virtual {p0, p2}, Landroidx/fragment/app/f;->v1(Landroid/os/Bundle;)V
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    goto :goto_1

    :catch_1
    move-exception p0

    goto :goto_2

    :catch_2
    move-exception p0

    goto :goto_3

    :catch_3
    move-exception p0

    goto :goto_4

    :cond_0
    :goto_0
    return-object p0

    :goto_1
    new-instance p2, Landroidx/fragment/app/f$i;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ": calling Fragment constructor caused an exception"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1, p0}, Landroidx/fragment/app/f$i;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw p2

    :goto_2
    new-instance p2, Landroidx/fragment/app/f$i;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ": could not find Fragment constructor"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1, p0}, Landroidx/fragment/app/f$i;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw p2

    :goto_3
    new-instance p2, Landroidx/fragment/app/f$i;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1, p0}, Landroidx/fragment/app/f$i;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw p2

    :goto_4
    new-instance p2, Landroidx/fragment/app/f$i;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1, p0}, Landroidx/fragment/app/f$i;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw p2
.end method

.method private h()Landroidx/fragment/app/f$g;
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/f;->n0:Landroidx/fragment/app/f$g;

    if-nez v0, :cond_0

    new-instance v0, Landroidx/fragment/app/f$g;

    invoke-direct {v0}, Landroidx/fragment/app/f$g;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/f;->n0:Landroidx/fragment/app/f$g;

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/f;->n0:Landroidx/fragment/app/f$g;

    return-object v0
.end method

.method private n1(Landroidx/fragment/app/f$j;)V
    .locals 1

    .prologue
    iget v0, p0, Landroidx/fragment/app/f;->C:I

    if-ltz v0, :cond_0

    invoke-virtual {p1}, Landroidx/fragment/app/f$j;->a()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/f;->C0:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_0
    return-void
.end method

.method private s1()V
    .locals 2

    .prologue
    const/4 v0, 0x3

    invoke-static {v0}, Landroidx/fragment/app/n;->E0(I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "moveto RESTORE_VIEW_STATE: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FragmentManager"

    nop

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/f;->k0:Landroid/view/View;

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/fragment/app/f;->D:Landroid/os/Bundle;

    invoke-virtual {p0, v0}, Landroidx/fragment/app/f;->t1(Landroid/os/Bundle;)V

    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/fragment/app/f;->D:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method A()Landroidx/core/app/r;
    .locals 2

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/f;->n0:Landroidx/fragment/app/f$g;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object v1
.end method

.method public A0(Landroid/content/Context;Landroid/util/AttributeSet;Landroid/os/Bundle;)V
    .locals 1

    .prologue
    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/fragment/app/f;->i0:Z

    iget-object p1, p0, Landroidx/fragment/app/f;->W:Landroidx/fragment/app/k;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroidx/fragment/app/k;->k()Landroid/app/Activity;

    move-result-object p1

    :goto_0
    if-eqz p1, :cond_1

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/f;->i0:Z

    invoke-virtual {p0, p1, p2, p3}, Landroidx/fragment/app/f;->z0(Landroid/app/Activity;Landroid/util/AttributeSet;Landroid/os/Bundle;)V

    :cond_1
    return-void
.end method

.method A1(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 1

    invoke-direct {p0}, Landroidx/fragment/app/f;->h()Landroidx/fragment/app/f$g;

    iget-object v0, p0, Landroidx/fragment/app/f;->n0:Landroidx/fragment/app/f$g;

    iput-object p1, v0, Landroidx/fragment/app/f$g;->h:Ljava/util/ArrayList;

    iput-object p2, v0, Landroidx/fragment/app/f$g;->i:Ljava/util/ArrayList;

    return-void
.end method

.method B()Landroid/view/View;
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/f;->n0:Landroidx/fragment/app/f$g;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, v0, Landroidx/fragment/app/f$g;->s:Landroid/view/View;

    return-object v0
.end method

.method public B0(Z)V
    .locals 0

    return-void
.end method

.method public B1(Landroid/content/Intent;ILandroid/os/Bundle;)V
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/f;->W:Landroidx/fragment/app/k;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/f;->H()Landroidx/fragment/app/n;

    move-result-object v0

    invoke-virtual {v0, p0, p1, p2, p3}, Landroidx/fragment/app/n;->R0(Landroidx/fragment/app/f;Landroid/content/Intent;ILandroid/os/Bundle;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Fragment "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, " not attached to Activity"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final C()Ljava/lang/Object;
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/f;->W:Landroidx/fragment/app/k;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroidx/fragment/app/k;->x()Ljava/lang/Object;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public C0(Landroid/view/MenuItem;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public C1()V
    .locals 2

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/f;->n0:Landroidx/fragment/app/f$g;

    if-eqz v0, :cond_3

    invoke-direct {p0}, Landroidx/fragment/app/f;->h()Landroidx/fragment/app/f$g;

    move-result-object v0

    iget-boolean v0, v0, Landroidx/fragment/app/f$g;->t:Z

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/f;->W:Landroidx/fragment/app/k;

    if-nez v0, :cond_1

    invoke-direct {p0}, Landroidx/fragment/app/f;->h()Landroidx/fragment/app/f$g;

    move-result-object v0

    const/4 v1, 0x0

    iput-boolean v1, v0, Landroidx/fragment/app/f$g;->t:Z

    goto :goto_0

    :cond_1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    iget-object v1, p0, Landroidx/fragment/app/f;->W:Landroidx/fragment/app/k;

    invoke-virtual {v1}, Landroidx/fragment/app/k;->r()Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v1

    if-eq v0, v1, :cond_2

    iget-object v0, p0, Landroidx/fragment/app/f;->W:Landroidx/fragment/app/k;

    invoke-virtual {v0}, Landroidx/fragment/app/k;->r()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Landroidx/fragment/app/f$c;

    invoke-direct {v1, p0}, Landroidx/fragment/app/f$c;-><init>(Landroidx/fragment/app/f;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->postAtFrontOfQueue(Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_2
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroidx/fragment/app/f;->e(Z)V

    :cond_3
    :goto_0
    return-void
.end method

.method public D(Landroid/os/Bundle;)Landroid/view/LayoutInflater;
    .locals 1

    .prologue
    iget-object p1, p0, Landroidx/fragment/app/f;->W:Landroidx/fragment/app/k;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroidx/fragment/app/k;->y()Landroid/view/LayoutInflater;

    move-result-object p1

    iget-object v0, p0, Landroidx/fragment/app/f;->X:Landroidx/fragment/app/n;

    invoke-virtual {v0}, Landroidx/fragment/app/n;->s0()Landroid/view/LayoutInflater$Factory2;

    move-result-object v0

    invoke-static {p1, v0}, Landroidx/core/view/u;->a(Landroid/view/LayoutInflater;Landroid/view/LayoutInflater$Factory2;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public D0(Landroid/view/Menu;)V
    .locals 0

    return-void
.end method

.method public E0()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/f;->i0:Z

    return-void
.end method

.method F()I
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/f;->n0:Landroidx/fragment/app/f$g;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget v0, v0, Landroidx/fragment/app/f$g;->g:I

    return v0
.end method

.method public F0(Z)V
    .locals 0

    return-void
.end method

.method public final G()Landroidx/fragment/app/f;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/f;->Y:Landroidx/fragment/app/f;

    return-object v0
.end method

.method public G0(Landroid/view/Menu;)V
    .locals 0

    return-void
.end method

.method public final H()Landroidx/fragment/app/n;
    .locals 3

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/f;->V:Landroidx/fragment/app/n;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " not associated with a fragment manager."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public H0(Z)V
    .locals 0

    return-void
.end method

.method I()Z
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/f;->n0:Landroidx/fragment/app/f$g;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget-boolean v0, v0, Landroidx/fragment/app/f$g;->b:Z

    return v0
.end method

.method public I0(I[Ljava/lang/String;[I)V
    .locals 0

    return-void
.end method

.method J()I
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/f;->n0:Landroidx/fragment/app/f$g;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget v0, v0, Landroidx/fragment/app/f$g;->e:I

    return v0
.end method

.method public J0()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/f;->i0:Z

    return-void
.end method

.method K()I
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/f;->n0:Landroidx/fragment/app/f$g;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget v0, v0, Landroidx/fragment/app/f$g;->f:I

    return v0
.end method

.method public K0(Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method L()F
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/f;->n0:Landroidx/fragment/app/f$g;

    if-nez v0, :cond_0

    const/high16 v0, 0x3f800000    # 1.0f

    return v0

    :cond_0
    iget v0, v0, Landroidx/fragment/app/f$g;->r:F

    return v0
.end method

.method public L0()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/f;->i0:Z

    return-void
.end method

.method public M()Ljava/lang/Object;
    .locals 2

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/f;->n0:Landroidx/fragment/app/f$g;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, v0, Landroidx/fragment/app/f$g;->m:Ljava/lang/Object;

    sget-object v1, Landroidx/fragment/app/f;->E0:Ljava/lang/Object;

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Landroidx/fragment/app/f;->z()Ljava/lang/Object;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public M0()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/f;->i0:Z

    return-void
.end method

.method public final N()Landroid/content/res/Resources;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/f;->p1()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    return-object v0
.end method

.method public N0(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public O()Ljava/lang/Object;
    .locals 2

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/f;->n0:Landroidx/fragment/app/f$g;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, v0, Landroidx/fragment/app/f$g;->k:Ljava/lang/Object;

    sget-object v1, Landroidx/fragment/app/f;->E0:Ljava/lang/Object;

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Landroidx/fragment/app/f;->w()Ljava/lang/Object;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public O0(Landroid/os/Bundle;)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/fragment/app/f;->i0:Z

    return-void
.end method

.method public P()Ljava/lang/Object;
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/f;->n0:Landroidx/fragment/app/f$g;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, v0, Landroidx/fragment/app/f$g;->n:Ljava/lang/Object;

    return-object v0
.end method

.method P0(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/f;->X:Landroidx/fragment/app/n;

    invoke-virtual {v0}, Landroidx/fragment/app/n;->T0()V

    const/4 v0, 0x3

    iput v0, p0, Landroidx/fragment/app/f;->C:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/f;->i0:Z

    invoke-virtual {p0, p1}, Landroidx/fragment/app/f;->i0(Landroid/os/Bundle;)V

    iget-boolean p1, p0, Landroidx/fragment/app/f;->i0:Z

    if-eqz p1, :cond_0

    invoke-direct {p0}, Landroidx/fragment/app/f;->s1()V

    iget-object p1, p0, Landroidx/fragment/app/f;->X:Landroidx/fragment/app/n;

    invoke-virtual {p1}, Landroidx/fragment/app/n;->v()V

    return-void

    :cond_0
    new-instance p1, Landroidx/fragment/app/C;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Fragment "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " did not call through to super.onActivityCreated()"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Landroidx/fragment/app/C;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public Q()Ljava/lang/Object;
    .locals 2

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/f;->n0:Landroidx/fragment/app/f$g;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, v0, Landroidx/fragment/app/f$g;->o:Ljava/lang/Object;

    sget-object v1, Landroidx/fragment/app/f;->E0:Ljava/lang/Object;

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Landroidx/fragment/app/f;->P()Ljava/lang/Object;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method Q0()V
    .locals 3

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/f;->C0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/f$j;

    invoke-virtual {v1}, Landroidx/fragment/app/f$j;->a()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/f;->C0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Landroidx/fragment/app/f;->X:Landroidx/fragment/app/n;

    iget-object v1, p0, Landroidx/fragment/app/f;->W:Landroidx/fragment/app/k;

    invoke-virtual {p0}, Landroidx/fragment/app/f;->f()LV1/e;

    move-result-object v2

    invoke-virtual {v0, v1, v2, p0}, Landroidx/fragment/app/n;->k(Landroidx/fragment/app/k;LV1/e;Landroidx/fragment/app/f;)V

    const/4 v0, 0x0

    iput v0, p0, Landroidx/fragment/app/f;->C:I

    iput-boolean v0, p0, Landroidx/fragment/app/f;->i0:Z

    iget-object v0, p0, Landroidx/fragment/app/f;->W:Landroidx/fragment/app/k;

    invoke-virtual {v0}, Landroidx/fragment/app/k;->o()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/fragment/app/f;->l0(Landroid/content/Context;)V

    iget-boolean v0, p0, Landroidx/fragment/app/f;->i0:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/fragment/app/f;->V:Landroidx/fragment/app/n;

    invoke-virtual {v0, p0}, Landroidx/fragment/app/n;->F(Landroidx/fragment/app/f;)V

    iget-object v0, p0, Landroidx/fragment/app/f;->X:Landroidx/fragment/app/n;

    invoke-virtual {v0}, Landroidx/fragment/app/n;->w()V

    return-void

    :cond_1
    new-instance v0, Landroidx/fragment/app/C;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " did not call through to super.onAttach()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/fragment/app/C;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method R()Ljava/util/ArrayList;
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/f;->n0:Landroidx/fragment/app/f$g;

    if-eqz v0, :cond_1

    iget-object v0, v0, Landroidx/fragment/app/f$g;->h:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    :goto_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0
.end method

.method R0(Landroid/content/res/Configuration;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/fragment/app/f;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    return-void
.end method

.method S()Ljava/util/ArrayList;
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/f;->n0:Landroidx/fragment/app/f$g;

    if-eqz v0, :cond_1

    iget-object v0, v0, Landroidx/fragment/app/f$g;->i:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    :goto_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0
.end method

.method S0(Landroid/view/MenuItem;)Z
    .locals 1

    .prologue
    iget-boolean v0, p0, Landroidx/fragment/app/f;->c0:Z

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Landroidx/fragment/app/f;->n0(Landroid/view/MenuItem;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/f;->X:Landroidx/fragment/app/n;

    invoke-virtual {v0, p1}, Landroidx/fragment/app/n;->y(Landroid/view/MenuItem;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final T(I)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/f;->N()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method T0(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/f;->X:Landroidx/fragment/app/n;

    invoke-virtual {v0}, Landroidx/fragment/app/n;->T0()V

    const/4 v0, 0x1

    iput v0, p0, Landroidx/fragment/app/f;->C:I

    const/4 v1, 0x0

    iput-boolean v1, p0, Landroidx/fragment/app/f;->i0:Z

    iget-object v1, p0, Landroidx/fragment/app/f;->v0:Landroidx/lifecycle/t;

    new-instance v2, Landroidx/fragment/app/f$f;

    invoke-direct {v2, p0}, Landroidx/fragment/app/f$f;-><init>(Landroidx/fragment/app/f;)V

    invoke-virtual {v1, v2}, Landroidx/lifecycle/t;->a(Landroidx/lifecycle/q;)V

    iget-object v1, p0, Landroidx/fragment/app/f;->z0:Lx2/e;

    invoke-virtual {v1, p1}, Lx2/e;->d(Landroid/os/Bundle;)V

    invoke-virtual {p0, p1}, Landroidx/fragment/app/f;->o0(Landroid/os/Bundle;)V

    iput-boolean v0, p0, Landroidx/fragment/app/f;->s0:Z

    iget-boolean p1, p0, Landroidx/fragment/app/f;->i0:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Landroidx/fragment/app/f;->v0:Landroidx/lifecycle/t;

    sget-object v0, Landroidx/lifecycle/k$a;->ON_CREATE:Landroidx/lifecycle/k$a;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/t;->i(Landroidx/lifecycle/k$a;)V

    return-void

    :cond_0
    new-instance p1, Landroidx/fragment/app/C;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Fragment "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " did not call through to super.onCreate()"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Landroidx/fragment/app/C;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method U0(Landroid/view/Menu;Landroid/view/MenuInflater;)Z
    .locals 2

    .prologue
    iget-boolean v0, p0, Landroidx/fragment/app/f;->c0:Z

    const/4 v1, 0x0

    if-nez v0, :cond_1

    iget-boolean v0, p0, Landroidx/fragment/app/f;->g0:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Landroidx/fragment/app/f;->h0:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1, p2}, Landroidx/fragment/app/f;->r0(Landroid/view/Menu;Landroid/view/MenuInflater;)V

    const/4 v1, 0x1

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/f;->X:Landroidx/fragment/app/n;

    invoke-virtual {v0, p1, p2}, Landroidx/fragment/app/n;->A(Landroid/view/Menu;Landroid/view/MenuInflater;)Z

    move-result p1

    or-int/2addr v1, p1

    :cond_1
    return v1
.end method

.method public V()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/f;->k0:Landroid/view/View;

    return-object v0
.end method

.method V0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V
    .locals 2

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/f;->X:Landroidx/fragment/app/n;

    invoke-virtual {v0}, Landroidx/fragment/app/n;->T0()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/f;->T:Z

    new-instance v0, Landroidx/fragment/app/y;

    invoke-virtual {p0}, Landroidx/fragment/app/f;->n()Landroidx/lifecycle/X;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Landroidx/fragment/app/y;-><init>(Landroidx/fragment/app/f;Landroidx/lifecycle/X;)V

    iput-object v0, p0, Landroidx/fragment/app/f;->w0:Landroidx/fragment/app/y;

    invoke-virtual {p0, p1, p2, p3}, Landroidx/fragment/app/f;->s0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Landroidx/fragment/app/f;->k0:Landroid/view/View;

    if-eqz p1, :cond_0

    iget-object p1, p0, Landroidx/fragment/app/f;->w0:Landroidx/fragment/app/y;

    invoke-virtual {p1}, Landroidx/fragment/app/y;->c()V

    iget-object p1, p0, Landroidx/fragment/app/f;->k0:Landroid/view/View;

    iget-object p2, p0, Landroidx/fragment/app/f;->w0:Landroidx/fragment/app/y;

    invoke-static {p1, p2}, Landroidx/lifecycle/Z;->b(Landroid/view/View;Landroidx/lifecycle/r;)V

    iget-object p1, p0, Landroidx/fragment/app/f;->k0:Landroid/view/View;

    iget-object p2, p0, Landroidx/fragment/app/f;->w0:Landroidx/fragment/app/y;

    invoke-static {p1, p2}, Landroidx/lifecycle/a0;->b(Landroid/view/View;Landroidx/lifecycle/Y;)V

    iget-object p1, p0, Landroidx/fragment/app/f;->k0:Landroid/view/View;

    iget-object p2, p0, Landroidx/fragment/app/f;->w0:Landroidx/fragment/app/y;

    invoke-static {p1, p2}, Lx2/g;->b(Landroid/view/View;Lx2/f;)V

    iget-object p1, p0, Landroidx/fragment/app/f;->x0:Landroidx/lifecycle/z;

    iget-object p2, p0, Landroidx/fragment/app/f;->w0:Landroidx/fragment/app/y;

    invoke-virtual {p1, p2}, Landroidx/lifecycle/z;->n(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Landroidx/fragment/app/f;->w0:Landroidx/fragment/app/y;

    invoke-virtual {p1}, Landroidx/fragment/app/y;->d()Z

    move-result p1

    if-nez p1, :cond_1

    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/fragment/app/f;->w0:Landroidx/fragment/app/y;

    :goto_0
    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Called getViewLifecycleOwner() but onCreateView() returned null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public W()Landroidx/lifecycle/x;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/f;->x0:Landroidx/lifecycle/z;

    return-object v0
.end method

.method W0()V
    .locals 3

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/f;->X:Landroidx/fragment/app/n;

    invoke-virtual {v0}, Landroidx/fragment/app/n;->B()V

    iget-object v0, p0, Landroidx/fragment/app/f;->v0:Landroidx/lifecycle/t;

    sget-object v1, Landroidx/lifecycle/k$a;->ON_DESTROY:Landroidx/lifecycle/k$a;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/t;->i(Landroidx/lifecycle/k$a;)V

    const/4 v0, 0x0

    iput v0, p0, Landroidx/fragment/app/f;->C:I

    iput-boolean v0, p0, Landroidx/fragment/app/f;->i0:Z

    iput-boolean v0, p0, Landroidx/fragment/app/f;->s0:Z

    invoke-virtual {p0}, Landroidx/fragment/app/f;->t0()V

    iget-boolean v0, p0, Landroidx/fragment/app/f;->i0:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Landroidx/fragment/app/C;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " did not call through to super.onDestroy()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/fragment/app/C;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method X0()V
    .locals 3

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/f;->X:Landroidx/fragment/app/n;

    invoke-virtual {v0}, Landroidx/fragment/app/n;->C()V

    iget-object v0, p0, Landroidx/fragment/app/f;->k0:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/fragment/app/f;->w0:Landroidx/fragment/app/y;

    invoke-virtual {v0}, Landroidx/fragment/app/y;->u()Landroidx/lifecycle/k;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/lifecycle/k;->b()Landroidx/lifecycle/k$b;

    move-result-object v0

    sget-object v1, Landroidx/lifecycle/k$b;->E:Landroidx/lifecycle/k$b;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/k$b;->g(Landroidx/lifecycle/k$b;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/fragment/app/f;->w0:Landroidx/fragment/app/y;

    sget-object v1, Landroidx/lifecycle/k$a;->ON_DESTROY:Landroidx/lifecycle/k$a;

    invoke-virtual {v0, v1}, Landroidx/fragment/app/y;->a(Landroidx/lifecycle/k$a;)V

    :cond_0
    const/4 v0, 0x1

    iput v0, p0, Landroidx/fragment/app/f;->C:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/f;->i0:Z

    invoke-virtual {p0}, Landroidx/fragment/app/f;->v0()V

    iget-boolean v1, p0, Landroidx/fragment/app/f;->i0:Z

    if-eqz v1, :cond_1

    invoke-static {p0}, Landroidx/loader/app/a;->b(Landroidx/lifecycle/r;)Landroidx/loader/app/a;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/loader/app/a;->d()V

    iput-boolean v0, p0, Landroidx/fragment/app/f;->T:Z

    return-void

    :cond_1
    new-instance v0, Landroidx/fragment/app/C;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " did not call through to super.onDestroyView()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/fragment/app/C;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method Y()V
    .locals 3

    invoke-direct {p0}, Landroidx/fragment/app/f;->X()V

    iget-object v0, p0, Landroidx/fragment/app/f;->H:Ljava/lang/String;

    iput-object v0, p0, Landroidx/fragment/app/f;->t0:Ljava/lang/String;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/f;->H:Ljava/lang/String;

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/f;->N:Z

    iput-boolean v0, p0, Landroidx/fragment/app/f;->O:Z

    iput-boolean v0, p0, Landroidx/fragment/app/f;->Q:Z

    iput-boolean v0, p0, Landroidx/fragment/app/f;->R:Z

    iput-boolean v0, p0, Landroidx/fragment/app/f;->S:Z

    iput v0, p0, Landroidx/fragment/app/f;->U:I

    const/4 v1, 0x0

    iput-object v1, p0, Landroidx/fragment/app/f;->V:Landroidx/fragment/app/n;

    new-instance v2, Landroidx/fragment/app/o;

    invoke-direct {v2}, Landroidx/fragment/app/o;-><init>()V

    iput-object v2, p0, Landroidx/fragment/app/f;->X:Landroidx/fragment/app/n;

    iput-object v1, p0, Landroidx/fragment/app/f;->W:Landroidx/fragment/app/k;

    iput v0, p0, Landroidx/fragment/app/f;->Z:I

    iput v0, p0, Landroidx/fragment/app/f;->a0:I

    iput-object v1, p0, Landroidx/fragment/app/f;->b0:Ljava/lang/String;

    iput-boolean v0, p0, Landroidx/fragment/app/f;->c0:Z

    iput-boolean v0, p0, Landroidx/fragment/app/f;->d0:Z

    return-void
.end method

.method Y0()V
    .locals 3

    .prologue
    const/4 v0, -0x1

    iput v0, p0, Landroidx/fragment/app/f;->C:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/f;->i0:Z

    invoke-virtual {p0}, Landroidx/fragment/app/f;->w0()V

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/fragment/app/f;->r0:Landroid/view/LayoutInflater;

    iget-boolean v0, p0, Landroidx/fragment/app/f;->i0:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/fragment/app/f;->X:Landroidx/fragment/app/n;

    invoke-virtual {v0}, Landroidx/fragment/app/n;->D0()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/fragment/app/f;->X:Landroidx/fragment/app/n;

    invoke-virtual {v0}, Landroidx/fragment/app/n;->B()V

    new-instance v0, Landroidx/fragment/app/o;

    invoke-direct {v0}, Landroidx/fragment/app/o;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/f;->X:Landroidx/fragment/app/n;

    :cond_0
    return-void

    :cond_1
    new-instance v0, Landroidx/fragment/app/C;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " did not call through to super.onDetach()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/fragment/app/C;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method Z0(Landroid/os/Bundle;)Landroid/view/LayoutInflater;
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/fragment/app/f;->x0(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    move-result-object p1

    iput-object p1, p0, Landroidx/fragment/app/f;->r0:Landroid/view/LayoutInflater;

    return-object p1
.end method

.method public final a0()Z
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/f;->W:Landroidx/fragment/app/k;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Landroidx/fragment/app/f;->N:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method a1()V
    .locals 0

    invoke-virtual {p0}, Landroidx/fragment/app/f;->onLowMemory()V

    return-void
.end method

.method public final b0()Z
    .locals 2

    .prologue
    iget-boolean v0, p0, Landroidx/fragment/app/f;->c0:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Landroidx/fragment/app/f;->V:Landroidx/fragment/app/n;

    if-eqz v0, :cond_0

    iget-object v1, p0, Landroidx/fragment/app/f;->Y:Landroidx/fragment/app/f;

    invoke-virtual {v0, v1}, Landroidx/fragment/app/n;->H0(Landroidx/fragment/app/f;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method b1(Z)V
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/fragment/app/f;->B0(Z)V

    return-void
.end method

.method final c0()Z
    .locals 1

    .prologue
    iget v0, p0, Landroidx/fragment/app/f;->U:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method c1(Landroid/view/MenuItem;)Z
    .locals 1

    .prologue
    iget-boolean v0, p0, Landroidx/fragment/app/f;->c0:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Landroidx/fragment/app/f;->g0:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Landroidx/fragment/app/f;->h0:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Landroidx/fragment/app/f;->C0(Landroid/view/MenuItem;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/f;->X:Landroidx/fragment/app/n;

    invoke-virtual {v0, p1}, Landroidx/fragment/app/n;->H(Landroid/view/MenuItem;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final d0()Z
    .locals 2

    .prologue
    iget-boolean v0, p0, Landroidx/fragment/app/f;->h0:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/fragment/app/f;->V:Landroidx/fragment/app/n;

    if-eqz v0, :cond_0

    iget-object v1, p0, Landroidx/fragment/app/f;->Y:Landroidx/fragment/app/f;

    invoke-virtual {v0, v1}, Landroidx/fragment/app/n;->I0(Landroidx/fragment/app/f;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method d1(Landroid/view/Menu;)V
    .locals 1

    .prologue
    iget-boolean v0, p0, Landroidx/fragment/app/f;->c0:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Landroidx/fragment/app/f;->g0:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Landroidx/fragment/app/f;->h0:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Landroidx/fragment/app/f;->D0(Landroid/view/Menu;)V

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/f;->X:Landroidx/fragment/app/n;

    invoke-virtual {v0, p1}, Landroidx/fragment/app/n;->I(Landroid/view/Menu;)V

    :cond_1
    return-void
.end method

.method e(Z)V
    .locals 2

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/f;->n0:Landroidx/fragment/app/f$g;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    iput-boolean v1, v0, Landroidx/fragment/app/f$g;->t:Z

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/f;->k0:Landroid/view/View;

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroidx/fragment/app/f;->j0:Landroid/view/ViewGroup;

    if-eqz v0, :cond_2

    iget-object v1, p0, Landroidx/fragment/app/f;->V:Landroidx/fragment/app/n;

    if-eqz v1, :cond_2

    invoke-static {v0, v1}, Landroidx/fragment/app/A;->n(Landroid/view/ViewGroup;Landroidx/fragment/app/n;)Landroidx/fragment/app/A;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/A;->p()V

    if-eqz p1, :cond_1

    iget-object p1, p0, Landroidx/fragment/app/f;->W:Landroidx/fragment/app/k;

    invoke-virtual {p1}, Landroidx/fragment/app/k;->r()Landroid/os/Handler;

    move-result-object p1

    new-instance v1, Landroidx/fragment/app/f$d;

    invoke-direct {v1, p0, v0}, Landroidx/fragment/app/f$d;-><init>(Landroidx/fragment/app/f;Landroidx/fragment/app/A;)V

    invoke-virtual {p1, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Landroidx/fragment/app/A;->g()V

    :goto_0
    iget-object p1, p0, Landroidx/fragment/app/f;->o0:Landroid/os/Handler;

    if-eqz p1, :cond_2

    iget-object v0, p0, Landroidx/fragment/app/f;->p0:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/fragment/app/f;->o0:Landroid/os/Handler;

    :cond_2
    return-void
.end method

.method e0()Z
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/f;->n0:Landroidx/fragment/app/f$g;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget-boolean v0, v0, Landroidx/fragment/app/f$g;->t:Z

    return v0
.end method

.method e1()V
    .locals 3

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/f;->X:Landroidx/fragment/app/n;

    invoke-virtual {v0}, Landroidx/fragment/app/n;->K()V

    iget-object v0, p0, Landroidx/fragment/app/f;->k0:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/fragment/app/f;->w0:Landroidx/fragment/app/y;

    sget-object v1, Landroidx/lifecycle/k$a;->ON_PAUSE:Landroidx/lifecycle/k$a;

    invoke-virtual {v0, v1}, Landroidx/fragment/app/y;->a(Landroidx/lifecycle/k$a;)V

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/f;->v0:Landroidx/lifecycle/t;

    sget-object v1, Landroidx/lifecycle/k$a;->ON_PAUSE:Landroidx/lifecycle/k$a;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/t;->i(Landroidx/lifecycle/k$a;)V

    const/4 v0, 0x6

    iput v0, p0, Landroidx/fragment/app/f;->C:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/f;->i0:Z

    invoke-virtual {p0}, Landroidx/fragment/app/f;->E0()V

    iget-boolean v0, p0, Landroidx/fragment/app/f;->i0:Z

    if-eqz v0, :cond_1

    return-void

    :cond_1
    new-instance v0, Landroidx/fragment/app/C;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " did not call through to super.onPause()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/fragment/app/C;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    invoke-super {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method f()LV1/e;
    .locals 1

    new-instance v0, Landroidx/fragment/app/f$e;

    invoke-direct {v0, p0}, Landroidx/fragment/app/f$e;-><init>(Landroidx/fragment/app/f;)V

    return-object v0
.end method

.method public final f0()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/fragment/app/f;->O:Z

    return v0
.end method

.method f1(Z)V
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/fragment/app/f;->F0(Z)V

    return-void
.end method

.method public g(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 2

    .prologue
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mFragmentId=#"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Landroidx/fragment/app/f;->Z:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, " mContainerId=#"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Landroidx/fragment/app/f;->a0:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, " mTag="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/fragment/app/f;->b0:Ljava/lang/String;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mState="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Landroidx/fragment/app/f;->C:I

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(I)V

    const-string v0, " mWho="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/fragment/app/f;->H:Ljava/lang/String;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, " mBackStackNesting="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Landroidx/fragment/app/f;->U:I

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(I)V

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mAdded="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroidx/fragment/app/f;->N:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    const-string v0, " mRemoving="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroidx/fragment/app/f;->O:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    const-string v0, " mFromLayout="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroidx/fragment/app/f;->Q:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    const-string v0, " mInLayout="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroidx/fragment/app/f;->R:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mHidden="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroidx/fragment/app/f;->c0:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    const-string v0, " mDetached="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroidx/fragment/app/f;->d0:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    const-string v0, " mMenuVisible="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroidx/fragment/app/f;->h0:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    const-string v0, " mHasMenu="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroidx/fragment/app/f;->g0:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mRetainInstance="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroidx/fragment/app/f;->e0:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    const-string v0, " mUserVisibleHint="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroidx/fragment/app/f;->m0:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V

    iget-object v0, p0, Landroidx/fragment/app/f;->V:Landroidx/fragment/app/n;

    if-eqz v0, :cond_0

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mFragmentManager="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/fragment/app/f;->V:Landroidx/fragment/app/n;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/f;->W:Landroidx/fragment/app/k;

    if-eqz v0, :cond_1

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mHost="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/fragment/app/f;->W:Landroidx/fragment/app/k;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_1
    iget-object v0, p0, Landroidx/fragment/app/f;->Y:Landroidx/fragment/app/f;

    if-eqz v0, :cond_2

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mParentFragment="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/fragment/app/f;->Y:Landroidx/fragment/app/f;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_2
    iget-object v0, p0, Landroidx/fragment/app/f;->I:Landroid/os/Bundle;

    if-eqz v0, :cond_3

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mArguments="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/fragment/app/f;->I:Landroid/os/Bundle;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_3
    iget-object v0, p0, Landroidx/fragment/app/f;->D:Landroid/os/Bundle;

    if-eqz v0, :cond_4

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mSavedFragmentState="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/fragment/app/f;->D:Landroid/os/Bundle;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_4
    iget-object v0, p0, Landroidx/fragment/app/f;->E:Landroid/util/SparseArray;

    if-eqz v0, :cond_5

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mSavedViewState="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/fragment/app/f;->E:Landroid/util/SparseArray;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_5
    iget-object v0, p0, Landroidx/fragment/app/f;->F:Landroid/os/Bundle;

    if-eqz v0, :cond_6

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mSavedViewRegistryState="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/fragment/app/f;->F:Landroid/os/Bundle;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_6
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Landroidx/fragment/app/f;->U(Z)Landroidx/fragment/app/f;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v1, "mTarget="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/Object;)V

    const-string v0, " mTargetRequestCode="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Landroidx/fragment/app/f;->L:I

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(I)V

    :cond_7
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mPopDirection="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/fragment/app/f;->I()Z

    move-result v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V

    invoke-virtual {p0}, Landroidx/fragment/app/f;->v()I

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "getEnterAnim="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/fragment/app/f;->v()I

    move-result v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(I)V

    :cond_8
    invoke-virtual {p0}, Landroidx/fragment/app/f;->y()I

    move-result v0

    if-eqz v0, :cond_9

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "getExitAnim="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/fragment/app/f;->y()I

    move-result v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(I)V

    :cond_9
    invoke-virtual {p0}, Landroidx/fragment/app/f;->J()I

    move-result v0

    if-eqz v0, :cond_a

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "getPopEnterAnim="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/fragment/app/f;->J()I

    move-result v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(I)V

    :cond_a
    invoke-virtual {p0}, Landroidx/fragment/app/f;->K()I

    move-result v0

    if-eqz v0, :cond_b

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "getPopExitAnim="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/fragment/app/f;->K()I

    move-result v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(I)V

    :cond_b
    iget-object v0, p0, Landroidx/fragment/app/f;->j0:Landroid/view/ViewGroup;

    if-eqz v0, :cond_c

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mContainer="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/fragment/app/f;->j0:Landroid/view/ViewGroup;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_c
    iget-object v0, p0, Landroidx/fragment/app/f;->k0:Landroid/view/View;

    if-eqz v0, :cond_d

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mView="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/fragment/app/f;->k0:Landroid/view/View;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_d
    invoke-virtual {p0}, Landroidx/fragment/app/f;->q()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_e

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mAnimatingAway="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/fragment/app/f;->q()Landroid/view/View;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_e
    invoke-virtual {p0}, Landroidx/fragment/app/f;->t()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_f

    invoke-static {p0}, Landroidx/loader/app/a;->b(Landroidx/lifecycle/r;)Landroidx/loader/app/a;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p4}, Landroidx/loader/app/a;->a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    :cond_f
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Child "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/fragment/app/f;->X:Landroidx/fragment/app/n;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/fragment/app/f;->X:Landroidx/fragment/app/n;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "  "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1, p2, p3, p4}, Landroidx/fragment/app/n;->U(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    return-void
.end method

.method public final g0()Z
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/f;->V:Landroidx/fragment/app/n;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Landroidx/fragment/app/n;->L0()Z

    move-result v0

    return v0
.end method

.method g1(Landroid/view/Menu;)Z
    .locals 2

    .prologue
    iget-boolean v0, p0, Landroidx/fragment/app/f;->c0:Z

    const/4 v1, 0x0

    if-nez v0, :cond_1

    iget-boolean v0, p0, Landroidx/fragment/app/f;->g0:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Landroidx/fragment/app/f;->h0:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Landroidx/fragment/app/f;->G0(Landroid/view/Menu;)V

    const/4 v1, 0x1

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/f;->X:Landroidx/fragment/app/n;

    invoke-virtual {v0, p1}, Landroidx/fragment/app/n;->M(Landroid/view/Menu;)Z

    move-result p1

    or-int/2addr v1, p1

    :cond_1
    return v1
.end method

.method h0()V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/f;->X:Landroidx/fragment/app/n;

    invoke-virtual {v0}, Landroidx/fragment/app/n;->T0()V

    return-void
.end method

.method h1()V
    .locals 2

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/f;->V:Landroidx/fragment/app/n;

    invoke-virtual {v0, p0}, Landroidx/fragment/app/n;->J0(Landroidx/fragment/app/f;)Z

    move-result v0

    iget-object v1, p0, Landroidx/fragment/app/f;->M:Ljava/lang/Boolean;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eq v1, v0, :cond_1

    :cond_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, p0, Landroidx/fragment/app/f;->M:Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Landroidx/fragment/app/f;->H0(Z)V

    iget-object v0, p0, Landroidx/fragment/app/f;->X:Landroidx/fragment/app/n;

    invoke-virtual {v0}, Landroidx/fragment/app/n;->N()V

    :cond_1
    return-void
.end method

.method public final hashCode()I
    .locals 1

    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method i(Ljava/lang/String;)Landroidx/fragment/app/f;
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/f;->H:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/f;->X:Landroidx/fragment/app/n;

    invoke-virtual {v0, p1}, Landroidx/fragment/app/n;->g0(Ljava/lang/String;)Landroidx/fragment/app/f;

    move-result-object p1

    return-object p1
.end method

.method public i0(Landroid/os/Bundle;)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/fragment/app/f;->i0:Z

    return-void
.end method

.method i1()V
    .locals 3

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/f;->X:Landroidx/fragment/app/n;

    invoke-virtual {v0}, Landroidx/fragment/app/n;->T0()V

    iget-object v0, p0, Landroidx/fragment/app/f;->X:Landroidx/fragment/app/n;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/fragment/app/n;->Y(Z)Z

    const/4 v0, 0x7

    iput v0, p0, Landroidx/fragment/app/f;->C:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/f;->i0:Z

    invoke-virtual {p0}, Landroidx/fragment/app/f;->J0()V

    iget-boolean v0, p0, Landroidx/fragment/app/f;->i0:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/fragment/app/f;->v0:Landroidx/lifecycle/t;

    sget-object v1, Landroidx/lifecycle/k$a;->ON_RESUME:Landroidx/lifecycle/k$a;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/t;->i(Landroidx/lifecycle/k$a;)V

    iget-object v0, p0, Landroidx/fragment/app/f;->k0:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/fragment/app/f;->w0:Landroidx/fragment/app/y;

    invoke-virtual {v0, v1}, Landroidx/fragment/app/y;->a(Landroidx/lifecycle/k$a;)V

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/f;->X:Landroidx/fragment/app/n;

    invoke-virtual {v0}, Landroidx/fragment/app/n;->O()V

    return-void

    :cond_1
    new-instance v0, Landroidx/fragment/app/C;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " did not call through to super.onResume()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/fragment/app/C;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public j()Landroidx/lifecycle/V$c;
    .locals 3

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/f;->V:Landroidx/fragment/app/n;

    if-eqz v0, :cond_4

    iget-object v0, p0, Landroidx/fragment/app/f;->y0:Landroidx/lifecycle/V$c;

    if-nez v0, :cond_3

    invoke-virtual {p0}, Landroidx/fragment/app/f;->p1()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    :goto_0
    instance-of v1, v0, Landroid/content/ContextWrapper;

    if-eqz v1, :cond_1

    instance-of v1, v0, Landroid/app/Application;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/app/Application;

    goto :goto_1

    :cond_0
    check-cast v0, Landroid/content/ContextWrapper;

    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_1
    if-nez v0, :cond_2

    const/4 v1, 0x3

    invoke-static {v1}, Landroidx/fragment/app/n;->E0(I)Z

    move-result v1

    if-eqz v1, :cond_2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Could not find Application instance from Context "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroidx/fragment/app/f;->p1()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "FragmentManager"

    nop

    :cond_2
    new-instance v1, Landroidx/lifecycle/O;

    invoke-virtual {p0}, Landroidx/fragment/app/f;->r()Landroid/os/Bundle;

    move-result-object v2

    invoke-direct {v1, v0, p0, v2}, Landroidx/lifecycle/O;-><init>(Landroid/app/Application;Lx2/f;Landroid/os/Bundle;)V

    iput-object v1, p0, Landroidx/fragment/app/f;->y0:Landroidx/lifecycle/V$c;

    :cond_3
    iget-object v0, p0, Landroidx/fragment/app/f;->y0:Landroidx/lifecycle/V$c;

    return-object v0

    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Can\'t access ViewModels from detached fragment"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public j0(IILandroid/content/Intent;)V
    .locals 2

    .prologue
    const/4 v0, 0x2

    invoke-static {v0}, Landroidx/fragment/app/n;->E0(I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Fragment "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " received the following in onActivityResult(): requestCode: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " resultCode: "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " data: "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "FragmentManager"

    nop

    :cond_0
    return-void
.end method

.method j1(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    invoke-virtual {p0, p1}, Landroidx/fragment/app/f;->K0(Landroid/os/Bundle;)V

    iget-object v0, p0, Landroidx/fragment/app/f;->z0:Lx2/e;

    invoke-virtual {v0, p1}, Lx2/e;->e(Landroid/os/Bundle;)V

    iget-object v0, p0, Landroidx/fragment/app/f;->X:Landroidx/fragment/app/n;

    invoke-virtual {v0}, Landroidx/fragment/app/n;->g1()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "android:support:fragments"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    :cond_0
    return-void
.end method

.method public k()Lc2/a;
    .locals 3

    .prologue
    invoke-virtual {p0}, Landroidx/fragment/app/f;->p1()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    :goto_0
    instance-of v1, v0, Landroid/content/ContextWrapper;

    if-eqz v1, :cond_1

    instance-of v1, v0, Landroid/app/Application;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/app/Application;

    goto :goto_1

    :cond_0
    check-cast v0, Landroid/content/ContextWrapper;

    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_1
    if-nez v0, :cond_2

    const/4 v1, 0x3

    invoke-static {v1}, Landroidx/fragment/app/n;->E0(I)Z

    move-result v1

    if-eqz v1, :cond_2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Could not find Application instance from Context "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroidx/fragment/app/f;->p1()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "FragmentManager"

    nop

    :cond_2
    new-instance v1, Lc2/d;

    invoke-direct {v1}, Lc2/d;-><init>()V

    if-eqz v0, :cond_3

    sget-object v2, Landroidx/lifecycle/V$a;->g:Lc2/a$b;

    invoke-virtual {v1, v2, v0}, Lc2/d;->c(Lc2/a$b;Ljava/lang/Object;)V

    :cond_3
    sget-object v0, Landroidx/lifecycle/L;->a:Lc2/a$b;

    invoke-virtual {v1, v0, p0}, Lc2/d;->c(Lc2/a$b;Ljava/lang/Object;)V

    sget-object v0, Landroidx/lifecycle/L;->b:Lc2/a$b;

    invoke-virtual {v1, v0, p0}, Lc2/d;->c(Lc2/a$b;Ljava/lang/Object;)V

    invoke-virtual {p0}, Landroidx/fragment/app/f;->r()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_4

    sget-object v0, Landroidx/lifecycle/L;->c:Lc2/a$b;

    invoke-virtual {p0}, Landroidx/fragment/app/f;->r()Landroid/os/Bundle;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lc2/d;->c(Lc2/a$b;Ljava/lang/Object;)V

    :cond_4
    return-object v1
.end method

.method public k0(Landroid/app/Activity;)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/fragment/app/f;->i0:Z

    return-void
.end method

.method k1()V
    .locals 3

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/f;->X:Landroidx/fragment/app/n;

    invoke-virtual {v0}, Landroidx/fragment/app/n;->T0()V

    iget-object v0, p0, Landroidx/fragment/app/f;->X:Landroidx/fragment/app/n;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/fragment/app/n;->Y(Z)Z

    const/4 v0, 0x5

    iput v0, p0, Landroidx/fragment/app/f;->C:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/f;->i0:Z

    invoke-virtual {p0}, Landroidx/fragment/app/f;->L0()V

    iget-boolean v0, p0, Landroidx/fragment/app/f;->i0:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/fragment/app/f;->v0:Landroidx/lifecycle/t;

    sget-object v1, Landroidx/lifecycle/k$a;->ON_START:Landroidx/lifecycle/k$a;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/t;->i(Landroidx/lifecycle/k$a;)V

    iget-object v0, p0, Landroidx/fragment/app/f;->k0:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/fragment/app/f;->w0:Landroidx/fragment/app/y;

    invoke-virtual {v0, v1}, Landroidx/fragment/app/y;->a(Landroidx/lifecycle/k$a;)V

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/f;->X:Landroidx/fragment/app/n;

    invoke-virtual {v0}, Landroidx/fragment/app/n;->P()V

    return-void

    :cond_1
    new-instance v0, Landroidx/fragment/app/C;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " did not call through to super.onStart()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/fragment/app/C;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final l()Landroidx/fragment/app/g;
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/f;->W:Landroidx/fragment/app/k;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroidx/fragment/app/k;->k()Landroid/app/Activity;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/g;

    :goto_0
    return-object v0
.end method

.method public l0(Landroid/content/Context;)V
    .locals 1

    .prologue
    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/fragment/app/f;->i0:Z

    iget-object p1, p0, Landroidx/fragment/app/f;->W:Landroidx/fragment/app/k;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroidx/fragment/app/k;->k()Landroid/app/Activity;

    move-result-object p1

    :goto_0
    if-eqz p1, :cond_1

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/f;->i0:Z

    invoke-virtual {p0, p1}, Landroidx/fragment/app/f;->k0(Landroid/app/Activity;)V

    :cond_1
    return-void
.end method

.method l1()V
    .locals 3

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/f;->X:Landroidx/fragment/app/n;

    invoke-virtual {v0}, Landroidx/fragment/app/n;->R()V

    iget-object v0, p0, Landroidx/fragment/app/f;->k0:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/fragment/app/f;->w0:Landroidx/fragment/app/y;

    sget-object v1, Landroidx/lifecycle/k$a;->ON_STOP:Landroidx/lifecycle/k$a;

    invoke-virtual {v0, v1}, Landroidx/fragment/app/y;->a(Landroidx/lifecycle/k$a;)V

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/f;->v0:Landroidx/lifecycle/t;

    sget-object v1, Landroidx/lifecycle/k$a;->ON_STOP:Landroidx/lifecycle/k$a;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/t;->i(Landroidx/lifecycle/k$a;)V

    const/4 v0, 0x4

    iput v0, p0, Landroidx/fragment/app/f;->C:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/f;->i0:Z

    invoke-virtual {p0}, Landroidx/fragment/app/f;->M0()V

    iget-boolean v0, p0, Landroidx/fragment/app/f;->i0:Z

    if-eqz v0, :cond_1

    return-void

    :cond_1
    new-instance v0, Landroidx/fragment/app/C;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " did not call through to super.onStop()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/fragment/app/C;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public m()Z
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/f;->n0:Landroidx/fragment/app/f$g;

    if-eqz v0, :cond_1

    iget-object v0, v0, Landroidx/fragment/app/f$g;->q:Ljava/lang/Boolean;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public m0(Landroidx/fragment/app/f;)V
    .locals 0

    return-void
.end method

.method m1()V
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/f;->k0:Landroid/view/View;

    iget-object v1, p0, Landroidx/fragment/app/f;->D:Landroid/os/Bundle;

    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/f;->N0(Landroid/view/View;Landroid/os/Bundle;)V

    iget-object v0, p0, Landroidx/fragment/app/f;->X:Landroidx/fragment/app/n;

    invoke-virtual {v0}, Landroidx/fragment/app/n;->S()V

    return-void
.end method

.method public n()Landroidx/lifecycle/X;
    .locals 2

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/f;->V:Landroidx/fragment/app/n;

    if-eqz v0, :cond_1

    invoke-direct {p0}, Landroidx/fragment/app/f;->E()I

    move-result v0

    sget-object v1, Landroidx/lifecycle/k$b;->D:Landroidx/lifecycle/k$b;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Landroidx/fragment/app/f;->V:Landroidx/fragment/app/n;

    invoke-virtual {v0, p0}, Landroidx/fragment/app/n;->z0(Landroidx/fragment/app/f;)Landroidx/lifecycle/X;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Can\'t access ViewModels from detached fragment"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public n0(Landroid/view/MenuItem;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public o()Z
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/f;->n0:Landroidx/fragment/app/f$g;

    if-eqz v0, :cond_1

    iget-object v0, v0, Landroidx/fragment/app/f$g;->p:Ljava/lang/Boolean;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public o0(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/f;->i0:Z

    invoke-virtual {p0, p1}, Landroidx/fragment/app/f;->r1(Landroid/os/Bundle;)V

    iget-object p1, p0, Landroidx/fragment/app/f;->X:Landroidx/fragment/app/n;

    invoke-virtual {p1, v0}, Landroidx/fragment/app/n;->K0(I)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Landroidx/fragment/app/f;->X:Landroidx/fragment/app/n;

    invoke-virtual {p1}, Landroidx/fragment/app/n;->z()V

    :cond_0
    return-void
.end method

.method public final o1()Landroidx/fragment/app/g;
    .locals 3

    .prologue
    invoke-virtual {p0}, Landroidx/fragment/app/f;->l()Landroidx/fragment/app/g;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " not attached to an activity."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/fragment/app/f;->i0:Z

    return-void
.end method

.method public onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/f;->o1()Landroidx/fragment/app/g;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Landroid/app/Activity;->onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V

    return-void
.end method

.method public onLowMemory()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/f;->i0:Z

    return-void
.end method

.method public final p()Lx2/d;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/f;->z0:Lx2/e;

    invoke-virtual {v0}, Lx2/e;->b()Lx2/d;

    move-result-object v0

    return-object v0
.end method

.method public p0(IZI)Landroid/view/animation/Animation;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final p1()Landroid/content/Context;
    .locals 3

    .prologue
    invoke-virtual {p0}, Landroidx/fragment/app/f;->t()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " not attached to a context."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method q()Landroid/view/View;
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/f;->n0:Landroidx/fragment/app/f$g;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, v0, Landroidx/fragment/app/f$g;->a:Landroid/view/View;

    return-object v0
.end method

.method public q0(IZI)Landroid/animation/Animator;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final q1()Landroid/view/View;
    .locals 3

    .prologue
    invoke-virtual {p0}, Landroidx/fragment/app/f;->V()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " did not return a View from onCreateView() or this was called before onCreateView()."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final r()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/f;->I:Landroid/os/Bundle;

    return-object v0
.end method

.method public r0(Landroid/view/Menu;Landroid/view/MenuInflater;)V
    .locals 0

    return-void
.end method

.method r1(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    if-eqz p1, :cond_0

    const-string v0, "android:support:fragments"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Landroidx/fragment/app/f;->X:Landroidx/fragment/app/n;

    invoke-virtual {v0, p1}, Landroidx/fragment/app/n;->e1(Landroid/os/Parcelable;)V

    iget-object p1, p0, Landroidx/fragment/app/f;->X:Landroidx/fragment/app/n;

    invoke-virtual {p1}, Landroidx/fragment/app/n;->z()V

    :cond_0
    return-void
.end method

.method public final s()Landroidx/fragment/app/n;
    .locals 3

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/f;->W:Landroidx/fragment/app/k;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/fragment/app/f;->X:Landroidx/fragment/app/n;

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " has not been attached yet."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public s0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    .prologue
    iget p3, p0, Landroidx/fragment/app/f;->A0:I

    if-eqz p3, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public startActivityForResult(Landroid/content/Intent;I)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Landroidx/fragment/app/f;->B1(Landroid/content/Intent;ILandroid/os/Bundle;)V

    return-void
.end method

.method public t()Landroid/content/Context;
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/f;->W:Landroidx/fragment/app/k;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroidx/fragment/app/k;->o()Landroid/content/Context;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public t0()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/f;->i0:Z

    return-void
.end method

.method final t1(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/f;->E:Landroid/util/SparseArray;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v2, p0, Landroidx/fragment/app/f;->k0:Landroid/view/View;

    invoke-virtual {v2, v0}, Landroid/view/View;->restoreHierarchyState(Landroid/util/SparseArray;)V

    iput-object v1, p0, Landroidx/fragment/app/f;->E:Landroid/util/SparseArray;

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/f;->k0:Landroid/view/View;

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/fragment/app/f;->w0:Landroidx/fragment/app/y;

    iget-object v2, p0, Landroidx/fragment/app/f;->F:Landroid/os/Bundle;

    invoke-virtual {v0, v2}, Landroidx/fragment/app/y;->e(Landroid/os/Bundle;)V

    iput-object v1, p0, Landroidx/fragment/app/f;->F:Landroid/os/Bundle;

    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/f;->i0:Z

    invoke-virtual {p0, p1}, Landroidx/fragment/app/f;->O0(Landroid/os/Bundle;)V

    iget-boolean p1, p0, Landroidx/fragment/app/f;->i0:Z

    if-eqz p1, :cond_3

    iget-object p1, p0, Landroidx/fragment/app/f;->k0:Landroid/view/View;

    if-eqz p1, :cond_2

    iget-object p1, p0, Landroidx/fragment/app/f;->w0:Landroidx/fragment/app/y;

    sget-object v0, Landroidx/lifecycle/k$a;->ON_CREATE:Landroidx/lifecycle/k$a;

    invoke-virtual {p1, v0}, Landroidx/fragment/app/y;->a(Landroidx/lifecycle/k$a;)V

    :cond_2
    return-void

    :cond_3
    new-instance p1, Landroidx/fragment/app/C;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Fragment "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " did not call through to super.onViewStateRestored()"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Landroidx/fragment/app/C;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/fragment/app/f;->H:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/fragment/app/f;->Z:I

    if-eqz v1, :cond_0

    const-string v1, " id=0x"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/fragment/app/f;->Z:I

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    iget-object v1, p0, Landroidx/fragment/app/f;->b0:Ljava/lang/String;

    if-eqz v1, :cond_1

    const-string v1, " tag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/fragment/app/f;->b0:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u()Landroidx/lifecycle/k;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/f;->v0:Landroidx/lifecycle/t;

    return-object v0
.end method

.method public u0()V
    .locals 0

    return-void
.end method

.method u1(IIII)V
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/f;->n0:Landroidx/fragment/app/f$g;

    if-nez v0, :cond_0

    if-nez p1, :cond_0

    if-nez p2, :cond_0

    if-nez p3, :cond_0

    if-nez p4, :cond_0

    return-void

    :cond_0
    invoke-direct {p0}, Landroidx/fragment/app/f;->h()Landroidx/fragment/app/f$g;

    move-result-object v0

    iput p1, v0, Landroidx/fragment/app/f$g;->c:I

    invoke-direct {p0}, Landroidx/fragment/app/f;->h()Landroidx/fragment/app/f$g;

    move-result-object p1

    iput p2, p1, Landroidx/fragment/app/f$g;->d:I

    invoke-direct {p0}, Landroidx/fragment/app/f;->h()Landroidx/fragment/app/f$g;

    move-result-object p1

    iput p3, p1, Landroidx/fragment/app/f$g;->e:I

    invoke-direct {p0}, Landroidx/fragment/app/f;->h()Landroidx/fragment/app/f$g;

    move-result-object p1

    iput p4, p1, Landroidx/fragment/app/f$g;->f:I

    return-void
.end method

.method v()I
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/f;->n0:Landroidx/fragment/app/f$g;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget v0, v0, Landroidx/fragment/app/f$g;->c:I

    return v0
.end method

.method public v0()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/f;->i0:Z

    return-void
.end method

.method public v1(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/f;->V:Landroidx/fragment/app/n;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroidx/fragment/app/f;->g0()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Fragment already added and state has been saved"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iput-object p1, p0, Landroidx/fragment/app/f;->I:Landroid/os/Bundle;

    return-void
.end method

.method public w()Ljava/lang/Object;
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/f;->n0:Landroidx/fragment/app/f$g;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, v0, Landroidx/fragment/app/f$g;->j:Ljava/lang/Object;

    return-object v0
.end method

.method public w0()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/f;->i0:Z

    return-void
.end method

.method w1(Landroid/view/View;)V
    .locals 1

    invoke-direct {p0}, Landroidx/fragment/app/f;->h()Landroidx/fragment/app/f$g;

    move-result-object v0

    iput-object p1, v0, Landroidx/fragment/app/f$g;->s:Landroid/view/View;

    return-void
.end method

.method x()Landroidx/core/app/r;
    .locals 2

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/f;->n0:Landroidx/fragment/app/f$g;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object v1
.end method

.method public x0(Landroid/os/Bundle;)Landroid/view/LayoutInflater;
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/fragment/app/f;->D(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    move-result-object p1

    return-object p1
.end method

.method x1(I)V
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/f;->n0:Landroidx/fragment/app/f$g;

    if-nez v0, :cond_0

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-direct {p0}, Landroidx/fragment/app/f;->h()Landroidx/fragment/app/f$g;

    iget-object v0, p0, Landroidx/fragment/app/f;->n0:Landroidx/fragment/app/f$g;

    iput p1, v0, Landroidx/fragment/app/f$g;->g:I

    return-void
.end method

.method y()I
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/f;->n0:Landroidx/fragment/app/f$g;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget v0, v0, Landroidx/fragment/app/f$g;->d:I

    return v0
.end method

.method public y0(Z)V
    .locals 0

    return-void
.end method

.method y1(Z)V
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/f;->n0:Landroidx/fragment/app/f$g;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0}, Landroidx/fragment/app/f;->h()Landroidx/fragment/app/f$g;

    move-result-object v0

    iput-boolean p1, v0, Landroidx/fragment/app/f$g;->b:Z

    return-void
.end method

.method public z()Ljava/lang/Object;
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/f;->n0:Landroidx/fragment/app/f$g;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, v0, Landroidx/fragment/app/f$g;->l:Ljava/lang/Object;

    return-object v0
.end method

.method public z0(Landroid/app/Activity;Landroid/util/AttributeSet;Landroid/os/Bundle;)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/fragment/app/f;->i0:Z

    return-void
.end method

.method z1(F)V
    .locals 1

    invoke-direct {p0}, Landroidx/fragment/app/f;->h()Landroidx/fragment/app/f$g;

    move-result-object v0

    iput p1, v0, Landroidx/fragment/app/f$g;->r:F

    return-void
.end method
