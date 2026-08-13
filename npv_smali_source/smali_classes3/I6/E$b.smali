.class final LI6/E$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI6/S;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LI6/E;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field private final a:I

.field private final b:LC6/c;

.field private c:I

.field private d:LD6/b;


# direct methods
.method public constructor <init>(ILC6/c;)V
    .locals 1

    const-string v0, "client"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LI6/E$b;->a:I

    iput-object p2, p0, LI6/E$b;->b:LC6/c;

    return-void
.end method


# virtual methods
.method public a(LO6/d;Lm7/e;)Ljava/lang/Object;
    .locals 5

    .prologue
    instance-of v0, p2, LI6/E$b$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LI6/E$b$a;

    iget v1, v0, LI6/E$b$a;->I:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LI6/E$b$a;->I:I

    goto :goto_0

    :cond_0
    new-instance v0, LI6/E$b$a;

    invoke-direct {v0, p0, p2}, LI6/E$b$a;-><init>(LI6/E$b;Lm7/e;)V

    :goto_0
    iget-object p2, v0, LI6/E$b$a;->G:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LI6/E$b$a;->I:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, LI6/E$b$a;->F:Ljava/lang/Object;

    check-cast p1, LI6/E$b;

    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p2, p0, LI6/E$b;->d:LD6/b;

    if-eqz p2, :cond_3

    invoke-static {p2, v3, v4, v3}, LW8/O;->e(LW8/N;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_3
    iget p2, p0, LI6/E$b;->c:I

    iget v2, p0, LI6/E$b;->a:I

    if-ge p2, v2, :cond_7

    add-int/2addr p2, v4

    iput p2, p0, LI6/E$b;->c:I

    iget-object p2, p0, LI6/E$b;->b:LC6/c;

    invoke-virtual {p2}, LC6/c;->N()LO6/i;

    move-result-object p2

    invoke-virtual {p1}, LO6/d;->e()Ljava/lang/Object;

    move-result-object v2

    iput-object p0, v0, LI6/E$b$a;->F:Ljava/lang/Object;

    iput v4, v0, LI6/E$b$a;->I:I

    invoke-virtual {p2, p1, v2, v0}, La7/d;->d(Ljava/lang/Object;Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    return-object v1

    :cond_4
    move-object p1, p0

    :goto_1
    instance-of v0, p2, LD6/b;

    if-eqz v0, :cond_5

    move-object v3, p2

    check-cast v3, LD6/b;

    :cond_5
    if-eqz v3, :cond_6

    iput-object v3, p1, LI6/E$b;->d:LD6/b;

    return-object v3

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Failed to execute send pipeline. Expected [HttpClientCall], but received "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    new-instance p1, LI6/Q;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Max send count "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, LI6/E$b;->a:I

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " exceeded. Consider increasing the property maxSendCount if more is required."

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, LI6/Q;-><init>(Ljava/lang/String;)V

    throw p1
.end method
