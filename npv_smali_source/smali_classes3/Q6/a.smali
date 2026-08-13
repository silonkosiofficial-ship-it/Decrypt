.class public final LQ6/a;
.super LQ6/c;
.source "SourceFile"


# instance fields
.field private final C:LD6/b;

.field private final D:Lm7/i;

.field private final E:LT6/C;

.field private final F:LT6/B;

.field private final G:LY6/b;

.field private final H:LY6/b;

.field private final I:Lio/ktor/utils/io/d;

.field private final J:LT6/p;


# direct methods
.method public constructor <init>(LD6/b;LO6/h;)V
    .locals 1

    .prologue
    const-string v0, "call"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "responseData"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LQ6/c;-><init>()V

    iput-object p1, p0, LQ6/a;->C:LD6/b;

    invoke-virtual {p2}, LO6/h;->b()Lm7/i;

    move-result-object p1

    iput-object p1, p0, LQ6/a;->D:Lm7/i;

    invoke-virtual {p2}, LO6/h;->f()LT6/C;

    move-result-object p1

    iput-object p1, p0, LQ6/a;->E:LT6/C;

    invoke-virtual {p2}, LO6/h;->g()LT6/B;

    move-result-object p1

    iput-object p1, p0, LQ6/a;->F:LT6/B;

    invoke-virtual {p2}, LO6/h;->d()LY6/b;

    move-result-object p1

    iput-object p1, p0, LQ6/a;->G:LY6/b;

    invoke-virtual {p2}, LO6/h;->e()LY6/b;

    move-result-object p1

    iput-object p1, p0, LQ6/a;->H:LY6/b;

    invoke-virtual {p2}, LO6/h;->a()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lio/ktor/utils/io/d;

    if-eqz v0, :cond_0

    check-cast p1, Lio/ktor/utils/io/d;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    sget-object p1, Lio/ktor/utils/io/d;->a:Lio/ktor/utils/io/d$a;

    invoke-virtual {p1}, Lio/ktor/utils/io/d$a;->a()Lio/ktor/utils/io/d;

    move-result-object p1

    :cond_1
    iput-object p1, p0, LQ6/a;->I:Lio/ktor/utils/io/d;

    invoke-virtual {p2}, LO6/h;->c()LT6/p;

    move-result-object p1

    iput-object p1, p0, LQ6/a;->J:LT6/p;

    return-void
.end method


# virtual methods
.method public H0()LD6/b;
    .locals 1

    iget-object v0, p0, LQ6/a;->C:LD6/b;

    return-object v0
.end method

.method public a()LT6/p;
    .locals 1

    iget-object v0, p0, LQ6/a;->J:LT6/p;

    return-object v0
.end method

.method public b()Lio/ktor/utils/io/d;
    .locals 1

    iget-object v0, p0, LQ6/a;->I:Lio/ktor/utils/io/d;

    return-object v0
.end method

.method public c()LY6/b;
    .locals 1

    iget-object v0, p0, LQ6/a;->G:LY6/b;

    return-object v0
.end method

.method public d()LY6/b;
    .locals 1

    iget-object v0, p0, LQ6/a;->H:LY6/b;

    return-object v0
.end method

.method public e()LT6/C;
    .locals 1

    iget-object v0, p0, LQ6/a;->E:LT6/C;

    return-object v0
.end method

.method public f()LT6/B;
    .locals 1

    iget-object v0, p0, LQ6/a;->F:LT6/B;

    return-object v0
.end method

.method public getCoroutineContext()Lm7/i;
    .locals 1

    iget-object v0, p0, LQ6/a;->D:Lm7/i;

    return-object v0
.end method
