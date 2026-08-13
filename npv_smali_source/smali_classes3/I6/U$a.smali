.class final LI6/U$a;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI6/U;->b(LC6/c;Lx7/q;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field private synthetic H:Ljava/lang/Object;

.field final synthetic I:Lx7/q;


# direct methods
.method constructor <init>(Lx7/q;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LI6/U$a;->I:Lx7/q;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method

.method public static final synthetic H(La7/e;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, LI6/U$a;->K(La7/e;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final synthetic K(La7/e;Lm7/e;)Ljava/lang/Object;
    .locals 0

    .prologue
    invoke-virtual {p0, p1}, La7/e;->d(Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LI6/U$a;->G:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LI6/U$a;->H:Ljava/lang/Object;

    check-cast p1, La7/e;

    iget-object v1, p0, LI6/U$a;->I:Lx7/q;

    invoke-virtual {p1}, La7/e;->b()Ljava/lang/Object;

    move-result-object v3

    new-instance v4, LI6/U$a$a;

    invoke-direct {v4, p1}, LI6/U$a$a;-><init>(Ljava/lang/Object;)V

    iput v2, p0, LI6/U$a;->G:I

    invoke-interface {v1, v3, v4, p0}, Lx7/q;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final I(La7/e;Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 1

    new-instance p2, LI6/U$a;

    iget-object v0, p0, LI6/U$a;->I:Lx7/q;

    invoke-direct {p2, v0, p3}, LI6/U$a;-><init>(Lx7/q;Lm7/e;)V

    iput-object p1, p2, LI6/U$a;->H:Ljava/lang/Object;

    sget-object p1, Li7/M;->a:Li7/M;

    invoke-virtual {p2, p1}, LI6/U$a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, La7/e;

    check-cast p3, Lm7/e;

    invoke-virtual {p0, p1, p2, p3}, LI6/U$a;->I(La7/e;Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
