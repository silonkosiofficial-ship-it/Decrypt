.class public final Lv/N;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv/N$a;
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

    iput-object v0, p0, Lv/N;->a:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v0, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v2, v1}, Lf9/g;->b(ZILjava/lang/Object;)Lf9/a;

    move-result-object v0

    iput-object v0, p0, Lv/N;->b:Lf9/a;

    return-void
.end method

.method public static final synthetic a(Lv/N;)Ljava/util/concurrent/atomic/AtomicReference;
    .locals 0

    iget-object p0, p0, Lv/N;->a:Ljava/util/concurrent/atomic/AtomicReference;

    return-object p0
.end method

.method public static final synthetic b(Lv/N;)Lf9/a;
    .locals 0

    iget-object p0, p0, Lv/N;->b:Lf9/a;

    return-object p0
.end method

.method public static final synthetic c(Lv/N;Lv/N$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lv/N;->f(Lv/N$a;)V

    return-void
.end method

.method private final f(Lv/N$a;)V
    .locals 2

    .prologue
    :cond_0
    iget-object v0, p0, Lv/N;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv/N$a;

    if-eqz v0, :cond_2

    invoke-virtual {p1, v0}, Lv/N$a;->a(Lv/N$a;)Z

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
    iget-object v1, p0, Lv/N;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v1, v0, p1}, Lu/c0;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lv/N$a;->b()V

    :cond_3
    return-void
.end method


# virtual methods
.method public final d(Lv/L;Lx7/l;Lm7/e;)Ljava/lang/Object;
    .locals 2

    new-instance v0, Lv/N$b;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p0, p2, v1}, Lv/N$b;-><init>(Lv/L;Lv/N;Lx7/l;Lm7/e;)V

    invoke-static {v0, p3}, LW8/O;->f(Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final e(Ljava/lang/Object;Lv/L;Lx7/p;Lm7/e;)Ljava/lang/Object;
    .locals 7

    new-instance v6, Lv/N$c;

    const/4 v5, 0x0

    move-object v0, v6

    move-object v1, p2

    move-object v2, p0

    move-object v3, p3

    move-object v4, p1

    invoke-direct/range {v0 .. v5}, Lv/N$c;-><init>(Lv/L;Lv/N;Lx7/p;Ljava/lang/Object;Lm7/e;)V

    invoke-static {v6, p4}, LW8/O;->f(Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
