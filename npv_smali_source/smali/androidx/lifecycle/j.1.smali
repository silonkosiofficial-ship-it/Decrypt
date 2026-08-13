.class public final Landroidx/lifecycle/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/lifecycle/j$a;
    }
.end annotation


# static fields
.field public static final a:Landroidx/lifecycle/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/lifecycle/j;

    invoke-direct {v0}, Landroidx/lifecycle/j;-><init>()V

    sput-object v0, Landroidx/lifecycle/j;->a:Landroidx/lifecycle/j;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(Landroidx/lifecycle/T;Lx2/d;Landroidx/lifecycle/k;)V
    .locals 1

    .prologue
    const-string v0, "viewModel"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "registry"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lifecycle"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "androidx.lifecycle.savedstate.vm.tag"

    invoke-virtual {p0, v0}, Landroidx/lifecycle/T;->f(Ljava/lang/String;)Ljava/lang/AutoCloseable;

    move-result-object p0

    check-cast p0, Landroidx/lifecycle/K;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroidx/lifecycle/K;->s()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p1, p2}, Landroidx/lifecycle/K;->a(Lx2/d;Landroidx/lifecycle/k;)V

    sget-object p0, Landroidx/lifecycle/j;->a:Landroidx/lifecycle/j;

    invoke-direct {p0, p1, p2}, Landroidx/lifecycle/j;->c(Lx2/d;Landroidx/lifecycle/k;)V

    :cond_0
    return-void
.end method

.method public static final b(Lx2/d;Landroidx/lifecycle/k;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/lifecycle/K;
    .locals 2

    const-string v0, "registry"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lifecycle"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p0, p2}, Lx2/d;->b(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    sget-object v1, Landroidx/lifecycle/I;->f:Landroidx/lifecycle/I$a;

    invoke-virtual {v1, v0, p3}, Landroidx/lifecycle/I$a;->a(Landroid/os/Bundle;Landroid/os/Bundle;)Landroidx/lifecycle/I;

    move-result-object p3

    new-instance v0, Landroidx/lifecycle/K;

    invoke-direct {v0, p2, p3}, Landroidx/lifecycle/K;-><init>(Ljava/lang/String;Landroidx/lifecycle/I;)V

    invoke-virtual {v0, p0, p1}, Landroidx/lifecycle/K;->a(Lx2/d;Landroidx/lifecycle/k;)V

    sget-object p2, Landroidx/lifecycle/j;->a:Landroidx/lifecycle/j;

    invoke-direct {p2, p0, p1}, Landroidx/lifecycle/j;->c(Lx2/d;Landroidx/lifecycle/k;)V

    return-object v0
.end method

.method private final c(Lx2/d;Landroidx/lifecycle/k;)V
    .locals 2

    .prologue
    invoke-virtual {p2}, Landroidx/lifecycle/k;->b()Landroidx/lifecycle/k$b;

    move-result-object v0

    sget-object v1, Landroidx/lifecycle/k$b;->D:Landroidx/lifecycle/k$b;

    if-eq v0, v1, :cond_1

    sget-object v1, Landroidx/lifecycle/k$b;->F:Landroidx/lifecycle/k$b;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/k$b;->g(Landroidx/lifecycle/k$b;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Landroidx/lifecycle/j$b;

    invoke-direct {v0, p2, p1}, Landroidx/lifecycle/j$b;-><init>(Landroidx/lifecycle/k;Lx2/d;)V

    invoke-virtual {p2, v0}, Landroidx/lifecycle/k;->a(Landroidx/lifecycle/q;)V

    goto :goto_1

    :cond_1
    :goto_0
    const-class p2, Landroidx/lifecycle/j$a;

    invoke-virtual {p1, p2}, Lx2/d;->i(Ljava/lang/Class;)V

    :goto_1
    return-void
.end method
