.class final LC9/A;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Z

.field private final b:LY8/j;

.field private final c:LW8/z0;


# direct methods
.method public constructor <init>(LW8/N;ZLx7/p;)V
    .locals 9

    const-string v0, "scope"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onBack"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p2, p0, LC9/A;->a:Z

    sget-object p2, LY8/d;->C:LY8/d;

    const/4 v0, 0x4

    const/4 v1, -0x2

    const/4 v2, 0x0

    invoke-static {v1, p2, v2, v0, v2}, LY8/m;->b(ILY8/d;Lx7/l;ILjava/lang/Object;)LY8/j;

    move-result-object p2

    iput-object p2, p0, LC9/A;->b:LY8/j;

    new-instance v6, LC9/A$a;

    invoke-direct {v6, p3, p0, v2}, LC9/A$a;-><init>(Lx7/p;LC9/A;Lm7/e;)V

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v3, p1

    invoke-static/range {v3 .. v8}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    move-result-object p1

    iput-object p1, p0, LC9/A;->c:LW8/z0;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, LC9/A;->b:LY8/j;

    new-instance v1, Ljava/util/concurrent/CancellationException;

    const-string v2, "onBack cancelled"

    invoke-direct {v1, v2}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, LY8/B;->o(Ljava/util/concurrent/CancellationException;)V

    iget-object v0, p0, LC9/A;->c:LW8/z0;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, LW8/z0$a;->a(LW8/z0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    return-void
.end method

.method public final b()Z
    .locals 3

    iget-object v0, p0, LC9/A;->b:LY8/j;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, LY8/C$a;->a(LY8/C;Ljava/lang/Throwable;ILjava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final c()LY8/j;
    .locals 1

    iget-object v0, p0, LC9/A;->b:LY8/j;

    return-object v0
.end method

.method public final d()Z
    .locals 1

    iget-boolean v0, p0, LC9/A;->a:Z

    return v0
.end method

.method public final e(F)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LC9/A;->b:LY8/j;

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-interface {v0, p1}, LY8/C;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
