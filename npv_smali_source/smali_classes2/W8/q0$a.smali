.class public final LW8/q0$a;
.super Lm7/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LW8/q0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 2

    sget-object v0, LW8/J;->D:LW8/J$a;

    new-instance v1, LW8/p0;

    invoke-direct {v1}, LW8/p0;-><init>()V

    invoke-direct {p0, v0, v1}, Lm7/b;-><init>(Lm7/i$c;Lx7/l;)V

    return-void
.end method

.method public synthetic constructor <init>(Ly7/k;)V
    .locals 0

    invoke-direct {p0}, LW8/q0$a;-><init>()V

    return-void
.end method

.method public static synthetic c(Lm7/i$b;)LW8/q0;
    .locals 0

    invoke-static {p0}, LW8/q0$a;->d(Lm7/i$b;)LW8/q0;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Lm7/i$b;)LW8/q0;
    .locals 1

    .prologue
    instance-of v0, p0, LW8/q0;

    if-eqz v0, :cond_0

    check-cast p0, LW8/q0;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method
