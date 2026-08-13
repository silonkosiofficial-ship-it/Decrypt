.class public final Li9/z$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li9/b;
.implements Li9/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li9/z;
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

    iput-object p1, p0, Li9/z$a;->a:Lk9/d;

    return-void
.end method


# virtual methods
.method public B()Lk9/f;
    .locals 1

    invoke-static {p0}, Li9/b$a;->c(Li9/b;)Lk9/f;

    move-result-object v0

    return-object v0
.end method

.method public C()Li9/z$a;
    .locals 2

    new-instance v0, Li9/z$a;

    new-instance v1, Lk9/d;

    invoke-direct {v1}, Lk9/d;-><init>()V

    invoke-direct {v0, v1}, Li9/z$a;-><init>(Lk9/d;)V

    return-object v0
.end method

.method public a()Lk9/d;
    .locals 1

    iget-object v0, p0, Li9/z$a;->a:Lk9/d;

    return-object v0
.end method

.method public b(Li9/K;)V
    .locals 0

    invoke-static {p0, p1}, Li9/c$a;->f(Li9/c;Li9/K;)V

    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Li9/b$a;->d(Li9/b;Ljava/lang/String;)V

    return-void
.end method

.method public d(Li9/K;)V
    .locals 0

    invoke-static {p0, p1}, Li9/c$a;->e(Li9/c;Li9/K;)V

    return-void
.end method

.method public i(Ljava/lang/String;Lx7/l;)V
    .locals 0

    invoke-static {p0, p1, p2}, Li9/b$a;->b(Li9/b;Ljava/lang/String;Lx7/l;)V

    return-void
.end method

.method public o(Li9/K;)V
    .locals 0

    invoke-static {p0, p1}, Li9/c$a;->b(Li9/c;Li9/K;)V

    return-void
.end method

.method public p([Lx7/l;Lx7/l;)V
    .locals 0

    invoke-static {p0, p1, p2}, Li9/b$a;->a(Li9/b;[Lx7/l;Lx7/l;)V

    return-void
.end method

.method public q(I)V
    .locals 0

    invoke-static {p0, p1}, Li9/c$a;->g(Li9/c;I)V

    return-void
.end method

.method public v(Lk9/o;)V
    .locals 1

    const-string v0, "structure"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Li9/z$a;->a()Lk9/d;

    move-result-object v0

    invoke-virtual {v0, p1}, Lk9/d;->a(Lk9/o;)V

    return-void
.end method

.method public bridge synthetic w()Li9/b;
    .locals 1

    invoke-virtual {p0}, Li9/z$a;->C()Li9/z$a;

    move-result-object v0

    return-object v0
.end method
