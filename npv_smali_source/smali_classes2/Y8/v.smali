.class public LY8/v;
.super LY8/h;
.source "SourceFile"


# instance fields
.field private final O:I

.field private final P:LY8/d;


# direct methods
.method public constructor <init>(ILY8/d;Lx7/l;)V
    .locals 0

    .prologue
    invoke-direct {p0, p1, p3}, LY8/h;-><init>(ILx7/l;)V

    iput p1, p0, LY8/v;->O:I

    iput-object p2, p0, LY8/v;->P:LY8/d;

    sget-object p3, LY8/d;->C:LY8/d;

    if-eq p2, p3, :cond_1

    const/4 p2, 0x1

    if-lt p1, p2, :cond_0

    return-void

    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Buffered channel capacity must be at least 1, but "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " was specified"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "This implementation does not support suspension for senders, use "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-class p2, LY8/h;

    invoke-static {p2}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object p2

    invoke-interface {p2}, LF7/c;->c()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " instead"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method static synthetic p1(LY8/v;Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 2

    .prologue
    const/4 p2, 0x1

    invoke-direct {p0, p1, p2}, LY8/v;->r1(Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object p2

    instance-of v0, p2, LY8/n$a;

    if-eqz v0, :cond_1

    invoke-static {p2}, LY8/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    iget-object p2, p0, LY8/h;->D:Lx7/l;

    if-eqz p2, :cond_0

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p2, p1, v1, v0, v1}, Lb9/w;->c(Lx7/l;Ljava/lang/Object;Lb9/S;ILjava/lang/Object;)Lb9/S;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, LY8/h;->i0()Ljava/lang/Throwable;

    move-result-object p0

    invoke-static {p1, p0}, Li7/g;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    throw p1

    :cond_0
    invoke-virtual {p0}, LY8/h;->i0()Ljava/lang/Throwable;

    move-result-object p0

    throw p0

    :cond_1
    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method

.method private final q1(Ljava/lang/Object;Z)Ljava/lang/Object;
    .locals 2

    .prologue
    invoke-super {p0, p1}, LY8/h;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, LY8/n;->j(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    invoke-static {v0}, LY8/n;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    if-eqz p2, :cond_2

    iget-object p2, p0, LY8/h;->D:Lx7/l;

    if-eqz p2, :cond_2

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p2, p1, v1, v0, v1}, Lb9/w;->c(Lx7/l;Ljava/lang/Object;Lb9/S;ILjava/lang/Object;)Lb9/S;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    throw p1

    :cond_2
    :goto_0
    sget-object p1, LY8/n;->b:LY8/n$b;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LY8/n$b;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_3
    :goto_1
    return-object v0
.end method

.method private final r1(Ljava/lang/Object;Z)Ljava/lang/Object;
    .locals 2

    .prologue
    iget-object v0, p0, LY8/v;->P:LY8/d;

    sget-object v1, LY8/d;->E:LY8/d;

    if-ne v0, v1, :cond_0

    invoke-direct {p0, p1, p2}, LY8/v;->q1(Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, LY8/h;->e1(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_0
    return-object p1
.end method


# virtual methods
.method public h(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, LY8/v;->p1(LY8/v;Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, LY8/v;->r1(Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method protected x0()Z
    .locals 2

    .prologue
    iget-object v0, p0, LY8/v;->P:LY8/d;

    sget-object v1, LY8/d;->D:LY8/d;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
