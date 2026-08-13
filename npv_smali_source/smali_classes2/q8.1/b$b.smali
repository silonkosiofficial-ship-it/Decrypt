.class public final Lq8/b$b;
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
    name = "b"
.end annotation


# static fields
.field public static final a:Lq8/b$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lq8/b$b;

    invoke-direct {v0}, Lq8/b$b;-><init>()V

    sput-object v0, Lq8/b$b;->a:Lq8/b$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LO7/h;Lq8/c;)Ljava/lang/String;
    .locals 1

    .prologue
    const-string v0, "classifier"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "renderer"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LO7/f0;

    if-eqz v0, :cond_0

    check-cast p1, LO7/f0;

    invoke-interface {p1}, LO7/I;->getName()Ln8/f;

    move-result-object p1

    const-string v0, "getName(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0}, Lq8/c;->v(Ln8/f;Z)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    :cond_1
    invoke-interface {p1}, LO7/I;->getName()Ln8/f;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-interface {p1}, LO7/m;->b()LO7/m;

    move-result-object p1

    instance-of v0, p1, LO7/e;

    if-nez v0, :cond_1

    invoke-static {p2}, Lj7/v;->R(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lq8/n;->c(Ljava/util/List;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
