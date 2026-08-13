.class public final Landroidx/compose/ui/platform/y0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Landroidx/compose/ui/platform/y0;

.field private static final b:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private static final c:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/compose/ui/platform/y0;

    invoke-direct {v0}, Landroidx/compose/ui/platform/y0;-><init>()V

    sput-object v0, Landroidx/compose/ui/platform/y0;->a:Landroidx/compose/ui/platform/y0;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    sput-object v0, Landroidx/compose/ui/platform/y0;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    sput-object v0, Landroidx/compose/ui/platform/y0;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/16 v0, 0x8

    sput v0, Landroidx/compose/ui/platform/y0;->d:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic a()Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 1

    sget-object v0, Landroidx/compose/ui/platform/y0;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object v0
.end method


# virtual methods
.method public final b()V
    .locals 9

    .prologue
    sget-object v0, Landroidx/compose/ui/platform/y0;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x6

    const/4 v1, 0x0

    invoke-static {v2, v1, v1, v0, v1}, LY8/m;->b(ILY8/d;Lx7/l;ILjava/lang/Object;)LY8/j;

    move-result-object v0

    sget-object v2, Landroidx/compose/ui/platform/X;->O:Landroidx/compose/ui/platform/X$c;

    invoke-virtual {v2}, Landroidx/compose/ui/platform/X$c;->b()Lm7/i;

    move-result-object v2

    invoke-static {v2}, LW8/O;->a(Lm7/i;)LW8/N;

    move-result-object v3

    new-instance v6, Landroidx/compose/ui/platform/y0$a;

    invoke-direct {v6, v0, v1}, Landroidx/compose/ui/platform/y0$a;-><init>(LY8/j;Lm7/e;)V

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    sget-object v1, Lf0/k;->e:Lf0/k$a;

    new-instance v2, Landroidx/compose/ui/platform/y0$b;

    invoke-direct {v2, v0}, Landroidx/compose/ui/platform/y0$b;-><init>(LY8/j;)V

    invoke-virtual {v1, v2}, Lf0/k$a;->k(Lx7/l;)Lf0/f;

    :cond_0
    return-void
.end method
