.class public abstract LJ/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJ/d$a;
    }
.end annotation


# static fields
.field public static final a:LJ/d$a;

.field private static final b:I

.field private static final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LJ/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LJ/d$a;-><init>(Ly7/k;)V

    sput-object v0, LJ/d;->a:LJ/d$a;

    const/4 v0, 0x0

    invoke-static {v0}, LJ/d;->c(I)I

    move-result v0

    sput v0, LJ/d;->b:I

    const/4 v0, 0x1

    invoke-static {v0}, LJ/d;->c(I)I

    move-result v0

    sput v0, LJ/d;->c:I

    return-void
.end method

.method public static final synthetic a()I
    .locals 1

    sget v0, LJ/d;->c:I

    return v0
.end method

.method public static final synthetic b()I
    .locals 1

    sget v0, LJ/d;->b:I

    return v0
.end method

.method private static c(I)I
    .locals 0

    return p0
.end method
