.class final LV/f1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV/j0;


# static fields
.field public static final C:LV/f1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LV/f1;

    invoke-direct {v0}, LV/f1;-><init>()V

    sput-object v0, LV/f1;->C:LV/f1;

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

    invoke-static {p0, p1, p2}, LV/j0$a;->a(LV/j0;Ljava/lang/Object;Lx7/p;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public R(Lx7/l;Lm7/e;)Ljava/lang/Object;
    .locals 3

    invoke-static {}, LW8/d0;->c()LW8/J0;

    move-result-object v0

    new-instance v1, LV/f1$a;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, LV/f1$a;-><init>(Lx7/l;Lm7/e;)V

    invoke-static {v0, v1, p2}, LW8/g;->g(Lm7/i;Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public synthetic getKey()Lm7/i$c;
    .locals 1

    invoke-static {p0}, LV/i0;->a(LV/j0;)Lm7/i$c;

    move-result-object v0

    return-object v0
.end method

.method public i(Lm7/i$c;)Lm7/i$b;
    .locals 0

    invoke-static {p0, p1}, LV/j0$a;->b(LV/j0;Lm7/i$c;)Lm7/i$b;

    move-result-object p1

    return-object p1
.end method

.method public o0(Lm7/i;)Lm7/i;
    .locals 0

    invoke-static {p0, p1}, LV/j0$a;->d(LV/j0;Lm7/i;)Lm7/i;

    move-result-object p1

    return-object p1
.end method

.method public y0(Lm7/i$c;)Lm7/i;
    .locals 0

    invoke-static {p0, p1}, LV/j0$a;->c(LV/j0;Lm7/i$c;)Lm7/i;

    move-result-object p1

    return-object p1
.end method
