.class final LZ8/c;
.super La9/e;
.source "SourceFile"


# static fields
.field private static final synthetic H:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field private final F:LY8/B;

.field private final G:Z

.field private volatile synthetic consumed$volatile:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, LZ8/c;

    const-string v1, "consumed$volatile"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, LZ8/c;->H:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method

.method public constructor <init>(LY8/B;ZLm7/i;ILY8/d;)V
    .locals 0

    invoke-direct {p0, p3, p4, p5}, La9/e;-><init>(Lm7/i;ILY8/d;)V

    iput-object p1, p0, LZ8/c;->F:LY8/B;

    iput-boolean p2, p0, LZ8/c;->G:Z

    const/4 p1, 0x0

    iput p1, p0, LZ8/c;->consumed$volatile:I

    return-void
.end method

.method public synthetic constructor <init>(LY8/B;ZLm7/i;ILY8/d;ILy7/k;)V
    .locals 6

    .prologue
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_0

    sget-object p3, Lm7/j;->C:Lm7/j;

    :cond_0
    move-object v3, p3

    and-int/lit8 p3, p6, 0x8

    if-eqz p3, :cond_1

    const/4 p4, -0x3

    :cond_1
    move v4, p4

    and-int/lit8 p3, p6, 0x10

    if-eqz p3, :cond_2

    sget-object p5, LY8/d;->C:LY8/d;

    :cond_2
    move-object v5, p5

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    invoke-direct/range {v0 .. v5}, LZ8/c;-><init>(LY8/B;ZLm7/i;ILY8/d;)V

    return-void
.end method

.method private static final synthetic q()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;
    .locals 1

    sget-object v0, LZ8/c;->H:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-object v0
.end method

.method private final r()V
    .locals 2

    .prologue
    iget-boolean v0, p0, LZ8/c;->G:Z

    if-eqz v0, :cond_1

    invoke-static {}, LZ8/c;->q()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, p0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->getAndSet(Ljava/lang/Object;I)I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "ReceiveChannel.consumeAsFlow can be collected just once"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public b(LZ8/g;Lm7/e;)Ljava/lang/Object;
    .locals 2

    .prologue
    iget v0, p0, La9/e;->D:I

    const/4 v1, -0x3

    if-ne v0, v1, :cond_1

    invoke-direct {p0}, LZ8/c;->r()V

    iget-object v0, p0, LZ8/c;->F:LY8/B;

    iget-boolean v1, p0, LZ8/c;->G:Z

    invoke-static {p1, v0, v1, p2}, LZ8/j;->a(LZ8/g;LY8/B;ZLm7/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :cond_1
    invoke-super {p0, p1, p2}, La9/e;->b(LZ8/g;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_2

    return-object p1

    :cond_2
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method protected e()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "channel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LZ8/c;->F:LY8/B;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected h(LY8/z;Lm7/e;)Ljava/lang/Object;
    .locals 2

    .prologue
    new-instance v0, La9/z;

    invoke-direct {v0, p1}, La9/z;-><init>(LY8/C;)V

    iget-object p1, p0, LZ8/c;->F:LY8/B;

    iget-boolean v1, p0, LZ8/c;->G:Z

    invoke-static {v0, p1, v1, p2}, LZ8/j;->a(LZ8/g;LY8/B;ZLm7/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method protected i(Lm7/i;ILY8/d;)La9/e;
    .locals 7

    new-instance v6, LZ8/c;

    iget-object v1, p0, LZ8/c;->F:LY8/B;

    iget-boolean v2, p0, LZ8/c;->G:Z

    move-object v0, v6

    move-object v3, p1

    move v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, LZ8/c;-><init>(LY8/B;ZLm7/i;ILY8/d;)V

    return-object v6
.end method

.method public j()LZ8/f;
    .locals 9

    new-instance v8, LZ8/c;

    iget-object v1, p0, LZ8/c;->F:LY8/B;

    iget-boolean v2, p0, LZ8/c;->G:Z

    const/16 v6, 0x1c

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, LZ8/c;-><init>(LY8/B;ZLm7/i;ILY8/d;ILy7/k;)V

    return-object v8
.end method

.method public o(LW8/N;)LY8/B;
    .locals 2

    .prologue
    invoke-direct {p0}, LZ8/c;->r()V

    iget v0, p0, La9/e;->D:I

    const/4 v1, -0x3

    if-ne v0, v1, :cond_0

    iget-object p1, p0, LZ8/c;->F:LY8/B;

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, La9/e;->o(LW8/N;)LY8/B;

    move-result-object p1

    :goto_0
    return-object p1
.end method
