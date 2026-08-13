.class public final Lh2/V;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh2/V$a;,
        Lh2/V$b;,
        Lh2/V$c;
    }
.end annotation


# static fields
.field public static final b:Lh2/V$b;


# instance fields
.field private final a:Lh2/V$c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lh2/V$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lh2/V$b;-><init>(Ly7/k;)V

    sput-object v0, Lh2/V;->b:Lh2/V$b;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lh2/V$c;

    invoke-direct {v0, p0, p1}, Lh2/V$c;-><init>(Lh2/V;Z)V

    iput-object v0, p0, Lh2/V;->a:Lh2/V$c;

    return-void
.end method

.method public synthetic constructor <init>(ZILy7/k;)V
    .locals 0

    .prologue
    const/4 p3, 0x1

    and-int/2addr p2, p3

    if-eqz p2, :cond_0

    move p1, p3

    :cond_0
    invoke-direct {p0, p1}, Lh2/V;-><init>(Z)V

    return-void
.end method

.method public static final synthetic a(Lh2/V;)Lh2/V$c;
    .locals 0

    iget-object p0, p0, Lh2/V;->a:Lh2/V$c;

    return-object p0
.end method

.method public static synthetic c(Lh2/V;ILx7/l;Lm7/e;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .prologue
    and-int/lit8 p4, p4, 0x1

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lh2/V;->b(ILx7/l;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final b(ILx7/l;Lm7/e;)Ljava/lang/Object;
    .locals 4

    .prologue
    instance-of v0, p3, Lh2/V$d;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lh2/V$d;

    iget v1, v0, Lh2/V$d;->I:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lh2/V$d;->I:I

    goto :goto_0

    :cond_0
    new-instance v0, Lh2/V$d;

    invoke-direct {v0, p0, p3}, Lh2/V$d;-><init>(Lh2/V;Lm7/e;)V

    :goto_0
    iget-object p3, v0, Lh2/V$d;->G:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lh2/V$d;->I:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lh2/V$d;->F:Ljava/lang/Object;

    check-cast p1, Lh2/V;

    :try_start_0
    invoke-static {p3}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Lh2/V$a; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p2

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Li7/x;->b(Ljava/lang/Object;)V

    :try_start_1
    new-instance p3, Lh2/V$e;

    const/4 v2, 0x0

    invoke-direct {p3, p0, p1, p2, v2}, Lh2/V$e;-><init>(Lh2/V;ILx7/l;Lm7/e;)V

    iput-object p0, v0, Lh2/V$d;->F:Ljava/lang/Object;

    iput v3, v0, Lh2/V$d;->I:I

    invoke-static {p3, v0}, LW8/O;->f(Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Lh2/V$a; {:try_start_1 .. :try_end_1} :catch_1

    if-ne p1, v1, :cond_3

    return-object v1

    :catch_1
    move-exception p2

    move-object p1, p0

    :goto_1
    invoke-virtual {p2}, Lh2/V$a;->a()Lh2/V;

    move-result-object p3

    if-ne p3, p1, :cond_4

    :cond_3
    :goto_2
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :cond_4
    throw p2
.end method
