.class public abstract LI7/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LI7/a;

.field private static final b:LI7/a;

.field private static final c:LI7/a;

.field private static final d:LI7/a;

.field private static final e:LI7/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, LI7/c$d;->D:LI7/c$d;

    invoke-static {v0}, LI7/b;->a(Lx7/l;)LI7/a;

    move-result-object v0

    sput-object v0, LI7/c;->a:LI7/a;

    sget-object v0, LI7/c$e;->D:LI7/c$e;

    invoke-static {v0}, LI7/b;->a(Lx7/l;)LI7/a;

    move-result-object v0

    sput-object v0, LI7/c;->b:LI7/a;

    sget-object v0, LI7/c$a;->D:LI7/c$a;

    invoke-static {v0}, LI7/b;->a(Lx7/l;)LI7/a;

    move-result-object v0

    sput-object v0, LI7/c;->c:LI7/a;

    sget-object v0, LI7/c$c;->D:LI7/c$c;

    invoke-static {v0}, LI7/b;->a(Lx7/l;)LI7/a;

    move-result-object v0

    sput-object v0, LI7/c;->d:LI7/a;

    sget-object v0, LI7/c$b;->D:LI7/c$b;

    invoke-static {v0}, LI7/b;->a(Lx7/l;)LI7/a;

    move-result-object v0

    sput-object v0, LI7/c;->e:LI7/a;

    return-void
.end method

.method public static final a(Ljava/lang/Class;Ljava/util/List;Z)LF7/o;
    .locals 1

    .prologue
    const-string v0, "jClass"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "arguments"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p2, :cond_0

    sget-object p1, LI7/c;->d:LI7/a;

    :goto_0
    invoke-virtual {p1, p0}, LI7/a;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LF7/o;

    goto :goto_1

    :cond_0
    sget-object p1, LI7/c;->c:LI7/a;

    goto :goto_0

    :cond_1
    invoke-static {p0, p1, p2}, LI7/c;->b(Ljava/lang/Class;Ljava/util/List;Z)LF7/o;

    move-result-object p0

    :goto_1
    return-object p0
.end method

.method private static final b(Ljava/lang/Class;Ljava/util/List;Z)LF7/o;
    .locals 3

    .prologue
    sget-object v0, LI7/c;->e:LI7/a;

    invoke-virtual {v0, p0}, LI7/a;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj$/util/concurrent/ConcurrentHashMap;

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {p1, v1}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_1

    invoke-static {p0}, LI7/c;->c(Ljava/lang/Class;)LI7/k;

    move-result-object p0

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v2

    invoke-static {p0, p1, p2, v2}, LG7/c;->b(LF7/d;Ljava/util/List;ZLjava/util/List;)LF7/o;

    move-result-object p0

    invoke-interface {v0, v1, p0}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    move-object v2, p0

    goto :goto_0

    :cond_0
    move-object v2, p1

    :cond_1
    :goto_0
    const-string p0, "getOrPut(...)"

    invoke-static {v2, p0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, LF7/o;

    return-object v2
.end method

.method public static final c(Ljava/lang/Class;)LI7/k;
    .locals 1

    const-string v0, "jClass"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LI7/c;->a:LI7/a;

    invoke-virtual {v0, p0}, LI7/a;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    const-string v0, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<T of kotlin.reflect.jvm.internal.CachesKt.getOrCreateKotlinClass>"

    invoke-static {p0, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, LI7/k;

    return-object p0
.end method

.method public static final d(Ljava/lang/Class;)LF7/e;
    .locals 1

    const-string v0, "jClass"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LI7/c;->b:LI7/a;

    invoke-virtual {v0, p0}, LI7/a;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LF7/e;

    return-object p0
.end method
