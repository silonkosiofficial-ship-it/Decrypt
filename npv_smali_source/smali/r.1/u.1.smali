.class public abstract Lr/u;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lr/F;

.field private static final b:[J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lr/F;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lr/F;-><init>(I)V

    sput-object v0, Lr/u;->a:Lr/F;

    new-array v0, v1, [J

    sput-object v0, Lr/u;->b:[J

    return-void
.end method

.method public static final a()[J
    .locals 1

    sget-object v0, Lr/u;->b:[J

    return-object v0
.end method
