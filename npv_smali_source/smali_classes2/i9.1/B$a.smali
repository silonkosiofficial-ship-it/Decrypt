.class public final Li9/B$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li9/b;
.implements Li9/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li9/B;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Lk9/d;


# direct methods
.method public constructor <init>(Lk9/d;)V
    .locals 1

    const-string v0, "actualBuilder"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li9/B$a;->a:Lk9/d;

    return-void
.end method


# virtual methods
.method public B()Lk9/f;
    .locals 1

    invoke-static {p0}, Li9/b$a;->c(Li9/b;)Lk9/f;

    move-result-object v0

    return-object v0
.end method

.method public C()Li9/B$a;
    .locals 2

    new-instance v0, Li9/B$a;

    new-instance v1, Lk9/d;

    invoke-direct {v1}, Lk9/d;-><init>()V

    invoke-direct {v0, v1}, Li9/B$a;-><init>(Lk9/d;)V

    return-object v0
.end method

.method public a()Lk9/d;
    .locals 1

    iget-object v0, p0, Li9/B$a;->a:Lk9/d;

    return-object v0
.end method

.method public b(Li9/K;)V
    .locals 0

    invoke-static {p0, p1}, Li9/d$a;->n(Li9/d;Li9/K;)V

    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Li9/b$a;->d(Li9/b;Ljava/lang/String;)V

    return-void
.end method

.method public d(Li9/K;)V
    .locals 0

    invoke-static {p0, p1}, Li9/d$a;->i(Li9/d;Li9/K;)V

    return-void
.end method

.method public i(Ljava/lang/String;Lx7/l;)V
    .locals 0

    invoke-static {p0, p1, p2}, Li9/b$a;->b(Li9/b;Ljava/lang/String;Lx7/l;)V

    return-void
.end method

.method public j(II)V
    .locals 0

    invoke-static {p0, p1, p2}, Li9/d$a;->l(Li9/d;II)V

    return-void
.end method

.method public k(Li9/n;)V
    .locals 0

    invoke-static {p0, p1}, Li9/d$a;->m(Li9/d;Li9/n;)V

    return-void
.end method

.method public l(Lk9/o;)V
    .locals 0

    invoke-static {p0, p1}, Li9/d$a;->b(Li9/d;Lk9/o;)V

    return-void
.end method

.method public m(Li9/K;)V
    .locals 0

    invoke-static {p0, p1}, Li9/d$a;->g(Li9/d;Li9/K;)V

    return-void
.end method

.method public o(Li9/K;)V
    .locals 0

    invoke-static {p0, p1}, Li9/d$a;->d(Li9/d;Li9/K;)V

    return-void
.end method

.method public p([Lx7/l;Lx7/l;)V
    .locals 0

    invoke-static {p0, p1, p2}, Li9/b$a;->a(Li9/b;[Lx7/l;Lx7/l;)V

    return-void
.end method

.method public q(I)V
    .locals 0

    invoke-static {p0, p1}, Li9/d$a;->o(Li9/d;I)V

    return-void
.end method

.method public s(Li9/n;)V
    .locals 0

    invoke-static {p0, p1}, Li9/d$a;->c(Li9/d;Li9/n;)V

    return-void
.end method

.method public u(Lk9/o;)V
    .locals 1

    const-string v0, "structure"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Li9/B$a;->a()Lk9/d;

    move-result-object v0

    invoke-virtual {v0, p1}, Lk9/d;->a(Lk9/o;)V

    return-void
.end method

.method public v(Lk9/o;)V
    .locals 0

    invoke-static {p0, p1}, Li9/d$a;->a(Li9/d;Lk9/o;)V

    return-void
.end method

.method public bridge synthetic w()Li9/b;
    .locals 1

    invoke-virtual {p0}, Li9/B$a;->C()Li9/B$a;

    move-result-object v0

    return-object v0
.end method

.method public x(I)V
    .locals 0

    invoke-static {p0, p1}, Li9/d$a;->k(Li9/d;I)V

    return-void
.end method

.method public y(Li9/K;)V
    .locals 0

    invoke-static {p0, p1}, Li9/d$a;->f(Li9/d;Li9/K;)V

    return-void
.end method

.method public z(Li9/K;)V
    .locals 0

    invoke-static {p0, p1}, Li9/d$a;->j(Li9/d;Li9/K;)V

    return-void
.end method
