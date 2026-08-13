.class final LU7/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LU7/a$a;
    }
.end annotation


# static fields
.field public static final a:LU7/a;

.field private static b:LU7/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LU7/a;

    invoke-direct {v0}, LU7/a;-><init>()V

    sput-object v0, LU7/a;->a:LU7/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Ljava/lang/Object;)LU7/a$a;
    .locals 4

    .prologue
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    const/4 v0, 0x0

    :try_start_0
    new-instance v1, LU7/a$a;

    const-string v2, "getType"

    invoke-virtual {p1, v2, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    const-string v3, "getAccessor"

    invoke-virtual {p1, v3, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    invoke-direct {v1, v2, p1}, LU7/a$a;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    new-instance v1, LU7/a$a;

    invoke-direct {v1, v0, v0}, LU7/a$a;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V

    :goto_0
    return-object v1
.end method

.method private final b(Ljava/lang/Object;)LU7/a$a;
    .locals 1

    .prologue
    sget-object v0, LU7/a;->b:LU7/a$a;

    if-nez v0, :cond_0

    invoke-direct {p0, p1}, LU7/a;->a(Ljava/lang/Object;)LU7/a$a;

    move-result-object v0

    sput-object v0, LU7/a;->b:LU7/a$a;

    :cond_0
    return-object v0
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)Ljava/lang/reflect/Method;
    .locals 2

    .prologue
    const-string v0, "recordComponent"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LU7/a;->b(Ljava/lang/Object;)LU7/a$a;

    move-result-object v0

    invoke-virtual {v0}, LU7/a$a;->a()Ljava/lang/reflect/Method;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type java.lang.reflect.Method"

    invoke-static {p1, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/reflect/Method;

    return-object p1
.end method

.method public final d(Ljava/lang/Object;)Ljava/lang/Class;
    .locals 2

    .prologue
    const-string v0, "recordComponent"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LU7/a;->b(Ljava/lang/Object;)LU7/a$a;

    move-result-object v0

    invoke-virtual {v0}, LU7/a$a;->b()Ljava/lang/reflect/Method;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type java.lang.Class<*>"

    invoke-static {p1, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Class;

    return-object p1
.end method
