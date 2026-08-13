.class public final Lu/d0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu/d0$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/concurrent/atomic/AtomicReference;

.field private final b:Lf9/a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lu/d0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v0, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v2, v1}, Lf9/g;->b(ZILjava/lang/Object;)Lf9/a;

    move-result-object v0

    iput-object v0, p0, Lu/d0;->b:Lf9/a;

    return-void
.end method

.method public static final synthetic a(Lu/d0;)Ljava/util/concurrent/atomic/AtomicReference;
    .locals 0

    iget-object p0, p0, Lu/d0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    return-object p0
.end method

.method public static final synthetic b(Lu/d0;)Lf9/a;
    .locals 0

    iget-object p0, p0, Lu/d0;->b:Lf9/a;

    return-object p0
.end method

.method public static final synthetic c(Lu/d0;Lu/d0$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lu/d0;->f(Lu/d0$a;)V

    return-void
.end method

.method public static synthetic e(Lu/d0;Lu/a0;Lx7/l;Lm7/e;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .prologue
    and-int/lit8 p4, p4, 0x1

    if-eqz p4, :cond_0

    sget-object p1, Lu/a0;->C:Lu/a0;

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lu/d0;->d(Lu/a0;Lx7/l;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final f(Lu/d0$a;)V
    .locals 2

    .prologue
    :cond_0
    iget-object v0, p0, Lu/d0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu/d0$a;

    if-eqz v0, :cond_2

    invoke-virtual {p1, v0}, Lu/d0$a;->a(Lu/d0$a;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/util/concurrent/CancellationException;

    const-string v0, "Current mutation had a higher priority"

    invoke-direct {p1, v0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_0
    iget-object v1, p0, Lu/d0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v1, v0, p1}, Lu/c0;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lu/d0$a;->b()V

    :cond_3
    return-void
.end method


# virtual methods
.method public final d(Lu/a0;Lx7/l;Lm7/e;)Ljava/lang/Object;
    .locals 2

    new-instance v0, Lu/d0$b;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p0, p2, v1}, Lu/d0$b;-><init>(Lu/a0;Lu/d0;Lx7/l;Lm7/e;)V

    invoke-static {v0, p3}, LW8/O;->f(Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
