.class public abstract Lr/X;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lr/L;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lr/L;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lr/L;-><init>(I)V

    sput-object v0, Lr/X;->a:Lr/L;

    return-void
.end method

.method public static final a()Lr/L;
    .locals 4

    new-instance v0, Lr/L;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Lr/L;-><init>(IILy7/k;)V

    return-object v0
.end method

.method public static final b(Ljava/lang/Object;Ljava/lang/Object;)Lr/L;
    .locals 2

    new-instance v0, Lr/L;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lr/L;-><init>(I)V

    invoke-virtual {v0, p0}, Lr/L;->v(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Lr/L;->v(Ljava/lang/Object;)V

    return-object v0
.end method
