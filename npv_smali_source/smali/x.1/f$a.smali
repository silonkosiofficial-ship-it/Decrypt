.class public final Lx/f$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:Lx/f$a;

.field private static final b:Lu/j;

.field private static final c:Lx/f;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lx/f$a;

    invoke-direct {v0}, Lx/f$a;-><init>()V

    sput-object v0, Lx/f$a;->a:Lx/f$a;

    const/4 v0, 0x0

    const/4 v1, 0x7

    const/4 v2, 0x0

    invoke-static {v2, v2, v0, v1, v0}, Lu/k;->j(FFLjava/lang/Object;ILjava/lang/Object;)Lu/l0;

    move-result-object v0

    sput-object v0, Lx/f$a;->b:Lu/j;

    new-instance v0, Lx/f$a$a;

    invoke-direct {v0}, Lx/f$a$a;-><init>()V

    sput-object v0, Lx/f$a;->c:Lx/f;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(FFF)F
    .locals 2

    .prologue
    add-float/2addr p2, p1

    const/4 v0, 0x0

    cmpl-float v1, p1, v0

    if-ltz v1, :cond_0

    cmpg-float v1, p2, p3

    if-gtz v1, :cond_0

    :goto_0
    move p1, v0

    goto :goto_1

    :cond_0
    cmpg-float v1, p1, v0

    if-gez v1, :cond_1

    cmpl-float v1, p2, p3

    if-lez v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result v0

    sub-float/2addr p2, p3

    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result p3

    cmpg-float p3, v0, p3

    if-gez p3, :cond_2

    goto :goto_1

    :cond_2
    move p1, p2

    :goto_1
    return p1
.end method

.method public final b()Lx/f;
    .locals 1

    sget-object v0, Lx/f$a;->c:Lx/f;

    return-object v0
.end method

.method public final c()Lu/j;
    .locals 1

    sget-object v0, Lx/f$a;->b:Lu/j;

    return-object v0
.end method
