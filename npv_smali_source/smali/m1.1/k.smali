.class public abstract Lm1/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm1/k$a;
    }
.end annotation


# static fields
.field public static final a:Lm1/k$a;

.field private static b:[Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lm1/k$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lm1/k$a;-><init>(Ly7/k;)V

    sput-object v0, Lm1/k;->a:Lm1/k$a;

    const/4 v0, 0x3

    new-array v0, v0, [Z

    sput-object v0, Lm1/k;->b:[Z

    return-void
.end method

.method public static final synthetic a()[Z
    .locals 1

    sget-object v0, Lm1/k;->b:[Z

    return-object v0
.end method
