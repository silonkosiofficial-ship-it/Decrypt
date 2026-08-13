.class public abstract Lr/T;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lr/J;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lr/J;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lr/J;-><init>(I)V

    sput-object v0, Lr/T;->a:Lr/J;

    return-void
.end method

.method public static final a()Lr/J;
    .locals 4

    new-instance v0, Lr/J;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Lr/J;-><init>(IILy7/k;)V

    return-object v0
.end method
