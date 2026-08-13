.class public LD6/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LW8/N;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LD6/b$a;
    }
.end annotation


# static fields
.field public static final G:LD6/b$a;

.field private static final synthetic H:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

.field private static final I:LW6/a;


# instance fields
.field private final C:LC6/c;

.field protected D:LO6/b;

.field protected E:LQ6/c;

.field private final F:Z

.field private volatile synthetic received:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    new-instance v0, LD6/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LD6/b$a;-><init>(Ly7/k;)V

    sput-object v0, LD6/b;->G:LD6/b$a;

    const-class v0, Ljava/lang/Object;

    invoke-static {v0}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v2

    :try_start_0
    invoke-static {v0}, Ly7/P;->p(Ljava/lang/Class;)LF7/o;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    new-instance v0, Lb7/a;

    invoke-direct {v0, v2, v1}, Lb7/a;-><init>(LF7/c;LF7/o;)V

    new-instance v1, LW6/a;

    const-string v2, "CustomResponse"

    invoke-direct {v1, v2, v0}, LW6/a;-><init>(Ljava/lang/String;Lb7/a;)V

    sput-object v1, LD6/b;->I:LW6/a;

    const-class v0, LD6/b;

    const-string v1, "received"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, LD6/b;->H:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method

.method public constructor <init>(LC6/c;)V
    .locals 1

    const-string v0, "client"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LD6/b;->C:LC6/c;

    const/4 p1, 0x0

    iput p1, p0, LD6/b;->received:I

    return-void
.end method

