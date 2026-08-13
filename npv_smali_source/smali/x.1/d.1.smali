.class public final Lx/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:I


# instance fields
.field private final a:LX/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, LX/b;->F:I

    sput v0, Lx/d;->b:I

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LX/b;

    const/16 v1, 0x10

    new-array v1, v1, [Lx/h$a;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LX/b;-><init>([Ljava/lang/Object;I)V

    iput-object v0, p0, Lx/d;->a:LX/b;

    return-void
.end method

.method public static final synthetic a(Lx/d;)LX/b;
    .locals 0

    iget-object p0, p0, Lx/d;->a:LX/b;

    return-object p0
.end method


# virtual methods
.method public final b(Ljava/lang/Throwable;)V
    .locals 6

    .prologue
    iget-object v0, p0, Lx/d;->a:LX/b;

    invoke-virtual {v0}, LX/b;->t()I

    move-result v1

    new-array v2, v1, [LW8/l;

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v1, :cond_0

    invoke-virtual {v0}, LX/b;->s()[Ljava/lang/Object;

    move-result-object v5

    aget-object v5, v5, v4

    check-cast v5, Lx/h$a;

    invoke-virtual {v5}, Lx/h$a;->a()LW8/l;

    move-result-object v5

    aput-object v5, v2, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    :goto_1
    if-ge v3, v1, :cond_1

    aget-object v0, v2, v3

    invoke-interface {v0, p1}, LW8/l;->k(Ljava/lang/Throwable;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    iget-object p1, p0, Lx/d;->a:LX/b;

    invoke-virtual {p1}, LX/b;->w()Z

    move-result p1

    if-eqz p1, :cond_2

    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "uncancelled requests present"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final c(Lx/h$a;)Z
    .locals 8

    .prologue
    const/4 v0, 0x1

    invoke-virtual {p1}, Lx/h$a;->b()Lx7/a;

    move-result-object v1

    invoke-interface {v1}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln0/i;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    invoke-virtual {p1}, Lx/h$a;->a()LW8/l;

    move-result-object p1

    sget-object v0, Li7/w;->D:Li7/w$a;

    sget-object v0, Li7/M;->a:Li7/M;

    invoke-static {v0}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Lm7/e;->t(Ljava/lang/Object;)V

    return v2

    :cond_0
    invoke-virtual {p1}, Lx/h$a;->a()LW8/l;

    move-result-object v3

    new-instance v4, Lx/d$a;

    invoke-direct {v4, p0, p1}, Lx/d$a;-><init>(Lx/d;Lx/h$a;)V

    invoke-interface {v3, v4}, LW8/l;->G(Lx7/l;)V

    iget-object v3, p0, Lx/d;->a:LX/b;

    new-instance v4, LE7/i;

    invoke-virtual {v3}, LX/b;->t()I

    move-result v3

    sub-int/2addr v3, v0

    invoke-direct {v4, v2, v3}, LE7/i;-><init>(II)V

    invoke-virtual {v4}, LE7/g;->f()I

    move-result v3

    invoke-virtual {v4}, LE7/g;->g()I

    move-result v4

    if-gt v3, v4, :cond_4

    :goto_0
    iget-object v5, p0, Lx/d;->a:LX/b;

    invoke-virtual {v5}, LX/b;->s()[Ljava/lang/Object;

    move-result-object v5

    aget-object v5, v5, v4

    check-cast v5, Lx/h$a;

    invoke-virtual {v5}, Lx/h$a;->b()Lx7/a;

    move-result-object v5

    invoke-interface {v5}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ln0/i;

    if-nez v5, :cond_1

    goto :goto_2

    :cond_1
    invoke-virtual {v1, v5}, Ln0/i;->p(Ln0/i;)Ln0/i;

    move-result-object v6

    invoke-static {v6, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    iget-object v1, p0, Lx/d;->a:LX/b;

    add-int/2addr v4, v0

    invoke-virtual {v1, v4, p1}, LX/b;->a(ILjava/lang/Object;)V

    return v0

    :cond_2
    invoke-static {v6, v5}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    new-instance v5, Ljava/util/concurrent/CancellationException;

    const-string v6, "bringIntoView call interrupted by a newer, non-overlapping call"

    invoke-direct {v5, v6}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    iget-object v6, p0, Lx/d;->a:LX/b;

    invoke-virtual {v6}, LX/b;->t()I

    move-result v6

    sub-int/2addr v6, v0

    if-gt v6, v4, :cond_3

    :goto_1
    iget-object v7, p0, Lx/d;->a:LX/b;

    invoke-virtual {v7}, LX/b;->s()[Ljava/lang/Object;

    move-result-object v7

    aget-object v7, v7, v4

    check-cast v7, Lx/h$a;

    invoke-virtual {v7}, Lx/h$a;->a()LW8/l;

    move-result-object v7

    invoke-interface {v7, v5}, LW8/l;->k(Ljava/lang/Throwable;)Z

    if-eq v6, v4, :cond_3

    add-int/2addr v6, v0

    goto :goto_1

    :cond_3
    :goto_2
    if-eq v4, v3, :cond_4

    add-int/lit8 v4, v4, -0x1

    goto :goto_0

    :cond_4
    iget-object v1, p0, Lx/d;->a:LX/b;

    invoke-virtual {v1, v2, p1}, LX/b;->a(ILjava/lang/Object;)V

    return v0
.end method

.method public final d()V
    .locals 4

    .prologue
    iget-object v0, p0, Lx/d;->a:LX/b;

    new-instance v1, LE7/i;

    invoke-virtual {v0}, LX/b;->t()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v2, 0x0

    invoke-direct {v1, v2, v0}, LE7/i;-><init>(II)V

    invoke-virtual {v1}, LE7/g;->f()I

    move-result v0

    invoke-virtual {v1}, LE7/g;->g()I

    move-result v1

    if-gt v0, v1, :cond_0

    :goto_0
    iget-object v2, p0, Lx/d;->a:LX/b;

    invoke-virtual {v2}, LX/b;->s()[Ljava/lang/Object;

    move-result-object v2

    aget-object v2, v2, v0

    check-cast v2, Lx/h$a;

    invoke-virtual {v2}, Lx/h$a;->a()LW8/l;

    move-result-object v2

    sget-object v3, Li7/M;->a:Li7/M;

    invoke-static {v3}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, v3}, Lm7/e;->t(Ljava/lang/Object;)V

    if-eq v0, v1, :cond_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lx/d;->a:LX/b;

    invoke-virtual {v0}, LX/b;->j()V

    return-void
.end method
