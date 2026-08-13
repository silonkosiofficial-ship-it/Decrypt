.class final Landroidx/compose/ui/platform/X$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/ui/platform/X;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Landroidx/compose/ui/platform/X$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/ui/platform/X$a;

    invoke-direct {v0}, Landroidx/compose/ui/platform/X$a;-><init>()V

    sput-object v0, Landroidx/compose/ui/platform/X$a;->D:Landroidx/compose/ui/platform/X$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lm7/i;
    .locals 4

    .prologue
    new-instance v0, Landroidx/compose/ui/platform/X;

    invoke-static {}, Landroidx/compose/ui/platform/Y;->a()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    move-result-object v1

    goto :goto_0

    :cond_0
    invoke-static {}, LW8/d0;->c()LW8/J0;

    move-result-object v1

    new-instance v3, Landroidx/compose/ui/platform/X$a$a;

    invoke-direct {v3, v2}, Landroidx/compose/ui/platform/X$a$a;-><init>(Lm7/e;)V

    invoke-static {v1, v3}, LW8/g;->e(Lm7/i;Lx7/p;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/Choreographer;

    :goto_0
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-static {v3}, Landroidx/core/os/h;->a(Landroid/os/Looper;)Landroid/os/Handler;

    move-result-object v3

    invoke-direct {v0, v1, v3, v2}, Landroidx/compose/ui/platform/X;-><init>(Landroid/view/Choreographer;Landroid/os/Handler;Ly7/k;)V

    invoke-virtual {v0}, Landroidx/compose/ui/platform/X;->I1()LV/j0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lm7/a;->o0(Lm7/i;)Lm7/i;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/platform/X$a;->a()Lm7/i;

    move-result-object v0

    return-object v0
.end method
