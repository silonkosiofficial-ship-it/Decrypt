.class final Landroidx/compose/ui/viewinterop/c$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/ui/viewinterop/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Landroidx/compose/ui/viewinterop/c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/ui/viewinterop/c$a;

    invoke-direct {v0}, Landroidx/compose/ui/viewinterop/c$a;-><init>()V

    sput-object v0, Landroidx/compose/ui/viewinterop/c$a;->D:Landroidx/compose/ui/viewinterop/c$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lx7/a;)V
    .locals 0

    invoke-static {p0}, Landroidx/compose/ui/viewinterop/c$a;->f(Lx7/a;)V

    return-void
.end method

.method private static final f(Lx7/a;)V
    .locals 0

    invoke-interface {p0}, Lx7/a;->b()Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final e(Landroidx/compose/ui/viewinterop/c;)V
    .locals 2

    invoke-virtual {p1}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    move-result-object v0

    invoke-static {p1}, Landroidx/compose/ui/viewinterop/c;->g(Landroidx/compose/ui/viewinterop/c;)Lx7/a;

    move-result-object p1

    new-instance v1, Landroidx/compose/ui/viewinterop/b;

    invoke-direct {v1, p1}, Landroidx/compose/ui/viewinterop/b;-><init>(Lx7/a;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/viewinterop/c;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/viewinterop/c$a;->e(Landroidx/compose/ui/viewinterop/c;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
