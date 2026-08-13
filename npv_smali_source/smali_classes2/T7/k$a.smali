.class public final LT7/k$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LT7/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly7/k;)V
    .locals 0

    invoke-direct {p0}, LT7/k$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/ClassLoader;)LT7/k;
    .locals 8

    const-string v0, "classLoader"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LT7/g;

    invoke-direct {v0, p1}, LT7/g;-><init>(Ljava/lang/ClassLoader;)V

    sget-object v1, Lg8/h;->b:Lg8/h$a;

    new-instance v3, LT7/g;

    const-class v2, Li7/M;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    const-string v4, "getClassLoader(...)"

    invoke-static {v2, v4}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v3, v2}, LT7/g;-><init>(Ljava/lang/ClassLoader;)V

    new-instance v4, LT7/d;

    invoke-direct {v4, p1}, LT7/d;-><init>(Ljava/lang/ClassLoader;)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "runtime module for "

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    sget-object v6, LT7/j;->b:LT7/j;

    sget-object v7, LT7/l;->a:LT7/l;

    move-object v2, v0

    invoke-virtual/range {v1 .. v7}, Lg8/h$a;->a(Lg8/r;Lg8/r;LX7/p;Ljava/lang/String;LB8/r;Ld8/b;)Lg8/h$a$a;

    move-result-object p1

    new-instance v1, LT7/k;

    invoke-virtual {p1}, Lg8/h$a$a;->a()Lg8/h;

    move-result-object v2

    invoke-virtual {v2}, Lg8/h;->a()LB8/k;

    move-result-object v2

    new-instance v3, LT7/a;

    invoke-virtual {p1}, Lg8/h$a$a;->b()Lg8/j;

    move-result-object p1

    invoke-direct {v3, p1, v0}, LT7/a;-><init>(Lg8/j;LT7/g;)V

    const/4 p1, 0x0

    invoke-direct {v1, v2, v3, p1}, LT7/k;-><init>(LB8/k;LT7/a;Ly7/k;)V

    return-object v1
.end method
