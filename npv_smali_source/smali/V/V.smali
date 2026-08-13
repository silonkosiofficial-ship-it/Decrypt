.class abstract LV/V;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LV/V$a;
    }
.end annotation


# static fields
.field public static final a:LV/V$a;

.field private static final b:I

.field private static final c:I

.field private static final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LV/V$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LV/V$a;-><init>(Ly7/k;)V

    sput-object v0, LV/V;->a:LV/V$a;

    const/4 v0, 0x0

    invoke-static {v0}, LV/V;->d(I)I

    move-result v0

    sput v0, LV/V;->b:I

    const/4 v0, 0x1

    invoke-static {v0}, LV/V;->d(I)I

    move-result v0

    sput v0, LV/V;->c:I

    const/4 v0, 0x2

    invoke-static {v0}, LV/V;->d(I)I

    move-result v0

    sput v0, LV/V;->d:I

    return-void
.end method

.method public static final synthetic a()I
    .locals 1

    sget v0, LV/V;->b:I

    return v0
.end method

.method public static final synthetic b()I
    .locals 1

    sget v0, LV/V;->c:I

    return v0
.end method

.method public static final synthetic c()I
    .locals 1

    sget v0, LV/V;->d:I

    return v0
.end method

.method private static d(I)I
    .locals 0

    return p0
.end method
