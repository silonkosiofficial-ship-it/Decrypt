.class public final LD6/g;
.super LQ6/c;
.source "SourceFile"


# instance fields
.field private final C:LD6/e;

.field private final D:[B

.field private final E:LT6/C;

.field private final F:LT6/B;

.field private final G:LY6/b;

.field private final H:LY6/b;

.field private final I:LT6/p;

.field private final J:Lm7/i;


# direct methods
.method public constructor <init>(LD6/e;[BLQ6/c;)V
    .locals 1

    const-string v0, "call"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "origin"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LQ6/c;-><init>()V

    iput-object p1, p0, LD6/g;->C:LD6/e;

    iput-object p2, p0, LD6/g;->D:[B

    invoke-virtual {p3}, LQ6/c;->e()LT6/C;

    move-result-object p1

    iput-object p1, p0, LD6/g;->E:LT6/C;

    invoke-virtual {p3}, LQ6/c;->f()LT6/B;

    move-result-object p1

    iput-object p1, p0, LD6/g;->F:LT6/B;

    invoke-virtual {p3}, LQ6/c;->c()LY6/b;

    move-result-object p1

    iput-object p1, p0, LD6/g;->G:LY6/b;

    invoke-virtual {p3}, LQ6/c;->d()LY6/b;

    move-result-object p1

    iput-object p1, p0, LD6/g;->H:LY6/b;

    invoke-interface {p3}, LT6/x;->a()LT6/p;

    move-result-object p1

    iput-object p1, p0, LD6/g;->I:LT6/p;

    invoke-interface {p3}, LW8/N;->getCoroutineContext()Lm7/i;

    move-result-object p1

    iput-object p1, p0, LD6/g;->J:Lm7/i;

    return-void
.end method


# virtual methods
.method public bridge synthetic H0()LD6/b;
    .locals 1

    invoke-virtual {p0}, LD6/g;->g()LD6/e;

    move-result-object v0

    return-object v0
.end method

.method public a()LT6/p;
    .locals 1

    iget-object v0, p0, LD6/g;->I:LT6/p;

    return-object v0
.end method

.method public b()Lio/ktor/utils/io/d;
    .locals 4

    iget-object v0, p0, LD6/g;->D:[B

    const/4 v1, 0x6

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v3, v3, v1, v2}, Lio/ktor/utils/io/b;->c([BIIILjava/lang/Object;)Lio/ktor/utils/io/d;

    move-result-object v0

    return-object v0
.end method

.method public c()LY6/b;
    .locals 1

    iget-object v0, p0, LD6/g;->G:LY6/b;

    return-object v0
.end method

.method public d()LY6/b;
    .locals 1

    iget-object v0, p0, LD6/g;->H:LY6/b;

    return-object v0
.end method

.method public e()LT6/C;
    .locals 1

    iget-object v0, p0, LD6/g;->E:LT6/C;

    return-object v0
.end method

.method public f()LT6/B;
    .locals 1

    iget-object v0, p0, LD6/g;->F:LT6/B;

    return-object v0
.end method

.method public g()LD6/e;
    .locals 1

    iget-object v0, p0, LD6/g;->C:LD6/e;

    return-object v0
.end method

.method public getCoroutineContext()Lm7/i;
    .locals 1

    iget-object v0, p0, LD6/g;->J:Lm7/i;

    return-object v0
.end method
