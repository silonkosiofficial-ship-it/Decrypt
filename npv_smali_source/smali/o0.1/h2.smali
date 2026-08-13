.class public abstract Lo0/h2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo0/h2$a;
    }
.end annotation


# static fields
.field public static final a:Lo0/h2$a;

.field private static final b:I

.field private static final c:I

.field private static final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lo0/h2$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo0/h2$a;-><init>(Ly7/k;)V

    sput-object v0, Lo0/h2;->a:Lo0/h2$a;

    const/4 v0, 0x0

    invoke-static {v0}, Lo0/h2;->d(I)I

    move-result v0

    sput v0, Lo0/h2;->b:I

    const/4 v0, 0x1

    invoke-static {v0}, Lo0/h2;->d(I)I

    move-result v0

    sput v0, Lo0/h2;->c:I

    const/4 v0, 0x2

    invoke-static {v0}, Lo0/h2;->d(I)I

    move-result v0

    sput v0, Lo0/h2;->d:I

    return-void
.end method

.method public static final synthetic a()I
    .locals 1

    sget v0, Lo0/h2;->d:I

    return v0
.end method

.method public static final synthetic b()I
    .locals 1

    sget v0, Lo0/h2;->b:I

    return v0
.end method

.method public static final synthetic c()I
    .locals 1

    sget v0, Lo0/h2;->c:I

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

.method public static f(I)I
    .locals 0

    return p0
.end method

.method public static g(I)Ljava/lang/String;
    .locals 1

    .prologue
    sget v0, Lo0/h2;->b:I

    invoke-static {p0, v0}, Lo0/h2;->e(II)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p0, "Miter"

    goto :goto_0

    :cond_0
    sget v0, Lo0/h2;->c:I

    invoke-static {p0, v0}, Lo0/h2;->e(II)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p0, "Round"

    goto :goto_0

    :cond_1
    sget v0, Lo0/h2;->d:I

    invoke-static {p0, v0}, Lo0/h2;->e(II)Z

    move-result p0

    if-eqz p0, :cond_2

    const-string p0, "Bevel"

    goto :goto_0

    :cond_2
    const-string p0, "Unknown"

    :goto_0
    return-object p0
.end method
