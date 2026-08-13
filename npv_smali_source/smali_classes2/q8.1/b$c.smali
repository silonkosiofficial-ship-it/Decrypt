.class public final Lq8/b$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq8/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq8/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# static fields
.field public static final a:Lq8/b$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lq8/b$c;

    invoke-direct {v0}, Lq8/b$c;-><init>()V

    sput-object v0, Lq8/b$c;->a:Lq8/b$c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final b(LO7/h;)Ljava/lang/String;
    .locals 2

    .prologue
    invoke-interface {p1}, LO7/I;->getName()Ln8/f;

    move-result-object v0

    const-string v1, "getName(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lq8/n;->b(Ln8/f;)Ljava/lang/String;

    move-result-object v0

    instance-of v1, p1, LO7/f0;

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    invoke-interface {p1}, LO7/n;->b()LO7/m;

    move-result-object p1

    const-string v1, "getContainingDeclaration(...)"

    invoke-static {p1, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lq8/b$c;->c(LO7/m;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    const-string v1, ""

    invoke-static {p1, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x2e

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method private final c(LO7/m;)Ljava/lang/String;
    .locals 1

    .prologue
    instance-of v0, p1, LO7/e;

    if-eqz v0, :cond_0

    check-cast p1, LO7/h;

    invoke-direct {p0, p1}, Lq8/b$c;->b(LO7/h;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    instance-of v0, p1, LO7/K;

    if-eqz v0, :cond_1

    check-cast p1, LO7/K;

    invoke-interface {p1}, LO7/K;->e()Ln8/c;

    move-result-object p1

    invoke-virtual {p1}, Ln8/c;->j()Ln8/d;

    move-result-object p1

    const-string v0, "toUnsafe(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lq8/n;->a(Ln8/d;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method


# virtual methods
.method public a(LO7/h;Lq8/c;)Ljava/lang/String;
    .locals 1

    const-string v0, "classifier"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "renderer"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lq8/b$c;->b(LO7/h;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