.method public constructor <init>(LC6/c;LO6/e;LO6/h;)V
    .locals 1

    .prologue
    const-string v0, "client"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requestData"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "responseData"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LD6/b;-><init>(LC6/c;)V

    new-instance p1, LO6/a;

    invoke-direct {p1, p0, p2}, LO6/a;-><init>(LD6/b;LO6/e;)V

    invoke-virtual {p0, p1}, LD6/b;->h(LO6/b;)V

    new-instance p1, LQ6/a;

    invoke-direct {p1, p0, p3}, LQ6/a;-><init>(LD6/b;LO6/h;)V

    invoke-virtual {p0, p1}, LD6/b;->i(LQ6/c;)V

    invoke-virtual {p3}, LO6/h;->a()Ljava/lang/Object;

    move-result-object p1

    instance-of p1, p1, Lio/ktor/utils/io/d;

    if-nez p1, :cond_0

    invoke-virtual {p0}, LD6/b;->x0()LW6/b;

    move-result-object p1

    sget-object p2, LD6/b;->I:LW6/a;

    invoke-virtual {p3}, LO6/h;->a()Ljava/lang/Object;

    move-result-object p3

    invoke-interface {p1, p2, p3}, LW6/b;->f(LW6/a;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method static synthetic g(LD6/b;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0}, LD6/b;->e()LQ6/c;

    move-result-object p0

    invoke-virtual {p0}, LQ6/c;->b()Lio/ktor/utils/io/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lb7/a;Lm7/e;)Ljava/lang/Object;
    .locals 6

    .prologue
    instance-of v0, p2, LD6/b$b;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LD6/b$b;

    iget v1, v0, LD6/b$b;->J:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LD6/b$b;->J:I

    goto :goto_0

    :cond_0
    new-instance v0, LD6/b$b;

    invoke-direct {v0, p0, p2}, LD6/b$b;-><init>(LD6/b;Lm7/e;)V

    :goto_0
    iget-object p2, v0, LD6/b$b;->H:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LD6/b$b;->J:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, LD6/b$b;->G:Ljava/lang/Object;

    check-cast p1, Lb7/a;

    iget-object v0, v0, LD6/b$b;->F:Ljava/lang/Object;

    check-cast v0, LD6/b;

    :try_start_0
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_3

    :catchall_0
    move-exception p1

    goto/16 :goto_6

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, LD6/b$b;->G:Ljava/lang/Object;

    check-cast p1, Lb7/a;

    iget-object v2, v0, LD6/b$b;->F:Ljava/lang/Object;

    check-cast v2, LD6/b;

    :try_start_1
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p1

    move-object v0, v2

    goto/16 :goto_6

    :cond_3
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    :try_start_2
    invoke-virtual {p0}, LD6/b;->e()LQ6/c;

    move-result-object p2

    invoke-virtual {p1}, Lb7/a;->a()LF7/c;

    move-result-object v2

    invoke-static {p2, v2}, Lb7/b;->a(Ljava/lang/Object;LF7/c;)Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-virtual {p0}, LD6/b;->e()LQ6/c;

    move-result-object p1

    return-object p1

    :catchall_2
    move-exception p1

    move-object v0, p0

    goto/16 :goto_6

    :cond_4
    invoke-virtual {p0}, LD6/b;->b()Z

    move-result p2

    if-nez p2, :cond_6

    invoke-virtual {p0}, LD6/b;->e()LQ6/c;

    move-result-object p2

    invoke-static {p2}, LI6/l;->f(LQ6/c;)Z

    move-result p2

    if-nez p2, :cond_6

    sget-object p2, LD6/b;->H:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const/4 v2, 0x0

    invoke-virtual {p2, p0, v2, v4}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result p2

    if-eqz p2, :cond_5

    goto :goto_1

    :cond_5
    new-instance p1, LD6/a;

    invoke-direct {p1, p0}, LD6/a;-><init>(LD6/b;)V

    throw p1

    :cond_6
    :goto_1
    invoke-virtual {p0}, LD6/b;->x0()LW6/b;

    move-result-object p2

    sget-object v2, LD6/b;->I:LW6/a;

    invoke-interface {p2, v2}, LW6/b;->c(LW6/a;)Ljava/lang/Object;

    move-result-object p2

    if-nez p2, :cond_7

    iput-object p0, v0, LD6/b$b;->F:Ljava/lang/Object;

    iput-object p1, v0, LD6/b$b;->G:Ljava/lang/Object;

    iput v4, v0, LD6/b$b;->J:I

    invoke-virtual {p0, v0}, LD6/b;->f(Lm7/e;)Ljava/lang/Object;

    move-result-object p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-ne p2, v1, :cond_7

    return-object v1

    :cond_7
    move-object v2, p0

    :goto_2
    :try_start_3
    new-instance v5, LQ6/d;

    invoke-direct {v5, p1, p2}, LQ6/d;-><init>(Lb7/a;Ljava/lang/Object;)V

    iget-object p2, v2, LD6/b;->C:LC6/c;

    invoke-virtual {p2}, LC6/c;->H()LQ6/f;

    move-result-object p2

    iput-object v2, v0, LD6/b$b;->F:Ljava/lang/Object;

    iput-object p1, v0, LD6/b$b;->G:Ljava/lang/Object;

    iput v3, v0, LD6/b$b;->J:I

    invoke-virtual {p2, v2, v5, v0}, La7/d;->d(Ljava/lang/Object;Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-ne p2, v1, :cond_8

    return-object v1

    :cond_8
    move-object v0, v2

    :goto_3
    :try_start_4
    check-cast p2, LQ6/d;

    invoke-virtual {p2}, LQ6/d;->c()Ljava/lang/Object;

    move-result-object p2

    sget-object v1, LU6/a;->a:LU6/a;

    invoke-static {p2, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    xor-int/2addr v1, v4

    if-eqz v1, :cond_9

    goto :goto_4

    :cond_9
    const/4 p2, 0x0

    :goto_4
    if-eqz p2, :cond_b

    invoke-virtual {p1}, Lb7/a;->a()LF7/c;

    move-result-object v1

    invoke-static {p2, v1}, Lb7/b;->a(Ljava/lang/Object;LF7/c;)Z

    move-result v1

    if-eqz v1, :cond_a

    goto :goto_5

    :cond_a
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-static {p2}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object p2

    invoke-virtual {p1}, Lb7/a;->a()LF7/c;

    move-result-object p1

    new-instance v1, LD6/c;

    invoke-virtual {v0}, LD6/b;->e()LQ6/c;

    move-result-object v2

    invoke-direct {v1, v2, p2, p1}, LD6/c;-><init>(LQ6/c;LF7/c;LF7/c;)V

    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :cond_b
    :goto_5
    return-object p2

    :goto_6
    invoke-virtual {v0}, LD6/b;->e()LQ6/c;

    move-result-object p2

    const-string v0, "Receive failed"

    invoke-static {p2, v0, p1}, LW8/O;->c(LW8/N;Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1
.end method

.method protected b()Z
    .locals 1

    iget-boolean v0, p0, LD6/b;->F:Z

    return v0
.end method

.method public final c()LC6/c;
    .locals 1

    iget-object v0, p0, LD6/b;->C:LC6/c;

    return-object v0
.end method

.method public final d()LO6/b;
    .locals 1

    .prologue
    iget-object v0, p0, LD6/b;->D:LO6/b;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "request"

    invoke-static {v0}, Ly7/t;->p(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final e()LQ6/c;
    .locals 1

    .prologue
    iget-object v0, p0, LD6/b;->E:LQ6/c;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "response"

    invoke-static {v0}, Ly7/t;->p(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method protected f(Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, LD6/b;->g(LD6/b;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getCoroutineContext()Lm7/i;
    .locals 1

    invoke-virtual {p0}, LD6/b;->e()LQ6/c;

    move-result-object v0

    invoke-interface {v0}, LW8/N;->getCoroutineContext()Lm7/i;

    move-result-object v0

    return-object v0
.end method

.method protected final h(LO6/b;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LD6/b;->D:LO6/b;

    return-void
.end method

.method protected final i(LQ6/c;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LD6/b;->E:LQ6/c;

    return-void
.end method

.method public final j(LQ6/c;)V
    .locals 1

    const-string v0, "response"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LD6/b;->i(LQ6/c;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "HttpClientCall["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LD6/b;->d()LO6/b;

    move-result-object v1

    invoke-interface {v1}, LO6/b;->r()LT6/g0;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LD6/b;->e()LQ6/c;

    move-result-object v1

    invoke-virtual {v1}, LQ6/c;->e()LT6/C;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final x0()LW6/b;
    .locals 1

    invoke-virtual {p0}, LD6/b;->d()LO6/b;

    move-result-object v0

    invoke-interface {v0}, LO6/b;->x0()LW6/b;

    move-result-object v0

    return-object v0
.end method
