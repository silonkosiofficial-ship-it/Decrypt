.class public final Landroidx/lifecycle/D;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/r;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/lifecycle/D$a;,
        Landroidx/lifecycle/D$b;
    }
.end annotation


# static fields
.field public static final K:Landroidx/lifecycle/D$b;

.field private static final L:Landroidx/lifecycle/D;


# instance fields
.field private C:I

.field private D:I

.field private E:Z

.field private F:Z

.field private G:Landroid/os/Handler;

.field private final H:Landroidx/lifecycle/t;

.field private final I:Ljava/lang/Runnable;

.field private final J:Landroidx/lifecycle/F$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/lifecycle/D$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/lifecycle/D$b;-><init>(Ly7/k;)V

    sput-object v0, Landroidx/lifecycle/D;->K:Landroidx/lifecycle/D$b;

    new-instance v0, Landroidx/lifecycle/D;

    invoke-direct {v0}, Landroidx/lifecycle/D;-><init>()V

    sput-object v0, Landroidx/lifecycle/D;->L:Landroidx/lifecycle/D;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/lifecycle/D;->E:Z

    iput-boolean v0, p0, Landroidx/lifecycle/D;->F:Z

    new-instance v0, Landroidx/lifecycle/t;

    invoke-direct {v0, p0}, Landroidx/lifecycle/t;-><init>(Landroidx/lifecycle/r;)V

    iput-object v0, p0, Landroidx/lifecycle/D;->H:Landroidx/lifecycle/t;

    new-instance v0, Landroidx/lifecycle/C;

    invoke-direct {v0, p0}, Landroidx/lifecycle/C;-><init>(Landroidx/lifecycle/D;)V

    iput-object v0, p0, Landroidx/lifecycle/D;->I:Ljava/lang/Runnable;

    new-instance v0, Landroidx/lifecycle/D$d;

    invoke-direct {v0, p0}, Landroidx/lifecycle/D$d;-><init>(Landroidx/lifecycle/D;)V

    iput-object v0, p0, Landroidx/lifecycle/D;->J:Landroidx/lifecycle/F$a;

    return-void
.end method

.method public static synthetic a(Landroidx/lifecycle/D;)V
    .locals 0

    invoke-static {p0}, Landroidx/lifecycle/D;->j(Landroidx/lifecycle/D;)V

    return-void
.end method

.method public static final synthetic c(Landroidx/lifecycle/D;)Landroidx/lifecycle/F$a;
    .locals 0

    iget-object p0, p0, Landroidx/lifecycle/D;->J:Landroidx/lifecycle/F$a;

    return-object p0
.end method

.method public static final synthetic d()Landroidx/lifecycle/D;
    .locals 1

    sget-object v0, Landroidx/lifecycle/D;->L:Landroidx/lifecycle/D;

    return-object v0
.end method

.method private static final j(Landroidx/lifecycle/D;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/lifecycle/D;->k()V

    invoke-virtual {p0}, Landroidx/lifecycle/D;->l()V

    return-void
.end method


# virtual methods
.method public final e()V
    .locals 4

    .prologue
    iget v0, p0, Landroidx/lifecycle/D;->D:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Landroidx/lifecycle/D;->D:I

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/lifecycle/D;->G:Landroid/os/Handler;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v1, p0, Landroidx/lifecycle/D;->I:Ljava/lang/Runnable;

    const-wide/16 v2, 0x2bc

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method

.method public final f()V
    .locals 2

    .prologue
    iget v0, p0, Landroidx/lifecycle/D;->D:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Landroidx/lifecycle/D;->D:I

    if-ne v0, v1, :cond_1

    iget-boolean v0, p0, Landroidx/lifecycle/D;->E:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/lifecycle/D;->H:Landroidx/lifecycle/t;

    sget-object v1, Landroidx/lifecycle/k$a;->ON_RESUME:Landroidx/lifecycle/k$a;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/t;->i(Landroidx/lifecycle/k$a;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/lifecycle/D;->E:Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/lifecycle/D;->G:Landroid/os/Handler;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v1, p0, Landroidx/lifecycle/D;->I:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final g()V
    .locals 2

    .prologue
    iget v0, p0, Landroidx/lifecycle/D;->C:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Landroidx/lifecycle/D;->C:I

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Landroidx/lifecycle/D;->F:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/lifecycle/D;->H:Landroidx/lifecycle/t;

    sget-object v1, Landroidx/lifecycle/k$a;->ON_START:Landroidx/lifecycle/k$a;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/t;->i(Landroidx/lifecycle/k$a;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/lifecycle/D;->F:Z

    :cond_0
    return-void
.end method

.method public final h()V
    .locals 1

    iget v0, p0, Landroidx/lifecycle/D;->C:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Landroidx/lifecycle/D;->C:I

    invoke-virtual {p0}, Landroidx/lifecycle/D;->l()V

    return-void
.end method

.method public final i(Landroid/content/Context;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Landroidx/lifecycle/D;->G:Landroid/os/Handler;

    iget-object v0, p0, Landroidx/lifecycle/D;->H:Landroidx/lifecycle/t;

    sget-object v1, Landroidx/lifecycle/k$a;->ON_CREATE:Landroidx/lifecycle/k$a;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/t;->i(Landroidx/lifecycle/k$a;)V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type android.app.Application"

    invoke-static {p1, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/app/Application;

    new-instance v0, Landroidx/lifecycle/D$c;

    invoke-direct {v0, p0}, Landroidx/lifecycle/D$c;-><init>(Landroidx/lifecycle/D;)V

    invoke-virtual {p1, v0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    return-void
.end method

.method public final k()V
    .locals 2

    .prologue
    iget v0, p0, Landroidx/lifecycle/D;->D:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/lifecycle/D;->E:Z

    iget-object v0, p0, Landroidx/lifecycle/D;->H:Landroidx/lifecycle/t;

    sget-object v1, Landroidx/lifecycle/k$a;->ON_PAUSE:Landroidx/lifecycle/k$a;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/t;->i(Landroidx/lifecycle/k$a;)V

    :cond_0
    return-void
.end method

.method public final l()V
    .locals 2

    .prologue
    iget v0, p0, Landroidx/lifecycle/D;->C:I

    if-nez v0, :cond_0

    iget-boolean v0, p0, Landroidx/lifecycle/D;->E:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/lifecycle/D;->H:Landroidx/lifecycle/t;

    sget-object v1, Landroidx/lifecycle/k$a;->ON_STOP:Landroidx/lifecycle/k$a;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/t;->i(Landroidx/lifecycle/k$a;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/lifecycle/D;->F:Z

    :cond_0
    return-void
.end method

.method public u()Landroidx/lifecycle/k;
    .locals 1

    iget-object v0, p0, Landroidx/lifecycle/D;->H:Landroidx/lifecycle/t;

    return-object v0
.end method
