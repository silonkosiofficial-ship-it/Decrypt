.class public final Lx2/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx2/e$a;
    }
.end annotation


# static fields
.field public static final d:Lx2/e$a;


# instance fields
.field private final a:Lx2/f;

.field private final b:Lx2/d;

.field private c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lx2/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lx2/e$a;-><init>(Ly7/k;)V

    sput-object v0, Lx2/e;->d:Lx2/e$a;

    return-void
.end method

.method private constructor <init>(Lx2/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx2/e;->a:Lx2/f;

    new-instance p1, Lx2/d;

    invoke-direct {p1}, Lx2/d;-><init>()V

    iput-object p1, p0, Lx2/e;->b:Lx2/d;

    return-void
.end method

.method public synthetic constructor <init>(Lx2/f;Ly7/k;)V
    .locals 0

    invoke-direct {p0, p1}, Lx2/e;-><init>(Lx2/f;)V

    return-void
.end method

.method public static final a(Lx2/f;)Lx2/e;
    .locals 1

    sget-object v0, Lx2/e;->d:Lx2/e$a;

    invoke-virtual {v0, p0}, Lx2/e$a;->a(Lx2/f;)Lx2/e;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final b()Lx2/d;
    .locals 1

    iget-object v0, p0, Lx2/e;->b:Lx2/d;

    return-object v0
.end method

.method public final c()V
    .locals 3

    .prologue
    iget-object v0, p0, Lx2/e;->a:Lx2/f;

    invoke-interface {v0}, Landroidx/lifecycle/r;->u()Landroidx/lifecycle/k;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/lifecycle/k;->b()Landroidx/lifecycle/k$b;

    move-result-object v1

    sget-object v2, Landroidx/lifecycle/k$b;->D:Landroidx/lifecycle/k$b;

    if-ne v1, v2, :cond_0

    new-instance v1, Lx2/b;

    iget-object v2, p0, Lx2/e;->a:Lx2/f;

    invoke-direct {v1, v2}, Lx2/b;-><init>(Lx2/f;)V

    invoke-virtual {v0, v1}, Landroidx/lifecycle/k;->a(Landroidx/lifecycle/q;)V

    iget-object v1, p0, Lx2/e;->b:Lx2/d;

    invoke-virtual {v1, v0}, Lx2/d;->e(Landroidx/lifecycle/k;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lx2/e;->c:Z

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Restarter must be created only during owner\'s initialization stage"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final d(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    iget-boolean v0, p0, Lx2/e;->c:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lx2/e;->c()V

    :cond_0
    iget-object v0, p0, Lx2/e;->a:Lx2/f;

    invoke-interface {v0}, Landroidx/lifecycle/r;->u()Landroidx/lifecycle/k;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/lifecycle/k;->b()Landroidx/lifecycle/k$b;

    move-result-object v1

    sget-object v2, Landroidx/lifecycle/k$b;->F:Landroidx/lifecycle/k$b;

    invoke-virtual {v1, v2}, Landroidx/lifecycle/k$b;->g(Landroidx/lifecycle/k$b;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_1

    iget-object v0, p0, Lx2/e;->b:Lx2/d;

    invoke-virtual {v0, p1}, Lx2/d;->f(Landroid/os/Bundle;)V

    return-void

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "performRestore cannot be called when owner is "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Landroidx/lifecycle/k;->b()Landroidx/lifecycle/k$b;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final e(Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "outBundle"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lx2/e;->b:Lx2/d;

    invoke-virtual {v0, p1}, Lx2/d;->g(Landroid/os/Bundle;)V

    return-void
.end method
