.class public final Landroidx/graphics/path/PathIteratorPreApi34Impl;
.super LX1/a;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00c2"
    }
    d2 = {
        "\u00c3",
        "\u00c4",
        "\u00c5",
        "\u00c6",
        "",
        "\u00c7",
        "",
        "\u00c8",
        "",
        "\u00c9",
        "\u00ca",
        "\u00cb",
        "\u00cc",
        "\u00cd",
        "\u00ce",
        "",
        "\u00cf",
        "\u00d0",
        "",
        "\u00d1",
        "\u00d2",
        "\u00d3",
        "\u00d4",
        "\u00d5",
        "\u00d6",
        "\u00d7",
        "\u00d8",
        "\u00d9",
        "\u00da",
        "\u00db",
        "\u00dc",
        "\u00dd"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final b:J


# direct methods
.method private final native createInternalPathIterator(Landroid/graphics/Path;IF)J
.end method

.method private final native destroyInternalPathIterator(J)V
.end method

.method private final native internalPathIteratorHasNext(J)Z
    .annotation build Ldalvik/annotation/optimization/FastNative;
    .end annotation
.end method

.method private final native internalPathIteratorNext(J[FI)I
    .annotation build Ldalvik/annotation/optimization/FastNative;
    .end annotation
.end method

.method private final native internalPathIteratorPeek(J)I
    .annotation build Ldalvik/annotation/optimization/FastNative;
    .end annotation
.end method

.method private final native internalPathIteratorRawSize(J)I
    .annotation build Ldalvik/annotation/optimization/FastNative;
    .end annotation
.end method

.method private final native internalPathIteratorSize(J)I
    .annotation build Ldalvik/annotation/optimization/FastNative;
    .end annotation
.end method


# virtual methods
.method protected final finalize()V
    .locals 2

    iget-wide v0, p0, Landroidx/graphics/path/PathIteratorPreApi34Impl;->b:J

    invoke-direct {p0, v0, v1}, Landroidx/graphics/path/PathIteratorPreApi34Impl;->destroyInternalPathIterator(J)V

    return-void
.end method
