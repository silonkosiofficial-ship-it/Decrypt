.class public final Lm1/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm1/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly7/k;)V
    .locals 0

    invoke-direct {p0}, Lm1/c$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lm1/c$a;Lm1/e;I)Z
    .locals 0

    invoke-direct {p0, p1, p2}, Lm1/c$a;->b(Lm1/e;I)Z

    move-result p0

    return p0
.end method

.method private final b(Lm1/e;I)Z
    .locals 2

    .prologue
    invoke-virtual {p1}, Lm1/e;->A0()I

    move-result v0

    const/16 v1, 0x8

    if-eq v0, v1, :cond_1

    invoke-virtual {p1}, Lm1/e;->N()[Lm1/e$b;

    move-result-object v0

    aget-object v0, v0, p2

    sget-object v1, Lm1/e$b;->E:Lm1/e$b;

    if-ne v0, v1, :cond_1

    invoke-virtual {p1}, Lm1/e;->a0()[I

    move-result-object v0

    aget v0, v0, p2

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lm1/e;->a0()[I

    move-result-object p1

    aget p1, p1, p2

    const/4 p2, 0x3

    if-ne p1, p2, :cond_1

    :cond_0
    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
