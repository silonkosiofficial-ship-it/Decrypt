.class final LI6/E$d$a;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI6/E$d;->c(LI6/E;LC6/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field private synthetic H:Ljava/lang/Object;

.field synthetic I:Ljava/lang/Object;

.field final synthetic J:LI6/E;

.field final synthetic K:LC6/c;


# direct methods
.method constructor <init>(LI6/E;LC6/c;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LI6/E$d$a;->J:LI6/E;

    iput-object p2, p0, LI6/E$d$a;->K:LC6/c;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p3}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LI6/E$d$a;->G:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, LI6/E$d$a;->H:Ljava/lang/Object;

    check-cast v1, La7/e;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_2
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LI6/E$d$a;->H:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, La7/e;

    iget-object p1, p0, LI6/E$d$a;->I:Ljava/lang/Object;

    instance-of v5, p1, LU6/b;

    if-eqz v5, :cond_8

    invoke-virtual {v1}, La7/e;->b()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LO6/d;

    const-class v6, LU6/b;

    if-nez p1, :cond_3

    sget-object p1, LU6/a;->a:LU6/a;

    invoke-virtual {v5, p1}, LO6/d;->k(Ljava/lang/Object;)V

    invoke-static {v6}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object p1

    :try_start_0
    invoke-static {v6}, Ly7/P;->p(Ljava/lang/Class;)LF7/o;

    move-result-object v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-object v6, v4

    :goto_0
    new-instance v7, Lb7/a;

    invoke-direct {v7, p1, v6}, Lb7/a;-><init>(LF7/c;LF7/o;)V

    :goto_1
    invoke-virtual {v5, v7}, LO6/d;->l(Lb7/a;)V

    goto :goto_3

    :cond_3
    instance-of v7, p1, LU6/b;

    invoke-virtual {v5, p1}, LO6/d;->k(Ljava/lang/Object;)V

    if-eqz v7, :cond_4

    invoke-virtual {v5, v4}, LO6/d;->l(Lb7/a;)V

    goto :goto_3

    :cond_4
    invoke-static {v6}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object p1

    :try_start_1
    invoke-static {v6}, Ly7/P;->p(Ljava/lang/Class;)LF7/o;

    move-result-object v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-object v6, v4

    :goto_2
    new-instance v7, Lb7/a;

    invoke-direct {v7, p1, v6}, Lb7/a;-><init>(LF7/c;LF7/o;)V

    goto :goto_1

    :goto_3
    new-instance p1, LI6/E$b;

    iget-object v5, p0, LI6/E$d$a;->J:LI6/E;

    invoke-static {v5}, LI6/E;->c(LI6/E;)I

    move-result v5

    iget-object v6, p0, LI6/E$d$a;->K:LC6/c;

    invoke-direct {p1, v5, v6}, LI6/E$b;-><init>(ILC6/c;)V

    iget-object v5, p0, LI6/E$d$a;->J:LI6/E;

    invoke-static {v5}, LI6/E;->a(LI6/E;)Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    invoke-static {v5}, Lj7/v;->E0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lx7/q;

    new-instance v7, LI6/E$c;

    invoke-direct {v7, v6, p1}, LI6/E$c;-><init>(Lx7/q;LI6/S;)V

    move-object p1, v7

    goto :goto_4

    :cond_5
    invoke-virtual {v1}, La7/e;->b()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LO6/d;

    iput-object v1, p0, LI6/E$d$a;->H:Ljava/lang/Object;

    iput v3, p0, LI6/E$d$a;->G:I

    invoke-interface {p1, v5, p0}, LI6/S;->a(LO6/d;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    return-object v0

    :cond_6
    :goto_5
    check-cast p1, LD6/b;

    iput-object v4, p0, LI6/E$d$a;->H:Ljava/lang/Object;

    iput v2, p0, LI6/E$d$a;->G:I

    invoke-virtual {v1, p1, p0}, La7/e;->e(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    return-object v0

    :cond_7
    :goto_6
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :cond_8
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\n|Fail to prepare request body for sending. \n|The body type is: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-static {p1}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", with Content-Type: "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, La7/e;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LT6/y;

    invoke-static {p1}, LT6/z;->d(LT6/y;)LT6/h;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ".\n|\n|If you expect serialized body, please check that you have installed the corresponding plugin(like `ContentNegotiation`) and set `Content-Type` header."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v4, v3, v4}, LS8/r;->q(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final H(La7/e;Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 3

    new-instance v0, LI6/E$d$a;

    iget-object v1, p0, LI6/E$d$a;->J:LI6/E;

    iget-object v2, p0, LI6/E$d$a;->K:LC6/c;

    invoke-direct {v0, v1, v2, p3}, LI6/E$d$a;-><init>(LI6/E;LC6/c;Lm7/e;)V

    iput-object p1, v0, LI6/E$d$a;->H:Ljava/lang/Object;

    iput-object p2, v0, LI6/E$d$a;->I:Ljava/lang/Object;

    sget-object p1, Li7/M;->a:Li7/M;

    invoke-virtual {v0, p1}, LI6/E$d$a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, La7/e;

    check-cast p3, Lm7/e;

    invoke-virtual {p0, p1, p2, p3}, LI6/E$d$a;->H(La7/e;Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
