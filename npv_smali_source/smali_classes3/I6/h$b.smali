.class final LI6/h$b;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI6/h;->d(LC6/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:Ljava/lang/Object;

.field H:Ljava/lang/Object;

.field I:I

.field private synthetic J:Ljava/lang/Object;

.field synthetic K:Ljava/lang/Object;

.field final synthetic L:LC6/c;


# direct methods
.method constructor <init>(LC6/c;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LI6/h$b;->L:LC6/c;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method

.method public static synthetic H(LW8/y;)Li7/M;
    .locals 0

    invoke-static {p0}, LI6/h$b;->K(LW8/y;)Li7/M;

    move-result-object p0

    return-object p0
.end method

.method private static final K(LW8/y;)Li7/M;
    .locals 0

    invoke-interface {p0}, LW8/y;->K0()Z

    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LI6/h$b;->I:I

    const/4 v2, 0x0

    packed-switch v1, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object v1, p0, LI6/h$b;->K:Ljava/lang/Object;

    check-cast v1, Lb7/a;

    iget-object v2, p0, LI6/h$b;->J:Ljava/lang/Object;

    check-cast v2, La7/e;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto/16 :goto_2

    :pswitch_1
    iget-object v1, p0, LI6/h$b;->H:Ljava/lang/Object;

    check-cast v1, Lb7/a;

    iget-object v3, p0, LI6/h$b;->G:Ljava/lang/Object;

    check-cast v3, La7/e;

    iget-object v4, p0, LI6/h$b;->K:Ljava/lang/Object;

    check-cast v4, Lb7/a;

    iget-object v5, p0, LI6/h$b;->J:Ljava/lang/Object;

    check-cast v5, La7/e;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto/16 :goto_4

    :pswitch_2
    iget-object v1, p0, LI6/h$b;->H:Ljava/lang/Object;

    check-cast v1, Lb7/a;

    iget-object v3, p0, LI6/h$b;->G:Ljava/lang/Object;

    check-cast v3, La7/e;

    iget-object v4, p0, LI6/h$b;->K:Ljava/lang/Object;

    check-cast v4, Lb7/a;

    iget-object v5, p0, LI6/h$b;->J:Ljava/lang/Object;

    check-cast v5, La7/e;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto/16 :goto_1

    :pswitch_3
    iget-object v0, p0, LI6/h$b;->K:Ljava/lang/Object;

    check-cast v0, Lb7/a;

    iget-object v1, p0, LI6/h$b;->J:Ljava/lang/Object;

    check-cast v1, La7/e;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_4
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LI6/h$b;->J:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, La7/e;

    iget-object p1, p0, LI6/h$b;->K:Ljava/lang/Object;

    check-cast p1, LQ6/d;

    invoke-virtual {p1}, LQ6/d;->a()Lb7/a;

    move-result-object v9

    invoke-virtual {p1}, LQ6/d;->b()Ljava/lang/Object;

    move-result-object p1

    instance-of v3, p1, Lio/ktor/utils/io/d;

    if-nez v3, :cond_0

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :cond_0
    invoke-virtual {v1}, La7/e;->b()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LD6/b;

    invoke-virtual {v3}, LD6/b;->e()LQ6/c;

    move-result-object v3

    invoke-virtual {v9}, Lb7/a;->a()LF7/c;

    move-result-object v4

    const-class v5, Li7/M;

    invoke-static {v5}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v5

    invoke-static {v4, v5}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    check-cast p1, Lio/ktor/utils/io/d;

    invoke-static {p1}, Lio/ktor/utils/io/e;->a(Lio/ktor/utils/io/d;)V

    new-instance p1, LQ6/d;

    sget-object v2, Li7/M;->a:Li7/M;

    invoke-direct {p1, v9, v2}, LQ6/d;-><init>(Lb7/a;Ljava/lang/Object;)V

    iput-object v1, p0, LI6/h$b;->J:Ljava/lang/Object;

    iput-object v9, p0, LI6/h$b;->K:Ljava/lang/Object;

    const/4 v2, 0x1

    iput v2, p0, LI6/h$b;->I:I

    invoke-virtual {v1, p1, p0}, La7/e;->e(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_1

    return-object v0

    :cond_1
    move-object v0, v9

    :goto_0
    move-object v2, p1

    check-cast v2, LQ6/d;

    move-object v9, v0

    goto/16 :goto_5

    :cond_2
    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v5}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v5

    invoke-static {v4, v5}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    check-cast p1, Lio/ktor/utils/io/d;

    iput-object v1, p0, LI6/h$b;->J:Ljava/lang/Object;

    iput-object v9, p0, LI6/h$b;->K:Ljava/lang/Object;

    iput-object v1, p0, LI6/h$b;->G:Ljava/lang/Object;

    iput-object v9, p0, LI6/h$b;->H:Ljava/lang/Object;

    const/4 v3, 0x2

    iput v3, p0, LI6/h$b;->I:I

    invoke-static {p1, p0}, Lio/ktor/utils/io/f;->f(Lio/ktor/utils/io/d;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    move-object v3, v1

    move-object v5, v3

    move-object v1, v9

    move-object v4, v1

    :goto_1
    check-cast p1, Lo9/q;

    invoke-static {p1}, Lio/ktor/utils/io/q;->a(Lo9/q;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    invoke-static {p1}, Lo7/b;->c(I)Ljava/lang/Integer;

    move-result-object p1

    new-instance v6, LQ6/d;

    invoke-direct {v6, v1, p1}, LQ6/d;-><init>(Lb7/a;Ljava/lang/Object;)V

    iput-object v5, p0, LI6/h$b;->J:Ljava/lang/Object;

    iput-object v4, p0, LI6/h$b;->K:Ljava/lang/Object;

    iput-object v2, p0, LI6/h$b;->G:Ljava/lang/Object;

    iput-object v2, p0, LI6/h$b;->H:Ljava/lang/Object;

    const/4 p1, 0x3

    iput p1, p0, LI6/h$b;->I:I

    invoke-virtual {v3, v6, p0}, La7/e;->e(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    move-object v0, v4

    move-object v1, v5

    goto :goto_0

    :cond_5
    const-class v5, Lo9/q;

    invoke-static {v5}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v6

    invoke-static {v4, v6}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_c

    invoke-static {v5}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v5

    invoke-static {v4, v5}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    goto/16 :goto_3

    :cond_6
    const-class v5, [B

    invoke-static {v5}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v5

    invoke-static {v4, v5}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_a

    check-cast p1, Lio/ktor/utils/io/d;

    iput-object v1, p0, LI6/h$b;->J:Ljava/lang/Object;

    iput-object v9, p0, LI6/h$b;->K:Ljava/lang/Object;

    const/4 v2, 0x6

    iput v2, p0, LI6/h$b;->I:I

    invoke-static {p1, p0}, Lio/ktor/utils/io/f;->j(Lio/ktor/utils/io/d;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    return-object v0

    :cond_7
    move-object v2, v1

    move-object v1, v9

    :goto_2
    check-cast p1, [B

    invoke-virtual {v2}, La7/e;->b()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LD6/b;

    invoke-virtual {v3}, LD6/b;->e()LQ6/c;

    move-result-object v3

    invoke-static {v3}, LT6/z;->b(LT6/x;)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v2}, La7/e;->b()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LD6/b;

    invoke-virtual {v4}, LD6/b;->d()LO6/b;

    move-result-object v4

    invoke-interface {v4}, LO6/b;->u0()LT6/A;

    move-result-object v4

    sget-object v5, LT6/A;->b:LT6/A$a;

    invoke-virtual {v5}, LT6/A$a;->b()LT6/A;

    move-result-object v5

    invoke-static {v4, v5}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_8

    array-length v4, p1

    int-to-long v4, v4

    invoke-static {v3, v4, v5}, LI6/h;->a(Ljava/lang/Long;J)V

    :cond_8
    new-instance v3, LQ6/d;

    invoke-direct {v3, v1, p1}, LQ6/d;-><init>(Lb7/a;Ljava/lang/Object;)V

    iput-object v2, p0, LI6/h$b;->J:Ljava/lang/Object;

    iput-object v1, p0, LI6/h$b;->K:Ljava/lang/Object;

    const/4 p1, 0x7

    iput p1, p0, LI6/h$b;->I:I

    invoke-virtual {v2, v3, p0}, La7/e;->e(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_9

    return-object v0

    :cond_9
    move-object v0, v1

    move-object v1, v2

    goto/16 :goto_0

    :cond_a
    const-class v5, Lio/ktor/utils/io/d;

    invoke-static {v5}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v5

    invoke-static {v4, v5}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_b

    invoke-interface {v3}, LW8/N;->getCoroutineContext()Lm7/i;

    move-result-object v4

    sget-object v5, LW8/z0;->h:LW8/z0$b;

    invoke-interface {v4, v5}, Lm7/i;->i(Lm7/i$c;)Lm7/i$b;

    move-result-object v4

    check-cast v4, LW8/z0;

    invoke-static {v4}, LW8/C0;->a(LW8/z0;)LW8/y;

    move-result-object v10

    iget-object v4, p0, LI6/h$b;->L:LC6/c;

    invoke-virtual {v4}, LC6/c;->getCoroutineContext()Lm7/i;

    move-result-object v4

    new-instance v6, LI6/h$b$a;

    invoke-direct {v6, p1, v3, v2}, LI6/h$b$a;-><init>(Ljava/lang/Object;LQ6/c;Lm7/e;)V

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v5, 0x0

    move-object v3, v1

    invoke-static/range {v3 .. v8}, Lio/ktor/utils/io/k;->m(LW8/N;Lm7/i;ZLx7/p;ILjava/lang/Object;)Lio/ktor/utils/io/s;

    move-result-object p1

    new-instance v2, LI6/i;

    invoke-direct {v2, v10}, LI6/i;-><init>(LW8/y;)V

    invoke-static {p1, v2}, Lio/ktor/utils/io/k;->e(Lio/ktor/utils/io/m;Lx7/a;)V

    invoke-virtual {p1}, Lio/ktor/utils/io/s;->b()Lio/ktor/utils/io/d;

    move-result-object p1

    new-instance v2, LQ6/d;

    invoke-direct {v2, v9, p1}, LQ6/d;-><init>(Lb7/a;Ljava/lang/Object;)V

    iput-object v1, p0, LI6/h$b;->J:Ljava/lang/Object;

    iput-object v9, p0, LI6/h$b;->K:Ljava/lang/Object;

    const/16 p1, 0x8

    iput p1, p0, LI6/h$b;->I:I

    invoke-virtual {v1, v2, p0}, La7/e;->e(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_1

    return-object v0

    :cond_b
    const-class v5, LT6/C;

    invoke-static {v5}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v5

    invoke-static {v4, v5}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_e

    check-cast p1, Lio/ktor/utils/io/d;

    invoke-static {p1}, Lio/ktor/utils/io/e;->a(Lio/ktor/utils/io/d;)V

    new-instance p1, LQ6/d;

    invoke-virtual {v3}, LQ6/c;->e()LT6/C;

    move-result-object v2

    invoke-direct {p1, v9, v2}, LQ6/d;-><init>(Lb7/a;Ljava/lang/Object;)V

    iput-object v1, p0, LI6/h$b;->J:Ljava/lang/Object;

    iput-object v9, p0, LI6/h$b;->K:Ljava/lang/Object;

    const/16 v2, 0x9

    iput v2, p0, LI6/h$b;->I:I

    invoke-virtual {v1, p1, p0}, La7/e;->e(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_1

    return-object v0

    :cond_c
    :goto_3
    check-cast p1, Lio/ktor/utils/io/d;

    iput-object v1, p0, LI6/h$b;->J:Ljava/lang/Object;

    iput-object v9, p0, LI6/h$b;->K:Ljava/lang/Object;

    iput-object v1, p0, LI6/h$b;->G:Ljava/lang/Object;

    iput-object v9, p0, LI6/h$b;->H:Ljava/lang/Object;

    const/4 v3, 0x4

    iput v3, p0, LI6/h$b;->I:I

    invoke-static {p1, p0}, Lio/ktor/utils/io/f;->f(Lio/ktor/utils/io/d;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_d

    return-object v0

    :cond_d
    move-object v3, v1

    move-object v5, v3

    move-object v1, v9

    move-object v4, v1

    :goto_4
    new-instance v6, LQ6/d;

    invoke-direct {v6, v1, p1}, LQ6/d;-><init>(Lb7/a;Ljava/lang/Object;)V

    iput-object v5, p0, LI6/h$b;->J:Ljava/lang/Object;

    iput-object v4, p0, LI6/h$b;->K:Ljava/lang/Object;

    iput-object v2, p0, LI6/h$b;->G:Ljava/lang/Object;

    iput-object v2, p0, LI6/h$b;->H:Ljava/lang/Object;

    const/4 p1, 0x5

    iput p1, p0, LI6/h$b;->I:I

    invoke-virtual {v3, v6, p0}, La7/e;->e(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_e
    :goto_5
    if-eqz v2, :cond_f

    invoke-static {}, LI6/h;->b()Lfa/d;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Transformed with default transformers response body for "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, La7/e;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LD6/b;

    invoke-virtual {v1}, LD6/b;->d()LO6/b;

    move-result-object v1

    invoke-interface {v1}, LO6/b;->r()LT6/g0;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " to "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Lb7/a;->a()LF7/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lfa/d;->g(Ljava/lang/String;)V

    :cond_f
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_1
        :pswitch_3
        :pswitch_0
        :pswitch_3
        :pswitch_3
        :pswitch_3
    .end packed-switch
.end method

.method public final I(La7/e;LQ6/d;Lm7/e;)Ljava/lang/Object;
    .locals 2

    new-instance v0, LI6/h$b;

    iget-object v1, p0, LI6/h$b;->L:LC6/c;

    invoke-direct {v0, v1, p3}, LI6/h$b;-><init>(LC6/c;Lm7/e;)V

    iput-object p1, v0, LI6/h$b;->J:Ljava/lang/Object;

    iput-object p2, v0, LI6/h$b;->K:Ljava/lang/Object;

    sget-object p1, Li7/M;->a:Li7/M;

    invoke-virtual {v0, p1}, LI6/h$b;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, La7/e;

    check-cast p2, LQ6/d;

    check-cast p3, Lm7/e;

    invoke-virtual {p0, p1, p2, p3}, LI6/h$b;->I(La7/e;LQ6/d;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
