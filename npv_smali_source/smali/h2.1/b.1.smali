.class public final Lh2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lh2/i;

.field private final b:LZ8/x;

.field private final c:LZ8/C;

.field private final d:LW8/z0;

.field private final e:LZ8/f;


# direct methods
.method public constructor <init>(LZ8/f;LW8/N;)V
    .locals 9

    const-string v0, "src"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lh2/i;

    invoke-direct {v0}, Lh2/i;-><init>()V

    iput-object v0, p0, Lh2/b;->a:Lh2/i;

    const v0, 0x7fffffff

    sget-object v1, LY8/d;->C:LY8/d;

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, LZ8/E;->a(IILY8/d;)LZ8/x;

    move-result-object v0

    iput-object v0, p0, Lh2/b;->b:LZ8/x;

    new-instance v1, Lh2/b$d;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lh2/b$d;-><init>(Lh2/b;Lm7/e;)V

    invoke-static {v0, v1}, LZ8/h;->I(LZ8/C;Lx7/p;)LZ8/C;

    move-result-object v0

    iput-object v0, p0, Lh2/b;->c:LZ8/C;

    sget-object v5, LW8/P;->D:LW8/P;

    new-instance v6, Lh2/b$b;

    invoke-direct {v6, p1, p0, v2}, Lh2/b$b;-><init>(LZ8/f;Lh2/b;Lm7/e;)V

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v4, 0x0

    move-object v3, p2

    invoke-static/range {v3 .. v8}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    move-result-object p1

    new-instance p2, Lh2/b$c;

    invoke-direct {p2, p0}, Lh2/b$c;-><init>(Lh2/b;)V

    invoke-interface {p1, p2}, LW8/z0;->e1(Lx7/l;)LW8/f0;

    iput-object p1, p0, Lh2/b;->d:LW8/z0;

    new-instance p1, Lh2/b$a;

    invoke-direct {p1, p0, v2}, Lh2/b$a;-><init>(Lh2/b;Lm7/e;)V

    invoke-static {p1}, LZ8/h;->x(Lx7/p;)LZ8/f;

    move-result-object p1

    iput-object p1, p0, Lh2/b;->e:LZ8/f;

    return-void
.end method

.method public static final synthetic a(Lh2/b;)LW8/z0;
    .locals 0

    iget-object p0, p0, Lh2/b;->d:LW8/z0;

    return-object p0
.end method

.method public static final synthetic b(Lh2/b;)LZ8/x;
    .locals 0

    iget-object p0, p0, Lh2/b;->b:LZ8/x;

    return-object p0
.end method

.method public static final synthetic c(Lh2/b;)Lh2/i;
    .locals 0

    iget-object p0, p0, Lh2/b;->a:Lh2/i;

    return-object p0
.end method

.method public static final synthetic d(Lh2/b;)LZ8/C;
    .locals 0

    iget-object p0, p0, Lh2/b;->c:LZ8/C;

    return-object p0
.end method


# virtual methods
.method public final e()V
    .locals 3

    iget-object v0, p0, Lh2/b;->d:LW8/z0;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, LW8/z0$a;->a(LW8/z0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    return-void
.end method

.method public final f()Lh2/x$b;
    .locals 1

    iget-object v0, p0, Lh2/b;->a:Lh2/i;

    invoke-virtual {v0}, Lh2/i;->a()Lh2/x$b;

    move-result-object v0

    return-object v0
.end method

.method public final g()LZ8/f;
    .locals 1

    iget-object v0, p0, Lh2/b;->e:LZ8/f;

    return-object v0
.end method
