.class public final Landroidx/compose/ui/platform/N1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Landroidx/compose/ui/platform/N1;

.field private static final b:Ljava/util/concurrent/atomic/AtomicReference;

.field public static final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/compose/ui/platform/N1;

    invoke-direct {v0}, Landroidx/compose/ui/platform/N1;-><init>()V

    sput-object v0, Landroidx/compose/ui/platform/N1;->a:Landroidx/compose/ui/platform/N1;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v1, Landroidx/compose/ui/platform/M1;->a:Landroidx/compose/ui/platform/M1$a;

    invoke-virtual {v1}, Landroidx/compose/ui/platform/M1$a;->c()Landroidx/compose/ui/platform/M1;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Landroidx/compose/ui/platform/N1;->b:Ljava/util/concurrent/atomic/AtomicReference;

    const/16 v0, 0x8

    sput v0, Landroidx/compose/ui/platform/N1;->c:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;)LV/U0;
    .locals 7

    sget-object v0, Landroidx/compose/ui/platform/N1;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/platform/M1;

    invoke-interface {v0, p1}, Landroidx/compose/ui/platform/M1;->a(Landroid/view/View;)LV/U0;

    move-result-object v0

    invoke-static {p1, v0}, Landroidx/compose/ui/platform/O1;->i(Landroid/view/View;LV/s;)V

    sget-object v1, LW8/t0;->C:LW8/t0;

    invoke-virtual {p1}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    move-result-object v2

    const-string v3, "windowRecomposer cleanup"

    invoke-static {v2, v3}, LX8/g;->b(Landroid/os/Handler;Ljava/lang/String;)LX8/f;

    move-result-object v2

    invoke-virtual {v2}, LX8/f;->B1()LX8/f;

    move-result-object v2

    new-instance v4, Landroidx/compose/ui/platform/N1$b;

    const/4 v3, 0x0

    invoke-direct {v4, v0, p1, v3}, Landroidx/compose/ui/platform/N1$b;-><init>(LV/U0;Landroid/view/View;Lm7/e;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    move-result-object v1

    new-instance v2, Landroidx/compose/ui/platform/N1$a;

    invoke-direct {v2, v1}, Landroidx/compose/ui/platform/N1$a;-><init>(LW8/z0;)V

    invoke-virtual {p1, v2}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    return-object v0
.end method
