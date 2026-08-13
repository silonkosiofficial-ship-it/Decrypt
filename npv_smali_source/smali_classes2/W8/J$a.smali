.class public final LW8/J$a;
.super Lm7/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LW8/J;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 2

    sget-object v0, Lm7/f;->A:Lm7/f$b;

    new-instance v1, LW8/I;

    invoke-direct {v1}, LW8/I;-><init>()V

    invoke-direct {p0, v0, v1}, Lm7/b;-><init>(Lm7/i$c;Lx7/l;)V

    return-void
.end method

.method public synthetic constructor <init>(Ly7/k;)V
    .locals 0

    invoke-direct {p0}, LW8/J$a;-><init>()V

    return-void
.end method

.method public static synthetic c(Lm7/i$b;)LW8/J;
    .locals 0

    invoke-static {p0}, LW8/J$a;->d(Lm7/i$b;)LW8/J;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Lm7/i$b;)LW8/J;
    .locals 1

    .prologue
    instance-of v0, p0, LW8/J;

    if-eqz v0, :cond_0

    check-cast p0, LW8/J;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method
