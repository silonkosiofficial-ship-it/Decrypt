.class public final Landroidx/compose/material3/MinimumInteractiveModifier;
.super LF0/W;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LF0/W;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0692"
    }
    d2 = {
        "\u0693",
        "\u0694",
        "\u0695",
        "\u0696",
        "\u0697",
        "\u0698",
        "\u0699",
        "\u069a",
        "\u069b",
        "\u069c",
        "\u069d",
        "",
        "\u069e",
        "\u069f",
        "",
        "\u06a0",
        "",
        "\u06a1",
        "\u06a2",
        "\u06a3"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final b:Landroidx/compose/material3/MinimumInteractiveModifier;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/material3/MinimumInteractiveModifier;

    invoke-direct {v0}, Landroidx/compose/material3/MinimumInteractiveModifier;-><init>()V

    sput-object v0, Landroidx/compose/material3/MinimumInteractiveModifier;->b:Landroidx/compose/material3/MinimumInteractiveModifier;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, LF0/W;-><init>()V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 0

    .prologue
    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public bridge synthetic g()Landroidx/compose/ui/d$c;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/material3/MinimumInteractiveModifier;->l()LS/t0;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public bridge synthetic j(Landroidx/compose/ui/d$c;)V
    .locals 0

    check-cast p1, LS/t0;

    invoke-virtual {p0, p1}, Landroidx/compose/material3/MinimumInteractiveModifier;->m(LS/t0;)V

    return-void
.end method

.method public l()LS/t0;
    .locals 1

    new-instance v0, LS/t0;

    invoke-direct {v0}, LS/t0;-><init>()V

    return-object v0
.end method

.method public m(LS/t0;)V
    .locals 0

    return-void
.end method
