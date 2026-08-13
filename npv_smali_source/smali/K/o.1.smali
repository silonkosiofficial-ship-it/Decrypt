.class public final LK/o;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/util/concurrent/atomic/AtomicReference;

.field private final b:LV/q0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, LK/o;->a:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v0, 0x0

    invoke-static {v0}, LV/J0;->a(F)LV/q0;

    move-result-object v0

    iput-object v0, p0, LK/o;->b:LV/q0;

    return-void
.end method

.method public static final synthetic a(LK/o;)Ljava/util/concurrent/atomic/AtomicReference;
    .locals 0

    iget-object p0, p0, LK/o;->a:Ljava/util/concurrent/atomic/AtomicReference;

    return-object p0
.end method

.method public static final synthetic b(LK/o;F)V
    .locals 0

    invoke-direct {p0, p1}, LK/o;->d(F)V

    return-void
.end method

.method private final d(F)V
    .locals 1

    iget-object v0, p0, LK/o;->b:LV/q0;

    invoke-interface {v0, p1}, LV/q0;->h(F)V

    return-void
.end method


# virtual methods
.method public final c()F
    .locals 1

    iget-object v0, p0, LK/o;->b:LV/q0;

    invoke-interface {v0}, LV/S;->b()F

    move-result v0

    return v0
.end method

.method public final e(Lm7/e;)Ljava/lang/Object;
    .locals 2

    .prologue
    new-instance v0, LK/o$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LK/o$a;-><init>(LK/o;Lm7/e;)V

    invoke-static {v0, p1}, LW8/O;->f(Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
