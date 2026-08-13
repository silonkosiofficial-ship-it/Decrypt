.class final Lk2/a$a;
.super Lk2/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final b:Lm2/n;


# direct methods
.method public constructor <init>(Lm2/n;)V
    .locals 1

    const-string v0, "mMeasurementManager"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lk2/a;-><init>()V

    iput-object p1, p0, Lk2/a$a;->b:Lm2/n;

    return-void
.end method

.method public static final synthetic e(Lk2/a$a;)Lm2/n;
    .locals 0

    iget-object p0, p0, Lk2/a$a;->b:Lm2/n;

    return-object p0
.end method


# virtual methods
.method public b()LP4/d;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LP4/d;"
        }
    .end annotation

    invoke-static {}, LW8/d0;->a()LW8/J;

    move-result-object v0

    invoke-static {v0}, LW8/O;->a(Lm7/i;)LW8/N;

    move-result-object v1

    new-instance v4, Lk2/a$a$b;

    const/4 v0, 0x0

    invoke-direct {v4, p0, v0}, Lk2/a$a$b;-><init>(Lk2/a$a;Lm7/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LW8/g;->b(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/V;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v1, v0, v2, v0}, Lj2/b;->c(LW8/V;Ljava/lang/Object;ILjava/lang/Object;)LP4/d;

    move-result-object v0

    return-object v0
.end method

.method public c(Landroid/net/Uri;Landroid/view/InputEvent;)LP4/d;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Landroid/view/InputEvent;",
            ")",
            "LP4/d;"
        }
    .end annotation

    const-string v0, "attributionSource"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LW8/d0;->a()LW8/J;

    move-result-object v0

    invoke-static {v0}, LW8/O;->a(Lm7/i;)LW8/N;

    move-result-object v1

    new-instance v4, Lk2/a$a$c;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, p2, v0}, Lk2/a$a$c;-><init>(Lk2/a$a;Landroid/net/Uri;Landroid/view/InputEvent;Lm7/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LW8/g;->b(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/V;

    move-result-object p1

    const/4 p2, 0x1

    invoke-static {p1, v0, p2, v0}, Lj2/b;->c(LW8/V;Ljava/lang/Object;ILjava/lang/Object;)LP4/d;

    move-result-object p1

    return-object p1
.end method

.method public d(Landroid/net/Uri;)LP4/d;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            ")",
            "LP4/d;"
        }
    .end annotation

    const-string v0, "trigger"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LW8/d0;->a()LW8/J;

    move-result-object v0

    invoke-static {v0}, LW8/O;->a(Lm7/i;)LW8/N;

    move-result-object v1

    new-instance v4, Lk2/a$a$d;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, v0}, Lk2/a$a$d;-><init>(Lk2/a$a;Landroid/net/Uri;Lm7/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LW8/g;->b(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/V;

    move-result-object p1

    const/4 v1, 0x1

    invoke-static {p1, v0, v1, v0}, Lj2/b;->c(LW8/V;Ljava/lang/Object;ILjava/lang/Object;)LP4/d;

    move-result-object p1

    return-object p1
.end method

.method public f(Lm2/a;)LP4/d;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm2/a;",
            ")",
            "LP4/d;"
        }
    .end annotation

    const-string v0, "deletionRequest"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LW8/d0;->a()LW8/J;

    move-result-object v0

    invoke-static {v0}, LW8/O;->a(Lm7/i;)LW8/N;

    move-result-object v1

    new-instance v4, Lk2/a$a$a;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, v0}, Lk2/a$a$a;-><init>(Lk2/a$a;Lm2/a;Lm7/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LW8/g;->b(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/V;

    move-result-object p1

    const/4 v1, 0x1

    invoke-static {p1, v0, v1, v0}, Lj2/b;->c(LW8/V;Ljava/lang/Object;ILjava/lang/Object;)LP4/d;

    move-result-object p1

    return-object p1
.end method

.method public g(Lm2/o;)LP4/d;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm2/o;",
            ")",
            "LP4/d;"
        }
    .end annotation

    const-string v0, "request"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LW8/d0;->a()LW8/J;

    move-result-object v0

    invoke-static {v0}, LW8/O;->a(Lm7/i;)LW8/N;

    move-result-object v1

    new-instance v4, Lk2/a$a$e;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, v0}, Lk2/a$a$e;-><init>(Lk2/a$a;Lm2/o;Lm7/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LW8/g;->b(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/V;

    move-result-object p1

    const/4 v1, 0x1

    invoke-static {p1, v0, v1, v0}, Lj2/b;->c(LW8/V;Ljava/lang/Object;ILjava/lang/Object;)LP4/d;

    move-result-object p1

    return-object p1
.end method

.method public h(Lm2/p;)LP4/d;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm2/p;",
            ")",
            "LP4/d;"
        }
    .end annotation

    const-string v0, "request"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LW8/d0;->a()LW8/J;

    move-result-object v0

    invoke-static {v0}, LW8/O;->a(Lm7/i;)LW8/N;

    move-result-object v1

    new-instance v4, Lk2/a$a$f;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, v0}, Lk2/a$a$f;-><init>(Lk2/a$a;Lm2/p;Lm7/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LW8/g;->b(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/V;

    move-result-object p1

    const/4 v1, 0x1

    invoke-static {p1, v0, v1, v0}, Lj2/b;->c(LW8/V;Ljava/lang/Object;ILjava/lang/Object;)LP4/d;

    move-result-object p1

    return-object p1
.end method
