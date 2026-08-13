.class final LD/A$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LD/A;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
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

    invoke-direct {p0}, LD/A$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(LD/A$a;III)LE7/i;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LD/A$a;->b(III)LE7/i;

    move-result-object p0

    return-object p0
.end method

.method private final b(III)LE7/i;
    .locals 2

    div-int/2addr p1, p2

    mul-int/2addr p1, p2

    sub-int v0, p1, p3

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    add-int/2addr p1, p2

    add-int/2addr p1, p3

    invoke-static {v0, p1}, LE7/j;->q(II)LE7/i;

    move-result-object p1

    return-object p1
.end method
