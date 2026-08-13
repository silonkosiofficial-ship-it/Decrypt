.class public abstract Lu/p0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu/p0$a;
    }
.end annotation


# static fields
.field public static final a:Lu/p0$a;

.field private static final b:I

.field private static final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lu/p0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lu/p0$a;-><init>(Ly7/k;)V

    sput-object v0, Lu/p0;->a:Lu/p0$a;

    const/4 v0, -0x1

    invoke-static {v0}, Lu/p0;->b(I)I

    move-result v0

    sput v0, Lu/p0;->b:I

    const/4 v0, 0x1

    invoke-static {v0}, Lu/p0;->b(I)I

    move-result v0

    sput v0, Lu/p0;->c:I

    return-void
.end method

.method public static final synthetic a()I
    .locals 1

    sget v0, Lu/p0;->b:I

    return v0
.end method

.method private static b(I)I
    .locals 0

    return p0
.end method
