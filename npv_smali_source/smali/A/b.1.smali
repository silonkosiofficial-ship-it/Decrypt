.class public final LA/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LA/b$a;,
        LA/b$e;,
        LA/b$f;,
        LA/b$j;,
        LA/b$m;
    }
.end annotation


# static fields
.field public static final a:LA/b;

.field private static final b:LA/b$e;

.field private static final c:LA/b$e;

.field private static final d:LA/b$m;

.field private static final e:LA/b$m;

.field private static final f:LA/b$f;

.field private static final g:LA/b$f;

.field private static final h:LA/b$f;

.field private static final i:LA/b$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LA/b;

    invoke-direct {v0}, LA/b;-><init>()V

    sput-object v0, LA/b;->a:LA/b;

    new-instance v0, LA/b$k;

    invoke-direct {v0}, LA/b$k;-><init>()V

    sput-object v0, LA/b;->b:LA/b$e;

    new-instance v0, LA/b$d;

    invoke-direct {v0}, LA/b$d;-><init>()V

    sput-object v0, LA/b;->c:LA/b$e;

    new-instance v0, LA/b$l;

    invoke-direct {v0}, LA/b$l;-><init>()V

    sput-object v0, LA/b;->d:LA/b$m;

    new-instance v0, LA/b$b;

    invoke-direct {v0}, LA/b$b;-><init>()V

    sput-object v0, LA/b;->e:LA/b$m;

    new-instance v0, LA/b$c;

    invoke-direct {v0}, LA/b$c;-><init>()V

    sput-object v0, LA/b;->f:LA/b$f;

    new-instance v0, LA/b$i;

    invoke-direct {v0}, LA/b$i;-><init>()V

    sput-object v0, LA/b;->g:LA/b$f;

    new-instance v0, LA/b$h;

    invoke-direct {v0}, LA/b$h;-><init>()V

    sput-object v0, LA/b;->h:LA/b$f;

    new-instance v0, LA/b$g;

    invoke-direct {v0}, LA/b$g;-><init>()V

    sput-object v0, LA/b;->i:LA/b$f;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()LA/b$m;
    .locals 1

    sget-object v0, LA/b;->e:LA/b$m;

    return-object v0
.end method

.method public final b()LA/b$f;
    .locals 1

    sget-object v0, LA/b;->f:LA/b$f;

    return-object v0
.end method

.method public final c()LA/b$e;
    .locals 1

    sget-object v0, LA/b;->c:LA/b$e;

    return-object v0
.end method

.method public final d()LA/b$f;
    .locals 1

    sget-object v0, LA/b;->h:LA/b$f;

    return-object v0
.end method

.method public final e()LA/b$f;
    .locals 1

    sget-object v0, LA/b;->g:LA/b$f;

    return-object v0
.end method

.method public final f()LA/b$e;
    .locals 1

    sget-object v0, LA/b;->b:LA/b$e;

    return-object v0
.end method

.method public final g()LA/b$m;
    .locals 1

    sget-object v0, LA/b;->d:LA/b$m;

    return-object v0
.end method

