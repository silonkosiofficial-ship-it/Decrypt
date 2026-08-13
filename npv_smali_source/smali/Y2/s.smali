.class final LY2/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LW2/h;


# instance fields
.field private final a:LY2/p;

.field private final b:Ljava/lang/String;

.field private final c:LW2/b;

.field private final d:LW2/g;

.field private final e:LY2/t;


# direct methods
.method constructor <init>(LY2/p;Ljava/lang/String;LW2/b;LW2/g;LY2/t;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LY2/s;->a:LY2/p;

    iput-object p2, p0, LY2/s;->b:Ljava/lang/String;

    iput-object p3, p0, LY2/s;->c:LW2/b;

    iput-object p4, p0, LY2/s;->d:LW2/g;

    iput-object p5, p0, LY2/s;->e:LY2/t;

    return-void
.end method

.method public static synthetic c(Ljava/lang/Exception;)V
    .locals 0

    invoke-static {p0}, LY2/s;->e(Ljava/lang/Exception;)V

    return-void
.end method

.method private static synthetic e(Ljava/lang/Exception;)V
    .locals 0

    return-void
.end method


# virtual methods
.method public a(LW2/c;)V
    .locals 1

    new-instance v0, LY2/r;

    invoke-direct {v0}, LY2/r;-><init>()V

    invoke-virtual {p0, p1, v0}, LY2/s;->b(LW2/c;LW2/j;)V

    return-void
.end method

.method public b(LW2/c;LW2/j;)V
    .locals 3

    iget-object v0, p0, LY2/s;->e:LY2/t;

    invoke-static {}, LY2/o;->a()LY2/o$a;

    move-result-object v1

    iget-object v2, p0, LY2/s;->a:LY2/p;

    invoke-virtual {v1, v2}, LY2/o$a;->e(LY2/p;)LY2/o$a;

    move-result-object v1

    invoke-virtual {v1, p1}, LY2/o$a;->c(LW2/c;)LY2/o$a;

    move-result-object p1

    iget-object v1, p0, LY2/s;->b:Ljava/lang/String;

    invoke-virtual {p1, v1}, LY2/o$a;->f(Ljava/lang/String;)LY2/o$a;

    move-result-object p1

    iget-object v1, p0, LY2/s;->d:LW2/g;

    invoke-virtual {p1, v1}, LY2/o$a;->d(LW2/g;)LY2/o$a;

    move-result-object p1

    iget-object v1, p0, LY2/s;->c:LW2/b;

    invoke-virtual {p1, v1}, LY2/o$a;->b(LW2/b;)LY2/o$a;

    move-result-object p1

    invoke-virtual {p1}, LY2/o$a;->a()LY2/o;

    move-result-object p1

    invoke-interface {v0, p1, p2}, LY2/t;->a(LY2/o;LW2/j;)V

    return-void
.end method

.method d()LY2/p;
    .locals 1

    iget-object v0, p0, LY2/s;->a:LY2/p;

    return-object v0
.end method
