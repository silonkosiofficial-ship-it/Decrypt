.class public abstract Lr/q;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lr/D;

.field private static final b:[I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lr/D;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lr/D;-><init>(I)V

    sput-object v0, Lr/q;->a:Lr/D;

    new-array v0, v1, [I

    sput-object v0, Lr/q;->b:[I

    return-void
.end method

.method public static final a()[I
    .locals 1

    sget-object v0, Lr/q;->b:[I

    return-object v0
.end method

.method public static final b()Lr/D;
    .locals 4

    new-instance v0, Lr/D;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Lr/D;-><init>(IILy7/k;)V

    return-object v0
.end method
