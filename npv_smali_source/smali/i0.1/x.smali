.class public abstract Li0/x;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li0/x$a;
    }
.end annotation


# static fields
.field public static final a:Li0/x$a;

.field private static final b:I

.field private static final c:I

.field private static final d:I

.field private static final e:I

.field private static final f:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Li0/x$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Li0/x$a;-><init>(Ly7/k;)V

    sput-object v0, Li0/x;->a:Li0/x$a;

    const/4 v0, 0x1

    invoke-static {v0}, Li0/x;->b(I)I

    move-result v0

    sput v0, Li0/x;->b:I

    const/4 v0, 0x3

    invoke-static {v0}, Li0/x;->b(I)I

    move-result v0

    sput v0, Li0/x;->c:I

    const/4 v0, 0x4

    invoke-static {v0}, Li0/x;->b(I)I

    move-result v0

    sput v0, Li0/x;->d:I

    const/4 v0, 0x2

    invoke-static {v0}, Li0/x;->b(I)I

    move-result v0

    sput v0, Li0/x;->e:I

    const/4 v0, 0x0

    invoke-static {v0}, Li0/x;->b(I)I

    move-result v0

    sput v0, Li0/x;->f:I

    return-void
.end method

.method public static final synthetic a()I
    .locals 1

    sget v0, Li0/x;->b:I

    return v0
.end method

.method public static b(I)I
    .locals 0

    return p0
.end method
