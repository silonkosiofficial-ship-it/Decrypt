.class public final LY5/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LY5/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LY5/a;

    invoke-direct {v0}, LY5/a;-><init>()V

    sput-object v0, LY5/a;->a:LY5/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(I)C
    .locals 1

    ushr-int/lit8 p1, p1, 0xa

    const v0, 0xd7c0

    add-int/2addr p1, v0

    int-to-char p1, p1

    return p1
.end method

.method private final b(I)Z
    .locals 0

    .prologue
    ushr-int/lit8 p1, p1, 0x10

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private final c(I)Z
    .locals 1

    .prologue
    ushr-int/lit8 p1, p1, 0x10

    const/16 v0, 0x11

    if-ge p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private final d(I)C
    .locals 1

    and-int/lit16 p1, p1, 0x3ff

    const v0, 0xdc00

    add-int/2addr p1, v0

    int-to-char p1, p1

    return p1
.end method

.method private final f(I[CI)V
    .locals 2

    add-int/lit8 v0, p3, 0x1

    invoke-direct {p0, p1}, LY5/a;->d(I)C

    move-result v1

    aput-char v1, p2, v0

    invoke-direct {p0, p1}, LY5/a;->a(I)C

    move-result p1

    aput-char p1, p2, p3

    return-void
.end method


# virtual methods
.method public final e(I)[C
    .locals 2

    .prologue
    invoke-direct {p0, p1}, LY5/a;->b(I)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    new-array v0, v0, [C

    int-to-char p1, p1

    aput-char p1, v0, v1

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1}, LY5/a;->c(I)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x2

    new-array v0, v0, [C

    invoke-direct {p0, p1, v0, v1}, LY5/a;->f(I[CI)V

    :goto_0
    return-object v0

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method
