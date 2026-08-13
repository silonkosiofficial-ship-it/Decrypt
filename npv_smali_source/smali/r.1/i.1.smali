.class public abstract Lr/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lr/y;

.field private static final b:[F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lr/y;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lr/y;-><init>(I)V

    sput-object v0, Lr/i;->a:Lr/y;

    new-array v0, v1, [F

    sput-object v0, Lr/i;->b:[F

    return-void
.end method

.method public static final a()[F
    .locals 1

    sget-object v0, Lr/i;->b:[F

    return-object v0
.end method
