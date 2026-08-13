.class public final Landroidx/lifecycle/V$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/lifecycle/V;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly7/k;)V
    .locals 0

    invoke-direct {p0}, Landroidx/lifecycle/V$b;-><init>()V

    return-void
.end method

.method public static synthetic c(Landroidx/lifecycle/V$b;Landroidx/lifecycle/X;Landroidx/lifecycle/V$c;Lc2/a;ILjava/lang/Object;)Landroidx/lifecycle/V;
    .locals 0

    .prologue
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    sget-object p2, Le2/c;->a:Le2/c;

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    sget-object p3, Lc2/a$a;->b:Lc2/a$a;

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Landroidx/lifecycle/V$b;->a(Landroidx/lifecycle/X;Landroidx/lifecycle/V$c;Lc2/a;)Landroidx/lifecycle/V;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroidx/lifecycle/V$b;Landroidx/lifecycle/Y;Landroidx/lifecycle/V$c;Lc2/a;ILjava/lang/Object;)Landroidx/lifecycle/V;
    .locals 0

    .prologue
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    sget-object p2, Le2/g;->a:Le2/g;

    invoke-virtual {p2, p1}, Le2/g;->d(Landroidx/lifecycle/Y;)Landroidx/lifecycle/V$c;

    move-result-object p2

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    sget-object p3, Le2/g;->a:Le2/g;

    invoke-virtual {p3, p1}, Le2/g;->c(Landroidx/lifecycle/Y;)Lc2/a;

    move-result-object p3

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Landroidx/lifecycle/V$b;->b(Landroidx/lifecycle/Y;Landroidx/lifecycle/V$c;Lc2/a;)Landroidx/lifecycle/V;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Landroidx/lifecycle/X;Landroidx/lifecycle/V$c;Lc2/a;)Landroidx/lifecycle/V;
    .locals 1

    const-string v0, "store"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "factory"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extras"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroidx/lifecycle/V;

    invoke-direct {v0, p1, p2, p3}, Landroidx/lifecycle/V;-><init>(Landroidx/lifecycle/X;Landroidx/lifecycle/V$c;Lc2/a;)V

    return-object v0
.end method

.method public final b(Landroidx/lifecycle/Y;Landroidx/lifecycle/V$c;Lc2/a;)Landroidx/lifecycle/V;
    .locals 1

    const-string v0, "owner"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "factory"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extras"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroidx/lifecycle/V;

    invoke-interface {p1}, Landroidx/lifecycle/Y;->n()Landroidx/lifecycle/X;

    move-result-object p1

    invoke-direct {v0, p1, p2, p3}, Landroidx/lifecycle/V;-><init>(Landroidx/lifecycle/X;Landroidx/lifecycle/V$c;Lc2/a;)V

    return-object v0
.end method
