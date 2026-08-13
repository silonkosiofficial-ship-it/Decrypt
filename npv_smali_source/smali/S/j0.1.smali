.class public abstract LS/j0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LS/j0$a;
    }
.end annotation


# static fields
.field public static final a:LS/j0$a;

.field private static final b:I

.field private static final c:I

.field private static final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LS/j0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LS/j0$a;-><init>(Ly7/k;)V

    sput-object v0, LS/j0;->a:LS/j0$a;

    const/4 v0, 0x0

    invoke-static {v0}, LS/j0;->d(I)I

    move-result v0

    sput v0, LS/j0;->b:I

    const/4 v0, 0x1

    invoke-static {v0}, LS/j0;->d(I)I

    move-result v0

    sput v0, LS/j0;->c:I

    const/4 v0, 0x2

    invoke-static {v0}, LS/j0;->d(I)I

    move-result v0

    sput v0, LS/j0;->d:I

    return-void
.end method

.method public static final synthetic a()I
    .locals 1

    sget v0, LS/j0;->d:I

    return v0
.end method

.method public static final synthetic b()I
    .locals 1

    sget v0, LS/j0;->b:I

    return v0
.end method

.method public static final synthetic c()I
    .locals 1

    sget v0, LS/j0;->c:I

    return v0
.end method

.method public static d(I)I
    .locals 0

    return p0
.end method

.method public static final e(II)Z
    .locals 0

    .prologue
    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
