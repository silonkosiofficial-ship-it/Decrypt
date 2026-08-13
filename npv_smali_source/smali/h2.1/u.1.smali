.class final Lh2/u;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LW8/N;

.field private final b:Lh2/F;

.field private final c:Lh2/b;


# direct methods
.method public constructor <init>(LW8/N;Lh2/F;Lh2/a;)V
    .locals 0

    const-string p3, "scope"

    invoke-static {p1, p3}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "parent"

    invoke-static {p2, p3}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh2/u;->a:LW8/N;

    iput-object p2, p0, Lh2/u;->b:Lh2/F;

    new-instance p3, Lh2/b;

    invoke-virtual {p2}, Lh2/F;->b()LZ8/f;

    move-result-object p2

    invoke-direct {p3, p2, p1}, Lh2/b;-><init>(LZ8/f;LW8/N;)V

    iput-object p3, p0, Lh2/u;->c:Lh2/b;

    return-void
.end method

.method public static final synthetic a(Lh2/u;)Lh2/b;
    .locals 0

    iget-object p0, p0, Lh2/u;->c:Lh2/b;

    return-object p0
.end method


# virtual methods
.method public final b()Lh2/F;
    .locals 5

    new-instance v0, Lh2/F;

    iget-object v1, p0, Lh2/u;->c:Lh2/b;

    invoke-virtual {v1}, Lh2/b;->g()LZ8/f;

    move-result-object v1

    new-instance v2, Lh2/u$a;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Lh2/u$a;-><init>(Lh2/u;Lm7/e;)V

    invoke-static {v1, v2}, LZ8/h;->H(LZ8/f;Lx7/p;)LZ8/f;

    move-result-object v1

    new-instance v2, Lh2/u$b;

    invoke-direct {v2, p0, v3}, Lh2/u$b;-><init>(Lh2/u;Lm7/e;)V

    invoke-static {v1, v2}, LZ8/h;->F(LZ8/f;Lx7/q;)LZ8/f;

    move-result-object v1

    iget-object v2, p0, Lh2/u;->b:Lh2/F;

    invoke-virtual {v2}, Lh2/F;->d()Lh2/X;

    move-result-object v2

    iget-object v3, p0, Lh2/u;->b:Lh2/F;

    invoke-virtual {v3}, Lh2/F;->c()Lh2/o;

    move-result-object v3

    new-instance v4, Lh2/u$c;

    invoke-direct {v4, p0}, Lh2/u$c;-><init>(Lh2/u;)V

    invoke-direct {v0, v1, v2, v3, v4}, Lh2/F;-><init>(LZ8/f;Lh2/X;Lh2/o;Lx7/a;)V

    return-object v0
.end method

.method public final c(Lm7/e;)Ljava/lang/Object;
    .locals 0

    iget-object p1, p0, Lh2/u;->c:Lh2/b;

    invoke-virtual {p1}, Lh2/b;->e()V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final d()Lh2/a;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
