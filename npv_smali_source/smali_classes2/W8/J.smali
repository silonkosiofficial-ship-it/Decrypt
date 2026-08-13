.class public abstract LW8/J;
.super Lm7/a;
.source "SourceFile"

# interfaces
.implements Lm7/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LW8/J$a;
    }
.end annotation


# static fields
.field public static final D:LW8/J$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LW8/J$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LW8/J$a;-><init>(Ly7/k;)V

    sput-object v0, LW8/J;->D:LW8/J$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    sget-object v0, Lm7/f;->A:Lm7/f$b;

    invoke-direct {p0, v0}, Lm7/a;-><init>(Lm7/i$c;)V

    return-void
.end method

.method public static synthetic y1(LW8/J;ILjava/lang/String;ILjava/lang/Object;)LW8/J;
    .locals 0

    .prologue
    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, LW8/J;->x1(ILjava/lang/String;)LW8/J;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: limitedParallelism"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final H(Lm7/e;)V
    .locals 1

    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>"

    invoke-static {p1, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lb9/h;

    invoke-virtual {p1}, Lb9/h;->r()V

    return-void
.end method

.method public i(Lm7/i$c;)Lm7/i$b;
    .locals 0

    invoke-static {p0, p1}, Lm7/f$a;->a(Lm7/f;Lm7/i$c;)Lm7/i$b;

    move-result-object p1

    return-object p1
.end method

.method public final q0(Lm7/e;)Lm7/e;
    .locals 1

    new-instance v0, Lb9/h;

    invoke-direct {v0, p0, p1}, Lb9/h;-><init>(LW8/J;Lm7/e;)V

    return-object v0
.end method

.method public abstract t1(Lm7/i;Ljava/lang/Runnable;)V
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, LW8/S;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, LW8/S;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u1(Lm7/i;Ljava/lang/Runnable;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, LW8/J;->t1(Lm7/i;Ljava/lang/Runnable;)V

    return-void
.end method

.method public v1(Lm7/i;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public synthetic w1(I)LW8/J;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, LW8/J;->x1(ILjava/lang/String;)LW8/J;

    move-result-object p1

    return-object p1
.end method

.method public x1(ILjava/lang/String;)LW8/J;
    .locals 1

    invoke-static {p1}, Lb9/l;->a(I)V

    new-instance v0, Lb9/k;

    invoke-direct {v0, p0, p1, p2}, Lb9/k;-><init>(LW8/J;ILjava/lang/String;)V

    return-object v0
.end method

.method public y0(Lm7/i$c;)Lm7/i;
    .locals 0

    invoke-static {p0, p1}, Lm7/f$a;->b(Lm7/f;Lm7/i$c;)Lm7/i;

    move-result-object p1

    return-object p1
.end method
