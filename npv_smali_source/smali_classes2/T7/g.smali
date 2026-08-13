.class public final LT7/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg8/r;


# instance fields
.field private final a:Ljava/lang/ClassLoader;

.field private final b:LC8/d;


# direct methods
.method public constructor <init>(Ljava/lang/ClassLoader;)V
    .locals 1

    const-string v0, "classLoader"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LT7/g;->a:Ljava/lang/ClassLoader;

    new-instance p1, LC8/d;

    invoke-direct {p1}, LC8/d;-><init>()V

    iput-object p1, p0, LT7/g;->b:LC8/d;

    return-void
.end method

.method private final d(Ljava/lang/String;)Lg8/r$a;
    .locals 3

    .prologue
    iget-object v0, p0, LT7/g;->a:Ljava/lang/ClassLoader;

    invoke-static {v0, p1}, LT7/e;->a(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    sget-object v1, LT7/f;->c:LT7/f$a;

    invoke-virtual {v1, p1}, LT7/f$a;->a(Ljava/lang/Class;)LT7/f;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance v1, Lg8/r$a$a;

    const/4 v2, 0x2

    invoke-direct {v1, p1, v0, v2, v0}, Lg8/r$a$a;-><init>(Lg8/t;[BILy7/k;)V

    move-object v0, v1

    :cond_0
    return-object v0
.end method


# virtual methods
.method public a(Ln8/b;Lm8/e;)Lg8/r$a;
    .locals 1

    const-string v0, "classId"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "jvmMetadataVersion"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LT7/h;->a(Ln8/b;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, LT7/g;->d(Ljava/lang/String;)Lg8/r$a;

    move-result-object p1

    return-object p1
.end method

.method public b(Le8/g;Lm8/e;)Lg8/r$a;
    .locals 1

    .prologue
    const-string v0, "javaClass"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "jvmMetadataVersion"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Le8/g;->e()Ln8/c;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ln8/c;->b()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1}, LT7/g;->d(Ljava/lang/String;)Lg8/r$a;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public c(Ln8/c;)Ljava/io/InputStream;
    .locals 2

    .prologue
    const-string v0, "packageFqName"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LL7/j;->x:Ln8/f;

    invoke-virtual {p1, v0}, Ln8/c;->i(Ln8/f;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, LT7/g;->b:LC8/d;

    sget-object v1, LC8/a;->r:LC8/a;

    invoke-virtual {v1, p1}, LC8/a;->r(Ln8/c;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, LC8/d;->a(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object p1

    return-object p1
.end method
