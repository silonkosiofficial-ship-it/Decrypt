.class public abstract Ld0/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ld0/h;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ld0/h;

    const/4 v1, 0x0

    new-array v2, v1, [J

    new-array v3, v1, [Ljava/lang/Object;

    invoke-direct {v0, v1, v2, v3}, Ld0/h;-><init>(I[J[Ljava/lang/Object;)V

    sput-object v0, Ld0/i;->a:Ld0/h;

    return-void
.end method

.method public static final a()Ld0/h;
    .locals 1

    sget-object v0, Ld0/i;->a:Ld0/h;

    return-object v0
.end method
