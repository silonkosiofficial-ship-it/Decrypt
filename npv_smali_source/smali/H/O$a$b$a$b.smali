.class final LH/O$a$b$a$b;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH/O$a$b$a;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:Ljava/lang/Object;

.field H:I

.field final synthetic I:LV/w0;

.field final synthetic J:Z

.field final synthetic K:Lz/l;


# direct methods
.method constructor <init>(LV/w0;ZLz/l;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LH/O$a$b$a$b;->I:LV/w0;

    iput-boolean p2, p0, LH/O$a$b$a$b;->J:Z

    iput-object p3, p0, LH/O$a$b$a$b;->K:Lz/l;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LH/O$a$b$a$b;->H:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, LH/O$a$b$a$b;->G:Ljava/lang/Object;

    check-cast v0, LV/w0;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LH/O$a$b$a$b;->I:LV/w0;

    invoke-interface {p1}, LV/w0;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lz/n$b;

    if-eqz p1, :cond_5

    iget-boolean v1, p0, LH/O$a$b$a$b;->J:Z

    iget-object v3, p0, LH/O$a$b$a$b;->K:Lz/l;

    iget-object v4, p0, LH/O$a$b$a$b;->I:LV/w0;

    if-eqz v1, :cond_2

    new-instance v1, Lz/n$c;

    invoke-direct {v1, p1}, Lz/n$c;-><init>(Lz/n$b;)V

    goto :goto_0

    :cond_2
    new-instance v1, Lz/n$a;

    invoke-direct {v1, p1}, Lz/n$a;-><init>(Lz/n$b;)V

    :goto_0
    if-eqz v3, :cond_4

    iput-object v4, p0, LH/O$a$b$a$b;->G:Ljava/lang/Object;

    iput v2, p0, LH/O$a$b$a$b;->H:I

    invoke-interface {v3, v1, p0}, Lz/l;->c(Lz/i;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    move-object v0, v4

    :goto_1
    move-object v4, v0

    :cond_4
    const/4 p1, 0x0

    invoke-interface {v4, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    :cond_5
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final H(LW8/N;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LH/O$a$b$a$b;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LH/O$a$b$a$b;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LH/O$a$b$a$b;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, LH/O$a$b$a$b;->H(LW8/N;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 3

    new-instance p1, LH/O$a$b$a$b;

    iget-object v0, p0, LH/O$a$b$a$b;->I:LV/w0;

    iget-boolean v1, p0, LH/O$a$b$a$b;->J:Z

    iget-object v2, p0, LH/O$a$b$a$b;->K:Lz/l;

    invoke-direct {p1, v0, v1, v2, p2}, LH/O$a$b$a$b;-><init>(LV/w0;ZLz/l;Lm7/e;)V

    return-object p1
.end method
