.class final LJ0/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh0/k;


# static fields
.field public static final C:LJ0/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LJ0/g;

    invoke-direct {v0}, LJ0/g;-><init>()V

    sput-object v0, LJ0/g;->C:LJ0/g;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public D(Ljava/lang/Object;Lx7/p;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Lh0/k$a;->a(Lh0/k;Ljava/lang/Object;Lx7/p;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public synthetic getKey()Lm7/i$c;
    .locals 1

    invoke-static {p0}, Lh0/j;->a(Lh0/k;)Lm7/i$c;

    move-result-object v0

    return-object v0
.end method

.method public i(Lm7/i$c;)Lm7/i$b;
    .locals 0

    invoke-static {p0, p1}, Lh0/k$a;->b(Lh0/k;Lm7/i$c;)Lm7/i$b;

    move-result-object p1

    return-object p1
.end method

.method public n0()F
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public o0(Lm7/i;)Lm7/i;
    .locals 0

    invoke-static {p0, p1}, Lh0/k$a;->d(Lh0/k;Lm7/i;)Lm7/i;

    move-result-object p1

    return-object p1
.end method

.method public y0(Lm7/i$c;)Lm7/i;
    .locals 0

    invoke-static {p0, p1}, Lh0/k$a;->c(Lh0/k;Lm7/i$c;)Lm7/i;

    move-result-object p1

    return-object p1
.end method