.method public final h(I[I[IZ)V
    .locals 5

    .prologue
    array-length v0, p2

    const/4 v1, 0x0

    move v2, v1

    move v3, v2

    :goto_0
    if-ge v2, v0, :cond_0

    aget v4, p2, v2

    add-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    sub-int/2addr p1, v3

    int-to-float p1, p1

    const/4 v0, 0x2

    int-to-float v0, v0

    div-float/2addr p1, v0

    if-nez p4, :cond_1

    array-length p4, p2

    move v0, v1

    :goto_1
    if-ge v1, p4, :cond_2

    aget v2, p2, v1

    add-int/lit8 v3, v0, 0x1

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result v4

    aput v4, p3, v0

    int-to-float v0, v2

    add-float/2addr p1, v0

    add-int/lit8 v1, v1, 0x1

    move v0, v3

    goto :goto_1

    :cond_1
    array-length p4, p2

    add-int/lit8 p4, p4, -0x1

    :goto_2
    const/4 v0, -0x1

    if-ge v0, p4, :cond_2

    aget v0, p2, p4

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result v1

    aput v1, p3, p4

    int-to-float v0, v0

    add-float/2addr p1, v0

    add-int/lit8 p4, p4, -0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public final i([I[IZ)V
    .locals 5

    .prologue
    const/4 v0, 0x0

    if-nez p3, :cond_0

    array-length p3, p1

    move v1, v0

    move v2, v1

    :goto_0
    if-ge v0, p3, :cond_1

    aget v3, p1, v0

    add-int/lit8 v4, v1, 0x1

    aput v2, p2, v1

    add-int/2addr v2, v3

    add-int/lit8 v0, v0, 0x1

    move v1, v4

    goto :goto_0

    :cond_0
    array-length p3, p1

    add-int/lit8 p3, p3, -0x1

    :goto_1
    const/4 v1, -0x1

    if-ge v1, p3, :cond_1

    aget v1, p1, p3

    aput v0, p2, p3

    add-int/2addr v0, v1

    add-int/lit8 p3, p3, -0x1

    goto :goto_1

    :cond_1
    return-void
.end method

.method public final j(I[I[IZ)V
    .locals 5

    .prologue
    array-length v0, p2

    const/4 v1, 0x0

    move v2, v1

    move v3, v2

    :goto_0
    if-ge v2, v0, :cond_0

    aget v4, p2, v2

    add-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    sub-int/2addr p1, v3

    if-nez p4, :cond_1

    array-length p4, p2

    move v0, v1

    :goto_1
    if-ge v1, p4, :cond_2

    aget v2, p2, v1

    add-int/lit8 v3, v0, 0x1

    aput p1, p3, v0

    add-int/2addr p1, v2

    add-int/lit8 v1, v1, 0x1

    move v0, v3

    goto :goto_1

    :cond_1
    array-length p4, p2

    add-int/lit8 p4, p4, -0x1

    :goto_2
    const/4 v0, -0x1

    if-ge v0, p4, :cond_2

    aget v0, p2, p4

    aput p1, p3, p4

    add-int/2addr p1, v0

    add-int/lit8 p4, p4, -0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public final k(I[I[IZ)V
    .locals 6

    .prologue
    array-length v0, p2

    const/4 v1, 0x0

    move v2, v1

    move v3, v2

    :goto_0
    if-ge v2, v0, :cond_0

    aget v4, p2, v2

    add-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    array-length v0, p2

    const/4 v2, 0x1

    if-nez v0, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    xor-int/2addr v0, v2

    if-eqz v0, :cond_2

    sub-int/2addr p1, v3

    int-to-float p1, p1

    array-length v0, p2

    int-to-float v0, v0

    div-float/2addr p1, v0

    goto :goto_2

    :cond_2
    const/4 p1, 0x0

    :goto_2
    const/4 v0, 0x2

    int-to-float v0, v0

    div-float v0, p1, v0

    if-nez p4, :cond_3

    array-length p4, p2

    move v2, v1

    :goto_3
    if-ge v1, p4, :cond_4

    aget v3, p2, v1

    add-int/lit8 v4, v2, 0x1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v5

    aput v5, p3, v2

    int-to-float v2, v3

    add-float/2addr v2, p1

    add-float/2addr v0, v2

    add-int/lit8 v1, v1, 0x1

    move v2, v4

    goto :goto_3

    :cond_3
    array-length p4, p2

    sub-int/2addr p4, v2

    :goto_4
    const/4 v1, -0x1

    if-ge v1, p4, :cond_4

    aget v1, p2, p4

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v2

    aput v2, p3, p4

    int-to-float v1, v1

    add-float/2addr v1, p1

    add-float/2addr v0, v1

    add-int/lit8 p4, p4, -0x1

    goto :goto_4

    :cond_4
    return-void
.end method

.method public final l(I[I[IZ)V
    .locals 6

    .prologue
    array-length v0, p2

    if-nez v0, :cond_0

    return-void

    :cond_0
    array-length v0, p2

    const/4 v1, 0x0

    move v2, v1

    move v3, v2

    :goto_0
    if-ge v2, v0, :cond_1

    aget v4, p2, v2

    add-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-static {p2}, Lj7/n;->c0([I)I

    move-result v0

    const/4 v2, 0x1

    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    sub-int/2addr p1, v3

    int-to-float p1, p1

    int-to-float v0, v0

    div-float/2addr p1, v0

    if-eqz p4, :cond_2

    array-length v0, p2

    if-ne v0, v2, :cond_2

    move v0, p1

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    if-nez p4, :cond_3

    array-length p4, p2

    move v2, v1

    :goto_2
    if-ge v1, p4, :cond_4

    aget v3, p2, v1

    add-int/lit8 v4, v2, 0x1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v5

    aput v5, p3, v2

    int-to-float v2, v3

    add-float/2addr v2, p1

    add-float/2addr v0, v2

    add-int/lit8 v1, v1, 0x1

    move v2, v4

    goto :goto_2

    :cond_3
    array-length p4, p2

    sub-int/2addr p4, v2

    :goto_3
    const/4 v1, -0x1

    if-ge v1, p4, :cond_4

    aget v1, p2, p4

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v2

    aput v2, p3, p4

    int-to-float v1, v1

    add-float/2addr v1, p1

    add-float/2addr v0, v1

    add-int/lit8 p4, p4, -0x1

    goto :goto_3

    :cond_4
    return-void
.end method

.method public final m(I[I[IZ)V
    .locals 6

    .prologue
    array-length v0, p2

    const/4 v1, 0x0

    move v2, v1

    move v3, v2

    :goto_0
    if-ge v2, v0, :cond_0

    aget v4, p2, v2

    add-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    sub-int/2addr p1, v3

    int-to-float p1, p1

    array-length v0, p2

    add-int/lit8 v0, v0, 0x1

    int-to-float v0, v0

    div-float/2addr p1, v0

    if-nez p4, :cond_1

    array-length p4, p2

    move v2, p1

    move v0, v1

    :goto_1
    if-ge v1, p4, :cond_2

    aget v3, p2, v1

    add-int/lit8 v4, v0, 0x1

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v5

    aput v5, p3, v0

    int-to-float v0, v3

    add-float/2addr v0, p1

    add-float/2addr v2, v0

    add-int/lit8 v1, v1, 0x1

    move v0, v4

    goto :goto_1

    :cond_1
    array-length p4, p2

    add-int/lit8 p4, p4, -0x1

    move v0, p1

    :goto_2
    const/4 v1, -0x1

    if-ge v1, p4, :cond_2

    aget v1, p2, p4

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v2

    aput v2, p3, p4

    int-to-float v1, v1

    add-float/2addr v1, p1

    add-float/2addr v0, v1

    add-int/lit8 p4, p4, -0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public final n(F)LA/b$f;
    .locals 4

    new-instance v0, LA/b$j;

    sget-object v1, LA/b$n;->D:LA/b$n;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, p1, v3, v1, v2}, LA/b$j;-><init>(FZLx7/p;Ly7/k;)V

    return-object v0
.end method
