.class public abstract Lh2/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lh2/k;->a:Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic a()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lh2/k;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public static final b(LZ8/f;Lx7/q;)LZ8/f;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "operation"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lh2/k$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lh2/k$a;-><init>(LZ8/f;Lx7/q;Lm7/e;)V

    invoke-static {v0}, LZ8/h;->x(Lx7/p;)LZ8/f;

    move-result-object p0

    return-object p0
.end method

.method public static final c(LZ8/f;Ljava/lang/Object;Lx7/q;)LZ8/f;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "operation"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lh2/k$b;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p0, p2, v1}, Lh2/k$b;-><init>(Ljava/lang/Object;LZ8/f;Lx7/q;Lm7/e;)V

    invoke-static {v0}, LZ8/h;->x(Lx7/p;)LZ8/f;

    move-result-object p0

    return-object p0
.end method

.method public static final d(LZ8/f;Lx7/q;)LZ8/f;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "transform"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lh2/k$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lh2/k$c;-><init>(LZ8/f;Lx7/q;Lm7/e;)V

    invoke-static {v0}, Lh2/S;->a(Lx7/p;)LZ8/f;

    move-result-object p0

    return-object p0
.end method
