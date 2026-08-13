.class public abstract LO6/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LW6/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    const-class v0, LO6/k;

    invoke-static {v0}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v1

    :try_start_0
    invoke-static {v0}, Ly7/P;->p(Ljava/lang/Class;)LF7/o;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    const/4 v0, 0x0

    :goto_0
    new-instance v2, Lb7/a;

    invoke-direct {v2, v1, v0}, Lb7/a;-><init>(LF7/c;LF7/o;)V

    new-instance v0, LW6/a;

    const-string v1, "ResponseAdapterAttributeKey"

    invoke-direct {v0, v1, v2}, LW6/a;-><init>(Ljava/lang/String;Lb7/a;)V

    sput-object v0, LO6/f;->a:LW6/a;

    return-void
.end method

.method public static final a(LT6/y;Lx7/l;)LT6/q;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "block"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LT6/y;->a()LT6/q;

    move-result-object p0

    invoke-interface {p1, p0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public static final b(LO6/e;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LO6/e;->b()LU6/b;

    const/4 p0, 0x0

    return p0
.end method

.method public static final c(LO6/e;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LO6/e;->b()LU6/b;

    const/4 p0, 0x0

    return p0
.end method

.method public static final d(LO6/d;Ljava/lang/String;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "urlString"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LO6/d;->j()LT6/M;

    move-result-object p0

    invoke-static {p0, p1}, LT6/T;->l(LT6/M;Ljava/lang/String;)LT6/M;

    return-void
.end method
