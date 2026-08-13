.class final LI6/v$c;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/s;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LI6/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field synthetic H:Ljava/lang/Object;

.field synthetic I:Ljava/lang/Object;

.field synthetic J:Ljava/lang/Object;

.field final synthetic K:Ljava/nio/charset/Charset;


# direct methods
.method constructor <init>(Ljava/nio/charset/Charset;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LI6/v$c;->K:Ljava/nio/charset/Charset;

    const/4 p1, 0x5

    invoke-direct {p0, p1, p2}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LI6/v$c;->G:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, LI6/v$c;->H:Ljava/lang/Object;

    check-cast v0, LQ6/c;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LI6/v$c;->H:Ljava/lang/Object;

    check-cast p1, LQ6/c;

    iget-object v1, p0, LI6/v$c;->I:Ljava/lang/Object;

    check-cast v1, Lio/ktor/utils/io/d;

    iget-object v3, p0, LI6/v$c;->J:Ljava/lang/Object;

    check-cast v3, Lb7/a;

    invoke-virtual {v3}, Lb7/a;->a()LF7/c;

    move-result-object v3

    const-class v4, Ljava/lang/String;

    invoke-static {v4}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v4

    invoke-static {v3, v4}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const/4 v4, 0x0

    if-nez v3, :cond_2

    return-object v4

    :cond_2
    iput-object p1, p0, LI6/v$c;->H:Ljava/lang/Object;

    iput-object v4, p0, LI6/v$c;->I:Ljava/lang/Object;

    iput v2, p0, LI6/v$c;->G:I

    invoke-static {v1, p0}, Lio/ktor/utils/io/f;->f(Lio/ktor/utils/io/d;Lm7/e;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_3

    return-object v0

    :cond_3
    move-object v0, p1

    move-object p1, v1

    :goto_0
    check-cast p1, Lo9/q;

    iget-object v1, p0, LI6/v$c;->K:Ljava/nio/charset/Charset;

    invoke-virtual {v0}, LQ6/c;->H0()LD6/b;

    move-result-object v0

    invoke-static {v1, v0, p1}, LI6/v;->g(Ljava/nio/charset/Charset;LD6/b;Lo9/q;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final H(LJ6/m;LQ6/c;Lio/ktor/utils/io/d;Lb7/a;Lm7/e;)Ljava/lang/Object;
    .locals 1

    new-instance p1, LI6/v$c;

    iget-object v0, p0, LI6/v$c;->K:Ljava/nio/charset/Charset;

    invoke-direct {p1, v0, p5}, LI6/v$c;-><init>(Ljava/nio/charset/Charset;Lm7/e;)V

    iput-object p2, p1, LI6/v$c;->H:Ljava/lang/Object;

    iput-object p3, p1, LI6/v$c;->I:Ljava/lang/Object;

    iput-object p4, p1, LI6/v$c;->J:Ljava/lang/Object;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LI6/v$c;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic v(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LJ6/m;

    check-cast p2, LQ6/c;

    check-cast p3, Lio/ktor/utils/io/d;

    check-cast p4, Lb7/a;

    check-cast p5, Lm7/e;

    invoke-virtual/range {p0 .. p5}, LI6/v$c;->H(LJ6/m;LQ6/c;Lio/ktor/utils/io/d;Lb7/a;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
